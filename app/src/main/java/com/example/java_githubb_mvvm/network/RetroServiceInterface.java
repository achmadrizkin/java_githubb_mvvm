package com.example.java_githubb_mvvm.network;

import com.example.java_githubb_mvvm.model.RecyclerList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetroServiceInterface {
    @GET("repositories")
    Call<RecyclerList> getDataFromGithub(@Query("q") String query);

}
