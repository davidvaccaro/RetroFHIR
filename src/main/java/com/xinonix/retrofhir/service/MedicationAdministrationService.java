package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.MedicationAdministration;

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

public interface MedicationAdministrationService {

    @GET("MedicationAdministration/{id}")
    Call<MedicationAdministration> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("MedicationAdministration/{id}/_history/{vid}")
    Call<MedicationAdministration> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("MedicationAdministration/{id}")
    Call<MedicationAdministration> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("MedicationAdministration/{id}")
    Call<MedicationAdministration> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("MedicationAdministration/{id}")
    Call<MedicationAdministration> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("MedicationAdministration/{id}/_history")
    Call<MedicationAdministration> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("MedicationAdministration/_history")
    Call<MedicationAdministration> history(@QueryMap Map<String, String> parameters);

    @POST("MedicationAdministration")
    Call<MedicationAdministration> create(@Body MedicationAdministration resource, @QueryMap Map<String, String> parameters);

    @GET("MedicationAdministration")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("MedicationAdministration/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}