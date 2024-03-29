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
import com.konfigthis.client.model.Classification;
import com.konfigthis.client.model.ClassificationsOnFoldersAddClassificationToFolderRequest;
import com.konfigthis.client.model.ClassificationsOnFoldersUpdateClassificationRequestInner;
import com.konfigthis.client.model.ClientError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClassificationsOnFoldersApi
 */
@Disabled
public class ClassificationsOnFoldersApiTest {

    private static ClassificationsOnFoldersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ClassificationsOnFoldersApi(apiClient);
    }

    /**
     * Add classification to folder
     *
     * Adds a classification to a folder by specifying the label of the classification to add.  This API can also be called by including the enterprise ID in the URL explicitly, for example &#x60;/folders/:id//enterprise_12345/securityClassification-6VMVochwUWo&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addClassificationToFolderTest() throws ApiException {
        String folderId = null;
        String boxSecurityClassificationKey = null;
        Classification response = api.addClassificationToFolder(folderId)
                .boxSecurityClassificationKey(boxSecurityClassificationKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Get classification on folder
     *
     * Retrieves the classification metadata instance that has been applied to a folder.  This API can also be called by including the enterprise ID in the URL explicitly, for example &#x60;/folders/:id//enterprise_12345/securityClassification-6VMVochwUWo&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getClassificationMetadataTest() throws ApiException {
        String folderId = null;
        Classification response = api.getClassificationMetadata(folderId)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove classification from folder
     *
     * Removes any classifications from a folder.  This API can also be called by including the enterprise ID in the URL explicitly, for example &#x60;/folders/:id//enterprise_12345/securityClassification-6VMVochwUWo&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeFromFolderTest() throws ApiException {
        String folderId = null;
        api.removeFromFolder(folderId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update classification on folder
     *
     * Updates a classification on a folder.  The classification can only be updated if a classification has already been applied to the folder before. When editing classifications, only values are defined for the enterprise will be accepted.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateClassificationTest() throws ApiException {
        String folderId = null;
        Classification response = api.updateClassification(folderId)
                .execute();
        // TODO: test validations
    }

}
