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
import com.konfigthis.client.model.FolderFull;
import com.konfigthis.client.model.SharedLinksFoldersAddLinkToFolderRequest;
import com.konfigthis.client.model.SharedLinksFoldersAddLinkToFolderRequestSharedLink;
import com.konfigthis.client.model.SharedLinksFoldersRemoveFromFolderRequest;
import com.konfigthis.client.model.SharedLinksFoldersUpdateFolderSharedLinkRequest;
import com.konfigthis.client.model.SharedLinksFoldersUpdateFolderSharedLinkRequestSharedLink;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SharedLinksFoldersApi
 */
@Disabled
public class SharedLinksFoldersApiTest {

    private static SharedLinksFoldersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SharedLinksFoldersApi(apiClient);
    }

    /**
     * Add shared link to folder
     *
     * Adds a shared link to a folder.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addLinkToFolderTest() throws ApiException {
        String folderId = null;
        String fields = null;
        SharedLinksFoldersAddLinkToFolderRequestSharedLink sharedLink = null;
        FolderFull response = api.addLinkToFolder(folderId, fields)
                .sharedLink(sharedLink)
                .execute();
        // TODO: test validations
    }

    /**
     * Find folder for shared link
     *
     * Return the folder represented by a shared link.  A shared folder can be represented by a shared link, which can originate within the current enterprise or within another.  This endpoint allows an application to retrieve information about a shared folder when only given a shared link.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findFolderBySharedLinkTest() throws ApiException {
        String boxapi = null;
        String ifNoneMatch = null;
        List<String> fields = null;
        FolderFull response = api.findFolderBySharedLink(boxapi)
                .ifNoneMatch(ifNoneMatch)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get shared link for folder
     *
     * Gets the information for a shared link on a folder.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSharedLinkForFolderTest() throws ApiException {
        String folderId = null;
        String fields = null;
        FolderFull response = api.getSharedLinkForFolder(folderId, fields)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove shared link from folder
     *
     * Removes a shared link from a folder.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeFromFolderTest() throws ApiException {
        String folderId = null;
        String fields = null;
        Object sharedLink = null;
        FolderFull response = api.removeFromFolder(folderId, fields)
                .sharedLink(sharedLink)
                .execute();
        // TODO: test validations
    }

    /**
     * Update shared link on folder
     *
     * Updates a shared link on a folder.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateFolderSharedLinkTest() throws ApiException {
        String folderId = null;
        String fields = null;
        SharedLinksFoldersUpdateFolderSharedLinkRequestSharedLink sharedLink = null;
        FolderFull response = api.updateFolderSharedLink(folderId, fields)
                .sharedLink(sharedLink)
                .execute();
        // TODO: test validations
    }

}
