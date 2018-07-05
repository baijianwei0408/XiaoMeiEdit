package com.axtech.xiaomeiedit.xiaomeiedit.activity.persenter;

import android.content.Intent;
import android.util.Log;

import com.axtech.xiaomeiedit.xiaomeiedit.activity.bean.LoginBean;
import com.axtech.xiaomeiedit.xiaomeiedit.activity.bean.SmsBean;
import com.axtech.xiaomeiedit.xiaomeiedit.activity.model.LoginModel;
import com.axtech.xiaomeiedit.xiaomeiedit.activity.view.IndexActivity;
import com.axtech.xiaomeiedit.xiaomeiedit.activity.view.LoginActivity;
import com.axtech.xiaomeiedit.xiaomeiedit.api.ApiUtil;
import com.axtech.xiaomeiedit.xiaomeiedit.application.XiaoMeiEditApplication;
import com.axtech.xiaomeiedit.xiaomeiedit.base.BaseBean;
import com.axtech.xiaomeiedit.xiaomeiedit.utils.SmsUtil;
import com.axtech.xiaomeiedit.xiaomeiedit.utils.Utils;

import java.util.HashMap;
import java.util.Map;

public class LoginPersenter implements LoginPersenterInterface {

    private LoginActivity loginActivity;
    private LoginModel loginModel;
    private Map<String, Object> map;

    private String smsToken;

    public LoginPersenter(LoginActivity loginActivity) {
        this.loginActivity = loginActivity;
        this.loginModel = new LoginModel();
    }


    @Override
    public void sendSms(String telephone) {
        map = new HashMap<>();
        map.put("telephone", telephone);
        map.put("sign", new SmsUtil().getToken(telephone));
        loginModel.sendSms(loginActivity, map, new ApiUtil.HttpCallBack<SmsBean>() {
            @Override
            public void callBack(SmsBean smsBean) {
                Utils.showToast(loginActivity, "发送验证码成功");
                smsToken = smsBean.getResult();
            }
        });
    }

    @Override
    public void loginByPassword(String telephone, String password) {
        map = new HashMap<>();
        map.put("client", "XM_EDIT");
        map.put("telephone", telephone);
        map.put("password", password);
        login(map);
    }

    @Override
    public void loginBySms(String telephone, String smsCode) {
        map = new HashMap<>();
        map.put("client", "XM_EDIT");
        map.put("telephone", telephone);
        map.put("smsCode", smsCode);
        map.put("smsToken", smsToken);
        login(map);
    }

    public void login(Map<String, Object> map) {
        loginModel.login(loginActivity, map, new ApiUtil.HttpCallBack<LoginBean>() {
            @Override
            public void callBack(LoginBean loginBean) {
                if (loginBean.getResult().getChooseMerchant() == null) {
                    // 无可选店铺
                    Utils.showToast(loginActivity, "登录成功");
                    Utils.putSharedPreferences("token", loginBean.getResult().getToken());
                    Intent intent = new Intent(loginActivity, IndexActivity.class);
                    loginActivity.startActivity(intent);
                    loginActivity.finish();
                } else {
                    // 有可选店铺
                    loginActivity.chooseMerchant(loginBean);
                }
            }
        });
    }

    public void switchMerchant(String merchantId, final String token) {
        map = new HashMap<>();
        map.put("access-token", token);
        map.put("merchantId", merchantId);
        loginModel.switchMerchant(loginActivity, map, new ApiUtil.HttpCallBack<BaseBean>() {
            @Override
            public void callBack(BaseBean baseBean) {
                Utils.showToast(loginActivity, "登录成功");
                Utils.putSharedPreferences("token", token);
                Intent intent = new Intent(loginActivity, IndexActivity.class);
                loginActivity.startActivity(intent);
                loginActivity.finish();
            }
        });
    }
}
