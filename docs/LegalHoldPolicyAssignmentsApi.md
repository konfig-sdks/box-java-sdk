# LegalHoldPolicyAssignmentsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignFileLegalHold**](LegalHoldPolicyAssignmentsApi.md#assignFileLegalHold) | **POST** /legal_hold_policy_assignments | Assign legal hold policy |
| [**getAssignment**](LegalHoldPolicyAssignmentsApi.md#getAssignment) | **GET** /legal_hold_policy_assignments/{legal_hold_policy_assignment_id} | Get legal hold policy assignment |
| [**getListItems**](LegalHoldPolicyAssignmentsApi.md#getListItems) | **GET** /legal_hold_policy_assignments | List legal hold policy assignments |
| [**listFileVersions**](LegalHoldPolicyAssignmentsApi.md#listFileVersions) | **GET** /legal_hold_policy_assignments/{legal_hold_policy_assignment_id}/files_on_hold | List current file versions for legal hold policy assignment |
| [**listPreviousFileVersions**](LegalHoldPolicyAssignmentsApi.md#listPreviousFileVersions) | **GET** /legal_hold_policy_assignments/{legal_hold_policy_assignment_id}/file_versions_on_hold | List previous file versions for legal hold policy assignment |
| [**unassignPolicy**](LegalHoldPolicyAssignmentsApi.md#unassignPolicy) | **DELETE** /legal_hold_policy_assignments/{legal_hold_policy_assignment_id} | Unassign legal hold policy |


<a name="assignFileLegalHold"></a>
# **assignFileLegalHold**
> LegalHoldPolicyAssignment assignFileLegalHold().legalHoldPolicyAssignmentsAssignFileLegalHoldRequest(legalHoldPolicyAssignmentsAssignFileLegalHoldRequest).execute();

Assign legal hold policy

Assign a legal hold to a file, file version, folder, or user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalHoldPolicyAssignmentsApi;
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
    String policyId = "policyId_example"; // The ID of the policy to assign.
    LegalHoldPolicyAssignmentsAssignFileLegalHoldRequestAssignTo assignTo = new LegalHoldPolicyAssignmentsAssignFileLegalHoldRequestAssignTo();
    try {
      LegalHoldPolicyAssignment result = client
              .legalHoldPolicyAssignments
              .assignFileLegalHold(policyId, assignTo)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getLegalHoldPolicy());
      System.out.println(result.getAssignedTo());
      System.out.println(result.getAssignedBy());
      System.out.println(result.getAssignedAt());
      System.out.println(result.getDeletedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPolicyAssignmentsApi#assignFileLegalHold");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LegalHoldPolicyAssignment> response = client
              .legalHoldPolicyAssignments
              .assignFileLegalHold(policyId, assignTo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPolicyAssignmentsApi#assignFileLegalHold");
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
| **legalHoldPolicyAssignmentsAssignFileLegalHoldRequest** | [**LegalHoldPolicyAssignmentsAssignFileLegalHoldRequest**](LegalHoldPolicyAssignmentsAssignFileLegalHoldRequest.md)|  | [optional] |

### Return type

[**LegalHoldPolicyAssignment**](LegalHoldPolicyAssignment.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a new legal hold policy assignment. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getAssignment"></a>
# **getAssignment**
> LegalHoldPolicyAssignment getAssignment(legalHoldPolicyAssignmentId).execute();

Get legal hold policy assignment

Retrieve a legal hold policy assignment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalHoldPolicyAssignmentsApi;
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
    String legalHoldPolicyAssignmentId = "753465"; // The ID of the legal hold policy assignment
    try {
      LegalHoldPolicyAssignment result = client
              .legalHoldPolicyAssignments
              .getAssignment(legalHoldPolicyAssignmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getLegalHoldPolicy());
      System.out.println(result.getAssignedTo());
      System.out.println(result.getAssignedBy());
      System.out.println(result.getAssignedAt());
      System.out.println(result.getDeletedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPolicyAssignmentsApi#getAssignment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LegalHoldPolicyAssignment> response = client
              .legalHoldPolicyAssignments
              .getAssignment(legalHoldPolicyAssignmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPolicyAssignmentsApi#getAssignment");
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
| **legalHoldPolicyAssignmentId** | **String**| The ID of the legal hold policy assignment | |

### Return type

[**LegalHoldPolicyAssignment**](LegalHoldPolicyAssignment.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a legal hold policy object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getListItems"></a>
# **getListItems**
> LegalHoldPolicyAssignments getListItems(policyId).assignToType(assignToType).assignToId(assignToId).marker(marker).limit(limit).fields(fields).execute();

List legal hold policy assignments

Retrieves a list of items a legal hold policy has been assigned to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalHoldPolicyAssignmentsApi;
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
    String policyId = "324432"; // The ID of the legal hold policy
    String assignToType = "file"; // Filters the results by the type of item the policy was applied to.
    String assignToId = "1234323"; // Filters the results by the ID of item the policy was applied to.
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    Long limit = 1000L; // The maximum number of items to return per page.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      LegalHoldPolicyAssignments result = client
              .legalHoldPolicyAssignments
              .getListItems(policyId)
              .assignToType(assignToType)
              .assignToId(assignToId)
              .marker(marker)
              .limit(limit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPolicyAssignmentsApi#getListItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LegalHoldPolicyAssignments> response = client
              .legalHoldPolicyAssignments
              .getListItems(policyId)
              .assignToType(assignToType)
              .assignToId(assignToId)
              .marker(marker)
              .limit(limit)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPolicyAssignmentsApi#getListItems");
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
| **policyId** | **String**| The ID of the legal hold policy | |
| **assignToType** | **String**| Filters the results by the type of item the policy was applied to. | [optional] [enum: file, file_version, folder, user] |
| **assignToId** | **String**| Filters the results by the ID of item the policy was applied to. | [optional] |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |

### Return type

[**LegalHoldPolicyAssignments**](LegalHoldPolicyAssignments.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of legal hold policy assignments. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listFileVersions"></a>
# **listFileVersions**
> FileVersionLegalHolds listFileVersions(legalHoldPolicyAssignmentId).marker(marker).limit(limit).fields(fields).execute();

List current file versions for legal hold policy assignment

Get a list of current file versions for a legal hold assignment.  In some cases you may want to get previous file versions instead. In these cases, use the &#x60;GET  /legal_hold_policy_assignments/:id/file_versions_on_hold&#x60; API instead to return any previous versions of a file for this legal hold policy assignment.  Due to ongoing re-architecture efforts this API might not return all file versions held for this policy ID. Instead, this API will only return the latest file version held in the newly developed architecture. The &#x60;GET /file_version_legal_holds&#x60; API can be used to fetch current and past versions of files held within the legacy architecture.  The &#x60;GET /legal_hold_policy_assignments?policy_id&#x3D;{id}&#x60; API can be used to find a list of policy assignments for a given policy ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalHoldPolicyAssignmentsApi;
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
    String legalHoldPolicyAssignmentId = "753465"; // The ID of the legal hold policy assignment
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    Long limit = 1000L; // The maximum number of items to return per page.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      FileVersionLegalHolds result = client
              .legalHoldPolicyAssignments
              .listFileVersions(legalHoldPolicyAssignmentId)
              .marker(marker)
              .limit(limit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPolicyAssignmentsApi#listFileVersions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileVersionLegalHolds> response = client
              .legalHoldPolicyAssignments
              .listFileVersions(legalHoldPolicyAssignmentId)
              .marker(marker)
              .limit(limit)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPolicyAssignmentsApi#listFileVersions");
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
| **legalHoldPolicyAssignmentId** | **String**| The ID of the legal hold policy assignment | |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |

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
| **200** | Returns the list of current file versions held under legal hold for a specific legal hold policy assignment. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listPreviousFileVersions"></a>
# **listPreviousFileVersions**
> FileVersionLegalHolds listPreviousFileVersions(legalHoldPolicyAssignmentId).marker(marker).limit(limit).fields(fields).execute();

List previous file versions for legal hold policy assignment

Get a list of previous file versions for a legal hold assignment.  In some cases you may only need the latest file versions instead. In these cases, use the &#x60;GET  /legal_hold_policy_assignments/:id/files_on_hold&#x60; API instead to return any current (latest) versions of a file for this legal hold policy assignment.  Due to ongoing re-architecture efforts this API might not return all files held for this policy ID. Instead, this API will only return past file versions held in the newly developed architecture. The &#x60;GET /file_version_legal_holds&#x60; API can be used to fetch current and past versions of files held within the legacy architecture.  The &#x60;GET /legal_hold_policy_assignments?policy_id&#x3D;{id}&#x60; API can be used to find a list of policy assignments for a given policy ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalHoldPolicyAssignmentsApi;
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
    String legalHoldPolicyAssignmentId = "753465"; // The ID of the legal hold policy assignment
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    Long limit = 1000L; // The maximum number of items to return per page.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      FileVersionLegalHolds result = client
              .legalHoldPolicyAssignments
              .listPreviousFileVersions(legalHoldPolicyAssignmentId)
              .marker(marker)
              .limit(limit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPolicyAssignmentsApi#listPreviousFileVersions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileVersionLegalHolds> response = client
              .legalHoldPolicyAssignments
              .listPreviousFileVersions(legalHoldPolicyAssignmentId)
              .marker(marker)
              .limit(limit)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPolicyAssignmentsApi#listPreviousFileVersions");
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
| **legalHoldPolicyAssignmentId** | **String**| The ID of the legal hold policy assignment | |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |

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
| **200** | Returns the list of previous file versions held under legal hold for a specific legal hold policy assignment. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="unassignPolicy"></a>
# **unassignPolicy**
> unassignPolicy(legalHoldPolicyAssignmentId).execute();

Unassign legal hold policy

Remove a legal hold from an item.  This is an asynchronous process. The policy will not be fully removed yet when the response returns.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalHoldPolicyAssignmentsApi;
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
    String legalHoldPolicyAssignmentId = "753465"; // The ID of the legal hold policy assignment
    try {
      client
              .legalHoldPolicyAssignments
              .unassignPolicy(legalHoldPolicyAssignmentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPolicyAssignmentsApi#unassignPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .legalHoldPolicyAssignments
              .unassignPolicy(legalHoldPolicyAssignmentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPolicyAssignmentsApi#unassignPolicy");
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
| **legalHoldPolicyAssignmentId** | **String**| The ID of the legal hold policy assignment | |

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
| **202** | A blank response is returned if the assignment was successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

