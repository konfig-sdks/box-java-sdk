# ShieldInformationBarriersApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addChangedStatus**](ShieldInformationBarriersApi.md#addChangedStatus) | **POST** /shield_information_barriers/change_status | Add changed status of shield information barrier with specified ID |
| [**createBarrier**](ShieldInformationBarriersApi.md#createBarrier) | **POST** /shield_information_barriers | Create shield information barrier |
| [**getById**](ShieldInformationBarriersApi.md#getById) | **GET** /shield_information_barriers/{shield_information_barrier_id} | Get shield information barrier with specified ID |
| [**listInformationObjects**](ShieldInformationBarriersApi.md#listInformationObjects) | **GET** /shield_information_barriers | List shield information barriers |


<a name="addChangedStatus"></a>
# **addChangedStatus**
> ShieldInformationBarrier addChangedStatus().shieldInformationBarriersAddChangedStatusRequest(shieldInformationBarriersAddChangedStatusRequest).execute();

Add changed status of shield information barrier with specified ID

Change status of shield information barrier with the specified ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarriersApi;
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
    String id = "id_example"; // The ID of the shield information barrier.
    String status = "pending"; // The desired status for the shield information barrier.
    try {
      ShieldInformationBarrier result = client
              .shieldInformationBarriers
              .addChangedStatus(id, status)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getEnterprise());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getUpdatedBy());
      System.out.println(result.getEnabledAt());
      System.out.println(result.getEnabledBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarriersApi#addChangedStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarrier> response = client
              .shieldInformationBarriers
              .addChangedStatus(id, status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarriersApi#addChangedStatus");
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
| **shieldInformationBarriersAddChangedStatusRequest** | [**ShieldInformationBarriersAddChangedStatusRequest**](ShieldInformationBarriersAddChangedStatusRequest.md)|  | [optional] |

### Return type

[**ShieldInformationBarrier**](ShieldInformationBarrier.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated shield information barrier object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="createBarrier"></a>
# **createBarrier**
> ShieldInformationBarrier createBarrier().shieldInformationBarriersCreateBarrierRequest(shieldInformationBarriersCreateBarrierRequest).execute();

Create shield information barrier

Creates a shield information barrier to separate individuals/groups within the same firm and prevents confidential information passing between them.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarriersApi;
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
    EnterpriseBase enterprise = new EnterpriseBase(); // The `type` and `id` of enterprise this barrier is under.
    try {
      ShieldInformationBarrier result = client
              .shieldInformationBarriers
              .createBarrier(enterprise)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getEnterprise());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getUpdatedBy());
      System.out.println(result.getEnabledAt());
      System.out.println(result.getEnabledBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarriersApi#createBarrier");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarrier> response = client
              .shieldInformationBarriers
              .createBarrier(enterprise)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarriersApi#createBarrier");
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
| **shieldInformationBarriersCreateBarrierRequest** | [**ShieldInformationBarriersCreateBarrierRequest**](ShieldInformationBarriersCreateBarrierRequest.md)|  | [optional] |

### Return type

[**ShieldInformationBarrier**](ShieldInformationBarrier.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a new shield information barrier object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getById"></a>
# **getById**
> ShieldInformationBarrier getById(shieldInformationBarrierId).execute();

Get shield information barrier with specified ID

Get shield information barrier based on provided ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarriersApi;
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
    String shieldInformationBarrierId = "1910967"; // The ID of the shield information barrier.
    try {
      ShieldInformationBarrier result = client
              .shieldInformationBarriers
              .getById(shieldInformationBarrierId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getEnterprise());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getUpdatedBy());
      System.out.println(result.getEnabledAt());
      System.out.println(result.getEnabledBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarriersApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarrier> response = client
              .shieldInformationBarriers
              .getById(shieldInformationBarrierId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarriersApi#getById");
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
| **shieldInformationBarrierId** | **String**| The ID of the shield information barrier. | |

### Return type

[**ShieldInformationBarrier**](ShieldInformationBarrier.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the shield information barrier object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listInformationObjects"></a>
# **listInformationObjects**
> ShieldInformationBarriers listInformationObjects().marker(marker).limit(limit).execute();

List shield information barriers

Retrieves a list of shield information barrier objects for the enterprise of JWT.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarriersApi;
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
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.
    Long limit = 1000L; // The maximum number of items to return per page.
    try {
      ShieldInformationBarriers result = client
              .shieldInformationBarriers
              .listInformationObjects()
              .marker(marker)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarriersApi#listInformationObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarriers> response = client
              .shieldInformationBarriers
              .listInformationObjects()
              .marker(marker)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarriersApi#listInformationObjects");
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
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |

### Return type

[**ShieldInformationBarriers**](ShieldInformationBarriers.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a paginated list of shield information barrier objects, empty list if currently no barrier. |  -  |
| **0** | An unexpected client error. |  -  |

