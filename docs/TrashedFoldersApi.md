# TrashedFoldersApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getdFolder**](TrashedFoldersApi.md#getdFolder) | **GET** /folders/{folder_id}/trash | Get trashed folder |
| [**permanentlyRemoveFolder**](TrashedFoldersApi.md#permanentlyRemoveFolder) | **DELETE** /folders/{folder_id}/trash | Permanently remove folder |
| [**restoreFolder**](TrashedFoldersApi.md#restoreFolder) | **POST** /folders/{folder_id} | Restore folder |


<a name="getdFolder"></a>
# **getdFolder**
> TrashFolder getdFolder(folderId).fields(fields).execute();

Get trashed folder

Retrieves a folder that has been moved to the trash.  Please note that only if the folder itself has been moved to the trash can it be retrieved with this API call. If instead one of its parent folders was moved to the trash, only that folder can be inspected using the [&#x60;GET /folders/:id/trash&#x60;](e://get_folders_id_trash) API.  To list all items that have been moved to the trash, please use the [&#x60;GET /folders/trash/items&#x60;](e://get-folders-trash-items/) API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrashedFoldersApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      TrashFolder result = client
              .trashedFolders
              .getdFolder(folderId)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getEtag());
      System.out.println(result.getType());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
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
    } catch (ApiException e) {
      System.err.println("Exception when calling TrashedFoldersApi#getdFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrashFolder> response = client
              .trashedFolders
              .getdFolder(folderId)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrashedFoldersApi#getdFolder");
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

### Return type

[**TrashFolder**](TrashFolder.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the folder that was trashed, including information about when the it was moved to the trash. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="permanentlyRemoveFolder"></a>
# **permanentlyRemoveFolder**
> permanentlyRemoveFolder(folderId).execute();

Permanently remove folder

Permanently deletes a folder that is in the trash. This action cannot be undone.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrashedFoldersApi;
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
    try {
      client
              .trashedFolders
              .permanentlyRemoveFolder(folderId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrashedFoldersApi#permanentlyRemoveFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .trashedFolders
              .permanentlyRemoveFolder(folderId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrashedFoldersApi#permanentlyRemoveFolder");
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
| **204** | Returns an empty response when the folder was permanently deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="restoreFolder"></a>
# **restoreFolder**
> TrashFolderRestored restoreFolder(folderId).fields(fields).trashedFoldersRestoreFolderRequest(trashedFoldersRestoreFolderRequest).execute();

Restore folder

Restores a folder that has been moved to the trash.  An optional new parent ID can be provided to restore the folder to in case the original folder has been deleted.  # Folder locking  During this operation, part of the file tree will be locked, mainly the source folder and all of its descendants, as well as the destination folder.  For the duration of the operation, no other move, copy, delete, or restore operation can performed on any of the locked folders.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrashedFoldersApi;
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
    String name = "name_example"; // An optional new name for the folder.
    TrashedFoldersRestoreFolderRequestParent parent = new TrashedFoldersRestoreFolderRequestParent();
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      TrashFolderRestored result = client
              .trashedFolders
              .restoreFolder(folderId)
              .name(name)
              .parent(parent)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getEtag());
      System.out.println(result.getType());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
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
    } catch (ApiException e) {
      System.err.println("Exception when calling TrashedFoldersApi#restoreFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrashFolderRestored> response = client
              .trashedFolders
              .restoreFolder(folderId)
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
      System.err.println("Exception when calling TrashedFoldersApi#restoreFolder");
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
| **trashedFoldersRestoreFolderRequest** | [**TrashedFoldersRestoreFolderRequest**](TrashedFoldersRestoreFolderRequest.md)|  | [optional] |

### Return type

[**TrashFolderRestored**](TrashFolderRestored.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a folder object when the folder has been restored. |  -  |
| **0** | An unexpected client error. |  -  |

