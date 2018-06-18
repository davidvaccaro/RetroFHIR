package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ResearchStudy;

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

public interface ResearchStudyService {

    @GET("ResearchStudy/{id}")
    Call<ResearchStudy> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ResearchStudy/{id}/_history/{vid}")
    Call<ResearchStudy> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ResearchStudy/{id}")
    Call<ResearchStudy> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ResearchStudy/{id}")
    Call<ResearchStudy> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ResearchStudy/{id}")
    Call<ResearchStudy> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ResearchStudy/{id}/_history")
    Call<ResearchStudy> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ResearchStudy/_history")
    Call<ResearchStudy> history(@QueryMap Map<String, String> parameters);

    @POST("ResearchStudy")
    Call<ResearchStudy> create(@Body ResearchStudy resource, @QueryMap Map<String, String> parameters);

    @GET("ResearchStudy")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ResearchStudy/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}