package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Questionnaire;

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

public interface QuestionnaireService {

    @GET("Questionnaire/{id}")
    Call<Questionnaire> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Questionnaire/{id}/_history/{vid}")
    Call<Questionnaire> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Questionnaire/{id}")
    Call<Questionnaire> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Questionnaire/{id}")
    Call<Questionnaire> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Questionnaire/{id}")
    Call<Questionnaire> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Questionnaire/{id}/_history")
    Call<Questionnaire> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Questionnaire/_history")
    Call<Questionnaire> history(@QueryMap Map<String, String> parameters);

    @POST("Questionnaire")
    Call<Questionnaire> create(@Body Questionnaire resource, @QueryMap Map<String, String> parameters);

    @GET("Questionnaire")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Questionnaire/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}