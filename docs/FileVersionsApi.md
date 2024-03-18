# FileVersionsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSpecificVersion**](FileVersionsApi.md#getSpecificVersion) | **GET** /files/{file_id}/versions/{file_version_id} | Get file version |
| [**listAllVersions**](FileVersionsApi.md#listAllVersions) | **GET** /files/{file_id}/versions | List all file versions |
| [**moveToTrash**](FileVersionsApi.md#moveToTrash) | **DELETE** /files/{file_id}/versions/{file_version_id} | Remove file version |
| [**promoteFileVersion**](FileVersionsApi.md#promoteFileVersion) | **POST** /files/{file_id}/versions/current | Promote file version |
| [**restoreVersion**](FileVersionsApi.md#restoreVersion) | **PUT** /files/{file_id}/versions/{file_version_id} | Restore file version |


<a name="getSpecificVersion"></a>
# **getSpecificVersion**
> FileVersionFull getSpecificVersion(fileId, fileVersionId).fields(fields).execute();

Get file version

Retrieve a specific version of a file.  Versions are only tracked for Box users with premium accounts.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileVersionsApi;
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
    String fileVersionId = "1234"; // The ID of the file version
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      FileVersionFull result = client
              .fileVersions
              .getSpecificVersion(fileId, fileVersionId)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getSha1());
      System.out.println(result.getName());
      System.out.println(result.getSize());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getTrashedBy());
      System.out.println(result.getRestoredAt());
      System.out.println(result.getRestoredBy());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getUploaderDisplayName());
      System.out.println(result.getVersionNumber());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionsApi#getSpecificVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileVersionFull> response = client
              .fileVersions
              .getSpecificVersion(fileId, fileVersionId)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionsApi#getSpecificVersion");
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
| **fileVersionId** | **String**| The ID of the file version | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |

### Return type

[**FileVersionFull**](FileVersionFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a specific version of a file.  Not all available fields are returned by default. Use the [fields](https://raw.githubusercontent.com) query parameter to explicitly request any specific fields. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listAllVersions"></a>
# **listAllVersions**
> FileVersions listAllVersions(fileId).fields(fields).limit(limit).offset(offset).execute();

List all file versions

Retrieve a list of the past versions for a file.  Versions are only tracked by Box users with premium accounts. To fetch the ID of the current version of a file, use the &#x60;GET /file/:id&#x60; API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileVersionsApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    Long limit = 1000L; // The maximum number of items to return per page.
    Long offset = 0L; // The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response.
    try {
      FileVersions result = client
              .fileVersions
              .listAllVersions(fileId)
              .fields(fields)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCount());
      System.out.println(result.getLimit());
      System.out.println(result.getOffset());
      System.out.println(result.getOrder());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionsApi#listAllVersions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileVersions> response = client
              .fileVersions
              .listAllVersions(fileId)
              .fields(fields)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionsApi#listAllVersions");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |
| **offset** | **Long**| The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response. | [optional] [default to 0] |

### Return type

[**FileVersions**](FileVersions.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an array of past versions for this file. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="moveToTrash"></a>
# **moveToTrash**
> moveToTrash(fileId, fileVersionId).ifMatch(ifMatch).execute();

Remove file version

Move a file version to the trash.  Versions are only tracked for Box users with premium accounts.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileVersionsApi;
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
    String fileVersionId = "1234"; // The ID of the file version
    String ifMatch = "1"; // Ensures this item hasn't recently changed before making changes.  Pass in the item's last observed `etag` value into this header and the endpoint will fail with a `412 Precondition Failed` if it has changed since.
    try {
      client
              .fileVersions
              .moveToTrash(fileId, fileVersionId)
              .ifMatch(ifMatch)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionsApi#moveToTrash");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .fileVersions
              .moveToTrash(fileId, fileVersionId)
              .ifMatch(ifMatch)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionsApi#moveToTrash");
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
| **fileVersionId** | **String**| The ID of the file version | |
| **ifMatch** | **String**| Ensures this item hasn&#39;t recently changed before making changes.  Pass in the item&#39;s last observed &#x60;etag&#x60; value into this header and the endpoint will fail with a &#x60;412 Precondition Failed&#x60; if it has changed since. | [optional] |

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
| **204** | Returns an empty response when the file has been successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="promoteFileVersion"></a>
# **promoteFileVersion**
> FileVersionFull promoteFileVersion(fileId).fields(fields).fileVersionsPromoteFileVersionRequest(fileVersionsPromoteFileVersionRequest).execute();

Promote file version

Promote a specific version of a file.  If previous versions exist, this method can be used to promote one of the older versions to the top of the version history.  This creates a new copy of the old version and puts it at the top of the versions history. The file will have the exact same contents as the older version, with the the same hash digest, &#x60;etag&#x60;, and name as the original.  Other properties such as comments do not get updated to their former values.  Don&#39;t use this endpoint to restore Box Notes, as it works with file formats such as PDF, DOC, PPTX or similar.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileVersionsApi;
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
    String id = "id_example"; // The file version ID
    String type = "file_version"; // The type to promote
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      FileVersionFull result = client
              .fileVersions
              .promoteFileVersion(fileId)
              .id(id)
              .type(type)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getSha1());
      System.out.println(result.getName());
      System.out.println(result.getSize());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getTrashedBy());
      System.out.println(result.getRestoredAt());
      System.out.println(result.getRestoredBy());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getUploaderDisplayName());
      System.out.println(result.getVersionNumber());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionsApi#promoteFileVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileVersionFull> response = client
              .fileVersions
              .promoteFileVersion(fileId)
              .id(id)
              .type(type)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionsApi#promoteFileVersion");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **fileVersionsPromoteFileVersionRequest** | [**FileVersionsPromoteFileVersionRequest**](FileVersionsPromoteFileVersionRequest.md)|  | [optional] |

### Return type

[**FileVersionFull**](FileVersionFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a newly created file version object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="restoreVersion"></a>
# **restoreVersion**
> FileVersionFull restoreVersion(fileId, fileVersionId).fileVersionsRestoreVersionRequest(fileVersionsRestoreVersionRequest).execute();

Restore file version

Restores a specific version of a file after it was deleted. Don&#39;t use this endpoint to restore Box Notes, as it works with file formats such as PDF, DOC, PPTX or similar.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileVersionsApi;
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
    String fileVersionId = "1234"; // The ID of the file version
    String trashedAt = "trashedAt_example"; // Set this to `null` to clear the date and restore the file.
    try {
      FileVersionFull result = client
              .fileVersions
              .restoreVersion(fileId, fileVersionId)
              .trashedAt(trashedAt)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getSha1());
      System.out.println(result.getName());
      System.out.println(result.getSize());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getTrashedBy());
      System.out.println(result.getRestoredAt());
      System.out.println(result.getRestoredBy());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getUploaderDisplayName());
      System.out.println(result.getVersionNumber());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionsApi#restoreVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileVersionFull> response = client
              .fileVersions
              .restoreVersion(fileId, fileVersionId)
              .trashedAt(trashedAt)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionsApi#restoreVersion");
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
| **fileVersionId** | **String**| The ID of the file version | |
| **fileVersionsRestoreVersionRequest** | [**FileVersionsRestoreVersionRequest**](FileVersionsRestoreVersionRequest.md)|  | [optional] |

### Return type

[**FileVersionFull**](FileVersionFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a restored file version object. |  -  |
| **0** | An unexpected client error. |  -  |

