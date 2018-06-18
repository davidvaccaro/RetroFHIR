package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ExpansionProfile;

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

public interface ExpansionProfileService {

    @GET("ExpansionProfile/{id}")
    Call<ExpansionProfile> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ExpansionProfile/{id}/_history/{vid}")
    Call<ExpansionProfile> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ExpansionProfile/{id}")
    Call<ExpansionProfile> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ExpansionProfile/{id}")
    Call<ExpansionProfile> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ExpansionProfile/{id}")
    Call<ExpansionProfile> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ExpansionProfile/{id}/_history")
    Call<ExpansionProfile> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ExpansionProfile/_history")
    Call<ExpansionProfile> history(@QueryMap Map<String, String> parameters);

    @POST("ExpansionProfile")
    Call<ExpansionProfile> create(@Body ExpansionProfile resource, @QueryMap Map<String, String> parameters);

    @GET("ExpansionProfile")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ExpansionProfile/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}