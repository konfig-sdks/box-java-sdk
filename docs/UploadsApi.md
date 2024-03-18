# UploadsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fileContentUpdate**](UploadsApi.md#fileContentUpdate) | **POST** /files/{file_id}/content | Upload file version |
| [**smallFile**](UploadsApi.md#smallFile) | **POST** /files/content | Upload file |


<a name="fileContentUpdate"></a>
# **fileContentUpdate**
> Files fileContentUpdate(fileId, attributes, _file).ifMatch(ifMatch).fields(fields).contentMd5(contentMd5).uploadsFileContentUpdateRequest(uploadsFileContentUpdateRequest).execute();

Upload file version

Update a file&#39;s content. For file sizes over 50MB we recommend using the Chunk Upload APIs.  # Request body order  The &#x60;attributes&#x60; part of the body must come **before** the &#x60;file&#x60; part. Requests that do not follow this format when uploading the file will receive a HTTP &#x60;400&#x60; error with a &#x60;metadata_after_file_contents&#x60; error code.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
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
    UploadsFileContentUpdateRequestAttributes attributes = new UploadsFileContentUpdateRequestAttributes();
    File _file = new File("/path/to/file"); // The content of the file to upload to Box.  <Message warning>    The `attributes` part of the body must come **before** the   `file` part. Requests that do not follow this format when   uploading the file will receive a HTTP `400` error with a   `metadata_after_file_contents` error code.  </Message>
    String ifMatch = "1"; // Ensures this item hasn't recently changed before making changes.  Pass in the item's last observed `etag` value into this header and the endpoint will fail with a `412 Precondition Failed` if it has changed since.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    String contentMd5 = "134b65991ed521fcfe4724b7d814ab8ded5185dc"; // An optional header containing the SHA1 hash of the file to ensure that the file was not corrupted in transit.
    try {
      Files result = client
              .uploads
              .fileContentUpdate(fileId, attributes, _file)
              .ifMatch(ifMatch)
              .fields(fields)
              .contentMd5(contentMd5)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCount());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#fileContentUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Files> response = client
              .uploads
              .fileContentUpdate(fileId, attributes, _file)
              .ifMatch(ifMatch)
              .fields(fields)
              .contentMd5(contentMd5)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#fileContentUpdate");
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
| **attributes** | [**UploadsFileContentUpdateRequestAttributes**](UploadsFileContentUpdateRequestAttributes.md)|  | |
| **_file** | **File**| The content of the file to upload to Box.  &lt;Message warning&gt;    The &#x60;attributes&#x60; part of the body must come **before** the   &#x60;file&#x60; part. Requests that do not follow this format when   uploading the file will receive a HTTP &#x60;400&#x60; error with a   &#x60;metadata_after_file_contents&#x60; error code.  &lt;/Message&gt; | |
| **ifMatch** | **String**| Ensures this item hasn&#39;t recently changed before making changes.  Pass in the item&#39;s last observed &#x60;etag&#x60; value into this header and the endpoint will fail with a &#x60;412 Precondition Failed&#x60; if it has changed since. | [optional] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **contentMd5** | **String**| An optional header containing the SHA1 hash of the file to ensure that the file was not corrupted in transit. | [optional] |
| **uploadsFileContentUpdateRequest** | [**UploadsFileContentUpdateRequest**](UploadsFileContentUpdateRequest.md)|  | [optional] |

### Return type

[**Files**](Files.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the new file object in a list. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="smallFile"></a>
# **smallFile**
> Files smallFile(attributes, _file).fields(fields).contentMd5(contentMd5).uploadsSmallFileRequest(uploadsSmallFileRequest).execute();

Upload file

Uploads a small file to Box. For file sizes over 50MB we recommend using the Chunk Upload APIs.  # Request body order  The &#x60;attributes&#x60; part of the body must come **before** the &#x60;file&#x60; part. Requests that do not follow this format when uploading the file will receive a HTTP &#x60;400&#x60; error with a &#x60;metadata_after_file_contents&#x60; error code.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
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
    UploadsSmallFileRequestAttributes attributes = new UploadsSmallFileRequestAttributes();
    File _file = new File("/path/to/file"); // The content of the file to upload to Box.  <Message warning>    The `attributes` part of the body must come **before** the   `file` part. Requests that do not follow this format when   uploading the file will receive a HTTP `400` error with a   `metadata_after_file_contents` error code.  </Message>
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    String contentMd5 = "134b65991ed521fcfe4724b7d814ab8ded5185dc"; // An optional header containing the SHA1 hash of the file to ensure that the file was not corrupted in transit.
    try {
      Files result = client
              .uploads
              .smallFile(attributes, _file)
              .fields(fields)
              .contentMd5(contentMd5)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCount());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#smallFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Files> response = client
              .uploads
              .smallFile(attributes, _file)
              .fields(fields)
              .contentMd5(contentMd5)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#smallFile");
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
| **attributes** | [**UploadsSmallFileRequestAttributes**](UploadsSmallFileRequestAttributes.md)|  | |
| **_file** | **File**| The content of the file to upload to Box.  &lt;Message warning&gt;    The &#x60;attributes&#x60; part of the body must come **before** the   &#x60;file&#x60; part. Requests that do not follow this format when   uploading the file will receive a HTTP &#x60;400&#x60; error with a   &#x60;metadata_after_file_contents&#x60; error code.  &lt;/Message&gt; | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **contentMd5** | **String**| An optional header containing the SHA1 hash of the file to ensure that the file was not corrupted in transit. | [optional] |
| **uploadsSmallFileRequest** | [**UploadsSmallFileRequest**](UploadsSmallFileRequest.md)|  | [optional] |

### Return type

[**Files**](Files.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns the new file object in a list. |  -  |
| **0** | An unexpected client error. |  -  |

