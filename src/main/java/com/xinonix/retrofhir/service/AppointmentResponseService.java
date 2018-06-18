package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.AppointmentResponse;

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

public interface AppointmentResponseService {

    @GET("AppointmentResponse/{id}")
    Call<AppointmentResponse> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("AppointmentResponse/{id}/_history/{vid}")
    Call<AppointmentResponse> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("AppointmentResponse/{id}")
    Call<AppointmentResponse> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("AppointmentResponse/{id}")
    Call<AppointmentResponse> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("AppointmentResponse/{id}")
    Call<AppointmentResponse> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("AppointmentResponse/{id}/_history")
    Call<AppointmentResponse> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("AppointmentResponse/_history")
    Call<AppointmentResponse> history(@QueryMap Map<String, String> parameters);

    @POST("AppointmentResponse")
    Call<AppointmentResponse> create(@Body AppointmentResponse resource, @QueryMap Map<String, String> parameters);

    @GET("AppointmentResponse")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("AppointmentResponse/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}