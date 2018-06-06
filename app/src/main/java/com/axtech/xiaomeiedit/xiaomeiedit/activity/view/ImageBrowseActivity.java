package com.axtech.xiaomeiedit.xiaomeiedit.activity.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.axtech.xiaomeiedit.xiaomeiedit.R;
import com.axtech.xiaomeiedit.xiaomeiedit.base.BaseActivity;
import com.axtech.xiaomeiedit.xiaomeiedit.utils.Utils;
import com.bm.library.PhotoView;

import butterknife.BindView;
import butterknife.OnClick;

public class ImageBrowseActivity extends BaseActivity {

    public static final String INTENT_IMAGE_URL = "INTENT_IMAGE_URL";

    @BindView(R.id.photo_view)
    PhotoView mPhotoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_browse);
        initView();
        initData();
    }

    private void initView() {
        mPhotoView.enable();
    }

    private void initData() {
        String imageUrl = getIntent().getStringExtra(INTENT_IMAGE_URL);
        Utils.getPicasso()
                .with(this)
                .load(imageUrl)
                .placeholder(R.mipmap.img_ware_loading)
                .resize(240, 240)
                .into(mPhotoView);
    }


    @OnClick({R.id.photo_view})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.photo_view:
                finish();
                break;
        }
    }
}
