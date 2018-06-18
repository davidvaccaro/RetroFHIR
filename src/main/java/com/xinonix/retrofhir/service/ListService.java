package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.List;

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

public interface ListService {

    @GET("List/{id}")
    Call<List> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("List/{id}/_history/{vid}")
    Call<List> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("List/{id}")
    Call<List> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("List/{id}")
    Call<List> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("List/{id}")
    Call<List> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("List/{id}/_history")
    Call<List> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("List/_history")
    Call<List> history(@QueryMap Map<String, String> parameters);

    @POST("List")
    Call<List> create(@Body List resource, @QueryMap Map<String, String> parameters);

    @GET("List")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("List/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}