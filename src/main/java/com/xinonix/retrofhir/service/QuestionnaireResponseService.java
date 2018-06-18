package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.QuestionnaireResponse;

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

public interface QuestionnaireResponseService {

    @GET("QuestionnaireResponse/{id}")
    Call<QuestionnaireResponse> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("QuestionnaireResponse/{id}/_history/{vid}")
    Call<QuestionnaireResponse> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("QuestionnaireResponse/{id}")
    Call<QuestionnaireResponse> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("QuestionnaireResponse/{id}")
    Call<QuestionnaireResponse> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("QuestionnaireResponse/{id}")
    Call<QuestionnaireResponse> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("QuestionnaireResponse/{id}/_history")
    Call<QuestionnaireResponse> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("QuestionnaireResponse/_history")
    Call<QuestionnaireResponse> history(@QueryMap Map<String, String> parameters);

    @POST("QuestionnaireResponse")
    Call<QuestionnaireResponse> create(@Body QuestionnaireResponse resource, @QueryMap Map<String, String> parameters);

    @GET("QuestionnaireResponse")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("QuestionnaireResponse/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}