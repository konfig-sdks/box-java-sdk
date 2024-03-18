# FileVersionLegalHoldsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFileVersionLegalHoldInfo**](FileVersionLegalHoldsApi.md#getFileVersionLegalHoldInfo) | **GET** /file_version_legal_holds/{file_version_legal_hold_id} | Get file version legal hold |
| [**listFileVersionLegalHolds**](FileVersionLegalHoldsApi.md#listFileVersionLegalHolds) | **GET** /file_version_legal_holds | List file version legal holds |


<a name="getFileVersionLegalHoldInfo"></a>
# **getFileVersionLegalHoldInfo**
> FileVersionLegalHold getFileVersionLegalHoldInfo(fileVersionLegalHoldId).execute();

Get file version legal hold

Retrieves information about the legal hold policies assigned to a file version.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileVersionLegalHoldsApi;
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
    String fileVersionLegalHoldId = "2348213"; // The ID of the file version legal hold
    try {
      FileVersionLegalHold result = client
              .fileVersionLegalHolds
              .getFileVersionLegalHoldInfo(fileVersionLegalHoldId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getFileVersion());
      System.out.println(result.getFile());
      System.out.println(result.getLegalHoldPolicyAssignments());
      System.out.println(result.getDeletedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionLegalHoldsApi#getFileVersionLegalHoldInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileVersionLegalHold> response = client
              .fileVersionLegalHolds
              .getFileVersionLegalHoldInfo(fileVersionLegalHoldId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionLegalHoldsApi#getFileVersionLegalHoldInfo");
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
| **fileVersionLegalHoldId** | **String**| The ID of the file version legal hold | |

### Return type

[**FileVersionLegalHold**](FileVersionLegalHold.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the legal hold policy assignments for the file version. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listFileVersionLegalHolds"></a>
# **listFileVersionLegalHolds**
> FileVersionLegalHolds listFileVersionLegalHolds(policyId).marker(marker).limit(limit).execute();

List file version legal holds

Get a list of file versions on legal hold for a legal hold assignment.  Due to ongoing re-architecture efforts this API might not return all file versions for this policy ID.  Instead, this API will only return file versions held in the legacy architecture. Two new endpoints will available to request any file versions held in the new architecture.  For file versions held in the new architecture, the &#x60;GET /legal_hold_policy_assignments/:id/file_versions_on_hold&#x60; API can be used to return all past file versions available for this policy assignment, and the &#x60;GET /legal_hold_policy_assignments/:id/files_on_hold&#x60; API can be used to return any current (latest) versions of a file under legal hold.  The &#x60;GET /legal_hold_policy_assignments?policy_id&#x3D;{id}&#x60; API can be used to find a list of policy assignments for a given policy ID.  Once the re-architecture is completed this API will be deprecated.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileVersionLegalHoldsApi;
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
    String policyId = "133870"; // The ID of the legal hold policy to get the file version legal holds for.
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    Long limit = 1000L; // The maximum number of items to return per page.
    try {
      FileVersionLegalHolds result = client
              .fileVersionLegalHolds
              .listFileVersionLegalHolds(policyId)
              .marker(marker)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionLegalHoldsApi#listFileVersionLegalHolds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileVersionLegalHolds> response = client
              .fileVersionLegalHolds
              .listFileVersionLegalHolds(policyId)
              .marker(marker)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileVersionLegalHoldsApi#listFileVersionLegalHolds");
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
| **policyId** | **String**| The ID of the legal hold policy to get the file version legal holds for. | |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |

### Return type

[**FileVersionLegalHolds**](FileVersionLegalHolds.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the list of file version legal holds for a specific legal hold policy. |  -  |
| **0** | An unexpected client error. |  -  |

