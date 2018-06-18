package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Composition;

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

public interface CompositionService {

    @GET("Composition/{id}")
    Call<Composition> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Composition/{id}/_history/{vid}")
    Call<Composition> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Composition/{id}")
    Call<Composition> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Composition/{id}")
    Call<Composition> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Composition/{id}")
    Call<Composition> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Composition/{id}/_history")
    Call<Composition> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Composition/_history")
    Call<Composition> history(@QueryMap Map<String, String> parameters);

    @POST("Composition")
    Call<Composition> create(@Body Composition resource, @QueryMap Map<String, String> parameters);

    @GET("Composition")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Composition/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}