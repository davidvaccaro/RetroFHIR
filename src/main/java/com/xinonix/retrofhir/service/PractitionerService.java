package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Practitioner;

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

public interface PractitionerService {

    @GET("Practitioner/{id}")
    Call<Practitioner> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Practitioner/{id}/_history/{vid}")
    Call<Practitioner> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Practitioner/{id}")
    Call<Practitioner> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Practitioner/{id}")
    Call<Practitioner> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Practitioner/{id}")
    Call<Practitioner> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Practitioner/{id}/_history")
    Call<Practitioner> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Practitioner/_history")
    Call<Practitioner> history(@QueryMap Map<String, String> parameters);

    @POST("Practitioner")
    Call<Practitioner> create(@Body Practitioner resource, @QueryMap Map<String, String> parameters);

    @GET("Practitioner")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Practitioner/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}