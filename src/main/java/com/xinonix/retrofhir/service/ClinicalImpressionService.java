package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ClinicalImpression;

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

public interface ClinicalImpressionService {

    @GET("ClinicalImpression/{id}")
    Call<ClinicalImpression> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ClinicalImpression/{id}/_history/{vid}")
    Call<ClinicalImpression> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ClinicalImpression/{id}")
    Call<ClinicalImpression> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ClinicalImpression/{id}")
    Call<ClinicalImpression> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ClinicalImpression/{id}")
    Call<ClinicalImpression> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ClinicalImpression/{id}/_history")
    Call<ClinicalImpression> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ClinicalImpression/_history")
    Call<ClinicalImpression> history(@QueryMap Map<String, String> parameters);

    @POST("ClinicalImpression")
    Call<ClinicalImpression> create(@Body ClinicalImpression resource, @QueryMap Map<String, String> parameters);

    @GET("ClinicalImpression")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ClinicalImpression/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}