# FileVersionRetentionsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFileVersionRetentionInfo**](FileVersionRetentionsApi.md#getFileVersionRetentionInfo) | **GET** /file_version_retentions/{file_version_retention_id} | Get retention on file |
| [**listRetentions**](FileVersionRetentionsApi.md#listRetentions) | **GET** /file_version_retentions | List file version retentions |


<a name="getFileVersionRetentionInfo"></a>
# **getFileVersionRetentionInfo**
> FileVersionRetention getFileVersionRetentionInfo(fileVersionRetentionId).execute();

Get retention on file

Returns information about a file version retention.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileVersionRetentionsApi;
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
    String fileVersionRetentionId = "3424234"; // The ID of the file version retention
    try {
      FileVersionRetention result = client
              .fileVersionRetentions
              .getFileVersionRetentionInfo(fileVersionRetentionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getFileVersion());
      System.out.println(result.getFile());
      System.out.println(result.getAppliedAt());
      System.out.println(result.getDispositionAt());
      System.out.println(result.getWinningRetentionPolicy());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionRetentionsApi#getFileVersionRetentionInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileVersionRetention> response = client
              .fileVersionRetentions
              .getFileVersionRetentionInfo(fileVersionRetentionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionRetentionsApi#getFileVersionRetentionInfo");
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
| **fileVersionRetentionId** | **String**| The ID of the file version retention | |

### Return type

[**FileVersionRetention**](FileVersionRetention.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a file version retention object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listRetentions"></a>
# **listRetentions**
> FileVersionRetentions listRetentions().fileId(fileId).fileVersionId(fileVersionId).policyId(policyId).dispositionAction(dispositionAction).dispositionBefore(dispositionBefore).dispositionAfter(dispositionAfter).limit(limit).marker(marker).execute();

List file version retentions

Retrieves all file version retentions for the given enterprise.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileVersionRetentionsApi;
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
    String fileId = "43123123"; // Filters results by files with this ID.
    String fileVersionId = "1"; // Filters results by file versions with this ID.
    String policyId = "982312"; // Filters results by the retention policy with this ID.
    String dispositionAction = "permanently_delete"; // Filters results by the retention policy with this disposition action.
    String dispositionBefore = "2012-12-12T10:53:43-08:00"; // Filters results by files that will have their disposition come into effect before this date.
    String dispositionAfter = "2012-12-19T10:34:23-08:00"; // Filters results by files that will have their disposition come into effect after this date.
    Long limit = 1000L; // The maximum number of items to return per page.
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    try {
      FileVersionRetentions result = client
              .fileVersionRetentions
              .listRetentions()
              .fileId(fileId)
              .fileVersionId(fileVersionId)
              .policyId(policyId)
              .dispositionAction(dispositionAction)
              .dispositionBefore(dispositionBefore)
              .dispositionAfter(dispositionAfter)
              .limit(limit)
              .marker(marker)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionRetentionsApi#listRetentions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileVersionRetentions> response = client
              .fileVersionRetentions
              .listRetentions()
              .fileId(fileId)
              .fileVersionId(fileVersionId)
              .policyId(policyId)
              .dispositionAction(dispositionAction)
              .dispositionBefore(dispositionBefore)
              .dispositionAfter(dispositionAfter)
              .limit(limit)
              .marker(marker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionRetentionsApi#listRetentions");
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
| **fileId** | **String**| Filters results by files with this ID. | [optional] |
| **fileVersionId** | **String**| Filters results by file versions with this ID. | [optional] |
| **policyId** | **String**| Filters results by the retention policy with this ID. | [optional] |
| **dispositionAction** | **String**| Filters results by the retention policy with this disposition action. | [optional] [enum: permanently_delete, remove_retention] |
| **dispositionBefore** | **String**| Filters results by files that will have their disposition come into effect before this date. | [optional] |
| **dispositionAfter** | **String**| Filters results by files that will have their disposition come into effect after this date. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |

### Return type

[**FileVersionRetentions**](FileVersionRetentions.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of all file version retentions for the enterprise. |  -  |
| **0** | An unexpected client error. |  -  |

