# IntegrationMappingsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSlackMapping**](IntegrationMappingsApi.md#createSlackMapping) | **POST** /integration_mappings/slack | Create Slack integration mapping |
| [**deleteSlackMapping**](IntegrationMappingsApi.md#deleteSlackMapping) | **DELETE** /integration_mappings/slack/{integration_mapping_id} | Delete Slack integration mapping |
| [**listSlackMappings**](IntegrationMappingsApi.md#listSlackMappings) | **GET** /integration_mappings/slack | List Slack integration mappings |
| [**updateSlackMapping**](IntegrationMappingsApi.md#updateSlackMapping) | **PUT** /integration_mappings/slack/{integration_mapping_id} | Update Slack integration mapping |


<a name="createSlackMapping"></a>
# **createSlackMapping**
> IntegrationMapping createSlackMapping().integrationMappingSlackCreateRequest(integrationMappingSlackCreateRequest).execute();

Create Slack integration mapping

Creates a [Slack integration mapping](https://support.box.com/hc/en-us/articles/4415585987859-Box-as-the-Content-Layer-for-Slack) by mapping a Slack channel to a Box item.  You need Admin or Co-Admin role to use this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationMappingsApi;
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
    IntegrationMappingPartnerItemSlack partnerItem = new IntegrationMappingPartnerItemSlack();
    IntegrationMappingBoxItemSlack boxItem = new IntegrationMappingBoxItemSlack();
    IntegrationMappingSlackOptions options = new IntegrationMappingSlackOptions();
    try {
      IntegrationMapping result = client
              .integrationMappings
              .createSlackMapping(partnerItem, boxItem)
              .options(options)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getIntegrationType());
      System.out.println(result.getType());
      System.out.println(result.getPartnerItem());
      System.out.println(result.getBoxItem());
      System.out.println(result.getIsManuallyCreated());
      System.out.println(result.getOptions());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationMappingsApi#createSlackMapping");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationMapping> response = client
              .integrationMappings
              .createSlackMapping(partnerItem, boxItem)
              .options(options)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationMappingsApi#createSlackMapping");
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
| **integrationMappingSlackCreateRequest** | [**IntegrationMappingSlackCreateRequest**](IntegrationMappingSlackCreateRequest.md)|  | [optional] |

### Return type

[**IntegrationMapping**](IntegrationMapping.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns the created integration mapping. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="deleteSlackMapping"></a>
# **deleteSlackMapping**
> deleteSlackMapping(integrationMappingId).execute();

Delete Slack integration mapping

Deletes a [Slack integration mapping](https://support.box.com/hc/en-us/articles/4415585987859-Box-as-the-Content-Layer-for-Slack).   You need Admin or Co-Admin role to use this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationMappingsApi;
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
    String integrationMappingId = "11235432"; // An ID of an integration mapping
    try {
      client
              .integrationMappings
              .deleteSlackMapping(integrationMappingId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationMappingsApi#deleteSlackMapping");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .integrationMappings
              .deleteSlackMapping(integrationMappingId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationMappingsApi#deleteSlackMapping");
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
| **integrationMappingId** | **String**| An ID of an integration mapping | |

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

<a name="listSlackMappings"></a>
# **listSlackMappings**
> IntegrationMappings listSlackMappings().marker(marker).limit(limit).partnerItemType(partnerItemType).partnerItemId(partnerItemId).boxItemId(boxItemId).boxItemType(boxItemType).isManuallyCreated(isManuallyCreated).execute();

List Slack integration mappings

Lists [Slack integration mappings](https://support.box.com/hc/en-us/articles/4415585987859-Box-as-the-Content-Layer-for-Slack) in a users&#39; enterprise.  You need Admin or Co-Admin role to use this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationMappingsApi;
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
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    Long limit = 1000L; // The maximum number of items to return per page.
    String partnerItemType = "channel"; // Mapped item type, for which the mapping should be returned
    String partnerItemId = "12345"; // ID of the mapped item, for which the mapping should be returned
    String boxItemId = "12345"; // Box item ID, for which the mappings should be returned
    String boxItemType = "folder"; // Box item type, for which the mappings should be returned
    Boolean isManuallyCreated = true; // Whether the mapping has been manually created
    try {
      IntegrationMappings result = client
              .integrationMappings
              .listSlackMappings()
              .marker(marker)
              .limit(limit)
              .partnerItemType(partnerItemType)
              .partnerItemId(partnerItemId)
              .boxItemId(boxItemId)
              .boxItemType(boxItemType)
              .isManuallyCreated(isManuallyCreated)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationMappingsApi#listSlackMappings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationMappings> response = client
              .integrationMappings
              .listSlackMappings()
              .marker(marker)
              .limit(limit)
              .partnerItemType(partnerItemType)
              .partnerItemId(partnerItemId)
              .boxItemId(boxItemId)
              .boxItemType(boxItemType)
              .isManuallyCreated(isManuallyCreated)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationMappingsApi#listSlackMappings");
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
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |
| **partnerItemType** | **String**| Mapped item type, for which the mapping should be returned | [optional] [enum: channel] |
| **partnerItemId** | **String**| ID of the mapped item, for which the mapping should be returned | [optional] |
| **boxItemId** | **String**| Box item ID, for which the mappings should be returned | [optional] |
| **boxItemType** | **String**| Box item type, for which the mappings should be returned | [optional] [enum: folder] |
| **isManuallyCreated** | **Boolean**| Whether the mapping has been manually created | [optional] |

### Return type

[**IntegrationMappings**](IntegrationMappings.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of integration mappings |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateSlackMapping"></a>
# **updateSlackMapping**
> IntegrationMapping updateSlackMapping(integrationMappingId).integrationMappingsUpdateSlackMappingRequest(integrationMappingsUpdateSlackMappingRequest).execute();

Update Slack integration mapping

Updates a [Slack integration mapping](https://support.box.com/hc/en-us/articles/4415585987859-Box-as-the-Content-Layer-for-Slack). Supports updating the Box folder ID and options.  You need Admin or Co-Admin role to use this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationMappingsApi;
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
    String integrationMappingId = "11235432"; // An ID of an integration mapping
    IntegrationMappingBoxItemSlack boxItem = new IntegrationMappingBoxItemSlack();
    IntegrationMappingSlackOptions options = new IntegrationMappingSlackOptions();
    try {
      IntegrationMapping result = client
              .integrationMappings
              .updateSlackMapping(integrationMappingId)
              .boxItem(boxItem)
              .options(options)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getIntegrationType());
      System.out.println(result.getType());
      System.out.println(result.getPartnerItem());
      System.out.println(result.getBoxItem());
      System.out.println(result.getIsManuallyCreated());
      System.out.println(result.getOptions());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationMappingsApi#updateSlackMapping");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationMapping> response = client
              .integrationMappings
              .updateSlackMapping(integrationMappingId)
              .boxItem(boxItem)
              .options(options)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationMappingsApi#updateSlackMapping");
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
| **integrationMappingId** | **String**| An ID of an integration mapping | |
| **integrationMappingsUpdateSlackMappingRequest** | [**IntegrationMappingsUpdateSlackMappingRequest**](IntegrationMappingsUpdateSlackMappingRequest.md)| At least one of &#x60;box_item&#x60; and &#x60;options&#x60; must be provided. | [optional] |

### Return type

[**IntegrationMapping**](IntegrationMapping.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated integration mapping object. |  -  |
| **0** | An unexpected client error. |  -  |

