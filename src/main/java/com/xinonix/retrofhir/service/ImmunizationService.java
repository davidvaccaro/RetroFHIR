package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Immunization;

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

public interface ImmunizationService {

    @GET("Immunization/{id}")
    Call<Immunization> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Immunization/{id}/_history/{vid}")
    Call<Immunization> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Immunization/{id}")
    Call<Immunization> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Immunization/{id}")
    Call<Immunization> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Immunization/{id}")
    Call<Immunization> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Immunization/{id}/_history")
    Call<Immunization> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Immunization/_history")
    Call<Immunization> history(@QueryMap Map<String, String> parameters);

    @POST("Immunization")
    Call<Immunization> create(@Body Immunization resource, @QueryMap Map<String, String> parameters);

    @GET("Immunization")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Immunization/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}