package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.SupplyRequest;

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

public interface SupplyRequestService {

    @GET("SupplyRequest/{id}")
    Call<SupplyRequest> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("SupplyRequest/{id}/_history/{vid}")
    Call<SupplyRequest> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("SupplyRequest/{id}")
    Call<SupplyRequest> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("SupplyRequest/{id}")
    Call<SupplyRequest> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("SupplyRequest/{id}")
    Call<SupplyRequest> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("SupplyRequest/{id}/_history")
    Call<SupplyRequest> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("SupplyRequest/_history")
    Call<SupplyRequest> history(@QueryMap Map<String, String> parameters);

    @POST("SupplyRequest")
    Call<SupplyRequest> create(@Body SupplyRequest resource, @QueryMap Map<String, String> parameters);

    @GET("SupplyRequest")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("SupplyRequest/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}