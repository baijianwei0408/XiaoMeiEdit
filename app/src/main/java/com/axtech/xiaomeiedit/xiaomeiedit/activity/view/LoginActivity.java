package com.axtech.xiaomeiedit.xiaomeiedit.activity.view;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.opengl.Visibility;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.text.SpannableString;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.axtech.xiaomeiedit.xiaomeiedit.R;
import com.axtech.xiaomeiedit.xiaomeiedit.activity.bean.LoginBean;
import com.axtech.xiaomeiedit.xiaomeiedit.activity.persenter.LoginPersenter;
import com.axtech.xiaomeiedit.xiaomeiedit.application.XiaoMeiEditApplication;
import com.axtech.xiaomeiedit.xiaomeiedit.base.BaseActivity;
import com.axtech.xiaomeiedit.xiaomeiedit.utils.SmsUtil;
import com.axtech.xiaomeiedit.xiaomeiedit.utils.Utils;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class LoginActivity extends BaseActivity {

    private LoginPersenter loginPersenter;

    @BindView(R.id.telephone)
    EditText telephone;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.loginType)
    TextView loginType;
    @BindView(R.id.showPasswordImageView)
    ImageView showPasswordImageView;
    @BindView(R.id.login)
    Button login;
    @BindView(R.id.sendSms)
    Button sendSms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        loginPersenter = new LoginPersenter(LoginActivity.this);

        Drawable usernameIcon = getResources().getDrawable(R.mipmap.login_username);
        usernameIcon.setBounds(0, 0, 70, 70);
        telephone.setCompoundDrawables(usernameIcon, null, null, null);

        Drawable passwordIcon = getResources().getDrawable(R.mipmap.login_password);
        passwordIcon.setBounds(0, 0, 70, 70);
        password.setCompoundDrawables(passwordIcon, null, null, null);

        showPasswordImageView.setTag("hidden");

        loginType.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        loginType.getPaint().setAntiAlias(true);
        loginType.setTag("password");

    }

    @OnTextChanged(R.id.telephone)
    void onTextChanged(CharSequence text) {
        if (telephone.getText().length() == 11) {
            sendSms.setBackgroundResource(R.drawable.shape_radius_25_on);
            sendSms.setClickable(true);
            if (password.getText().length() > 0) {
                login.setBackgroundResource(R.drawable.shape_radius_25_on);
                login.setClickable(true);
            } else {
                login.setBackgroundResource(R.drawable.shape_radius_25_off);
                login.setClickable(false);
            }
        } else {
            sendSms.setBackgroundResource(R.drawable.shape_radius_25_off);
            sendSms.setClickable(false);
            login.setBackgroundResource(R.drawable.shape_radius_25_off);
            login.setClickable(false);
        }
    }

    @OnTextChanged(R.id.password)
    void onTextChanged1(CharSequence text) {
        if (telephone.getText().length() == 11 && password.getText().length() > 0) {
            login.setBackgroundResource(R.drawable.shape_radius_25_on);
            login.setClickable(true);
        } else {
            login.setBackgroundResource(R.drawable.shape_radius_25_off);
            login.setClickable(false);
        }
    }


    @OnClick({R.id.showPasswordImageView, R.id.loginType, R.id.login, R.id.sendSms})
    public void click(View v) {
        switch (v.getId()) {
            // 显示隐藏密码
            case R.id.showPasswordImageView:
                if (v.getTag() == "hidden") {
                    this.showPassword(v);
                } else {
                    this.hiddenPassword(v);
                }
                break;
            // 登录方式切换
            case R.id.loginType:
                if (v.getTag() == "password") {
                    this.loginTypeSms(v);
                } else {
                    this.loginTypePassword(v);
                }
                break;
            // 登录
            case R.id.login:
                if (loginType.getTag() == "password")
                    this.loginByPassword();
                else if (loginType.getTag() == "sms")
                    this.loginBySms();
                break;
            case R.id.sendSms:
                Utils.showToast(LoginActivity.this, "sendSms");
                loginPersenter.sendSms(telephone.getText().toString());
                break;
        }
    }

    public void sendSms() {
        loginPersenter.sendSms(telephone.getText().toString());
    }

    public void loginByPassword() {
        loginPersenter.loginByPassword(telephone.getText().toString(), password.getText().toString());
    }

    public void loginBySms() {
        loginPersenter.loginBySms(telephone.getText().toString(), password.getText().toString());
    }

    public String getLoginType() {
        return loginType.getTag().toString();
    }

    public void showSmsButton() {
        sendSms.setVisibility(View.VISIBLE);
    }

    public void hiddenSmsButton() {
        sendSms.setVisibility(View.GONE);
    }

    public void showPassword(View v) {
        ImageView iv = (ImageView) v;
        v.setTag("show");
        iv.setImageResource(R.mipmap.login_password_open);
        password.setTransformationMethod(null);
        password.setSelection(password.getText().length());
    }

    public void hiddenPassword(View v) {
        ImageView iv = (ImageView) v;
        v.setTag("hidden");
        iv.setImageResource(R.mipmap.login_password_close);
        password.setTransformationMethod(PasswordTransformationMethod.getInstance());
        password.setSelection(password.getText().length());
    }

    public void loginTypePassword(View v) {
        TextView tv = (TextView) v;
        tv.setText("短信验证码登录");
        tv.setTag("password");
        SpannableString ss = new SpannableString("登录密码");
        password.setHint(ss);
        password.setText("");
        this.hiddenSmsButton();

        this.hiddenPassword(showPasswordImageView);
    }

    public void loginTypeSms(View v) {
        TextView tv = (TextView) v;
        tv.setText("密码登录");
        tv.setTag("sms");
        SpannableString ss = new SpannableString("输入动态密码");
        password.setHint(ss);
        password.setText("");
        this.showSmsButton();

        this.showPassword(showPasswordImageView);
    }


    public void chooseMerchant(final LoginBean loginBean) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final AlertDialog dialog = builder.create();
        View view = View.inflate(this, R.layout.alert_login, null);
        LinearLayout loginAlert = view.findViewById(R.id.loginAlert);
        for (final LoginBean.ResultBean.ChooseMerchantBean chooseMerchant : loginBean.getResult().getChooseMerchant()) {
            TextView textView = new TextView(this);
            textView.setText(chooseMerchant.getName());
            textView.setGravity(Gravity.CENTER);
            textView.setTextColor(Color.BLACK);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            layoutParams.setMargins(0, 20, 0, 20);
            textView.setLayoutParams(layoutParams);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    loginPersenter.switchMerchant(chooseMerchant.getId(), loginBean.getResult().getToken());
                    dialog.dismiss();
                }
            });
            loginAlert.addView(textView);
        }
        dialog.setView(view);
        dialog.show();
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
