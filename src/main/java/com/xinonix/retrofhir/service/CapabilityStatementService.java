package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.CapabilityStatement;

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

public interface CapabilityStatementService {

    @GET("CapabilityStatement/{id}")
    Call<CapabilityStatement> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CapabilityStatement/{id}/_history/{vid}")
    Call<CapabilityStatement> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("CapabilityStatement/{id}")
    Call<CapabilityStatement> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("CapabilityStatement/{id}")
    Call<CapabilityStatement> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("CapabilityStatement/{id}")
    Call<CapabilityStatement> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CapabilityStatement/{id}/_history")
    Call<CapabilityStatement> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CapabilityStatement/_history")
    Call<CapabilityStatement> history(@QueryMap Map<String, String> parameters);

    @POST("CapabilityStatement")
    Call<CapabilityStatement> create(@Body CapabilityStatement resource, @QueryMap Map<String, String> parameters);

    @GET("CapabilityStatement")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("CapabilityStatement/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}