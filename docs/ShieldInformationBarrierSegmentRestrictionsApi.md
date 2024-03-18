# ShieldInformationBarrierSegmentRestrictionsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBarrierObject**](ShieldInformationBarrierSegmentRestrictionsApi.md#createBarrierObject) | **POST** /shield_information_barrier_segment_restrictions | Create shield information barrier segment restriction |
| [**getById**](ShieldInformationBarrierSegmentRestrictionsApi.md#getById) | **GET** /shield_information_barrier_segment_restrictions/{shield_information_barrier_segment_restriction_id} | Get shield information barrier segment restriction by ID |
| [**listBasedOnSegmentId**](ShieldInformationBarrierSegmentRestrictionsApi.md#listBasedOnSegmentId) | **GET** /shield_information_barrier_segment_restrictions | List shield information barrier segment restrictions |
| [**removeById**](ShieldInformationBarrierSegmentRestrictionsApi.md#removeById) | **DELETE** /shield_information_barrier_segment_restrictions/{shield_information_barrier_segment_restriction_id} | Delete shield information barrier segment restriction by ID |


<a name="createBarrierObject"></a>
# **createBarrierObject**
> ShieldInformationBarrierSegmentRestriction createBarrierObject().shieldInformationBarrierSegmentRestrictionsCreateBarrierObjectRequest(shieldInformationBarrierSegmentRestrictionsCreateBarrierObjectRequest).execute();

Create shield information barrier segment restriction

Creates a shield information barrier segment restriction object.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarrierSegmentRestrictionsApi;
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
    String type = "shield_information_barrier_segment_restriction"; // The type of the shield barrier segment restriction for this member.
    ShieldInformationBarrierSegmentRestrictionsCreateBarrierObjectRequestShieldInformationBarrierSegment shieldInformationBarrierSegment = new ShieldInformationBarrierSegmentRestrictionsCreateBarrierObjectRequestShieldInformationBarrierSegment();
    ShieldInformationBarrierSegmentRestrictionsCreateBarrierObjectRequestRestrictedSegment restrictedSegment = new ShieldInformationBarrierSegmentRestrictionsCreateBarrierObjectRequestRestrictedSegment();
    ShieldInformationBarrierBase shieldInformationBarrier = new ShieldInformationBarrierBase();
    try {
      ShieldInformationBarrierSegmentRestriction result = client
              .shieldInformationBarrierSegmentRestrictions
              .createBarrierObject(type, shieldInformationBarrierSegment, restrictedSegment)
              .shieldInformationBarrier(shieldInformationBarrier)
              .execute();
      System.out.println(result);
      System.out.println(result.getType());
      System.out.println(result.getId());
      System.out.println(result.getShieldInformationBarrierSegment());
      System.out.println(result.getRestrictedSegment());
      System.out.println(result.getShieldInformationBarrier());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getUpdatedBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentRestrictionsApi#createBarrierObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarrierSegmentRestriction> response = client
              .shieldInformationBarrierSegmentRestrictions
              .createBarrierObject(type, shieldInformationBarrierSegment, restrictedSegment)
              .shieldInformationBarrier(shieldInformationBarrier)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentRestrictionsApi#createBarrierObject");
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
| **shieldInformationBarrierSegmentRestrictionsCreateBarrierObjectRequest** | [**ShieldInformationBarrierSegmentRestrictionsCreateBarrierObjectRequest**](ShieldInformationBarrierSegmentRestrictionsCreateBarrierObjectRequest.md)|  | [optional] |

### Return type

[**ShieldInformationBarrierSegmentRestriction**](ShieldInformationBarrierSegmentRestriction.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns the newly created Shield Information Barrier Segment Restriction object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getById"></a>
# **getById**
> ShieldInformationBarrierSegmentRestriction getById(shieldInformationBarrierSegmentRestrictionId).execute();

Get shield information barrier segment restriction by ID

Retrieves a shield information barrier segment restriction based on provided ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarrierSegmentRestrictionsApi;
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
    String shieldInformationBarrierSegmentRestrictionId = "4563"; // The ID of the shield information barrier segment Restriction.
    try {
      ShieldInformationBarrierSegmentRestriction result = client
              .shieldInformationBarrierSegmentRestrictions
              .getById(shieldInformationBarrierSegmentRestrictionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getType());
      System.out.println(result.getId());
      System.out.println(result.getShieldInformationBarrierSegment());
      System.out.println(result.getRestrictedSegment());
      System.out.println(result.getShieldInformationBarrier());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getUpdatedBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentRestrictionsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarrierSegmentRestriction> response = client
              .shieldInformationBarrierSegmentRestrictions
              .getById(shieldInformationBarrierSegmentRestrictionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentRestrictionsApi#getById");
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
| **shieldInformationBarrierSegmentRestrictionId** | **String**| The ID of the shield information barrier segment Restriction. | |

### Return type

[**ShieldInformationBarrierSegmentRestriction**](ShieldInformationBarrierSegmentRestriction.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the shield information barrier segment restriction object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listBasedOnSegmentId"></a>
# **listBasedOnSegmentId**
> ShieldInformationBarrierSegmentRestrictions listBasedOnSegmentId(shieldInformationBarrierSegmentId).marker(marker).limit(limit).execute();

List shield information barrier segment restrictions

Lists shield information barrier segment restrictions based on provided segment ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarrierSegmentRestrictionsApi;
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
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    Long limit = 1000L; // The maximum number of items to return per page.
    try {
      ShieldInformationBarrierSegmentRestrictions result = client
              .shieldInformationBarrierSegmentRestrictions
              .listBasedOnSegmentId(shieldInformationBarrierSegmentId)
              .marker(marker)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentRestrictionsApi#listBasedOnSegmentId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarrierSegmentRestrictions> response = client
              .shieldInformationBarrierSegmentRestrictions
              .listBasedOnSegmentId(shieldInformationBarrierSegmentId)
              .marker(marker)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentRestrictionsApi#listBasedOnSegmentId");
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
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |

### Return type

[**ShieldInformationBarrierSegmentRestrictions**](ShieldInformationBarrierSegmentRestrictions.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a paginated list of shield information barrier segment restriction objects. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeById"></a>
# **removeById**
> removeById(shieldInformationBarrierSegmentRestrictionId).execute();

Delete shield information barrier segment restriction by ID

Delete shield information barrier segment restriction based on provided ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarrierSegmentRestrictionsApi;
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
    String shieldInformationBarrierSegmentRestrictionId = "4563"; // The ID of the shield information barrier segment Restriction.
    try {
      client
              .shieldInformationBarrierSegmentRestrictions
              .removeById(shieldInformationBarrierSegmentRestrictionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentRestrictionsApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .shieldInformationBarrierSegmentRestrictions
              .removeById(shieldInformationBarrierSegmentRestrictionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentRestrictionsApi#removeById");
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
| **shieldInformationBarrierSegmentRestrictionId** | **String**| The ID of the shield information barrier segment Restriction. | |

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

