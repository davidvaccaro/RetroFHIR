package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Communication;

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

public interface CommunicationService {

    @GET("Communication/{id}")
    Call<Communication> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Communication/{id}/_history/{vid}")
    Call<Communication> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Communication/{id}")
    Call<Communication> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Communication/{id}")
    Call<Communication> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Communication/{id}")
    Call<Communication> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Communication/{id}/_history")
    Call<Communication> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Communication/_history")
    Call<Communication> history(@QueryMap Map<String, String> parameters);

    @POST("Communication")
    Call<Communication> create(@Body Communication resource, @QueryMap Map<String, String> parameters);

    @GET("Communication")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Communication/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}