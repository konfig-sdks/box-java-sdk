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
import com.konfigthis.client.model.SessionTerminationCreateSessionTerminationJobsRequest;
import com.konfigthis.client.model.SessionTerminationCreateTerminationJobsRequest;
import com.konfigthis.client.model.SessionTerminationMessage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SessionTerminationApi
 */
@Disabled
public class SessionTerminationApiTest {

    private static SessionTerminationApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SessionTerminationApi(apiClient);
    }

    /**
     * Create jobs to terminate users session
     *
     * Validates the roles and permissions of the user, and creates asynchronous jobs to terminate the user&#39;s sessions. Returns the status for the POST request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSessionTerminationJobsTest() throws ApiException {
        List<String> userIds = null;
        List<String> userLogins = null;
        SessionTerminationMessage response = api.createSessionTerminationJobs(userIds, userLogins)
                .execute();
        // TODO: test validations
    }

    /**
     * Create jobs to terminate user group session
     *
     * Validates the roles and permissions of the group, and creates asynchronous jobs to terminate the group&#39;s sessions. Returns the status for the POST request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTerminationJobsTest() throws ApiException {
        List<String> groupIds = null;
        SessionTerminationMessage response = api.createTerminationJobs(groupIds)
                .execute();
        // TODO: test validations
    }

}