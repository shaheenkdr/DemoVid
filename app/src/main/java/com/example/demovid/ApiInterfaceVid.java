package com.example.demovid;



import com.example.demovid.vidpojo.VideoPojo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;


public interface ApiInterfaceVid {
    @GET("/v1/videos")
    Call<VideoPojo> getVideo (@Header("SproutVideo-Api-Key") String key);
}