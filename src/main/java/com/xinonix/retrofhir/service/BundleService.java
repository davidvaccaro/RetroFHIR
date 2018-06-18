package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Bundle;

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

public interface BundleService {

    @GET("Bundle/{id}")
    Call<Bundle> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Bundle/{id}/_history/{vid}")
    Call<Bundle> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Bundle/{id}")
    Call<Bundle> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Bundle/{id}")
    Call<Bundle> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Bundle/{id}")
    Call<Bundle> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Bundle/{id}/_history")
    Call<Bundle> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Bundle/_history")
    Call<Bundle> history(@QueryMap Map<String, String> parameters);

    @POST("Bundle")
    Call<Bundle> create(@Body Bundle resource, @QueryMap Map<String, String> parameters);

    @GET("Bundle")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Bundle/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}