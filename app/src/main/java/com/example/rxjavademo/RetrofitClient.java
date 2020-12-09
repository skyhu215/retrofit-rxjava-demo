package com.example.rxjavademo;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private  Retrofit retrofit;
    private String baseUrl="https://api.github.com/";

    //https://api.github.com/users/1/repos


    private RetrofitClient(){
        this.init();
    }

    public static RetrofitClient getInstance(){
        return RetrofitClientHodler.INSTANCE;
    }

    static class RetrofitClientHodler{
       public  static final RetrofitClient INSTANCE = new RetrofitClient();
    }

    public void init(){
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.SECONDS)
                .build();

         retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl) //网络请求URL相对固定的地址
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) //与rxjava联合使用RxJavaCallAdapterFactory   // 支持RxJava
                .addConverterFactory(GsonConverterFactory.create()) //gson解析返回值
                .client(okHttpClient) //使用OkHttp请求
                .build();
    }


    public Retrofit getRetrofit(){
        return this.retrofit;
    }





}
