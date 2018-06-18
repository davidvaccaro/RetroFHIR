package com.xinonix.retrofhir.interactor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.xinonix.retrofhir.Constants;
import com.xinonix.retrofhir.Interactions;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Summary;
import com.xinonix.retrofhir.serialization.ResourceDeserializer;

import com.xinonix.hl7.fhir.stu3.Bundle;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Coding;
import com.xinonix.hl7.fhir.stu3.ContactPoint;
import com.xinonix.hl7.fhir.stu3.GroupCharacteristic;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.LocationPosition;
import com.xinonix.hl7.fhir.stu3.Quantity;
import com.xinonix.hl7.fhir.stu3.Resource;

import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ResourceInteractor<T, R> {

    private T service;
    private Class<R> resourceClass;
    private Map<String, String> parameters = new HashMap<String, String>();
    private List<R> resources = new ArrayList<R>();

    protected String selectPathValue(String name, HashMap<String, String> parms)
    {

        // Check the state
        if (!parms.containsKey(name))
            return null;

        // Get the value
        String val = parms.get(name);

        // Remove the value from the map
        parms.remove(name);

        // Return the path value
        return val;

    }

    public ResourceInteractor callByParameters(String interaction, Callback<Bundle> callback)
    {
        try {

            // Get the "interaction" method
            Method method = this.service.getClass().getMethod(interaction, Map.class);

            // Invoke the "interaction" method
            Call<Bundle> result = (Call<Bundle>)method.invoke(this.service, this.parameters);

            // Return the bundle
            result.enqueue(callback);

        }
        catch (Exception e)
        {
            // Handle general failure
            callback.onFailure(null, e);
        }

        return this;
    }

    protected ResourceInteractor callById(String interaction, Callback<R> callback)
    {
        try {

            // Clone the params
            HashMap<String, String> parms = new HashMap<String, String>(this.parameters);

            // Establish the id
            String id = selectPathValue(Parameters.ID, parms);

            // Get the "interaction" method
            Method method = this.service.getClass().getMethod(interaction, String.class, Map.class);

            // Invoke the "interaction" method
            Call<R> result = (Call<R>)method.invoke(this.service, id, parms);

            // Return the bundle
            result.enqueue(callback);

        }
        catch (Exception e)
        {
            // Handle general failure
            callback.onFailure(null, e);
        }

        return this;
    }

    public ResourceInteractor()
    {
    }

    public ResourceInteractor(T service, Class<R> resourceClass, Map<String, String> parameters, List<R> resources)
    {
        this.service = service;
        this.resourceClass = resourceClass;
        this.parameters = parameters;
        this.resources = resources;
    }

    public T getService()
    {
        return service;
    }

    public void setService(T service)
    {
        this.service = service;
    }

    public ResourceInteractor read(Callback<R> callback)
    {
        return callById(Interactions.READ, callback);
    }

    public ResourceInteractor vread(Callback<R> callback)
    {
        try {

            // Clone the params
            HashMap<String, String> parms = new HashMap<String, String>(this.parameters);

            // Establish the id
            String id = selectPathValue(Parameters.ID, parms);

            // Establish the vid
            String vid = selectPathValue(Parameters.VID, parms);

            // Get the "vread" method
            Method method = this.service.getClass().getMethod(Interactions.VREAD, String.class, String.class, Map.class);

            // Invoke the "vread" method
            Call<R> result = (Call<R>)method.invoke(this.service, id, parms);

            // Return the bundle
            result.enqueue(callback);

        }
        catch (Exception e)
        {
            // Handle general failure
            callback.onFailure(null, e);
        }

        return this;
    }

    public ResourceInteractor update(Callback<R> callback)
    {
        return callById(Interactions.UPDATE, callback);
    }

    public ResourceInteractor patch(Callback<R> callback)
    {
        return callById(Interactions.PATCH, callback);
    }

    public ResourceInteractor delete(Callback<R> callback)
    {
        return callById(Interactions.DELETE, callback);
    }

    public ResourceInteractor history(Callback<R> callback)
    {
        try {

            // Clone the params
            HashMap<String, String> parms = new HashMap<String, String>(this.parameters);

            // Establish the id
            String id = selectPathValue(Parameters.ID, parms);

            Call<R> result = null;

            // Handle the "history" of an identified resource versus general history of that resource-type
            if (id != null)
            {

                // Get the "history" method
                Method method = this.service.getClass().getMethod(Interactions.HISTORY, String.class, Map.class);

                // Invoke the "history" method
                result = (Call<R>)method.invoke(this.service, id, parms);

            }
            else
            {

                // Get the "history" method
                Method method = this.service.getClass().getMethod(Interactions.HISTORY, Map.class);

                // Invoke the "history" method
                result = (Call<R>)method.invoke(this.service, parms);

            }

            // Return the bundle
            result.enqueue(callback);

        }
        catch (Exception e)
        {
            // Handle general failure
            callback.onFailure(null, e);
        }

        return this;
    }

    public ResourceInteractor create(Callback<R> callback)
    {
        try {

            // Establish the resource
            R resource = resources.get(0);

            // Get the "create" method
            Method method = this.service.getClass().getMethod(Interactions.CREATE, this.resourceClass, Map.class);

            // Invoke the "create" method
            Call<R> result = (Call<R>)method.invoke(this.service, resource, this.parameters);

            // Return the bundle
            result.enqueue(callback);

        }
        catch (Exception e)
        {
            // Handle general failure
            callback.onFailure(null, e);
        }

        return this;
    }

    public ResourceInteractor search(Callback<Bundle> callback)
    {
        return callByParameters(Interactions.SEARCH, callback);
    }

    public ResourceInteractor psearch(Callback<Bundle> callback)
    {
        return callByParameters(Interactions.PSEARCH, callback);
    }

    public static class Composer<T, R, C extends Composer<T, R, C>> {

        private Class<T> serviceClass;
        private Class<R> resourceClass;
        private Retrofit.Builder retrofitBuilder = null;
        private Map<String, String> parameters = new HashMap<String, String>();
        private List<R> resources = new ArrayList<R>();

        protected String getEnumValueName(Enum value)
        {

            // Assume we are using the simple enum-value-name
            String name = value.name().toLowerCase();

            try {
                name = value.getClass().getField(value.toString()).getAnnotation(SerializedName.class).value().toString();
            }
            catch (Exception e)
            {
            }
            return name;
        }

        public Composer(final Class<T> serviceClass, final Class<R> resourceClass)
        {
            this.serviceClass = serviceClass;
            this.resourceClass = resourceClass;
        }

        public Retrofit.Builder builder()
        {

            // Create the builder (if needed)
            if (retrofitBuilder == null)
            {

                HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
                loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

                // Create and add the JSON query parameter intercepter
                OkHttpClient client = new OkHttpClient.Builder()
                        .addInterceptor(new Interceptor() {
                            @Override
                            public Response intercept(Chain chain) throws IOException {
                                Request request = chain.request();
                                HttpUrl url = request.url().newBuilder().addQueryParameter("_format", "json").build();
                                request = request.newBuilder().url(url).build();
                                return chain.proceed(request);
                            }
                        })
                        .addInterceptor(loggingInterceptor)
                        .build();

                // Create the Gson instance
                Gson gson = new GsonBuilder()
                        .registerTypeAdapter(Resource.class, new ResourceDeserializer())
                        .create();

                // Set the client
                retrofitBuilder = new Retrofit.Builder()
                        .client(client).addConverterFactory(GsonConverterFactory.create(gson));

            }

            return retrofitBuilder;

        }

        public C builder(Retrofit.Builder builder)
        {
            retrofitBuilder = builder;
            return (C)this;
        }

        public C baseUrl(String url)
        {
            builder().baseUrl(url);
            return (C)this;
        }

        public C setParameter(String name, Modifier modifier, Prefix prefix, String value)
        {

            // Formulate the name
            String parameterName = name + ((modifier == Modifier.NONE) ? "" : (":" + getEnumValueName(modifier)));

            // Formulate the value
            String parameterValue = ((prefix == Prefix.NONE) ? "" : getEnumValueName(prefix) + ":" ) + value;

            // Populate the parameter
            parameters.put(parameterName, parameterValue);

            return (C)this;
        }

        public C setParameter(String name, Modifier modifier, String value)
        {
            return setParameter(name, modifier, Prefix.NONE, value);
        }

        public C setParameter(String name, Prefix prefix, String value)
        {
            return setParameter(name, Modifier.NONE, prefix, value);
        }

        public C setParameter(String name, String value)
        {
            return setParameter(name, Modifier.NONE, Prefix.NONE, value);
        }

        public C setParameter(String name, Modifier modifier, Prefix prefix, Enum value)
        {
            return setParameter(name, modifier, prefix, getEnumValueName(value));
        }

        public C setParameter(String name, Modifier modifier, Enum value)
        {
            return setParameter(name, modifier, getEnumValueName(value));
        }

        public C setParameter(String name, Prefix prefix, Enum value)
        {
            return setParameter(name, prefix, getEnumValueName(value));
        }

        public C setParameter(String name, Enum value)
        {
            return setParameter(name, getEnumValueName(value));
        }

        public C setParameter(String name, Modifier modifier, Prefix prefix, Identifier value)
        {

            // Formulate the name
            String parameterName = name + ((modifier == Modifier.NONE) ? "" : (":" + getEnumValueName(modifier)));

            // Formulate the value
            String parameterValue = ((prefix == Prefix.NONE) ? "" : getEnumValueName(prefix) + ":" ) + value.getId();

            // Populate the parameter
            parameters.put(parameterName, parameterValue);

            return (C)this;
        }

        public C setParameter(String name, Modifier modifier, Identifier value)
        {
            return setParameter(name, modifier, Prefix.NONE, value);
        }

        public C setParameter(String name, Prefix prefix, Identifier value)
        {
            return setParameter(name, Modifier.NONE, prefix, value);
        }

        public C setParameter(String name, Identifier value)
        {
            return setParameter(name, Modifier.NONE, Prefix.NONE, value);
        }

        public C setParameter(String name, Modifier modifier, Prefix prefix, Coding value)
        {

            // Formulate the name
            String parameterName = name + ((modifier == Modifier.NONE) ? "" : (":" + getEnumValueName(modifier)));

            // Formulate the value
            String parameterValue = ((prefix == Prefix.NONE) ? "" : getEnumValueName(prefix) + ":" ) + value.getCode();

            // Populate the parameter
            parameters.put(parameterName, parameterValue);

            return (C)this;
        }

        public C setParameter(String name, Modifier modifier, Coding value)
        {
            return setParameter(name, modifier, Prefix.NONE, value);
        }

        public C setParameter(String name, Prefix prefix, Coding value)
        {
            return setParameter(name, Modifier.NONE, prefix, value);
        }

        public C setParameter(String name, Coding value)
        {
            return setParameter(name, Modifier.NONE, Prefix.NONE, value);
        }

        public C setParameter(String name, Modifier modifier, Prefix prefix, CodeableConcept value)
        {

            // Formulate the name
            String parameterName = name + ((modifier == Modifier.NONE) ? "" : (":" + getEnumValueName(modifier)));

            // Formulate the value
            String parameterValue = ((prefix == Prefix.NONE) ? "" : getEnumValueName(prefix) + ":" ) + value.getId();

            // Populate the parameter
            parameters.put(parameterName, parameterValue);

            return (C)this;
        }

        public C setParameter(String name, Modifier modifier, CodeableConcept value)
        {
            return setParameter(name, modifier, Prefix.NONE, value);
        }

        public C setParameter(String name, Prefix prefix, CodeableConcept value)
        {
            return setParameter(name, Modifier.NONE, prefix, value);
        }

        public C setParameter(String name, CodeableConcept value)
        {
            return setParameter(name, Modifier.NONE, Prefix.NONE, value);
        }

        public C setParameter(String name, Modifier modifier, Prefix prefix, Date value, DateFormat formatter)
        {

            // Formulate the name
            String parameterName = name + ((modifier == Modifier.NONE) ? "" : (":" + getEnumValueName(modifier)));

            // Formulate the value
            String parameterValue = ((prefix == Prefix.NONE) ? "" : getEnumValueName(prefix) + ":" ) + formatter.format(value);

            // Populate the parameter
            parameters.put(parameterName, parameterValue);

            return (C)this;
        }

        public C setParameter(String name, Modifier modifier, Prefix prefix, Date value)
        {
            return setParameter(name, modifier, Prefix.NONE, value, Constants.FORMATTER_DATE_TIME);
        }

        public C setParameter(String name, Modifier modifier, Date value)
        {
            return setParameter(name, modifier, Prefix.NONE, value);
        }

        public C setParameter(String name, Prefix prefix, Date value)
        {
            return setParameter(name, Modifier.NONE, prefix, value);
        }

        public C setParameter(String name, Date value)
        {
            return setParameter(name, Modifier.NONE, Prefix.NONE, value);
        }

        public C setParameter(String name, Modifier modifier, Prefix prefix, Quantity value)
        {

            // Formulate the name
            String parameterName = name + ((modifier == Modifier.NONE) ? "" : (":" + getEnumValueName(modifier)));

            // Formulate the value
            String parameterValue = ((prefix == Prefix.NONE) ? "" : getEnumValueName(prefix) + ":" ) + value.getValue();

            // Populate the parameter
            parameters.put(parameterName, parameterValue);

            return (C)this;
        }

        public C setParameter(String name, Modifier modifier, Quantity value)
        {
            return setParameter(name, modifier, Prefix.NONE, value);
        }

        public C setParameter(String name, Prefix prefix, Quantity value)
        {
            return setParameter(name, Modifier.NONE, prefix, value);
        }

        public C setParameter(String name, Quantity value)
        {
            return setParameter(name, Modifier.NONE, Prefix.NONE, value);
        }

        public C setParameter(String name, Modifier modifier, Prefix prefix, Double value)
        {

            // Formulate the name
            String parameterName = name + ((modifier == Modifier.NONE) ? "" : (":" + getEnumValueName(modifier)));

            // Formulate the value
            String parameterValue = ((prefix == Prefix.NONE) ? "" : getEnumValueName(prefix) + ":" ) + value;

            // Populate the parameter
            parameters.put(parameterName, parameterValue);

            return (C)this;
        }

        public C setParameter(String name, Modifier modifier, Double value)
        {
            return setParameter(name, modifier, Prefix.NONE, value);
        }

        public C setParameter(String name, Prefix prefix, Double value)
        {
            return setParameter(name, Modifier.NONE, prefix, value);
        }

        public C setParameter(String name, Double value)
        {
            return setParameter(name, Modifier.NONE, Prefix.NONE, value);
        }

        public C setParameter(String name, Modifier modifier, Prefix prefix, Boolean value)
        {

            // Formulate the name
            String parameterName = name + ((modifier == Modifier.NONE) ? "" : (":" + getEnumValueName(modifier)));

            // Formulate the value
            String parameterValue = ((prefix == Prefix.NONE) ? "" : getEnumValueName(prefix) + ":" ) + value;

            // Populate the parameter
            parameters.put(parameterName, parameterValue);

            return (C)this;
        }

        public C setParameter(String name, Modifier modifier, Boolean value)
        {
            return setParameter(name, modifier, Prefix.NONE, value);
        }

        public C setParameter(String name, Prefix prefix, Boolean value)
        {
            return setParameter(name, Modifier.NONE, prefix, value);
        }

        public C setParameter(String name, Boolean value)
        {
            return setParameter(name, Modifier.NONE, Prefix.NONE, value);
        }

        public C setParameter(String name, Modifier modifier, Prefix prefix, GroupCharacteristic value)
        {

            // Formulate the name
            String parameterName = name + ((modifier == Modifier.NONE) ? "" : (":" + getEnumValueName(modifier)));

            // Formulate the value
            String parameterValue = ((prefix == Prefix.NONE) ? "" : getEnumValueName(prefix) + ":" ) + value.getValueCodeableConcept().getId();

            // Populate the parameter
            parameters.put(parameterName, parameterValue);

            return (C)this;
        }

        public C setParameter(String name, Modifier modifier, GroupCharacteristic value)
        {
            return setParameter(name, modifier, Prefix.NONE, value);
        }

        public C setParameter(String name, Prefix prefix, GroupCharacteristic value)
        {
            return setParameter(name, Modifier.NONE, prefix, value);
        }

        public C setParameter(String name, GroupCharacteristic value)
        {
            return setParameter(name, Modifier.NONE, Prefix.NONE, value);
        }

        public C setParameter(String name, Modifier modifier, Prefix prefix, LocationPosition value)
        {

            // Formulate the name
            String parameterName = name + ((modifier == Modifier.NONE) ? "" : (":" + getEnumValueName(modifier)));

            // Formulate the value
            String parameterValue = ((prefix == Prefix.NONE) ? "" : getEnumValueName(prefix) + ":" ) + (value.getLatitude() + ":" + value.getLongitude());

            // Populate the parameter
            parameters.put(parameterName, parameterValue);

            return (C)this;
        }

        public C setParameter(String name, Modifier modifier, LocationPosition value)
        {
            return setParameter(name, modifier, Prefix.NONE, value);
        }

        public C setParameter(String name, Prefix prefix, LocationPosition value)
        {
            return setParameter(name, Modifier.NONE, prefix, value);
        }

        public C setParameter(String name, LocationPosition value)
        {
            return setParameter(name, Modifier.NONE, Prefix.NONE, value);
        }

        public C setParameter(String name, Modifier modifier, Prefix prefix, ContactPoint value)
        {

            // Formulate the name
            String parameterName = name + ((modifier == Modifier.NONE) ? "" : (":" + getEnumValueName(modifier)));

            // Formulate the value
            String parameterValue = ((prefix == Prefix.NONE) ? "" : getEnumValueName(prefix) + ":" ) + value.getValue();

            // Populate the parameter
            parameters.put(parameterName, parameterValue);

            return (C)this;
        }

        public C setParameter(String name, Modifier modifier, ContactPoint value)
        {
            return setParameter(name, modifier, Prefix.NONE, value);
        }

        public C setParameter(String name, Prefix prefix, ContactPoint value)
        {
            return setParameter(name, Modifier.NONE, prefix, value);
        }

        public C setParameter(String name, ContactPoint value)
        {
            return setParameter(name, Modifier.NONE, Prefix.NONE, value);
        }

        public C setContent(Modifier modifier, Prefix prefix, String content)
        {
            return setParameter(Parameters.CONTENT, modifier, prefix, content);
        }

        public C setContent(Modifier modifier, String content)
        {
            return setParameter(Parameters.CONTENT, modifier, content);
        }

        public C setContent(Prefix prefix, String content)
        {
            return setParameter(Parameters.CONTENT, prefix, content);
        }

        public C setContent(String content)
        {
            return setParameter(Parameters.CONTENT, content);
        }

        public C setId(Modifier modifier, Prefix prefix, String id)
        {
            return setParameter(Parameters.ID, modifier, prefix, id);
        }

        public C setId(Modifier modifier, String id)
        {
            return setParameter(Parameters.ID, modifier, id);
        }

        public C setId(Prefix prefix, String id)
        {
            return setParameter(Parameters.ID, prefix, id);
        }

        public C setId(String id)
        {
            return setParameter(Parameters.ID, id);
        }

        public C setId(Modifier modifier, Prefix prefix, Identifier id)
        {
            return setParameter(Parameters.ID, modifier, prefix, id.getValue());
        }

        public C setId(Modifier modifier, Identifier id)
        {
            return setParameter(Parameters.ID, modifier, id.getValue());
        }

        public C setId(Prefix prefix, Identifier id)
        {
            return setParameter(Parameters.ID, prefix, id.getValue());
        }

        public C setId(Identifier id)
        {
            return setParameter(Parameters.ID, id.getValue());
        }

        public C setLastUpdated(Modifier modifier, Prefix prefix, Date date, SimpleDateFormat formatter)
        {
            return setParameter(Parameters.LAST_UPDATED, modifier, prefix, formatter.format(date));
        }

        public C setLastUpdated(Modifier modifier, Date date, SimpleDateFormat formatter)
        {
            return setParameter(Parameters.LAST_UPDATED, modifier, formatter.format(date));
        }

        public C setLastUpdated(Prefix prefix, Date date, SimpleDateFormat formatter)
        {
            return setParameter(Parameters.LAST_UPDATED, prefix, formatter.format(date));
        }

        public C setLastUpdated(Date date, SimpleDateFormat formatter)
        {
            return setParameter(Parameters.LAST_UPDATED, formatter.format(date));
        }

        public C setLastUpdated(Modifier modifier, Prefix prefix, Date date)
        {
            return setLastUpdated(modifier, prefix, date, Constants.FORMATTER_DATE_TIME);
        }

        public C setLastUpdated(Modifier modifier, Date date)
        {
            return setLastUpdated(modifier, date, Constants.FORMATTER_DATE_TIME);
        }

        public C setLastUpdated(Prefix prefix, Date date)
        {
            return setLastUpdated(prefix, date, Constants.FORMATTER_DATE_TIME);
        }

        public C setLastUpdated(Date date)
        {
            return setLastUpdated(date, Constants.FORMATTER_DATE_TIME);
        }

        public C setProfile(Modifier modifier, Prefix prefix, String profile)
        {
            return setParameter(Parameters.PROFILE, modifier, prefix, profile);
        }

        public C setProfile(Modifier modifier, String profile)
        {
            return setParameter(Parameters.PROFILE, modifier, profile);
        }

        public C setProfile(Prefix prefix, String profile)
        {
            return setParameter(Parameters.PROFILE, prefix, profile);
        }

        public C setProfile(String profile)
        {
            return setParameter(Parameters.PROFILE, profile);
        }

        public C setQuery(Modifier modifier, Prefix prefix, String query)
        {
            return setParameter(Parameters.QUERY, modifier, prefix, query);
        }

        public C setQuery(Modifier modifier, String query)
        {
            return setParameter(Parameters.QUERY, modifier, query);
        }

        public C setQuery(Prefix prefix, String query)
        {
            return setParameter(Parameters.QUERY, prefix, query);
        }

        public C setQuery(String query)
        {
            return setParameter(Parameters.QUERY, query);
        }

        public C setSecurity(Modifier modifier, Prefix prefix, String security)
        {
            return setParameter(Parameters.SECUTIRY, modifier, prefix, security);
        }

        public C setSecurity(Modifier modifier, String security)
        {
            return setParameter(Parameters.SECUTIRY, modifier, security);
        }

        public C setSecurity(Prefix prefix, String security)
        {
            return setParameter(Parameters.SECUTIRY, prefix, security);
        }

        public C setSecurity(String security)
        {
            return setParameter(Parameters.SECUTIRY, security);
        }

        public C setTag(Modifier modifier, Prefix prefix, String tag)
        {
            return setParameter(Parameters.TAG, modifier, prefix, tag);
        }

        public C setTag(Modifier modifier, String tag)
        {
            return setParameter(Parameters.TAG, modifier, tag);
        }

        public C setTag(Prefix prefix, String tag)
        {
            return setParameter(Parameters.TAG, prefix, tag);
        }

        public C setTag(String tag)
        {
            return setParameter(Parameters.TAG, tag);
        }

        public C setText(Modifier modifier, Prefix prefix, String text)
        {
            return setParameter(Parameters.TEXT, modifier, prefix, text);
        }

        public C setText(Modifier modifier, String text)
        {
            return setParameter(Parameters.TEXT, modifier, text);
        }

        public C setText(Prefix prefix, String text)
        {
            return setParameter(Parameters.TEXT, prefix, text);
        }

        public C setText(String text)
        {
            return setParameter(Parameters.TEXT, text);
        }

        public C setSummary(Summary summary)
        {
            setParameter(Parameters.SUMMARY, summary.name().toLowerCase());
            return (C)this;
        }

        public C addResource(R resource)
        {
            resources.add(resource);
            return (C)this;
        }

        public <T, R> ResourceInteractor<T, R> compose()
        {

            // Build the retrofit
            Retrofit retrofit = builder().build();

            // Create the retrofit service
            T service = (T)retrofit.create(this.serviceClass);

            // Create and return the ResourceTransaction
            return new ResourceInteractor<T, R>(service, (Class<R>)this.resourceClass, this.parameters, (List<R>)this.resources);

        }

    }

}
