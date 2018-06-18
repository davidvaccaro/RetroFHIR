package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Specimen;

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

public interface SpecimenService {

    @GET("Specimen/{id}")
    Call<Specimen> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Specimen/{id}/_history/{vid}")
    Call<Specimen> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Specimen/{id}")
    Call<Specimen> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Specimen/{id}")
    Call<Specimen> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Specimen/{id}")
    Call<Specimen> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Specimen/{id}/_history")
    Call<Specimen> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Specimen/_history")
    Call<Specimen> history(@QueryMap Map<String, String> parameters);

    @POST("Specimen")
    Call<Specimen> create(@Body Specimen resource, @QueryMap Map<String, String> parameters);

    @GET("Specimen")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Specimen/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}