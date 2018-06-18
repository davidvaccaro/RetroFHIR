package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ImmunizationRecommendation;

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

public interface ImmunizationRecommendationService {

    @GET("ImmunizationRecommendation/{id}")
    Call<ImmunizationRecommendation> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ImmunizationRecommendation/{id}/_history/{vid}")
    Call<ImmunizationRecommendation> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ImmunizationRecommendation/{id}")
    Call<ImmunizationRecommendation> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ImmunizationRecommendation/{id}")
    Call<ImmunizationRecommendation> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ImmunizationRecommendation/{id}")
    Call<ImmunizationRecommendation> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ImmunizationRecommendation/{id}/_history")
    Call<ImmunizationRecommendation> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ImmunizationRecommendation/_history")
    Call<ImmunizationRecommendation> history(@QueryMap Map<String, String> parameters);

    @POST("ImmunizationRecommendation")
    Call<ImmunizationRecommendation> create(@Body ImmunizationRecommendation resource, @QueryMap Map<String, String> parameters);

    @GET("ImmunizationRecommendation")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ImmunizationRecommendation/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}