package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.AuditEvent;

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

public interface AuditEventService {

    @GET("AuditEvent/{id}")
    Call<AuditEvent> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("AuditEvent/{id}/_history/{vid}")
    Call<AuditEvent> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("AuditEvent/{id}")
    Call<AuditEvent> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("AuditEvent/{id}")
    Call<AuditEvent> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("AuditEvent/{id}")
    Call<AuditEvent> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("AuditEvent/{id}/_history")
    Call<AuditEvent> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("AuditEvent/_history")
    Call<AuditEvent> history(@QueryMap Map<String, String> parameters);

    @POST("AuditEvent")
    Call<AuditEvent> create(@Body AuditEvent resource, @QueryMap Map<String, String> parameters);

    @GET("AuditEvent")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("AuditEvent/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}