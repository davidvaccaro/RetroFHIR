package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ProcedureRequest;

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

public interface ProcedureRequestService {

    @GET("ProcedureRequest/{id}")
    Call<ProcedureRequest> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ProcedureRequest/{id}/_history/{vid}")
    Call<ProcedureRequest> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ProcedureRequest/{id}")
    Call<ProcedureRequest> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ProcedureRequest/{id}")
    Call<ProcedureRequest> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ProcedureRequest/{id}")
    Call<ProcedureRequest> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ProcedureRequest/{id}/_history")
    Call<ProcedureRequest> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ProcedureRequest/_history")
    Call<ProcedureRequest> history(@QueryMap Map<String, String> parameters);

    @POST("ProcedureRequest")
    Call<ProcedureRequest> create(@Body ProcedureRequest resource, @QueryMap Map<String, String> parameters);

    @GET("ProcedureRequest")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ProcedureRequest/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}