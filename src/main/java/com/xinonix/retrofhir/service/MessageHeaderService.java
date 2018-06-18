package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.MessageHeader;

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

public interface MessageHeaderService {

    @GET("MessageHeader/{id}")
    Call<MessageHeader> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("MessageHeader/{id}/_history/{vid}")
    Call<MessageHeader> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("MessageHeader/{id}")
    Call<MessageHeader> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("MessageHeader/{id}")
    Call<MessageHeader> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("MessageHeader/{id}")
    Call<MessageHeader> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("MessageHeader/{id}/_history")
    Call<MessageHeader> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("MessageHeader/_history")
    Call<MessageHeader> history(@QueryMap Map<String, String> parameters);

    @POST("MessageHeader")
    Call<MessageHeader> create(@Body MessageHeader resource, @QueryMap Map<String, String> parameters);

    @GET("MessageHeader")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("MessageHeader/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}