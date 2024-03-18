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
import com.konfigthis.client.model.UserAvatar;
import com.konfigthis.client.model.UserAvatarsAddOrUpdateImageRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserAvatarsApi
 */
@Disabled
public class UserAvatarsApiTest {

    private static UserAvatarsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UserAvatarsApi(apiClient);
    }

    /**
     * Add or update user avatar
     *
     * Adds or updates a user avatar.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addOrUpdateImageTest() throws ApiException {
        String userId = null;
        File pic = null;
        UserAvatar response = api.addOrUpdateImage(userId, pic)
                .execute();
        // TODO: test validations
    }

    /**
     * Get user avatar
     *
     * Retrieves an image of a the user&#39;s avatar.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getImageTest() throws ApiException {
        String userId = null;
        File response = api.getImage(userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete user avatar
     *
     * Removes an existing user avatar. You cannot reverse this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeExistingTest() throws ApiException {
        String userId = null;
        api.removeExisting(userId)
                .execute();
        // TODO: test validations
    }

}
