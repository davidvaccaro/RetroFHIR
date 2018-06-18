package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.OperationDefinition;

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

public interface OperationDefinitionService {

    @GET("OperationDefinition/{id}")
    Call<OperationDefinition> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("OperationDefinition/{id}/_history/{vid}")
    Call<OperationDefinition> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("OperationDefinition/{id}")
    Call<OperationDefinition> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("OperationDefinition/{id}")
    Call<OperationDefinition> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("OperationDefinition/{id}")
    Call<OperationDefinition> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("OperationDefinition/{id}/_history")
    Call<OperationDefinition> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("OperationDefinition/_history")
    Call<OperationDefinition> history(@QueryMap Map<String, String> parameters);

    @POST("OperationDefinition")
    Call<OperationDefinition> create(@Body OperationDefinition resource, @QueryMap Map<String, String> parameters);

    @GET("OperationDefinition")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("OperationDefinition/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}