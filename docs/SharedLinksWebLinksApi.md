# SharedLinksWebLinksApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addLinkToWebLink**](SharedLinksWebLinksApi.md#addLinkToWebLink) | **PUT** /web_links/{web_link_id}#add_shared_link | Add shared link to web link |
| [**findSharedWebLink**](SharedLinksWebLinksApi.md#findSharedWebLink) | **GET** /shared_items#web_links | Find web link for shared link |
| [**getLinkInfo**](SharedLinksWebLinksApi.md#getLinkInfo) | **GET** /web_links/{web_link_id}#get_shared_link | Get shared link for web link |
| [**removeSharedLink**](SharedLinksWebLinksApi.md#removeSharedLink) | **PUT** /web_links/{web_link_id}#remove_shared_link | Remove shared link from web link |
| [**updateSharedLink**](SharedLinksWebLinksApi.md#updateSharedLink) | **PUT** /web_links/{web_link_id}#update_shared_link | Update shared link on web link |


<a name="addLinkToWebLink"></a>
# **addLinkToWebLink**
> WebLink addLinkToWebLink(webLinkId, fields).sharedLinksWebLinksAddLinkToWebLinkRequest(sharedLinksWebLinksAddLinkToWebLinkRequest).execute();

Add shared link to web link

Adds a shared link to a web link.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SharedLinksWebLinksApi;
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
    String fields = "shared_link"; // Explicitly request the `shared_link` fields to be returned for this item.
    SharedLinksWebLinksAddLinkToWebLinkRequestSharedLink sharedLink = new SharedLinksWebLinksAddLinkToWebLinkRequestSharedLink();
    try {
      WebLink result = client
              .sharedLinksWebLinks
              .addLinkToWebLink(webLinkId, fields)
              .sharedLink(sharedLink)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getEtag());
      System.out.println(result.getUrl());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getDescription());
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
      System.err.println("Exception when calling SharedLinksWebLinksApi#addLinkToWebLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebLink> response = client
              .sharedLinksWebLinks
              .addLinkToWebLink(webLinkId, fields)
              .sharedLink(sharedLink)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksWebLinksApi#addLinkToWebLink");
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
| **fields** | **String**| Explicitly request the &#x60;shared_link&#x60; fields to be returned for this item. | |
| **sharedLinksWebLinksAddLinkToWebLinkRequest** | [**SharedLinksWebLinksAddLinkToWebLinkRequest**](SharedLinksWebLinksAddLinkToWebLinkRequest.md)|  | [optional] |

### Return type

[**WebLink**](WebLink.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the base representation of a web link with a new shared link attached. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="findSharedWebLink"></a>
# **findSharedWebLink**
> WebLink findSharedWebLink(boxapi).ifNoneMatch(ifNoneMatch).fields(fields).execute();

Find web link for shared link

Returns the web link represented by a shared link.  A shared web link can be represented by a shared link, which can originate within the current enterprise or within another.  This endpoint allows an application to retrieve information about a shared web link when only given a shared link.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SharedLinksWebLinksApi;
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
    String boxapi = "shared_link=[link]&shared_link_password=[password]"; // A header containing the shared link and optional password for the shared link.  The format for this header is as follows.  `shared_link=[link]&shared_link_password=[password]`
    String ifNoneMatch = "1"; // Ensures an item is only returned if it has changed.  Pass in the item's last observed `etag` value into this header and the endpoint will fail with a `304 Not Modified` if the item has not changed since.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      WebLink result = client
              .sharedLinksWebLinks
              .findSharedWebLink(boxapi)
              .ifNoneMatch(ifNoneMatch)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getEtag());
      System.out.println(result.getUrl());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getDescription());
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
      System.err.println("Exception when calling SharedLinksWebLinksApi#findSharedWebLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebLink> response = client
              .sharedLinksWebLinks
              .findSharedWebLink(boxapi)
              .ifNoneMatch(ifNoneMatch)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksWebLinksApi#findSharedWebLink");
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
| **boxapi** | **String**| A header containing the shared link and optional password for the shared link.  The format for this header is as follows.  &#x60;shared_link&#x3D;[link]&amp;shared_link_password&#x3D;[password]&#x60; | |
| **ifNoneMatch** | **String**| Ensures an item is only returned if it has changed.  Pass in the item&#39;s last observed &#x60;etag&#x60; value into this header and the endpoint will fail with a &#x60;304 Not Modified&#x60; if the item has not changed since. | [optional] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |

### Return type

[**WebLink**](WebLink.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a full file resource if the shared link is valid and the user has access to it. |  -  |
| **304** | Returns an empty response when the &#x60;If-None-Match&#x60; header matches the current &#x60;etag&#x60; value of the folder. This indicates that the folder has not changed since it was last requested. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getLinkInfo"></a>
# **getLinkInfo**
> WebLink getLinkInfo(webLinkId, fields).execute();

Get shared link for web link

Gets the information for a shared link on a web link.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SharedLinksWebLinksApi;
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
    String fields = "shared_link"; // Explicitly request the `shared_link` fields to be returned for this item.
    try {
      WebLink result = client
              .sharedLinksWebLinks
              .getLinkInfo(webLinkId, fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getEtag());
      System.out.println(result.getUrl());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getDescription());
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
      System.err.println("Exception when calling SharedLinksWebLinksApi#getLinkInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebLink> response = client
              .sharedLinksWebLinks
              .getLinkInfo(webLinkId, fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksWebLinksApi#getLinkInfo");
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
| **fields** | **String**| Explicitly request the &#x60;shared_link&#x60; fields to be returned for this item. | |

### Return type

[**WebLink**](WebLink.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the base representation of a web link with the additional shared link information. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeSharedLink"></a>
# **removeSharedLink**
> WebLink removeSharedLink(webLinkId, fields).sharedLinksWebLinksRemoveSharedLinkRequest(sharedLinksWebLinksRemoveSharedLinkRequest).execute();

Remove shared link from web link

Removes a shared link from a web link.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SharedLinksWebLinksApi;
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
    String fields = "shared_link"; // Explicitly request the `shared_link` fields to be returned for this item.
    Object sharedLink = null; // By setting this value to `null`, the shared link is removed from the web link.
    try {
      WebLink result = client
              .sharedLinksWebLinks
              .removeSharedLink(webLinkId, fields)
              .sharedLink(sharedLink)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getEtag());
      System.out.println(result.getUrl());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getDescription());
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
      System.err.println("Exception when calling SharedLinksWebLinksApi#removeSharedLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebLink> response = client
              .sharedLinksWebLinks
              .removeSharedLink(webLinkId, fields)
              .sharedLink(sharedLink)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksWebLinksApi#removeSharedLink");
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
| **fields** | **String**| Explicitly request the &#x60;shared_link&#x60; fields to be returned for this item. | |
| **sharedLinksWebLinksRemoveSharedLinkRequest** | [**SharedLinksWebLinksRemoveSharedLinkRequest**](SharedLinksWebLinksRemoveSharedLinkRequest.md)|  | [optional] |

### Return type

[**WebLink**](WebLink.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a basic representation of a web link, with the shared link removed. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateSharedLink"></a>
# **updateSharedLink**
> WebLink updateSharedLink(webLinkId, fields).sharedLinksWebLinksUpdateSharedLinkRequest(sharedLinksWebLinksUpdateSharedLinkRequest).execute();

Update shared link on web link

Updates a shared link on a web link.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SharedLinksWebLinksApi;
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
    String fields = "shared_link"; // Explicitly request the `shared_link` fields to be returned for this item.
    SharedLinksWebLinksUpdateSharedLinkRequestSharedLink sharedLink = new SharedLinksWebLinksUpdateSharedLinkRequestSharedLink();
    try {
      WebLink result = client
              .sharedLinksWebLinks
              .updateSharedLink(webLinkId, fields)
              .sharedLink(sharedLink)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getEtag());
      System.out.println(result.getUrl());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getDescription());
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
      System.err.println("Exception when calling SharedLinksWebLinksApi#updateSharedLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebLink> response = client
              .sharedLinksWebLinks
              .updateSharedLink(webLinkId, fields)
              .sharedLink(sharedLink)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksWebLinksApi#updateSharedLink");
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
| **fields** | **String**| Explicitly request the &#x60;shared_link&#x60; fields to be returned for this item. | |
| **sharedLinksWebLinksUpdateSharedLinkRequest** | [**SharedLinksWebLinksUpdateSharedLinkRequest**](SharedLinksWebLinksUpdateSharedLinkRequest.md)|  | [optional] |

### Return type

[**WebLink**](WebLink.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a basic representation of the web link, with the updated shared link attached. |  -  |
| **0** | An unexpected client error. |  -  |

