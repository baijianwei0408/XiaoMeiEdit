package com.axtech.xiaomeiedit.xiaomeiedit.api;

import android.content.Context;
import android.util.Log;

import com.axtech.xiaomeiedit.xiaomeiedit.utils.Utils;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class Api {

    private static ServerApi serverApi;

    /**
     * 网络请求
     */
    public static void request(Context context, Observable observable, final ApiUtil.HttpCallBack HttpCallBack) {
        observable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ApiObserver(context) {
                    @Override
                    public void onSuccess(Object o) {
                        HttpCallBack.callBack(o);
                    }
                });
    }


    /**
     * 获取serverApi
     */
    public static ServerApi getServerApi() {
        if (serverApi == null) {
            serverApi = ApiUtil.getRetrofit().create(ServerApi.class);
        }
        return serverApi;

    }

}
