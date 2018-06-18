package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ExplanationOfBenefit;

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

public interface ExplanationOfBenefitService {

    @GET("ExplanationOfBenefit/{id}")
    Call<ExplanationOfBenefit> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ExplanationOfBenefit/{id}/_history/{vid}")
    Call<ExplanationOfBenefit> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ExplanationOfBenefit/{id}")
    Call<ExplanationOfBenefit> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ExplanationOfBenefit/{id}")
    Call<ExplanationOfBenefit> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ExplanationOfBenefit/{id}")
    Call<ExplanationOfBenefit> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ExplanationOfBenefit/{id}/_history")
    Call<ExplanationOfBenefit> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ExplanationOfBenefit/_history")
    Call<ExplanationOfBenefit> history(@QueryMap Map<String, String> parameters);

    @POST("ExplanationOfBenefit")
    Call<ExplanationOfBenefit> create(@Body ExplanationOfBenefit resource, @QueryMap Map<String, String> parameters);

    @GET("ExplanationOfBenefit")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ExplanationOfBenefit/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}