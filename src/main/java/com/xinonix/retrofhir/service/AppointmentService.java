package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Appointment;

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

public interface AppointmentService {

    @GET("Appointment/{id}")
    Call<Appointment> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Appointment/{id}/_history/{vid}")
    Call<Appointment> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Appointment/{id}")
    Call<Appointment> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Appointment/{id}")
    Call<Appointment> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Appointment/{id}")
    Call<Appointment> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Appointment/{id}/_history")
    Call<Appointment> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Appointment/_history")
    Call<Appointment> history(@QueryMap Map<String, String> parameters);

    @POST("Appointment")
    Call<Appointment> create(@Body Appointment resource, @QueryMap Map<String, String> parameters);

    @GET("Appointment")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Appointment/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}