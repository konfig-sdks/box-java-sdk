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
import com.konfigthis.client.model.WebLink;
import com.konfigthis.client.model.WebLinksCreateObjectRequest;
import com.konfigthis.client.model.WebLinksCreateObjectRequestParent;
import com.konfigthis.client.model.WebLinksUpdateObjectRequest;
import com.konfigthis.client.model.WebLinksUpdateObjectRequestParent;
import com.konfigthis.client.model.WebLinksUpdateObjectRequestSharedLink;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebLinksApi
 */
@Disabled
public class WebLinksApiTest {

    private static WebLinksApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new WebLinksApi(apiClient);
    }

    /**
     * Create web link
     *
     * Creates a web link object within a folder.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createObjectTest() throws ApiException {
        String url = null;
        WebLinksCreateObjectRequestParent parent = null;
        String description = null;
        String name = null;
        WebLink response = api.createObject(url, parent)
                .description(description)
                .name(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Get web link
     *
     * Retrieve information about a web link.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInformationTest() throws ApiException {
        String webLinkId = null;
        String boxapi = null;
        WebLink response = api.getInformation(webLinkId)
                .boxapi(boxapi)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove web link
     *
     * Deletes a web link.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeLinkTest() throws ApiException {
        String webLinkId = null;
        api.removeLink(webLinkId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update web link
     *
     * Updates a web link object.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateObjectTest() throws ApiException {
        String webLinkId = null;
        String description = null;
        String url = null;
        WebLinksUpdateObjectRequestParent parent = null;
        String name = null;
        WebLinksUpdateObjectRequestSharedLink sharedLink = null;
        WebLink response = api.updateObject(webLinkId)
                .description(description)
                .url(url)
                .parent(parent)
                .name(name)
                .sharedLink(sharedLink)
                .execute();
        // TODO: test validations
    }

}
