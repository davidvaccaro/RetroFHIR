package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.RequestGroup;

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

public interface RequestGroupService {

    @GET("RequestGroup/{id}")
    Call<RequestGroup> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("RequestGroup/{id}/_history/{vid}")
    Call<RequestGroup> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("RequestGroup/{id}")
    Call<RequestGroup> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("RequestGroup/{id}")
    Call<RequestGroup> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("RequestGroup/{id}")
    Call<RequestGroup> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("RequestGroup/{id}/_history")
    Call<RequestGroup> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("RequestGroup/_history")
    Call<RequestGroup> history(@QueryMap Map<String, String> parameters);

    @POST("RequestGroup")
    Call<RequestGroup> create(@Body RequestGroup resource, @QueryMap Map<String, String> parameters);

    @GET("RequestGroup")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("RequestGroup/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}