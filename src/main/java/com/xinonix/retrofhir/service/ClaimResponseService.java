package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ClaimResponse;

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

public interface ClaimResponseService {

    @GET("ClaimResponse/{id}")
    Call<ClaimResponse> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ClaimResponse/{id}/_history/{vid}")
    Call<ClaimResponse> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ClaimResponse/{id}")
    Call<ClaimResponse> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ClaimResponse/{id}")
    Call<ClaimResponse> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ClaimResponse/{id}")
    Call<ClaimResponse> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ClaimResponse/{id}/_history")
    Call<ClaimResponse> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ClaimResponse/_history")
    Call<ClaimResponse> history(@QueryMap Map<String, String> parameters);

    @POST("ClaimResponse")
    Call<ClaimResponse> create(@Body ClaimResponse resource, @QueryMap Map<String, String> parameters);

    @GET("ClaimResponse")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ClaimResponse/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}