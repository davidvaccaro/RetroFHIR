package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Condition;

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

public interface ConditionService {

    @GET("Condition/{id}")
    Call<Condition> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Condition/{id}/_history/{vid}")
    Call<Condition> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Condition/{id}")
    Call<Condition> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Condition/{id}")
    Call<Condition> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Condition/{id}")
    Call<Condition> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Condition/{id}/_history")
    Call<Condition> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Condition/_history")
    Call<Condition> history(@QueryMap Map<String, String> parameters);

    @POST("Condition")
    Call<Condition> create(@Body Condition resource, @QueryMap Map<String, String> parameters);

    @GET("Condition")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Condition/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}