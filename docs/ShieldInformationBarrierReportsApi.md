# ShieldInformationBarrierReportsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReport**](ShieldInformationBarrierReportsApi.md#createReport) | **POST** /shield_information_barrier_reports | Create shield information barrier report |
| [**getById**](ShieldInformationBarrierReportsApi.md#getById) | **GET** /shield_information_barrier_reports/{shield_information_barrier_report_id} | Get shield information barrier report by ID |
| [**listReports**](ShieldInformationBarrierReportsApi.md#listReports) | **GET** /shield_information_barrier_reports | List shield information barrier reports |


<a name="createReport"></a>
# **createReport**
> ShieldInformationBarrierReport createReport().shieldInformationBarrierReference(shieldInformationBarrierReference).execute();

Create shield information barrier report

Creates a shield information barrier report for a given barrier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarrierReportsApi;
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
    try {
      ShieldInformationBarrierReport result = client
              .shieldInformationBarrierReports
              .createReport()
              .shieldInformationBarrier(shieldInformationBarrier)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getShieldInformationBarrier());
      System.out.println(result.getStatus());
      System.out.println(result.getDetails());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierReportsApi#createReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarrierReport> response = client
              .shieldInformationBarrierReports
              .createReport()
              .shieldInformationBarrier(shieldInformationBarrier)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierReportsApi#createReport");
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
| **shieldInformationBarrierReference** | [**ShieldInformationBarrierReference**](ShieldInformationBarrierReference.md)|  | [optional] |

### Return type

[**ShieldInformationBarrierReport**](ShieldInformationBarrierReport.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns the shield information barrier report information object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getById"></a>
# **getById**
> ShieldInformationBarrierReport getById(shieldInformationBarrierReportId).execute();

Get shield information barrier report by ID

Retrieves a shield information barrier report by its ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarrierReportsApi;
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
    String shieldInformationBarrierReportId = "3423"; // The ID of the shield information barrier Report.
    try {
      ShieldInformationBarrierReport result = client
              .shieldInformationBarrierReports
              .getById(shieldInformationBarrierReportId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getShieldInformationBarrier());
      System.out.println(result.getStatus());
      System.out.println(result.getDetails());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierReportsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarrierReport> response = client
              .shieldInformationBarrierReports
              .getById(shieldInformationBarrierReportId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierReportsApi#getById");
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
| **shieldInformationBarrierReportId** | **String**| The ID of the shield information barrier Report. | |

### Return type

[**ShieldInformationBarrierReport**](ShieldInformationBarrierReport.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the  shield information barrier report object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listReports"></a>
# **listReports**
> ShieldInformationBarrierReports listReports(shieldInformationBarrierId).marker(marker).limit(limit).execute();

List shield information barrier reports

Lists shield information barrier reports.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShieldInformationBarrierReportsApi;
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
      ShieldInformationBarrierReports result = client
              .shieldInformationBarrierReports
              .listReports(shieldInformationBarrierId)
              .marker(marker)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierReportsApi#listReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ShieldInformationBarrierReports> response = client
              .shieldInformationBarrierReports
              .listReports(shieldInformationBarrierId)
              .marker(marker)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShieldInformationBarrierReportsApi#listReports");
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

[**ShieldInformationBarrierReports**](ShieldInformationBarrierReports.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a paginated list of shield information barrier report objects. |  -  |
| **0** | An unexpected client error. |  -  |

