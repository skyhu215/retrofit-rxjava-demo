package com.example.rxjavademo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.rxjavademo.model.ReposModule;
import com.example.rxjavademo.service.GitHubService;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Call;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private Button btn_request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_request =this.findViewById(R.id.button);
        btn_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request();
            }
        });

    }


    private void request() {
        GitHubService requestService = RetrofitClient.getInstance().getRetrofit().create(GitHubService.class);
        Observable<List<ReposModule>> listObservable = requestService.listReposs("1");


        //retrofit同步方法
        //executeMethod(call);

        //retrofit异步方法
       /* call.enqueue(new retrofit2.Callback<List<ReposModule>>() {
            @Override
            public void onResponse(Call<List<ReposModule>> call, retrofit2.Response<List<ReposModule>> response) {
                // 数据返回成功
                Log.i(TAG, "onResponse: success ");
                List<ReposModule> list = response.body();
                Log.d(TAG, new Gson().toJson(list));

            }

            @Override
            public void onFailure(Call<List<ReposModule>> call, Throwable t) {
                // 数据返回失败
                Log.i(TAG, "onFailure: fail"+t.getMessage());
            }
        });*/


        listObservable.subscribeOn(Schedulers.io()) // 在子线程中进行Http访问
                .observeOn(AndroidSchedulers.mainThread()) // UI线程处理返回接口
                .subscribe(new Observer<List<ReposModule>>() {// 订阅
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull List<ReposModule> reposModules) {
                       Log.d(TAG,"--------------------");
                        Log.d(TAG, "data:"+new Gson().toJson(reposModules));
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.d(TAG, "onError---"+e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }


                });




    }


    public void executeMethod(Call<ResponseBody> call) {
        // 同步
        try {
            ResponseBody repos = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}