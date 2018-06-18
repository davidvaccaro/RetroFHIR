package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Account;

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

public interface AccountService {

    @GET("Account/{id}")
    Call<Account> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Account/{id}/_history/{vid}")
    Call<Account> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Account/{id}")
    Call<Account> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Account/{id}")
    Call<Account> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Account/{id}")
    Call<Account> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Account/{id}/_history")
    Call<Account> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Account/_history")
    Call<Account> history(@QueryMap Map<String, String> parameters);

    @POST("Account")
    Call<Account> create(@Body Account resource, @QueryMap Map<String, String> parameters);

    @GET("Account")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Account/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}