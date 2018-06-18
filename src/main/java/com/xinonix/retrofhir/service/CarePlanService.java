package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.CarePlan;

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

public interface CarePlanService {

    @GET("CarePlan/{id}")
    Call<CarePlan> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CarePlan/{id}/_history/{vid}")
    Call<CarePlan> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("CarePlan/{id}")
    Call<CarePlan> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("CarePlan/{id}")
    Call<CarePlan> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("CarePlan/{id}")
    Call<CarePlan> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CarePlan/{id}/_history")
    Call<CarePlan> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CarePlan/_history")
    Call<CarePlan> history(@QueryMap Map<String, String> parameters);

    @POST("CarePlan")
    Call<CarePlan> create(@Body CarePlan resource, @QueryMap Map<String, String> parameters);

    @GET("CarePlan")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("CarePlan/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}