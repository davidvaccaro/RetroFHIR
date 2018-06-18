package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.RelatedPerson;

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

public interface RelatedPersonService {

    @GET("RelatedPerson/{id}")
    Call<RelatedPerson> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("RelatedPerson/{id}/_history/{vid}")
    Call<RelatedPerson> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("RelatedPerson/{id}")
    Call<RelatedPerson> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("RelatedPerson/{id}")
    Call<RelatedPerson> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("RelatedPerson/{id}")
    Call<RelatedPerson> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("RelatedPerson/{id}/_history")
    Call<RelatedPerson> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("RelatedPerson/_history")
    Call<RelatedPerson> history(@QueryMap Map<String, String> parameters);

    @POST("RelatedPerson")
    Call<RelatedPerson> create(@Body RelatedPerson resource, @QueryMap Map<String, String> parameters);

    @GET("RelatedPerson")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("RelatedPerson/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}