package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.Person;

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

public interface PersonService {

    @GET("Person/{id}")
    Call<Person> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Person/{id}/_history/{vid}")
    Call<Person> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("Person/{id}")
    Call<Person> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("Person/{id}")
    Call<Person> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("Person/{id}")
    Call<Person> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Person/{id}/_history")
    Call<Person> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("Person/_history")
    Call<Person> history(@QueryMap Map<String, String> parameters);

    @POST("Person")
    Call<Person> create(@Body Person resource, @QueryMap Map<String, String> parameters);

    @GET("Person")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("Person/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}