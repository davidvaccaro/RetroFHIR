package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ConceptMap;

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

public interface ConceptMapService {

    @GET("ConceptMap/{id}")
    Call<ConceptMap> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ConceptMap/{id}/_history/{vid}")
    Call<ConceptMap> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ConceptMap/{id}")
    Call<ConceptMap> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ConceptMap/{id}")
    Call<ConceptMap> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ConceptMap/{id}")
    Call<ConceptMap> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ConceptMap/{id}/_history")
    Call<ConceptMap> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ConceptMap/_history")
    Call<ConceptMap> history(@QueryMap Map<String, String> parameters);

    @POST("ConceptMap")
    Call<ConceptMap> create(@Body ConceptMap resource, @QueryMap Map<String, String> parameters);

    @GET("ConceptMap")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ConceptMap/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}