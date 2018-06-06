package com.axtech.xiaomeiedit.xiaomeiedit.activity.view;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import com.axtech.xiaomeiedit.xiaomeiedit.R;
import com.axtech.xiaomeiedit.xiaomeiedit.base.BaseActivity;
import com.axtech.xiaomeiedit.xiaomeiedit.utils.Utils;
import com.axtech.xiaomeiedit.xiaomeiedit.zxing.activity.CaptureActivity;

import butterknife.BindView;
import butterknife.OnClick;


public class IndexActivity extends BaseActivity {

    @BindView(R.id.addPic)
    Button addPic;
    @BindView(R.id.uploadWare)
    Button uploadWare;
    @BindView(R.id.loginOut)
    Button loginOut;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_index);

        this.setButtonBackground();
    }

    /**
     * 设置按钮渐变背景色
     */
    public void setButtonBackground() {
        int buttonColors[] = {0xffeeddbb, 0xffd8b886};
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, buttonColors);
        addPic.setBackground(gradientDrawable);
        uploadWare.setBackground(gradientDrawable);
    }

    @OnClick({R.id.addPic, R.id.uploadWare, R.id.loginOut})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.addPic:
//                new IntentIntegrator(IndexActivity.this)
//                        .setOrientationLocked(false)
//                        .setCaptureActivity(ScanActivity.class)
//                        .setBeepEnabled(false)
//                        .setPrompt("")
//                        .initiateScan();
                Intent intent = new Intent(IndexActivity.this, CaptureActivity.class);
                startActivity(intent);
                break;
            case R.id.uploadWare:
                Utils.showToast(IndexActivity.this, "功能暂未开放");
                break;
            case R.id.loginOut:
                Utils.removeSharePerference("token");
                intent = new Intent(IndexActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }

    // 定义一个变量，来标识是否退出
    private static boolean isExit = false;

    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            isExit = false;
        }
    };

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void exit() {
        if (!isExit) {
            isExit = true;
            Utils.showToast(getApplicationContext(), "再按一次退出程序");
            mHandler.sendEmptyMessageDelayed(0, 2000);
        } else {
            finish();
            System.exit(0);
        }
    }

}
