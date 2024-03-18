# SharedLinksFilesApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSharedLinkToFile**](SharedLinksFilesApi.md#addSharedLinkToFile) | **PUT** /files/{file_id}#add_shared_link | Add shared link to file |
| [**getBySharedLink**](SharedLinksFilesApi.md#getBySharedLink) | **GET** /shared_items | Find file for shared link |
| [**getSharedLinkInfo**](SharedLinksFilesApi.md#getSharedLinkInfo) | **GET** /files/{file_id}#get_shared_link | Get shared link for file |
| [**removeSharedLink**](SharedLinksFilesApi.md#removeSharedLink) | **PUT** /files/{file_id}#remove_shared_link | Remove shared link from file |
| [**updateLinkOnFile**](SharedLinksFilesApi.md#updateLinkOnFile) | **PUT** /files/{file_id}#update_shared_link | Update shared link on file |


<a name="addSharedLinkToFile"></a>
# **addSharedLinkToFile**
> FileFull addSharedLinkToFile(fileId, fields).sharedLinksFilesAddSharedLinkToFileRequest(sharedLinksFilesAddSharedLinkToFileRequest).execute();

Add shared link to file

Adds a shared link to a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SharedLinksFilesApi;
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
    String fileId = "12345"; // The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/files/123` the `file_id` is `123`.
    String fields = "shared_link"; // Explicitly request the `shared_link` fields to be returned for this item.
    SharedLinksFilesAddSharedLinkToFileRequestSharedLink sharedLink = new SharedLinksFilesAddSharedLinkToFileRequestSharedLink();
    try {
      FileFull result = client
              .sharedLinksFiles
              .addSharedLinkToFile(fileId, fields)
              .sharedLink(sharedLink)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEtag());
      System.out.println(result.getType());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getSha1());
      System.out.println(result.getFileVersion());
      System.out.println(result.getDescription());
      System.out.println(result.getSize());
      System.out.println(result.getPathCollection());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getContentCreatedAt());
      System.out.println(result.getContentModifiedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getSharedLink());
      System.out.println(result.getParent());
      System.out.println(result.getItemStatus());
      System.out.println(result.getTags());
      System.out.println(result.getVersionNumber());
      System.out.println(result.getCommentCount());
      System.out.println(result.getPermissions());
      System.out.println(result.getLock());
      System.out.println(result.getExtension());
      System.out.println(result.getIsPackage());
      System.out.println(result.getExpiringEmbedLink());
      System.out.println(result.getWatermarkInfo());
      System.out.println(result.getIsAccessibleViaSharedLink());
      System.out.println(result.getAllowedInviteeRoles());
      System.out.println(result.getIsExternallyOwned());
      System.out.println(result.getHasCollaborations());
      System.out.println(result.getMetadata());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getRepresentations());
      System.out.println(result.getClassification());
      System.out.println(result.getUploaderDisplayName());
      System.out.println(result.getDispositionAt());
      System.out.println(result.getSharedLinkPermissionOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFilesApi#addSharedLinkToFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileFull> response = client
              .sharedLinksFiles
              .addSharedLinkToFile(fileId, fields)
              .sharedLink(sharedLink)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFilesApi#addSharedLinkToFile");
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
| **fileId** | **String**| The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/files/123&#x60; the &#x60;file_id&#x60; is &#x60;123&#x60;. | |
| **fields** | **String**| Explicitly request the &#x60;shared_link&#x60; fields to be returned for this item. | |
| **sharedLinksFilesAddSharedLinkToFileRequest** | [**SharedLinksFilesAddSharedLinkToFileRequest**](SharedLinksFilesAddSharedLinkToFileRequest.md)|  | [optional] |

### Return type

[**FileFull**](FileFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the base representation of a file with a new shared link attached. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getBySharedLink"></a>
# **getBySharedLink**
> FileFull getBySharedLink(boxapi).ifNoneMatch(ifNoneMatch).fields(fields).execute();

Find file for shared link

Returns the file represented by a shared link.  A shared file can be represented by a shared link, which can originate within the current enterprise or within another.  This endpoint allows an application to retrieve information about a shared file when only given a shared link.  The &#x60;shared_link_permission_options&#x60; array field can be returned by requesting it in the &#x60;fields&#x60; query parameter.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SharedLinksFilesApi;
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
      FileFull result = client
              .sharedLinksFiles
              .getBySharedLink(boxapi)
              .ifNoneMatch(ifNoneMatch)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEtag());
      System.out.println(result.getType());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getSha1());
      System.out.println(result.getFileVersion());
      System.out.println(result.getDescription());
      System.out.println(result.getSize());
      System.out.println(result.getPathCollection());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getContentCreatedAt());
      System.out.println(result.getContentModifiedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getSharedLink());
      System.out.println(result.getParent());
      System.out.println(result.getItemStatus());
      System.out.println(result.getTags());
      System.out.println(result.getVersionNumber());
      System.out.println(result.getCommentCount());
      System.out.println(result.getPermissions());
      System.out.println(result.getLock());
      System.out.println(result.getExtension());
      System.out.println(result.getIsPackage());
      System.out.println(result.getExpiringEmbedLink());
      System.out.println(result.getWatermarkInfo());
      System.out.println(result.getIsAccessibleViaSharedLink());
      System.out.println(result.getAllowedInviteeRoles());
      System.out.println(result.getIsExternallyOwned());
      System.out.println(result.getHasCollaborations());
      System.out.println(result.getMetadata());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getRepresentations());
      System.out.println(result.getClassification());
      System.out.println(result.getUploaderDisplayName());
      System.out.println(result.getDispositionAt());
      System.out.println(result.getSharedLinkPermissionOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFilesApi#getBySharedLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileFull> response = client
              .sharedLinksFiles
              .getBySharedLink(boxapi)
              .ifNoneMatch(ifNoneMatch)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFilesApi#getBySharedLink");
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

[**FileFull**](FileFull.md)

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

<a name="getSharedLinkInfo"></a>
# **getSharedLinkInfo**
> FileFull getSharedLinkInfo(fileId, fields).execute();

Get shared link for file

Gets the information for a shared link on a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SharedLinksFilesApi;
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
    String fileId = "12345"; // The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/files/123` the `file_id` is `123`.
    String fields = "shared_link"; // Explicitly request the `shared_link` fields to be returned for this item.
    try {
      FileFull result = client
              .sharedLinksFiles
              .getSharedLinkInfo(fileId, fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEtag());
      System.out.println(result.getType());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getSha1());
      System.out.println(result.getFileVersion());
      System.out.println(result.getDescription());
      System.out.println(result.getSize());
      System.out.println(result.getPathCollection());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getContentCreatedAt());
      System.out.println(result.getContentModifiedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getSharedLink());
      System.out.println(result.getParent());
      System.out.println(result.getItemStatus());
      System.out.println(result.getTags());
      System.out.println(result.getVersionNumber());
      System.out.println(result.getCommentCount());
      System.out.println(result.getPermissions());
      System.out.println(result.getLock());
      System.out.println(result.getExtension());
      System.out.println(result.getIsPackage());
      System.out.println(result.getExpiringEmbedLink());
      System.out.println(result.getWatermarkInfo());
      System.out.println(result.getIsAccessibleViaSharedLink());
      System.out.println(result.getAllowedInviteeRoles());
      System.out.println(result.getIsExternallyOwned());
      System.out.println(result.getHasCollaborations());
      System.out.println(result.getMetadata());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getRepresentations());
      System.out.println(result.getClassification());
      System.out.println(result.getUploaderDisplayName());
      System.out.println(result.getDispositionAt());
      System.out.println(result.getSharedLinkPermissionOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFilesApi#getSharedLinkInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileFull> response = client
              .sharedLinksFiles
              .getSharedLinkInfo(fileId, fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFilesApi#getSharedLinkInfo");
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
| **fileId** | **String**| The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/files/123&#x60; the &#x60;file_id&#x60; is &#x60;123&#x60;. | |
| **fields** | **String**| Explicitly request the &#x60;shared_link&#x60; fields to be returned for this item. | |

### Return type

[**FileFull**](FileFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the base representation of a file with the additional shared link information. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeSharedLink"></a>
# **removeSharedLink**
> FileFull removeSharedLink(fileId, fields).sharedLinksFilesRemoveSharedLinkRequest(sharedLinksFilesRemoveSharedLinkRequest).execute();

Remove shared link from file

Removes a shared link from a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SharedLinksFilesApi;
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
    String fileId = "12345"; // The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/files/123` the `file_id` is `123`.
    String fields = "shared_link"; // Explicitly request the `shared_link` fields to be returned for this item.
    Object sharedLink = null; // By setting this value to `null`, the shared link is removed from the file.
    try {
      FileFull result = client
              .sharedLinksFiles
              .removeSharedLink(fileId, fields)
              .sharedLink(sharedLink)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEtag());
      System.out.println(result.getType());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getSha1());
      System.out.println(result.getFileVersion());
      System.out.println(result.getDescription());
      System.out.println(result.getSize());
      System.out.println(result.getPathCollection());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getContentCreatedAt());
      System.out.println(result.getContentModifiedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getSharedLink());
      System.out.println(result.getParent());
      System.out.println(result.getItemStatus());
      System.out.println(result.getTags());
      System.out.println(result.getVersionNumber());
      System.out.println(result.getCommentCount());
      System.out.println(result.getPermissions());
      System.out.println(result.getLock());
      System.out.println(result.getExtension());
      System.out.println(result.getIsPackage());
      System.out.println(result.getExpiringEmbedLink());
      System.out.println(result.getWatermarkInfo());
      System.out.println(result.getIsAccessibleViaSharedLink());
      System.out.println(result.getAllowedInviteeRoles());
      System.out.println(result.getIsExternallyOwned());
      System.out.println(result.getHasCollaborations());
      System.out.println(result.getMetadata());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getRepresentations());
      System.out.println(result.getClassification());
      System.out.println(result.getUploaderDisplayName());
      System.out.println(result.getDispositionAt());
      System.out.println(result.getSharedLinkPermissionOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFilesApi#removeSharedLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileFull> response = client
              .sharedLinksFiles
              .removeSharedLink(fileId, fields)
              .sharedLink(sharedLink)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFilesApi#removeSharedLink");
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
| **fileId** | **String**| The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/files/123&#x60; the &#x60;file_id&#x60; is &#x60;123&#x60;. | |
| **fields** | **String**| Explicitly request the &#x60;shared_link&#x60; fields to be returned for this item. | |
| **sharedLinksFilesRemoveSharedLinkRequest** | [**SharedLinksFilesRemoveSharedLinkRequest**](SharedLinksFilesRemoveSharedLinkRequest.md)|  | [optional] |

### Return type

[**FileFull**](FileFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a basic representation of a file, with the shared link removed. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateLinkOnFile"></a>
# **updateLinkOnFile**
> FileFull updateLinkOnFile(fileId, fields).sharedLinksFilesUpdateLinkOnFileRequest(sharedLinksFilesUpdateLinkOnFileRequest).execute();

Update shared link on file

Updates a shared link on a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SharedLinksFilesApi;
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
    String fileId = "12345"; // The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/files/123` the `file_id` is `123`.
    String fields = "shared_link"; // Explicitly request the `shared_link` fields to be returned for this item.
    SharedLinksFilesUpdateLinkOnFileRequestSharedLink sharedLink = new SharedLinksFilesUpdateLinkOnFileRequestSharedLink();
    try {
      FileFull result = client
              .sharedLinksFiles
              .updateLinkOnFile(fileId, fields)
              .sharedLink(sharedLink)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEtag());
      System.out.println(result.getType());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getSha1());
      System.out.println(result.getFileVersion());
      System.out.println(result.getDescription());
      System.out.println(result.getSize());
      System.out.println(result.getPathCollection());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getContentCreatedAt());
      System.out.println(result.getContentModifiedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getSharedLink());
      System.out.println(result.getParent());
      System.out.println(result.getItemStatus());
      System.out.println(result.getTags());
      System.out.println(result.getVersionNumber());
      System.out.println(result.getCommentCount());
      System.out.println(result.getPermissions());
      System.out.println(result.getLock());
      System.out.println(result.getExtension());
      System.out.println(result.getIsPackage());
      System.out.println(result.getExpiringEmbedLink());
      System.out.println(result.getWatermarkInfo());
      System.out.println(result.getIsAccessibleViaSharedLink());
      System.out.println(result.getAllowedInviteeRoles());
      System.out.println(result.getIsExternallyOwned());
      System.out.println(result.getHasCollaborations());
      System.out.println(result.getMetadata());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getRepresentations());
      System.out.println(result.getClassification());
      System.out.println(result.getUploaderDisplayName());
      System.out.println(result.getDispositionAt());
      System.out.println(result.getSharedLinkPermissionOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFilesApi#updateLinkOnFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileFull> response = client
              .sharedLinksFiles
              .updateLinkOnFile(fileId, fields)
              .sharedLink(sharedLink)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFilesApi#updateLinkOnFile");
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
| **fileId** | **String**| The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/files/123&#x60; the &#x60;file_id&#x60; is &#x60;123&#x60;. | |
| **fields** | **String**| Explicitly request the &#x60;shared_link&#x60; fields to be returned for this item. | |
| **sharedLinksFilesUpdateLinkOnFileRequest** | [**SharedLinksFilesUpdateLinkOnFileRequest**](SharedLinksFilesUpdateLinkOnFileRequest.md)|  | [optional] |

### Return type

[**FileFull**](FileFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a basic representation of the file, with the updated shared link attached. |  -  |
| **0** | An unexpected client error. |  -  |

