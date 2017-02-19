package com.meng.retrofitdemo.api;

import com.meng.retrofitdemo.bean.LocationBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by MENG on 2017/2/19.
 */

public interface LocationApi {

    @GET("/mobile/get")
    public Call<LocationBean> getLocation(@Query("phone") String phone,@Query("key") String key);

}
