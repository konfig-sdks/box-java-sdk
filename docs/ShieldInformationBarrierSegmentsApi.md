# ShieldInformationBarrierSegmentsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSegment**](ShieldInformationBarrierSegmentsApi.md#createSegment) | **POST** /shield_information_barrier_segments | Create shield information barrier segment |
| [**deleteSegmentById**](ShieldInformationBarrierSegmentsApi.md#deleteSegmentById) | **DELETE** /shield_information_barrier_segments/{shield_information_barrier_segment_id} | Delete shield information barrier segment |
| [**getById**](ShieldInformationBarrierSegmentsApi.md#getById) | **GET** /shield_information_barrier_segments/{shield_information_barrier_segment_id} | Get shield information barrier segment with specified ID |
| [**listInformationObjects**](ShieldInformationBarrierSegmentsApi.md#listInformationObjects) | **GET** /shield_information_barrier_segments | List shield information barrier segments |
| [**updateById**](ShieldInformationBarrierSegmentsApi.md#updateById) | **PUT** /shield_information_barrier_segments/{shield_information_barrier_segment_id} | Update shield information barrier segment with specified ID |


<a name="createSegment"></a>
# **createSegment**
> ShieldInformationBarrierSegment createSegment().shieldInformationBarrierSegmentsCreateSegmentRequest(shieldInformationBarrierSegmentsCreateSegmentRequest).execute();

Create shield information barrier segment

Creates a shield information barrier segment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarrierSegmentsApi;
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
    ShieldInformationBarrierBase shieldInformationBarrier = new ShieldInformationBarrierBase();
    String name = "name_example"; // Name of the shield information barrier segment
    String description = "description_example"; // Description of the shield information barrier segment
    try {
      ShieldInformationBarrierSegment result = client
              .shieldInformationBarrierSegments
              .createSegment(shieldInformationBarrier, name)
              .description(description)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getShieldInformationBarrier());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getUpdatedBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentsApi#createSegment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarrierSegment> response = client
              .shieldInformationBarrierSegments
              .createSegment(shieldInformationBarrier, name)
              .description(description)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentsApi#createSegment");
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
| **shieldInformationBarrierSegmentsCreateSegmentRequest** | [**ShieldInformationBarrierSegmentsCreateSegmentRequest**](ShieldInformationBarrierSegmentsCreateSegmentRequest.md)|  | [optional] |

### Return type

[**ShieldInformationBarrierSegment**](ShieldInformationBarrierSegment.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a new shield information barrier segment object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="deleteSegmentById"></a>
# **deleteSegmentById**
> deleteSegmentById(shieldInformationBarrierSegmentId).execute();

Delete shield information barrier segment

Deletes the shield information barrier segment based on provided ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarrierSegmentsApi;
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
    String shieldInformationBarrierSegmentId = "3423"; // The ID of the shield information barrier segment.
    try {
      client
              .shieldInformationBarrierSegments
              .deleteSegmentById(shieldInformationBarrierSegmentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentsApi#deleteSegmentById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .shieldInformationBarrierSegments
              .deleteSegmentById(shieldInformationBarrierSegmentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentsApi#deleteSegmentById");
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
| **shieldInformationBarrierSegmentId** | **String**| The ID of the shield information barrier segment. | |

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
| **204** | Empty body in response |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getById"></a>
# **getById**
> ShieldInformationBarrierSegment getById(shieldInformationBarrierSegmentId).execute();

Get shield information barrier segment with specified ID

Retrieves shield information barrier segment based on provided ID..

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarrierSegmentsApi;
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
    String shieldInformationBarrierSegmentId = "3423"; // The ID of the shield information barrier segment.
    try {
      ShieldInformationBarrierSegment result = client
              .shieldInformationBarrierSegments
              .getById(shieldInformationBarrierSegmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getShieldInformationBarrier());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getUpdatedBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarrierSegment> response = client
              .shieldInformationBarrierSegments
              .getById(shieldInformationBarrierSegmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentsApi#getById");
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
| **shieldInformationBarrierSegmentId** | **String**| The ID of the shield information barrier segment. | |

### Return type

[**ShieldInformationBarrierSegment**](ShieldInformationBarrierSegment.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the shield information barrier segment object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listInformationObjects"></a>
# **listInformationObjects**
> ShieldInformationBarrierSegments listInformationObjects(shieldInformationBarrierId).marker(marker).limit(limit).execute();

List shield information barrier segments

Retrieves a list of shield information barrier segment objects for the specified Information Barrier ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarrierSegmentsApi;
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
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    Long limit = 1000L; // The maximum number of items to return per page.
    try {
      ShieldInformationBarrierSegments result = client
              .shieldInformationBarrierSegments
              .listInformationObjects(shieldInformationBarrierId)
              .marker(marker)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentsApi#listInformationObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarrierSegments> response = client
              .shieldInformationBarrierSegments
              .listInformationObjects(shieldInformationBarrierId)
              .marker(marker)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentsApi#listInformationObjects");
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
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |

### Return type

[**ShieldInformationBarrierSegments**](ShieldInformationBarrierSegments.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a paginated list of shield information barrier segment objects. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateById"></a>
# **updateById**
> ShieldInformationBarrierSegment updateById(shieldInformationBarrierSegmentId).shieldInformationBarrierSegmentsUpdateByIdRequest(shieldInformationBarrierSegmentsUpdateByIdRequest).execute();

Update shield information barrier segment with specified ID

Updates the shield information barrier segment based on provided ID..

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarrierSegmentsApi;
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
    String shieldInformationBarrierSegmentId = "3423"; // The ID of the shield information barrier segment.
    String description = "description_example"; // The updated description for the shield information barrier segment.
    String name = "name_example"; // The updated name for the shield information barrier segment.
    try {
      ShieldInformationBarrierSegment result = client
              .shieldInformationBarrierSegments
              .updateById(shieldInformationBarrierSegmentId)
              .description(description)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getShieldInformationBarrier());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getUpdatedBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentsApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarrierSegment> response = client
              .shieldInformationBarrierSegments
              .updateById(shieldInformationBarrierSegmentId)
              .description(description)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentsApi#updateById");
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
| **shieldInformationBarrierSegmentId** | **String**| The ID of the shield information barrier segment. | |
| **shieldInformationBarrierSegmentsUpdateByIdRequest** | [**ShieldInformationBarrierSegmentsUpdateByIdRequest**](ShieldInformationBarrierSegmentsUpdateByIdRequest.md)|  | [optional] |

### Return type

[**ShieldInformationBarrierSegment**](ShieldInformationBarrierSegment.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated shield information barrier segment object. |  -  |
| **0** | An unexpected client error. |  -  |

