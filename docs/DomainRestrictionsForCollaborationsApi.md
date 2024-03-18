# DomainRestrictionsForCollaborationsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAllowedDomainEntry**](DomainRestrictionsForCollaborationsApi.md#addAllowedDomainEntry) | **POST** /collaboration_whitelist_entries | Add domain to list of allowed collaboration domains |
| [**allowedCollaborationDomain**](DomainRestrictionsForCollaborationsApi.md#allowedCollaborationDomain) | **GET** /collaboration_whitelist_entries/{collaboration_whitelist_entry_id} | Get allowed collaboration domain |
| [**listAllowedCollaborationDomains**](DomainRestrictionsForCollaborationsApi.md#listAllowedCollaborationDomains) | **GET** /collaboration_whitelist_entries | List allowed collaboration domains |
| [**removeAllowedDomainEntry**](DomainRestrictionsForCollaborationsApi.md#removeAllowedDomainEntry) | **DELETE** /collaboration_whitelist_entries/{collaboration_whitelist_entry_id} | Remove domain from list of allowed collaboration domains |


<a name="addAllowedDomainEntry"></a>
# **addAllowedDomainEntry**
> CollaborationAllowlistEntry addAllowedDomainEntry().domainRestrictionsForCollaborationsAddAllowedDomainEntryRequest(domainRestrictionsForCollaborationsAddAllowedDomainEntryRequest).execute();

Add domain to list of allowed collaboration domains

Creates a new entry in the list of allowed domains to allow collaboration for.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainRestrictionsForCollaborationsApi;
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
    String domain = "domain_example"; // The domain to add to the list of allowed domains.
    String direction = "inbound"; // The direction in which to allow collaborations.
    try {
      CollaborationAllowlistEntry result = client
              .domainRestrictionsForCollaborations
              .addAllowedDomainEntry(domain, direction)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getDomain());
      System.out.println(result.getDirection());
      System.out.println(result.getEnterprise());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainRestrictionsForCollaborationsApi#addAllowedDomainEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollaborationAllowlistEntry> response = client
              .domainRestrictionsForCollaborations
              .addAllowedDomainEntry(domain, direction)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainRestrictionsForCollaborationsApi#addAllowedDomainEntry");
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
| **domainRestrictionsForCollaborationsAddAllowedDomainEntryRequest** | [**DomainRestrictionsForCollaborationsAddAllowedDomainEntryRequest**](DomainRestrictionsForCollaborationsAddAllowedDomainEntryRequest.md)|  | [optional] |

### Return type

[**CollaborationAllowlistEntry**](CollaborationAllowlistEntry.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a new entry on the list of allowed domains. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="allowedCollaborationDomain"></a>
# **allowedCollaborationDomain**
> CollaborationAllowlistEntry allowedCollaborationDomain(collaborationWhitelistEntryId).execute();

Get allowed collaboration domain

Returns a domain that has been deemed safe to create collaborations for within the current enterprise.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainRestrictionsForCollaborationsApi;
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
    String collaborationWhitelistEntryId = "213123"; // The ID of the entry in the list.
    try {
      CollaborationAllowlistEntry result = client
              .domainRestrictionsForCollaborations
              .allowedCollaborationDomain(collaborationWhitelistEntryId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getDomain());
      System.out.println(result.getDirection());
      System.out.println(result.getEnterprise());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainRestrictionsForCollaborationsApi#allowedCollaborationDomain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollaborationAllowlistEntry> response = client
              .domainRestrictionsForCollaborations
              .allowedCollaborationDomain(collaborationWhitelistEntryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainRestrictionsForCollaborationsApi#allowedCollaborationDomain");
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
| **collaborationWhitelistEntryId** | **String**| The ID of the entry in the list. | |

### Return type

[**CollaborationAllowlistEntry**](CollaborationAllowlistEntry.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an entry on the list of allowed domains. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listAllowedCollaborationDomains"></a>
# **listAllowedCollaborationDomains**
> CollaborationAllowlistEntries listAllowedCollaborationDomains().marker(marker).limit(limit).execute();

List allowed collaboration domains

Returns the list domains that have been deemed safe to create collaborations for within the current enterprise.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainRestrictionsForCollaborationsApi;
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
      CollaborationAllowlistEntries result = client
              .domainRestrictionsForCollaborations
              .listAllowedCollaborationDomains()
              .marker(marker)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainRestrictionsForCollaborationsApi#listAllowedCollaborationDomains");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollaborationAllowlistEntries> response = client
              .domainRestrictionsForCollaborations
              .listAllowedCollaborationDomains()
              .marker(marker)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainRestrictionsForCollaborationsApi#listAllowedCollaborationDomains");
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

[**CollaborationAllowlistEntries**](CollaborationAllowlistEntries.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of domains that are allowed for collaboration. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeAllowedDomainEntry"></a>
# **removeAllowedDomainEntry**
> removeAllowedDomainEntry(collaborationWhitelistEntryId).execute();

Remove domain from list of allowed collaboration domains

Removes a domain from the list of domains that have been deemed safe to create collaborations for within the current enterprise.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainRestrictionsForCollaborationsApi;
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
    String collaborationWhitelistEntryId = "213123"; // The ID of the entry in the list.
    try {
      client
              .domainRestrictionsForCollaborations
              .removeAllowedDomainEntry(collaborationWhitelistEntryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainRestrictionsForCollaborationsApi#removeAllowedDomainEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domainRestrictionsForCollaborations
              .removeAllowedDomainEntry(collaborationWhitelistEntryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainRestrictionsForCollaborationsApi#removeAllowedDomainEntry");
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
| **collaborationWhitelistEntryId** | **String**| The ID of the entry in the list. | |

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
| **204** | A blank response is returned if the entry was successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

