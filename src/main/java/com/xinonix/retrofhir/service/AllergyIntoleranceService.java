package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.AllergyIntolerance;

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

public interface AllergyIntoleranceService {

    @GET("AllergyIntolerance/{id}")
    Call<AllergyIntolerance> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("AllergyIntolerance/{id}/_history/{vid}")
    Call<AllergyIntolerance> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("AllergyIntolerance/{id}")
    Call<AllergyIntolerance> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("AllergyIntolerance/{id}")
    Call<AllergyIntolerance> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("AllergyIntolerance/{id}")
    Call<AllergyIntolerance> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("AllergyIntolerance/{id}/_history")
    Call<AllergyIntolerance> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("AllergyIntolerance/_history")
    Call<AllergyIntolerance> history(@QueryMap Map<String, String> parameters);

    @POST("AllergyIntolerance")
    Call<AllergyIntolerance> create(@Body AllergyIntolerance resource, @QueryMap Map<String, String> parameters);

    @GET("AllergyIntolerance")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("AllergyIntolerance/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}