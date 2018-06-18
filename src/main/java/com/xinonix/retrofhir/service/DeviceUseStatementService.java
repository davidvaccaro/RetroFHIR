package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.DeviceUseStatement;

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

public interface DeviceUseStatementService {

    @GET("DeviceUseStatement/{id}")
    Call<DeviceUseStatement> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DeviceUseStatement/{id}/_history/{vid}")
    Call<DeviceUseStatement> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("DeviceUseStatement/{id}")
    Call<DeviceUseStatement> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("DeviceUseStatement/{id}")
    Call<DeviceUseStatement> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("DeviceUseStatement/{id}")
    Call<DeviceUseStatement> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DeviceUseStatement/{id}/_history")
    Call<DeviceUseStatement> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DeviceUseStatement/_history")
    Call<DeviceUseStatement> history(@QueryMap Map<String, String> parameters);

    @POST("DeviceUseStatement")
    Call<DeviceUseStatement> create(@Body DeviceUseStatement resource, @QueryMap Map<String, String> parameters);

    @GET("DeviceUseStatement")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("DeviceUseStatement/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}