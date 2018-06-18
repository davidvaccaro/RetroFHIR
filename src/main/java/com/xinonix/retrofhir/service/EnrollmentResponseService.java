package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.EnrollmentResponse;

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

public interface EnrollmentResponseService {

    @GET("EnrollmentResponse/{id}")
    Call<EnrollmentResponse> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("EnrollmentResponse/{id}/_history/{vid}")
    Call<EnrollmentResponse> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("EnrollmentResponse/{id}")
    Call<EnrollmentResponse> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("EnrollmentResponse/{id}")
    Call<EnrollmentResponse> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("EnrollmentResponse/{id}")
    Call<EnrollmentResponse> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("EnrollmentResponse/{id}/_history")
    Call<EnrollmentResponse> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("EnrollmentResponse/_history")
    Call<EnrollmentResponse> history(@QueryMap Map<String, String> parameters);

    @POST("EnrollmentResponse")
    Call<EnrollmentResponse> create(@Body EnrollmentResponse resource, @QueryMap Map<String, String> parameters);

    @GET("EnrollmentResponse")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("EnrollmentResponse/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}