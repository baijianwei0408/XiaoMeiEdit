package com.axtech.xiaomeiedit.xiaomeiedit.activity.view;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import com.axtech.xiaomeiedit.xiaomeiedit.R;
import com.axtech.xiaomeiedit.xiaomeiedit.application.XiaoMeiEditApplication;
import com.axtech.xiaomeiedit.xiaomeiedit.base.BaseActivity;
import com.axtech.xiaomeiedit.xiaomeiedit.utils.Utils;

/**
 * Created by baijianwei on 2017/5/20.
 */

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);


        if (Build.VERSION.SDK_INT >= 23) {
            int checkCallPhonePermission = ContextCompat.checkSelfPermission(SplashActivity.this, Manifest.permission.CAMERA);
            if (checkCallPhonePermission != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(SplashActivity.this, new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                return;
            } else {
                jumpToPage();
            }
        } else {
            jumpToPage();
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case 1:
                jumpToPage();
                break;
        }
    }


    private void jumpToPage() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                enterHomeActivity();
            }
        }, 2000);
    }

    private void enterHomeActivity() {
        Intent intent;
        if (Utils.getSharePerference("token").equals("nothing"))
            intent = new Intent(this, LoginActivity.class);
        else
            intent = new Intent(this, IndexActivity.class);
        startActivity(intent);
        finish();
    }

}
