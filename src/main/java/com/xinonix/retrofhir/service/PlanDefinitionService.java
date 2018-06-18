package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.PlanDefinition;

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

public interface PlanDefinitionService {

    @GET("PlanDefinition/{id}")
    Call<PlanDefinition> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("PlanDefinition/{id}/_history/{vid}")
    Call<PlanDefinition> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("PlanDefinition/{id}")
    Call<PlanDefinition> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("PlanDefinition/{id}")
    Call<PlanDefinition> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("PlanDefinition/{id}")
    Call<PlanDefinition> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("PlanDefinition/{id}/_history")
    Call<PlanDefinition> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("PlanDefinition/_history")
    Call<PlanDefinition> history(@QueryMap Map<String, String> parameters);

    @POST("PlanDefinition")
    Call<PlanDefinition> create(@Body PlanDefinition resource, @QueryMap Map<String, String> parameters);

    @GET("PlanDefinition")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("PlanDefinition/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}