package com.example.demovid;

import com.example.demovid.pojo.SproutReply;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {
    @Multipart
    @POST("/v1/videos")
    Call<SproutReply> pushVideo (@Header("SproutVideo-Api-Key") String key, @Part("file\"; filename=\"pp.mp4") RequestBody file);
}