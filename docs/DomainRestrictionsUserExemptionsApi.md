# DomainRestrictionsUserExemptionsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUserExemptionFromCollaborationDomainRestrictions**](DomainRestrictionsUserExemptionsApi.md#createUserExemptionFromCollaborationDomainRestrictions) | **POST** /collaboration_whitelist_exempt_targets | Create user exemption from collaboration domain restrictions |
| [**getUserExemption**](DomainRestrictionsUserExemptionsApi.md#getUserExemption) | **GET** /collaboration_whitelist_exempt_targets/{collaboration_whitelist_exempt_target_id} | Get user exempt from collaboration domain restrictions |
| [**listExemptUsers**](DomainRestrictionsUserExemptionsApi.md#listExemptUsers) | **GET** /collaboration_whitelist_exempt_targets | List users exempt from collaboration domain restrictions |
| [**removeExemption**](DomainRestrictionsUserExemptionsApi.md#removeExemption) | **DELETE** /collaboration_whitelist_exempt_targets/{collaboration_whitelist_exempt_target_id} | Remove user from list of users exempt from domain restrictions |


<a name="createUserExemptionFromCollaborationDomainRestrictions"></a>
# **createUserExemptionFromCollaborationDomainRestrictions**
> CollaborationAllowlistExemptTarget createUserExemptionFromCollaborationDomainRestrictions().domainRestrictionsUserExemptionsCreateUserExemptionFromCollaborationDomainRestrictionsRequest(domainRestrictionsUserExemptionsCreateUserExemptionFromCollaborationDomainRestrictionsRequest).execute();

Create user exemption from collaboration domain restrictions

Exempts a user from the restrictions set out by the allowed list of domains for collaborations.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainRestrictionsUserExemptionsApi;
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
    DomainRestrictionsUserExemptionsCreateUserExemptionFromCollaborationDomainRestrictionsRequestUser user = new DomainRestrictionsUserExemptionsCreateUserExemptionFromCollaborationDomainRestrictionsRequestUser();
    try {
      CollaborationAllowlistExemptTarget result = client
              .domainRestrictionsUserExemptions
              .createUserExemptionFromCollaborationDomainRestrictions(user)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getEnterprise());
      System.out.println(result.getUser());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainRestrictionsUserExemptionsApi#createUserExemptionFromCollaborationDomainRestrictions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollaborationAllowlistExemptTarget> response = client
              .domainRestrictionsUserExemptions
              .createUserExemptionFromCollaborationDomainRestrictions(user)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainRestrictionsUserExemptionsApi#createUserExemptionFromCollaborationDomainRestrictions");
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
| **domainRestrictionsUserExemptionsCreateUserExemptionFromCollaborationDomainRestrictionsRequest** | [**DomainRestrictionsUserExemptionsCreateUserExemptionFromCollaborationDomainRestrictionsRequest**](DomainRestrictionsUserExemptionsCreateUserExemptionFromCollaborationDomainRestrictionsRequest.md)|  | [optional] |

### Return type

[**CollaborationAllowlistExemptTarget**](CollaborationAllowlistExemptTarget.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a new exemption entry. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getUserExemption"></a>
# **getUserExemption**
> CollaborationAllowlistExemptTarget getUserExemption(collaborationWhitelistExemptTargetId).execute();

Get user exempt from collaboration domain restrictions

Returns a users who has been exempt from the collaboration domain restrictions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainRestrictionsUserExemptionsApi;
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
    String collaborationWhitelistExemptTargetId = "984923"; // The ID of the exemption to the list.
    try {
      CollaborationAllowlistExemptTarget result = client
              .domainRestrictionsUserExemptions
              .getUserExemption(collaborationWhitelistExemptTargetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getEnterprise());
      System.out.println(result.getUser());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainRestrictionsUserExemptionsApi#getUserExemption");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollaborationAllowlistExemptTarget> response = client
              .domainRestrictionsUserExemptions
              .getUserExemption(collaborationWhitelistExemptTargetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainRestrictionsUserExemptionsApi#getUserExemption");
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
| **collaborationWhitelistExemptTargetId** | **String**| The ID of the exemption to the list. | |

### Return type

[**CollaborationAllowlistExemptTarget**](CollaborationAllowlistExemptTarget.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the user&#39;s exempted from the list of collaboration domains. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listExemptUsers"></a>
# **listExemptUsers**
> CollaborationAllowlistExemptTargets listExemptUsers().marker(marker).limit(limit).execute();

List users exempt from collaboration domain restrictions

Returns a list of users who have been exempt from the collaboration domain restrictions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainRestrictionsUserExemptionsApi;
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
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    Long limit = 1000L; // The maximum number of items to return per page.
    try {
      CollaborationAllowlistExemptTargets result = client
              .domainRestrictionsUserExemptions
              .listExemptUsers()
              .marker(marker)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainRestrictionsUserExemptionsApi#listExemptUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollaborationAllowlistExemptTargets> response = client
              .domainRestrictionsUserExemptions
              .listExemptUsers()
              .marker(marker)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainRestrictionsUserExemptionsApi#listExemptUsers");
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
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |

### Return type

[**CollaborationAllowlistExemptTargets**](CollaborationAllowlistExemptTargets.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of user exemptions. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeExemption"></a>
# **removeExemption**
> removeExemption(collaborationWhitelistExemptTargetId).execute();

Remove user from list of users exempt from domain restrictions

Removes a user&#39;s exemption from the restrictions set out by the allowed list of domains for collaborations.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainRestrictionsUserExemptionsApi;
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
    String collaborationWhitelistExemptTargetId = "984923"; // The ID of the exemption to the list.
    try {
      client
              .domainRestrictionsUserExemptions
              .removeExemption(collaborationWhitelistExemptTargetId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainRestrictionsUserExemptionsApi#removeExemption");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domainRestrictionsUserExemptions
              .removeExemption(collaborationWhitelistExemptTargetId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainRestrictionsUserExemptionsApi#removeExemption");
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
| **collaborationWhitelistExemptTargetId** | **String**| The ID of the exemption to the list. | |

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
| **204** | A blank response is returned if the exemption was successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

