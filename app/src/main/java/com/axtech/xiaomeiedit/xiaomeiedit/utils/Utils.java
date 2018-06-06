package com.axtech.xiaomeiedit.xiaomeiedit.utils;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.Toast;

import com.axtech.xiaomeiedit.xiaomeiedit.application.XiaoMeiEditApplication;
import com.squareup.picasso.Picasso;

public class Utils {

    public static Picasso picasso = null;
    public static Dialog dialog;
    public static Toast toast;
    public static int requestingNumber = 0; // 当前正在发送网络请求的数量
    public static SharedPreferences.Editor editor;

    public static WindowManager windowManager;

    /**
     * 获取picasso对象
     */
    public static Picasso getPicasso() {
        if (picasso == null)
            picasso = XiaoMeiEditApplication.picasso;
        return picasso;
    }

    public static String getFileServerPath() {
        return "http://oj6xvatdi.bkt.clouddn.com/";
    }

    /**
     * 展示和隐藏加载框
     */
    public static void showLoading(Context context) {
        requestingNumber++;
        if (requestingNumber == 1) {
            dialog = new ProgressDialog(context);
            dialog.setCancelable(false);
            dialog.show();
        }
    }

    public static void hiddenLoading() {
        requestingNumber--;
        if (dialog.isShowing() && requestingNumber == 0)
            dialog.dismiss();
    }

    /**
     * 将toast封装起来，连续点击时可以覆盖上一个
     */
    public static void showToast(Context context, String text) {
        if (toast == null) {
            toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        } else {
            toast.setText(text);
        }
        toast.show();
    }

    /**
     * 检查当前网络连接
     */
    public static boolean isHaveNetWork(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo info = connectivity.getActiveNetworkInfo();
            if (info != null && info.isConnected()) {
                // 当前网络是连接的
                if (info.getState() == NetworkInfo.State.CONNECTED) {
                    // 当前所连接的网络可用
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 通过SharePerferences存取数据
     */
    public static void initEditor() {
        if (editor == null)
            editor = XiaoMeiEditApplication.sharedPreferences.edit();
    }

    public static void putSharedPreferences(String key, String value) {
        initEditor();
        editor.putString(key, value);
        editor.commit();
    }

    public static String getSharePerference(String key) {
        initEditor();
        return XiaoMeiEditApplication.sharedPreferences.getString(key, "nothing");
    }

    public static void removeSharePerference(String key) {
        initEditor();
        editor.remove(key);
        editor.commit();
    }


    /**
     * 获取屏幕宽度
     */
    public static int getWindowWidth(Activity activity) {
        return getMetrics(activity).widthPixels;
    }

    public static int getWindowHeight(Activity activity) {
        return getMetrics(activity).heightPixels;
    }

    private static DisplayMetrics getMetrics(Activity activity) {
        if (windowManager == null)
            windowManager = activity.getWindowManager();
        DisplayMetrics outMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(outMetrics);
        return outMetrics;
    }

}
