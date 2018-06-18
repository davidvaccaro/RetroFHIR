package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Flag;

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

public interface FlagService {

    @GET("Flag/{id}")
    Call<Flag> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Flag/{id}/_history/{vid}")
    Call<Flag> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Flag/{id}")
    Call<Flag> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Flag/{id}")
    Call<Flag> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Flag/{id}")
    Call<Flag> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Flag/{id}/_history")
    Call<Flag> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Flag/_history")
    Call<Flag> history(@QueryMap Map<String, String> parameters);

    @POST("Flag")
    Call<Flag> create(@Body Flag resource, @QueryMap Map<String, String> parameters);

    @GET("Flag")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Flag/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}