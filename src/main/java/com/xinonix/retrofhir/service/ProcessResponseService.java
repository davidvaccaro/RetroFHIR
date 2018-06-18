package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ProcessResponse;

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

public interface ProcessResponseService {

    @GET("ProcessResponse/{id}")
    Call<ProcessResponse> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ProcessResponse/{id}/_history/{vid}")
    Call<ProcessResponse> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ProcessResponse/{id}")
    Call<ProcessResponse> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ProcessResponse/{id}")
    Call<ProcessResponse> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ProcessResponse/{id}")
    Call<ProcessResponse> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ProcessResponse/{id}/_history")
    Call<ProcessResponse> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ProcessResponse/_history")
    Call<ProcessResponse> history(@QueryMap Map<String, String> parameters);

    @POST("ProcessResponse")
    Call<ProcessResponse> create(@Body ProcessResponse resource, @QueryMap Map<String, String> parameters);

    @GET("ProcessResponse")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ProcessResponse/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}