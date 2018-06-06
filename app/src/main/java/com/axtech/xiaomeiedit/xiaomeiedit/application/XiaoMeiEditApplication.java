package com.axtech.xiaomeiedit.xiaomeiedit.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.io.File;

public class XiaoMeiEditApplication extends Application {

    private static Context context;
    public static Picasso picasso;
    public static SharedPreferences sharedPreferences;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();

        initPicasso();
        initSharedPreferences();
    }

    public static Context getContext() {
        return context;
    }

    /**
     * 设置Picasso本地缓存路径
     * 获取Picasso的单例
     */
    private void initPicasso() {
        if (picasso == null) {
            picasso = new Picasso.Builder(context)
                    .downloader(new OkHttp3Downloader(new File(XiaoMeiEditApplication.getContext().getExternalCacheDir() + "/img")))
                    .build();
            Picasso.setSingletonInstance(picasso);
        }
    }

    /**
     * 初始化sharedPreferences
     */
    private void initSharedPreferences() {
        if (sharedPreferences == null)
            sharedPreferences = getSharedPreferences("XiaoMeiEdit", Activity.MODE_PRIVATE);
    }

}
