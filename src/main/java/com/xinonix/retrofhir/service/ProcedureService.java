package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Procedure;

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

public interface ProcedureService {

    @GET("Procedure/{id}")
    Call<Procedure> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Procedure/{id}/_history/{vid}")
    Call<Procedure> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Procedure/{id}")
    Call<Procedure> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Procedure/{id}")
    Call<Procedure> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Procedure/{id}")
    Call<Procedure> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Procedure/{id}/_history")
    Call<Procedure> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Procedure/_history")
    Call<Procedure> history(@QueryMap Map<String, String> parameters);

    @POST("Procedure")
    Call<Procedure> create(@Body Procedure resource, @QueryMap Map<String, String> parameters);

    @GET("Procedure")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Procedure/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}