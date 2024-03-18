# ClassificationsOnFoldersApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addClassificationToFolder**](ClassificationsOnFoldersApi.md#addClassificationToFolder) | **POST** /folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo | Add classification to folder |
| [**getClassificationMetadata**](ClassificationsOnFoldersApi.md#getClassificationMetadata) | **GET** /folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo | Get classification on folder |
| [**removeFromFolder**](ClassificationsOnFoldersApi.md#removeFromFolder) | **DELETE** /folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo | Remove classification from folder |
| [**updateClassification**](ClassificationsOnFoldersApi.md#updateClassification) | **PUT** /folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo | Update classification on folder |


<a name="addClassificationToFolder"></a>
# **addClassificationToFolder**
> Classification addClassificationToFolder(folderId).classificationsOnFoldersAddClassificationToFolderRequest(classificationsOnFoldersAddClassificationToFolderRequest).execute();

Add classification to folder

Adds a classification to a folder by specifying the label of the classification to add.  This API can also be called by including the enterprise ID in the URL explicitly, for example &#x60;/folders/:id//enterprise_12345/securityClassification-6VMVochwUWo&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClassificationsOnFoldersApi;
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
    String boxSecurityClassificationKey = "boxSecurityClassificationKey_example"; // The name of the classification to apply to this folder.  To list the available classifications in an enterprise, use the classification API to retrieve the [classification template](e://get_metadata_templates_enterprise_securityClassification-6VMVochwUWo_schema) which lists all available classification keys.
    try {
      Classification result = client
              .classificationsOnFolders
              .addClassificationToFolder(folderId)
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
      System.err.println("Exception when calling ClassificationsOnFoldersApi#addClassificationToFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Classification> response = client
              .classificationsOnFolders
              .addClassificationToFolder(folderId)
              .boxSecurityClassificationKey(boxSecurityClassificationKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsOnFoldersApi#addClassificationToFolder");
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
| **classificationsOnFoldersAddClassificationToFolderRequest** | [**ClassificationsOnFoldersAddClassificationToFolderRequest**](ClassificationsOnFoldersAddClassificationToFolderRequest.md)|  | [optional] |

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
| **201** | Returns the classification template instance that was applied to the folder. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getClassificationMetadata"></a>
# **getClassificationMetadata**
> Classification getClassificationMetadata(folderId).execute();

Get classification on folder

Retrieves the classification metadata instance that has been applied to a folder.  This API can also be called by including the enterprise ID in the URL explicitly, for example &#x60;/folders/:id//enterprise_12345/securityClassification-6VMVochwUWo&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClassificationsOnFoldersApi;
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
      Classification result = client
              .classificationsOnFolders
              .getClassificationMetadata(folderId)
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
      System.err.println("Exception when calling ClassificationsOnFoldersApi#getClassificationMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Classification> response = client
              .classificationsOnFolders
              .getClassificationMetadata(folderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsOnFoldersApi#getClassificationMetadata");
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

<a name="removeFromFolder"></a>
# **removeFromFolder**
> removeFromFolder(folderId).execute();

Remove classification from folder

Removes any classifications from a folder.  This API can also be called by including the enterprise ID in the URL explicitly, for example &#x60;/folders/:id//enterprise_12345/securityClassification-6VMVochwUWo&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClassificationsOnFoldersApi;
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
      client
              .classificationsOnFolders
              .removeFromFolder(folderId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsOnFoldersApi#removeFromFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .classificationsOnFolders
              .removeFromFolder(folderId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsOnFoldersApi#removeFromFolder");
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

<a name="updateClassification"></a>
# **updateClassification**
> Classification updateClassification(folderId).classificationsOnFoldersUpdateClassificationRequestInner(classificationsOnFoldersUpdateClassificationRequestInner).execute();

Update classification on folder

Updates a classification on a folder.  The classification can only be updated if a classification has already been applied to the folder before. When editing classifications, only values are defined for the enterprise will be accepted.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClassificationsOnFoldersApi;
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
      Classification result = client
              .classificationsOnFolders
              .updateClassification(folderId)
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
      System.err.println("Exception when calling ClassificationsOnFoldersApi#updateClassification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Classification> response = client
              .classificationsOnFolders
              .updateClassification(folderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsOnFoldersApi#updateClassification");
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
| **classificationsOnFoldersUpdateClassificationRequestInner** | [**List&lt;ClassificationsOnFoldersUpdateClassificationRequestInner&gt;**](ClassificationsOnFoldersUpdateClassificationRequestInner.md)|  | [optional] |

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

