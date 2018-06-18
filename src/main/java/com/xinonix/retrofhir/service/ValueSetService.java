package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ValueSet;

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

public interface ValueSetService {

    @GET("ValueSet/{id}")
    Call<ValueSet> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ValueSet/{id}/_history/{vid}")
    Call<ValueSet> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ValueSet/{id}")
    Call<ValueSet> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ValueSet/{id}")
    Call<ValueSet> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ValueSet/{id}")
    Call<ValueSet> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ValueSet/{id}/_history")
    Call<ValueSet> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ValueSet/_history")
    Call<ValueSet> history(@QueryMap Map<String, String> parameters);

    @POST("ValueSet")
    Call<ValueSet> create(@Body ValueSet resource, @QueryMap Map<String, String> parameters);

    @GET("ValueSet")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ValueSet/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}