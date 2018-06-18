package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ServiceDefinition;

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

public interface ServiceDefinitionService {

    @GET("ServiceDefinition/{id}")
    Call<ServiceDefinition> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ServiceDefinition/{id}/_history/{vid}")
    Call<ServiceDefinition> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ServiceDefinition/{id}")
    Call<ServiceDefinition> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ServiceDefinition/{id}")
    Call<ServiceDefinition> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ServiceDefinition/{id}")
    Call<ServiceDefinition> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ServiceDefinition/{id}/_history")
    Call<ServiceDefinition> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ServiceDefinition/_history")
    Call<ServiceDefinition> history(@QueryMap Map<String, String> parameters);

    @POST("ServiceDefinition")
    Call<ServiceDefinition> create(@Body ServiceDefinition resource, @QueryMap Map<String, String> parameters);

    @GET("ServiceDefinition")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ServiceDefinition/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}