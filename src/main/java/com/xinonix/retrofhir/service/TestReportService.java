package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.TestReport;

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

public interface TestReportService {

    @GET("TestReport/{id}")
    Call<TestReport> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("TestReport/{id}/_history/{vid}")
    Call<TestReport> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("TestReport/{id}")
    Call<TestReport> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("TestReport/{id}")
    Call<TestReport> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("TestReport/{id}")
    Call<TestReport> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("TestReport/{id}/_history")
    Call<TestReport> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("TestReport/_history")
    Call<TestReport> history(@QueryMap Map<String, String> parameters);

    @POST("TestReport")
    Call<TestReport> create(@Body TestReport resource, @QueryMap Map<String, String> parameters);

    @GET("TestReport")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("TestReport/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}