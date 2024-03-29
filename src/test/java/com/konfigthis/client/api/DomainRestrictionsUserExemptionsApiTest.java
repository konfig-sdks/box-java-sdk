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
import com.konfigthis.client.model.CollaborationAllowlistExemptTarget;
import com.konfigthis.client.model.CollaborationAllowlistExemptTargets;
import com.konfigthis.client.model.DomainRestrictionsUserExemptionsCreateUserExemptionFromCollaborationDomainRestrictionsRequest;
import com.konfigthis.client.model.DomainRestrictionsUserExemptionsCreateUserExemptionFromCollaborationDomainRestrictionsRequestUser;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DomainRestrictionsUserExemptionsApi
 */
@Disabled
public class DomainRestrictionsUserExemptionsApiTest {

    private static DomainRestrictionsUserExemptionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DomainRestrictionsUserExemptionsApi(apiClient);
    }

    /**
     * Create user exemption from collaboration domain restrictions
     *
     * Exempts a user from the restrictions set out by the allowed list of domains for collaborations.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserExemptionFromCollaborationDomainRestrictionsTest() throws ApiException {
        DomainRestrictionsUserExemptionsCreateUserExemptionFromCollaborationDomainRestrictionsRequestUser user = null;
        CollaborationAllowlistExemptTarget response = api.createUserExemptionFromCollaborationDomainRestrictions(user)
                .execute();
        // TODO: test validations
    }

    /**
     * Get user exempt from collaboration domain restrictions
     *
     * Returns a users who has been exempt from the collaboration domain restrictions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserExemptionTest() throws ApiException {
        String collaborationWhitelistExemptTargetId = null;
        CollaborationAllowlistExemptTarget response = api.getUserExemption(collaborationWhitelistExemptTargetId)
                .execute();
        // TODO: test validations
    }

    /**
     * List users exempt from collaboration domain restrictions
     *
     * Returns a list of users who have been exempt from the collaboration domain restrictions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listExemptUsersTest() throws ApiException {
        String marker = null;
        Long limit = null;
        CollaborationAllowlistExemptTargets response = api.listExemptUsers()
                .marker(marker)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove user from list of users exempt from domain restrictions
     *
     * Removes a user&#39;s exemption from the restrictions set out by the allowed list of domains for collaborations.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeExemptionTest() throws ApiException {
        String collaborationWhitelistExemptTargetId = null;
        api.removeExemption(collaborationWhitelistExemptTargetId)
                .execute();
        // TODO: test validations
    }

}
