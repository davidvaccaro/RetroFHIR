package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Measure;

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

public interface MeasureService {

    @GET("Measure/{id}")
    Call<Measure> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Measure/{id}/_history/{vid}")
    Call<Measure> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Measure/{id}")
    Call<Measure> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Measure/{id}")
    Call<Measure> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Measure/{id}")
    Call<Measure> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Measure/{id}/_history")
    Call<Measure> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Measure/_history")
    Call<Measure> history(@QueryMap Map<String, String> parameters);

    @POST("Measure")
    Call<Measure> create(@Body Measure resource, @QueryMap Map<String, String> parameters);

    @GET("Measure")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Measure/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}