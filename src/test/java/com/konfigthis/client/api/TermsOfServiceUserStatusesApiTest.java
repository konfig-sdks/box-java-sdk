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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ClientError;
import com.konfigthis.client.model.TermsOfServiceUserStatus;
import com.konfigthis.client.model.TermsOfServiceUserStatuses;
import com.konfigthis.client.model.TermsOfServiceUserStatusesCreateUserStatusRequest;
import com.konfigthis.client.model.TermsOfServiceUserStatusesCreateUserStatusRequestTos;
import com.konfigthis.client.model.TermsOfServiceUserStatusesCreateUserStatusRequestUser;
import com.konfigthis.client.model.TermsOfServiceUserStatusesUpdateUserStatusRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TermsOfServiceUserStatusesApi
 */
@Disabled
public class TermsOfServiceUserStatusesApiTest {

    private static TermsOfServiceUserStatusesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TermsOfServiceUserStatusesApi(apiClient);
    }

    /**
     * Create terms of service status for new user
     *
     * Sets the status for a terms of service for a user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserStatusTest() throws ApiException {
        TermsOfServiceUserStatusesCreateUserStatusRequestTos tos = null;
        TermsOfServiceUserStatusesCreateUserStatusRequestUser user = null;
        Boolean isAccepted = null;
        TermsOfServiceUserStatus response = api.createUserStatus(tos, user, isAccepted)
                .execute();
        // TODO: test validations
    }

    /**
     * List terms of service user statuses
     *
     * Retrieves an overview of users and their status for a terms of service, including Whether they have accepted the terms and when.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserStatusesTest() throws ApiException {
        String tosId = null;
        String userId = null;
        TermsOfServiceUserStatuses response = api.listUserStatuses(tosId)
                .userId(userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update terms of service status for existing user
     *
     * Updates the status for a terms of service for a user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserStatusTest() throws ApiException {
        Boolean isAccepted = null;
        String termsOfServiceUserStatusId = null;
        TermsOfServiceUserStatus response = api.updateUserStatus(isAccepted, termsOfServiceUserStatusId)
                .execute();
        // TODO: test validations
    }

}
