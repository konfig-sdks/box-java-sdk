# SessionTerminationApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSessionTerminationJobs**](SessionTerminationApi.md#createSessionTerminationJobs) | **POST** /users/terminate_sessions | Create jobs to terminate users session |
| [**createTerminationJobs**](SessionTerminationApi.md#createTerminationJobs) | **POST** /groups/terminate_sessions | Create jobs to terminate user group session |


<a name="createSessionTerminationJobs"></a>
# **createSessionTerminationJobs**
> SessionTerminationMessage createSessionTerminationJobs().sessionTerminationCreateSessionTerminationJobsRequest(sessionTerminationCreateSessionTerminationJobsRequest).execute();

Create jobs to terminate users session

Validates the roles and permissions of the user, and creates asynchronous jobs to terminate the user&#39;s sessions. Returns the status for the POST request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SessionTerminationApi;
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
    List<String> userIds = Arrays.asList(); // A list of user IDs
    List<String> userLogins = Arrays.asList(); // A list of user logins
    try {
      SessionTerminationMessage result = client
              .sessionTermination
              .createSessionTerminationJobs(userIds, userLogins)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionTerminationApi#createSessionTerminationJobs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SessionTerminationMessage> response = client
              .sessionTermination
              .createSessionTerminationJobs(userIds, userLogins)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionTerminationApi#createSessionTerminationJobs");
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
| **sessionTerminationCreateSessionTerminationJobsRequest** | [**SessionTerminationCreateSessionTerminationJobsRequest**](SessionTerminationCreateSessionTerminationJobsRequest.md)|  | [optional] |

### Return type

[**SessionTerminationMessage**](SessionTerminationMessage.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns a message about the request status. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="createTerminationJobs"></a>
# **createTerminationJobs**
> SessionTerminationMessage createTerminationJobs().sessionTerminationCreateTerminationJobsRequest(sessionTerminationCreateTerminationJobsRequest).execute();

Create jobs to terminate user group session

Validates the roles and permissions of the group, and creates asynchronous jobs to terminate the group&#39;s sessions. Returns the status for the POST request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SessionTerminationApi;
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
    List<String> groupIds = Arrays.asList(); // A list of group IDs
    try {
      SessionTerminationMessage result = client
              .sessionTermination
              .createTerminationJobs(groupIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionTerminationApi#createTerminationJobs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SessionTerminationMessage> response = client
              .sessionTermination
              .createTerminationJobs(groupIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionTerminationApi#createTerminationJobs");
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
| **sessionTerminationCreateTerminationJobsRequest** | [**SessionTerminationCreateTerminationJobsRequest**](SessionTerminationCreateTerminationJobsRequest.md)|  | [optional] |

### Return type

[**SessionTerminationMessage**](SessionTerminationMessage.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns a message about the request status. |  -  |
| **0** | An unexpected client error. |  -  |

