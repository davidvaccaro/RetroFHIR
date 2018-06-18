package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Endpoint;

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

public interface EndpointService {

    @GET("Endpoint/{id}")
    Call<Endpoint> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Endpoint/{id}/_history/{vid}")
    Call<Endpoint> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Endpoint/{id}")
    Call<Endpoint> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Endpoint/{id}")
    Call<Endpoint> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Endpoint/{id}")
    Call<Endpoint> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Endpoint/{id}/_history")
    Call<Endpoint> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Endpoint/_history")
    Call<Endpoint> history(@QueryMap Map<String, String> parameters);

    @POST("Endpoint")
    Call<Endpoint> create(@Body Endpoint resource, @QueryMap Map<String, String> parameters);

    @GET("Endpoint")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Endpoint/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}