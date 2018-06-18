package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.BodySite;

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

public interface BodySiteService {

    @GET("BodySite/{id}")
    Call<BodySite> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("BodySite/{id}/_history/{vid}")
    Call<BodySite> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("BodySite/{id}")
    Call<BodySite> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("BodySite/{id}")
    Call<BodySite> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("BodySite/{id}")
    Call<BodySite> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("BodySite/{id}/_history")
    Call<BodySite> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("BodySite/_history")
    Call<BodySite> history(@QueryMap Map<String, String> parameters);

    @POST("BodySite")
    Call<BodySite> create(@Body BodySite resource, @QueryMap Map<String, String> parameters);

    @GET("BodySite")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("BodySite/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}