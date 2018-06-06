package com.axtech.xiaomeiedit.xiaomeiedit.activity.view;

import android.os.Bundle;

import com.axtech.xiaomeiedit.xiaomeiedit.R;
import com.axtech.xiaomeiedit.xiaomeiedit.activity.bean.WareBean;
import com.axtech.xiaomeiedit.xiaomeiedit.base.BaseActivity;


public class TakePictureActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takepicture);

        WareBean wareBean = (WareBean) getIntent().getSerializableExtra("wareBean");
        TakePictureFragment fragment = new TakePictureFragment(wareBean);

        if (null == savedInstanceState) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
        }

    }

}
