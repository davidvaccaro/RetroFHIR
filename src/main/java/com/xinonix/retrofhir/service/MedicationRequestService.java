package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.MedicationRequest;

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

public interface MedicationRequestService {

    @GET("MedicationRequest/{id}")
    Call<MedicationRequest> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("MedicationRequest/{id}/_history/{vid}")
    Call<MedicationRequest> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("MedicationRequest/{id}")
    Call<MedicationRequest> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("MedicationRequest/{id}")
    Call<MedicationRequest> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("MedicationRequest/{id}")
    Call<MedicationRequest> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("MedicationRequest/{id}/_history")
    Call<MedicationRequest> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("MedicationRequest/_history")
    Call<MedicationRequest> history(@QueryMap Map<String, String> parameters);

    @POST("MedicationRequest")
    Call<MedicationRequest> create(@Body MedicationRequest resource, @QueryMap Map<String, String> parameters);

    @GET("MedicationRequest")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("MedicationRequest/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}