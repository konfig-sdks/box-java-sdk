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
import java.io.File;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DownloadsApi
 */
@Disabled
public class DownloadsApiTest {

    private static DownloadsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DownloadsApi(apiClient);
    }

    /**
     * Download file
     *
     * Returns the contents of a file in binary format.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fileContentGetTest() throws ApiException {
        String fileId = null;
        String range = null;
        String boxapi = null;
        String version = null;
        String accessToken = null;
        File response = api.fileContentGet(fileId)
                .range(range)
                .boxapi(boxapi)
                .version(version)
                .accessToken(accessToken)
                .execute();
        // TODO: test validations
    }

}
