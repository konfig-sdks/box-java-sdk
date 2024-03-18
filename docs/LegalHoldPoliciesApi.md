# LegalHoldPoliciesApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewPolicy**](LegalHoldPoliciesApi.md#createNewPolicy) | **POST** /legal_hold_policies | Create legal hold policy |
| [**getPolicy**](LegalHoldPoliciesApi.md#getPolicy) | **GET** /legal_hold_policies/{legal_hold_policy_id} | Get legal hold policy |
| [**listAll**](LegalHoldPoliciesApi.md#listAll) | **GET** /legal_hold_policies | List all legal hold policies |
| [**removePolicy**](LegalHoldPoliciesApi.md#removePolicy) | **DELETE** /legal_hold_policies/{legal_hold_policy_id} | Remove legal hold policy |
| [**updatePolicy**](LegalHoldPoliciesApi.md#updatePolicy) | **PUT** /legal_hold_policies/{legal_hold_policy_id} | Update legal hold policy |


<a name="createNewPolicy"></a>
# **createNewPolicy**
> LegalHoldPolicy createNewPolicy().legalHoldPoliciesCreateNewPolicyRequest(legalHoldPoliciesCreateNewPolicyRequest).execute();

Create legal hold policy

Create a new legal hold policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalHoldPoliciesApi;
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
    String policyName = "policyName_example"; // The name of the policy.
    String description = "description_example"; // A description for the policy.
    OffsetDateTime filterStartedAt = OffsetDateTime.now(); // The filter start date.  When this policy is applied using a `custodian` legal hold assignments, it will only apply to file versions created or uploaded inside of the date range. Other assignment types, such as folders and files, will ignore the date filter.  Required if `is_ongoing` is set to `false`.
    OffsetDateTime filterEndedAt = OffsetDateTime.now(); // The filter end date.  When this policy is applied using a `custodian` legal hold assignments, it will only apply to file versions created or uploaded inside of the date range. Other assignment types, such as folders and files, will ignore the date filter.  Required if `is_ongoing` is set to `false`.
    Boolean isOngoing = true; // Whether new assignments under this policy should continue applying to files even after initialization.  When this policy is applied using a legal hold assignment, it will continue applying the policy to any new file versions even after it has been applied.  For example, if a legal hold assignment is placed on a user today, and that user uploads a file tomorrow, that file will get held. This will continue until the policy is retired.  Required if no filter dates are set.
    try {
      LegalHoldPolicy result = client
              .legalHoldPolicies
              .createNewPolicy(policyName)
              .description(description)
              .filterStartedAt(filterStartedAt)
              .filterEndedAt(filterEndedAt)
              .isOngoing(isOngoing)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getDescription());
      System.out.println(result.getPolicyName());
      System.out.println(result.getStatus());
      System.out.println(result.getAssignmentCounts());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getDeletedAt());
      System.out.println(result.getFilterStartedAt());
      System.out.println(result.getFilterEndedAt());
      System.out.println(result.getReleaseNotes());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPoliciesApi#createNewPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LegalHoldPolicy> response = client
              .legalHoldPolicies
              .createNewPolicy(policyName)
              .description(description)
              .filterStartedAt(filterStartedAt)
              .filterEndedAt(filterEndedAt)
              .isOngoing(isOngoing)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPoliciesApi#createNewPolicy");
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
| **legalHoldPoliciesCreateNewPolicyRequest** | [**LegalHoldPoliciesCreateNewPolicyRequest**](LegalHoldPoliciesCreateNewPolicyRequest.md)|  | [optional] |

### Return type

[**LegalHoldPolicy**](LegalHoldPolicy.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a new legal hold policy object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getPolicy"></a>
# **getPolicy**
> LegalHoldPolicy getPolicy(legalHoldPolicyId).execute();

Get legal hold policy

Retrieve a legal hold policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalHoldPoliciesApi;
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
    String legalHoldPolicyId = "324432"; // The ID of the legal hold policy
    try {
      LegalHoldPolicy result = client
              .legalHoldPolicies
              .getPolicy(legalHoldPolicyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getDescription());
      System.out.println(result.getPolicyName());
      System.out.println(result.getStatus());
      System.out.println(result.getAssignmentCounts());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getDeletedAt());
      System.out.println(result.getFilterStartedAt());
      System.out.println(result.getFilterEndedAt());
      System.out.println(result.getReleaseNotes());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPoliciesApi#getPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LegalHoldPolicy> response = client
              .legalHoldPolicies
              .getPolicy(legalHoldPolicyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPoliciesApi#getPolicy");
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
| **legalHoldPolicyId** | **String**| The ID of the legal hold policy | |

### Return type

[**LegalHoldPolicy**](LegalHoldPolicy.md)

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

<a name="listAll"></a>
# **listAll**
> LegalHoldPolicies listAll().policyName(policyName).fields(fields).marker(marker).limit(limit).execute();

List all legal hold policies

Retrieves a list of legal hold policies that belong to an enterprise.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalHoldPoliciesApi;
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
    String policyName = "Sales Policy"; // Limits results to policies for which the names start with this search term. This is a case-insensitive prefix.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    Long limit = 1000L; // The maximum number of items to return per page.
    try {
      LegalHoldPolicies result = client
              .legalHoldPolicies
              .listAll()
              .policyName(policyName)
              .fields(fields)
              .marker(marker)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPoliciesApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LegalHoldPolicies> response = client
              .legalHoldPolicies
              .listAll()
              .policyName(policyName)
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
      System.err.println("Exception when calling LegalHoldPoliciesApi#listAll");
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
| **policyName** | **String**| Limits results to policies for which the names start with this search term. This is a case-insensitive prefix. | [optional] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |

### Return type

[**LegalHoldPolicies**](LegalHoldPolicies.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of legal hold policies. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removePolicy"></a>
# **removePolicy**
> removePolicy(legalHoldPolicyId).execute();

Remove legal hold policy

Delete an existing legal hold policy.  This is an asynchronous process. The policy will not be fully deleted yet when the response returns.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalHoldPoliciesApi;
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
    String legalHoldPolicyId = "324432"; // The ID of the legal hold policy
    try {
      client
              .legalHoldPolicies
              .removePolicy(legalHoldPolicyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPoliciesApi#removePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .legalHoldPolicies
              .removePolicy(legalHoldPolicyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPoliciesApi#removePolicy");
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
| **legalHoldPolicyId** | **String**| The ID of the legal hold policy | |

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
| **202** | A blank response is returned if the policy was successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updatePolicy"></a>
# **updatePolicy**
> LegalHoldPolicy updatePolicy(legalHoldPolicyId).legalHoldPoliciesUpdatePolicyRequest(legalHoldPoliciesUpdatePolicyRequest).execute();

Update legal hold policy

Update legal hold policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LegalHoldPoliciesApi;
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
    String legalHoldPolicyId = "324432"; // The ID of the legal hold policy
    String description = "description_example"; // A description for the policy.
    String policyName = "policyName_example"; // The name of the policy.
    String releaseNotes = "releaseNotes_example"; // Notes around why the policy was released.
    try {
      LegalHoldPolicy result = client
              .legalHoldPolicies
              .updatePolicy(legalHoldPolicyId)
              .description(description)
              .policyName(policyName)
              .releaseNotes(releaseNotes)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getDescription());
      System.out.println(result.getPolicyName());
      System.out.println(result.getStatus());
      System.out.println(result.getAssignmentCounts());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getDeletedAt());
      System.out.println(result.getFilterStartedAt());
      System.out.println(result.getFilterEndedAt());
      System.out.println(result.getReleaseNotes());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPoliciesApi#updatePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LegalHoldPolicy> response = client
              .legalHoldPolicies
              .updatePolicy(legalHoldPolicyId)
              .description(description)
              .policyName(policyName)
              .releaseNotes(releaseNotes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalHoldPoliciesApi#updatePolicy");
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
| **legalHoldPolicyId** | **String**| The ID of the legal hold policy | |
| **legalHoldPoliciesUpdatePolicyRequest** | [**LegalHoldPoliciesUpdatePolicyRequest**](LegalHoldPoliciesUpdatePolicyRequest.md)|  | [optional] |

### Return type

[**LegalHoldPolicy**](LegalHoldPolicy.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a new legal hold policy object. |  -  |
| **0** | An unexpected client error. |  -  |

