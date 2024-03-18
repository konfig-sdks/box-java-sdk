# EmailAliasesApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewAlias**](EmailAliasesApi.md#createNewAlias) | **POST** /users/{user_id}/email_aliases | Create email alias |
| [**listUserEmailAliases**](EmailAliasesApi.md#listUserEmailAliases) | **GET** /users/{user_id}/email_aliases | List user&#39;s email aliases |
| [**removeAlias**](EmailAliasesApi.md#removeAlias) | **DELETE** /users/{user_id}/email_aliases/{email_alias_id} | Remove email alias |


<a name="createNewAlias"></a>
# **createNewAlias**
> EmailAlias createNewAlias(userId).emailAliasesCreateNewAliasRequest(emailAliasesCreateNewAliasRequest).execute();

Create email alias

Adds a new email alias to a user account..

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmailAliasesApi;
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
    String email = "email_example"; // The email address to add to the account as an alias.  Note: The domain of the email alias needs to be registered  to your enterprise. See the [domain verification guide](https://support.box.com/hc/en-us/articles/4408619650579-Domain-Verification) for steps to add a new domain.
    String userId = "12345"; // The ID of the user.
    try {
      EmailAlias result = client
              .emailAliases
              .createNewAlias(email, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getEmail());
      System.out.println(result.getIsConfirmed());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailAliasesApi#createNewAlias");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailAlias> response = client
              .emailAliases
              .createNewAlias(email, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailAliasesApi#createNewAlias");
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
| **userId** | **String**| The ID of the user. | |
| **emailAliasesCreateNewAliasRequest** | [**EmailAliasesCreateNewAliasRequest**](EmailAliasesCreateNewAliasRequest.md)|  | [optional] |

### Return type

[**EmailAlias**](EmailAlias.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns the newly created email alias object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listUserEmailAliases"></a>
# **listUserEmailAliases**
> EmailAliases listUserEmailAliases(userId).execute();

List user&#39;s email aliases

Retrieves all email aliases for a user. The collection does not include the primary login for the user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmailAliasesApi;
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
    String userId = "12345"; // The ID of the user.
    try {
      EmailAliases result = client
              .emailAliases
              .listUserEmailAliases(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCount());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailAliasesApi#listUserEmailAliases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailAliases> response = client
              .emailAliases
              .listUserEmailAliases(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailAliasesApi#listUserEmailAliases");
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
| **userId** | **String**| The ID of the user. | |

### Return type

[**EmailAliases**](EmailAliases.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of email aliases. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeAlias"></a>
# **removeAlias**
> removeAlias(userId, emailAliasId).execute();

Remove email alias

Removes an email alias from a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmailAliasesApi;
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
    String userId = "12345"; // The ID of the user.
    String emailAliasId = "23432"; // The ID of the email alias.
    try {
      client
              .emailAliases
              .removeAlias(userId, emailAliasId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailAliasesApi#removeAlias");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .emailAliases
              .removeAlias(userId, emailAliasId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailAliasesApi#removeAlias");
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
| **userId** | **String**| The ID of the user. | |
| **emailAliasId** | **String**| The ID of the email alias. | |

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
| **204** | Removes the alias and returns an empty response. |  -  |
| **0** | An unexpected client error. |  -  |

