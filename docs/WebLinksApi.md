# WebLinksApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createObject**](WebLinksApi.md#createObject) | **POST** /web_links | Create web link |
| [**getInformation**](WebLinksApi.md#getInformation) | **GET** /web_links/{web_link_id} | Get web link |
| [**removeLink**](WebLinksApi.md#removeLink) | **DELETE** /web_links/{web_link_id} | Remove web link |
| [**updateObject**](WebLinksApi.md#updateObject) | **PUT** /web_links/{web_link_id} | Update web link |


<a name="createObject"></a>
# **createObject**
> WebLink createObject().webLinksCreateObjectRequest(webLinksCreateObjectRequest).execute();

Create web link

Creates a web link object within a folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebLinksApi;
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
    String url = "url_example"; // The URL that this web link links to. Must start with `\\\"http://\\\"` or `\\\"https://\\\"`.
    WebLinksCreateObjectRequestParent parent = new WebLinksCreateObjectRequestParent();
    String description = "description_example"; // Description of the web link.
    String name = "name_example"; // Name of the web link. Defaults to the URL if not set.
    try {
      WebLink result = client
              .webLinks
              .createObject(url, parent)
              .description(description)
              .name(name)
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
      System.err.println("Exception when calling WebLinksApi#createObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebLink> response = client
              .webLinks
              .createObject(url, parent)
              .description(description)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebLinksApi#createObject");
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
| **webLinksCreateObjectRequest** | [**WebLinksCreateObjectRequest**](WebLinksCreateObjectRequest.md)|  | [optional] |

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
| **200** | Returns the newly created web link object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getInformation"></a>
# **getInformation**
> WebLink getInformation(webLinkId).boxapi(boxapi).execute();

Get web link

Retrieve information about a web link.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebLinksApi;
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
    String boxapi = "shared_link=[link]&shared_link_password=[password]"; // The URL, and optional password, for the shared link of this item.  This header can be used to access items that have not been explicitly shared with a user.  Use the format `shared_link=[link]` or if a password is required then use `shared_link=[link]&shared_link_password=[password]`.  This header can be used on the file or folder shared, as well as on any files or folders nested within the item.
    try {
      WebLink result = client
              .webLinks
              .getInformation(webLinkId)
              .boxapi(boxapi)
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
      System.err.println("Exception when calling WebLinksApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebLink> response = client
              .webLinks
              .getInformation(webLinkId)
              .boxapi(boxapi)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebLinksApi#getInformation");
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
| **boxapi** | **String**| The URL, and optional password, for the shared link of this item.  This header can be used to access items that have not been explicitly shared with a user.  Use the format &#x60;shared_link&#x3D;[link]&#x60; or if a password is required then use &#x60;shared_link&#x3D;[link]&amp;shared_link_password&#x3D;[password]&#x60;.  This header can be used on the file or folder shared, as well as on any files or folders nested within the item. | [optional] |

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
| **200** | Returns the web link object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeLink"></a>
# **removeLink**
> removeLink(webLinkId).execute();

Remove web link

Deletes a web link.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebLinksApi;
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
              .webLinks
              .removeLink(webLinkId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebLinksApi#removeLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webLinks
              .removeLink(webLinkId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebLinksApi#removeLink");
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
| **204** | An empty response will be returned when the web link was successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateObject"></a>
# **updateObject**
> WebLink updateObject(webLinkId).webLinksUpdateObjectRequest(webLinksUpdateObjectRequest).execute();

Update web link

Updates a web link object.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebLinksApi;
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
    String description = "description_example"; // A new description of the web link.
    String url = "url_example"; // The new URL that the web link links to. Must start with `\\\"http://\\\"` or `\\\"https://\\\"`.
    WebLinksUpdateObjectRequestParent parent = new WebLinksUpdateObjectRequestParent();
    String name = "name_example"; // A new name for the web link. Defaults to the URL if not set.
    WebLinksUpdateObjectRequestSharedLink sharedLink = new WebLinksUpdateObjectRequestSharedLink();
    try {
      WebLink result = client
              .webLinks
              .updateObject(webLinkId)
              .description(description)
              .url(url)
              .parent(parent)
              .name(name)
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
      System.err.println("Exception when calling WebLinksApi#updateObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebLink> response = client
              .webLinks
              .updateObject(webLinkId)
              .description(description)
              .url(url)
              .parent(parent)
              .name(name)
              .sharedLink(sharedLink)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebLinksApi#updateObject");
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
| **webLinksUpdateObjectRequest** | [**WebLinksUpdateObjectRequest**](WebLinksUpdateObjectRequest.md)|  | [optional] |

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
| **200** | Returns the updated web link object. |  -  |
| **0** | An unexpected client error. |  -  |

