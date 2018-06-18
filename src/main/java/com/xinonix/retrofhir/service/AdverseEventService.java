package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.AdverseEvent;

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

public interface AdverseEventService {

    @GET("AdverseEvent/{id}")
    Call<AdverseEvent> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("AdverseEvent/{id}/_history/{vid}")
    Call<AdverseEvent> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("AdverseEvent/{id}")
    Call<AdverseEvent> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("AdverseEvent/{id}")
    Call<AdverseEvent> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("AdverseEvent/{id}")
    Call<AdverseEvent> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("AdverseEvent/{id}/_history")
    Call<AdverseEvent> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("AdverseEvent/_history")
    Call<AdverseEvent> history(@QueryMap Map<String, String> parameters);

    @POST("AdverseEvent")
    Call<AdverseEvent> create(@Body AdverseEvent resource, @QueryMap Map<String, String> parameters);

    @GET("AdverseEvent")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("AdverseEvent/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}