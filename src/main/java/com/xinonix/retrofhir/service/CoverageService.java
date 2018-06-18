package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Coverage;

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

public interface CoverageService {

    @GET("Coverage/{id}")
    Call<Coverage> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Coverage/{id}/_history/{vid}")
    Call<Coverage> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Coverage/{id}")
    Call<Coverage> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Coverage/{id}")
    Call<Coverage> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Coverage/{id}")
    Call<Coverage> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Coverage/{id}/_history")
    Call<Coverage> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Coverage/_history")
    Call<Coverage> history(@QueryMap Map<String, String> parameters);

    @POST("Coverage")
    Call<Coverage> create(@Body Coverage resource, @QueryMap Map<String, String> parameters);

    @GET("Coverage")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Coverage/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}