package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Basic;

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

public interface BasicService {

    @GET("Basic/{id}")
    Call<Basic> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Basic/{id}/_history/{vid}")
    Call<Basic> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Basic/{id}")
    Call<Basic> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Basic/{id}")
    Call<Basic> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Basic/{id}")
    Call<Basic> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Basic/{id}/_history")
    Call<Basic> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Basic/_history")
    Call<Basic> history(@QueryMap Map<String, String> parameters);

    @POST("Basic")
    Call<Basic> create(@Body Basic resource, @QueryMap Map<String, String> parameters);

    @GET("Basic")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Basic/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}