package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.SupplyDelivery;

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

public interface SupplyDeliveryService {

    @GET("SupplyDelivery/{id}")
    Call<SupplyDelivery> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("SupplyDelivery/{id}/_history/{vid}")
    Call<SupplyDelivery> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("SupplyDelivery/{id}")
    Call<SupplyDelivery> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("SupplyDelivery/{id}")
    Call<SupplyDelivery> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("SupplyDelivery/{id}")
    Call<SupplyDelivery> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("SupplyDelivery/{id}/_history")
    Call<SupplyDelivery> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("SupplyDelivery/_history")
    Call<SupplyDelivery> history(@QueryMap Map<String, String> parameters);

    @POST("SupplyDelivery")
    Call<SupplyDelivery> create(@Body SupplyDelivery resource, @QueryMap Map<String, String> parameters);

    @GET("SupplyDelivery")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("SupplyDelivery/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}