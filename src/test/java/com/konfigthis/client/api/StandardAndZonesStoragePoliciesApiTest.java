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
import com.konfigthis.client.model.StoragePolicies;
import com.konfigthis.client.model.StoragePolicy;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StandardAndZonesStoragePoliciesApi
 */
@Disabled
public class StandardAndZonesStoragePoliciesApiTest {

    private static StandardAndZonesStoragePoliciesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new StandardAndZonesStoragePoliciesApi(apiClient);
    }

    /**
     * Get storage policy
     *
     * Fetches a specific storage policy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificTest() throws ApiException {
        String storagePolicyId = null;
        StoragePolicy response = api.getSpecific(storagePolicyId)
                .execute();
        // TODO: test validations
    }

    /**
     * List storage policies
     *
     * Fetches all the storage policies in the enterprise.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPoliciesTest() throws ApiException {
        List<String> fields = null;
        String marker = null;
        Long limit = null;
        StoragePolicies response = api.listPolicies()
                .fields(fields)
                .marker(marker)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

}