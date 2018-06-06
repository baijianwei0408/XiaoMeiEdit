package com.axtech.xiaomeiedit.xiaomeiedit.zxing.activity;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.axtech.xiaomeiedit.xiaomeiedit.R;
import com.axtech.xiaomeiedit.xiaomeiedit.activity.bean.WareBean;
import com.axtech.xiaomeiedit.xiaomeiedit.activity.view.TakePictureActivity;
import com.axtech.xiaomeiedit.xiaomeiedit.activity.view.WareDetailActivity;
import com.axtech.xiaomeiedit.xiaomeiedit.api.Api;
import com.axtech.xiaomeiedit.xiaomeiedit.api.ApiUtil;
import com.axtech.xiaomeiedit.xiaomeiedit.base.BaseActivity;
import com.axtech.xiaomeiedit.xiaomeiedit.utils.Utils;
import com.axtech.xiaomeiedit.xiaomeiedit.zxing.camera.CameraManager;
import com.axtech.xiaomeiedit.xiaomeiedit.zxing.decode.DecodeThread;
import com.axtech.xiaomeiedit.xiaomeiedit.zxing.utils.BeepManager;
import com.axtech.xiaomeiedit.xiaomeiedit.zxing.utils.CaptureActivityHandler;
import com.axtech.xiaomeiedit.xiaomeiedit.zxing.utils.InactivityTimer;
import com.google.zxing.Result;

/**
 * 扫码页面
 */
public final class CaptureActivity extends BaseActivity implements SurfaceHolder.Callback {

    private static final String TAG = CaptureActivity.class.getSimpleName();

    private CameraManager cameraManager;
    private CaptureActivityHandler handler;
    private InactivityTimer inactivityTimer;
    private BeepManager beepManager;

    private SurfaceView scanPreview = null;
    private RelativeLayout scanContainer;
    private RelativeLayout scanCropView;
    private ImageView scanLine;
    private RelativeLayout scanBox;
    private RelativeLayout inputBox;
    private ImageView scan;
    private ImageView input;
    private TextView scanText;
    private TextView inputText;
    private TextView title;
    private ImageView back;
    private Button submitButton;
    private RelativeLayout scanRL;
    private RelativeLayout inputRL;
    private EditText barcode;

    private Rect mCropRect = null;

    public Handler getHandler() {
        return handler;
    }

    public CameraManager getCameraManager() {
        return cameraManager;
    }

