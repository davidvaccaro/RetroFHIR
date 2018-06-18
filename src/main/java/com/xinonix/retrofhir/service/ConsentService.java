package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Consent;

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

public interface ConsentService {

    @GET("Consent/{id}")
    Call<Consent> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Consent/{id}/_history/{vid}")
    Call<Consent> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Consent/{id}")
    Call<Consent> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Consent/{id}")
    Call<Consent> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Consent/{id}")
    Call<Consent> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Consent/{id}/_history")
    Call<Consent> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Consent/_history")
    Call<Consent> history(@QueryMap Map<String, String> parameters);

    @POST("Consent")
    Call<Consent> create(@Body Consent resource, @QueryMap Map<String, String> parameters);

    @GET("Consent")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Consent/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}