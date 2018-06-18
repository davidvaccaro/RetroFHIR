package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Encounter;

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

public interface EncounterService {

    @GET("Encounter/{id}")
    Call<Encounter> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Encounter/{id}/_history/{vid}")
    Call<Encounter> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Encounter/{id}")
    Call<Encounter> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Encounter/{id}")
    Call<Encounter> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Encounter/{id}")
    Call<Encounter> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Encounter/{id}/_history")
    Call<Encounter> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Encounter/_history")
    Call<Encounter> history(@QueryMap Map<String, String> parameters);

    @POST("Encounter")
    Call<Encounter> create(@Body Encounter resource, @QueryMap Map<String, String> parameters);

    @GET("Encounter")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Encounter/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}