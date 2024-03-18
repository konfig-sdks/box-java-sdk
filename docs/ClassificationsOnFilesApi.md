# ClassificationsOnFilesApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addClassification**](ClassificationsOnFilesApi.md#addClassification) | **POST** /files/{file_id}/metadata/enterprise/securityClassification-6VMVochwUWo | Add classification to file |
| [**getClassificationMetadataInstance**](ClassificationsOnFilesApi.md#getClassificationMetadataInstance) | **GET** /files/{file_id}/metadata/enterprise/securityClassification-6VMVochwUWo | Get classification on file |
| [**removeClassification**](ClassificationsOnFilesApi.md#removeClassification) | **DELETE** /files/{file_id}/metadata/enterprise/securityClassification-6VMVochwUWo | Remove classification from file |
| [**updateClassificationMetadataInstance**](ClassificationsOnFilesApi.md#updateClassificationMetadataInstance) | **PUT** /files/{file_id}/metadata/enterprise/securityClassification-6VMVochwUWo | Update classification on file |


<a name="addClassification"></a>
# **addClassification**
> Classification addClassification(fileId).classificationsOnFilesAddClassificationRequest(classificationsOnFilesAddClassificationRequest).execute();

Add classification to file

Adds a classification to a file by specifying the label of the classification to add.  This API can also be called by including the enterprise ID in the URL explicitly, for example &#x60;/files/:id//enterprise_12345/securityClassification-6VMVochwUWo&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClassificationsOnFilesApi;
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
    String fileId = "12345"; // The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/files/123` the `file_id` is `123`.
    String boxSecurityClassificationKey = "boxSecurityClassificationKey_example"; // The name of the classification to apply to this file.  To list the available classifications in an enterprise, use the classification API to retrieve the [classification template](e://get_metadata_templates_enterprise_securityClassification-6VMVochwUWo_schema) which lists all available classification keys.
    try {
      Classification result = client
              .classificationsOnFiles
              .addClassification(fileId)
              .boxSecurityClassificationKey(boxSecurityClassificationKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getBoxSecurityClassificationKey());
      System.out.println(result.get$Parent());
      System.out.println(result.get$Template());
      System.out.println(result.get$Scope());
      System.out.println(result.get$Version());
      System.out.println(result.get$Type());
      System.out.println(result.get$TypeVersion());
      System.out.println(result.get$CanEdit());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsOnFilesApi#addClassification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Classification> response = client
              .classificationsOnFiles
              .addClassification(fileId)
              .boxSecurityClassificationKey(boxSecurityClassificationKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsOnFilesApi#addClassification");
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
| **fileId** | **String**| The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/files/123&#x60; the &#x60;file_id&#x60; is &#x60;123&#x60;. | |
| **classificationsOnFilesAddClassificationRequest** | [**ClassificationsOnFilesAddClassificationRequest**](ClassificationsOnFilesAddClassificationRequest.md)|  | [optional] |

### Return type

[**Classification**](Classification.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns the classification template instance that was applied to the file. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getClassificationMetadataInstance"></a>
# **getClassificationMetadataInstance**
> Classification getClassificationMetadataInstance(fileId).execute();

Get classification on file

Retrieves the classification metadata instance that has been applied to a file.  This API can also be called by including the enterprise ID in the URL explicitly, for example &#x60;/files/:id//enterprise_12345/securityClassification-6VMVochwUWo&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClassificationsOnFilesApi;
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
    String fileId = "12345"; // The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/files/123` the `file_id` is `123`.
    try {
      Classification result = client
              .classificationsOnFiles
              .getClassificationMetadataInstance(fileId)
              .execute();
      System.out.println(result);
      System.out.println(result.getBoxSecurityClassificationKey());
      System.out.println(result.get$Parent());
      System.out.println(result.get$Template());
      System.out.println(result.get$Scope());
      System.out.println(result.get$Version());
      System.out.println(result.get$Type());
      System.out.println(result.get$TypeVersion());
      System.out.println(result.get$CanEdit());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsOnFilesApi#getClassificationMetadataInstance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Classification> response = client
              .classificationsOnFiles
              .getClassificationMetadataInstance(fileId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsOnFilesApi#getClassificationMetadataInstance");
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
| **fileId** | **String**| The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/files/123&#x60; the &#x60;file_id&#x60; is &#x60;123&#x60;. | |

### Return type

[**Classification**](Classification.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns an instance of the &#x60;securityClassification&#x60; metadata template, which contains a &#x60;Box__Security__Classification__Key&#x60; field that lists all the classifications available to this enterprise. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeClassification"></a>
# **removeClassification**
> removeClassification(fileId).execute();

Remove classification from file

Removes any classifications from a file.  This API can also be called by including the enterprise ID in the URL explicitly, for example &#x60;/files/:id//enterprise_12345/securityClassification-6VMVochwUWo&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClassificationsOnFilesApi;
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
    String fileId = "12345"; // The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/files/123` the `file_id` is `123`.
    try {
      client
              .classificationsOnFiles
              .removeClassification(fileId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsOnFilesApi#removeClassification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .classificationsOnFiles
              .removeClassification(fileId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsOnFilesApi#removeClassification");
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
| **fileId** | **String**| The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/files/123&#x60; the &#x60;file_id&#x60; is &#x60;123&#x60;. | |

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
| **204** | Returns an empty response when the classification is successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateClassificationMetadataInstance"></a>
# **updateClassificationMetadataInstance**
> Classification updateClassificationMetadataInstance(fileId).classificationsOnFilesUpdateClassificationMetadataInstanceRequestInner(classificationsOnFilesUpdateClassificationMetadataInstanceRequestInner).execute();

Update classification on file

Updates a classification on a file.  The classification can only be updated if a classification has already been applied to the file before. When editing classifications, only values are defined for the enterprise will be accepted.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClassificationsOnFilesApi;
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
    String fileId = "12345"; // The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/files/123` the `file_id` is `123`.
    try {
      Classification result = client
              .classificationsOnFiles
              .updateClassificationMetadataInstance(fileId)
              .execute();
      System.out.println(result);
      System.out.println(result.getBoxSecurityClassificationKey());
      System.out.println(result.get$Parent());
      System.out.println(result.get$Template());
      System.out.println(result.get$Scope());
      System.out.println(result.get$Version());
      System.out.println(result.get$Type());
      System.out.println(result.get$TypeVersion());
      System.out.println(result.get$CanEdit());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsOnFilesApi#updateClassificationMetadataInstance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Classification> response = client
              .classificationsOnFiles
              .updateClassificationMetadataInstance(fileId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsOnFilesApi#updateClassificationMetadataInstance");
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
| **fileId** | **String**| The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/files/123&#x60; the &#x60;file_id&#x60; is &#x60;123&#x60;. | |
| **classificationsOnFilesUpdateClassificationMetadataInstanceRequestInner** | [**List&lt;ClassificationsOnFilesUpdateClassificationMetadataInstanceRequestInner&gt;**](ClassificationsOnFilesUpdateClassificationMetadataInstanceRequestInner.md)|  | [optional] |

### Return type

[**Classification**](Classification.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated classification metadata template instance. |  -  |
| **0** | An unexpected client error. |  -  |

