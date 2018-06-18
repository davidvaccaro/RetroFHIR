package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Slot;

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

public interface SlotService {

    @GET("Slot/{id}")
    Call<Slot> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Slot/{id}/_history/{vid}")
    Call<Slot> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Slot/{id}")
    Call<Slot> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Slot/{id}")
    Call<Slot> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Slot/{id}")
    Call<Slot> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Slot/{id}/_history")
    Call<Slot> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Slot/_history")
    Call<Slot> history(@QueryMap Map<String, String> parameters);

    @POST("Slot")
    Call<Slot> create(@Body Slot resource, @QueryMap Map<String, String> parameters);

    @GET("Slot")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Slot/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}