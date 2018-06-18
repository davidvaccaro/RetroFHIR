package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.NamingSystem;

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

public interface NamingSystemService {

    @GET("NamingSystem/{id}")
    Call<NamingSystem> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("NamingSystem/{id}/_history/{vid}")
    Call<NamingSystem> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("NamingSystem/{id}")
    Call<NamingSystem> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("NamingSystem/{id}")
    Call<NamingSystem> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("NamingSystem/{id}")
    Call<NamingSystem> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("NamingSystem/{id}/_history")
    Call<NamingSystem> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("NamingSystem/_history")
    Call<NamingSystem> history(@QueryMap Map<String, String> parameters);

    @POST("NamingSystem")
    Call<NamingSystem> create(@Body NamingSystem resource, @QueryMap Map<String, String> parameters);

    @GET("NamingSystem")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("NamingSystem/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}