# DevicePinnersApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPinnerInfo**](DevicePinnersApi.md#getPinnerInfo) | **GET** /device_pinners/{device_pinner_id} | Get device pin |
| [**listPinnerInfo**](DevicePinnersApi.md#listPinnerInfo) | **GET** /enterprises/{enterprise_id}/device_pinners | List enterprise device pins |
| [**removeDevicePin**](DevicePinnersApi.md#removeDevicePin) | **DELETE** /device_pinners/{device_pinner_id} | Remove device pin |


<a name="getPinnerInfo"></a>
# **getPinnerInfo**
> DevicePinner getPinnerInfo(devicePinnerId).execute();

Get device pin

Retrieves information about an individual device pin.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DevicePinnersApi;
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
    String devicePinnerId = "2324234"; // The ID of the device pin
    try {
      DevicePinner result = client
              .devicePinners
              .getPinnerInfo(devicePinnerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getProductName());
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePinnersApi#getPinnerInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DevicePinner> response = client
              .devicePinners
              .getPinnerInfo(devicePinnerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePinnersApi#getPinnerInfo");
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
| **devicePinnerId** | **String**| The ID of the device pin | |

### Return type

[**DevicePinner**](DevicePinner.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns information about a single device pin. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listPinnerInfo"></a>
# **listPinnerInfo**
> DevicePinners listPinnerInfo(enterpriseId).marker(marker).limit(limit).direction(direction).execute();

List enterprise device pins

Retrieves all the device pins within an enterprise.  The user must have admin privileges, and the application needs the \&quot;manage enterprise\&quot; scope to make this call.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DevicePinnersApi;
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
    String enterpriseId = "3442311"; // The ID of the enterprise
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    Long limit = 1000L; // The maximum number of items to return per page.
    String direction = "ASC"; // The direction to sort results in. This can be either in alphabetical ascending (`ASC`) or descending (`DESC`) order.
    try {
      DevicePinners result = client
              .devicePinners
              .listPinnerInfo(enterpriseId)
              .marker(marker)
              .limit(limit)
              .direction(direction)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntries());
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getOrder());
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePinnersApi#listPinnerInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DevicePinners> response = client
              .devicePinners
              .listPinnerInfo(enterpriseId)
              .marker(marker)
              .limit(limit)
              .direction(direction)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePinnersApi#listPinnerInfo");
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
| **enterpriseId** | **String**| The ID of the enterprise | |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |
| **direction** | **String**| The direction to sort results in. This can be either in alphabetical ascending (&#x60;ASC&#x60;) or descending (&#x60;DESC&#x60;) order. | [optional] [enum: ASC, DESC] |

### Return type

[**DevicePinners**](DevicePinners.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of device pins for a given enterprise. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeDevicePin"></a>
# **removeDevicePin**
> removeDevicePin(devicePinnerId).execute();

Remove device pin

Deletes an individual device pin.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DevicePinnersApi;
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
    String devicePinnerId = "2324234"; // The ID of the device pin
    try {
      client
              .devicePinners
              .removeDevicePin(devicePinnerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePinnersApi#removeDevicePin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .devicePinners
              .removeDevicePin(devicePinnerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePinnersApi#removeDevicePin");
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
| **devicePinnerId** | **String**| The ID of the device pin | |

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
| **204** | Returns an empty response when the pin has been deleted. |  -  |
| **0** | An unexpected client error. |  -  |

