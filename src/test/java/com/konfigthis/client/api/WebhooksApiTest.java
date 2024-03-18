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
import com.konfigthis.client.model.PostWebhooksRequest;
import com.konfigthis.client.model.PostWebhooksRequestTarget;
import com.konfigthis.client.model.Webhook;
import com.konfigthis.client.model.Webhooks;
import com.konfigthis.client.model.WebhooksUpdateWebhookRequest;
import com.konfigthis.client.model.WebhooksUpdateWebhookRequestTarget;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Disabled
public class WebhooksApiTest {

    private static WebhooksApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new WebhooksApi(apiClient);
    }

    /**
     * Get webhook
     *
     * Retrieves a specific webhook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificWebhookTest() throws ApiException {
        String webhookId = null;
        Webhook response = api.getSpecificWebhook(webhookId)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove webhook
     *
     * Deletes a webhook.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeTest() throws ApiException {
        String webhookId = null;
        api.remove(webhookId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update webhook
     *
     * Updates a webhook.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateWebhookTest() throws ApiException {
        String webhookId = null;
        WebhooksUpdateWebhookRequestTarget target = null;
        String address = null;
        List<String> triggers = null;
        Webhook response = api.updateWebhook(webhookId)
                .target(target)
                .address(address)
                .triggers(triggers)
                .execute();
        // TODO: test validations
    }

    /**
     * List all webhooks
     *
     * Returns all defined webhooks for the requesting application.  This API only returns webhooks that are applied to files or folders that are owned by the authenticated user. This means that an admin can not see webhooks created by a service account unless the admin has access to those folders, and vice versa.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhooksTest() throws ApiException {
        String marker = null;
        Long limit = null;
        Webhooks response = api.webhooks()
                .marker(marker)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Create webhook
     *
     * Creates a webhook.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhooks_0Test() throws ApiException {
        PostWebhooksRequestTarget target = null;
        String address = null;
        List<String> triggers = null;
        Webhook response = api.webhooks_0(target, address, triggers)
                .execute();
        // TODO: test validations
    }

}