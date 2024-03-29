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
import com.konfigthis.client.model.IntegrationMapping;
import com.konfigthis.client.model.IntegrationMappingBoxItemSlack;
import com.konfigthis.client.model.IntegrationMappingPartnerItemSlack;
import com.konfigthis.client.model.IntegrationMappingSlackCreateRequest;
import com.konfigthis.client.model.IntegrationMappingSlackOptions;
import com.konfigthis.client.model.IntegrationMappings;
import com.konfigthis.client.model.IntegrationMappingsUpdateSlackMappingRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegrationMappingsApi
 */
@Disabled
public class IntegrationMappingsApiTest {

    private static IntegrationMappingsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new IntegrationMappingsApi(apiClient);
    }

    /**
     * Create Slack integration mapping
     *
     * Creates a [Slack integration mapping](https://support.box.com/hc/en-us/articles/4415585987859-Box-as-the-Content-Layer-for-Slack) by mapping a Slack channel to a Box item.  You need Admin or Co-Admin role to use this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSlackMappingTest() throws ApiException {
        IntegrationMappingPartnerItemSlack partnerItem = null;
        IntegrationMappingBoxItemSlack boxItem = null;
        IntegrationMappingSlackOptions options = null;
        IntegrationMapping response = api.createSlackMapping(partnerItem, boxItem)
                .options(options)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Slack integration mapping
     *
     * Deletes a [Slack integration mapping](https://support.box.com/hc/en-us/articles/4415585987859-Box-as-the-Content-Layer-for-Slack).   You need Admin or Co-Admin role to use this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSlackMappingTest() throws ApiException {
        String integrationMappingId = null;
        api.deleteSlackMapping(integrationMappingId)
                .execute();
        // TODO: test validations
    }

    /**
     * List Slack integration mappings
     *
     * Lists [Slack integration mappings](https://support.box.com/hc/en-us/articles/4415585987859-Box-as-the-Content-Layer-for-Slack) in a users&#39; enterprise.  You need Admin or Co-Admin role to use this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSlackMappingsTest() throws ApiException {
        String marker = null;
        Long limit = null;
        String partnerItemType = null;
        String partnerItemId = null;
        String boxItemId = null;
        String boxItemType = null;
        Boolean isManuallyCreated = null;
        IntegrationMappings response = api.listSlackMappings()
                .marker(marker)
                .limit(limit)
                .partnerItemType(partnerItemType)
                .partnerItemId(partnerItemId)
                .boxItemId(boxItemId)
                .boxItemType(boxItemType)
                .isManuallyCreated(isManuallyCreated)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Slack integration mapping
     *
     * Updates a [Slack integration mapping](https://support.box.com/hc/en-us/articles/4415585987859-Box-as-the-Content-Layer-for-Slack). Supports updating the Box folder ID and options.  You need Admin or Co-Admin role to use this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSlackMappingTest() throws ApiException {
        String integrationMappingId = null;
        IntegrationMappingBoxItemSlack boxItem = null;
        IntegrationMappingSlackOptions options = null;
        IntegrationMapping response = api.updateSlackMapping(integrationMappingId)
                .boxItem(boxItem)
                .options(options)
                .execute();
        // TODO: test validations
    }

}
