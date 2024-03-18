# WebhooksApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSpecificWebhook**](WebhooksApi.md#getSpecificWebhook) | **GET** /webhooks/{webhook_id} | Get webhook |
| [**remove**](WebhooksApi.md#remove) | **DELETE** /webhooks/{webhook_id} | Remove webhook |
| [**updateWebhook**](WebhooksApi.md#updateWebhook) | **PUT** /webhooks/{webhook_id} | Update webhook |
| [**webhooks**](WebhooksApi.md#webhooks) | **GET** /webhooks | List all webhooks |
| [**webhooks_0**](WebhooksApi.md#webhooks_0) | **POST** /webhooks | Create webhook |


<a name="getSpecificWebhook"></a>
# **getSpecificWebhook**
> Webhook getSpecificWebhook(webhookId).execute();

Get webhook

Retrieves a specific webhook

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.box.com/2.0";
    
    // Configure OAuth2 access token for authorization: OAuth2Security
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Box client = new Box(configuration);
    String webhookId = "3321123"; // The ID of the webhook.
    try {
      Webhook result = client
              .webhooks
              .getSpecificWebhook(webhookId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getTarget());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getAddress());
      System.out.println(result.getTriggers());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getSpecificWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Webhook> response = client
              .webhooks
              .getSpecificWebhook(webhookId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getSpecificWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookId** | **String**| The ID of the webhook. | |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a webhook object |  -  |
| **0** | An unexpected client error. |  -  |

<a name="remove"></a>
# **remove**
> remove(webhookId).execute();

Remove webhook

Deletes a webhook.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.box.com/2.0";
    
    // Configure OAuth2 access token for authorization: OAuth2Security
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Box client = new Box(configuration);
    String webhookId = "3321123"; // The ID of the webhook.
    try {
      client
              .webhooks
              .remove(webhookId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#remove");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webhooks
              .remove(webhookId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#remove");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookId** | **String**| The ID of the webhook. | |

### Return type

null (empty response body)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | An empty response will be returned when the webhook was successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateWebhook"></a>
# **updateWebhook**
> Webhook updateWebhook(webhookId).webhooksUpdateWebhookRequest(webhooksUpdateWebhookRequest).execute();

Update webhook

Updates a webhook.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.box.com/2.0";
    
    // Configure OAuth2 access token for authorization: OAuth2Security
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Box client = new Box(configuration);
    String webhookId = "3321123"; // The ID of the webhook.
    WebhooksUpdateWebhookRequestTarget target = new WebhooksUpdateWebhookRequestTarget();
    String address = "address_example"; // The URL that is notified by this webhook
    List<String> triggers = Arrays.asList(); // An array of event names that this webhook is to be triggered for
    try {
      Webhook result = client
              .webhooks
              .updateWebhook(webhookId)
              .target(target)
              .address(address)
              .triggers(triggers)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getTarget());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getAddress());
      System.out.println(result.getTriggers());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#updateWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Webhook> response = client
              .webhooks
              .updateWebhook(webhookId)
              .target(target)
              .address(address)
              .triggers(triggers)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#updateWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookId** | **String**| The ID of the webhook. | |
| **webhooksUpdateWebhookRequest** | [**WebhooksUpdateWebhookRequest**](WebhooksUpdateWebhookRequest.md)|  | [optional] |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the new webhook object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="webhooks"></a>
# **webhooks**
> Webhooks webhooks().marker(marker).limit(limit).execute();

List all webhooks

Returns all defined webhooks for the requesting application.  This API only returns webhooks that are applied to files or folders that are owned by the authenticated user. This means that an admin can not see webhooks created by a service account unless the admin has access to those folders, and vice versa.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.box.com/2.0";
    
    // Configure OAuth2 access token for authorization: OAuth2Security
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Box client = new Box(configuration);
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    Long limit = 1000L; // The maximum number of items to return per page.
    try {
      Webhooks result = client
              .webhooks
              .webhooks()
              .marker(marker)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhooks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Webhooks> response = client
              .webhooks
              .webhooks()
              .marker(marker)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhooks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |

### Return type

[**Webhooks**](Webhooks.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of webhooks. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="webhooks_0"></a>
# **webhooks_0**
> Webhook webhooks_0().postWebhooksRequest(postWebhooksRequest).execute();

Create webhook

Creates a webhook.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.box.com/2.0";
    
    // Configure OAuth2 access token for authorization: OAuth2Security
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Box client = new Box(configuration);
    PostWebhooksRequestTarget target = new PostWebhooksRequestTarget();
    String address = "address_example"; // The URL that is notified by this webhook
    List<String> triggers = Arrays.asList(); // An array of event names that this webhook is to be triggered for
    try {
      Webhook result = client
              .webhooks
              .webhooks_0(target, address, triggers)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getTarget());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getAddress());
      System.out.println(result.getTriggers());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhooks_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Webhook> response = client
              .webhooks
              .webhooks_0(target, address, triggers)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhooks_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **postWebhooksRequest** | [**PostWebhooksRequest**](PostWebhooksRequest.md)|  | [optional] |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns the new webhook object. |  -  |
| **0** | An unexpected client error. |  -  |

