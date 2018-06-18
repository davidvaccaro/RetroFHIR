package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ChargeItem;

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

public interface ChargeItemService {

    @GET("ChargeItem/{id}")
    Call<ChargeItem> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ChargeItem/{id}/_history/{vid}")
    Call<ChargeItem> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ChargeItem/{id}")
    Call<ChargeItem> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ChargeItem/{id}")
    Call<ChargeItem> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ChargeItem/{id}")
    Call<ChargeItem> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ChargeItem/{id}/_history")
    Call<ChargeItem> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ChargeItem/_history")
    Call<ChargeItem> history(@QueryMap Map<String, String> parameters);

    @POST("ChargeItem")
    Call<ChargeItem> create(@Body ChargeItem resource, @QueryMap Map<String, String> parameters);

    @GET("ChargeItem")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ChargeItem/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}