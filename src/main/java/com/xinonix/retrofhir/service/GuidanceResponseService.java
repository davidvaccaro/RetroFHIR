package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.GuidanceResponse;

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

public interface GuidanceResponseService {

    @GET("GuidanceResponse/{id}")
    Call<GuidanceResponse> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("GuidanceResponse/{id}/_history/{vid}")
    Call<GuidanceResponse> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("GuidanceResponse/{id}")
    Call<GuidanceResponse> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("GuidanceResponse/{id}")
    Call<GuidanceResponse> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("GuidanceResponse/{id}")
    Call<GuidanceResponse> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("GuidanceResponse/{id}/_history")
    Call<GuidanceResponse> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("GuidanceResponse/_history")
    Call<GuidanceResponse> history(@QueryMap Map<String, String> parameters);

    @POST("GuidanceResponse")
    Call<GuidanceResponse> create(@Body GuidanceResponse resource, @QueryMap Map<String, String> parameters);

    @GET("GuidanceResponse")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("GuidanceResponse/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}