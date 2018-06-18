package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.PractitionerRole;

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

public interface PractitionerRoleService {

    @GET("PractitionerRole/{id}")
    Call<PractitionerRole> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("PractitionerRole/{id}/_history/{vid}")
    Call<PractitionerRole> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("PractitionerRole/{id}")
    Call<PractitionerRole> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("PractitionerRole/{id}")
    Call<PractitionerRole> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("PractitionerRole/{id}")
    Call<PractitionerRole> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("PractitionerRole/{id}/_history")
    Call<PractitionerRole> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("PractitionerRole/_history")
    Call<PractitionerRole> history(@QueryMap Map<String, String> parameters);

    @POST("PractitionerRole")
    Call<PractitionerRole> create(@Body PractitionerRole resource, @QueryMap Map<String, String> parameters);

    @GET("PractitionerRole")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("PractitionerRole/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}