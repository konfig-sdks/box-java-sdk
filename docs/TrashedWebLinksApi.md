# TrashedWebLinksApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTrashedLink**](TrashedWebLinksApi.md#getTrashedLink) | **GET** /web_links/{web_link_id}/trash | Get trashed web link |
| [**permanentlyRemove**](TrashedWebLinksApi.md#permanentlyRemove) | **DELETE** /web_links/{web_link_id}/trash | Permanently remove web link |
| [**restoreWebLink**](TrashedWebLinksApi.md#restoreWebLink) | **POST** /web_links/{web_link_id} | Restore web link |


<a name="getTrashedLink"></a>
# **getTrashedLink**
> TrashWebLink getTrashedLink(webLinkId).fields(fields).execute();

Get trashed web link

Retrieves a web link that has been moved to the trash.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrashedWebLinksApi;
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
    String webLinkId = "12345"; // The ID of the web link.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      TrashWebLink result = client
              .trashedWebLinks
              .getTrashedLink(webLinkId)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getType());
      System.out.println(result.getId());
      System.out.println(result.getSequenceId());
      System.out.println(result.getEtag());
      System.out.println(result.getName());
      System.out.println(result.getUrl());
      System.out.println(result.getParent());
      System.out.println(result.getPathCollection());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getSharedLink());
      System.out.println(result.getItemStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrashedWebLinksApi#getTrashedLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrashWebLink> response = client
              .trashedWebLinks
              .getTrashedLink(webLinkId)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrashedWebLinksApi#getTrashedLink");
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
| **webLinkId** | **String**| The ID of the web link. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |

### Return type

[**TrashWebLink**](TrashWebLink.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the web link that was trashed, including information about when the it was moved to the trash. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="permanentlyRemove"></a>
# **permanentlyRemove**
> permanentlyRemove(webLinkId).execute();

Permanently remove web link

Permanently deletes a web link that is in the trash. This action cannot be undone.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrashedWebLinksApi;
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
    String webLinkId = "12345"; // The ID of the web link.
    try {
      client
              .trashedWebLinks
              .permanentlyRemove(webLinkId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrashedWebLinksApi#permanentlyRemove");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .trashedWebLinks
              .permanentlyRemove(webLinkId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrashedWebLinksApi#permanentlyRemove");
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
| **webLinkId** | **String**| The ID of the web link. | |

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
| **204** | Returns an empty response when the web link was permanently deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="restoreWebLink"></a>
# **restoreWebLink**
> TrashWebLinkRestored restoreWebLink(webLinkId).fields(fields).trashedWebLinksRestoreWebLinkRequest(trashedWebLinksRestoreWebLinkRequest).execute();

Restore web link

Restores a web link that has been moved to the trash.  An optional new parent ID can be provided to restore the  web link to in case the original folder has been deleted.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrashedWebLinksApi;
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
    String webLinkId = "12345"; // The ID of the web link.
    String name = "name_example"; // An optional new name for the web link.
    TrashedWebLinksRestoreWebLinkRequestParent parent = new TrashedWebLinksRestoreWebLinkRequestParent();
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      TrashWebLinkRestored result = client
              .trashedWebLinks
              .restoreWebLink(webLinkId)
              .name(name)
              .parent(parent)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getType());
      System.out.println(result.getId());
      System.out.println(result.getSequenceId());
      System.out.println(result.getEtag());
      System.out.println(result.getName());
      System.out.println(result.getUrl());
      System.out.println(result.getParent());
      System.out.println(result.getPathCollection());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getSharedLink());
      System.out.println(result.getItemStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrashedWebLinksApi#restoreWebLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrashWebLinkRestored> response = client
              .trashedWebLinks
              .restoreWebLink(webLinkId)
              .name(name)
              .parent(parent)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrashedWebLinksApi#restoreWebLink");
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
| **webLinkId** | **String**| The ID of the web link. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **trashedWebLinksRestoreWebLinkRequest** | [**TrashedWebLinksRestoreWebLinkRequest**](TrashedWebLinksRestoreWebLinkRequest.md)|  | [optional] |

### Return type

[**TrashWebLinkRestored**](TrashWebLinkRestored.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a web link object when it has been restored. |  -  |
| **0** | An unexpected client error. |  -  |

