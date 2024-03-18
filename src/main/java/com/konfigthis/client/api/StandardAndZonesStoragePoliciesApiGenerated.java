/*
 * Box Platform API
 * [Box Platform](https://box.dev) provides functionality to provide access to content stored within [Box](https://box.com). It provides endpoints for basic manipulation of files and folders, management of users within an enterprise, as well as more complex topics such as legal holds and retention policies.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: devrel@box.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.ClientError;
import com.konfigthis.client.model.StoragePolicies;
import com.konfigthis.client.model.StoragePolicy;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class StandardAndZonesStoragePoliciesApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StandardAndZonesStoragePoliciesApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public StandardAndZonesStoragePoliciesApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getSpecificCall(String storagePolicyId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/storage_policies/{storage_policy_id}"
            .replace("{" + "storage_policy_id" + "}", localVarApiClient.escapeString(storagePolicyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSpecificValidateBeforeCall(String storagePolicyId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'storagePolicyId' is set
        if (storagePolicyId == null) {
            throw new ApiException("Missing the required parameter 'storagePolicyId' when calling getSpecific(Async)");
        }

        return getSpecificCall(storagePolicyId, _callback);

    }


    private ApiResponse<StoragePolicy> getSpecificWithHttpInfo(String storagePolicyId) throws ApiException {
        okhttp3.Call localVarCall = getSpecificValidateBeforeCall(storagePolicyId, null);
        Type localVarReturnType = new TypeToken<StoragePolicy>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSpecificAsync(String storagePolicyId, final ApiCallback<StoragePolicy> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSpecificValidateBeforeCall(storagePolicyId, _callback);
        Type localVarReturnType = new TypeToken<StoragePolicy>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetSpecificRequestBuilder {
        private final String storagePolicyId;

        private GetSpecificRequestBuilder(String storagePolicyId) {
            this.storagePolicyId = storagePolicyId;
        }

        /**
         * Build call for getSpecific
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a storage policy object. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getSpecificCall(storagePolicyId, _callback);
        }


        /**
         * Execute getSpecific request
         * @return StoragePolicy
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a storage policy object. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public StoragePolicy execute() throws ApiException {
            ApiResponse<StoragePolicy> localVarResp = getSpecificWithHttpInfo(storagePolicyId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getSpecific request with HTTP info returned
         * @return ApiResponse&lt;StoragePolicy&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a storage policy object. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<StoragePolicy> executeWithHttpInfo() throws ApiException {
            return getSpecificWithHttpInfo(storagePolicyId);
        }

        /**
         * Execute getSpecific request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a storage policy object. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<StoragePolicy> _callback) throws ApiException {
            return getSpecificAsync(storagePolicyId, _callback);
        }
    }

    /**
     * Get storage policy
     * Fetches a specific storage policy.
     * @param storagePolicyId The ID of the storage policy. (required)
     * @return GetSpecificRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a storage policy object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
     </table>
     */
    public GetSpecificRequestBuilder getSpecific(String storagePolicyId) throws IllegalArgumentException {
        if (storagePolicyId == null) throw new IllegalArgumentException("\"storagePolicyId\" is required but got null");
            

        return new GetSpecificRequestBuilder(storagePolicyId);
    }
    private okhttp3.Call listPoliciesCall(List<String> fields, String marker, Long limit, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/storage_policies";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "fields", fields));
        }

        if (marker != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("marker", marker));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listPoliciesValidateBeforeCall(List<String> fields, String marker, Long limit, final ApiCallback _callback) throws ApiException {
        return listPoliciesCall(fields, marker, limit, _callback);

    }


    private ApiResponse<StoragePolicies> listPoliciesWithHttpInfo(List<String> fields, String marker, Long limit) throws ApiException {
        okhttp3.Call localVarCall = listPoliciesValidateBeforeCall(fields, marker, limit, null);
        Type localVarReturnType = new TypeToken<StoragePolicies>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listPoliciesAsync(List<String> fields, String marker, Long limit, final ApiCallback<StoragePolicies> _callback) throws ApiException {

        okhttp3.Call localVarCall = listPoliciesValidateBeforeCall(fields, marker, limit, _callback);
        Type localVarReturnType = new TypeToken<StoragePolicies>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListPoliciesRequestBuilder {
        private List<String> fields;
        private String marker;
        private Long limit;

        private ListPoliciesRequestBuilder() {
        }

        /**
         * Set fields
         * @param fields A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. (optional)
         * @return ListPoliciesRequestBuilder
         */
        public ListPoliciesRequestBuilder fields(List<String> fields) {
            this.fields = fields;
            return this;
        }
        
        /**
         * Set marker
         * @param marker Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. (optional)
         * @return ListPoliciesRequestBuilder
         */
        public ListPoliciesRequestBuilder marker(String marker) {
            this.marker = marker;
            return this;
        }
        
        /**
         * Set limit
         * @param limit The maximum number of items to return per page. (optional)
         * @return ListPoliciesRequestBuilder
         */
        public ListPoliciesRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Build call for listPolicies
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a collection of storage policies. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listPoliciesCall(fields, marker, limit, _callback);
        }


        /**
         * Execute listPolicies request
         * @return StoragePolicies
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a collection of storage policies. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public StoragePolicies execute() throws ApiException {
            ApiResponse<StoragePolicies> localVarResp = listPoliciesWithHttpInfo(fields, marker, limit);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listPolicies request with HTTP info returned
         * @return ApiResponse&lt;StoragePolicies&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a collection of storage policies. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<StoragePolicies> executeWithHttpInfo() throws ApiException {
            return listPoliciesWithHttpInfo(fields, marker, limit);
        }

        /**
         * Execute listPolicies request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a collection of storage policies. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<StoragePolicies> _callback) throws ApiException {
            return listPoliciesAsync(fields, marker, limit, _callback);
        }
    }

    /**
     * List storage policies
     * Fetches all the storage policies in the enterprise.
     * @return ListPoliciesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a collection of storage policies. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
     </table>
     */
    public ListPoliciesRequestBuilder listPolicies() throws IllegalArgumentException {
        return new ListPoliciesRequestBuilder();
    }
}
