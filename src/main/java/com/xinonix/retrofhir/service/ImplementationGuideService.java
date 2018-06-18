package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ImplementationGuide;

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

public interface ImplementationGuideService {

    @GET("ImplementationGuide/{id}")
    Call<ImplementationGuide> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ImplementationGuide/{id}/_history/{vid}")
    Call<ImplementationGuide> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ImplementationGuide/{id}")
    Call<ImplementationGuide> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ImplementationGuide/{id}")
    Call<ImplementationGuide> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ImplementationGuide/{id}")
    Call<ImplementationGuide> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ImplementationGuide/{id}/_history")
    Call<ImplementationGuide> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ImplementationGuide/_history")
    Call<ImplementationGuide> history(@QueryMap Map<String, String> parameters);

    @POST("ImplementationGuide")
    Call<ImplementationGuide> create(@Body ImplementationGuide resource, @QueryMap Map<String, String> parameters);

    @GET("ImplementationGuide")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ImplementationGuide/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}