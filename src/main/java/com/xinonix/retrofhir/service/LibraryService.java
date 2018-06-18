package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Library;

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

public interface LibraryService {

    @GET("Library/{id}")
    Call<Library> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Library/{id}/_history/{vid}")
    Call<Library> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Library/{id}")
    Call<Library> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Library/{id}")
    Call<Library> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Library/{id}")
    Call<Library> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Library/{id}/_history")
    Call<Library> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Library/_history")
    Call<Library> history(@QueryMap Map<String, String> parameters);

    @POST("Library")
    Call<Library> create(@Body Library resource, @QueryMap Map<String, String> parameters);

    @GET("Library")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Library/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}