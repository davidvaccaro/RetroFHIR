package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.CommunicationRequest;

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

public interface CommunicationRequestService {

    @GET("CommunicationRequest/{id}")
    Call<CommunicationRequest> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CommunicationRequest/{id}/_history/{vid}")
    Call<CommunicationRequest> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("CommunicationRequest/{id}")
    Call<CommunicationRequest> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("CommunicationRequest/{id}")
    Call<CommunicationRequest> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("CommunicationRequest/{id}")
    Call<CommunicationRequest> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CommunicationRequest/{id}/_history")
    Call<CommunicationRequest> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("CommunicationRequest/_history")
    Call<CommunicationRequest> history(@QueryMap Map<String, String> parameters);

    @POST("CommunicationRequest")
    Call<CommunicationRequest> create(@Body CommunicationRequest resource, @QueryMap Map<String, String> parameters);

    @GET("CommunicationRequest")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("CommunicationRequest/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}