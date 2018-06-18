package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ReferralRequest;

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

public interface ReferralRequestService {

    @GET("ReferralRequest/{id}")
    Call<ReferralRequest> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ReferralRequest/{id}/_history/{vid}")
    Call<ReferralRequest> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ReferralRequest/{id}")
    Call<ReferralRequest> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ReferralRequest/{id}")
    Call<ReferralRequest> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ReferralRequest/{id}")
    Call<ReferralRequest> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ReferralRequest/{id}/_history")
    Call<ReferralRequest> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ReferralRequest/_history")
    Call<ReferralRequest> history(@QueryMap Map<String, String> parameters);

    @POST("ReferralRequest")
    Call<ReferralRequest> create(@Body ReferralRequest resource, @QueryMap Map<String, String> parameters);

    @GET("ReferralRequest")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ReferralRequest/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}