    private boolean isHasSurface = false;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_capture);

        scanPreview = findViewById(R.id.capture_preview);
        scanContainer = findViewById(R.id.capture_container);
        scanCropView = findViewById(R.id.capture_crop_view);
        scanLine = findViewById(R.id.capture_scan_line);
        scanBox = findViewById(R.id.scanRelativeLayout);
        inputBox = findViewById(R.id.inputRelativeLayout);
        scan = findViewById(R.id.scan);
        input = findViewById(R.id.input);
        scanText = findViewById(R.id.scanText);
        inputText = findViewById(R.id.inputText);
        title = findViewById(R.id.title);
        back = findViewById(R.id.back);
        submitButton = findViewById(R.id.submitButton);
        scanRL = findViewById(R.id.scanRL);
        inputRL = findViewById(R.id.inputRL);
        barcode = findViewById(R.id.barcode);


        //设置按钮渐变背景色
        int buttonColors[] = {0xffeeddbb, 0xffd8b886};
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, buttonColors);
        submitButton.setBackground(gradientDrawable);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (barcode.getText() != null) {
                    // 输入条码，点击确认
                    sendRequest(barcode.getText().toString());
                }
            }
        });


        scanBox.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                scanRL.setVisibility(View.VISIBLE);
                inputRL.setVisibility(View.GONE);

                title.setText("扫描");
                scan.setImageResource(R.mipmap.scan_scan_on);
                input.setImageResource(R.mipmap.scan_input_off);
                scanText.setTextColor(getColor(R.color.colorGold));
                inputText.setTextColor(getColor(R.color.colorWhite));
            }
        });
        inputBox.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                scanRL.setVisibility(View.GONE);
                inputRL.setVisibility(View.VISIBLE);
                barcode.requestFocus();
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);

                title.setText("手动输入");
                scan.setImageResource(R.mipmap.scan_scan_off);
                input.setImageResource(R.mipmap.scan_input_on);
                scanText.setTextColor(getColor(R.color.colorWhite));
                inputText.setTextColor(getColor(R.color.colorGold));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        inactivityTimer = new InactivityTimer(this);
        beepManager = new BeepManager(this);

        TranslateAnimation animation = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT, 0.9f);
        animation.setDuration(4500);
        animation.setRepeatCount(-1);
        animation.setRepeatMode(Animation.RESTART);
        scanLine.startAnimation(animation);
    }


    private void sendRequest(final String serial) {
        final Map<String, Object> map = new HashMap<>();
        map.put("access-token", Utils.getSharePerference("token"));
        map.put("query", serial);
        map.put("type", "goods");
        Api.request(CaptureActivity.this, Api.getServerApi().getWare(map), new ApiUtil.HttpCallBack<WareBean>() {
            @Override
            public void callBack(WareBean wareBean) {
                if (wareBean.getRows().size() > 0) {
                    Intent intent;
                    if (wareBean.getRows().get(0).getImgPath() != null) {
                        intent = new Intent(CaptureActivity.this, WareDetailActivity.class);
                    } else {
                        intent = new Intent(CaptureActivity.this, TakePictureActivity.class);
                    }
                    Bundle bundle = new Bundle();
                    wareBean.setSerial(serial);
                    bundle.putSerializable("wareBean", wareBean);
                    intent.putExtras(bundle);
                    startActivity(intent);
                } else {
                    Utils.showToast(CaptureActivity.this, "无此条码商品");
                }
            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();

        cameraManager = new CameraManager(getApplication());

        handler = null;

        if (isHasSurface) {
            initCamera(scanPreview.getHolder());
        } else {
            scanPreview.getHolder().addCallback(this);
        }

        inactivityTimer.onResume();
    }

    @Override
    protected void onPause() {
        if (handler != null) {
            handler.quitSynchronously();
            handler = null;
        }
        inactivityTimer.onPause();
        beepManager.close();
        cameraManager.closeDriver();
        if (!isHasSurface) {
            scanPreview.getHolder().removeCallback(this);
        }
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        inactivityTimer.shutdown();
        super.onDestroy();
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        if (holder == null) {
            Log.e(TAG, "*** WARNING *** surfaceCreated() gave us a null surface!");
        }
        if (!isHasSurface) {
            isHasSurface = true;
            initCamera(holder);
        }
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        isHasSurface = false;
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    /**
     * A valid barcode has been found, so give an indication of success and show
     * the results.
     *
     * @param rawResult The contents of the barcode.
     * @param bundle    The extras
     */
    public void handleDecode(Result rawResult, Bundle bundle) {
        inactivityTimer.onActivity();
        beepManager.playBeepSoundAndVibrate();

//        bundle.putInt("width", mCropRect.width());
//        bundle.putInt("height", mCropRect.height());
//        bundle.putString("result", rawResult.getText());
//
//        startActivity(new Intent(CaptureActivity.this, TakePictureActivity.class).putExtras(bundle));

        sendRequest(rawResult.getText());
    }

    private void initCamera(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalStateException("No SurfaceHolder provided");
        }
        if (cameraManager.isOpen()) {
            Log.w(TAG, "initCamera() while already open -- late SurfaceView callback?");
            return;
        }
        try {
            cameraManager.openDriver(surfaceHolder);
            if (handler == null) {
                handler = new CaptureActivityHandler(this, cameraManager, DecodeThread.ALL_MODE);
            }

            initCrop();
        } catch (IOException ioe) {
            Log.w(TAG, ioe);
            displayFrameworkBugMessageAndExit();
        } catch (RuntimeException e) {
            Log.w(TAG, "Unexpected error initializing camera", e);
            displayFrameworkBugMessageAndExit();
        }
    }

    private void displayFrameworkBugMessageAndExit() {
        Utils.showToast(CaptureActivity.this, "相机打开错误，请稍后再试");
        finish();
    }

    public void restartPreviewAfterDelay(long delayMS) {
        if (handler != null) {
            handler.sendEmptyMessageDelayed(R.id.restart_preview, delayMS);
        }
    }

    public Rect getCropRect() {
        return mCropRect;
    }

    /**
     * 初始化截取的矩形区域
     */
    private void initCrop() {
        int cameraWidth = cameraManager.getCameraResolution().y;
        int cameraHeight = cameraManager.getCameraResolution().x;

        /** 获取布局中扫描框的位置信息 */
        int[] location = new int[2];
        scanCropView.getLocationInWindow(location);

        int cropLeft = location[0];
        int cropTop = location[1] - getStatusBarHeight();

        int cropWidth = scanCropView.getWidth();
        int cropHeight = scanCropView.getHeight();

        /** 获取布局容器的宽高 */
        int containerWidth = scanContainer.getWidth();
        int containerHeight = scanContainer.getHeight();

        /** 计算最终截取的矩形的左上角顶点x坐标 */
        int x = cropLeft * cameraWidth / containerWidth;
        /** 计算最终截取的矩形的左上角顶点y坐标 */
        int y = cropTop * cameraHeight / containerHeight;

        /** 计算最终截取的矩形的宽度 */
        int width = cropWidth * cameraWidth / containerWidth;
        /** 计算最终截取的矩形的高度 */
        int height = cropHeight * cameraHeight / containerHeight;

        /** 生成最终的截取的矩形 */
        mCropRect = new Rect(x, y, width + x, height + y);
    }

    private int getStatusBarHeight() {
        try {
            Class<?> c = Class.forName("com.android.internal.R$dimen");
            Object obj = c.newInstance();
            Field field = c.getField("status_bar_height");
            int x = Integer.parseInt(field.get(obj).toString());
            return getResources().getDimensionPixelSize(x);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}