package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.DeviceRequest;

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

public interface DeviceRequestService {

    @GET("DeviceRequest/{id}")
    Call<DeviceRequest> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DeviceRequest/{id}/_history/{vid}")
    Call<DeviceRequest> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("DeviceRequest/{id}")
    Call<DeviceRequest> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("DeviceRequest/{id}")
    Call<DeviceRequest> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("DeviceRequest/{id}")
    Call<DeviceRequest> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DeviceRequest/{id}/_history")
    Call<DeviceRequest> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DeviceRequest/_history")
    Call<DeviceRequest> history(@QueryMap Map<String, String> parameters);

    @POST("DeviceRequest")
    Call<DeviceRequest> create(@Body DeviceRequest resource, @QueryMap Map<String, String> parameters);

    @GET("DeviceRequest")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("DeviceRequest/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}