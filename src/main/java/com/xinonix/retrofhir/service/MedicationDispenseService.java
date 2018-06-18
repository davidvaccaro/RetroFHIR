package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.MedicationDispense;

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

public interface MedicationDispenseService {

    @GET("MedicationDispense/{id}")
    Call<MedicationDispense> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("MedicationDispense/{id}/_history/{vid}")
    Call<MedicationDispense> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("MedicationDispense/{id}")
    Call<MedicationDispense> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("MedicationDispense/{id}")
    Call<MedicationDispense> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("MedicationDispense/{id}")
    Call<MedicationDispense> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("MedicationDispense/{id}/_history")
    Call<MedicationDispense> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("MedicationDispense/_history")
    Call<MedicationDispense> history(@QueryMap Map<String, String> parameters);

    @POST("MedicationDispense")
    Call<MedicationDispense> create(@Body MedicationDispense resource, @QueryMap Map<String, String> parameters);

    @GET("MedicationDispense")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("MedicationDispense/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}