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
import com.konfigthis.client.model.Files;
import com.konfigthis.client.model.UploadsFileContentUpdateRequest;
import com.konfigthis.client.model.UploadsFileContentUpdateRequestAttributes;
import com.konfigthis.client.model.UploadsSmallFileRequest;
import com.konfigthis.client.model.UploadsSmallFileRequestAttributes;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UploadsApi
 */
@Disabled
public class UploadsApiTest {

    private static UploadsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UploadsApi(apiClient);
    }

    /**
     * Upload file version
     *
     * Update a file&#39;s content. For file sizes over 50MB we recommend using the Chunk Upload APIs.  # Request body order  The &#x60;attributes&#x60; part of the body must come **before** the &#x60;file&#x60; part. Requests that do not follow this format when uploading the file will receive a HTTP &#x60;400&#x60; error with a &#x60;metadata_after_file_contents&#x60; error code.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fileContentUpdateTest() throws ApiException {
        String fileId = null;
        UploadsFileContentUpdateRequestAttributes attributes = null;
        File _file = null;
        String ifMatch = null;
        List<String> fields = null;
        String contentMd5 = null;
        Files response = api.fileContentUpdate(fileId, attributes, _file)
                .ifMatch(ifMatch)
                .fields(fields)
                .contentMd5(contentMd5)
                .execute();
        // TODO: test validations
    }

    /**
     * Upload file
     *
     * Uploads a small file to Box. For file sizes over 50MB we recommend using the Chunk Upload APIs.  # Request body order  The &#x60;attributes&#x60; part of the body must come **before** the &#x60;file&#x60; part. Requests that do not follow this format when uploading the file will receive a HTTP &#x60;400&#x60; error with a &#x60;metadata_after_file_contents&#x60; error code.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void smallFileTest() throws ApiException {
        UploadsSmallFileRequestAttributes attributes = null;
        File _file = null;
        List<String> fields = null;
        String contentMd5 = null;
        Files response = api.smallFile(attributes, _file)
                .fields(fields)
                .contentMd5(contentMd5)
                .execute();
        // TODO: test validations
    }

}
