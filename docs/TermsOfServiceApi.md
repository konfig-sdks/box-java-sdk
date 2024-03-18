# TermsOfServiceApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createForEnterpriseAndType**](TermsOfServiceApi.md#createForEnterpriseAndType) | **POST** /terms_of_services | Create terms of service |
| [**getSettings**](TermsOfServiceApi.md#getSettings) | **GET** /terms_of_services | List terms of services |
| [**getSpecific**](TermsOfServiceApi.md#getSpecific) | **GET** /terms_of_services/{terms_of_service_id} | Get terms of service |
| [**updateSpecificTerm**](TermsOfServiceApi.md#updateSpecificTerm) | **PUT** /terms_of_services/{terms_of_service_id} | Update terms of service |


<a name="createForEnterpriseAndType"></a>
# **createForEnterpriseAndType**
> TermsOfService createForEnterpriseAndType().termsOfServiceCreateForEnterpriseAndTypeRequest(termsOfServiceCreateForEnterpriseAndTypeRequest).execute();

Create terms of service

Creates a terms of service for a given enterprise and type of user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TermsOfServiceApi;
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
    String status = "enabled"; // Whether this terms of service is active.
    String text = "text_example"; // The terms of service text to display to users.  The text can be set to empty if the `status` is set to `disabled`.
    String tosType = "external"; // The type of user to set the terms of service for.
    try {
      TermsOfService result = client
              .termsOfService
              .createForEnterpriseAndType(status, text)
              .tosType(tosType)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getEnterprise());
      System.out.println(result.getTosType());
      System.out.println(result.getText());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsOfServiceApi#createForEnterpriseAndType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TermsOfService> response = client
              .termsOfService
              .createForEnterpriseAndType(status, text)
              .tosType(tosType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsOfServiceApi#createForEnterpriseAndType");
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
| **termsOfServiceCreateForEnterpriseAndTypeRequest** | [**TermsOfServiceCreateForEnterpriseAndTypeRequest**](TermsOfServiceCreateForEnterpriseAndTypeRequest.md)|  | [optional] |

### Return type

[**TermsOfService**](TermsOfService.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a new task object |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getSettings"></a>
# **getSettings**
> TermsOfServices getSettings().tosType(tosType).execute();

List terms of services

Returns the current terms of service text and settings for the enterprise.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TermsOfServiceApi;
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
    String tosType = "external"; // Limits the results to the terms of service of the given type.
    try {
      TermsOfServices result = client
              .termsOfService
              .getSettings()
              .tosType(tosType)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCount());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsOfServiceApi#getSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TermsOfServices> response = client
              .termsOfService
              .getSettings()
              .tosType(tosType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsOfServiceApi#getSettings");
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
| **tosType** | **String**| Limits the results to the terms of service of the given type. | [optional] [enum: external, managed] |

### Return type

[**TermsOfServices**](TermsOfServices.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of terms of service text and settings for the enterprise. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getSpecific"></a>
# **getSpecific**
> TermsOfService getSpecific(termsOfServiceId).execute();

Get terms of service

Fetches a specific terms of service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TermsOfServiceApi;
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
    String termsOfServiceId = "324234"; // The ID of the terms of service.
    try {
      TermsOfService result = client
              .termsOfService
              .getSpecific(termsOfServiceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getEnterprise());
      System.out.println(result.getTosType());
      System.out.println(result.getText());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsOfServiceApi#getSpecific");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TermsOfService> response = client
              .termsOfService
              .getSpecific(termsOfServiceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsOfServiceApi#getSpecific");
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
| **termsOfServiceId** | **String**| The ID of the terms of service. | |

### Return type

[**TermsOfService**](TermsOfService.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a terms of service object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateSpecificTerm"></a>
# **updateSpecificTerm**
> TermsOfService updateSpecificTerm(termsOfServiceId).termsOfServiceUpdateSpecificTermRequest(termsOfServiceUpdateSpecificTermRequest).execute();

Update terms of service

Updates a specific terms of service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TermsOfServiceApi;
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
    String status = "enabled"; // Whether this terms of service is active.
    String text = "text_example"; // The terms of service text to display to users.  The text can be set to empty if the `status` is set to `disabled`.
    String termsOfServiceId = "324234"; // The ID of the terms of service.
    try {
      TermsOfService result = client
              .termsOfService
              .updateSpecificTerm(status, text, termsOfServiceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getEnterprise());
      System.out.println(result.getTosType());
      System.out.println(result.getText());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsOfServiceApi#updateSpecificTerm");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TermsOfService> response = client
              .termsOfService
              .updateSpecificTerm(status, text, termsOfServiceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsOfServiceApi#updateSpecificTerm");
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
| **termsOfServiceId** | **String**| The ID of the terms of service. | |
| **termsOfServiceUpdateSpecificTermRequest** | [**TermsOfServiceUpdateSpecificTermRequest**](TermsOfServiceUpdateSpecificTermRequest.md)|  | [optional] |

### Return type

[**TermsOfService**](TermsOfService.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an updated terms of service object. |  -  |
| **0** | An unexpected client error. |  -  |

