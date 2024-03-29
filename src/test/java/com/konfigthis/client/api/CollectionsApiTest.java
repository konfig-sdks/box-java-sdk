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
import com.konfigthis.client.model.Collections;
import com.konfigthis.client.model.Items;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CollectionsApi
 */
@Disabled
public class CollectionsApiTest {

    private static CollectionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CollectionsApi(apiClient);
    }

    /**
     * List all collections
     *
     * Retrieves all collections for a given user.  Currently, only the &#x60;favorites&#x60; collection is supported.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void collectionsTest() throws ApiException {
        List<String> fields = null;
        Long offset = null;
        Long limit = null;
        Collections response = api.collections()
                .fields(fields)
                .offset(offset)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * List collection items
     *
     * Retrieves the files and/or folders contained within this collection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listItemsTest() throws ApiException {
        String collectionId = null;
        List<String> fields = null;
        Long offset = null;
        Long limit = null;
        Items response = api.listItems(collectionId)
                .fields(fields)
                .offset(offset)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

}
