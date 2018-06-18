package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ImagingManifest;

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

public interface ImagingManifestService {

    @GET("ImagingManifest/{id}")
    Call<ImagingManifest> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ImagingManifest/{id}/_history/{vid}")
    Call<ImagingManifest> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ImagingManifest/{id}")
    Call<ImagingManifest> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ImagingManifest/{id}")
    Call<ImagingManifest> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ImagingManifest/{id}")
    Call<ImagingManifest> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ImagingManifest/{id}/_history")
    Call<ImagingManifest> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ImagingManifest/_history")
    Call<ImagingManifest> history(@QueryMap Map<String, String> parameters);

    @POST("ImagingManifest")
    Call<ImagingManifest> create(@Body ImagingManifest resource, @QueryMap Map<String, String> parameters);

    @GET("ImagingManifest")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ImagingManifest/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}