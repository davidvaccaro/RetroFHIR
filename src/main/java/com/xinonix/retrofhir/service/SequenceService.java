package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Sequence;

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

public interface SequenceService {

    @GET("Sequence/{id}")
    Call<Sequence> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Sequence/{id}/_history/{vid}")
    Call<Sequence> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Sequence/{id}")
    Call<Sequence> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Sequence/{id}")
    Call<Sequence> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Sequence/{id}")
    Call<Sequence> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Sequence/{id}/_history")
    Call<Sequence> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Sequence/_history")
    Call<Sequence> history(@QueryMap Map<String, String> parameters);

    @POST("Sequence")
    Call<Sequence> create(@Body Sequence resource, @QueryMap Map<String, String> parameters);

    @GET("Sequence")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Sequence/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}