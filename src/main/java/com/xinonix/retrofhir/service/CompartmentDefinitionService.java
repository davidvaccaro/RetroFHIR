package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.CompartmentDefinition;

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

public interface CompartmentDefinitionService {

    @GET("CompartmentDefinition/{id}")
    Call<CompartmentDefinition> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CompartmentDefinition/{id}/_history/{vid}")
    Call<CompartmentDefinition> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("CompartmentDefinition/{id}")
    Call<CompartmentDefinition> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("CompartmentDefinition/{id}")
    Call<CompartmentDefinition> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("CompartmentDefinition/{id}")
    Call<CompartmentDefinition> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CompartmentDefinition/{id}/_history")
    Call<CompartmentDefinition> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CompartmentDefinition/_history")
    Call<CompartmentDefinition> history(@QueryMap Map<String, String> parameters);

    @POST("CompartmentDefinition")
    Call<CompartmentDefinition> create(@Body CompartmentDefinition resource, @QueryMap Map<String, String> parameters);

    @GET("CompartmentDefinition")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("CompartmentDefinition/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}