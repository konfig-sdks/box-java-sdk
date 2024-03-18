# MetadataCascadePoliciesApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applyToChildren**](MetadataCascadePoliciesApi.md#applyToChildren) | **POST** /metadata_cascade_policies/{metadata_cascade_policy_id}/apply | Force-apply metadata cascade policy to folder |
| [**createPolicy**](MetadataCascadePoliciesApi.md#createPolicy) | **POST** /metadata_cascade_policies | Create metadata cascade policy |
| [**getPolicyAssignedToFolder**](MetadataCascadePoliciesApi.md#getPolicyAssignedToFolder) | **GET** /metadata_cascade_policies/{metadata_cascade_policy_id} | Get metadata cascade policy |
| [**list**](MetadataCascadePoliciesApi.md#list) | **GET** /metadata_cascade_policies | List metadata cascade policies |
| [**removePolicy**](MetadataCascadePoliciesApi.md#removePolicy) | **DELETE** /metadata_cascade_policies/{metadata_cascade_policy_id} | Remove metadata cascade policy |


<a name="applyToChildren"></a>
# **applyToChildren**
> applyToChildren(metadataCascadePolicyId).metadataCascadePoliciesApplyToChildrenRequest(metadataCascadePoliciesApplyToChildrenRequest).execute();

Force-apply metadata cascade policy to folder

Force the metadata on a folder with a metadata cascade policy to be applied to all of its children. This can be used after creating a new cascade policy to enforce the metadata to be cascaded down to all existing files within that folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataCascadePoliciesApi;
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
    String conflictResolution = "none"; // Describes the desired behavior when dealing with the conflict where a metadata template already has an instance applied to a child.  * `none` will preserve the existing value on the file * `overwrite` will force-apply the templates values over   any existing values.
    String metadataCascadePolicyId = "6fd4ff89-8fc1-42cf-8b29-1890dedd26d7"; // The ID of the cascade policy to force-apply.
    try {
      client
              .metadataCascadePolicies
              .applyToChildren(conflictResolution, metadataCascadePolicyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataCascadePoliciesApi#applyToChildren");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .metadataCascadePolicies
              .applyToChildren(conflictResolution, metadataCascadePolicyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataCascadePoliciesApi#applyToChildren");
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
| **metadataCascadePolicyId** | **String**| The ID of the cascade policy to force-apply. | |
| **metadataCascadePoliciesApplyToChildrenRequest** | [**MetadataCascadePoliciesApplyToChildrenRequest**](MetadataCascadePoliciesApplyToChildrenRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns an empty response when the API call was successful. The metadata cascade operation will be performed asynchronously.  The API call will return directly, before the cascade operation is complete. There is currently no API to check for the status of this operation. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="createPolicy"></a>
# **createPolicy**
> MetadataCascadePolicy createPolicy().metadataCascadePoliciesCreatePolicyRequest(metadataCascadePoliciesCreatePolicyRequest).execute();

Create metadata cascade policy

Creates a new metadata cascade policy that applies a given metadata template to a given folder and automatically cascades it down to any files within that folder.  In order for the policy to be applied a metadata instance must first be applied to the folder the policy is to be applied to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataCascadePoliciesApi;
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
    String folderId = "folderId_example"; // The ID of the folder to apply the policy to. This folder will need to already have an instance of the targeted metadata template applied to it.
    String scope = "global"; // The scope of the targeted metadata template. This template will need to already have an instance applied to the targeted folder.
    String templateKey = "templateKey_example"; // The key of the targeted metadata template. This template will need to already have an instance applied to the targeted folder.  In many cases the template key is automatically derived of its display name, for example `Contract Template` would become `contractTemplate`. In some cases the creator of the template will have provided its own template key.  Please [list the templates for an enterprise][list], or get all instances on a [file][file] or [folder][folder] to inspect a template's key.  [list]: e://get-metadata-templates-enterprise [file]: e://get-files-id-metadata [folder]: e://get-folders-id-metadata
    try {
      MetadataCascadePolicy result = client
              .metadataCascadePolicies
              .createPolicy(folderId, scope, templateKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getOwnerEnterprise());
      System.out.println(result.getParent());
      System.out.println(result.getScope());
      System.out.println(result.getTemplateKey());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataCascadePoliciesApi#createPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataCascadePolicy> response = client
              .metadataCascadePolicies
              .createPolicy(folderId, scope, templateKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataCascadePoliciesApi#createPolicy");
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
| **metadataCascadePoliciesCreatePolicyRequest** | [**MetadataCascadePoliciesCreatePolicyRequest**](MetadataCascadePoliciesCreatePolicyRequest.md)|  | [optional] |

### Return type

[**MetadataCascadePolicy**](MetadataCascadePolicy.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a new of metadata cascade policy |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getPolicyAssignedToFolder"></a>
# **getPolicyAssignedToFolder**
> MetadataCascadePolicy getPolicyAssignedToFolder(metadataCascadePolicyId).execute();

Get metadata cascade policy

Retrieve a specific metadata cascade policy assigned to a folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataCascadePoliciesApi;
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
    String metadataCascadePolicyId = "6fd4ff89-8fc1-42cf-8b29-1890dedd26d7"; // The ID of the metadata cascade policy.
    try {
      MetadataCascadePolicy result = client
              .metadataCascadePolicies
              .getPolicyAssignedToFolder(metadataCascadePolicyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getOwnerEnterprise());
      System.out.println(result.getParent());
      System.out.println(result.getScope());
      System.out.println(result.getTemplateKey());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataCascadePoliciesApi#getPolicyAssignedToFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataCascadePolicy> response = client
              .metadataCascadePolicies
              .getPolicyAssignedToFolder(metadataCascadePolicyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataCascadePoliciesApi#getPolicyAssignedToFolder");
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
| **metadataCascadePolicyId** | **String**| The ID of the metadata cascade policy. | |

### Return type

[**MetadataCascadePolicy**](MetadataCascadePolicy.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a metadata cascade policy |  -  |
| **0** | An unexpected client error. |  -  |

<a name="list"></a>
# **list**
> MetadataCascadePolicies list(folderId).ownerEnterpriseId(ownerEnterpriseId).marker(marker).offset(offset).execute();

List metadata cascade policies

Retrieves a list of all the metadata cascade policies that are applied to a given folder. This can not be used on the root folder with ID &#x60;0&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataCascadePoliciesApi;
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
    String folderId = "31232"; // Specifies which folder to return policies for. This can not be used on the root folder with ID `0`.
    String ownerEnterpriseId = "31232"; // The ID of the enterprise ID for which to find metadata cascade policies. If not specified, it defaults to the current enterprise.
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    Long offset = 0L; // The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response.
    try {
      MetadataCascadePolicies result = client
              .metadataCascadePolicies
              .list(folderId)
              .ownerEnterpriseId(ownerEnterpriseId)
              .marker(marker)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataCascadePoliciesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataCascadePolicies> response = client
              .metadataCascadePolicies
              .list(folderId)
              .ownerEnterpriseId(ownerEnterpriseId)
              .marker(marker)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataCascadePoliciesApi#list");
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
| **folderId** | **String**| Specifies which folder to return policies for. This can not be used on the root folder with ID &#x60;0&#x60;. | |
| **ownerEnterpriseId** | **String**| The ID of the enterprise ID for which to find metadata cascade policies. If not specified, it defaults to the current enterprise. | [optional] |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |
| **offset** | **Long**| The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response. | [optional] [default to 0] |

### Return type

[**MetadataCascadePolicies**](MetadataCascadePolicies.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of metadata cascade policies |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removePolicy"></a>
# **removePolicy**
> removePolicy(metadataCascadePolicyId).execute();

Remove metadata cascade policy

Deletes a metadata cascade policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataCascadePoliciesApi;
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
    String metadataCascadePolicyId = "6fd4ff89-8fc1-42cf-8b29-1890dedd26d7"; // The ID of the metadata cascade policy.
    try {
      client
              .metadataCascadePolicies
              .removePolicy(metadataCascadePolicyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataCascadePoliciesApi#removePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .metadataCascadePolicies
              .removePolicy(metadataCascadePolicyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataCascadePoliciesApi#removePolicy");
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
| **metadataCascadePolicyId** | **String**| The ID of the metadata cascade policy. | |

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
| **204** | Returns an empty response when the policy is successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

