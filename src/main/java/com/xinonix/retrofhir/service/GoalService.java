package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Goal;

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

public interface GoalService {

    @GET("Goal/{id}")
    Call<Goal> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Goal/{id}/_history/{vid}")
    Call<Goal> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Goal/{id}")
    Call<Goal> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Goal/{id}")
    Call<Goal> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Goal/{id}")
    Call<Goal> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Goal/{id}/_history")
    Call<Goal> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Goal/_history")
    Call<Goal> history(@QueryMap Map<String, String> parameters);

    @POST("Goal")
    Call<Goal> create(@Body Goal resource, @QueryMap Map<String, String> parameters);

    @GET("Goal")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Goal/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}