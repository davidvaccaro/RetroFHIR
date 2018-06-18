package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ActivityDefinition;

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

public interface ActivityDefinitionService {

    @GET("ActivityDefinition/{id}")
    Call<ActivityDefinition> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ActivityDefinition/{id}/_history/{vid}")
    Call<ActivityDefinition> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ActivityDefinition/{id}")
    Call<ActivityDefinition> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ActivityDefinition/{id}")
    Call<ActivityDefinition> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ActivityDefinition/{id}")
    Call<ActivityDefinition> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ActivityDefinition/{id}/_history")
    Call<ActivityDefinition> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ActivityDefinition/_history")
    Call<ActivityDefinition> history(@QueryMap Map<String, String> parameters);

    @POST("ActivityDefinition")
    Call<ActivityDefinition> create(@Body ActivityDefinition resource, @QueryMap Map<String, String> parameters);

    @GET("ActivityDefinition")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ActivityDefinition/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}