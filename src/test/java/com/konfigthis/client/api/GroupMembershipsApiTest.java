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
import com.konfigthis.client.model.GroupMembership;
import com.konfigthis.client.model.GroupMemberships;
import com.konfigthis.client.model.GroupMembershipsCreateMembershipRequest;
import com.konfigthis.client.model.GroupMembershipsCreateMembershipRequestGroup;
import com.konfigthis.client.model.GroupMembershipsCreateMembershipRequestUser;
import com.konfigthis.client.model.GroupMembershipsUpdateMembershipRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupMembershipsApi
 */
@Disabled
public class GroupMembershipsApiTest {

    private static GroupMembershipsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GroupMembershipsApi(apiClient);
    }

    /**
     * Add user to group
     *
     * Creates a group membership. Only users with admin-level permissions will be able to use this API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMembershipTest() throws ApiException {
        GroupMembershipsCreateMembershipRequestUser user = null;
        GroupMembershipsCreateMembershipRequestGroup group = null;
        String role = null;
        Map<String, Boolean> configurablePermissions = null;
        List<String> fields = null;
        GroupMembership response = api.createMembership(user, group)
                .role(role)
                .configurablePermissions(configurablePermissions)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * List user&#39;s groups
     *
     * Retrieves all the groups for a user. Only members of this group or users with admin-level permissions will be able to use this API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        String userId = null;
        Long limit = null;
        Long offset = null;
        GroupMemberships response = api.getAll(userId)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Get group membership
     *
     * Retrieves a specific group membership. Only admins of this group or users with admin-level permissions will be able to use this API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificMembershipTest() throws ApiException {
        String groupMembershipId = null;
        List<String> fields = null;
        GroupMembership response = api.getSpecificMembership(groupMembershipId)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * List members of group
     *
     * Retrieves all the members for a group. Only members of this group or users with admin-level permissions will be able to use this API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMembersOfGroupTest() throws ApiException {
        String groupId = null;
        Long limit = null;
        Long offset = null;
        GroupMemberships response = api.listMembersOfGroup(groupId)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove user from group
     *
     * Deletes a specific group membership. Only admins of this group or users with admin-level permissions will be able to use this API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeUserFromGroupTest() throws ApiException {
        String groupMembershipId = null;
        api.removeUserFromGroup(groupMembershipId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update group membership
     *
     * Updates a user&#39;s group membership. Only admins of this group or users with admin-level permissions will be able to use this API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMembershipTest() throws ApiException {
        String groupMembershipId = null;
        String role = null;
        Map<String, Boolean> configurablePermissions = null;
        List<String> fields = null;
        GroupMembership response = api.updateMembership(groupMembershipId)
                .role(role)
                .configurablePermissions(configurablePermissions)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

}
