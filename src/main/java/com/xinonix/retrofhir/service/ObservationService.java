package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Observation;

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

public interface ObservationService {

    @GET("Observation/{id}")
    Call<Observation> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Observation/{id}/_history/{vid}")
    Call<Observation> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Observation/{id}")
    Call<Observation> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Observation/{id}")
    Call<Observation> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Observation/{id}")
    Call<Observation> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Observation/{id}/_history")
    Call<Observation> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Observation/_history")
    Call<Observation> history(@QueryMap Map<String, String> parameters);

    @POST("Observation")
    Call<Observation> create(@Body Observation resource, @QueryMap Map<String, String> parameters);

    @GET("Observation")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Observation/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}