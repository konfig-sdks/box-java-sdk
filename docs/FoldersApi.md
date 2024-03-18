# FoldersApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCopy**](FoldersApi.md#createCopy) | **POST** /folders/{folder_id}/copy | Copy folder |
| [**deleteById**](FoldersApi.md#deleteById) | **DELETE** /folders/{folder_id} | Delete folder |
| [**folders**](FoldersApi.md#folders) | **POST** /folders | Create folder |
| [**getFolderDetails**](FoldersApi.md#getFolderDetails) | **GET** /folders/{folder_id} | Get folder information |
| [**listItemsInFolder**](FoldersApi.md#listItemsInFolder) | **GET** /folders/{folder_id}/items | List items in folder |
| [**updateFolder**](FoldersApi.md#updateFolder) | **PUT** /folders/{folder_id} | Update folder |


<a name="createCopy"></a>
# **createCopy**
> FolderFull createCopy(folderId).fields(fields).foldersCreateCopyRequest(foldersCreateCopyRequest).execute();

Copy folder

Creates a copy of a folder within a destination folder.  The original folder will not be changed.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersApi;
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
    FoldersCreateCopyRequestParent parent = new FoldersCreateCopyRequestParent();
    String folderId = "0"; // The unique identifier of the folder to copy.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/folder/123` the `folder_id` is `123`.  The root folder with the ID `0` can not be copied.
    String name = "name_example"; // An optional new name for the copied folder.  There are some restrictions to the file name. Names containing non-printable ASCII characters, forward and backward slashes (`/`, `\\\\`), as well as names with trailing spaces are prohibited.  Additionally, the names `.` and `..` are not allowed either.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      FolderFull result = client
              .folders
              .createCopy(parent, folderId)
              .name(name)
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
      System.err.println("Exception when calling FoldersApi#createCopy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FolderFull> response = client
              .folders
              .createCopy(parent, folderId)
              .name(name)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#createCopy");
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
| **folderId** | **String**| The unique identifier of the folder to copy.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folder/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;.  The root folder with the ID &#x60;0&#x60; can not be copied. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **foldersCreateCopyRequest** | [**FoldersCreateCopyRequest**](FoldersCreateCopyRequest.md)|  | [optional] |

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
| **201** | Returns a new folder object representing the copied folder.  Not all available fields are returned by default. Use the [fields](https://raw.githubusercontent.com) query parameter to explicitly request any specific fields. |  -  |
| **304** | Returns an empty response when the &#x60;If-None-Match&#x60; header matches the current &#x60;etag&#x60; value of the folder. This indicates that the folder has not changed since it was last requested. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="deleteById"></a>
# **deleteById**
> deleteById(folderId).ifMatch(ifMatch).recursive(recursive).execute();

Delete folder

Deletes a folder, either permanently or by moving it to the trash.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersApi;
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
    String ifMatch = "1"; // Ensures this item hasn't recently changed before making changes.  Pass in the item's last observed `etag` value into this header and the endpoint will fail with a `412 Precondition Failed` if it has changed since.
    Boolean recursive = true; // Delete a folder that is not empty by recursively deleting the folder and all of its content.
    try {
      client
              .folders
              .deleteById(folderId)
              .ifMatch(ifMatch)
              .recursive(recursive)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .folders
              .deleteById(folderId)
              .ifMatch(ifMatch)
              .recursive(recursive)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#deleteById");
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
| **ifMatch** | **String**| Ensures this item hasn&#39;t recently changed before making changes.  Pass in the item&#39;s last observed &#x60;etag&#x60; value into this header and the endpoint will fail with a &#x60;412 Precondition Failed&#x60; if it has changed since. | [optional] |
| **recursive** | **Boolean**| Delete a folder that is not empty by recursively deleting the folder and all of its content. | [optional] |

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
| **204** | Returns an empty response when the folder is successfully deleted or moved to the trash. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="folders"></a>
# **folders**
> FolderFull folders().fields(fields).postFoldersRequest(postFoldersRequest).execute();

Create folder

Creates a new empty folder within the specified parent folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersApi;
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
    String name = "name_example"; // The name for the new folder.  There are some restrictions to the file name. Names containing non-printable ASCII characters, forward and backward slashes (`/`, `\\\\`), as well as names with trailing spaces are prohibited.  Additionally, the names `.` and `..` are not allowed either.
    PostFoldersRequestParent parent = new PostFoldersRequestParent();
    PostFoldersRequestFolderUploadEmail folderUploadEmail = new PostFoldersRequestFolderUploadEmail();
    String syncState = "synced"; // Specifies whether a folder should be synced to a user's device or not. This is used by Box Sync (discontinued) and is not used by Box Drive.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      FolderFull result = client
              .folders
              .folders(name, parent)
              .folderUploadEmail(folderUploadEmail)
              .syncState(syncState)
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
      System.err.println("Exception when calling FoldersApi#folders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FolderFull> response = client
              .folders
              .folders(name, parent)
              .folderUploadEmail(folderUploadEmail)
              .syncState(syncState)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#folders");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **postFoldersRequest** | [**PostFoldersRequest**](PostFoldersRequest.md)|  | [optional] |

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
| **201** | Returns a folder object.  Not all available fields are returned by default. Use the [fields](https://raw.githubusercontent.com) query parameter to explicitly request any specific fields. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getFolderDetails"></a>
# **getFolderDetails**
> FolderFull getFolderDetails(folderId).fields(fields).ifNoneMatch(ifNoneMatch).boxapi(boxapi).sort(sort).direction(direction).offset(offset).limit(limit).execute();

Get folder information

Retrieves details for a folder, including the first 100 entries in the folder.  Passing &#x60;sort&#x60;, &#x60;direction&#x60;, &#x60;offset&#x60;, and &#x60;limit&#x60; parameters in query allows you to manage the list of returned [folder items](r://folder--full#param-item-collection).  To fetch more items within the folder, use the [Get items in a folder](e://get-folders-id-items) endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.  Additionally this field can be used to query any metadata applied to the file by specifying the `metadata` field as well as the scope and key of the template to retrieve, for example `?field=metadata.enterprise_12345.contractTemplate`.
    String ifNoneMatch = "1"; // Ensures an item is only returned if it has changed.  Pass in the item's last observed `etag` value into this header and the endpoint will fail with a `304 Not Modified` if the item has not changed since.
    String boxapi = "shared_link=[link]&shared_link_password=[password]"; // The URL, and optional password, for the shared link of this item.  This header can be used to access items that have not been explicitly shared with a user.  Use the format `shared_link=[link]` or if a password is required then use `shared_link=[link]&shared_link_password=[password]`.  This header can be used on the file or folder shared, as well as on any files or folders nested within the item.
    String sort = "id"; // Defines the **second** attribute by which items are sorted.  The folder type affects the way the items are sorted:    * **Standard folder**:   Items are always sorted by   their `type` first, with   folders listed before files,   and files listed   before web links.    * **Root folder**:   This parameter is not supported   for marker-based pagination   on the root folder    (the folder with an `id` of `0`).    * **Shared folder with parent path   to the associated folder visible to   the collaborator**:   Items are always sorted by   their `type` first, with   folders listed before files,   and files listed   before web links.
    String direction = "ASC"; // The direction to sort results in. This can be either in alphabetical ascending (`ASC`) or descending (`DESC`) order.
    Long offset = 0L; // The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response.
    Long limit = 1000L; // The maximum number of items to return per page.
    try {
      FolderFull result = client
              .folders
              .getFolderDetails(folderId)
              .fields(fields)
              .ifNoneMatch(ifNoneMatch)
              .boxapi(boxapi)
              .sort(sort)
              .direction(direction)
              .offset(offset)
              .limit(limit)
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
      System.err.println("Exception when calling FoldersApi#getFolderDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FolderFull> response = client
              .folders
              .getFolderDetails(folderId)
              .fields(fields)
              .ifNoneMatch(ifNoneMatch)
              .boxapi(boxapi)
              .sort(sort)
              .direction(direction)
              .offset(offset)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#getFolderDetails");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.  Additionally this field can be used to query any metadata applied to the file by specifying the &#x60;metadata&#x60; field as well as the scope and key of the template to retrieve, for example &#x60;?field&#x3D;metadata.enterprise_12345.contractTemplate&#x60;. | [optional] |
| **ifNoneMatch** | **String**| Ensures an item is only returned if it has changed.  Pass in the item&#39;s last observed &#x60;etag&#x60; value into this header and the endpoint will fail with a &#x60;304 Not Modified&#x60; if the item has not changed since. | [optional] |
| **boxapi** | **String**| The URL, and optional password, for the shared link of this item.  This header can be used to access items that have not been explicitly shared with a user.  Use the format &#x60;shared_link&#x3D;[link]&#x60; or if a password is required then use &#x60;shared_link&#x3D;[link]&amp;shared_link_password&#x3D;[password]&#x60;.  This header can be used on the file or folder shared, as well as on any files or folders nested within the item. | [optional] |
| **sort** | **String**| Defines the **second** attribute by which items are sorted.  The folder type affects the way the items are sorted:    * **Standard folder**:   Items are always sorted by   their &#x60;type&#x60; first, with   folders listed before files,   and files listed   before web links.    * **Root folder**:   This parameter is not supported   for marker-based pagination   on the root folder    (the folder with an &#x60;id&#x60; of &#x60;0&#x60;).    * **Shared folder with parent path   to the associated folder visible to   the collaborator**:   Items are always sorted by   their &#x60;type&#x60; first, with   folders listed before files,   and files listed   before web links. | [optional] [enum: id, name, date, size] |
| **direction** | **String**| The direction to sort results in. This can be either in alphabetical ascending (&#x60;ASC&#x60;) or descending (&#x60;DESC&#x60;) order. | [optional] [enum: ASC, DESC] |
| **offset** | **Long**| The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response. | [optional] [default to 0] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |

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
| **200** | Returns a folder, including the first 100 entries in the folder. If you used query parameters like &#x60;sort&#x60;, &#x60;direction&#x60;, &#x60;offset&#x60;, or &#x60;limit&#x60; the *folder items list* will be affected accordingly.  To fetch more items within the folder, use the [Get items in a folder](e://get-folders-id-items)) endpoint.  Not all available fields are returned by default. Use the [fields](https://raw.githubusercontent.com) query parameter to explicitly request any specific fields. |  -  |
| **304** | Returns an empty response when the &#x60;If-None-Match&#x60; header matches the current &#x60;etag&#x60; value of the folder. This indicates that the folder has not changed since it was last requested. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listItemsInFolder"></a>
# **listItemsInFolder**
> Items listItemsInFolder(folderId).fields(fields).usemarker(usemarker).marker(marker).offset(offset).limit(limit).boxapi(boxapi).sort(sort).direction(direction).execute();

List items in folder

Retrieves a page of items in a folder. These items can be files, folders, and web links.  To request more information about the folder itself, like its size, use the [Get a folder](https://raw.githubusercontent.com) endpoint instead.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.  Additionally this field can be used to query any metadata applied to the file by specifying the `metadata` field as well as the scope and key of the template to retrieve, for example `?field=metadata.enterprise_12345.contractTemplate`.
    Boolean usemarker = true; // Specifies whether to use marker-based pagination instead of offset-based pagination. Only one pagination method can be used at a time.  By setting this value to true, the API will return a `marker` field that can be passed as a parameter to this endpoint to get the next page of the response.
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    Long offset = 0L; // The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response.
    Long limit = 1000L; // The maximum number of items to return per page.
    String boxapi = "shared_link=[link]&shared_link_password=[password]"; // The URL, and optional password, for the shared link of this item.  This header can be used to access items that have not been explicitly shared with a user.  Use the format `shared_link=[link]` or if a password is required then use `shared_link=[link]&shared_link_password=[password]`.  This header can be used on the file or folder shared, as well as on any files or folders nested within the item.
    String sort = "id"; // Defines the **second** attribute by which items are sorted.  The folder type affects the way the items are sorted:    * **Standard folder**:   Items are always sorted by   their `type` first, with   folders listed before files,   and files listed   before web links.    * **Root folder**:   This parameter is not supported   for marker-based pagination   on the root folder    (the folder with an `id` of `0`).    * **Shared folder with parent path   to the associated folder visible to   the collaborator**:   Items are always sorted by   their `type` first, with   folders listed before files,   and files listed   before web links.
    String direction = "ASC"; // The direction to sort results in. This can be either in alphabetical ascending (`ASC`) or descending (`DESC`) order.
    try {
      Items result = client
              .folders
              .listItemsInFolder(folderId)
              .fields(fields)
              .usemarker(usemarker)
              .marker(marker)
              .offset(offset)
              .limit(limit)
              .boxapi(boxapi)
              .sort(sort)
              .direction(direction)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCount());
      System.out.println(result.getLimit());
      System.out.println(result.getOffset());
      System.out.println(result.getOrder());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#listItemsInFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Items> response = client
              .folders
              .listItemsInFolder(folderId)
              .fields(fields)
              .usemarker(usemarker)
              .marker(marker)
              .offset(offset)
              .limit(limit)
              .boxapi(boxapi)
              .sort(sort)
              .direction(direction)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#listItemsInFolder");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.  Additionally this field can be used to query any metadata applied to the file by specifying the &#x60;metadata&#x60; field as well as the scope and key of the template to retrieve, for example &#x60;?field&#x3D;metadata.enterprise_12345.contractTemplate&#x60;. | [optional] |
| **usemarker** | **Boolean**| Specifies whether to use marker-based pagination instead of offset-based pagination. Only one pagination method can be used at a time.  By setting this value to true, the API will return a &#x60;marker&#x60; field that can be passed as a parameter to this endpoint to get the next page of the response. | [optional] |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |
| **offset** | **Long**| The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response. | [optional] [default to 0] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |
| **boxapi** | **String**| The URL, and optional password, for the shared link of this item.  This header can be used to access items that have not been explicitly shared with a user.  Use the format &#x60;shared_link&#x3D;[link]&#x60; or if a password is required then use &#x60;shared_link&#x3D;[link]&amp;shared_link_password&#x3D;[password]&#x60;.  This header can be used on the file or folder shared, as well as on any files or folders nested within the item. | [optional] |
| **sort** | **String**| Defines the **second** attribute by which items are sorted.  The folder type affects the way the items are sorted:    * **Standard folder**:   Items are always sorted by   their &#x60;type&#x60; first, with   folders listed before files,   and files listed   before web links.    * **Root folder**:   This parameter is not supported   for marker-based pagination   on the root folder    (the folder with an &#x60;id&#x60; of &#x60;0&#x60;).    * **Shared folder with parent path   to the associated folder visible to   the collaborator**:   Items are always sorted by   their &#x60;type&#x60; first, with   folders listed before files,   and files listed   before web links. | [optional] [enum: id, name, date, size] |
| **direction** | **String**| The direction to sort results in. This can be either in alphabetical ascending (&#x60;ASC&#x60;) or descending (&#x60;DESC&#x60;) order. | [optional] [enum: ASC, DESC] |

### Return type

[**Items**](Items.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of files, folders, and web links contained in a folder. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateFolder"></a>
# **updateFolder**
> FolderFull updateFolder(folderId).fields(fields).ifMatch(ifMatch).foldersUpdateFolderRequest(foldersUpdateFolderRequest).execute();

Update folder

Updates a folder. This can be also be used to move the folder, create shared links, update collaborations, and more.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersApi;
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
    List<String> tags = Arrays.asList(); // The tags for this item. These tags are shown in the Box web app and mobile apps next to an item.  To add or remove a tag, retrieve the item's current tags, modify them, and then update this field.  There is a limit of 100 tags per item, and 10,000 unique tags per enterprise.
    String description = "description_example"; // The optional description of this folder
    String name = "name_example"; // The optional new name for this folder.
    String syncState = "synced"; // Specifies whether a folder should be synced to a user's device or not. This is used by Box Sync (discontinued) and is not used by Box Drive.
    Boolean canNonOwnersInvite = true; // Specifies if users who are not the owner of the folder can invite new collaborators to the folder.
    FoldersUpdateFolderRequestParent parent = new FoldersUpdateFolderRequestParent();
    FoldersUpdateFolderRequestSharedLink sharedLink = new FoldersUpdateFolderRequestSharedLink();
    FoldersUpdateFolderRequestFolderUploadEmail folderUploadEmail = new FoldersUpdateFolderRequestFolderUploadEmail();
    Boolean isCollaborationRestrictedToEnterprise = true; // Specifies if new invites to this folder are restricted to users within the enterprise. This does not affect existing collaborations.
    List<Reference2> collections = Arrays.asList(); // An array of collections to make this folder a member of. Currently we only support the `favorites` collection.  To get the ID for a collection, use the [List all collections][1] endpoint.  Passing an empty array `[]` or `null` will remove the folder from all collections.  [1]: e://get-collections
    Boolean canNonOwnersViewCollaborators = true; // Restricts collaborators who are not the owner of this folder from viewing other collaborations on this folder.  It also restricts non-owners from inviting new collaborators.  When setting this field to `false`, it is required to also set `can_non_owners_invite_collaborators` to `false` if it has not already been set.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    String ifMatch = "1"; // Ensures this item hasn't recently changed before making changes.  Pass in the item's last observed `etag` value into this header and the endpoint will fail with a `412 Precondition Failed` if it has changed since.
    try {
      FolderFull result = client
              .folders
              .updateFolder(folderId)
              .tags(tags)
              .description(description)
              .name(name)
              .syncState(syncState)
              .canNonOwnersInvite(canNonOwnersInvite)
              .parent(parent)
              .sharedLink(sharedLink)
              .folderUploadEmail(folderUploadEmail)
              .isCollaborationRestrictedToEnterprise(isCollaborationRestrictedToEnterprise)
              .collections(collections)
              .canNonOwnersViewCollaborators(canNonOwnersViewCollaborators)
              .fields(fields)
              .ifMatch(ifMatch)
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
      System.err.println("Exception when calling FoldersApi#updateFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FolderFull> response = client
              .folders
              .updateFolder(folderId)
              .tags(tags)
              .description(description)
              .name(name)
              .syncState(syncState)
              .canNonOwnersInvite(canNonOwnersInvite)
              .parent(parent)
              .sharedLink(sharedLink)
              .folderUploadEmail(folderUploadEmail)
              .isCollaborationRestrictedToEnterprise(isCollaborationRestrictedToEnterprise)
              .collections(collections)
              .canNonOwnersViewCollaborators(canNonOwnersViewCollaborators)
              .fields(fields)
              .ifMatch(ifMatch)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#updateFolder");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **ifMatch** | **String**| Ensures this item hasn&#39;t recently changed before making changes.  Pass in the item&#39;s last observed &#x60;etag&#x60; value into this header and the endpoint will fail with a &#x60;412 Precondition Failed&#x60; if it has changed since. | [optional] |
| **foldersUpdateFolderRequest** | [**FoldersUpdateFolderRequest**](FoldersUpdateFolderRequest.md)|  | [optional] |

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
| **200** | Returns a folder object for the updated folder  Not all available fields are returned by default. Use the [fields](https://raw.githubusercontent.com) query parameter to explicitly request any specific fields.  This call will return synchronously. This holds true even when moving folders with a large a large number of items in all of its descendants. For very large folders, this means the call could take minutes or hours to return. |  -  |
| **0** | An unexpected client error. |  -  |

