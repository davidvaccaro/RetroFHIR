package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.MeasureReport;

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

public interface MeasureReportService {

    @GET("MeasureReport/{id}")
    Call<MeasureReport> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("MeasureReport/{id}/_history/{vid}")
    Call<MeasureReport> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("MeasureReport/{id}")
    Call<MeasureReport> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("MeasureReport/{id}")
    Call<MeasureReport> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("MeasureReport/{id}")
    Call<MeasureReport> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("MeasureReport/{id}/_history")
    Call<MeasureReport> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("MeasureReport/_history")
    Call<MeasureReport> history(@QueryMap Map<String, String> parameters);

    @POST("MeasureReport")
    Call<MeasureReport> create(@Body MeasureReport resource, @QueryMap Map<String, String> parameters);

    @GET("MeasureReport")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("MeasureReport/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}