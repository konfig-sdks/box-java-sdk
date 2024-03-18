# MetadataTemplatesApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewTemplate**](MetadataTemplatesApi.md#createNewTemplate) | **POST** /metadata_templates/schema | Create metadata template |
| [**deleteSchema**](MetadataTemplatesApi.md#deleteSchema) | **DELETE** /metadata_templates/{scope}/{template_key}/schema | Remove metadata template |
| [**findByInstanceId**](MetadataTemplatesApi.md#findByInstanceId) | **GET** /metadata_templates | Find metadata template by instance ID |
| [**getById**](MetadataTemplatesApi.md#getById) | **GET** /metadata_templates/{template_id} | Get metadata template by ID |
| [**getByNameSchema**](MetadataTemplatesApi.md#getByNameSchema) | **GET** /metadata_templates/{scope}/{template_key}/schema | Get metadata template by name |
| [**listForEnterprise**](MetadataTemplatesApi.md#listForEnterprise) | **GET** /metadata_templates/enterprise | List all metadata templates for enterprise |
| [**listGlobal**](MetadataTemplatesApi.md#listGlobal) | **GET** /metadata_templates/global | List all global metadata templates |
| [**updateSchema**](MetadataTemplatesApi.md#updateSchema) | **PUT** /metadata_templates/{scope}/{template_key}/schema | Update metadata template |


<a name="createNewTemplate"></a>
# **createNewTemplate**
> MetadataTemplate createNewTemplate().metadataTemplatesCreateNewTemplateRequest(metadataTemplatesCreateNewTemplateRequest).execute();

Create metadata template

Creates a new metadata template that can be applied to files and folders.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataTemplatesApi;
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
    String scope = "scope_example"; // The scope of the metadata template to create. Applications can only create templates for use within the authenticated user's enterprise.  This value needs to be set to `enterprise`, as `global` scopes can not be created by applications.
    String displayName = "displayName_example"; // The display name of the template.
    String templateKey = "templateKey_example"; // A unique identifier for the template. This identifier needs to be unique across the enterprise for which the metadata template is being created.  When not provided, the API will create a unique `templateKey` based on the value of the `displayName`.
    Boolean hidden = false; // Defines if this template is visible in the Box web app UI, or if it is purely intended for usage through the API.
    List<MetadataFieldWrite> fields = Arrays.asList(); // An ordered list of template fields which are part of the template. Each field can be a regular text field, date field, number field, as well as a single or multi-select list.
    Boolean copyInstanceOnItemCopy = false; // Whether or not to copy any metadata attached to a file or folder when it is copied. By default, metadata is not copied along with a file or folder when it is copied.
    try {
      MetadataTemplate result = client
              .metadataTemplates
              .createNewTemplate(scope, displayName)
              .templateKey(templateKey)
              .hidden(hidden)
              .fields(fields)
              .copyInstanceOnItemCopy(copyInstanceOnItemCopy)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getScope());
      System.out.println(result.getTemplateKey());
      System.out.println(result.getDisplayName());
      System.out.println(result.getHidden());
      System.out.println(result.getFields());
      System.out.println(result.getCopyInstanceOnItemCopy());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataTemplatesApi#createNewTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataTemplate> response = client
              .metadataTemplates
              .createNewTemplate(scope, displayName)
              .templateKey(templateKey)
              .hidden(hidden)
              .fields(fields)
              .copyInstanceOnItemCopy(copyInstanceOnItemCopy)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataTemplatesApi#createNewTemplate");
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
| **metadataTemplatesCreateNewTemplateRequest** | [**MetadataTemplatesCreateNewTemplateRequest**](MetadataTemplatesCreateNewTemplateRequest.md)|  | [optional] |

### Return type

[**MetadataTemplate**](MetadataTemplate.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The schema representing the metadata template created. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="deleteSchema"></a>
# **deleteSchema**
> deleteSchema(scope, templateKey).execute();

Remove metadata template

Delete a metadata template and its instances. This deletion is permanent and can not be reversed.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataTemplatesApi;
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
    String scope = "global"; // The scope of the metadata template
    String templateKey = "properties"; // The name of the metadata template
    try {
      client
              .metadataTemplates
              .deleteSchema(scope, templateKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataTemplatesApi#deleteSchema");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .metadataTemplates
              .deleteSchema(scope, templateKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataTemplatesApi#deleteSchema");
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
| **204** | Returns an empty response when the metadata template is successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="findByInstanceId"></a>
# **findByInstanceId**
> MetadataTemplates findByInstanceId(metadataInstanceId).execute();

Find metadata template by instance ID

Finds a metadata template by searching for the ID of an instance of the template.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataTemplatesApi;
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
    UUID metadataInstanceId = UUID.fromString("01234500-12f1-1234-aa12-b1d234cb567e"); // The ID of an instance of the metadata template to find.
    try {
      MetadataTemplates result = client
              .metadataTemplates
              .findByInstanceId(metadataInstanceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataTemplatesApi#findByInstanceId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataTemplates> response = client
              .metadataTemplates
              .findByInstanceId(metadataInstanceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataTemplatesApi#findByInstanceId");
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
| **metadataInstanceId** | **UUID**| The ID of an instance of the metadata template to find. | |

### Return type

[**MetadataTemplates**](MetadataTemplates.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list containing the 1 metadata template that matches the instance ID. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getById"></a>
# **getById**
> MetadataTemplate getById(templateId).execute();

Get metadata template by ID

Retrieves a metadata template by its ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataTemplatesApi;
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
    String templateId = "f7a9891f"; // The ID of the template
    try {
      MetadataTemplate result = client
              .metadataTemplates
              .getById(templateId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getScope());
      System.out.println(result.getTemplateKey());
      System.out.println(result.getDisplayName());
      System.out.println(result.getHidden());
      System.out.println(result.getFields());
      System.out.println(result.getCopyInstanceOnItemCopy());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataTemplatesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataTemplate> response = client
              .metadataTemplates
              .getById(templateId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataTemplatesApi#getById");
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
| **templateId** | **String**| The ID of the template | |

### Return type

[**MetadataTemplate**](MetadataTemplate.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the metadata template that matches the ID. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getByNameSchema"></a>
# **getByNameSchema**
> MetadataTemplate getByNameSchema(scope, templateKey).execute();

Get metadata template by name

Retrieves a metadata template by its &#x60;scope&#x60; and &#x60;templateKey&#x60; values.  To find the &#x60;scope&#x60; and &#x60;templateKey&#x60; for a template, list all templates for an enterprise or globally, or list all templates applied to a file or folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataTemplatesApi;
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
    String scope = "global"; // The scope of the metadata template
    String templateKey = "properties"; // The name of the metadata template
    try {
      MetadataTemplate result = client
              .metadataTemplates
              .getByNameSchema(scope, templateKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getScope());
      System.out.println(result.getTemplateKey());
      System.out.println(result.getDisplayName());
      System.out.println(result.getHidden());
      System.out.println(result.getFields());
      System.out.println(result.getCopyInstanceOnItemCopy());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataTemplatesApi#getByNameSchema");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataTemplate> response = client
              .metadataTemplates
              .getByNameSchema(scope, templateKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataTemplatesApi#getByNameSchema");
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
| **scope** | **String**| The scope of the metadata template | [enum: global, enterprise] |
| **templateKey** | **String**| The name of the metadata template | |

### Return type

[**MetadataTemplate**](MetadataTemplate.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the metadata template matching the &#x60;scope&#x60; and &#x60;template&#x60; name. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listForEnterprise"></a>
# **listForEnterprise**
> MetadataTemplates listForEnterprise().marker(marker).limit(limit).execute();

List all metadata templates for enterprise

Used to retrieve all metadata templates created to be used specifically within the user&#39;s enterprise

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataTemplatesApi;
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
    try {
      MetadataTemplates result = client
              .metadataTemplates
              .listForEnterprise()
              .marker(marker)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataTemplatesApi#listForEnterprise");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataTemplates> response = client
              .metadataTemplates
              .listForEnterprise()
              .marker(marker)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataTemplatesApi#listForEnterprise");
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

### Return type

[**MetadataTemplates**](MetadataTemplates.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns all of the metadata templates within an enterprise and their corresponding schema. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listGlobal"></a>
# **listGlobal**
> MetadataTemplates listGlobal().marker(marker).limit(limit).execute();

List all global metadata templates

Used to retrieve all generic, global metadata templates available to all enterprises using Box.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataTemplatesApi;
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
    try {
      MetadataTemplates result = client
              .metadataTemplates
              .listGlobal()
              .marker(marker)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataTemplatesApi#listGlobal");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataTemplates> response = client
              .metadataTemplates
              .listGlobal()
              .marker(marker)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataTemplatesApi#listGlobal");
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

### Return type

[**MetadataTemplates**](MetadataTemplates.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns all of the metadata templates available to all enterprises and their corresponding schema. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateSchema"></a>
# **updateSchema**
> MetadataTemplate updateSchema(scope, templateKey).ametadataTemplateUpdateOperation(ametadataTemplateUpdateOperation).execute();

Update metadata template

Updates a metadata template.  The metadata template can only be updated if the template already exists.  The update is applied atomically. If any errors occur during the application of the operations, the metadata template will not be changed.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataTemplatesApi;
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
    String scope = "global"; // The scope of the metadata template
    String templateKey = "properties"; // The name of the metadata template
    try {
      MetadataTemplate result = client
              .metadataTemplates
              .updateSchema(scope, templateKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getScope());
      System.out.println(result.getTemplateKey());
      System.out.println(result.getDisplayName());
      System.out.println(result.getHidden());
      System.out.println(result.getFields());
      System.out.println(result.getCopyInstanceOnItemCopy());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataTemplatesApi#updateSchema");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataTemplate> response = client
              .metadataTemplates
              .updateSchema(scope, templateKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataTemplatesApi#updateSchema");
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
| **scope** | **String**| The scope of the metadata template | [enum: global, enterprise] |
| **templateKey** | **String**| The name of the metadata template | |
| **ametadataTemplateUpdateOperation** | [**List&lt;AMetadataTemplateUpdateOperation&gt;**](AMetadataTemplateUpdateOperation.md)|  | [optional] |

### Return type

[**MetadataTemplate**](MetadataTemplate.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated metadata template, with the custom template data included. |  -  |
| **0** | An unexpected client error. |  -  |

