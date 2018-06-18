package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.RiskAssessment;

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

public interface RiskAssessmentService {

    @GET("RiskAssessment/{id}")
    Call<RiskAssessment> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("RiskAssessment/{id}/_history/{vid}")
    Call<RiskAssessment> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("RiskAssessment/{id}")
    Call<RiskAssessment> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("RiskAssessment/{id}")
    Call<RiskAssessment> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("RiskAssessment/{id}")
    Call<RiskAssessment> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("RiskAssessment/{id}/_history")
    Call<RiskAssessment> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("RiskAssessment/_history")
    Call<RiskAssessment> history(@QueryMap Map<String, String> parameters);

    @POST("RiskAssessment")
    Call<RiskAssessment> create(@Body RiskAssessment resource, @QueryMap Map<String, String> parameters);

    @GET("RiskAssessment")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("RiskAssessment/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}