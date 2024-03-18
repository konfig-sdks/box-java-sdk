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
import com.konfigthis.client.model.UploadPart;
import com.konfigthis.client.model.UploadParts;
import com.konfigthis.client.model.UploadSession;
import com.konfigthis.client.model.UploadedPart;
import com.konfigthis.client.model.UploadsChunkedCommitSessionRequest;
import com.konfigthis.client.model.UploadsChunkedCreateSessionForUploadRequest;
import com.konfigthis.client.model.UploadsChunkedCreateSessionForUploadRequest1;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UploadsChunkedApi
 */
@Disabled
public class UploadsChunkedApiTest {

    private static UploadsChunkedApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UploadsChunkedApi(apiClient);
    }

    /**
     * Commit upload session
     *
     * Close an upload session and create a file from the uploaded chunks.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void commitSessionTest() throws ApiException {
        List<UploadPart> parts = null;
        String uploadSessionId = null;
        String digest = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        Files response = api.commitSession(parts, uploadSessionId, digest)
                .ifMatch(ifMatch)
                .ifNoneMatch(ifNoneMatch)
                .execute();
        // TODO: test validations
    }

    /**
     * Create upload session
     *
     * Creates an upload session for a new file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSessionForUploadTest() throws ApiException {
        String folderId = null;
        Long fileSize = null;
        String fileName = null;
        UploadSession response = api.createSessionForUpload(folderId, fileSize, fileName)
                .execute();
        // TODO: test validations
    }

    /**
     * Create upload session for existing file
     *
     * Creates an upload session for an existing file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSessionForUpload_0Test() throws ApiException {
        Long fileSize = null;
        String fileId = null;
        String fileName = null;
        UploadSession response = api.createSessionForUpload_0(fileSize, fileId)
                .fileName(fileName)
                .execute();
        // TODO: test validations
    }

    /**
     * Upload part of file
     *
     * Updates a chunk of an upload session for a file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void filePartUpdateTest() throws ApiException {
        String uploadSessionId = null;
        String digest = null;
        String contentRange = null;
        UploadedPart response = api.filePartUpdate(uploadSessionId, digest, contentRange)
                .execute();
        // TODO: test validations
    }

    /**
     * Get upload session
     *
     * Return information about an upload session.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void infoTest() throws ApiException {
        String uploadSessionId = null;
        UploadSession response = api.info(uploadSessionId)
                .execute();
        // TODO: test validations
    }

    /**
     * List parts
     *
     * Return a list of the chunks uploaded to the upload session so far.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPartsTest() throws ApiException {
        String uploadSessionId = null;
        Long offset = null;
        Long limit = null;
        UploadParts response = api.listParts(uploadSessionId)
                .offset(offset)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove upload session
     *
     * Abort an upload session and discard all data uploaded.  This cannot be reversed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeUploadSessionTest() throws ApiException {
        String uploadSessionId = null;
        api.removeUploadSession(uploadSessionId)
                .execute();
        // TODO: test validations
    }

}