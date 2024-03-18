# RetentionPolicyAssignmentsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRetentionAssignment**](RetentionPolicyAssignmentsApi.md#createRetentionAssignment) | **POST** /retention_policy_assignments | Assign retention policy |
| [**getAssignment**](RetentionPolicyAssignmentsApi.md#getAssignment) | **GET** /retention_policy_assignments/{retention_policy_assignment_id} | Get retention policy assignment |
| [**listAllAssignments**](RetentionPolicyAssignmentsApi.md#listAllAssignments) | **GET** /retention_policies/{retention_policy_id}/assignments | List retention policy assignments |
| [**listFileVersionsUnderRetention**](RetentionPolicyAssignmentsApi.md#listFileVersionsUnderRetention) | **GET** /retention_policy_assignments/{retention_policy_assignment_id}/file_versions_under_retention | Get file versions under retention |
| [**listFilesUnderRetention**](RetentionPolicyAssignmentsApi.md#listFilesUnderRetention) | **GET** /retention_policy_assignments/{retention_policy_assignment_id}/files_under_retention | Get files under retention |
| [**removeAssignment**](RetentionPolicyAssignmentsApi.md#removeAssignment) | **DELETE** /retention_policy_assignments/{retention_policy_assignment_id} | Remove retention policy assignment |


<a name="createRetentionAssignment"></a>
# **createRetentionAssignment**
> RetentionPolicyAssignment createRetentionAssignment().retentionPolicyAssignmentsCreateRetentionAssignmentRequest(retentionPolicyAssignmentsCreateRetentionAssignmentRequest).execute();

Assign retention policy

Assigns a retention policy to an item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RetentionPolicyAssignmentsApi;
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
    String policyId = "policyId_example"; // The ID of the retention policy to assign
    RetentionPolicyAssignmentsCreateRetentionAssignmentRequestAssignTo assignTo = new RetentionPolicyAssignmentsCreateRetentionAssignmentRequestAssignTo();
    List<RetentionPolicyAssignmentsCreateRetentionAssignmentRequestFilterFieldsInner> filterFields = Arrays.asList(); // If the `assign_to` type is `metadata_template`, then optionally add the `filter_fields` parameter which will require an array of objects with a field entry and a value entry. Currently only one object of `field` and `value` is supported.
    String startDateField = "startDateField_example"; // The date the retention policy assignment begins.  If the `assigned_to` type is `metadata_template`, this field can be a date field's metadata attribute key id.
    try {
      RetentionPolicyAssignment result = client
              .retentionPolicyAssignments
              .createRetentionAssignment(policyId, assignTo)
              .filterFields(filterFields)
              .startDateField(startDateField)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getRetentionPolicy());
      System.out.println(result.getAssignedTo());
      System.out.println(result.getFilterFields());
      System.out.println(result.getAssignedBy());
      System.out.println(result.getAssignedAt());
      System.out.println(result.getStartDateField());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPolicyAssignmentsApi#createRetentionAssignment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RetentionPolicyAssignment> response = client
              .retentionPolicyAssignments
              .createRetentionAssignment(policyId, assignTo)
              .filterFields(filterFields)
              .startDateField(startDateField)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPolicyAssignmentsApi#createRetentionAssignment");
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
| **retentionPolicyAssignmentsCreateRetentionAssignmentRequest** | [**RetentionPolicyAssignmentsCreateRetentionAssignmentRequest**](RetentionPolicyAssignmentsCreateRetentionAssignmentRequest.md)|  | [optional] |

### Return type

[**RetentionPolicyAssignment**](RetentionPolicyAssignment.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a new retention policy assignment object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getAssignment"></a>
# **getAssignment**
> RetentionPolicyAssignment getAssignment(retentionPolicyAssignmentId).fields(fields).execute();

Get retention policy assignment

Retrieves a retention policy assignment

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RetentionPolicyAssignmentsApi;
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
    String retentionPolicyAssignmentId = "1233123"; // The ID of the retention policy assignment.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      RetentionPolicyAssignment result = client
              .retentionPolicyAssignments
              .getAssignment(retentionPolicyAssignmentId)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getRetentionPolicy());
      System.out.println(result.getAssignedTo());
      System.out.println(result.getFilterFields());
      System.out.println(result.getAssignedBy());
      System.out.println(result.getAssignedAt());
      System.out.println(result.getStartDateField());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPolicyAssignmentsApi#getAssignment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RetentionPolicyAssignment> response = client
              .retentionPolicyAssignments
              .getAssignment(retentionPolicyAssignmentId)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPolicyAssignmentsApi#getAssignment");
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
| **retentionPolicyAssignmentId** | **String**| The ID of the retention policy assignment. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |

### Return type

[**RetentionPolicyAssignment**](RetentionPolicyAssignment.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the retention policy assignment object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listAllAssignments"></a>
# **listAllAssignments**
> RetentionPolicyAssignments listAllAssignments(retentionPolicyId).type(type).fields(fields).marker(marker).limit(limit).execute();

List retention policy assignments

Returns a list of all retention policy assignments associated with a specified retention policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RetentionPolicyAssignmentsApi;
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
    String retentionPolicyId = "982312"; // The ID of the retention policy.
    String type = "folder"; // The type of the retention policy assignment to retrieve.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.
    Long limit = 1000L; // The maximum number of items to return per page.
    try {
      RetentionPolicyAssignments result = client
              .retentionPolicyAssignments
              .listAllAssignments(retentionPolicyId)
              .type(type)
              .fields(fields)
              .marker(marker)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntries());
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPolicyAssignmentsApi#listAllAssignments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RetentionPolicyAssignments> response = client
              .retentionPolicyAssignments
              .listAllAssignments(retentionPolicyId)
              .type(type)
              .fields(fields)
              .marker(marker)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPolicyAssignmentsApi#listAllAssignments");
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
| **retentionPolicyId** | **String**| The ID of the retention policy. | |
| **type** | **String**| The type of the retention policy assignment to retrieve. | [optional] [enum: folder, enterprise, metadata_template] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |

### Return type

[**RetentionPolicyAssignments**](RetentionPolicyAssignments.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of the retention policy assignments associated with the specified retention policy. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listFileVersionsUnderRetention"></a>
# **listFileVersionsUnderRetention**
> FilesUnderRetention listFileVersionsUnderRetention(retentionPolicyAssignmentId).marker(marker).limit(limit).execute();

Get file versions under retention

Returns a list of file versions under retention for a retention policy assignment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RetentionPolicyAssignmentsApi;
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
    String retentionPolicyAssignmentId = "1233123"; // The ID of the retention policy assignment.
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    Long limit = 1000L; // The maximum number of items to return per page.
    try {
      FilesUnderRetention result = client
              .retentionPolicyAssignments
              .listFileVersionsUnderRetention(retentionPolicyAssignmentId)
              .marker(marker)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPolicyAssignmentsApi#listFileVersionsUnderRetention");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesUnderRetention> response = client
              .retentionPolicyAssignments
              .listFileVersionsUnderRetention(retentionPolicyAssignmentId)
              .marker(marker)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPolicyAssignmentsApi#listFileVersionsUnderRetention");
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
| **retentionPolicyAssignmentId** | **String**| The ID of the retention policy assignment. | |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |

### Return type

[**FilesUnderRetention**](FilesUnderRetention.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of file versions under retention that are associated with the specified retention policy assignment. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listFilesUnderRetention"></a>
# **listFilesUnderRetention**
> FilesUnderRetention listFilesUnderRetention(retentionPolicyAssignmentId).marker(marker).limit(limit).execute();

Get files under retention

Returns a list of files under retention for a retention policy assignment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RetentionPolicyAssignmentsApi;
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
    String retentionPolicyAssignmentId = "1233123"; // The ID of the retention policy assignment.
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    Long limit = 1000L; // The maximum number of items to return per page.
    try {
      FilesUnderRetention result = client
              .retentionPolicyAssignments
              .listFilesUnderRetention(retentionPolicyAssignmentId)
              .marker(marker)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPolicyAssignmentsApi#listFilesUnderRetention");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilesUnderRetention> response = client
              .retentionPolicyAssignments
              .listFilesUnderRetention(retentionPolicyAssignmentId)
              .marker(marker)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPolicyAssignmentsApi#listFilesUnderRetention");
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
| **retentionPolicyAssignmentId** | **String**| The ID of the retention policy assignment. | |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |

### Return type

[**FilesUnderRetention**](FilesUnderRetention.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of files under retention that are associated with the specified retention policy assignment. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeAssignment"></a>
# **removeAssignment**
> removeAssignment(retentionPolicyAssignmentId).execute();

Remove retention policy assignment

Removes a retention policy assignment applied to content.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RetentionPolicyAssignmentsApi;
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
    String retentionPolicyAssignmentId = "1233123"; // The ID of the retention policy assignment.
    try {
      client
              .retentionPolicyAssignments
              .removeAssignment(retentionPolicyAssignmentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPolicyAssignmentsApi#removeAssignment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .retentionPolicyAssignments
              .removeAssignment(retentionPolicyAssignmentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPolicyAssignmentsApi#removeAssignment");
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
| **retentionPolicyAssignmentId** | **String**| The ID of the retention policy assignment. | |

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
| **204** | Returns an empty response when the policy assignment is successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

