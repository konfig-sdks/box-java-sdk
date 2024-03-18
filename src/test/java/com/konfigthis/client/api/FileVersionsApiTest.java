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
import com.konfigthis.client.model.FileVersionFull;
import com.konfigthis.client.model.FileVersions;
import com.konfigthis.client.model.FileVersionsPromoteFileVersionRequest;
import com.konfigthis.client.model.FileVersionsRestoreVersionRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FileVersionsApi
 */
@Disabled
public class FileVersionsApiTest {

    private static FileVersionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new FileVersionsApi(apiClient);
    }

    /**
     * Get file version
     *
     * Retrieve a specific version of a file.  Versions are only tracked for Box users with premium accounts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificVersionTest() throws ApiException {
        String fileId = null;
        String fileVersionId = null;
        List<String> fields = null;
        FileVersionFull response = api.getSpecificVersion(fileId, fileVersionId)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * List all file versions
     *
     * Retrieve a list of the past versions for a file.  Versions are only tracked by Box users with premium accounts. To fetch the ID of the current version of a file, use the &#x60;GET /file/:id&#x60; API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllVersionsTest() throws ApiException {
        String fileId = null;
        List<String> fields = null;
        Long limit = null;
        Long offset = null;
        FileVersions response = api.listAllVersions(fileId)
                .fields(fields)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove file version
     *
     * Move a file version to the trash.  Versions are only tracked for Box users with premium accounts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void moveToTrashTest() throws ApiException {
        String fileId = null;
        String fileVersionId = null;
        String ifMatch = null;
        api.moveToTrash(fileId, fileVersionId)
                .ifMatch(ifMatch)
                .execute();
        // TODO: test validations
    }

    /**
     * Promote file version
     *
     * Promote a specific version of a file.  If previous versions exist, this method can be used to promote one of the older versions to the top of the version history.  This creates a new copy of the old version and puts it at the top of the versions history. The file will have the exact same contents as the older version, with the the same hash digest, &#x60;etag&#x60;, and name as the original.  Other properties such as comments do not get updated to their former values.  Don&#39;t use this endpoint to restore Box Notes, as it works with file formats such as PDF, DOC, PPTX or similar.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void promoteFileVersionTest() throws ApiException {
        String fileId = null;
        String id = null;
        String type = null;
        List<String> fields = null;
        FileVersionFull response = api.promoteFileVersion(fileId)
                .id(id)
                .type(type)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * Restore file version
     *
     * Restores a specific version of a file after it was deleted. Don&#39;t use this endpoint to restore Box Notes, as it works with file formats such as PDF, DOC, PPTX or similar.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void restoreVersionTest() throws ApiException {
        String fileId = null;
        String fileVersionId = null;
        String trashedAt = null;
        FileVersionFull response = api.restoreVersion(fileId, fileVersionId)
                .trashedAt(trashedAt)
                .execute();
        // TODO: test validations
    }

}