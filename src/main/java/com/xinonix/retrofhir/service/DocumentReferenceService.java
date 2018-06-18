package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.DocumentReference;

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

public interface DocumentReferenceService {

    @GET("DocumentReference/{id}")
    Call<DocumentReference> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DocumentReference/{id}/_history/{vid}")
    Call<DocumentReference> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("DocumentReference/{id}")
    Call<DocumentReference> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("DocumentReference/{id}")
    Call<DocumentReference> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("DocumentReference/{id}")
    Call<DocumentReference> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DocumentReference/{id}/_history")
    Call<DocumentReference> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DocumentReference/_history")
    Call<DocumentReference> history(@QueryMap Map<String, String> parameters);

    @POST("DocumentReference")
    Call<DocumentReference> create(@Body DocumentReference reference, @QueryMap Map<String, String> parameters);

    @GET("DocumentReference")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("DocumentReference/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}
