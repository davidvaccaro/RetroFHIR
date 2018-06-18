package com.xinonix.retrofhir.service;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.NutritionOrder;

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

public interface NutritionOrderService {

    @GET("NutritionOrder/{id}")
    Call<NutritionOrder> read(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("NutritionOrder/{id}/_history/{vid}")
    Call<NutritionOrder> vread(@Path("id") String id, @Path("vid") String vid, @QueryMap Map<String, String> parameters);

    @PUT("NutritionOrder/{id}")
    Call<NutritionOrder> update(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @PATCH("NutritionOrder/{id}")
    Call<NutritionOrder> patch(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @DELETE("NutritionOrder/{id}")
    Call<NutritionOrder> delete(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("NutritionOrder/{id}/_history")
    Call<NutritionOrder> history(@Path("id") String id, @QueryMap Map<String, String> parameters);

    @GET("NutritionOrder/_history")
    Call<NutritionOrder> history(@QueryMap Map<String, String> parameters);

    @POST("NutritionOrder")
    Call<NutritionOrder> create(@Body NutritionOrder resource, @QueryMap Map<String, String> parameters);

    @GET("NutritionOrder")
    Call<Bundle> search(@QueryMap Map<String, String> parameters);

    @POST("NutritionOrder/_search")
    Call<Bundle> psearch(@QueryMap Map<String, String> parameters);

}