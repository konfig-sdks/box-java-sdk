# ShieldInformationBarrierSegmentMembersApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewMember**](ShieldInformationBarrierSegmentMembersApi.md#createNewMember) | **POST** /shield_information_barrier_segment_members | Create shield information barrier segment member |
| [**getById**](ShieldInformationBarrierSegmentMembersApi.md#getById) | **GET** /shield_information_barrier_segment_members/{shield_information_barrier_segment_member_id} | Get shield information barrier segment member by ID |
| [**listSegmentMembersBasedOnIds**](ShieldInformationBarrierSegmentMembersApi.md#listSegmentMembersBasedOnIds) | **GET** /shield_information_barrier_segment_members | List shield information barrier segment members |
| [**removeById**](ShieldInformationBarrierSegmentMembersApi.md#removeById) | **DELETE** /shield_information_barrier_segment_members/{shield_information_barrier_segment_member_id} | Delete shield information barrier segment member by ID |


<a name="createNewMember"></a>
# **createNewMember**
> ShieldInformationBarrierSegmentMember createNewMember().shieldInformationBarrierSegmentMembersCreateNewMemberRequest(shieldInformationBarrierSegmentMembersCreateNewMemberRequest).execute();

Create shield information barrier segment member

Creates a new shield information barrier segment member.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarrierSegmentMembersApi;
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
    ShieldInformationBarrierSegmentMembersCreateNewMemberRequestShieldInformationBarrierSegment shieldInformationBarrierSegment = new ShieldInformationBarrierSegmentMembersCreateNewMemberRequestShieldInformationBarrierSegment();
    UserBase user = new UserBase(); // User to which restriction will be applied.
    String type = "shield_information_barrier_segment_member"; // -| A type of the shield barrier segment member.
    ShieldInformationBarrierBase shieldInformationBarrier = new ShieldInformationBarrierBase();
    try {
      ShieldInformationBarrierSegmentMember result = client
              .shieldInformationBarrierSegmentMembers
              .createNewMember(shieldInformationBarrierSegment, user)
              .type(type)
              .shieldInformationBarrier(shieldInformationBarrier)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getUser());
      System.out.println(result.getShieldInformationBarrier());
      System.out.println(result.getShieldInformationBarrierSegment());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getUpdatedBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentMembersApi#createNewMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarrierSegmentMember> response = client
              .shieldInformationBarrierSegmentMembers
              .createNewMember(shieldInformationBarrierSegment, user)
              .type(type)
              .shieldInformationBarrier(shieldInformationBarrier)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentMembersApi#createNewMember");
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
| **shieldInformationBarrierSegmentMembersCreateNewMemberRequest** | [**ShieldInformationBarrierSegmentMembersCreateNewMemberRequest**](ShieldInformationBarrierSegmentMembersCreateNewMemberRequest.md)|  | [optional] |

### Return type

[**ShieldInformationBarrierSegmentMember**](ShieldInformationBarrierSegmentMember.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a new shield information barrier segment member object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getById"></a>
# **getById**
> ShieldInformationBarrierSegmentMember getById(shieldInformationBarrierSegmentMemberId).execute();

Get shield information barrier segment member by ID

Retrieves a shield information barrier segment member by its ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarrierSegmentMembersApi;
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
    String shieldInformationBarrierSegmentMemberId = "7815"; // The ID of the shield information barrier segment Member.
    try {
      ShieldInformationBarrierSegmentMember result = client
              .shieldInformationBarrierSegmentMembers
              .getById(shieldInformationBarrierSegmentMemberId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getUser());
      System.out.println(result.getShieldInformationBarrier());
      System.out.println(result.getShieldInformationBarrierSegment());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getUpdatedBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentMembersApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarrierSegmentMember> response = client
              .shieldInformationBarrierSegmentMembers
              .getById(shieldInformationBarrierSegmentMemberId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentMembersApi#getById");
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
| **shieldInformationBarrierSegmentMemberId** | **String**| The ID of the shield information barrier segment Member. | |

### Return type

[**ShieldInformationBarrierSegmentMember**](ShieldInformationBarrierSegmentMember.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the shield information barrier segment member object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listSegmentMembersBasedOnIds"></a>
# **listSegmentMembersBasedOnIds**
> ShieldInformationBarrierSegmentMembers listSegmentMembersBasedOnIds(shieldInformationBarrierSegmentId).marker(marker).limit(limit).execute();

List shield information barrier segment members

Lists shield information barrier segment members based on provided segment IDs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarrierSegmentMembersApi;
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
      ShieldInformationBarrierSegmentMembers result = client
              .shieldInformationBarrierSegmentMembers
              .listSegmentMembersBasedOnIds(shieldInformationBarrierSegmentId)
              .marker(marker)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentMembersApi#listSegmentMembersBasedOnIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarrierSegmentMembers> response = client
              .shieldInformationBarrierSegmentMembers
              .listSegmentMembersBasedOnIds(shieldInformationBarrierSegmentId)
              .marker(marker)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentMembersApi#listSegmentMembersBasedOnIds");
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

[**ShieldInformationBarrierSegmentMembers**](ShieldInformationBarrierSegmentMembers.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a paginated list of shield information barrier segment member objects. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeById"></a>
# **removeById**
> removeById(shieldInformationBarrierSegmentMemberId).execute();

Delete shield information barrier segment member by ID

Deletes a shield information barrier segment member based on provided ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarrierSegmentMembersApi;
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
    String shieldInformationBarrierSegmentMemberId = "7815"; // The ID of the shield information barrier segment Member.
    try {
      client
              .shieldInformationBarrierSegmentMembers
              .removeById(shieldInformationBarrierSegmentMemberId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentMembersApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .shieldInformationBarrierSegmentMembers
              .removeById(shieldInformationBarrierSegmentMemberId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierSegmentMembersApi#removeById");
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
| **shieldInformationBarrierSegmentMemberId** | **String**| The ID of the shield information barrier segment Member. | |

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
| **204** | Returns an empty response if the segment member was deleted successfully. |  -  |
| **0** | An unexpected client error. |  -  |

