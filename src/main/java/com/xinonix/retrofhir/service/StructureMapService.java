package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.StructureMap;

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

public interface StructureMapService {

    @GET("StructureMap/{id}")
    Call<StructureMap> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("StructureMap/{id}/_history/{vid}")
    Call<StructureMap> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("StructureMap/{id}")
    Call<StructureMap> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("StructureMap/{id}")
    Call<StructureMap> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("StructureMap/{id}")
    Call<StructureMap> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("StructureMap/{id}/_history")
    Call<StructureMap> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("StructureMap/_history")
    Call<StructureMap> history(@QueryMap Map<String, String> parameters);

    @POST("StructureMap")
    Call<StructureMap> create(@Body StructureMap resource, @QueryMap Map<String, String> parameters);

    @GET("StructureMap")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("StructureMap/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}