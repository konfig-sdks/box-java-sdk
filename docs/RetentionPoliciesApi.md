# RetentionPoliciesApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPolicy**](RetentionPoliciesApi.md#createPolicy) | **POST** /retention_policies | Create retention policy |
| [**deletePolicy**](RetentionPoliciesApi.md#deletePolicy) | **DELETE** /retention_policies/{retention_policy_id} | Delete retention policy |
| [**getPolicy**](RetentionPoliciesApi.md#getPolicy) | **GET** /retention_policies/{retention_policy_id} | Get retention policy |
| [**listAll**](RetentionPoliciesApi.md#listAll) | **GET** /retention_policies | List retention policies |
| [**updatePolicy**](RetentionPoliciesApi.md#updatePolicy) | **PUT** /retention_policies/{retention_policy_id} | Update retention policy |


<a name="createPolicy"></a>
# **createPolicy**
> RetentionPolicy createPolicy().retentionPoliciesCreatePolicyRequest(retentionPoliciesCreatePolicyRequest).execute();

Create retention policy

Creates a retention policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RetentionPoliciesApi;
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
    String policyName = "policyName_example"; // The name for the retention policy
    String policyType = "finite"; // The type of the retention policy. A retention policy type can either be `finite`, where a specific amount of time to retain the content is known upfront, or `indefinite`, where the amount of time to retain the content is still unknown.
    String dispositionAction = "permanently_delete"; // The disposition action of the retention policy. `permanently_delete` deletes the content retained by the policy permanently. `remove_retention` lifts retention policy from the content, allowing it to be deleted by users once the retention policy has expired.
    String description = "description_example"; // The additional text description of the retention policy.
    Object retentionLength = null;
    String retentionType = "modifiable"; // Specifies the retention type:  * `modifiable`: You can modify the retention policy. For example, you can add or remove folders, shorten or lengthen the policy duration, or delete the assignment. Use this type if your retention policy is not related to any regulatory purposes.  * `non_modifiable`: You can modify the retention policy only in a limited way: add a folder, lengthen the duration, retire the policy, change the disposition action or notification settings. You cannot perform other actions, such as deleting the assignment or shortening the policy duration. Use this type to ensure compliance with regulatory retention policies.
    Boolean canOwnerExtendRetention = true; // Whether the owner of a file will be allowed to extend the retention.
    Boolean areOwnersNotified = true; // Whether owner and co-owners of a file are notified when the policy nears expiration.
    List<UserMini> customNotificationRecipients = Arrays.asList(); // A list of users notified when the retention policy duration is about to end.
    try {
      RetentionPolicy result = client
              .retentionPolicies
              .createPolicy(policyName, policyType, dispositionAction)
              .description(description)
              .retentionLength(retentionLength)
              .retentionType(retentionType)
              .canOwnerExtendRetention(canOwnerExtendRetention)
              .areOwnersNotified(areOwnersNotified)
              .customNotificationRecipients(customNotificationRecipients)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getPolicyName());
      System.out.println(result.getRetentionLength());
      System.out.println(result.getDispositionAction());
      System.out.println(result.getDescription());
      System.out.println(result.getPolicyType());
      System.out.println(result.getRetentionType());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getCanOwnerExtendRetention());
      System.out.println(result.getAreOwnersNotified());
      System.out.println(result.getCustomNotificationRecipients());
      System.out.println(result.getAssignmentCounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPoliciesApi#createPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RetentionPolicy> response = client
              .retentionPolicies
              .createPolicy(policyName, policyType, dispositionAction)
              .description(description)
              .retentionLength(retentionLength)
              .retentionType(retentionType)
              .canOwnerExtendRetention(canOwnerExtendRetention)
              .areOwnersNotified(areOwnersNotified)
              .customNotificationRecipients(customNotificationRecipients)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPoliciesApi#createPolicy");
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
| **retentionPoliciesCreatePolicyRequest** | [**RetentionPoliciesCreatePolicyRequest**](RetentionPoliciesCreatePolicyRequest.md)|  | [optional] |

### Return type

[**RetentionPolicy**](RetentionPolicy.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a new retention policy object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="deletePolicy"></a>
# **deletePolicy**
> deletePolicy(retentionPolicyId).execute();

Delete retention policy

Permanently deletes a retention policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RetentionPoliciesApi;
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
    try {
      client
              .retentionPolicies
              .deletePolicy(retentionPolicyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPoliciesApi#deletePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .retentionPolicies
              .deletePolicy(retentionPolicyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPoliciesApi#deletePolicy");
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
| **204** | Returns an empty response when the policy has been deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getPolicy"></a>
# **getPolicy**
> RetentionPolicy getPolicy(retentionPolicyId).fields(fields).execute();

Get retention policy

Retrieves a retention policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RetentionPoliciesApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      RetentionPolicy result = client
              .retentionPolicies
              .getPolicy(retentionPolicyId)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getPolicyName());
      System.out.println(result.getRetentionLength());
      System.out.println(result.getDispositionAction());
      System.out.println(result.getDescription());
      System.out.println(result.getPolicyType());
      System.out.println(result.getRetentionType());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getCanOwnerExtendRetention());
      System.out.println(result.getAreOwnersNotified());
      System.out.println(result.getCustomNotificationRecipients());
      System.out.println(result.getAssignmentCounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPoliciesApi#getPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RetentionPolicy> response = client
              .retentionPolicies
              .getPolicy(retentionPolicyId)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPoliciesApi#getPolicy");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |

### Return type

[**RetentionPolicy**](RetentionPolicy.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the retention policy object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listAll"></a>
# **listAll**
> RetentionPolicies listAll().policyName(policyName).policyType(policyType).createdByUserId(createdByUserId).fields(fields).limit(limit).marker(marker).execute();

List retention policies

Retrieves all of the retention policies for an enterprise.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RetentionPoliciesApi;
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
    String policyName = "Sales Policy"; // Filters results by a case sensitive prefix of the name of retention policies.
    String policyType = "finite"; // Filters results by the type of retention policy.
    String createdByUserId = "21312321"; // Filters results by the ID of the user who created policy.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    Long limit = 1000L; // The maximum number of items to return per page.
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.
    try {
      RetentionPolicies result = client
              .retentionPolicies
              .listAll()
              .policyName(policyName)
              .policyType(policyType)
              .createdByUserId(createdByUserId)
              .fields(fields)
              .limit(limit)
              .marker(marker)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntries());
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPoliciesApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RetentionPolicies> response = client
              .retentionPolicies
              .listAll()
              .policyName(policyName)
              .policyType(policyType)
              .createdByUserId(createdByUserId)
              .fields(fields)
              .limit(limit)
              .marker(marker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPoliciesApi#listAll");
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
| **policyName** | **String**| Filters results by a case sensitive prefix of the name of retention policies. | [optional] |
| **policyType** | **String**| Filters results by the type of retention policy. | [optional] [enum: finite, indefinite] |
| **createdByUserId** | **String**| Filters results by the ID of the user who created policy. | [optional] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination. | [optional] |

### Return type

[**RetentionPolicies**](RetentionPolicies.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list retention policies in the enterprise. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updatePolicy"></a>
# **updatePolicy**
> RetentionPolicy updatePolicy(retentionPolicyId).retentionPoliciesUpdatePolicyRequest(retentionPoliciesUpdatePolicyRequest).execute();

Update retention policy

Updates a retention policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RetentionPoliciesApi;
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
    String description = "description_example"; // The additional text description of the retention policy.
    String policyName = "policyName_example"; // The name for the retention policy
    String dispositionAction = "permanently_delete";
    String retentionType = "retentionType_example"; // Specifies the retention type:  * `modifiable`: You can modify the retention policy. For example, you can add or remove folders, shorten or lengthen the policy duration, or delete the assignment. Use this type if your retention policy is not related to any regulatory purposes. * `non-modifiable`: You can modify the retention policy only in a limited way: add a folder, lengthen the duration, retire the policy, change the disposition action or notification settings. You cannot perform other actions, such as deleting the assignment or shortening the policy duration. Use this type to ensure compliance with regulatory retention policies.  When updating a retention policy, you can use `non-modifiable` type only. You can convert a `modifiable` policy to `non-modifiable`, but not the other way around.
    Object retentionLength = null;
    String status = "status_example"; // Used to retire a retention policy.  If not retiring a policy, do not include this parameter or set it to `null`.
    Boolean canOwnerExtendRetention = true; // Determines if the owner of items under the policy can extend the retention when the original retention duration is about to end.
    Boolean areOwnersNotified = true; // Determines if owners and co-owners of items under the policy are notified when the retention duration is about to end.
    List<UserBase> customNotificationRecipients = Arrays.asList(); // A list of users notified when the retention duration is about to end.
    try {
      RetentionPolicy result = client
              .retentionPolicies
              .updatePolicy(retentionPolicyId)
              .description(description)
              .policyName(policyName)
              .dispositionAction(dispositionAction)
              .retentionType(retentionType)
              .retentionLength(retentionLength)
              .status(status)
              .canOwnerExtendRetention(canOwnerExtendRetention)
              .areOwnersNotified(areOwnersNotified)
              .customNotificationRecipients(customNotificationRecipients)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getPolicyName());
      System.out.println(result.getRetentionLength());
      System.out.println(result.getDispositionAction());
      System.out.println(result.getDescription());
      System.out.println(result.getPolicyType());
      System.out.println(result.getRetentionType());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getCanOwnerExtendRetention());
      System.out.println(result.getAreOwnersNotified());
      System.out.println(result.getCustomNotificationRecipients());
      System.out.println(result.getAssignmentCounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPoliciesApi#updatePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RetentionPolicy> response = client
              .retentionPolicies
              .updatePolicy(retentionPolicyId)
              .description(description)
              .policyName(policyName)
              .dispositionAction(dispositionAction)
              .retentionType(retentionType)
              .retentionLength(retentionLength)
              .status(status)
              .canOwnerExtendRetention(canOwnerExtendRetention)
              .areOwnersNotified(areOwnersNotified)
              .customNotificationRecipients(customNotificationRecipients)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetentionPoliciesApi#updatePolicy");
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
| **retentionPoliciesUpdatePolicyRequest** | [**RetentionPoliciesUpdatePolicyRequest**](RetentionPoliciesUpdatePolicyRequest.md)|  | [optional] |

### Return type

[**RetentionPolicy**](RetentionPolicy.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated retention policy object. |  -  |
| **0** | An unexpected client error. |  -  |

