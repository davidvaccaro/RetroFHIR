package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.TestScript;

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

public interface TestScriptService {

    @GET("TestScript/{id}")
    Call<TestScript> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("TestScript/{id}/_history/{vid}")
    Call<TestScript> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("TestScript/{id}")
    Call<TestScript> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("TestScript/{id}")
    Call<TestScript> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("TestScript/{id}")
    Call<TestScript> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("TestScript/{id}/_history")
    Call<TestScript> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("TestScript/_history")
    Call<TestScript> history(@QueryMap Map<String, String> parameters);

    @POST("TestScript")
    Call<TestScript> create(@Body TestScript resource, @QueryMap Map<String, String> parameters);

    @GET("TestScript")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("TestScript/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}