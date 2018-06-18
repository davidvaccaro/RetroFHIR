package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.StructureDefinition;

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

public interface StructureDefinitionService {

    @GET("StructureDefinition/{id}")
    Call<StructureDefinition> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("StructureDefinition/{id}/_history/{vid}")
    Call<StructureDefinition> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("StructureDefinition/{id}")
    Call<StructureDefinition> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("StructureDefinition/{id}")
    Call<StructureDefinition> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("StructureDefinition/{id}")
    Call<StructureDefinition> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("StructureDefinition/{id}/_history")
    Call<StructureDefinition> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("StructureDefinition/_history")
    Call<StructureDefinition> history(@QueryMap Map<String, String> parameters);

    @POST("StructureDefinition")
    Call<StructureDefinition> create(@Body StructureDefinition resource, @QueryMap Map<String, String> parameters);

    @GET("StructureDefinition")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("StructureDefinition/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}