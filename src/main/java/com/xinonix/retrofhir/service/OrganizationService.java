package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Organization;

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

public interface OrganizationService {

    @GET("Organization/{id}")
    Call<Organization> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Organization/{id}/_history/{vid}")
    Call<Organization> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Organization/{id}")
    Call<Organization> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Organization/{id}")
    Call<Organization> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Organization/{id}")
    Call<Organization> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Organization/{id}/_history")
    Call<Organization> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Organization/_history")
    Call<Organization> history(@QueryMap Map<String, String> parameters);

    @POST("Organization")
    Call<Organization> create(@Body Organization resource, @QueryMap Map<String, String> parameters);

    @GET("Organization")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Organization/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}