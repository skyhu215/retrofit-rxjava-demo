package com.example.rxjavademo.service;

import com.example.rxjavademo.model.ReposModule;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {

	@GET("users/{user}/repos")
	Call<List<ReposModule>> listRepos(@Path("user") String user);


	@GET("users/{user}/repos")
	Observable<List<ReposModule>> listReposs(@Path("user") String user);
}
