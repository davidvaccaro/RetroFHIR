package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Task;

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

public interface TaskService {

    @GET("Task/{id}")
    Call<Task> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Task/{id}/_history/{vid}")
    Call<Task> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Task/{id}")
    Call<Task> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Task/{id}")
    Call<Task> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Task/{id}")
    Call<Task> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Task/{id}/_history")
    Call<Task> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Task/_history")
    Call<Task> history(@QueryMap Map<String, String> parameters);

    @POST("Task")
    Call<Task> create(@Body Task resource, @QueryMap Map<String, String> parameters);

    @GET("Task")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Task/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}