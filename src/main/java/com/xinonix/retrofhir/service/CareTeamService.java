package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.CareTeam;

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

public interface CareTeamService {

    @GET("CareTeam/{id}")
    Call<CareTeam> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CareTeam/{id}/_history/{vid}")
    Call<CareTeam> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("CareTeam/{id}")
    Call<CareTeam> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("CareTeam/{id}")
    Call<CareTeam> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("CareTeam/{id}")
    Call<CareTeam> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CareTeam/{id}/_history")
    Call<CareTeam> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CareTeam/_history")
    Call<CareTeam> history(@QueryMap Map<String, String> parameters);

    @POST("CareTeam")
    Call<CareTeam> create(@Body CareTeam resource, @QueryMap Map<String, String> parameters);

    @GET("CareTeam")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("CareTeam/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}