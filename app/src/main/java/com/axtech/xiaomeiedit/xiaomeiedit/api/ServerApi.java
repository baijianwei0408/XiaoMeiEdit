package com.axtech.xiaomeiedit.xiaomeiedit.api;

import com.axtech.xiaomeiedit.xiaomeiedit.activity.bean.LoginBean;
import com.axtech.xiaomeiedit.xiaomeiedit.activity.bean.SmsBean;
import com.axtech.xiaomeiedit.xiaomeiedit.activity.bean.WareBean;
import com.axtech.xiaomeiedit.xiaomeiedit.activity.bean.WareDetailBean;
import com.axtech.xiaomeiedit.xiaomeiedit.base.BaseBean;

import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import retrofit2.http.DELETE;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

public interface ServerApi {

    // 开发环境
//    String BASE_URL = "http://10.0.0.163:8838";
    // 测试环境
    String BASE_URL = "https://t-gw.9999ax.com";
    // 生产环境
//    String BASE_URL = "https://gw.9999ax.com";

    @FormUrlEncoded
    @POST("/sms/sms/rand")
    Observable<SmsBean> sendSms(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/user/login")
    Observable<LoginBean> login(@FieldMap Map<String, Object> map);

    @GET("/lease/search")
    Observable<WareBean> getWare(@QueryMap Map<String, Object> map);

    @Multipart
    @POST("/lease/image")
    Observable<BaseBean> uploadImg(@Part List<MultipartBody.Part> list);

    @GET("/lease/storage")
    Observable<WareDetailBean> getWareDetail(@Query("query") String serial, @Query("access-token") String token);

    @PUT("/lease/storage/images")
    Observable<BaseBean> changeImageIndex(@QueryMap Map<String, String> map);

    @DELETE("/lease/image/{imageId}")
    Observable<BaseBean> deleteImage(@Path("imageId") String imageId, @Query("access-token") String token);
}
