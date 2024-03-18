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
import com.konfigthis.client.model.FileVersionLegalHold;
import com.konfigthis.client.model.FileVersionLegalHolds;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class FileVersionLegalHoldsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FileVersionLegalHoldsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public FileVersionLegalHoldsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getFileVersionLegalHoldInfoCall(String fileVersionLegalHoldId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/file_version_legal_holds/{file_version_legal_hold_id}"
            .replace("{" + "file_version_legal_hold_id" + "}", localVarApiClient.escapeString(fileVersionLegalHoldId.toString()));

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
    private okhttp3.Call getFileVersionLegalHoldInfoValidateBeforeCall(String fileVersionLegalHoldId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'fileVersionLegalHoldId' is set
        if (fileVersionLegalHoldId == null) {
            throw new ApiException("Missing the required parameter 'fileVersionLegalHoldId' when calling getFileVersionLegalHoldInfo(Async)");
        }

        return getFileVersionLegalHoldInfoCall(fileVersionLegalHoldId, _callback);

    }


    private ApiResponse<FileVersionLegalHold> getFileVersionLegalHoldInfoWithHttpInfo(String fileVersionLegalHoldId) throws ApiException {
        okhttp3.Call localVarCall = getFileVersionLegalHoldInfoValidateBeforeCall(fileVersionLegalHoldId, null);
        Type localVarReturnType = new TypeToken<FileVersionLegalHold>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getFileVersionLegalHoldInfoAsync(String fileVersionLegalHoldId, final ApiCallback<FileVersionLegalHold> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFileVersionLegalHoldInfoValidateBeforeCall(fileVersionLegalHoldId, _callback);
        Type localVarReturnType = new TypeToken<FileVersionLegalHold>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetFileVersionLegalHoldInfoRequestBuilder {
        private final String fileVersionLegalHoldId;

        private GetFileVersionLegalHoldInfoRequestBuilder(String fileVersionLegalHoldId) {
            this.fileVersionLegalHoldId = fileVersionLegalHoldId;
        }

        /**
         * Build call for getFileVersionLegalHoldInfo
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the legal hold policy assignments for the file version. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getFileVersionLegalHoldInfoCall(fileVersionLegalHoldId, _callback);
        }


        /**
         * Execute getFileVersionLegalHoldInfo request
         * @return FileVersionLegalHold
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the legal hold policy assignments for the file version. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public FileVersionLegalHold execute() throws ApiException {
            ApiResponse<FileVersionLegalHold> localVarResp = getFileVersionLegalHoldInfoWithHttpInfo(fileVersionLegalHoldId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getFileVersionLegalHoldInfo request with HTTP info returned
         * @return ApiResponse&lt;FileVersionLegalHold&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the legal hold policy assignments for the file version. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<FileVersionLegalHold> executeWithHttpInfo() throws ApiException {
            return getFileVersionLegalHoldInfoWithHttpInfo(fileVersionLegalHoldId);
        }

        /**
         * Execute getFileVersionLegalHoldInfo request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the legal hold policy assignments for the file version. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<FileVersionLegalHold> _callback) throws ApiException {
            return getFileVersionLegalHoldInfoAsync(fileVersionLegalHoldId, _callback);
        }
    }

    /**
     * Get file version legal hold
     * Retrieves information about the legal hold policies assigned to a file version.
     * @param fileVersionLegalHoldId The ID of the file version legal hold (required)
     * @return GetFileVersionLegalHoldInfoRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the legal hold policy assignments for the file version. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
     </table>
     */
    public GetFileVersionLegalHoldInfoRequestBuilder getFileVersionLegalHoldInfo(String fileVersionLegalHoldId) throws IllegalArgumentException {
        if (fileVersionLegalHoldId == null) throw new IllegalArgumentException("\"fileVersionLegalHoldId\" is required but got null");
            

        return new GetFileVersionLegalHoldInfoRequestBuilder(fileVersionLegalHoldId);
    }
    private okhttp3.Call listFileVersionLegalHoldsCall(String policyId, String marker, Long limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/file_version_legal_holds";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (policyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("policy_id", policyId));
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
    private okhttp3.Call listFileVersionLegalHoldsValidateBeforeCall(String policyId, String marker, Long limit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'policyId' is set
        if (policyId == null) {
            throw new ApiException("Missing the required parameter 'policyId' when calling listFileVersionLegalHolds(Async)");
        }

        return listFileVersionLegalHoldsCall(policyId, marker, limit, _callback);

    }


    private ApiResponse<FileVersionLegalHolds> listFileVersionLegalHoldsWithHttpInfo(String policyId, String marker, Long limit) throws ApiException {
        okhttp3.Call localVarCall = listFileVersionLegalHoldsValidateBeforeCall(policyId, marker, limit, null);
        Type localVarReturnType = new TypeToken<FileVersionLegalHolds>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listFileVersionLegalHoldsAsync(String policyId, String marker, Long limit, final ApiCallback<FileVersionLegalHolds> _callback) throws ApiException {

        okhttp3.Call localVarCall = listFileVersionLegalHoldsValidateBeforeCall(policyId, marker, limit, _callback);
        Type localVarReturnType = new TypeToken<FileVersionLegalHolds>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListFileVersionLegalHoldsRequestBuilder {
        private final String policyId;
        private String marker;
        private Long limit;

        private ListFileVersionLegalHoldsRequestBuilder(String policyId) {
            this.policyId = policyId;
        }

        /**
         * Set marker
         * @param marker Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. (optional)
         * @return ListFileVersionLegalHoldsRequestBuilder
         */
        public ListFileVersionLegalHoldsRequestBuilder marker(String marker) {
            this.marker = marker;
            return this;
        }
        
        /**
         * Set limit
         * @param limit The maximum number of items to return per page. (optional)
         * @return ListFileVersionLegalHoldsRequestBuilder
         */
        public ListFileVersionLegalHoldsRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Build call for listFileVersionLegalHolds
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the list of file version legal holds for a specific legal hold policy. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listFileVersionLegalHoldsCall(policyId, marker, limit, _callback);
        }


        /**
         * Execute listFileVersionLegalHolds request
         * @return FileVersionLegalHolds
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the list of file version legal holds for a specific legal hold policy. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public FileVersionLegalHolds execute() throws ApiException {
            ApiResponse<FileVersionLegalHolds> localVarResp = listFileVersionLegalHoldsWithHttpInfo(policyId, marker, limit);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listFileVersionLegalHolds request with HTTP info returned
         * @return ApiResponse&lt;FileVersionLegalHolds&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the list of file version legal holds for a specific legal hold policy. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<FileVersionLegalHolds> executeWithHttpInfo() throws ApiException {
            return listFileVersionLegalHoldsWithHttpInfo(policyId, marker, limit);
        }

        /**
         * Execute listFileVersionLegalHolds request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the list of file version legal holds for a specific legal hold policy. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<FileVersionLegalHolds> _callback) throws ApiException {
            return listFileVersionLegalHoldsAsync(policyId, marker, limit, _callback);
        }
    }

    /**
     * List file version legal holds
     * Get a list of file versions on legal hold for a legal hold assignment.  Due to ongoing re-architecture efforts this API might not return all file versions for this policy ID.  Instead, this API will only return file versions held in the legacy architecture. Two new endpoints will available to request any file versions held in the new architecture.  For file versions held in the new architecture, the &#x60;GET /legal_hold_policy_assignments/:id/file_versions_on_hold&#x60; API can be used to return all past file versions available for this policy assignment, and the &#x60;GET /legal_hold_policy_assignments/:id/files_on_hold&#x60; API can be used to return any current (latest) versions of a file under legal hold.  The &#x60;GET /legal_hold_policy_assignments?policy_id&#x3D;{id}&#x60; API can be used to find a list of policy assignments for a given policy ID.  Once the re-architecture is completed this API will be deprecated.
     * @param policyId The ID of the legal hold policy to get the file version legal holds for. (required)
     * @return ListFileVersionLegalHoldsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the list of file version legal holds for a specific legal hold policy. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
     </table>
     */
    public ListFileVersionLegalHoldsRequestBuilder listFileVersionLegalHolds(String policyId) throws IllegalArgumentException {
        if (policyId == null) throw new IllegalArgumentException("\"policyId\" is required but got null");
            

        return new ListFileVersionLegalHoldsRequestBuilder(policyId);
    }
}
