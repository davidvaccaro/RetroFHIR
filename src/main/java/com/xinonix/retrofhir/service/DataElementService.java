package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.DataElement;

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

public interface DataElementService {

    @GET("DataElement/{id}")
    Call<DataElement> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DataElement/{id}/_history/{vid}")
    Call<DataElement> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("DataElement/{id}")
    Call<DataElement> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("DataElement/{id}")
    Call<DataElement> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("DataElement/{id}")
    Call<DataElement> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DataElement/{id}/_history")
    Call<DataElement> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("DataElement/_history")
    Call<DataElement> history(@QueryMap Map<String, String> parameters);

    @POST("DataElement")
    Call<DataElement> create(@Body DataElement resource, @QueryMap Map<String, String> parameters);

    @GET("DataElement")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("DataElement/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}