package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.DeviceComponent;

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

public interface DeviceComponentService {

    @GET("DeviceComponent/{id}")
    Call<DeviceComponent> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DeviceComponent/{id}/_history/{vid}")
    Call<DeviceComponent> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("DeviceComponent/{id}")
    Call<DeviceComponent> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("DeviceComponent/{id}")
    Call<DeviceComponent> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("DeviceComponent/{id}")
    Call<DeviceComponent> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DeviceComponent/{id}/_history")
    Call<DeviceComponent> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DeviceComponent/_history")
    Call<DeviceComponent> history(@QueryMap Map<String, String> parameters);

    @POST("DeviceComponent")
    Call<DeviceComponent> create(@Body DeviceComponent resource, @QueryMap Map<String, String> parameters);

    @GET("DeviceComponent")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("DeviceComponent/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}