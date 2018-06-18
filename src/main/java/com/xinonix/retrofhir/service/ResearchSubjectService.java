package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ResearchSubject;

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

public interface ResearchSubjectService {

    @GET("ResearchSubject/{id}")
    Call<ResearchSubject> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ResearchSubject/{id}/_history/{vid}")
    Call<ResearchSubject> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ResearchSubject/{id}")
    Call<ResearchSubject> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ResearchSubject/{id}")
    Call<ResearchSubject> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ResearchSubject/{id}")
    Call<ResearchSubject> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ResearchSubject/{id}/_history")
    Call<ResearchSubject> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ResearchSubject/_history")
    Call<ResearchSubject> history(@QueryMap Map<String, String> parameters);

    @POST("ResearchSubject")
    Call<ResearchSubject> create(@Body ResearchSubject resource, @QueryMap Map<String, String> parameters);

    @GET("ResearchSubject")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ResearchSubject/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}