# MetadataInstancesFoldersApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applyTemplate**](MetadataInstancesFoldersApi.md#applyTemplate) | **POST** /folders/{folder_id}/metadata/{scope}/{template_key} | Create metadata instance on folder |
| [**getFolderMetadataInstance**](MetadataInstancesFoldersApi.md#getFolderMetadataInstance) | **GET** /folders/{folder_id}/metadata/{scope}/{template_key} | Get metadata instance on folder |
| [**listOnFolder**](MetadataInstancesFoldersApi.md#listOnFolder) | **GET** /folders/{folder_id}/metadata | List metadata instances on folder |
| [**removeInstance**](MetadataInstancesFoldersApi.md#removeInstance) | **DELETE** /folders/{folder_id}/metadata/{scope}/{template_key} | Remove metadata instance from folder |
| [**updateInstanceOnFolder**](MetadataInstancesFoldersApi.md#updateInstanceOnFolder) | **PUT** /folders/{folder_id}/metadata/{scope}/{template_key} | Update metadata instance on folder |


<a name="applyTemplate"></a>
# **applyTemplate**
> MetadataFull applyTemplate(folderId, scope, templateKey).requestBody(requestBody).execute();

Create metadata instance on folder

Applies an instance of a metadata template to a folder.  In most cases only values that are present in the metadata template will be accepted, except for the &#x60;global.properties&#x60; template which accepts any key-value pair.  To display the metadata template in the Box web app the enterprise needs to be configured to enable **Cascading Folder Level Metadata** for the user in the admin console.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataInstancesFoldersApi;
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
    String folderId = "12345"; // The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/folder/123` the `folder_id` is `123`.  The root folder of a Box account is always represented by the ID `0`.
    String scope = "global"; // The scope of the metadata template
    String templateKey = "properties"; // The name of the metadata template
    try {
      MetadataFull result = client
              .metadataInstancesFolders
              .applyTemplate(folderId, scope, templateKey)
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
      System.err.println("Exception when calling MetadataInstancesFoldersApi#applyTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataFull> response = client
              .metadataInstancesFolders
              .applyTemplate(folderId, scope, templateKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFoldersApi#applyTemplate");
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
| **folderId** | **String**| The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folder/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;.  The root folder of a Box account is always represented by the ID &#x60;0&#x60;. | |
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
| **201** | Returns the instance of the template that was applied to the folder, including the data that was applied to the template. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getFolderMetadataInstance"></a>
# **getFolderMetadataInstance**
> MetadataFull getFolderMetadataInstance(folderId, scope, templateKey).execute();

Get metadata instance on folder

Retrieves the instance of a metadata template that has been applied to a folder. This can not be used on the root folder with ID &#x60;0&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataInstancesFoldersApi;
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
    String folderId = "12345"; // The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/folder/123` the `folder_id` is `123`.  The root folder of a Box account is always represented by the ID `0`.
    String scope = "global"; // The scope of the metadata template
    String templateKey = "properties"; // The name of the metadata template
    try {
      MetadataFull result = client
              .metadataInstancesFolders
              .getFolderMetadataInstance(folderId, scope, templateKey)
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
      System.err.println("Exception when calling MetadataInstancesFoldersApi#getFolderMetadataInstance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataFull> response = client
              .metadataInstancesFolders
              .getFolderMetadataInstance(folderId, scope, templateKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFoldersApi#getFolderMetadataInstance");
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
| **folderId** | **String**| The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folder/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;.  The root folder of a Box account is always represented by the ID &#x60;0&#x60;. | |
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

<a name="listOnFolder"></a>
# **listOnFolder**
> Metadatas listOnFolder(folderId).execute();

List metadata instances on folder

Retrieves all metadata for a given folder. This can not be used on the root folder with ID &#x60;0&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataInstancesFoldersApi;
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
    String folderId = "12345"; // The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/folder/123` the `folder_id` is `123`.  The root folder of a Box account is always represented by the ID `0`.
    try {
      Metadatas result = client
              .metadataInstancesFolders
              .listOnFolder(folderId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntries());
      System.out.println(result.getLimit());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFoldersApi#listOnFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Metadatas> response = client
              .metadataInstancesFolders
              .listOnFolder(folderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFoldersApi#listOnFolder");
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
| **folderId** | **String**| The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folder/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;.  The root folder of a Box account is always represented by the ID &#x60;0&#x60;. | |

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
| **200** | Returns all the metadata associated with a folder.  This API does not support pagination and will therefore always return all of the metadata associated to the folder. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeInstance"></a>
# **removeInstance**
> removeInstance(folderId, scope, templateKey).execute();

Remove metadata instance from folder

Deletes a piece of folder metadata.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataInstancesFoldersApi;
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
    String folderId = "12345"; // The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/folder/123` the `folder_id` is `123`.  The root folder of a Box account is always represented by the ID `0`.
    String scope = "global"; // The scope of the metadata template
    String templateKey = "properties"; // The name of the metadata template
    try {
      client
              .metadataInstancesFolders
              .removeInstance(folderId, scope, templateKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFoldersApi#removeInstance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .metadataInstancesFolders
              .removeInstance(folderId, scope, templateKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFoldersApi#removeInstance");
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
| **folderId** | **String**| The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folder/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;.  The root folder of a Box account is always represented by the ID &#x60;0&#x60;. | |
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

<a name="updateInstanceOnFolder"></a>
# **updateInstanceOnFolder**
> MetadataFull updateInstanceOnFolder(folderId, scope, templateKey).ametadataInstanceUpdateOperation1(ametadataInstanceUpdateOperation1).execute();

Update metadata instance on folder

Updates a piece of metadata on a folder.  The metadata instance can only be updated if the template has already been applied to the folder before. When editing metadata, only values that match the metadata template schema will be accepted.  The update is applied atomically. If any errors occur during the application of the operations, the metadata instance will not be changed.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataInstancesFoldersApi;
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
    String folderId = "12345"; // The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/folder/123` the `folder_id` is `123`.  The root folder of a Box account is always represented by the ID `0`.
    String scope = "global"; // The scope of the metadata template
    String templateKey = "properties"; // The name of the metadata template
    try {
      MetadataFull result = client
              .metadataInstancesFolders
              .updateInstanceOnFolder(folderId, scope, templateKey)
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
      System.err.println("Exception when calling MetadataInstancesFoldersApi#updateInstanceOnFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataFull> response = client
              .metadataInstancesFolders
              .updateInstanceOnFolder(folderId, scope, templateKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataInstancesFoldersApi#updateInstanceOnFolder");
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
| **folderId** | **String**| The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folder/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;.  The root folder of a Box account is always represented by the ID &#x60;0&#x60;. | |
| **scope** | **String**| The scope of the metadata template | [enum: global, enterprise] |
| **templateKey** | **String**| The name of the metadata template | |
| **ametadataInstanceUpdateOperation1** | [**List&lt;AMetadataInstanceUpdateOperation1&gt;**](AMetadataInstanceUpdateOperation1.md)|  | [optional] |

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

