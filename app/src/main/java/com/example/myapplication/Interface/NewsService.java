package com.example.myapplication.Interface;

import com.example.myapplication.Model.Website;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsService {
    @GET("v2/sources?language=en")
    Call<Website> getSources();
}
