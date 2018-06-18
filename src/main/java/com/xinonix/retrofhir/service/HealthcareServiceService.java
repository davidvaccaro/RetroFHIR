package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.HealthcareService;

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

public interface HealthcareServiceService {

    @GET("HealthcareService/{id}")
    Call<HealthcareService> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("HealthcareService/{id}/_history/{vid}")
    Call<HealthcareService> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("HealthcareService/{id}")
    Call<HealthcareService> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("HealthcareService/{id}")
    Call<HealthcareService> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("HealthcareService/{id}")
    Call<HealthcareService> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("HealthcareService/{id}/_history")
    Call<HealthcareService> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("HealthcareService/_history")
    Call<HealthcareService> history(@QueryMap Map<String, String> parameters);

    @POST("HealthcareService")
    Call<HealthcareService> create(@Body HealthcareService resource, @QueryMap Map<String, String> parameters);

    @GET("HealthcareService")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("HealthcareService/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}