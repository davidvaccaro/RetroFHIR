package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Location;

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

public interface LocationService {

    @GET("Location/{id}")
    Call<Location> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Location/{id}/_history/{vid}")
    Call<Location> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Location/{id}")
    Call<Location> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Location/{id}")
    Call<Location> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Location/{id}")
    Call<Location> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Location/{id}/_history")
    Call<Location> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Location/_history")
    Call<Location> history(@QueryMap Map<String, String> parameters);

    @POST("Location")
    Call<Location> create(@Body Location resource, @QueryMap Map<String, String> parameters);

    @GET("Location")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Location/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}