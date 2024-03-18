# TermsOfServiceUserStatusesApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUserStatus**](TermsOfServiceUserStatusesApi.md#createUserStatus) | **POST** /terms_of_service_user_statuses | Create terms of service status for new user |
| [**listUserStatuses**](TermsOfServiceUserStatusesApi.md#listUserStatuses) | **GET** /terms_of_service_user_statuses | List terms of service user statuses |
| [**updateUserStatus**](TermsOfServiceUserStatusesApi.md#updateUserStatus) | **PUT** /terms_of_service_user_statuses/{terms_of_service_user_status_id} | Update terms of service status for existing user |


<a name="createUserStatus"></a>
# **createUserStatus**
> TermsOfServiceUserStatus createUserStatus().termsOfServiceUserStatusesCreateUserStatusRequest(termsOfServiceUserStatusesCreateUserStatusRequest).execute();

Create terms of service status for new user

Sets the status for a terms of service for a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TermsOfServiceUserStatusesApi;
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
    TermsOfServiceUserStatusesCreateUserStatusRequestTos tos = new TermsOfServiceUserStatusesCreateUserStatusRequestTos();
    TermsOfServiceUserStatusesCreateUserStatusRequestUser user = new TermsOfServiceUserStatusesCreateUserStatusRequestUser();
    Boolean isAccepted = true; // Whether the user has accepted the terms.
    try {
      TermsOfServiceUserStatus result = client
              .termsOfServiceUserStatuses
              .createUserStatus(tos, user, isAccepted)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getTos());
      System.out.println(result.getUser());
      System.out.println(result.getIsAccepted());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsOfServiceUserStatusesApi#createUserStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TermsOfServiceUserStatus> response = client
              .termsOfServiceUserStatuses
              .createUserStatus(tos, user, isAccepted)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsOfServiceUserStatusesApi#createUserStatus");
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
| **termsOfServiceUserStatusesCreateUserStatusRequest** | [**TermsOfServiceUserStatusesCreateUserStatusRequest**](TermsOfServiceUserStatusesCreateUserStatusRequest.md)|  | [optional] |

### Return type

[**TermsOfServiceUserStatus**](TermsOfServiceUserStatus.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a terms of service status object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listUserStatuses"></a>
# **listUserStatuses**
> TermsOfServiceUserStatuses listUserStatuses(tosId).userId(userId).execute();

List terms of service user statuses

Retrieves an overview of users and their status for a terms of service, including Whether they have accepted the terms and when.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TermsOfServiceUserStatusesApi;
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
    String tosId = "324234"; // The ID of the terms of service.
    String userId = "123334"; // Limits results to the given user ID.
    try {
      TermsOfServiceUserStatuses result = client
              .termsOfServiceUserStatuses
              .listUserStatuses(tosId)
              .userId(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCount());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsOfServiceUserStatusesApi#listUserStatuses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TermsOfServiceUserStatuses> response = client
              .termsOfServiceUserStatuses
              .listUserStatuses(tosId)
              .userId(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsOfServiceUserStatusesApi#listUserStatuses");
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
| **tosId** | **String**| The ID of the terms of service. | |
| **userId** | **String**| Limits results to the given user ID. | [optional] |

### Return type

[**TermsOfServiceUserStatuses**](TermsOfServiceUserStatuses.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of terms of service statuses. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateUserStatus"></a>
# **updateUserStatus**
> TermsOfServiceUserStatus updateUserStatus(termsOfServiceUserStatusId).termsOfServiceUserStatusesUpdateUserStatusRequest(termsOfServiceUserStatusesUpdateUserStatusRequest).execute();

Update terms of service status for existing user

Updates the status for a terms of service for a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TermsOfServiceUserStatusesApi;
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
    Boolean isAccepted = true; // Whether the user has accepted the terms.
    String termsOfServiceUserStatusId = "324234"; // The ID of the terms of service status.
    try {
      TermsOfServiceUserStatus result = client
              .termsOfServiceUserStatuses
              .updateUserStatus(isAccepted, termsOfServiceUserStatusId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getTos());
      System.out.println(result.getUser());
      System.out.println(result.getIsAccepted());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsOfServiceUserStatusesApi#updateUserStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TermsOfServiceUserStatus> response = client
              .termsOfServiceUserStatuses
              .updateUserStatus(isAccepted, termsOfServiceUserStatusId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsOfServiceUserStatusesApi#updateUserStatus");
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
| **termsOfServiceUserStatusId** | **String**| The ID of the terms of service status. | |
| **termsOfServiceUserStatusesUpdateUserStatusRequest** | [**TermsOfServiceUserStatusesUpdateUserStatusRequest**](TermsOfServiceUserStatusesUpdateUserStatusRequest.md)|  | [optional] |

### Return type

[**TermsOfServiceUserStatus**](TermsOfServiceUserStatus.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated terms of service status object. |  -  |
| **0** | An unexpected client error. |  -  |

