# SharedLinksFoldersApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addLinkToFolder**](SharedLinksFoldersApi.md#addLinkToFolder) | **PUT** /folders/{folder_id}#add_shared_link | Add shared link to folder |
| [**findFolderBySharedLink**](SharedLinksFoldersApi.md#findFolderBySharedLink) | **GET** /shared_items#folders | Find folder for shared link |
| [**getSharedLinkForFolder**](SharedLinksFoldersApi.md#getSharedLinkForFolder) | **GET** /folders/{folder_id}#get_shared_link | Get shared link for folder |
| [**removeFromFolder**](SharedLinksFoldersApi.md#removeFromFolder) | **PUT** /folders/{folder_id}#remove_shared_link | Remove shared link from folder |
| [**updateFolderSharedLink**](SharedLinksFoldersApi.md#updateFolderSharedLink) | **PUT** /folders/{folder_id}#update_shared_link | Update shared link on folder |


<a name="addLinkToFolder"></a>
# **addLinkToFolder**
> FolderFull addLinkToFolder(folderId, fields).sharedLinksFoldersAddLinkToFolderRequest(sharedLinksFoldersAddLinkToFolderRequest).execute();

Add shared link to folder

Adds a shared link to a folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SharedLinksFoldersApi;
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
    String folderId = "12345"; // The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/folder/123` the `folder_id` is `123`.  The root folder of a Box account is always represented by the ID `0`.
    String fields = "shared_link"; // Explicitly request the `shared_link` fields to be returned for this item.
    SharedLinksFoldersAddLinkToFolderRequestSharedLink sharedLink = new SharedLinksFoldersAddLinkToFolderRequestSharedLink();
    try {
      FolderFull result = client
              .sharedLinksFolders
              .addLinkToFolder(folderId, fields)
              .sharedLink(sharedLink)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEtag());
      System.out.println(result.getType());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getDescription());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getSize());
      System.out.println(result.getPathCollection());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getContentCreatedAt());
      System.out.println(result.getContentModifiedAt());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getSharedLink());
      System.out.println(result.getFolderUploadEmail());
      System.out.println(result.getParent());
      System.out.println(result.getItemStatus());
      System.out.println(result.getItemCollection());
      System.out.println(result.getTags());
      System.out.println(result.getSyncState());
      System.out.println(result.getHasCollaborations());
      System.out.println(result.getPermissions());
      System.out.println(result.getCanNonOwnersInvite());
      System.out.println(result.getIsExternallyOwned());
      System.out.println(result.getMetadata());
      System.out.println(result.getIsCollaborationRestrictedToEnterprise());
      System.out.println(result.getAllowedSharedLinkAccessLevels());
      System.out.println(result.getAllowedInviteeRoles());
      System.out.println(result.getWatermarkInfo());
      System.out.println(result.getIsAccessibleViaSharedLink());
      System.out.println(result.getCanNonOwnersViewCollaborators());
      System.out.println(result.getClassification());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFoldersApi#addLinkToFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FolderFull> response = client
              .sharedLinksFolders
              .addLinkToFolder(folderId, fields)
              .sharedLink(sharedLink)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFoldersApi#addLinkToFolder");
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
| **folderId** | **String**| The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folder/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;.  The root folder of a Box account is always represented by the ID &#x60;0&#x60;. | |
| **fields** | **String**| Explicitly request the &#x60;shared_link&#x60; fields to be returned for this item. | |
| **sharedLinksFoldersAddLinkToFolderRequest** | [**SharedLinksFoldersAddLinkToFolderRequest**](SharedLinksFoldersAddLinkToFolderRequest.md)|  | [optional] |

### Return type

