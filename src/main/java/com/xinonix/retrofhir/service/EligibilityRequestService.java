package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.EligibilityRequest;

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

public interface EligibilityRequestService {

    @GET("EligibilityRequest/{id}")
    Call<EligibilityRequest> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("EligibilityRequest/{id}/_history/{vid}")
    Call<EligibilityRequest> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("EligibilityRequest/{id}")
    Call<EligibilityRequest> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("EligibilityRequest/{id}")
    Call<EligibilityRequest> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("EligibilityRequest/{id}")
    Call<EligibilityRequest> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("EligibilityRequest/{id}/_history")
    Call<EligibilityRequest> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("EligibilityRequest/_history")
    Call<EligibilityRequest> history(@QueryMap Map<String, String> parameters);

    @POST("EligibilityRequest")
    Call<EligibilityRequest> create(@Body EligibilityRequest resource, @QueryMap Map<String, String> parameters);

    @GET("EligibilityRequest")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("EligibilityRequest/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}