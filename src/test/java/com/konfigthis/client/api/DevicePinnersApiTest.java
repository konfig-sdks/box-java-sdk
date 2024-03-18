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
import com.konfigthis.client.model.DevicePinner;
import com.konfigthis.client.model.DevicePinners;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevicePinnersApi
 */
@Disabled
public class DevicePinnersApiTest {

    private static DevicePinnersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DevicePinnersApi(apiClient);
    }

    /**
     * Get device pin
     *
     * Retrieves information about an individual device pin.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPinnerInfoTest() throws ApiException {
        String devicePinnerId = null;
        DevicePinner response = api.getPinnerInfo(devicePinnerId)
                .execute();
        // TODO: test validations
    }

    /**
     * List enterprise device pins
     *
     * Retrieves all the device pins within an enterprise.  The user must have admin privileges, and the application needs the \&quot;manage enterprise\&quot; scope to make this call.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPinnerInfoTest() throws ApiException {
        String enterpriseId = null;
        String marker = null;
        Long limit = null;
        String direction = null;
        DevicePinners response = api.listPinnerInfo(enterpriseId)
                .marker(marker)
                .limit(limit)
                .direction(direction)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove device pin
     *
     * Deletes an individual device pin.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeDevicePinTest() throws ApiException {
        String devicePinnerId = null;
        api.removeDevicePin(devicePinnerId)
                .execute();
        // TODO: test validations
    }

}