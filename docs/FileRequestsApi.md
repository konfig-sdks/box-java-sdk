# FileRequestsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**copyRequestToFolder**](FileRequestsApi.md#copyRequestToFolder) | **POST** /file_requests/{file_request_id}/copy | Copy file request |
| [**deletePermanently**](FileRequestsApi.md#deletePermanently) | **DELETE** /file_requests/{file_request_id} | Delete file request |
| [**getInformation**](FileRequestsApi.md#getInformation) | **GET** /file_requests/{file_request_id} | Get file request |
| [**updateRequest**](FileRequestsApi.md#updateRequest) | **PUT** /file_requests/{file_request_id} | Update file request |


<a name="copyRequestToFolder"></a>
# **copyRequestToFolder**
> FileRequest copyRequestToFolder(fileRequestId).fileRequestCopyRequest(fileRequestCopyRequest).execute();

Copy file request

Copies an existing file request that is already present on one folder, and applies it to another folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileRequestsApi;
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
    FileRequestCopyRequestAllOfFolder folder = new FileRequestCopyRequestAllOfFolder();
    String fileRequestId = "123"; // The unique identifier that represent a file request.  The ID for any file request can be determined by visiting a file request builder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/filerequest/123` the `file_request_id` is `123`.
    String title = "title_example"; // An optional new title for the file request. This can be used to change the title of the file request.  This will default to the value on the existing file request.
    String description = "description_example"; // An optional new description for the file request. This can be used to change the description of the file request.  This will default to the value on the existing file request.
    String status = "active"; // An optional new status of the file request.  When the status is set to `inactive`, the file request will no longer accept new submissions, and any visitor to the file request URL will receive a `HTTP 404` status code.  This will default to the value on the existing file request.
    Boolean isEmailRequired = true; // Whether a file request submitter is required to provide their email address.  When this setting is set to true, the Box UI will show an email field on the file request form.  This will default to the value on the existing file request.
    Boolean isDescriptionRequired = true; // Whether a file request submitter is required to provide a description of the files they are submitting.  When this setting is set to true, the Box UI will show a description field on the file request form.  This will default to the value on the existing file request.
    OffsetDateTime expiresAt = OffsetDateTime.now(); // The date after which a file request will no longer accept new submissions.  After this date, the `status` will automatically be set to `inactive`.  This will default to the value on the existing file request.
    try {
      FileRequest result = client
              .fileRequests
              .copyRequestToFolder(folder, fileRequestId)
              .title(title)
              .description(description)
              .status(status)
              .isEmailRequired(isEmailRequired)
              .isDescriptionRequired(isDescriptionRequired)
              .expiresAt(expiresAt)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getIsEmailRequired());
      System.out.println(result.getIsDescriptionRequired());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getFolder());
      System.out.println(result.getUrl());
      System.out.println(result.getEtag());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedBy());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileRequestsApi#copyRequestToFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileRequest> response = client
              .fileRequests
              .copyRequestToFolder(folder, fileRequestId)
              .title(title)
              .description(description)
              .status(status)
              .isEmailRequired(isEmailRequired)
              .isDescriptionRequired(isDescriptionRequired)
              .expiresAt(expiresAt)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileRequestsApi#copyRequestToFolder");
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
| **fileRequestId** | **String**| The unique identifier that represent a file request.  The ID for any file request can be determined by visiting a file request builder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/filerequest/123&#x60; the &#x60;file_request_id&#x60; is &#x60;123&#x60;. | |
| **fileRequestCopyRequest** | [**FileRequestCopyRequest**](FileRequestCopyRequest.md)|  | [optional] |

### Return type

[**FileRequest**](FileRequest.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns updated file request object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="deletePermanently"></a>
# **deletePermanently**
> deletePermanently(fileRequestId).execute();

Delete file request

Deletes a file request permanently.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileRequestsApi;
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
    String fileRequestId = "123"; // The unique identifier that represent a file request.  The ID for any file request can be determined by visiting a file request builder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/filerequest/123` the `file_request_id` is `123`.
    try {
      client
              .fileRequests
              .deletePermanently(fileRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FileRequestsApi#deletePermanently");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .fileRequests
              .deletePermanently(fileRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FileRequestsApi#deletePermanently");
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
| **fileRequestId** | **String**| The unique identifier that represent a file request.  The ID for any file request can be determined by visiting a file request builder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/filerequest/123&#x60; the &#x60;file_request_id&#x60; is &#x60;123&#x60;. | |

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
| **204** | Returns an empty response when the file request has been successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getInformation"></a>
# **getInformation**
> FileRequest getInformation(fileRequestId).execute();

Get file request

Retrieves the information about a file request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileRequestsApi;
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
    String fileRequestId = "123"; // The unique identifier that represent a file request.  The ID for any file request can be determined by visiting a file request builder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/filerequest/123` the `file_request_id` is `123`.
    try {
      FileRequest result = client
              .fileRequests
              .getInformation(fileRequestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getIsEmailRequired());
      System.out.println(result.getIsDescriptionRequired());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getFolder());
      System.out.println(result.getUrl());
      System.out.println(result.getEtag());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedBy());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileRequestsApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileRequest> response = client
              .fileRequests
              .getInformation(fileRequestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileRequestsApi#getInformation");
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
| **fileRequestId** | **String**| The unique identifier that represent a file request.  The ID for any file request can be determined by visiting a file request builder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/filerequest/123&#x60; the &#x60;file_request_id&#x60; is &#x60;123&#x60;. | |

### Return type

[**FileRequest**](FileRequest.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a file request object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateRequest"></a>
# **updateRequest**
> FileRequest updateRequest(fileRequestId).ifMatch(ifMatch).fileRequestUpdateRequest(fileRequestUpdateRequest).execute();

Update file request

Updates a file request. This can be used to activate or deactivate a file request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileRequestsApi;
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
    String fileRequestId = "123"; // The unique identifier that represent a file request.  The ID for any file request can be determined by visiting a file request builder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/filerequest/123` the `file_request_id` is `123`.
    String title = "title_example"; // An optional new title for the file request. This can be used to change the title of the file request.  This will default to the value on the existing file request.
    String description = "description_example"; // An optional new description for the file request. This can be used to change the description of the file request.  This will default to the value on the existing file request.
    String status = "active"; // An optional new status of the file request.  When the status is set to `inactive`, the file request will no longer accept new submissions, and any visitor to the file request URL will receive a `HTTP 404` status code.  This will default to the value on the existing file request.
    Boolean isEmailRequired = true; // Whether a file request submitter is required to provide their email address.  When this setting is set to true, the Box UI will show an email field on the file request form.  This will default to the value on the existing file request.
    Boolean isDescriptionRequired = true; // Whether a file request submitter is required to provide a description of the files they are submitting.  When this setting is set to true, the Box UI will show a description field on the file request form.  This will default to the value on the existing file request.
    OffsetDateTime expiresAt = OffsetDateTime.now(); // The date after which a file request will no longer accept new submissions.  After this date, the `status` will automatically be set to `inactive`.  This will default to the value on the existing file request.
    String ifMatch = "1"; // Ensures this item hasn't recently changed before making changes.  Pass in the item's last observed `etag` value into this header and the endpoint will fail with a `412 Precondition Failed` if it has changed since.
    try {
      FileRequest result = client
              .fileRequests
              .updateRequest(fileRequestId)
              .title(title)
              .description(description)
              .status(status)
              .isEmailRequired(isEmailRequired)
              .isDescriptionRequired(isDescriptionRequired)
              .expiresAt(expiresAt)
              .ifMatch(ifMatch)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getIsEmailRequired());
      System.out.println(result.getIsDescriptionRequired());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getFolder());
      System.out.println(result.getUrl());
      System.out.println(result.getEtag());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedBy());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileRequestsApi#updateRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileRequest> response = client
              .fileRequests
              .updateRequest(fileRequestId)
              .title(title)
              .description(description)
              .status(status)
              .isEmailRequired(isEmailRequired)
              .isDescriptionRequired(isDescriptionRequired)
              .expiresAt(expiresAt)
              .ifMatch(ifMatch)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileRequestsApi#updateRequest");
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
| **fileRequestId** | **String**| The unique identifier that represent a file request.  The ID for any file request can be determined by visiting a file request builder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/filerequest/123&#x60; the &#x60;file_request_id&#x60; is &#x60;123&#x60;. | |
| **ifMatch** | **String**| Ensures this item hasn&#39;t recently changed before making changes.  Pass in the item&#39;s last observed &#x60;etag&#x60; value into this header and the endpoint will fail with a &#x60;412 Precondition Failed&#x60; if it has changed since. | [optional] |
| **fileRequestUpdateRequest** | [**FileRequestUpdateRequest**](FileRequestUpdateRequest.md)|  | [optional] |

### Return type

[**FileRequest**](FileRequest.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated file request object. |  -  |
| **0** | An unexpected client error. |  -  |

