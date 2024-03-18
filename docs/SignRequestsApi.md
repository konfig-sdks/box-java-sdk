# SignRequestsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelRequest**](SignRequestsApi.md#cancelRequest) | **POST** /sign_requests/{sign_request_id}/cancel | Cancel sign request |
| [**createRequest**](SignRequestsApi.md#createRequest) | **POST** /sign_requests | Create sign request |
| [**getById**](SignRequestsApi.md#getById) | **GET** /sign_requests/{sign_request_id} | Get sign request by ID |
| [**list**](SignRequestsApi.md#list) | **GET** /sign_requests | List sign requests |
| [**resendSignRequestEmails**](SignRequestsApi.md#resendSignRequestEmails) | **POST** /sign_requests/{sign_request_id}/resend | Resend sign request |


<a name="cancelRequest"></a>
# **cancelRequest**
> SignRequest cancelRequest(signRequestId).execute();

Cancel sign request

Cancels a sign request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignRequestsApi;
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
    String signRequestId = "33243242"; // The ID of the sign request
    try {
      SignRequest result = client
              .signRequests
              .cancelRequest(signRequestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getIsDocumentPreparationNeeded());
      System.out.println(result.getRedirectUrl());
      System.out.println(result.getDeclinedRedirectUrl());
      System.out.println(result.getAreTextSignaturesEnabled());
      System.out.println(result.getEmailSubject());
      System.out.println(result.getEmailMessage());
      System.out.println(result.getAreRemindersEnabled());
      System.out.println(result.getName());
      System.out.println(result.getPrefillTags());
      System.out.println(result.getDaysValid());
      System.out.println(result.getExternalId());
      System.out.println(result.getIsPhoneVerificationRequiredToView());
      System.out.println(result.getTemplateId());
      System.out.println(result.getType());
      System.out.println(result.getSourceFiles());
      System.out.println(result.getSigners());
      System.out.println(result.getSignatureColor());
      System.out.println(result.getId());
      System.out.println(result.getPrepareUrl());
      System.out.println(result.getSigningLog());
      System.out.println(result.getStatus());
      System.out.println(result.getSignFiles());
      System.out.println(result.getAutoExpireAt());
      System.out.println(result.getParentFolder());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignRequestsApi#cancelRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SignRequest> response = client
              .signRequests
              .cancelRequest(signRequestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignRequestsApi#cancelRequest");
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
| **signRequestId** | **String**| The ID of the sign request | |

### Return type

[**SignRequest**](SignRequest.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a Sign Request object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="createRequest"></a>
# **createRequest**
> SignRequest createRequest().signRequestCreateRequest(signRequestCreateRequest).execute();

Create sign request

Creates a sign request. This involves preparing a document for signing and sending the sign request to signers.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignRequestsApi;
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
    List<SignRequestCreateSigner> signers = Arrays.asList(); // Array of signers for the sign request. 35 is the max number of signers permitted.
    Boolean isDocumentPreparationNeeded = true; // Indicates if the sender should receive a `prepare_url` in the response to complete document preparation via UI.
    String redirectUrl = "redirectUrl_example"; // When specified, signature request will be redirected to this url when a document is signed.
    String declinedRedirectUrl = "declinedRedirectUrl_example"; // The uri that a signer will be redirected to after declining to sign a document.
    Boolean areTextSignaturesEnabled = true; // Disables the usage of signatures generated by typing (text).
    String emailSubject = "emailSubject_example"; // Subject of sign request email. This is cleaned by sign request. If this field is not passed, a default subject will be used.
    String emailMessage = "emailMessage_example"; // Message to include in sign request email. The field is cleaned through sanitization of specific characters. However, some html tags are allowed. Links included in the message are also converted to hyperlinks in the email. The message may contain the following html tags including `a`, `abbr`, `acronym`, `b`, `blockquote`, `code`, `em`, `i`, `ul`, `li`, `ol`, and `strong`. Be aware that when the text to html ratio is too high, the email may end up in spam filters. Custom styles on these tags are not allowed. If this field is not passed, a default message will be used.
    Boolean areRemindersEnabled = true; // Reminds signers to sign a document on day 3, 8, 13 and 18. Reminders are only sent to outstanding signers.
    String name = "name_example"; // Name of the sign request.
    List<SignRequestPrefillTag> prefillTags = Arrays.asList(); // When a document contains sign related tags in the content, you can prefill them using this `prefill_tags` by referencing the 'id' of the tag as the `external_id` field of the prefill tag.
    Integer daysValid = 56; // Set the number of days after which the created signature request will automatically expire if not completed. By default, we do not apply any expiration date on signature requests, and the signature request does not expire.
    String externalId = "externalId_example"; // This can be used to reference an ID in an external system that the sign request is related to.
    Boolean isPhoneVerificationRequiredToView = true; // Forces signers to verify a text message prior to viewing the document. You must specify the phone number of signers to have this setting apply to them.
    String templateId = "templateId_example"; // When a signature request is created from a template this field will indicate the id of that template.
    List<FileBase> sourceFiles = Arrays.asList(); // List of files to create a signing document from. This is currently limited to ten files. Only the ID and type fields are required for each file.
    String signatureColor = "blue"; // Force a specific color for the signature (blue, black, or red)
    FolderMini parentFolder = new FolderMini();
    try {
      SignRequest result = client
              .signRequests
              .createRequest(signers)
              .isDocumentPreparationNeeded(isDocumentPreparationNeeded)
              .redirectUrl(redirectUrl)
              .declinedRedirectUrl(declinedRedirectUrl)
              .areTextSignaturesEnabled(areTextSignaturesEnabled)
              .emailSubject(emailSubject)
              .emailMessage(emailMessage)
              .areRemindersEnabled(areRemindersEnabled)
              .name(name)
              .prefillTags(prefillTags)
              .daysValid(daysValid)
              .externalId(externalId)
              .isPhoneVerificationRequiredToView(isPhoneVerificationRequiredToView)
              .templateId(templateId)
              .sourceFiles(sourceFiles)
              .signatureColor(signatureColor)
              .parentFolder(parentFolder)
              .execute();
      System.out.println(result);
      System.out.println(result.getIsDocumentPreparationNeeded());
      System.out.println(result.getRedirectUrl());
      System.out.println(result.getDeclinedRedirectUrl());
      System.out.println(result.getAreTextSignaturesEnabled());
      System.out.println(result.getEmailSubject());
      System.out.println(result.getEmailMessage());
      System.out.println(result.getAreRemindersEnabled());
      System.out.println(result.getName());
      System.out.println(result.getPrefillTags());
      System.out.println(result.getDaysValid());
      System.out.println(result.getExternalId());
      System.out.println(result.getIsPhoneVerificationRequiredToView());
      System.out.println(result.getTemplateId());
      System.out.println(result.getType());
      System.out.println(result.getSourceFiles());
      System.out.println(result.getSigners());
      System.out.println(result.getSignatureColor());
      System.out.println(result.getId());
      System.out.println(result.getPrepareUrl());
      System.out.println(result.getSigningLog());
      System.out.println(result.getStatus());
      System.out.println(result.getSignFiles());
      System.out.println(result.getAutoExpireAt());
      System.out.println(result.getParentFolder());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignRequestsApi#createRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SignRequest> response = client
              .signRequests
              .createRequest(signers)
              .isDocumentPreparationNeeded(isDocumentPreparationNeeded)
              .redirectUrl(redirectUrl)
              .declinedRedirectUrl(declinedRedirectUrl)
              .areTextSignaturesEnabled(areTextSignaturesEnabled)
              .emailSubject(emailSubject)
              .emailMessage(emailMessage)
              .areRemindersEnabled(areRemindersEnabled)
              .name(name)
              .prefillTags(prefillTags)
              .daysValid(daysValid)
              .externalId(externalId)
              .isPhoneVerificationRequiredToView(isPhoneVerificationRequiredToView)
              .templateId(templateId)
              .sourceFiles(sourceFiles)
              .signatureColor(signatureColor)
              .parentFolder(parentFolder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignRequestsApi#createRequest");
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
| **signRequestCreateRequest** | [**SignRequestCreateRequest**](SignRequestCreateRequest.md)|  | [optional] |

### Return type

[**SignRequest**](SignRequest.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a Sign Request object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getById"></a>
# **getById**
> SignRequest getById(signRequestId).execute();

Get sign request by ID

Gets a sign request by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignRequestsApi;
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
    String signRequestId = "33243242"; // The ID of the sign request
    try {
      SignRequest result = client
              .signRequests
              .getById(signRequestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getIsDocumentPreparationNeeded());
      System.out.println(result.getRedirectUrl());
      System.out.println(result.getDeclinedRedirectUrl());
      System.out.println(result.getAreTextSignaturesEnabled());
      System.out.println(result.getEmailSubject());
      System.out.println(result.getEmailMessage());
      System.out.println(result.getAreRemindersEnabled());
      System.out.println(result.getName());
      System.out.println(result.getPrefillTags());
      System.out.println(result.getDaysValid());
      System.out.println(result.getExternalId());
      System.out.println(result.getIsPhoneVerificationRequiredToView());
      System.out.println(result.getTemplateId());
      System.out.println(result.getType());
      System.out.println(result.getSourceFiles());
      System.out.println(result.getSigners());
      System.out.println(result.getSignatureColor());
      System.out.println(result.getId());
      System.out.println(result.getPrepareUrl());
      System.out.println(result.getSigningLog());
      System.out.println(result.getStatus());
      System.out.println(result.getSignFiles());
      System.out.println(result.getAutoExpireAt());
      System.out.println(result.getParentFolder());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignRequestsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SignRequest> response = client
              .signRequests
              .getById(signRequestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignRequestsApi#getById");
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
| **signRequestId** | **String**| The ID of the sign request | |

### Return type

[**SignRequest**](SignRequest.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a sign request |  -  |
| **0** | An unexpected client error. |  -  |

<a name="list"></a>
# **list**
> SignRequests list().marker(marker).limit(limit).execute();

List sign requests

Gets sign requests created by a user. If the &#x60;sign_files&#x60; and/or &#x60;parent_folder&#x60; are deleted, the sign request will not return in the list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignRequestsApi;
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
      SignRequests result = client
              .signRequests
              .list()
              .marker(marker)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignRequestsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SignRequests> response = client
              .signRequests
              .list()
              .marker(marker)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignRequestsApi#list");
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

[**SignRequests**](SignRequests.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of sign requests |  -  |
| **0** | An unexpected client error. |  -  |

<a name="resendSignRequestEmails"></a>
# **resendSignRequestEmails**
> resendSignRequestEmails(signRequestId).execute();

Resend sign request

Resends a sign request email to all outstanding signers.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignRequestsApi;
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
    String signRequestId = "33243242"; // The ID of the sign request
    try {
      client
              .signRequests
              .resendSignRequestEmails(signRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SignRequestsApi#resendSignRequestEmails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .signRequests
              .resendSignRequestEmails(signRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SignRequestsApi#resendSignRequestEmails");
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
| **signRequestId** | **String**| The ID of the sign request | |

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
| **202** | Returns an empty response when the API call was successful. The email notifications will be sent asynchronously. |  -  |
| **0** | An unexpected client error. |  -  |

