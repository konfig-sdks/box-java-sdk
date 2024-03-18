# StandardAndZonesStoragePolicyAssignmentsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAssignment**](StandardAndZonesStoragePolicyAssignmentsApi.md#createAssignment) | **POST** /storage_policy_assignments | Assign storage policy |
| [**getSpecificAssignment**](StandardAndZonesStoragePolicyAssignmentsApi.md#getSpecificAssignment) | **GET** /storage_policy_assignments/{storage_policy_assignment_id} | Get storage policy assignment |
| [**listAssignments**](StandardAndZonesStoragePolicyAssignmentsApi.md#listAssignments) | **GET** /storage_policy_assignments | List storage policy assignments |
| [**unassignStoragePolicy**](StandardAndZonesStoragePolicyAssignmentsApi.md#unassignStoragePolicy) | **DELETE** /storage_policy_assignments/{storage_policy_assignment_id} | Unassign storage policy |
| [**updateSpecificAssignment**](StandardAndZonesStoragePolicyAssignmentsApi.md#updateSpecificAssignment) | **PUT** /storage_policy_assignments/{storage_policy_assignment_id} | Update storage policy assignment |


<a name="createAssignment"></a>
# **createAssignment**
> StoragePolicyAssignment createAssignment().standardAndZonesStoragePolicyAssignmentsCreateAssignmentRequest(standardAndZonesStoragePolicyAssignmentsCreateAssignmentRequest).execute();

Assign storage policy

Creates a storage policy assignment for an enterprise or user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StandardAndZonesStoragePolicyAssignmentsApi;
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
    StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy storagePolicy = new StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy();
    StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestAssignedTo assignedTo = new StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestAssignedTo();
    try {
      StoragePolicyAssignment result = client
              .standardAndZonesStoragePolicyAssignments
              .createAssignment(storagePolicy, assignedTo)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getStoragePolicy());
      System.out.println(result.getAssignedTo());
    } catch (ApiException e) {
      System.err.println("Exception when calling StandardAndZonesStoragePolicyAssignmentsApi#createAssignment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StoragePolicyAssignment> response = client
              .standardAndZonesStoragePolicyAssignments
              .createAssignment(storagePolicy, assignedTo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StandardAndZonesStoragePolicyAssignmentsApi#createAssignment");
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
| **standardAndZonesStoragePolicyAssignmentsCreateAssignmentRequest** | [**StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequest**](StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequest.md)|  | [optional] |

### Return type

[**StoragePolicyAssignment**](StoragePolicyAssignment.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the new storage policy assignment created. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getSpecificAssignment"></a>
# **getSpecificAssignment**
> StoragePolicyAssignment getSpecificAssignment(storagePolicyAssignmentId).execute();

Get storage policy assignment

Fetches a specific storage policy assignment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StandardAndZonesStoragePolicyAssignmentsApi;
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
    String storagePolicyAssignmentId = "932483"; // The ID of the storage policy assignment.
    try {
      StoragePolicyAssignment result = client
              .standardAndZonesStoragePolicyAssignments
              .getSpecificAssignment(storagePolicyAssignmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getStoragePolicy());
      System.out.println(result.getAssignedTo());
    } catch (ApiException e) {
      System.err.println("Exception when calling StandardAndZonesStoragePolicyAssignmentsApi#getSpecificAssignment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StoragePolicyAssignment> response = client
              .standardAndZonesStoragePolicyAssignments
              .getSpecificAssignment(storagePolicyAssignmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StandardAndZonesStoragePolicyAssignmentsApi#getSpecificAssignment");
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
| **storagePolicyAssignmentId** | **String**| The ID of the storage policy assignment. | |

### Return type

[**StoragePolicyAssignment**](StoragePolicyAssignment.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a storage policy assignment object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listAssignments"></a>
# **listAssignments**
> StoragePolicyAssignments listAssignments(resolvedForType, resolvedForId).marker(marker).execute();

List storage policy assignments

Fetches all the storage policy assignment for an enterprise or user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StandardAndZonesStoragePolicyAssignmentsApi;
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
    String resolvedForType = "user"; // The target type to return assignments for
    String resolvedForId = "984322"; // The ID of the user or enterprise to return assignments for
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    try {
      StoragePolicyAssignments result = client
              .standardAndZonesStoragePolicyAssignments
              .listAssignments(resolvedForType, resolvedForId)
              .marker(marker)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling StandardAndZonesStoragePolicyAssignmentsApi#listAssignments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StoragePolicyAssignments> response = client
              .standardAndZonesStoragePolicyAssignments
              .listAssignments(resolvedForType, resolvedForId)
              .marker(marker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StandardAndZonesStoragePolicyAssignmentsApi#listAssignments");
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
| **resolvedForType** | **String**| The target type to return assignments for | [enum: user, enterprise] |
| **resolvedForId** | **String**| The ID of the user or enterprise to return assignments for | |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |

### Return type

[**StoragePolicyAssignments**](StoragePolicyAssignments.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of storage policies for the enterprise or user. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="unassignStoragePolicy"></a>
# **unassignStoragePolicy**
> unassignStoragePolicy(storagePolicyAssignmentId).execute();

Unassign storage policy

Delete a storage policy assignment.  Deleting a storage policy assignment on a user will have the user inherit the enterprise&#39;s default storage policy.  There is a rate limit for calling this endpoint of only twice per user in a 24 hour time frame.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StandardAndZonesStoragePolicyAssignmentsApi;
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
    String storagePolicyAssignmentId = "932483"; // The ID of the storage policy assignment.
    try {
      client
              .standardAndZonesStoragePolicyAssignments
              .unassignStoragePolicy(storagePolicyAssignmentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StandardAndZonesStoragePolicyAssignmentsApi#unassignStoragePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .standardAndZonesStoragePolicyAssignments
              .unassignStoragePolicy(storagePolicyAssignmentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling StandardAndZonesStoragePolicyAssignmentsApi#unassignStoragePolicy");
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
| **storagePolicyAssignmentId** | **String**| The ID of the storage policy assignment. | |

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
| **204** | Returns an empty response when the storage policy assignment is successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateSpecificAssignment"></a>
# **updateSpecificAssignment**
> StoragePolicyAssignment updateSpecificAssignment(storagePolicyAssignmentId).standardAndZonesStoragePolicyAssignmentsUpdateSpecificAssignmentRequest(standardAndZonesStoragePolicyAssignmentsUpdateSpecificAssignmentRequest).execute();

Update storage policy assignment

Updates a specific storage policy assignment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StandardAndZonesStoragePolicyAssignmentsApi;
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
    StandardAndZonesStoragePolicyAssignmentsUpdateSpecificAssignmentRequestStoragePolicy storagePolicy = new StandardAndZonesStoragePolicyAssignmentsUpdateSpecificAssignmentRequestStoragePolicy();
    String storagePolicyAssignmentId = "932483"; // The ID of the storage policy assignment.
    try {
      StoragePolicyAssignment result = client
              .standardAndZonesStoragePolicyAssignments
              .updateSpecificAssignment(storagePolicy, storagePolicyAssignmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getStoragePolicy());
      System.out.println(result.getAssignedTo());
    } catch (ApiException e) {
      System.err.println("Exception when calling StandardAndZonesStoragePolicyAssignmentsApi#updateSpecificAssignment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StoragePolicyAssignment> response = client
              .standardAndZonesStoragePolicyAssignments
              .updateSpecificAssignment(storagePolicy, storagePolicyAssignmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StandardAndZonesStoragePolicyAssignmentsApi#updateSpecificAssignment");
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
| **storagePolicyAssignmentId** | **String**| The ID of the storage policy assignment. | |
| **standardAndZonesStoragePolicyAssignmentsUpdateSpecificAssignmentRequest** | [**StandardAndZonesStoragePolicyAssignmentsUpdateSpecificAssignmentRequest**](StandardAndZonesStoragePolicyAssignmentsUpdateSpecificAssignmentRequest.md)|  | [optional] |

### Return type

[**StoragePolicyAssignment**](StoragePolicyAssignment.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an updated storage policy assignment object. |  -  |
| **0** | An unexpected client error. |  -  |

