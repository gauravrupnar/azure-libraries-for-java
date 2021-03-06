/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.implementation;

import com.microsoft.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.microsoft.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.monitor.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ActivityLogAlerts.
 */
public class ActivityLogAlertsInner implements InnerSupportsGet<ActivityLogAlertResourceInner>, InnerSupportsDelete<Void> {
    /** The Retrofit service to perform REST calls. */
    private ActivityLogAlertsService service;
    /** The service client containing this operation class. */
    private MonitorManagementClientImpl client;

    /**
     * Initializes an instance of ActivityLogAlertsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ActivityLogAlertsInner(Retrofit retrofit, MonitorManagementClientImpl client) {
        this.service = retrofit.create(ActivityLogAlertsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ActivityLogAlerts to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ActivityLogAlertsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.ActivityLogAlerts createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights/activityLogAlerts/{activityLogAlertName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("activityLogAlertName") String activityLogAlertName, @Query("api-version") String apiVersion, @Body ActivityLogAlertResourceInner activityLogAlert, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.ActivityLogAlerts getByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights/activityLogAlerts/{activityLogAlertName}")
        Observable<Response<ResponseBody>> getByResourceGroup(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("activityLogAlertName") String activityLogAlertName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.ActivityLogAlerts delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights/activityLogAlerts/{activityLogAlertName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("activityLogAlertName") String activityLogAlertName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.ActivityLogAlerts update" })
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights/activityLogAlerts/{activityLogAlertName}")
        Observable<Response<ResponseBody>> update(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("activityLogAlertName") String activityLogAlertName, @Query("api-version") String apiVersion, @Body ActivityLogAlertPatchBodyInner activityLogAlertPatch, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.ActivityLogAlerts listBySubscriptionId" })
        @GET("subscriptions/{subscriptionId}/providers/microsoft.insights/activityLogAlerts")
        Observable<Response<ResponseBody>> listBySubscriptionId(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.ActivityLogAlerts listByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights/activityLogAlerts")
        Observable<Response<ResponseBody>> listByResourceGroup(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Create a new activity log alert or update an existing one.
     *
     * @param resourceGroupName The name of the resource group.
     * @param activityLogAlertName The name of the activity log alert.
     * @param activityLogAlert The activity log alert to create or use for the update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ActivityLogAlertResourceInner object if successful.
     */
    public ActivityLogAlertResourceInner createOrUpdate(String resourceGroupName, String activityLogAlertName, ActivityLogAlertResourceInner activityLogAlert) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, activityLogAlertName, activityLogAlert).toBlocking().single().body();
    }

    /**
     * Create a new activity log alert or update an existing one.
     *
     * @param resourceGroupName The name of the resource group.
     * @param activityLogAlertName The name of the activity log alert.
     * @param activityLogAlert The activity log alert to create or use for the update.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ActivityLogAlertResourceInner> createOrUpdateAsync(String resourceGroupName, String activityLogAlertName, ActivityLogAlertResourceInner activityLogAlert, final ServiceCallback<ActivityLogAlertResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, activityLogAlertName, activityLogAlert), serviceCallback);
    }

    /**
     * Create a new activity log alert or update an existing one.
     *
     * @param resourceGroupName The name of the resource group.
     * @param activityLogAlertName The name of the activity log alert.
     * @param activityLogAlert The activity log alert to create or use for the update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActivityLogAlertResourceInner object
     */
    public Observable<ActivityLogAlertResourceInner> createOrUpdateAsync(String resourceGroupName, String activityLogAlertName, ActivityLogAlertResourceInner activityLogAlert) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, activityLogAlertName, activityLogAlert).map(new Func1<ServiceResponse<ActivityLogAlertResourceInner>, ActivityLogAlertResourceInner>() {
            @Override
            public ActivityLogAlertResourceInner call(ServiceResponse<ActivityLogAlertResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new activity log alert or update an existing one.
     *
     * @param resourceGroupName The name of the resource group.
     * @param activityLogAlertName The name of the activity log alert.
     * @param activityLogAlert The activity log alert to create or use for the update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActivityLogAlertResourceInner object
     */
    public Observable<ServiceResponse<ActivityLogAlertResourceInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String activityLogAlertName, ActivityLogAlertResourceInner activityLogAlert) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (activityLogAlertName == null) {
            throw new IllegalArgumentException("Parameter activityLogAlertName is required and cannot be null.");
        }
        if (activityLogAlert == null) {
            throw new IllegalArgumentException("Parameter activityLogAlert is required and cannot be null.");
        }
        Validator.validate(activityLogAlert);
        final String apiVersion = "2017-04-01";
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, activityLogAlertName, apiVersion, activityLogAlert, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ActivityLogAlertResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ActivityLogAlertResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ActivityLogAlertResourceInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ActivityLogAlertResourceInner> createOrUpdateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ActivityLogAlertResourceInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ActivityLogAlertResourceInner>() { }.getType())
                .register(201, new TypeToken<ActivityLogAlertResourceInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get an activity log alert.
     *
     * @param resourceGroupName The name of the resource group.
     * @param activityLogAlertName The name of the activity log alert.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ActivityLogAlertResourceInner object if successful.
     */
    public ActivityLogAlertResourceInner getByResourceGroup(String resourceGroupName, String activityLogAlertName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, activityLogAlertName).toBlocking().single().body();
    }

    /**
     * Get an activity log alert.
     *
     * @param resourceGroupName The name of the resource group.
     * @param activityLogAlertName The name of the activity log alert.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ActivityLogAlertResourceInner> getByResourceGroupAsync(String resourceGroupName, String activityLogAlertName, final ServiceCallback<ActivityLogAlertResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByResourceGroupWithServiceResponseAsync(resourceGroupName, activityLogAlertName), serviceCallback);
    }

    /**
     * Get an activity log alert.
     *
     * @param resourceGroupName The name of the resource group.
     * @param activityLogAlertName The name of the activity log alert.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActivityLogAlertResourceInner object
     */
    public Observable<ActivityLogAlertResourceInner> getByResourceGroupAsync(String resourceGroupName, String activityLogAlertName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, activityLogAlertName).map(new Func1<ServiceResponse<ActivityLogAlertResourceInner>, ActivityLogAlertResourceInner>() {
            @Override
            public ActivityLogAlertResourceInner call(ServiceResponse<ActivityLogAlertResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get an activity log alert.
     *
     * @param resourceGroupName The name of the resource group.
     * @param activityLogAlertName The name of the activity log alert.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActivityLogAlertResourceInner object
     */
    public Observable<ServiceResponse<ActivityLogAlertResourceInner>> getByResourceGroupWithServiceResponseAsync(String resourceGroupName, String activityLogAlertName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (activityLogAlertName == null) {
            throw new IllegalArgumentException("Parameter activityLogAlertName is required and cannot be null.");
        }
        final String apiVersion = "2017-04-01";
        return service.getByResourceGroup(this.client.subscriptionId(), resourceGroupName, activityLogAlertName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ActivityLogAlertResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ActivityLogAlertResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ActivityLogAlertResourceInner> clientResponse = getByResourceGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ActivityLogAlertResourceInner> getByResourceGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ActivityLogAlertResourceInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ActivityLogAlertResourceInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Delete an activity log alert.
     *
     * @param resourceGroupName The name of the resource group.
     * @param activityLogAlertName The name of the activity log alert.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String activityLogAlertName) {
        deleteWithServiceResponseAsync(resourceGroupName, activityLogAlertName).toBlocking().single().body();
    }

    /**
     * Delete an activity log alert.
     *
     * @param resourceGroupName The name of the resource group.
     * @param activityLogAlertName The name of the activity log alert.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String activityLogAlertName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, activityLogAlertName), serviceCallback);
    }

    /**
     * Delete an activity log alert.
     *
     * @param resourceGroupName The name of the resource group.
     * @param activityLogAlertName The name of the activity log alert.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String activityLogAlertName) {
        return deleteWithServiceResponseAsync(resourceGroupName, activityLogAlertName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete an activity log alert.
     *
     * @param resourceGroupName The name of the resource group.
     * @param activityLogAlertName The name of the activity log alert.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String activityLogAlertName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (activityLogAlertName == null) {
            throw new IllegalArgumentException("Parameter activityLogAlertName is required and cannot be null.");
        }
        final String apiVersion = "2017-04-01";
        return service.delete(this.client.subscriptionId(), resourceGroupName, activityLogAlertName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Updates an existing ActivityLogAlertResource's tags. To update other fields use the CreateOrUpdate method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param activityLogAlertName The name of the activity log alert.
     * @param activityLogAlertPatch Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ActivityLogAlertResourceInner object if successful.
     */
    public ActivityLogAlertResourceInner update(String resourceGroupName, String activityLogAlertName, ActivityLogAlertPatchBodyInner activityLogAlertPatch) {
        return updateWithServiceResponseAsync(resourceGroupName, activityLogAlertName, activityLogAlertPatch).toBlocking().single().body();
    }

    /**
     * Updates an existing ActivityLogAlertResource's tags. To update other fields use the CreateOrUpdate method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param activityLogAlertName The name of the activity log alert.
     * @param activityLogAlertPatch Parameters supplied to the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ActivityLogAlertResourceInner> updateAsync(String resourceGroupName, String activityLogAlertName, ActivityLogAlertPatchBodyInner activityLogAlertPatch, final ServiceCallback<ActivityLogAlertResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, activityLogAlertName, activityLogAlertPatch), serviceCallback);
    }

    /**
     * Updates an existing ActivityLogAlertResource's tags. To update other fields use the CreateOrUpdate method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param activityLogAlertName The name of the activity log alert.
     * @param activityLogAlertPatch Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActivityLogAlertResourceInner object
     */
    public Observable<ActivityLogAlertResourceInner> updateAsync(String resourceGroupName, String activityLogAlertName, ActivityLogAlertPatchBodyInner activityLogAlertPatch) {
        return updateWithServiceResponseAsync(resourceGroupName, activityLogAlertName, activityLogAlertPatch).map(new Func1<ServiceResponse<ActivityLogAlertResourceInner>, ActivityLogAlertResourceInner>() {
            @Override
            public ActivityLogAlertResourceInner call(ServiceResponse<ActivityLogAlertResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates an existing ActivityLogAlertResource's tags. To update other fields use the CreateOrUpdate method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param activityLogAlertName The name of the activity log alert.
     * @param activityLogAlertPatch Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ActivityLogAlertResourceInner object
     */
    public Observable<ServiceResponse<ActivityLogAlertResourceInner>> updateWithServiceResponseAsync(String resourceGroupName, String activityLogAlertName, ActivityLogAlertPatchBodyInner activityLogAlertPatch) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (activityLogAlertName == null) {
            throw new IllegalArgumentException("Parameter activityLogAlertName is required and cannot be null.");
        }
        if (activityLogAlertPatch == null) {
            throw new IllegalArgumentException("Parameter activityLogAlertPatch is required and cannot be null.");
        }
        Validator.validate(activityLogAlertPatch);
        final String apiVersion = "2017-04-01";
        return service.update(this.client.subscriptionId(), resourceGroupName, activityLogAlertName, apiVersion, activityLogAlertPatch, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ActivityLogAlertResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ActivityLogAlertResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ActivityLogAlertResourceInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ActivityLogAlertResourceInner> updateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ActivityLogAlertResourceInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ActivityLogAlertResourceInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get a list of all activity log alerts in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ActivityLogAlertResourceInner&gt; object if successful.
     */
    public List<ActivityLogAlertResourceInner> listBySubscriptionId() {
        return listBySubscriptionIdWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get a list of all activity log alerts in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ActivityLogAlertResourceInner>> listBySubscriptionIdAsync(final ServiceCallback<List<ActivityLogAlertResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listBySubscriptionIdWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get a list of all activity log alerts in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ActivityLogAlertResourceInner&gt; object
     */
    public Observable<List<ActivityLogAlertResourceInner>> listBySubscriptionIdAsync() {
        return listBySubscriptionIdWithServiceResponseAsync().map(new Func1<ServiceResponse<List<ActivityLogAlertResourceInner>>, List<ActivityLogAlertResourceInner>>() {
            @Override
            public List<ActivityLogAlertResourceInner> call(ServiceResponse<List<ActivityLogAlertResourceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a list of all activity log alerts in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ActivityLogAlertResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<ActivityLogAlertResourceInner>>> listBySubscriptionIdWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2017-04-01";
        return service.listBySubscriptionId(this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ActivityLogAlertResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ActivityLogAlertResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<ActivityLogAlertResourceInner>> result = listBySubscriptionIdDelegate(response);
                        ServiceResponse<List<ActivityLogAlertResourceInner>> clientResponse = new ServiceResponse<List<ActivityLogAlertResourceInner>>(result.body().items(), result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<ActivityLogAlertResourceInner>> listBySubscriptionIdDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<ActivityLogAlertResourceInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<ActivityLogAlertResourceInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get a list of all activity log alerts in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ActivityLogAlertResourceInner&gt; object if successful.
     */
    public List<ActivityLogAlertResourceInner> listByResourceGroup(String resourceGroupName) {
        return listByResourceGroupWithServiceResponseAsync(resourceGroupName).toBlocking().single().body();
    }

    /**
     * Get a list of all activity log alerts in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ActivityLogAlertResourceInner>> listByResourceGroupAsync(String resourceGroupName, final ServiceCallback<List<ActivityLogAlertResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByResourceGroupWithServiceResponseAsync(resourceGroupName), serviceCallback);
    }

    /**
     * Get a list of all activity log alerts in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ActivityLogAlertResourceInner&gt; object
     */
    public Observable<List<ActivityLogAlertResourceInner>> listByResourceGroupAsync(String resourceGroupName) {
        return listByResourceGroupWithServiceResponseAsync(resourceGroupName).map(new Func1<ServiceResponse<List<ActivityLogAlertResourceInner>>, List<ActivityLogAlertResourceInner>>() {
            @Override
            public List<ActivityLogAlertResourceInner> call(ServiceResponse<List<ActivityLogAlertResourceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a list of all activity log alerts in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ActivityLogAlertResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<ActivityLogAlertResourceInner>>> listByResourceGroupWithServiceResponseAsync(String resourceGroupName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        final String apiVersion = "2017-04-01";
        return service.listByResourceGroup(this.client.subscriptionId(), resourceGroupName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ActivityLogAlertResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ActivityLogAlertResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<ActivityLogAlertResourceInner>> result = listByResourceGroupDelegate(response);
                        ServiceResponse<List<ActivityLogAlertResourceInner>> clientResponse = new ServiceResponse<List<ActivityLogAlertResourceInner>>(result.body().items(), result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<ActivityLogAlertResourceInner>> listByResourceGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<ActivityLogAlertResourceInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<ActivityLogAlertResourceInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
