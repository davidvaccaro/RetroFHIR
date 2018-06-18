package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Group;

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

public interface GroupService {

    @GET("Group/{id}")
    Call<Group> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Group/{id}/_history/{vid}")
    Call<Group> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Group/{id}")
    Call<Group> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Group/{id}")
    Call<Group> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Group/{id}")
    Call<Group> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Group/{id}/_history")
    Call<Group> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Group/_history")
    Call<Group> history(@QueryMap Map<String, String> parameters);

    @POST("Group")
    Call<Group> create(@Body Group resource, @QueryMap Map<String, String> parameters);

    @GET("Group")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Group/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}