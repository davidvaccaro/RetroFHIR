package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Subscription;

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

public interface SubscriptionService {

    @GET("Subscription/{id}")
    Call<Subscription> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Subscription/{id}/_history/{vid}")
    Call<Subscription> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Subscription/{id}")
    Call<Subscription> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Subscription/{id}")
    Call<Subscription> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Subscription/{id}")
    Call<Subscription> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Subscription/{id}/_history")
    Call<Subscription> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Subscription/_history")
    Call<Subscription> history(@QueryMap Map<String, String> parameters);

    @POST("Subscription")
    Call<Subscription> create(@Body Subscription resource, @QueryMap Map<String, String> parameters);

    @GET("Subscription")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Subscription/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}