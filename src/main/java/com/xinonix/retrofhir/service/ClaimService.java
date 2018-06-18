package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Claim;

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

public interface ClaimService {

    @GET("Claim/{id}")
    Call<Claim> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Claim/{id}/_history/{vid}")
    Call<Claim> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Claim/{id}")
    Call<Claim> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Claim/{id}")
    Call<Claim> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Claim/{id}")
    Call<Claim> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Claim/{id}/_history")
    Call<Claim> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Claim/_history")
    Call<Claim> history(@QueryMap Map<String, String> parameters);

    @POST("Claim")
    Call<Claim> create(@Body Claim resource, @QueryMap Map<String, String> parameters);

    @GET("Claim")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Claim/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}