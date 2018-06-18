package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.DocumentManifest;

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

public interface DocumentManifestService {

    @GET("DocumentManifest/{id}")
    Call<DocumentManifest> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DocumentManifest/{id}/_history/{vid}")
    Call<DocumentManifest> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("DocumentManifest/{id}")
    Call<DocumentManifest> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("DocumentManifest/{id}")
    Call<DocumentManifest> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("DocumentManifest/{id}")
    Call<DocumentManifest> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DocumentManifest/{id}/_history")
    Call<DocumentManifest> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DocumentManifest/_history")
    Call<DocumentManifest> history(@QueryMap Map<String, String> parameters);

    @POST("DocumentManifest")
    Call<DocumentManifest> create(@Body DocumentManifest resource, @QueryMap Map<String, String> parameters);

    @GET("DocumentManifest")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("DocumentManifest/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}