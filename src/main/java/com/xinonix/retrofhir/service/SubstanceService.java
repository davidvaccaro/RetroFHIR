package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Substance;

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

public interface SubstanceService {

    @GET("Substance/{id}")
    Call<Substance> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Substance/{id}/_history/{vid}")
    Call<Substance> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Substance/{id}")
    Call<Substance> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Substance/{id}")
    Call<Substance> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Substance/{id}")
    Call<Substance> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Substance/{id}/_history")
    Call<Substance> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Substance/_history")
    Call<Substance> history(@QueryMap Map<String, String> parameters);

    @POST("Substance")
    Call<Substance> create(@Body Substance resource, @QueryMap Map<String, String> parameters);

    @GET("Substance")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Substance/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}