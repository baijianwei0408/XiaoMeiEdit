package com.axtech.xiaomeiedit.xiaomeiedit.api;

import android.content.Context;
import android.util.Log;

import com.axtech.xiaomeiedit.xiaomeiedit.base.BaseBean;
import com.axtech.xiaomeiedit.xiaomeiedit.utils.Utils;

import rx.Subscriber;

public abstract class ApiObserver extends Subscriber {

    private Context context;

    public ApiObserver(Context context) {
        this.context = context;
    }

    @Override
    public void onStart() {
        super.onStart();
        Utils.showLoading(context);

        if (!Utils.isHaveNetWork(context)) {
            unsubscribe();
            Utils.showToast(context, "网络连接失败");
            Utils.hiddenLoading();
        }
    }

    @Override
    public void onCompleted() {
        Log.v("this", "ApiObserver onCompleted");
        unsubscribe();
        Utils.hiddenLoading();
    }

    @Override
    public void onError(Throwable e) {
        Log.v("this", context.getClass().getName() + "ApiObserver onError");
        Log.v("this", e.getMessage().toString());
        Log.v("this", e.fillInStackTrace().toString());
        unsubscribe();
        Utils.showToast(context, "服务器繁忙，请稍后再试");
        Utils.hiddenLoading();
    }

    @Override
    public void onNext(Object o) {
        BaseBean bean = (BaseBean) o;
        if (bean.getStatus() == 200)
            onSuccess(o);
        else
            Utils.showToast(context, bean.getMessage().toString());

    }

    public abstract void onSuccess(Object o);
}
