package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.EligibilityResponse;

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

public interface EligibilityResponseService {

    @GET("EligibilityResponse/{id}")
    Call<EligibilityResponse> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("EligibilityResponse/{id}/_history/{vid}")
    Call<EligibilityResponse> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("EligibilityResponse/{id}")
    Call<EligibilityResponse> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("EligibilityResponse/{id}")
    Call<EligibilityResponse> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("EligibilityResponse/{id}")
    Call<EligibilityResponse> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("EligibilityResponse/{id}/_history")
    Call<EligibilityResponse> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("EligibilityResponse/_history")
    Call<EligibilityResponse> history(@QueryMap Map<String, String> parameters);

    @POST("EligibilityResponse")
    Call<EligibilityResponse> create(@Body EligibilityResponse resource, @QueryMap Map<String, String> parameters);

    @GET("EligibilityResponse")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("EligibilityResponse/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}