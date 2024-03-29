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
import com.konfigthis.client.model.Outcome;
import com.konfigthis.client.model.Workflows;
import com.konfigthis.client.model.WorkflowsStartBasedOnRequestRequest;
import com.konfigthis.client.model.WorkflowsStartBasedOnRequestRequestFilesInner;
import com.konfigthis.client.model.WorkflowsStartBasedOnRequestRequestFlow;
import com.konfigthis.client.model.WorkflowsStartBasedOnRequestRequestFolder;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class WorkflowsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WorkflowsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public WorkflowsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call startBasedOnRequestCall(String workflowId, WorkflowsStartBasedOnRequestRequest workflowsStartBasedOnRequestRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = workflowsStartBasedOnRequestRequest;

        // create path and map variables
        String localVarPath = "/workflows/{workflow_id}/start"
            .replace("{" + "workflow_id" + "}", localVarApiClient.escapeString(workflowId.toString()));

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
    private okhttp3.Call startBasedOnRequestValidateBeforeCall(String workflowId, WorkflowsStartBasedOnRequestRequest workflowsStartBasedOnRequestRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workflowId' is set
        if (workflowId == null) {
            throw new ApiException("Missing the required parameter 'workflowId' when calling startBasedOnRequest(Async)");
        }

        return startBasedOnRequestCall(workflowId, workflowsStartBasedOnRequestRequest, _callback);

    }


    private ApiResponse<Void> startBasedOnRequestWithHttpInfo(String workflowId, WorkflowsStartBasedOnRequestRequest workflowsStartBasedOnRequestRequest) throws ApiException {
        okhttp3.Call localVarCall = startBasedOnRequestValidateBeforeCall(workflowId, workflowsStartBasedOnRequestRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call startBasedOnRequestAsync(String workflowId, WorkflowsStartBasedOnRequestRequest workflowsStartBasedOnRequestRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = startBasedOnRequestValidateBeforeCall(workflowId, workflowsStartBasedOnRequestRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class StartBasedOnRequestRequestBuilder {
        private final WorkflowsStartBasedOnRequestRequestFlow flow;
        private final List<WorkflowsStartBasedOnRequestRequestFilesInner> files;
        private final WorkflowsStartBasedOnRequestRequestFolder folder;
        private final String workflowId;
        private String type;
        private List<Outcome> outcomes;

        private StartBasedOnRequestRequestBuilder(WorkflowsStartBasedOnRequestRequestFlow flow, List<WorkflowsStartBasedOnRequestRequestFilesInner> files, WorkflowsStartBasedOnRequestRequestFolder folder, String workflowId) {
            this.flow = flow;
            this.files = files;
            this.folder = folder;
            this.workflowId = workflowId;
        }

        /**
         * Set type
         * @param type The type of the parameters object (optional)
         * @return StartBasedOnRequestRequestBuilder
         */
        public StartBasedOnRequestRequestBuilder type(String type) {
            this.type = type;
            return this;
        }
        
        /**
         * Set outcomes
         * @param outcomes A configurable outcome the workflow should complete. (optional)
         * @return StartBasedOnRequestRequestBuilder
         */
        public StartBasedOnRequestRequestBuilder outcomes(List<Outcome> outcomes) {
            this.outcomes = outcomes;
            return this;
        }
        
        /**
         * Build call for startBasedOnRequest
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Starts the workflow. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            WorkflowsStartBasedOnRequestRequest workflowsStartBasedOnRequestRequest = buildBodyParams();
            return startBasedOnRequestCall(workflowId, workflowsStartBasedOnRequestRequest, _callback);
        }

        private WorkflowsStartBasedOnRequestRequest buildBodyParams() {
            WorkflowsStartBasedOnRequestRequest workflowsStartBasedOnRequestRequest = new WorkflowsStartBasedOnRequestRequest();
            if (this.type != null)
            workflowsStartBasedOnRequestRequest.type(WorkflowsStartBasedOnRequestRequest.TypeEnum.fromValue(this.type));
            workflowsStartBasedOnRequestRequest.flow(this.flow);
            workflowsStartBasedOnRequestRequest.files(this.files);
            workflowsStartBasedOnRequestRequest.folder(this.folder);
            workflowsStartBasedOnRequestRequest.outcomes(this.outcomes);
            return workflowsStartBasedOnRequestRequest;
        }

        /**
         * Execute startBasedOnRequest request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Starts the workflow. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            WorkflowsStartBasedOnRequestRequest workflowsStartBasedOnRequestRequest = buildBodyParams();
            startBasedOnRequestWithHttpInfo(workflowId, workflowsStartBasedOnRequestRequest);
        }

        /**
         * Execute startBasedOnRequest request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Starts the workflow. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            WorkflowsStartBasedOnRequestRequest workflowsStartBasedOnRequestRequest = buildBodyParams();
            return startBasedOnRequestWithHttpInfo(workflowId, workflowsStartBasedOnRequestRequest);
        }

        /**
         * Execute startBasedOnRequest request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Starts the workflow. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            WorkflowsStartBasedOnRequestRequest workflowsStartBasedOnRequestRequest = buildBodyParams();
            return startBasedOnRequestAsync(workflowId, workflowsStartBasedOnRequestRequest, _callback);
        }
    }

    /**
     * Starts workflow based on request body
     * Initiates a flow with a trigger type of &#x60;WORKFLOW_MANUAL_START&#x60;.  You application must be authorized to use the &#x60;Manage Box Relay&#x60; application scope within the developer console.
     * @param workflowId The ID of the workflow. (required)
     * @return StartBasedOnRequestRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Starts the workflow. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
     </table>
     */
    public StartBasedOnRequestRequestBuilder startBasedOnRequest(WorkflowsStartBasedOnRequestRequestFlow flow, List<WorkflowsStartBasedOnRequestRequestFilesInner> files, WorkflowsStartBasedOnRequestRequestFolder folder, String workflowId) throws IllegalArgumentException {
        if (flow == null) throw new IllegalArgumentException("\"flow\" is required but got null");
        if (files == null) throw new IllegalArgumentException("\"files\" is required but got null");
        if (folder == null) throw new IllegalArgumentException("\"folder\" is required but got null");
        if (workflowId == null) throw new IllegalArgumentException("\"workflowId\" is required but got null");
            

        return new StartBasedOnRequestRequestBuilder(flow, files, folder, workflowId);
    }
    private okhttp3.Call workflowsCall(String folderId, String triggerType, Long limit, String marker, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/workflows";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (folderId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("folder_id", folderId));
        }

        if (triggerType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("trigger_type", triggerType));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (marker != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("marker", marker));
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
    private okhttp3.Call workflowsValidateBeforeCall(String folderId, String triggerType, Long limit, String marker, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new ApiException("Missing the required parameter 'folderId' when calling workflows(Async)");
        }

        return workflowsCall(folderId, triggerType, limit, marker, _callback);

    }


    private ApiResponse<Workflows> workflowsWithHttpInfo(String folderId, String triggerType, Long limit, String marker) throws ApiException {
        okhttp3.Call localVarCall = workflowsValidateBeforeCall(folderId, triggerType, limit, marker, null);
        Type localVarReturnType = new TypeToken<Workflows>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call workflowsAsync(String folderId, String triggerType, Long limit, String marker, final ApiCallback<Workflows> _callback) throws ApiException {

        okhttp3.Call localVarCall = workflowsValidateBeforeCall(folderId, triggerType, limit, marker, _callback);
        Type localVarReturnType = new TypeToken<Workflows>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class WorkflowsRequestBuilder {
        private final String folderId;
        private String triggerType;
        private Long limit;
        private String marker;

        private WorkflowsRequestBuilder(String folderId) {
            this.folderId = folderId;
        }

        /**
         * Set triggerType
         * @param triggerType Type of trigger to search for. (optional)
         * @return WorkflowsRequestBuilder
         */
        public WorkflowsRequestBuilder triggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        
        /**
         * Set limit
         * @param limit The maximum number of items to return per page. (optional)
         * @return WorkflowsRequestBuilder
         */
        public WorkflowsRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set marker
         * @param marker Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. (optional)
         * @return WorkflowsRequestBuilder
         */
        public WorkflowsRequestBuilder marker(String marker) {
            this.marker = marker;
            return this;
        }
        
        /**
         * Build call for workflows
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the workflow. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return workflowsCall(folderId, triggerType, limit, marker, _callback);
        }


        /**
         * Execute workflows request
         * @return Workflows
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the workflow. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public Workflows execute() throws ApiException {
            ApiResponse<Workflows> localVarResp = workflowsWithHttpInfo(folderId, triggerType, limit, marker);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute workflows request with HTTP info returned
         * @return ApiResponse&lt;Workflows&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the workflow. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Workflows> executeWithHttpInfo() throws ApiException {
            return workflowsWithHttpInfo(folderId, triggerType, limit, marker);
        }

        /**
         * Execute workflows request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the workflow. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Workflows> _callback) throws ApiException {
            return workflowsAsync(folderId, triggerType, limit, marker, _callback);
        }
    }

    /**
     * List workflows
     * Returns list of workflows that act on a given &#x60;folder ID&#x60;, and have a flow with a trigger type of &#x60;WORKFLOW_MANUAL_START&#x60;.  You application must be authorized to use the &#x60;Manage Box Relay&#x60; application scope within the developer console in to use this endpoint.
     * @param folderId The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folder/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;.  The root folder of a Box account is always represented by the ID &#x60;0&#x60;. (required)
     * @return WorkflowsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the workflow. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
     </table>
     */
    public WorkflowsRequestBuilder workflows(String folderId) throws IllegalArgumentException {
        if (folderId == null) throw new IllegalArgumentException("\"folderId\" is required but got null");
            

        return new WorkflowsRequestBuilder(folderId);
    }
}
