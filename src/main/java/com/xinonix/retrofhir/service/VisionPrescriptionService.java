package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.VisionPrescription;

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

public interface VisionPrescriptionService {

    @GET("VisionPrescription/{id}")
    Call<VisionPrescription> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("VisionPrescription/{id}/_history/{vid}")
    Call<VisionPrescription> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("VisionPrescription/{id}")
    Call<VisionPrescription> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("VisionPrescription/{id}")
    Call<VisionPrescription> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("VisionPrescription/{id}")
    Call<VisionPrescription> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("VisionPrescription/{id}/_history")
    Call<VisionPrescription> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("VisionPrescription/_history")
    Call<VisionPrescription> history(@QueryMap Map<String, String> parameters);

    @POST("VisionPrescription")
    Call<VisionPrescription> create(@Body VisionPrescription resource, @QueryMap Map<String, String> parameters);

    @GET("VisionPrescription")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("VisionPrescription/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}