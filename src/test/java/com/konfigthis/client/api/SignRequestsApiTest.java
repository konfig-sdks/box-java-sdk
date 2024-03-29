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
import com.konfigthis.client.model.FileBase;
import com.konfigthis.client.model.FolderMini;
import com.konfigthis.client.model.SignRequest;
import com.konfigthis.client.model.SignRequestCreateRequest;
import com.konfigthis.client.model.SignRequestCreateSigner;
import com.konfigthis.client.model.SignRequestPrefillTag;
import com.konfigthis.client.model.SignRequests;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SignRequestsApi
 */
@Disabled
public class SignRequestsApiTest {

    private static SignRequestsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SignRequestsApi(apiClient);
    }

    /**
     * Cancel sign request
     *
     * Cancels a sign request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelRequestTest() throws ApiException {
        String signRequestId = null;
        SignRequest response = api.cancelRequest(signRequestId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create sign request
     *
     * Creates a sign request. This involves preparing a document for signing and sending the sign request to signers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRequestTest() throws ApiException {
        List<SignRequestCreateSigner> signers = null;
        Boolean isDocumentPreparationNeeded = null;
        String redirectUrl = null;
        String declinedRedirectUrl = null;
        Boolean areTextSignaturesEnabled = null;
        String emailSubject = null;
        String emailMessage = null;
        Boolean areRemindersEnabled = null;
        String name = null;
        List<SignRequestPrefillTag> prefillTags = null;
        Integer daysValid = null;
        String externalId = null;
        Boolean isPhoneVerificationRequiredToView = null;
        String templateId = null;
        List<FileBase> sourceFiles = null;
        String signatureColor = null;
        FolderMini parentFolder = null;
        SignRequest response = api.createRequest(signers)
                .isDocumentPreparationNeeded(isDocumentPreparationNeeded)
                .redirectUrl(redirectUrl)
                .declinedRedirectUrl(declinedRedirectUrl)
                .areTextSignaturesEnabled(areTextSignaturesEnabled)
                .emailSubject(emailSubject)
                .emailMessage(emailMessage)
                .areRemindersEnabled(areRemindersEnabled)
                .name(name)
                .prefillTags(prefillTags)
                .daysValid(daysValid)
                .externalId(externalId)
                .isPhoneVerificationRequiredToView(isPhoneVerificationRequiredToView)
                .templateId(templateId)
                .sourceFiles(sourceFiles)
                .signatureColor(signatureColor)
                .parentFolder(parentFolder)
                .execute();
        // TODO: test validations
    }

    /**
     * Get sign request by ID
     *
     * Gets a sign request by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String signRequestId = null;
        SignRequest response = api.getById(signRequestId)
                .execute();
        // TODO: test validations
    }

    /**
     * List sign requests
     *
     * Gets sign requests created by a user. If the &#x60;sign_files&#x60; and/or &#x60;parent_folder&#x60; are deleted, the sign request will not return in the list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        String marker = null;
        Long limit = null;
        SignRequests response = api.list()
                .marker(marker)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Resend sign request
     *
     * Resends a sign request email to all outstanding signers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resendSignRequestEmailsTest() throws ApiException {
        String signRequestId = null;
        api.resendSignRequestEmails(signRequestId)
                .execute();
        // TODO: test validations
    }

}
