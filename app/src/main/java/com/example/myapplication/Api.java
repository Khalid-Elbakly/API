package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("sample_object.json")
    public Call<CarsModel> getCarsJson();
}
