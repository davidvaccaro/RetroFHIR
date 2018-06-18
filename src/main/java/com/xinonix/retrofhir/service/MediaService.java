package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Media;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface MediaService {

    @GET("Media/{id}")
    Call<Media> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Media/{id}/_history/{vid}")
    Call<Media> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Media/{id}")
    Call<Media> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Media/{id}")
    Call<Media> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Media/{id}")
    Call<Media> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Media/{id}/_history")
    Call<Media> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Media/_history")
    Call<Media> history(@QueryMap Map<String, String> parameters);

    @POST("Media")
    Call<Media> create(@Body Media resource, @QueryMap Map<String, String> parameters);

    @GET("Media")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Media/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}