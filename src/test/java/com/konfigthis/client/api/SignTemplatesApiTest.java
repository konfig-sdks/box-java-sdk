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
import com.konfigthis.client.model.SignTemplate;
import com.konfigthis.client.model.SignTemplates;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SignTemplatesApi
 */
@Disabled
public class SignTemplatesApiTest {

    private static SignTemplatesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SignTemplatesApi(apiClient);
    }

    /**
     * Get Box Sign template by ID
     *
     * Fetches details of a specific Box Sign template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        String templateId = null;
        SignTemplate response = api.getDetails(templateId)
                .execute();
        // TODO: test validations
    }

    /**
     * List Box Sign templates
     *
     * Gets Box Sign templates created by a user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTemplatesTest() throws ApiException {
        String marker = null;
        Long limit = null;
        SignTemplates response = api.listTemplates()
                .marker(marker)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

}
