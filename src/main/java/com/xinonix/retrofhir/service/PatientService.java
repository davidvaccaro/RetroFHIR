package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Patient;

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

public interface PatientService {

    @GET("Patient/{id}")
    Call<Patient> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Patient/{id}/_history/{vid}")
    Call<Patient> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Patient/{id}")
    Call<Patient> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Patient/{id}")
    Call<Patient> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Patient/{id}")
    Call<Patient> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Patient/{id}/_history")
    Call<Patient> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Patient/_history")
    Call<Patient> history(@QueryMap Map<String, String> parameters);

    @POST("Patient")
    Call<Patient> create(@Body Patient resource, @QueryMap Map<String, String> parameters);

    @GET("Patient")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Patient/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}