package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.FamilyMemberHistory;

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

public interface FamilyMemberHistoryService {

    @GET("FamilyMemberHistory/{id}")
    Call<FamilyMemberHistory> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("FamilyMemberHistory/{id}/_history/{vid}")
    Call<FamilyMemberHistory> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("FamilyMemberHistory/{id}")
    Call<FamilyMemberHistory> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("FamilyMemberHistory/{id}")
    Call<FamilyMemberHistory> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("FamilyMemberHistory/{id}")
    Call<FamilyMemberHistory> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("FamilyMemberHistory/{id}/_history")
    Call<FamilyMemberHistory> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("FamilyMemberHistory/_history")
    Call<FamilyMemberHistory> history(@QueryMap Map<String, String> parameters);

    @POST("FamilyMemberHistory")
    Call<FamilyMemberHistory> create(@Body FamilyMemberHistory resource, @QueryMap Map<String, String> parameters);

    @GET("FamilyMemberHistory")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("FamilyMemberHistory/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}