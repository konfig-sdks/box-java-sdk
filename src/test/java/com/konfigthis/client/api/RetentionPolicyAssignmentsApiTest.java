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
import com.konfigthis.client.model.FilesUnderRetention;
import com.konfigthis.client.model.RetentionPolicyAssignment;
import com.konfigthis.client.model.RetentionPolicyAssignments;
import com.konfigthis.client.model.RetentionPolicyAssignmentsCreateRetentionAssignmentRequest;
import com.konfigthis.client.model.RetentionPolicyAssignmentsCreateRetentionAssignmentRequestAssignTo;
import com.konfigthis.client.model.RetentionPolicyAssignmentsCreateRetentionAssignmentRequestFilterFieldsInner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RetentionPolicyAssignmentsApi
 */
@Disabled
public class RetentionPolicyAssignmentsApiTest {

    private static RetentionPolicyAssignmentsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new RetentionPolicyAssignmentsApi(apiClient);
    }

    /**
     * Assign retention policy
     *
     * Assigns a retention policy to an item.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRetentionAssignmentTest() throws ApiException {
        String policyId = null;
        RetentionPolicyAssignmentsCreateRetentionAssignmentRequestAssignTo assignTo = null;
        List<RetentionPolicyAssignmentsCreateRetentionAssignmentRequestFilterFieldsInner> filterFields = null;
        String startDateField = null;
        RetentionPolicyAssignment response = api.createRetentionAssignment(policyId, assignTo)
                .filterFields(filterFields)
                .startDateField(startDateField)
                .execute();
        // TODO: test validations
    }

    /**
     * Get retention policy assignment
     *
     * Retrieves a retention policy assignment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAssignmentTest() throws ApiException {
        String retentionPolicyAssignmentId = null;
        List<String> fields = null;
        RetentionPolicyAssignment response = api.getAssignment(retentionPolicyAssignmentId)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * List retention policy assignments
     *
     * Returns a list of all retention policy assignments associated with a specified retention policy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllAssignmentsTest() throws ApiException {
        String retentionPolicyId = null;
        String type = null;
        List<String> fields = null;
        String marker = null;
        Long limit = null;
        RetentionPolicyAssignments response = api.listAllAssignments(retentionPolicyId)
                .type(type)
                .fields(fields)
                .marker(marker)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Get file versions under retention
     *
     * Returns a list of file versions under retention for a retention policy assignment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFileVersionsUnderRetentionTest() throws ApiException {
        String retentionPolicyAssignmentId = null;
        String marker = null;
        Long limit = null;
        FilesUnderRetention response = api.listFileVersionsUnderRetention(retentionPolicyAssignmentId)
                .marker(marker)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Get files under retention
     *
     * Returns a list of files under retention for a retention policy assignment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFilesUnderRetentionTest() throws ApiException {
        String retentionPolicyAssignmentId = null;
        String marker = null;
        Long limit = null;
        FilesUnderRetention response = api.listFilesUnderRetention(retentionPolicyAssignmentId)
                .marker(marker)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove retention policy assignment
     *
     * Removes a retention policy assignment applied to content.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeAssignmentTest() throws ApiException {
        String retentionPolicyAssignmentId = null;
        api.removeAssignment(retentionPolicyAssignmentId)
                .execute();
        // TODO: test validations
    }

}
