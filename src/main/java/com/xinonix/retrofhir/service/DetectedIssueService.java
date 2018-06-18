package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.DetectedIssue;

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

public interface DetectedIssueService {

    @GET("DetectedIssue/{id}")
    Call<DetectedIssue> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DetectedIssue/{id}/_history/{vid}")
    Call<DetectedIssue> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("DetectedIssue/{id}")
    Call<DetectedIssue> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("DetectedIssue/{id}")
    Call<DetectedIssue> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("DetectedIssue/{id}")
    Call<DetectedIssue> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DetectedIssue/{id}/_history")
    Call<DetectedIssue> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DetectedIssue/_history")
    Call<DetectedIssue> history(@QueryMap Map<String, String> parameters);

    @POST("DetectedIssue")
    Call<DetectedIssue> create(@Body DetectedIssue resource, @QueryMap Map<String, String> parameters);

    @GET("DetectedIssue")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("DetectedIssue/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}