package com.axtech.xiaomeiedit.xiaomeiedit.activity.model;

import android.content.Context;

import com.axtech.xiaomeiedit.xiaomeiedit.api.Api;
import com.axtech.xiaomeiedit.xiaomeiedit.api.ApiUtil;

import java.util.Map;

public class LoginModel {

    public void sendSms(Context context, Map<String, Object> map, ApiUtil.HttpCallBack httpCallBack) {
        Api.request(context, Api.getServerApi().sendSms(map), httpCallBack);
    }

    public void login(Context context, Map<String, Object> map, ApiUtil.HttpCallBack httpCallBack) {
        Api.request(context, Api.getServerApi().login(map), httpCallBack);
    }

}
