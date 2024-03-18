# MetadataInstancesFilesApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applyTemplate**](MetadataInstancesFilesApi.md#applyTemplate) | **POST** /files/{file_id}/metadata/{scope}/{template_key} | Create metadata instance on file |
| [**getInstance**](MetadataInstancesFilesApi.md#getInstance) | **GET** /files/{file_id}/metadata/{scope}/{template_key} | Get metadata instance on file |
| [**listFileMetadata**](MetadataInstancesFilesApi.md#listFileMetadata) | **GET** /files/{file_id}/metadata | List metadata instances on file |
| [**removeInstance**](MetadataInstancesFilesApi.md#removeInstance) | **DELETE** /files/{file_id}/metadata/{scope}/{template_key} | Remove metadata instance from file |
| [**updateInstanceOnFile**](MetadataInstancesFilesApi.md#updateInstanceOnFile) | **PUT** /files/{file_id}/metadata/{scope}/{template_key} | Update metadata instance on file |


<a name="applyTemplate"></a>
# **applyTemplate**
> MetadataFull applyTemplate(fileId, scope, templateKey).requestBody(requestBody).execute();

Create metadata instance on file

Applies an instance of a metadata template to a file.  In most cases only values that are present in the metadata template will be accepted, except for the &#x60;global.properties&#x60; template which accepts any key-value pair.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataInstancesFilesApi;
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
    String scope = "global"; // The scope of the metadata template
    String templateKey = "properties"; // The name of the metadata template
    try {
      MetadataFull result = client
              .metadataInstancesFiles
              .applyTemplate(fileId, scope, templateKey)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Parent());
      System.out.println(result.get$Template());
      System.out.println(result.get$Scope());
      System.out.println(result.get$Version());
      System.out.println(result.get$CanEdit());
      System.out.println(result.get$Id());
      System.out.println(result.get$Type());
      System.out.println(result.get$TypeVersion());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFilesApi#applyTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataFull> response = client
              .metadataInstancesFiles
              .applyTemplate(fileId, scope, templateKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFilesApi#applyTemplate");
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
| **scope** | **String**| The scope of the metadata template | [enum: global, enterprise] |
| **templateKey** | **String**| The name of the metadata template | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

### Return type

[**MetadataFull**](MetadataFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns the instance of the template that was applied to the file, including the data that was applied to the template. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getInstance"></a>
# **getInstance**
> MetadataFull getInstance(fileId, scope, templateKey).execute();

Get metadata instance on file

Retrieves the instance of a metadata template that has been applied to a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataInstancesFilesApi;
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
    String scope = "global"; // The scope of the metadata template
    String templateKey = "properties"; // The name of the metadata template
    try {
      MetadataFull result = client
              .metadataInstancesFiles
              .getInstance(fileId, scope, templateKey)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Parent());
      System.out.println(result.get$Template());
      System.out.println(result.get$Scope());
      System.out.println(result.get$Version());
      System.out.println(result.get$CanEdit());
      System.out.println(result.get$Id());
      System.out.println(result.get$Type());
      System.out.println(result.get$TypeVersion());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFilesApi#getInstance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataFull> response = client
              .metadataInstancesFiles
              .getInstance(fileId, scope, templateKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFilesApi#getInstance");
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
| **scope** | **String**| The scope of the metadata template | [enum: global, enterprise] |
| **templateKey** | **String**| The name of the metadata template | |

### Return type

[**MetadataFull**](MetadataFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | An instance of the metadata template that includes additional \&quot;key:value\&quot; pairs defined by the user or an application. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listFileMetadata"></a>
# **listFileMetadata**
> Metadatas listFileMetadata(fileId).execute();

List metadata instances on file

Retrieves all metadata for a given file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataInstancesFilesApi;
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
      Metadatas result = client
              .metadataInstancesFiles
              .listFileMetadata(fileId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntries());
      System.out.println(result.getLimit());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFilesApi#listFileMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Metadatas> response = client
              .metadataInstancesFiles
              .listFileMetadata(fileId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFilesApi#listFileMetadata");
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

[**Metadatas**](Metadatas.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns all the metadata associated with a file.  This API does not support pagination and will therefore always return all of the metadata associated to the file. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeInstance"></a>
# **removeInstance**
> removeInstance(fileId, scope, templateKey).execute();

Remove metadata instance from file

Deletes a piece of file metadata.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataInstancesFilesApi;
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
    String scope = "global"; // The scope of the metadata template
    String templateKey = "properties"; // The name of the metadata template
    try {
      client
              .metadataInstancesFiles
              .removeInstance(fileId, scope, templateKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFilesApi#removeInstance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .metadataInstancesFiles
              .removeInstance(fileId, scope, templateKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFilesApi#removeInstance");
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
| **scope** | **String**| The scope of the metadata template | [enum: global, enterprise] |
| **templateKey** | **String**| The name of the metadata template | |

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
| **204** | Returns an empty response when the metadata is successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateInstanceOnFile"></a>
# **updateInstanceOnFile**
> MetadataFull updateInstanceOnFile(fileId, scope, templateKey).ametadataInstanceUpdateOperation(ametadataInstanceUpdateOperation).execute();

Update metadata instance on file

Updates a piece of metadata on a file.  The metadata instance can only be updated if the template has already been applied to the file before. When editing metadata, only values that match the metadata template schema will be accepted.  The update is applied atomically. If any errors occur during the application of the operations, the metadata instance will not be changed.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataInstancesFilesApi;
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
    String scope = "global"; // The scope of the metadata template
    String templateKey = "properties"; // The name of the metadata template
    try {
      MetadataFull result = client
              .metadataInstancesFiles
              .updateInstanceOnFile(fileId, scope, templateKey)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Parent());
      System.out.println(result.get$Template());
      System.out.println(result.get$Scope());
      System.out.println(result.get$Version());
      System.out.println(result.get$CanEdit());
      System.out.println(result.get$Id());
      System.out.println(result.get$Type());
      System.out.println(result.get$TypeVersion());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFilesApi#updateInstanceOnFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataFull> response = client
              .metadataInstancesFiles
              .updateInstanceOnFile(fileId, scope, templateKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFilesApi#updateInstanceOnFile");
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
| **scope** | **String**| The scope of the metadata template | [enum: global, enterprise] |
| **templateKey** | **String**| The name of the metadata template | |
| **ametadataInstanceUpdateOperation** | [**List&lt;AMetadataInstanceUpdateOperation&gt;**](AMetadataInstanceUpdateOperation.md)|  | [optional] |

### Return type

[**MetadataFull**](MetadataFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated metadata template instance, with the custom template data included. |  -  |
| **0** | An unexpected client error. |  -  |

