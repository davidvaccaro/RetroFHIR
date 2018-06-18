package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.DeviceMetric;

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

public interface DeviceMetricService {

    @GET("DeviceMetric/{id}")
    Call<DeviceMetric> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DeviceMetric/{id}/_history/{vid}")
    Call<DeviceMetric> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("DeviceMetric/{id}")
    Call<DeviceMetric> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("DeviceMetric/{id}")
    Call<DeviceMetric> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("DeviceMetric/{id}")
    Call<DeviceMetric> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DeviceMetric/{id}/_history")
    Call<DeviceMetric> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DeviceMetric/_history")
    Call<DeviceMetric> history(@QueryMap Map<String, String> parameters);

    @POST("DeviceMetric")
    Call<DeviceMetric> create(@Body DeviceMetric resource, @QueryMap Map<String, String> parameters);

    @GET("DeviceMetric")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("DeviceMetric/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}