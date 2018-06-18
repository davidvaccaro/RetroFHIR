package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.GraphDefinition;

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

public interface GraphDefinitionService {

    @GET("GraphDefinition/{id}")
    Call<GraphDefinition> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("GraphDefinition/{id}/_history/{vid}")
    Call<GraphDefinition> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("GraphDefinition/{id}")
    Call<GraphDefinition> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("GraphDefinition/{id}")
    Call<GraphDefinition> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("GraphDefinition/{id}")
    Call<GraphDefinition> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("GraphDefinition/{id}/_history")
    Call<GraphDefinition> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("GraphDefinition/_history")
    Call<GraphDefinition> history(@QueryMap Map<String, String> parameters);

    @POST("GraphDefinition")
    Call<GraphDefinition> create(@Body GraphDefinition resource, @QueryMap Map<String, String> parameters);

    @GET("GraphDefinition")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("GraphDefinition/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}