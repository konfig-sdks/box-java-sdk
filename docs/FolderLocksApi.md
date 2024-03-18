# FolderLocksApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](FolderLocksApi.md#create) | **POST** /folder_locks | Create folder lock |
| [**deleteFolderLock**](FolderLocksApi.md#deleteFolderLock) | **DELETE** /folder_locks/{folder_lock_id} | Delete folder lock |
| [**listDetails**](FolderLocksApi.md#listDetails) | **GET** /folder_locks | List folder locks |


<a name="create"></a>
# **create**
> FolderLock create().folderLocksCreateRequest(folderLocksCreateRequest).execute();

Create folder lock

Creates a folder lock on a folder, preventing it from being moved and/or deleted.  You must be authenticated as the owner or co-owner of the folder to use this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FolderLocksApi;
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
    FolderLocksCreateRequestFolder folder = new FolderLocksCreateRequestFolder();
    FolderLocksCreateRequestLockedOperations lockedOperations = new FolderLocksCreateRequestLockedOperations();
    try {
      FolderLock result = client
              .folderLocks
              .create(folder)
              .lockedOperations(lockedOperations)
              .execute();
      System.out.println(result);
      System.out.println(result.getFolder());
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getLockedOperations());
      System.out.println(result.getLockType());
    } catch (ApiException e) {
      System.err.println("Exception when calling FolderLocksApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FolderLock> response = client
              .folderLocks
              .create(folder)
              .lockedOperations(lockedOperations)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FolderLocksApi#create");
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
| **folderLocksCreateRequest** | [**FolderLocksCreateRequest**](FolderLocksCreateRequest.md)|  | [optional] |

### Return type

[**FolderLock**](FolderLock.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the instance of the folder lock that was applied to the folder, including the user that applied the lock and the operations set. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="deleteFolderLock"></a>
# **deleteFolderLock**
> deleteFolderLock(folderLockId).execute();

Delete folder lock

Deletes a folder lock on a given folder.  You must be authenticated as the owner or co-owner of the folder to use this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FolderLocksApi;
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
    String folderLockId = "12345"; // The ID of the folder lock.
    try {
      client
              .folderLocks
              .deleteFolderLock(folderLockId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FolderLocksApi#deleteFolderLock");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .folderLocks
              .deleteFolderLock(folderLockId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FolderLocksApi#deleteFolderLock");
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
| **folderLockId** | **String**| The ID of the folder lock. | |

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
| **204** | Returns an empty response when the folder lock is successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listDetails"></a>
# **listDetails**
> FolderLocks listDetails(folderId).execute();

List folder locks

Retrieves folder lock details for a given folder.  You must be authenticated as the owner or co-owner of the folder to use this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FolderLocksApi;
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
      FolderLocks result = client
              .folderLocks
              .listDetails(folderId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntries());
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
    } catch (ApiException e) {
      System.err.println("Exception when calling FolderLocksApi#listDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FolderLocks> response = client
              .folderLocks
              .listDetails(folderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FolderLocksApi#listDetails");
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

[**FolderLocks**](FolderLocks.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns details for all folder locks applied to the folder, including the lock type and user that applied the lock. |  -  |
| **0** | An unexpected client error. |  -  |

