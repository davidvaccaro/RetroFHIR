package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Linkage;

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

public interface LinkageService {

    @GET("Linkage/{id}")
    Call<Linkage> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Linkage/{id}/_history/{vid}")
    Call<Linkage> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Linkage/{id}")
    Call<Linkage> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Linkage/{id}")
    Call<Linkage> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Linkage/{id}")
    Call<Linkage> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Linkage/{id}/_history")
    Call<Linkage> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Linkage/_history")
    Call<Linkage> history(@QueryMap Map<String, String> parameters);

    @POST("Linkage")
    Call<Linkage> create(@Body Linkage resource, @QueryMap Map<String, String> parameters);

    @GET("Linkage")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Linkage/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}