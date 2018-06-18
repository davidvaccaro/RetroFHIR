package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.EpisodeOfCare;

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

public interface EpisodeOfCareService {

    @GET("EpisodeOfCare/{id}")
    Call<EpisodeOfCare> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("EpisodeOfCare/{id}/_history/{vid}")
    Call<EpisodeOfCare> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("EpisodeOfCare/{id}")
    Call<EpisodeOfCare> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("EpisodeOfCare/{id}")
    Call<EpisodeOfCare> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("EpisodeOfCare/{id}")
    Call<EpisodeOfCare> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("EpisodeOfCare/{id}/_history")
    Call<EpisodeOfCare> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("EpisodeOfCare/_history")
    Call<EpisodeOfCare> history(@QueryMap Map<String, String> parameters);

    @POST("EpisodeOfCare")
    Call<EpisodeOfCare> create(@Body EpisodeOfCare resource, @QueryMap Map<String, String> parameters);

    @GET("EpisodeOfCare")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("EpisodeOfCare/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}