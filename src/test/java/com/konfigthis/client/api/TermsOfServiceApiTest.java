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
import com.konfigthis.client.model.TermsOfService;
import com.konfigthis.client.model.TermsOfServiceCreateForEnterpriseAndTypeRequest;
import com.konfigthis.client.model.TermsOfServiceUpdateSpecificTermRequest;
import com.konfigthis.client.model.TermsOfServices;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TermsOfServiceApi
 */
@Disabled
public class TermsOfServiceApiTest {

    private static TermsOfServiceApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TermsOfServiceApi(apiClient);
    }

    /**
     * Create terms of service
     *
     * Creates a terms of service for a given enterprise and type of user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createForEnterpriseAndTypeTest() throws ApiException {
        String status = null;
        String text = null;
        String tosType = null;
        TermsOfService response = api.createForEnterpriseAndType(status, text)
                .tosType(tosType)
                .execute();
        // TODO: test validations
    }

    /**
     * List terms of services
     *
     * Returns the current terms of service text and settings for the enterprise.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSettingsTest() throws ApiException {
        String tosType = null;
        TermsOfServices response = api.getSettings()
                .tosType(tosType)
                .execute();
        // TODO: test validations
    }

    /**
     * Get terms of service
     *
     * Fetches a specific terms of service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificTest() throws ApiException {
        String termsOfServiceId = null;
        TermsOfService response = api.getSpecific(termsOfServiceId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update terms of service
     *
     * Updates a specific terms of service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSpecificTermTest() throws ApiException {
        String status = null;
        String text = null;
        String termsOfServiceId = null;
        TermsOfService response = api.updateSpecificTerm(status, text, termsOfServiceId)
                .execute();
        // TODO: test validations
    }

}
