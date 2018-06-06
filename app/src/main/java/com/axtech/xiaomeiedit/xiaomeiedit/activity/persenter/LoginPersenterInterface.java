package com.axtech.xiaomeiedit.xiaomeiedit.activity.persenter;

public interface LoginPersenterInterface {

    void sendSms(String telephone);

    void loginByPassword(String telephone, String password);

    void loginBySms(String telephone, String smsCode);

}
