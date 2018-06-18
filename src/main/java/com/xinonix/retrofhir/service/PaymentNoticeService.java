package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.PaymentNotice;

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

public interface PaymentNoticeService {

    @GET("PaymentNotice/{id}")
    Call<PaymentNotice> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("PaymentNotice/{id}/_history/{vid}")
    Call<PaymentNotice> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("PaymentNotice/{id}")
    Call<PaymentNotice> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("PaymentNotice/{id}")
    Call<PaymentNotice> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("PaymentNotice/{id}")
    Call<PaymentNotice> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("PaymentNotice/{id}/_history")
    Call<PaymentNotice> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("PaymentNotice/_history")
    Call<PaymentNotice> history(@QueryMap Map<String, String> parameters);

    @POST("PaymentNotice")
    Call<PaymentNotice> create(@Body PaymentNotice resource, @QueryMap Map<String, String> parameters);

    @GET("PaymentNotice")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("PaymentNotice/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}