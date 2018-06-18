package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.DiagnosticReport;

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

public interface DiagnosticReportService {

    @GET("DiagnosticReport/{id}")
    Call<DiagnosticReport> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DiagnosticReport/{id}/_history/{vid}")
    Call<DiagnosticReport> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("DiagnosticReport/{id}")
    Call<DiagnosticReport> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("DiagnosticReport/{id}")
    Call<DiagnosticReport> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("DiagnosticReport/{id}")
    Call<DiagnosticReport> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DiagnosticReport/{id}/_history")
    Call<DiagnosticReport> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DiagnosticReport/_history")
    Call<DiagnosticReport> history(@QueryMap Map<String, String> parameters);

    @POST("DiagnosticReport")
    Call<DiagnosticReport> create(@Body DiagnosticReport resource, @QueryMap Map<String, String> parameters);

    @GET("DiagnosticReport")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("DiagnosticReport/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}