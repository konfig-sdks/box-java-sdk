# ClassificationsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewClassifications**](ClassificationsApi.md#addNewClassifications) | **PUT** /metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema#add | Add classification |
| [**initializeTemplate**](ClassificationsApi.md#initializeTemplate) | **POST** /metadata_templates/schema#classifications | Add initial classifications |
| [**listAllClassifications**](ClassificationsApi.md#listAllClassifications) | **GET** /metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema | List all classifications |
| [**updateLabelsDescriptions**](ClassificationsApi.md#updateLabelsDescriptions) | **PUT** /metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema#update | Update classification |


<a name="addNewClassifications"></a>
# **addNewClassifications**
> ClassificationTemplate addNewClassifications().classificationsAddNewClassificationsRequestInner(classificationsAddNewClassificationsRequestInner).execute();

Add classification

Adds one or more new classifications to the list of classifications available to the enterprise.  This API can also be called by including the enterprise ID in the URL explicitly, for example &#x60;/metadata_templates/enterprise_12345/securityClassification-6VMVochwUWo/schema&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClassificationsApi;
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
    try {
      ClassificationTemplate result = client
              .classifications
              .addNewClassifications()
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getScope());
      System.out.println(result.getTemplateKey());
      System.out.println(result.getDisplayName());
      System.out.println(result.getHidden());
      System.out.println(result.getCopyInstanceOnItemCopy());
      System.out.println(result.getFields());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsApi#addNewClassifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClassificationTemplate> response = client
              .classifications
              .addNewClassifications()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsApi#addNewClassifications");
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
| **classificationsAddNewClassificationsRequestInner** | [**List&lt;ClassificationsAddNewClassificationsRequestInner&gt;**](ClassificationsAddNewClassificationsRequestInner.md)|  | [optional] |

### Return type

[**ClassificationTemplate**](ClassificationTemplate.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated &#x60;securityClassification&#x60; metadata template, which contains a &#x60;Box__Security__Classification__Key&#x60; field that lists all the classifications available to this enterprise. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="initializeTemplate"></a>
# **initializeTemplate**
> ClassificationTemplate initializeTemplate().classificationsInitializeTemplateRequest(classificationsInitializeTemplateRequest).execute();

Add initial classifications

When an enterprise does not yet have any classifications, this API call initializes the classification template with an initial set of classifications.  If an enterprise already has a classification, the template will already exist and instead an API call should be made to add additional classifications.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClassificationsApi;
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
    String scope = "enterprise"; // The scope in which to create the classifications. This should be `enterprise` or `enterprise_{id}` where `id` is the unique ID of the enterprise.
    String templateKey = "securityClassification-6VMVochwUWo"; // Defines the list of metadata templates.
    String displayName = "Classification"; // The name of the template as shown in web and mobile interfaces.
    List<ClassificationsInitializeTemplateRequestFieldsInner> fields = Arrays.asList(); // The classification template requires exactly one field, which holds all the valid classification values.
    Boolean hidden = true; // Determines if the classification template is hidden or available on web and mobile devices.
    Boolean copyInstanceOnItemCopy = true; // Determines if classifications are copied along when the file or folder is copied.
    try {
      ClassificationTemplate result = client
              .classifications
              .initializeTemplate(scope, templateKey, displayName, fields)
              .hidden(hidden)
              .copyInstanceOnItemCopy(copyInstanceOnItemCopy)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getScope());
      System.out.println(result.getTemplateKey());
      System.out.println(result.getDisplayName());
      System.out.println(result.getHidden());
      System.out.println(result.getCopyInstanceOnItemCopy());
      System.out.println(result.getFields());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsApi#initializeTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClassificationTemplate> response = client
              .classifications
              .initializeTemplate(scope, templateKey, displayName, fields)
              .hidden(hidden)
              .copyInstanceOnItemCopy(copyInstanceOnItemCopy)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsApi#initializeTemplate");
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
| **classificationsInitializeTemplateRequest** | [**ClassificationsInitializeTemplateRequest**](ClassificationsInitializeTemplateRequest.md)|  | [optional] |

### Return type

[**ClassificationTemplate**](ClassificationTemplate.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a new &#x60;securityClassification&#x60; metadata template, which contains a &#x60;Box__Security__Classification__Key&#x60; field that lists all the classifications available to this enterprise. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listAllClassifications"></a>
# **listAllClassifications**
> ClassificationTemplate listAllClassifications().execute();

List all classifications

Retrieves the classification metadata template and lists all the classifications available to this enterprise.  This API can also be called by including the enterprise ID in the URL explicitly, for example &#x60;/metadata_templates/enterprise_12345/securityClassification-6VMVochwUWo/schema&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClassificationsApi;
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
    try {
      ClassificationTemplate result = client
              .classifications
              .listAllClassifications()
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getScope());
      System.out.println(result.getTemplateKey());
      System.out.println(result.getDisplayName());
      System.out.println(result.getHidden());
      System.out.println(result.getCopyInstanceOnItemCopy());
      System.out.println(result.getFields());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsApi#listAllClassifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClassificationTemplate> response = client
              .classifications
              .listAllClassifications()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsApi#listAllClassifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClassificationTemplate**](ClassificationTemplate.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the &#x60;securityClassification&#x60; metadata template, which contains a &#x60;Box__Security__Classification__Key&#x60; field that lists all the classifications available to this enterprise. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateLabelsDescriptions"></a>
# **updateLabelsDescriptions**
> ClassificationTemplate updateLabelsDescriptions().classificationsUpdateLabelsDescriptionsRequestInner(classificationsUpdateLabelsDescriptionsRequestInner).execute();

Update classification

Updates the labels and descriptions of one or more classifications available to the enterprise.  This API can also be called by including the enterprise ID in the URL explicitly, for example &#x60;/metadata_templates/enterprise_12345/securityClassification-6VMVochwUWo/schema&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClassificationsApi;
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
    try {
      ClassificationTemplate result = client
              .classifications
              .updateLabelsDescriptions()
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getScope());
      System.out.println(result.getTemplateKey());
      System.out.println(result.getDisplayName());
      System.out.println(result.getHidden());
      System.out.println(result.getCopyInstanceOnItemCopy());
      System.out.println(result.getFields());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsApi#updateLabelsDescriptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClassificationTemplate> response = client
              .classifications
              .updateLabelsDescriptions()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClassificationsApi#updateLabelsDescriptions");
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
| **classificationsUpdateLabelsDescriptionsRequestInner** | [**List&lt;ClassificationsUpdateLabelsDescriptionsRequestInner&gt;**](ClassificationsUpdateLabelsDescriptionsRequestInner.md)|  | [optional] |

### Return type

[**ClassificationTemplate**](ClassificationTemplate.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated &#x60;securityClassification&#x60; metadata template, which contains a &#x60;Box__Security__Classification__Key&#x60; field that lists all the classifications available to this enterprise. |  -  |
| **0** | An unexpected client error. |  -  |

