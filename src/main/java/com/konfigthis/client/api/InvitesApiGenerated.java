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
import com.konfigthis.client.model.Invite;
import com.konfigthis.client.model.PostInvitesRequest;
import com.konfigthis.client.model.PostInvitesRequestActionableBy;
import com.konfigthis.client.model.PostInvitesRequestEnterprise;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class InvitesApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public InvitesApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public InvitesApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getUserInviteStatusCall(String inviteId, List<String> fields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/invites/{invite_id}"
            .replace("{" + "invite_id" + "}", localVarApiClient.escapeString(inviteId.toString()));

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
    private okhttp3.Call getUserInviteStatusValidateBeforeCall(String inviteId, List<String> fields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'inviteId' is set
        if (inviteId == null) {
            throw new ApiException("Missing the required parameter 'inviteId' when calling getUserInviteStatus(Async)");
        }

        return getUserInviteStatusCall(inviteId, fields, _callback);

    }


    private ApiResponse<Invite> getUserInviteStatusWithHttpInfo(String inviteId, List<String> fields) throws ApiException {
        okhttp3.Call localVarCall = getUserInviteStatusValidateBeforeCall(inviteId, fields, null);
        Type localVarReturnType = new TypeToken<Invite>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getUserInviteStatusAsync(String inviteId, List<String> fields, final ApiCallback<Invite> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserInviteStatusValidateBeforeCall(inviteId, fields, _callback);
        Type localVarReturnType = new TypeToken<Invite>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetUserInviteStatusRequestBuilder {
        private final String inviteId;
        private List<String> fields;

        private GetUserInviteStatusRequestBuilder(String inviteId) {
            this.inviteId = inviteId;
        }

        /**
         * Set fields
         * @param fields A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. (optional)
         * @return GetUserInviteStatusRequestBuilder
         */
        public GetUserInviteStatusRequestBuilder fields(List<String> fields) {
            this.fields = fields;
            return this;
        }
        
        /**
         * Build call for getUserInviteStatus
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns an invite object </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getUserInviteStatusCall(inviteId, fields, _callback);
        }


        /**
         * Execute getUserInviteStatus request
         * @return Invite
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns an invite object </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public Invite execute() throws ApiException {
            ApiResponse<Invite> localVarResp = getUserInviteStatusWithHttpInfo(inviteId, fields);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getUserInviteStatus request with HTTP info returned
         * @return ApiResponse&lt;Invite&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns an invite object </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Invite> executeWithHttpInfo() throws ApiException {
            return getUserInviteStatusWithHttpInfo(inviteId, fields);
        }

        /**
         * Execute getUserInviteStatus request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns an invite object </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Invite> _callback) throws ApiException {
            return getUserInviteStatusAsync(inviteId, fields, _callback);
        }
    }

    /**
     * Get user invite status
     * Returns the status of a user invite.
     * @param inviteId The ID of an invite. (required)
     * @return GetUserInviteStatusRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns an invite object </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
     </table>
     */
    public GetUserInviteStatusRequestBuilder getUserInviteStatus(String inviteId) throws IllegalArgumentException {
        if (inviteId == null) throw new IllegalArgumentException("\"inviteId\" is required but got null");
            

        return new GetUserInviteStatusRequestBuilder(inviteId);
    }
    private okhttp3.Call invitesCall(List<String> fields, PostInvitesRequest postInvitesRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = postInvitesRequest;

        // create path and map variables
        String localVarPath = "/invites";

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
    private okhttp3.Call invitesValidateBeforeCall(List<String> fields, PostInvitesRequest postInvitesRequest, final ApiCallback _callback) throws ApiException {
        return invitesCall(fields, postInvitesRequest, _callback);

    }


    private ApiResponse<Invite> invitesWithHttpInfo(List<String> fields, PostInvitesRequest postInvitesRequest) throws ApiException {
        okhttp3.Call localVarCall = invitesValidateBeforeCall(fields, postInvitesRequest, null);
        Type localVarReturnType = new TypeToken<Invite>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call invitesAsync(List<String> fields, PostInvitesRequest postInvitesRequest, final ApiCallback<Invite> _callback) throws ApiException {

        okhttp3.Call localVarCall = invitesValidateBeforeCall(fields, postInvitesRequest, _callback);
        Type localVarReturnType = new TypeToken<Invite>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class InvitesRequestBuilder {
        private final PostInvitesRequestEnterprise enterprise;
        private final PostInvitesRequestActionableBy actionableBy;
        private List<String> fields;

        private InvitesRequestBuilder(PostInvitesRequestEnterprise enterprise, PostInvitesRequestActionableBy actionableBy) {
            this.enterprise = enterprise;
            this.actionableBy = actionableBy;
        }

        /**
         * Set fields
         * @param fields A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. (optional)
         * @return InvitesRequestBuilder
         */
        public InvitesRequestBuilder fields(List<String> fields) {
            this.fields = fields;
            return this;
        }
        
        /**
         * Build call for invites
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a new invite object. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            PostInvitesRequest postInvitesRequest = buildBodyParams();
            return invitesCall(fields, postInvitesRequest, _callback);
        }

        private PostInvitesRequest buildBodyParams() {
            PostInvitesRequest postInvitesRequest = new PostInvitesRequest();
            postInvitesRequest.enterprise(this.enterprise);
            postInvitesRequest.actionableBy(this.actionableBy);
            return postInvitesRequest;
        }

        /**
         * Execute invites request
         * @return Invite
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a new invite object. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public Invite execute() throws ApiException {
            PostInvitesRequest postInvitesRequest = buildBodyParams();
            ApiResponse<Invite> localVarResp = invitesWithHttpInfo(fields, postInvitesRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute invites request with HTTP info returned
         * @return ApiResponse&lt;Invite&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a new invite object. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Invite> executeWithHttpInfo() throws ApiException {
            PostInvitesRequest postInvitesRequest = buildBodyParams();
            return invitesWithHttpInfo(fields, postInvitesRequest);
        }

        /**
         * Execute invites request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns a new invite object. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Invite> _callback) throws ApiException {
            PostInvitesRequest postInvitesRequest = buildBodyParams();
            return invitesAsync(fields, postInvitesRequest, _callback);
        }
    }

    /**
     * Create user invite
     * Invites an existing external user to join an enterprise.  The existing user can not be part of another enterprise and must already have a Box account. Once invited, the user will receive an email and are prompted to accept the invitation within the Box web application.  This method requires the \&quot;Manage An Enterprise\&quot; scope enabled for the application, which can be enabled within the developer console.
     * @return InvitesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a new invite object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected client error. </td><td>  -  </td></tr>
     </table>
     */
    public InvitesRequestBuilder invites(PostInvitesRequestEnterprise enterprise, PostInvitesRequestActionableBy actionableBy) throws IllegalArgumentException {
        if (enterprise == null) throw new IllegalArgumentException("\"enterprise\" is required but got null");
        if (actionableBy == null) throw new IllegalArgumentException("\"actionableBy\" is required but got null");
        return new InvitesRequestBuilder(enterprise, actionableBy);
    }
}