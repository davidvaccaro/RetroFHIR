package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Binary;

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

public interface BinaryService {

    @GET("Binary/{id}")
    Call<Binary> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Binary/{id}/_history/{vid}")
    Call<Binary> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Binary/{id}")
    Call<Binary> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Binary/{id}")
    Call<Binary> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Binary/{id}")
    Call<Binary> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Binary/{id}/_history")
    Call<Binary> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Binary/_history")
    Call<Binary> history(@QueryMap Map<String, String> parameters);

    @POST("Binary")
    Call<Binary> create(@Body Binary resource, @QueryMap Map<String, String> parameters);

    @GET("Binary")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Binary/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}