[**FolderFull**](FolderFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the base representation of a folder with a new shared link attached. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="findFolderBySharedLink"></a>
# **findFolderBySharedLink**
> FolderFull findFolderBySharedLink(boxapi).ifNoneMatch(ifNoneMatch).fields(fields).execute();

Find folder for shared link

Return the folder represented by a shared link.  A shared folder can be represented by a shared link, which can originate within the current enterprise or within another.  This endpoint allows an application to retrieve information about a shared folder when only given a shared link.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SharedLinksFoldersApi;
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
      FolderFull result = client
              .sharedLinksFolders
              .findFolderBySharedLink(boxapi)
              .ifNoneMatch(ifNoneMatch)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEtag());
      System.out.println(result.getType());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getDescription());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getSize());
      System.out.println(result.getPathCollection());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getContentCreatedAt());
      System.out.println(result.getContentModifiedAt());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getSharedLink());
      System.out.println(result.getFolderUploadEmail());
      System.out.println(result.getParent());
      System.out.println(result.getItemStatus());
      System.out.println(result.getItemCollection());
      System.out.println(result.getTags());
      System.out.println(result.getSyncState());
      System.out.println(result.getHasCollaborations());
      System.out.println(result.getPermissions());
      System.out.println(result.getCanNonOwnersInvite());
      System.out.println(result.getIsExternallyOwned());
      System.out.println(result.getMetadata());
      System.out.println(result.getIsCollaborationRestrictedToEnterprise());
      System.out.println(result.getAllowedSharedLinkAccessLevels());
      System.out.println(result.getAllowedInviteeRoles());
      System.out.println(result.getWatermarkInfo());
      System.out.println(result.getIsAccessibleViaSharedLink());
      System.out.println(result.getCanNonOwnersViewCollaborators());
      System.out.println(result.getClassification());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFoldersApi#findFolderBySharedLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FolderFull> response = client
              .sharedLinksFolders
              .findFolderBySharedLink(boxapi)
              .ifNoneMatch(ifNoneMatch)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFoldersApi#findFolderBySharedLink");
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

[**FolderFull**](FolderFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a full folder resource if the shared link is valid and the user has access to it. |  -  |
| **304** | Returns an empty response when the &#x60;If-None-Match&#x60; header matches the current &#x60;etag&#x60; value of the folder. This indicates that the folder has not changed since it was last requested. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getSharedLinkForFolder"></a>
# **getSharedLinkForFolder**
> FolderFull getSharedLinkForFolder(folderId, fields).execute();

Get shared link for folder

Gets the information for a shared link on a folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SharedLinksFoldersApi;
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
    String folderId = "12345"; // The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/folder/123` the `folder_id` is `123`.  The root folder of a Box account is always represented by the ID `0`.
    String fields = "shared_link"; // Explicitly request the `shared_link` fields to be returned for this item.
    try {
      FolderFull result = client
              .sharedLinksFolders
              .getSharedLinkForFolder(folderId, fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEtag());
      System.out.println(result.getType());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getDescription());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getSize());
      System.out.println(result.getPathCollection());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getContentCreatedAt());
      System.out.println(result.getContentModifiedAt());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getSharedLink());
      System.out.println(result.getFolderUploadEmail());
      System.out.println(result.getParent());
      System.out.println(result.getItemStatus());
      System.out.println(result.getItemCollection());
      System.out.println(result.getTags());
      System.out.println(result.getSyncState());
      System.out.println(result.getHasCollaborations());
      System.out.println(result.getPermissions());
      System.out.println(result.getCanNonOwnersInvite());
      System.out.println(result.getIsExternallyOwned());
      System.out.println(result.getMetadata());
      System.out.println(result.getIsCollaborationRestrictedToEnterprise());
      System.out.println(result.getAllowedSharedLinkAccessLevels());
      System.out.println(result.getAllowedInviteeRoles());
      System.out.println(result.getWatermarkInfo());
      System.out.println(result.getIsAccessibleViaSharedLink());
      System.out.println(result.getCanNonOwnersViewCollaborators());
      System.out.println(result.getClassification());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFoldersApi#getSharedLinkForFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FolderFull> response = client
              .sharedLinksFolders
              .getSharedLinkForFolder(folderId, fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFoldersApi#getSharedLinkForFolder");
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
| **folderId** | **String**| The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folder/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;.  The root folder of a Box account is always represented by the ID &#x60;0&#x60;. | |
| **fields** | **String**| Explicitly request the &#x60;shared_link&#x60; fields to be returned for this item. | |

### Return type

[**FolderFull**](FolderFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the base representation of a folder with the additional shared link information. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeFromFolder"></a>
# **removeFromFolder**
> FolderFull removeFromFolder(folderId, fields).sharedLinksFoldersRemoveFromFolderRequest(sharedLinksFoldersRemoveFromFolderRequest).execute();

Remove shared link from folder

Removes a shared link from a folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SharedLinksFoldersApi;
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
    String folderId = "12345"; // The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/folder/123` the `folder_id` is `123`.  The root folder of a Box account is always represented by the ID `0`.
    String fields = "shared_link"; // Explicitly request the `shared_link` fields to be returned for this item.
    Object sharedLink = null; // By setting this value to `null`, the shared link is removed from the folder.
    try {
      FolderFull result = client
              .sharedLinksFolders
              .removeFromFolder(folderId, fields)
              .sharedLink(sharedLink)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEtag());
      System.out.println(result.getType());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getDescription());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getSize());
      System.out.println(result.getPathCollection());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getContentCreatedAt());
      System.out.println(result.getContentModifiedAt());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getSharedLink());
      System.out.println(result.getFolderUploadEmail());
      System.out.println(result.getParent());
      System.out.println(result.getItemStatus());
      System.out.println(result.getItemCollection());
      System.out.println(result.getTags());
      System.out.println(result.getSyncState());
      System.out.println(result.getHasCollaborations());
      System.out.println(result.getPermissions());
      System.out.println(result.getCanNonOwnersInvite());
      System.out.println(result.getIsExternallyOwned());
      System.out.println(result.getMetadata());
      System.out.println(result.getIsCollaborationRestrictedToEnterprise());
      System.out.println(result.getAllowedSharedLinkAccessLevels());
      System.out.println(result.getAllowedInviteeRoles());
      System.out.println(result.getWatermarkInfo());
      System.out.println(result.getIsAccessibleViaSharedLink());
      System.out.println(result.getCanNonOwnersViewCollaborators());
      System.out.println(result.getClassification());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFoldersApi#removeFromFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FolderFull> response = client
              .sharedLinksFolders
              .removeFromFolder(folderId, fields)
              .sharedLink(sharedLink)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFoldersApi#removeFromFolder");
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
| **folderId** | **String**| The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folder/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;.  The root folder of a Box account is always represented by the ID &#x60;0&#x60;. | |
| **fields** | **String**| Explicitly request the &#x60;shared_link&#x60; fields to be returned for this item. | |
| **sharedLinksFoldersRemoveFromFolderRequest** | [**SharedLinksFoldersRemoveFromFolderRequest**](SharedLinksFoldersRemoveFromFolderRequest.md)|  | [optional] |

