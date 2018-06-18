package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.CodeSystem;

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

public interface CodeSystemService {

    @GET("CodeSystem/{id}")
    Call<CodeSystem> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CodeSystem/{id}/_history/{vid}")
    Call<CodeSystem> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("CodeSystem/{id}")
    Call<CodeSystem> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("CodeSystem/{id}")
    Call<CodeSystem> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("CodeSystem/{id}")
    Call<CodeSystem> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CodeSystem/{id}/_history")
    Call<CodeSystem> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CodeSystem/_history")
    Call<CodeSystem> history(@QueryMap Map<String, String> parameters);

    @POST("CodeSystem")
    Call<CodeSystem> create(@Body CodeSystem resource, @QueryMap Map<String, String> parameters);

    @GET("CodeSystem")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("CodeSystem/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}