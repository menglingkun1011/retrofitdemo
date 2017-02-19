package com.meng.retrofitdemo.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by MENG on 2017/2/19.
 */

public class RetrofitApi {

    public static final String BASEURL = "http://apis.juhe.cn";

    private static Retrofit retrofit;

    public synchronized static Retrofit getInstance() {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASEURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