### Return type

[**FolderFull**](FolderFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a basic representation of a folder, with the shared link removed. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateFolderSharedLink"></a>
# **updateFolderSharedLink**
> FolderFull updateFolderSharedLink(folderId, fields).sharedLinksFoldersUpdateFolderSharedLinkRequest(sharedLinksFoldersUpdateFolderSharedLinkRequest).execute();

Update shared link on folder

Updates a shared link on a folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SharedLinksFoldersApi;
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
    String folderId = "12345"; // The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/folder/123` the `folder_id` is `123`.  The root folder of a Box account is always represented by the ID `0`.
    String fields = "shared_link"; // Explicitly request the `shared_link` fields to be returned for this item.
    SharedLinksFoldersUpdateFolderSharedLinkRequestSharedLink sharedLink = new SharedLinksFoldersUpdateFolderSharedLinkRequestSharedLink();
    try {
      FolderFull result = client
              .sharedLinksFolders
              .updateFolderSharedLink(folderId, fields)
              .sharedLink(sharedLink)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEtag());
      System.out.println(result.getType());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getDescription());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getSize());
      System.out.println(result.getPathCollection());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getContentCreatedAt());
      System.out.println(result.getContentModifiedAt());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getSharedLink());
      System.out.println(result.getFolderUploadEmail());
      System.out.println(result.getParent());
      System.out.println(result.getItemStatus());
      System.out.println(result.getItemCollection());
      System.out.println(result.getTags());
      System.out.println(result.getSyncState());
      System.out.println(result.getHasCollaborations());
      System.out.println(result.getPermissions());
      System.out.println(result.getCanNonOwnersInvite());
      System.out.println(result.getIsExternallyOwned());
      System.out.println(result.getMetadata());
      System.out.println(result.getIsCollaborationRestrictedToEnterprise());
      System.out.println(result.getAllowedSharedLinkAccessLevels());
      System.out.println(result.getAllowedInviteeRoles());
      System.out.println(result.getWatermarkInfo());
      System.out.println(result.getIsAccessibleViaSharedLink());
      System.out.println(result.getCanNonOwnersViewCollaborators());
      System.out.println(result.getClassification());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFoldersApi#updateFolderSharedLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FolderFull> response = client
              .sharedLinksFolders
              .updateFolderSharedLink(folderId, fields)
              .sharedLink(sharedLink)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SharedLinksFoldersApi#updateFolderSharedLink");
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
| **folderId** | **String**| The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folder/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;.  The root folder of a Box account is always represented by the ID &#x60;0&#x60;. | |
| **fields** | **String**| Explicitly request the &#x60;shared_link&#x60; fields to be returned for this item. | |
| **sharedLinksFoldersUpdateFolderSharedLinkRequest** | [**SharedLinksFoldersUpdateFolderSharedLinkRequest**](SharedLinksFoldersUpdateFolderSharedLinkRequest.md)|  | [optional] |

### Return type

[**FolderFull**](FolderFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a basic representation of the folder, with the updated shared link attached. |  -  |
| **0** | An unexpected client error. |  -  |

