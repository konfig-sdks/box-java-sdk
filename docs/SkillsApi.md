# SkillsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applyBoxSkillCards**](SkillsApi.md#applyBoxSkillCards) | **POST** /files/{file_id}/metadata/global/boxSkillsCards | Create Box Skill cards on file |
| [**listBoxSkillCards**](SkillsApi.md#listBoxSkillCards) | **GET** /files/{file_id}/metadata/global/boxSkillsCards | List Box Skill cards on file |
| [**removeBoxSkillCards**](SkillsApi.md#removeBoxSkillCards) | **DELETE** /files/{file_id}/metadata/global/boxSkillsCards | Remove Box Skill cards from file |
| [**updateAllBoxSkillCards**](SkillsApi.md#updateAllBoxSkillCards) | **PUT** /skill_invocations/{skill_id} | Update all Box Skill cards on file |
| [**updateBoxSkillCardsOnFile**](SkillsApi.md#updateBoxSkillCardsOnFile) | **PUT** /files/{file_id}/metadata/global/boxSkillsCards | Update Box Skill cards on file |


<a name="applyBoxSkillCards"></a>
# **applyBoxSkillCards**
> SkillCardsMetadata applyBoxSkillCards(fileId).skillsApplyBoxSkillCardsRequest(skillsApplyBoxSkillCardsRequest).execute();

Create Box Skill cards on file

Applies one or more Box Skills metadata cards to a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SkillsApi;
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
    List<Object> cards = Arrays.asList(null); // A list of Box Skill cards to apply to this file.
    String fileId = "12345"; // The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/files/123` the `file_id` is `123`.
    try {
      SkillCardsMetadata result = client
              .skills
              .applyBoxSkillCards(cards, fileId)
              .execute();
      System.out.println(result);
      System.out.println(result.get$CanEdit());
      System.out.println(result.get$Id());
      System.out.println(result.get$Parent());
      System.out.println(result.get$Scope());
      System.out.println(result.get$Template());
      System.out.println(result.get$Type());
      System.out.println(result.get$TypeVersion());
      System.out.println(result.get$Version());
      System.out.println(result.getCards());
    } catch (ApiException e) {
      System.err.println("Exception when calling SkillsApi#applyBoxSkillCards");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SkillCardsMetadata> response = client
              .skills
              .applyBoxSkillCards(cards, fileId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SkillsApi#applyBoxSkillCards");
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
| **skillsApplyBoxSkillCardsRequest** | [**SkillsApplyBoxSkillCardsRequest**](SkillsApplyBoxSkillCardsRequest.md)|  | [optional] |

### Return type

[**SkillCardsMetadata**](SkillCardsMetadata.md)

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

<a name="listBoxSkillCards"></a>
# **listBoxSkillCards**
> SkillCardsMetadata listBoxSkillCards(fileId).execute();

List Box Skill cards on file

List the Box Skills metadata cards that are attached to a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SkillsApi;
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
      SkillCardsMetadata result = client
              .skills
              .listBoxSkillCards(fileId)
              .execute();
      System.out.println(result);
      System.out.println(result.get$CanEdit());
      System.out.println(result.get$Id());
      System.out.println(result.get$Parent());
      System.out.println(result.get$Scope());
      System.out.println(result.get$Template());
      System.out.println(result.get$Type());
      System.out.println(result.get$TypeVersion());
      System.out.println(result.get$Version());
      System.out.println(result.getCards());
    } catch (ApiException e) {
      System.err.println("Exception when calling SkillsApi#listBoxSkillCards");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SkillCardsMetadata> response = client
              .skills
              .listBoxSkillCards(fileId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SkillsApi#listBoxSkillCards");
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

[**SkillCardsMetadata**](SkillCardsMetadata.md)

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

<a name="removeBoxSkillCards"></a>
# **removeBoxSkillCards**
> removeBoxSkillCards(fileId).execute();

Remove Box Skill cards from file

Removes any Box Skills cards metadata from a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SkillsApi;
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
              .skills
              .removeBoxSkillCards(fileId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SkillsApi#removeBoxSkillCards");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .skills
              .removeBoxSkillCards(fileId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SkillsApi#removeBoxSkillCards");
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
| **204** | Returns an empty response when the cards are successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateAllBoxSkillCards"></a>
# **updateAllBoxSkillCards**
> updateAllBoxSkillCards(skillId).skillsUpdateAllBoxSkillCardsRequest(skillsUpdateAllBoxSkillCardsRequest).execute();

Update all Box Skill cards on file

An alternative method that can be used to overwrite and update all Box Skill metadata cards on a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SkillsApi;
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
    String status = "invoked"; // Defines the status of this invocation. Set this to `success` when setting Skill cards.
    SkillsUpdateAllBoxSkillCardsRequestMetadata metadata = new SkillsUpdateAllBoxSkillCardsRequestMetadata();
    SkillsUpdateAllBoxSkillCardsRequestFile _file = new SkillsUpdateAllBoxSkillCardsRequestFile();
    String skillId = "33243242"; // The ID of the skill to apply this metadata for.
    SkillsUpdateAllBoxSkillCardsRequestFileVersion fileVersion = new SkillsUpdateAllBoxSkillCardsRequestFileVersion();
    SkillsUpdateAllBoxSkillCardsRequestUsage usage = new SkillsUpdateAllBoxSkillCardsRequestUsage();
    try {
      client
              .skills
              .updateAllBoxSkillCards(status, metadata, _file, skillId)
              .fileVersion(fileVersion)
              .usage(usage)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SkillsApi#updateAllBoxSkillCards");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .skills
              .updateAllBoxSkillCards(status, metadata, _file, skillId)
              .fileVersion(fileVersion)
              .usage(usage)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SkillsApi#updateAllBoxSkillCards");
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
| **skillId** | **String**| The ID of the skill to apply this metadata for. | |
| **skillsUpdateAllBoxSkillCardsRequest** | [**SkillsUpdateAllBoxSkillCardsRequest**](SkillsUpdateAllBoxSkillCardsRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an empty response when the card has been successfully updated. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateBoxSkillCardsOnFile"></a>
# **updateBoxSkillCardsOnFile**
> SkillCardsMetadata updateBoxSkillCardsOnFile(fileId).skillsUpdateBoxSkillCardsOnFileRequestInner(skillsUpdateBoxSkillCardsOnFileRequestInner).execute();

Update Box Skill cards on file

Updates one or more Box Skills metadata cards to a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SkillsApi;
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
      SkillCardsMetadata result = client
              .skills
              .updateBoxSkillCardsOnFile(fileId)
              .execute();
      System.out.println(result);
      System.out.println(result.get$CanEdit());
      System.out.println(result.get$Id());
      System.out.println(result.get$Parent());
      System.out.println(result.get$Scope());
      System.out.println(result.get$Template());
      System.out.println(result.get$Type());
      System.out.println(result.get$TypeVersion());
      System.out.println(result.get$Version());
      System.out.println(result.getCards());
    } catch (ApiException e) {
      System.err.println("Exception when calling SkillsApi#updateBoxSkillCardsOnFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SkillCardsMetadata> response = client
              .skills
              .updateBoxSkillCardsOnFile(fileId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SkillsApi#updateBoxSkillCardsOnFile");
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
| **skillsUpdateBoxSkillCardsOnFileRequestInner** | [**List&lt;SkillsUpdateBoxSkillCardsOnFileRequestInner&gt;**](SkillsUpdateBoxSkillCardsOnFileRequestInner.md)|  | [optional] |

### Return type

[**SkillCardsMetadata**](SkillCardsMetadata.md)

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

