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
import com.konfigthis.client.model.SessionTerminationCreateSessionTerminationJobsRequest;
import com.konfigthis.client.model.SessionTerminationCreateTerminationJobsRequest;
import com.konfigthis.client.model.SessionTerminationMessage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SessionTerminationApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SessionTerminationApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public SessionTerminationApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call createSessionTerminationJobsCall(SessionTerminationCreateSessionTerminationJobsRequest sessionTerminationCreateSessionTerminationJobsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = sessionTerminationCreateSessionTerminationJobsRequest;

        // create path and map variables
        String localVarPath = "/users/terminate_sessions";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createSessionTerminationJobsValidateBeforeCall(SessionTerminationCreateSessionTerminationJobsRequest sessionTerminationCreateSessionTerminationJobsRequest, final ApiCallback _callback) throws ApiException {
        return createSessionTerminationJobsCall(sessionTerminationCreateSessionTerminationJobsRequest, _callback);

    }


    private ApiResponse<SessionTerminationMessage> createSessionTerminationJobsWithHttpInfo(SessionTerminationCreateSessionTerminationJobsRequest sessionTerminationCreateSessionTerminationJobsRequest) throws ApiException {
        okhttp3.Call localVarCall = createSessionTerminationJobsValidateBeforeCall(sessionTerminationCreateSessionTerminationJobsRequest, null);
        Type localVarReturnType = new TypeToken<SessionTerminationMessage>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createSessionTerminationJobsAsync(SessionTerminationCreateSessionTerminationJobsRequest sessionTerminationCreateSessionTerminationJobsRequest, final ApiCallback<SessionTerminationMessage> _callback) throws ApiException {

        okhttp3.Call localVarCall = createSessionTerminationJobsValidateBeforeCall(sessionTerminationCreateSessionTerminationJobsRequest, _callback);
        Type localVarReturnType = new TypeToken<SessionTerminationMessage>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateSessionTerminationJobsRequestBuilder {
        private final List<String> userIds;
        private final List<String> userLogins;

        private CreateSessionTerminationJobsRequestBuilder(List<String> userIds, List<String> userLogins) {
            this.userIds = userIds;
            this.userLogins = userLogins;
        }

        /**
         * Build call for createSessionTerminationJobs
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 202 </td><td> Returns a message about the request status. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            SessionTerminationCreateSessionTerminationJobsRequest sessionTerminationCreateSessionTerminationJobsRequest = buildBodyParams();
            return createSessionTerminationJobsCall(sessionTerminationCreateSessionTerminationJobsRequest, _callback);
        }

        private SessionTerminationCreateSessionTerminationJobsRequest buildBodyParams() {
            SessionTerminationCreateSessionTerminationJobsRequest sessionTerminationCreateSessionTerminationJobsRequest = new SessionTerminationCreateSessionTerminationJobsRequest();
            sessionTerminationCreateSessionTerminationJobsRequest.userIds(this.userIds);
            sessionTerminationCreateSessionTerminationJobsRequest.userLogins(this.userLogins);
            return sessionTerminationCreateSessionTerminationJobsRequest;
        }

        /**
         * Execute createSessionTerminationJobs request
         * @return SessionTerminationMessage
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 202 </td><td> Returns a message about the request status. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public SessionTerminationMessage execute() throws ApiException {
            SessionTerminationCreateSessionTerminationJobsRequest sessionTerminationCreateSessionTerminationJobsRequest = buildBodyParams();
            ApiResponse<SessionTerminationMessage> localVarResp = createSessionTerminationJobsWithHttpInfo(sessionTerminationCreateSessionTerminationJobsRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createSessionTerminationJobs request with HTTP info returned
         * @return ApiResponse&lt;SessionTerminationMessage&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 202 </td><td> Returns a message about the request status. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<SessionTerminationMessage> executeWithHttpInfo() throws ApiException {
            SessionTerminationCreateSessionTerminationJobsRequest sessionTerminationCreateSessionTerminationJobsRequest = buildBodyParams();
            return createSessionTerminationJobsWithHttpInfo(sessionTerminationCreateSessionTerminationJobsRequest);
        }

        /**
         * Execute createSessionTerminationJobs request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 202 </td><td> Returns a message about the request status. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<SessionTerminationMessage> _callback) throws ApiException {
            SessionTerminationCreateSessionTerminationJobsRequest sessionTerminationCreateSessionTerminationJobsRequest = buildBodyParams();
            return createSessionTerminationJobsAsync(sessionTerminationCreateSessionTerminationJobsRequest, _callback);
        }
    }

    /**
     * Create jobs to terminate users session
     * Validates the roles and permissions of the user, and creates asynchronous jobs to terminate the user&#39;s sessions. Returns the status for the POST request.
     * @return CreateSessionTerminationJobsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Returns a message about the request status. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
     </table>
     */
    public CreateSessionTerminationJobsRequestBuilder createSessionTerminationJobs(List<String> userIds, List<String> userLogins) throws IllegalArgumentException {
        if (userIds == null) throw new IllegalArgumentException("\"userIds\" is required but got null");
        if (userLogins == null) throw new IllegalArgumentException("\"userLogins\" is required but got null");
        return new CreateSessionTerminationJobsRequestBuilder(userIds, userLogins);
    }
    private okhttp3.Call createTerminationJobsCall(SessionTerminationCreateTerminationJobsRequest sessionTerminationCreateTerminationJobsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = sessionTerminationCreateTerminationJobsRequest;

        // create path and map variables
        String localVarPath = "/groups/terminate_sessions";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createTerminationJobsValidateBeforeCall(SessionTerminationCreateTerminationJobsRequest sessionTerminationCreateTerminationJobsRequest, final ApiCallback _callback) throws ApiException {
        return createTerminationJobsCall(sessionTerminationCreateTerminationJobsRequest, _callback);

    }


    private ApiResponse<SessionTerminationMessage> createTerminationJobsWithHttpInfo(SessionTerminationCreateTerminationJobsRequest sessionTerminationCreateTerminationJobsRequest) throws ApiException {
        okhttp3.Call localVarCall = createTerminationJobsValidateBeforeCall(sessionTerminationCreateTerminationJobsRequest, null);
        Type localVarReturnType = new TypeToken<SessionTerminationMessage>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createTerminationJobsAsync(SessionTerminationCreateTerminationJobsRequest sessionTerminationCreateTerminationJobsRequest, final ApiCallback<SessionTerminationMessage> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTerminationJobsValidateBeforeCall(sessionTerminationCreateTerminationJobsRequest, _callback);
        Type localVarReturnType = new TypeToken<SessionTerminationMessage>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateTerminationJobsRequestBuilder {
        private final List<String> groupIds;

        private CreateTerminationJobsRequestBuilder(List<String> groupIds) {
            this.groupIds = groupIds;
        }

        /**
         * Build call for createTerminationJobs
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 202 </td><td> Returns a message about the request status. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            SessionTerminationCreateTerminationJobsRequest sessionTerminationCreateTerminationJobsRequest = buildBodyParams();
            return createTerminationJobsCall(sessionTerminationCreateTerminationJobsRequest, _callback);
        }

        private SessionTerminationCreateTerminationJobsRequest buildBodyParams() {
            SessionTerminationCreateTerminationJobsRequest sessionTerminationCreateTerminationJobsRequest = new SessionTerminationCreateTerminationJobsRequest();
            sessionTerminationCreateTerminationJobsRequest.groupIds(this.groupIds);
            return sessionTerminationCreateTerminationJobsRequest;
        }

        /**
         * Execute createTerminationJobs request
         * @return SessionTerminationMessage
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 202 </td><td> Returns a message about the request status. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public SessionTerminationMessage execute() throws ApiException {
            SessionTerminationCreateTerminationJobsRequest sessionTerminationCreateTerminationJobsRequest = buildBodyParams();
            ApiResponse<SessionTerminationMessage> localVarResp = createTerminationJobsWithHttpInfo(sessionTerminationCreateTerminationJobsRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createTerminationJobs request with HTTP info returned
         * @return ApiResponse&lt;SessionTerminationMessage&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 202 </td><td> Returns a message about the request status. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<SessionTerminationMessage> executeWithHttpInfo() throws ApiException {
            SessionTerminationCreateTerminationJobsRequest sessionTerminationCreateTerminationJobsRequest = buildBodyParams();
            return createTerminationJobsWithHttpInfo(sessionTerminationCreateTerminationJobsRequest);
        }

        /**
         * Execute createTerminationJobs request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 202 </td><td> Returns a message about the request status. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<SessionTerminationMessage> _callback) throws ApiException {
            SessionTerminationCreateTerminationJobsRequest sessionTerminationCreateTerminationJobsRequest = buildBodyParams();
            return createTerminationJobsAsync(sessionTerminationCreateTerminationJobsRequest, _callback);
        }
    }

    /**
     * Create jobs to terminate user group session
     * Validates the roles and permissions of the group, and creates asynchronous jobs to terminate the group&#39;s sessions. Returns the status for the POST request.
     * @return CreateTerminationJobsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Returns a message about the request status. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
     </table>
     */
    public CreateTerminationJobsRequestBuilder createTerminationJobs(List<String> groupIds) throws IllegalArgumentException {
        if (groupIds == null) throw new IllegalArgumentException("\"groupIds\" is required but got null");
        return new CreateTerminationJobsRequestBuilder(groupIds);
    }
}