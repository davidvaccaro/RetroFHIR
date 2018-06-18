package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Schedule;

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

public interface ScheduleService {

    @GET("Schedule/{id}")
    Call<Schedule> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Schedule/{id}/_history/{vid}")
    Call<Schedule> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Schedule/{id}")
    Call<Schedule> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Schedule/{id}")
    Call<Schedule> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Schedule/{id}")
    Call<Schedule> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Schedule/{id}/_history")
    Call<Schedule> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Schedule/_history")
    Call<Schedule> history(@QueryMap Map<String, String> parameters);

    @POST("Schedule")
    Call<Schedule> create(@Body Schedule resource, @QueryMap Map<String, String> parameters);

    @GET("Schedule")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Schedule/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}