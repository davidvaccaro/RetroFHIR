package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.ImagingStudy;

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

public interface ImagingStudyService {

    @GET("ImagingStudy/{id}")
    Call<ImagingStudy> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ImagingStudy/{id}/_history/{vid}")
    Call<ImagingStudy> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("ImagingStudy/{id}")
    Call<ImagingStudy> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("ImagingStudy/{id}")
    Call<ImagingStudy> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("ImagingStudy/{id}")
    Call<ImagingStudy> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ImagingStudy/{id}/_history")
    Call<ImagingStudy> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("ImagingStudy/_history")
    Call<ImagingStudy> history(@QueryMap Map<String, String> parameters);

    @POST("ImagingStudy")
    Call<ImagingStudy> create(@Body ImagingStudy reference, @QueryMap Map<String, String> parameters);

    @GET("ImagingStudy")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("ImagingStudy/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}