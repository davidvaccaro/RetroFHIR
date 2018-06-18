package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.SearchParameter;

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

public interface SearchParameterService {

    @GET("SearchParameter/{id}")
    Call<SearchParameter> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("SearchParameter/{id}/_history/{vid}")
    Call<SearchParameter> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("SearchParameter/{id}")
    Call<SearchParameter> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("SearchParameter/{id}")
    Call<SearchParameter> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("SearchParameter/{id}")
    Call<SearchParameter> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("SearchParameter/{id}/_history")
    Call<SearchParameter> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("SearchParameter/_history")
    Call<SearchParameter> history(@QueryMap Map<String, String> parameters);

    @POST("SearchParameter")
    Call<SearchParameter> create(@Body SearchParameter resource, @QueryMap Map<String, String> parameters);

    @GET("SearchParameter")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("SearchParameter/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}