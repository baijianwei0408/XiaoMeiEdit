package com.axtech.xiaomeiedit.xiaomeiedit.api;

import com.axtech.xiaomeiedit.xiaomeiedit.application.XiaoMeiEditApplication;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtil {

    //请求过期时间
    private static final long TIME_OUT = 10;
    private static OkHttpClient okHttpClient;
    private static Retrofit retrofit;


    /**
     * 获取retrofit
     *
     * @return
     */
    public static Retrofit getRetrofit() {
//        if (okHttpClient == null)
//            getOkHttp();
        if (retrofit == null)
            retrofit = new Retrofit.Builder()
                    .baseUrl(ServerApi.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                    .client(okHttpClient)
                    .baseUrl(ServerApi.BASE_URL)
                    .build();
        return retrofit;
    }

    public static OkHttpClient getOkHttp() {
        okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();
                        Request.Builder requestBuilder = request.newBuilder();
                        request = requestBuilder.post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded;charset=GBK"), URLDecoder.decode(bodyToString(request.body()), "UTF-8")))
                                .build();
                        return chain.proceed(request);
                    }
                })
                .cache(new Cache(new File(XiaoMeiEditApplication.getContext().getCacheDir().toString()), 1024 * 1024 * 50))
                .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(TIME_OUT, TimeUnit.SECONDS)
                .writeTimeout(TIME_OUT, TimeUnit.SECONDS)
                .build();
        return okHttpClient;
    }


    private static String bodyToString(final RequestBody request) {
        try {
            final RequestBody copy = request;
            final Buffer buffer = new Buffer();
            if (copy != null)
                copy.writeTo(buffer);
            else
                return "";
            return buffer.readUtf8();
        } catch (final IOException e) {
            return "RetrofitFactory bodyToString throw exception";
        }
    }


    /**
     * 网络请求回调接口
     */
    public interface HttpCallBack<T> {
        void callBack(T t);
    }
}
