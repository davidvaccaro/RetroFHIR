package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.PaymentReconciliation;

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

public interface PaymentReconciliationService {

    @GET("PaymentReconciliation/{id}")
    Call<PaymentReconciliation> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("PaymentReconciliation/{id}/_history/{vid}")
    Call<PaymentReconciliation> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("PaymentReconciliation/{id}")
    Call<PaymentReconciliation> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("PaymentReconciliation/{id}")
    Call<PaymentReconciliation> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("PaymentReconciliation/{id}")
    Call<PaymentReconciliation> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("PaymentReconciliation/{id}/_history")
    Call<PaymentReconciliation> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("PaymentReconciliation/_history")
    Call<PaymentReconciliation> history(@QueryMap Map<String, String> parameters);

    @POST("PaymentReconciliation")
    Call<PaymentReconciliation> create(@Body PaymentReconciliation resource, @QueryMap Map<String, String> parameters);

    @GET("PaymentReconciliation")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("PaymentReconciliation/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}