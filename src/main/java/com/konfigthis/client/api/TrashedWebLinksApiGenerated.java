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
import com.konfigthis.client.model.TrashWebLink;
import com.konfigthis.client.model.TrashWebLinkRestored;
import com.konfigthis.client.model.TrashedWebLinksRestoreWebLinkRequest;
import com.konfigthis.client.model.TrashedWebLinksRestoreWebLinkRequestParent;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TrashedWebLinksApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TrashedWebLinksApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public TrashedWebLinksApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getTrashedLinkCall(String webLinkId, List<String> fields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/web_links/{web_link_id}/trash"
            .replace("{" + "web_link_id" + "}", localVarApiClient.escapeString(webLinkId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "fields", fields));
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
    private okhttp3.Call getTrashedLinkValidateBeforeCall(String webLinkId, List<String> fields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'webLinkId' is set
        if (webLinkId == null) {
            throw new ApiException("Missing the required parameter 'webLinkId' when calling getTrashedLink(Async)");
        }

        return getTrashedLinkCall(webLinkId, fields, _callback);

    }


    private ApiResponse<TrashWebLink> getTrashedLinkWithHttpInfo(String webLinkId, List<String> fields) throws ApiException {
        okhttp3.Call localVarCall = getTrashedLinkValidateBeforeCall(webLinkId, fields, null);
        Type localVarReturnType = new TypeToken<TrashWebLink>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getTrashedLinkAsync(String webLinkId, List<String> fields, final ApiCallback<TrashWebLink> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTrashedLinkValidateBeforeCall(webLinkId, fields, _callback);
        Type localVarReturnType = new TypeToken<TrashWebLink>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetTrashedLinkRequestBuilder {
        private final String webLinkId;
        private List<String> fields;

        private GetTrashedLinkRequestBuilder(String webLinkId) {
            this.webLinkId = webLinkId;
        }

        /**
         * Set fields
         * @param fields A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. (optional)
         * @return GetTrashedLinkRequestBuilder
         */
        public GetTrashedLinkRequestBuilder fields(List<String> fields) {
            this.fields = fields;
            return this;
        }
        
        /**
         * Build call for getTrashedLink
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the web link that was trashed, including information about when the it was moved to the trash. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getTrashedLinkCall(webLinkId, fields, _callback);
        }


        /**
         * Execute getTrashedLink request
         * @return TrashWebLink
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the web link that was trashed, including information about when the it was moved to the trash. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public TrashWebLink execute() throws ApiException {
            ApiResponse<TrashWebLink> localVarResp = getTrashedLinkWithHttpInfo(webLinkId, fields);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getTrashedLink request with HTTP info returned
         * @return ApiResponse&lt;TrashWebLink&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the web link that was trashed, including information about when the it was moved to the trash. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<TrashWebLink> executeWithHttpInfo() throws ApiException {
            return getTrashedLinkWithHttpInfo(webLinkId, fields);
        }

        /**
         * Execute getTrashedLink request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the web link that was trashed, including information about when the it was moved to the trash. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<TrashWebLink> _callback) throws ApiException {
            return getTrashedLinkAsync(webLinkId, fields, _callback);
        }
    }

    /**
     * Get trashed web link
     * Retrieves a web link that has been moved to the trash.
     * @param webLinkId The ID of the web link. (required)
     * @return GetTrashedLinkRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the web link that was trashed, including information about when the it was moved to the trash. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
     </table>
     */
    public GetTrashedLinkRequestBuilder getTrashedLink(String webLinkId) throws IllegalArgumentException {
        if (webLinkId == null) throw new IllegalArgumentException("\"webLinkId\" is required but got null");
            

        return new GetTrashedLinkRequestBuilder(webLinkId);
    }
    private okhttp3.Call permanentlyRemoveCall(String webLinkId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/web_links/{web_link_id}/trash"
            .replace("{" + "web_link_id" + "}", localVarApiClient.escapeString(webLinkId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call permanentlyRemoveValidateBeforeCall(String webLinkId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'webLinkId' is set
        if (webLinkId == null) {
            throw new ApiException("Missing the required parameter 'webLinkId' when calling permanentlyRemove(Async)");
        }

        return permanentlyRemoveCall(webLinkId, _callback);

    }


    private ApiResponse<Void> permanentlyRemoveWithHttpInfo(String webLinkId) throws ApiException {
        okhttp3.Call localVarCall = permanentlyRemoveValidateBeforeCall(webLinkId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call permanentlyRemoveAsync(String webLinkId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = permanentlyRemoveValidateBeforeCall(webLinkId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class PermanentlyRemoveRequestBuilder {
        private final String webLinkId;

        private PermanentlyRemoveRequestBuilder(String webLinkId) {
            this.webLinkId = webLinkId;
        }

        /**
         * Build call for permanentlyRemove
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Returns an empty response when the web link was permanently deleted. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return permanentlyRemoveCall(webLinkId, _callback);
        }


        /**
         * Execute permanentlyRemove request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Returns an empty response when the web link was permanently deleted. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            permanentlyRemoveWithHttpInfo(webLinkId);
        }

        /**
         * Execute permanentlyRemove request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Returns an empty response when the web link was permanently deleted. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return permanentlyRemoveWithHttpInfo(webLinkId);
        }

        /**
         * Execute permanentlyRemove request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Returns an empty response when the web link was permanently deleted. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return permanentlyRemoveAsync(webLinkId, _callback);
        }
    }

    /**
     * Permanently remove web link
     * Permanently deletes a web link that is in the trash. This action cannot be undone.
     * @param webLinkId The ID of the web link. (required)
     * @return PermanentlyRemoveRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returns an empty response when the web link was permanently deleted. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
     </table>
     */
    public PermanentlyRemoveRequestBuilder permanentlyRemove(String webLinkId) throws IllegalArgumentException {
        if (webLinkId == null) throw new IllegalArgumentException("\"webLinkId\" is required but got null");
            

        return new PermanentlyRemoveRequestBuilder(webLinkId);
    }
    private okhttp3.Call restoreWebLinkCall(String webLinkId, List<String> fields, TrashedWebLinksRestoreWebLinkRequest trashedWebLinksRestoreWebLinkRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = trashedWebLinksRestoreWebLinkRequest;

        // create path and map variables
        String localVarPath = "/web_links/{web_link_id}"
            .replace("{" + "web_link_id" + "}", localVarApiClient.escapeString(webLinkId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "fields", fields));
        }

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
    private okhttp3.Call restoreWebLinkValidateBeforeCall(String webLinkId, List<String> fields, TrashedWebLinksRestoreWebLinkRequest trashedWebLinksRestoreWebLinkRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'webLinkId' is set
        if (webLinkId == null) {
            throw new ApiException("Missing the required parameter 'webLinkId' when calling restoreWebLink(Async)");
        }

        return restoreWebLinkCall(webLinkId, fields, trashedWebLinksRestoreWebLinkRequest, _callback);

    }


    private ApiResponse<TrashWebLinkRestored> restoreWebLinkWithHttpInfo(String webLinkId, List<String> fields, TrashedWebLinksRestoreWebLinkRequest trashedWebLinksRestoreWebLinkRequest) throws ApiException {
        okhttp3.Call localVarCall = restoreWebLinkValidateBeforeCall(webLinkId, fields, trashedWebLinksRestoreWebLinkRequest, null);
        Type localVarReturnType = new TypeToken<TrashWebLinkRestored>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call restoreWebLinkAsync(String webLinkId, List<String> fields, TrashedWebLinksRestoreWebLinkRequest trashedWebLinksRestoreWebLinkRequest, final ApiCallback<TrashWebLinkRestored> _callback) throws ApiException {

        okhttp3.Call localVarCall = restoreWebLinkValidateBeforeCall(webLinkId, fields, trashedWebLinksRestoreWebLinkRequest, _callback);
        Type localVarReturnType = new TypeToken<TrashWebLinkRestored>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class RestoreWebLinkRequestBuilder {
        private final String webLinkId;
        private String name;
        private TrashedWebLinksRestoreWebLinkRequestParent parent;
        private List<String> fields;

        private RestoreWebLinkRequestBuilder(String webLinkId) {
            this.webLinkId = webLinkId;
        }

        /**
         * Set name
         * @param name An optional new name for the web link. (optional)
         * @return RestoreWebLinkRequestBuilder
         */
        public RestoreWebLinkRequestBuilder name(String name) {
            this.name = name;
            return this;
        }
        
        /**
         * Set parent
         * @param parent  (optional)
         * @return RestoreWebLinkRequestBuilder
         */
        public RestoreWebLinkRequestBuilder parent(TrashedWebLinksRestoreWebLinkRequestParent parent) {
            this.parent = parent;
            return this;
        }
        
        /**
         * Set fields
         * @param fields A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. (optional)
         * @return RestoreWebLinkRequestBuilder
         */
        public RestoreWebLinkRequestBuilder fields(List<String> fields) {
            this.fields = fields;
            return this;
        }
        
        /**
         * Build call for restoreWebLink
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Returns a web link object when it has been restored. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            TrashedWebLinksRestoreWebLinkRequest trashedWebLinksRestoreWebLinkRequest = buildBodyParams();
            return restoreWebLinkCall(webLinkId, fields, trashedWebLinksRestoreWebLinkRequest, _callback);
        }

        private TrashedWebLinksRestoreWebLinkRequest buildBodyParams() {
            TrashedWebLinksRestoreWebLinkRequest trashedWebLinksRestoreWebLinkRequest = new TrashedWebLinksRestoreWebLinkRequest();
            trashedWebLinksRestoreWebLinkRequest.name(this.name);
            trashedWebLinksRestoreWebLinkRequest.parent(this.parent);
            return trashedWebLinksRestoreWebLinkRequest;
        }

        /**
         * Execute restoreWebLink request
         * @return TrashWebLinkRestored
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Returns a web link object when it has been restored. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public TrashWebLinkRestored execute() throws ApiException {
            TrashedWebLinksRestoreWebLinkRequest trashedWebLinksRestoreWebLinkRequest = buildBodyParams();
            ApiResponse<TrashWebLinkRestored> localVarResp = restoreWebLinkWithHttpInfo(webLinkId, fields, trashedWebLinksRestoreWebLinkRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute restoreWebLink request with HTTP info returned
         * @return ApiResponse&lt;TrashWebLinkRestored&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Returns a web link object when it has been restored. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<TrashWebLinkRestored> executeWithHttpInfo() throws ApiException {
            TrashedWebLinksRestoreWebLinkRequest trashedWebLinksRestoreWebLinkRequest = buildBodyParams();
            return restoreWebLinkWithHttpInfo(webLinkId, fields, trashedWebLinksRestoreWebLinkRequest);
        }

        /**
         * Execute restoreWebLink request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Returns a web link object when it has been restored. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<TrashWebLinkRestored> _callback) throws ApiException {
            TrashedWebLinksRestoreWebLinkRequest trashedWebLinksRestoreWebLinkRequest = buildBodyParams();
            return restoreWebLinkAsync(webLinkId, fields, trashedWebLinksRestoreWebLinkRequest, _callback);
        }
    }

    /**
     * Restore web link
     * Restores a web link that has been moved to the trash.  An optional new parent ID can be provided to restore the  web link to in case the original folder has been deleted.
     * @param webLinkId The ID of the web link. (required)
     * @return RestoreWebLinkRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns a web link object when it has been restored. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
     </table>
     */
    public RestoreWebLinkRequestBuilder restoreWebLink(String webLinkId) throws IllegalArgumentException {
        if (webLinkId == null) throw new IllegalArgumentException("\"webLinkId\" is required but got null");
            

        return new RestoreWebLinkRequestBuilder(webLinkId);
    }
}
