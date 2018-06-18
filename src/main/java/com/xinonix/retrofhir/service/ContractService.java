package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Contract;

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

public interface ContractService {

    @GET("Contract/{id}")
    Call<Contract> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Contract/{id}/_history/{vid}")
    Call<Contract> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Contract/{id}")
    Call<Contract> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Contract/{id}")
    Call<Contract> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Contract/{id}")
    Call<Contract> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Contract/{id}/_history")
    Call<Contract> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Contract/_history")
    Call<Contract> history(@QueryMap Map<String, String> parameters);

    @POST("Contract")
    Call<Contract> create(@Body Contract resource, @QueryMap Map<String, String> parameters);

    @GET("Contract")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Contract/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}