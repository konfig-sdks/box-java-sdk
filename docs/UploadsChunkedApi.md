# UploadsChunkedApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**commitSession**](UploadsChunkedApi.md#commitSession) | **POST** /files/upload_sessions/{upload_session_id}/commit | Commit upload session |
| [**createSessionForUpload**](UploadsChunkedApi.md#createSessionForUpload) | **POST** /files/upload_sessions | Create upload session |
| [**createSessionForUpload_0**](UploadsChunkedApi.md#createSessionForUpload_0) | **POST** /files/{file_id}/upload_sessions | Create upload session for existing file |
| [**filePartUpdate**](UploadsChunkedApi.md#filePartUpdate) | **PUT** /files/upload_sessions/{upload_session_id} | Upload part of file |
| [**info**](UploadsChunkedApi.md#info) | **GET** /files/upload_sessions/{upload_session_id} | Get upload session |
| [**listParts**](UploadsChunkedApi.md#listParts) | **GET** /files/upload_sessions/{upload_session_id}/parts | List parts |
| [**removeUploadSession**](UploadsChunkedApi.md#removeUploadSession) | **DELETE** /files/upload_sessions/{upload_session_id} | Remove upload session |


<a name="commitSession"></a>
# **commitSession**
> Files commitSession(uploadSessionId, digest).ifMatch(ifMatch).ifNoneMatch(ifNoneMatch).uploadsChunkedCommitSessionRequest(uploadsChunkedCommitSessionRequest).execute();

Commit upload session

Close an upload session and create a file from the uploaded chunks.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsChunkedApi;
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
    List<UploadPart> parts = Arrays.asList(); // The list details for the uploaded parts
    String uploadSessionId = "D5E3F7A"; // The ID of the upload session.
    String digest = "sha=fpRyg5eVQletdZqEKaFlqwBXJzM="; // The [RFC3230][1] message digest of the whole file.  Only SHA1 is supported. The SHA1 digest must be Base64 encoded. The format of this header is as `sha=BASE64_ENCODED_DIGEST`.  [1]: https://tools.ietf.org/html/rfc3230
    String ifMatch = "1"; // Ensures this item hasn't recently changed before making changes.  Pass in the item's last observed `etag` value into this header and the endpoint will fail with a `412 Precondition Failed` if it has changed since.
    String ifNoneMatch = "1"; // Ensures an item is only returned if it has changed.  Pass in the item's last observed `etag` value into this header and the endpoint will fail with a `304 Not Modified` if the item has not changed since.
    try {
      Files result = client
              .uploadsChunked
              .commitSession(parts, uploadSessionId, digest)
              .ifMatch(ifMatch)
              .ifNoneMatch(ifNoneMatch)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCount());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsChunkedApi#commitSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Files> response = client
              .uploadsChunked
              .commitSession(parts, uploadSessionId, digest)
              .ifMatch(ifMatch)
              .ifNoneMatch(ifNoneMatch)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsChunkedApi#commitSession");
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
| **uploadSessionId** | **String**| The ID of the upload session. | |
| **digest** | **String**| The [RFC3230][1] message digest of the whole file.  Only SHA1 is supported. The SHA1 digest must be Base64 encoded. The format of this header is as &#x60;sha&#x3D;BASE64_ENCODED_DIGEST&#x60;.  [1]: https://tools.ietf.org/html/rfc3230 | |
| **ifMatch** | **String**| Ensures this item hasn&#39;t recently changed before making changes.  Pass in the item&#39;s last observed &#x60;etag&#x60; value into this header and the endpoint will fail with a &#x60;412 Precondition Failed&#x60; if it has changed since. | [optional] |
| **ifNoneMatch** | **String**| Ensures an item is only returned if it has changed.  Pass in the item&#39;s last observed &#x60;etag&#x60; value into this header and the endpoint will fail with a &#x60;304 Not Modified&#x60; if the item has not changed since. | [optional] |
| **uploadsChunkedCommitSessionRequest** | [**UploadsChunkedCommitSessionRequest**](UploadsChunkedCommitSessionRequest.md)|  | [optional] |

### Return type

[**Files**](Files.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns the file object in a list. |  -  |
| **202** | Returns when all chunks have been uploaded but not yet processed.  Inspect the upload session to get more information about the progress of processing the chunks, then retry committing the file when all chunks have processed. |  * Retry-After - Indicates the number of seconds the client should wait before attempting their commit request again. <br>  |
| **0** | An unexpected client error. |  -  |

<a name="createSessionForUpload"></a>
# **createSessionForUpload**
> UploadSession createSessionForUpload().uploadsChunkedCreateSessionForUploadRequest(uploadsChunkedCreateSessionForUploadRequest).execute();

Create upload session

Creates an upload session for a new file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsChunkedApi;
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
    String folderId = "folderId_example"; // The ID of the folder to upload the new file to.
    Long fileSize = 56L; // The total number of bytes of the file to be uploaded
    String fileName = "fileName_example"; // The name of new file
    try {
      UploadSession result = client
              .uploadsChunked
              .createSessionForUpload(folderId, fileSize, fileName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getSessionExpiresAt());
      System.out.println(result.getPartSize());
      System.out.println(result.getTotalParts());
      System.out.println(result.getNumPartsProcessed());
      System.out.println(result.getSessionEndpoints());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsChunkedApi#createSessionForUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadSession> response = client
              .uploadsChunked
              .createSessionForUpload(folderId, fileSize, fileName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsChunkedApi#createSessionForUpload");
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
| **uploadsChunkedCreateSessionForUploadRequest** | [**UploadsChunkedCreateSessionForUploadRequest**](UploadsChunkedCreateSessionForUploadRequest.md)|  | [optional] |

### Return type

[**UploadSession**](UploadSession.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a new upload session. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="createSessionForUpload_0"></a>
# **createSessionForUpload_0**
> UploadSession createSessionForUpload_0(fileId).uploadsChunkedCreateSessionForUploadRequest1(uploadsChunkedCreateSessionForUploadRequest1).execute();

Create upload session for existing file

Creates an upload session for an existing file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsChunkedApi;
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
    Long fileSize = 56L; // The total number of bytes of the file to be uploaded
    String fileId = "12345"; // The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/files/123` the `file_id` is `123`.
    String fileName = "fileName_example"; // The optional new name of new file
    try {
      UploadSession result = client
              .uploadsChunked
              .createSessionForUpload_0(fileSize, fileId)
              .fileName(fileName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getSessionExpiresAt());
      System.out.println(result.getPartSize());
      System.out.println(result.getTotalParts());
      System.out.println(result.getNumPartsProcessed());
      System.out.println(result.getSessionEndpoints());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsChunkedApi#createSessionForUpload_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadSession> response = client
              .uploadsChunked
              .createSessionForUpload_0(fileSize, fileId)
              .fileName(fileName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsChunkedApi#createSessionForUpload_0");
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
| **uploadsChunkedCreateSessionForUploadRequest1** | [**UploadsChunkedCreateSessionForUploadRequest1**](UploadsChunkedCreateSessionForUploadRequest1.md)|  | [optional] |

### Return type

[**UploadSession**](UploadSession.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a new upload session. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="filePartUpdate"></a>
# **filePartUpdate**
> UploadedPart filePartUpdate(uploadSessionId, digest, contentRange).body(body).execute();

Upload part of file

Updates a chunk of an upload session for a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsChunkedApi;
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
    String uploadSessionId = "D5E3F7A"; // The ID of the upload session.
    String digest = "sha=fpRyg5eVQletdZqEKaFlqwBXJzM="; // The [RFC3230][1] message digest of the chunk uploaded.  Only SHA1 is supported. The SHA1 digest must be base64 encoded. The format of this header is as `sha=BASE64_ENCODED_DIGEST`.  To get the value for the `SHA` digest, use the openSSL command to encode the file part: `openssl sha1 -binary <FILE_PART_NAME> | base64`  [1]: https://tools.ietf.org/html/rfc3230
    String contentRange = "bytes 8388608-16777215/445856194"; // The byte range of the chunk.  Must not overlap with the range of a part already uploaded this session. Each part’s size must be exactly equal in size to the part size specified in the upload session that you created. One exception is the last part of the file, as this can be smaller.  When providing the value for `content-range`, remember that:  * The lower bound of each part's byte range   must be a multiple of the part size. * The higher bound must be a multiple of the part size - 1.
    try {
      UploadedPart result = client
              .uploadsChunked
              .filePartUpdate(uploadSessionId, digest, contentRange)
              .execute();
      System.out.println(result);
      System.out.println(result.getPart());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsChunkedApi#filePartUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadedPart> response = client
              .uploadsChunked
              .filePartUpdate(uploadSessionId, digest, contentRange)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsChunkedApi#filePartUpdate");
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
| **uploadSessionId** | **String**| The ID of the upload session. | |
| **digest** | **String**| The [RFC3230][1] message digest of the chunk uploaded.  Only SHA1 is supported. The SHA1 digest must be base64 encoded. The format of this header is as &#x60;sha&#x3D;BASE64_ENCODED_DIGEST&#x60;.  To get the value for the &#x60;SHA&#x60; digest, use the openSSL command to encode the file part: &#x60;openssl sha1 -binary &lt;FILE_PART_NAME&gt; | base64&#x60;  [1]: https://tools.ietf.org/html/rfc3230 | |
| **contentRange** | **String**| The byte range of the chunk.  Must not overlap with the range of a part already uploaded this session. Each part’s size must be exactly equal in size to the part size specified in the upload session that you created. One exception is the last part of the file, as this can be smaller.  When providing the value for &#x60;content-range&#x60;, remember that:  * The lower bound of each part&#39;s byte range   must be a multiple of the part size. * The higher bound must be a multiple of the part size - 1. | |
| **body** | **File**|  | [optional] |

### Return type

[**UploadedPart**](UploadedPart.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Chunk has been uploaded successfully. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="info"></a>
# **info**
> UploadSession info(uploadSessionId).execute();

Get upload session

Return information about an upload session.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsChunkedApi;
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
    String uploadSessionId = "D5E3F7A"; // The ID of the upload session.
    try {
      UploadSession result = client
              .uploadsChunked
              .info(uploadSessionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getSessionExpiresAt());
      System.out.println(result.getPartSize());
      System.out.println(result.getTotalParts());
      System.out.println(result.getNumPartsProcessed());
      System.out.println(result.getSessionEndpoints());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsChunkedApi#info");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadSession> response = client
              .uploadsChunked
              .info(uploadSessionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsChunkedApi#info");
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
| **uploadSessionId** | **String**| The ID of the upload session. | |

### Return type

[**UploadSession**](UploadSession.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an upload session object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listParts"></a>
# **listParts**
> UploadParts listParts(uploadSessionId).offset(offset).limit(limit).execute();

List parts

Return a list of the chunks uploaded to the upload session so far.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsChunkedApi;
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
    String uploadSessionId = "D5E3F7A"; // The ID of the upload session.
    Long offset = 0L; // The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response.
    Long limit = 1000L; // The maximum number of items to return per page.
    try {
      UploadParts result = client
              .uploadsChunked
              .listParts(uploadSessionId)
              .offset(offset)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCount());
      System.out.println(result.getLimit());
      System.out.println(result.getOffset());
      System.out.println(result.getOrder());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsChunkedApi#listParts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadParts> response = client
              .uploadsChunked
              .listParts(uploadSessionId)
              .offset(offset)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsChunkedApi#listParts");
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
| **uploadSessionId** | **String**| The ID of the upload session. | |
| **offset** | **Long**| The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response. | [optional] [default to 0] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |

### Return type

[**UploadParts**](UploadParts.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of parts that have been uploaded. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeUploadSession"></a>
# **removeUploadSession**
> removeUploadSession(uploadSessionId).execute();

Remove upload session

Abort an upload session and discard all data uploaded.  This cannot be reversed.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsChunkedApi;
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
    String uploadSessionId = "D5E3F7A"; // The ID of the upload session.
    try {
      client
              .uploadsChunked
              .removeUploadSession(uploadSessionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsChunkedApi#removeUploadSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .uploadsChunked
              .removeUploadSession(uploadSessionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsChunkedApi#removeUploadSession");
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
| **uploadSessionId** | **String**| The ID of the upload session. | |

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
| **204** | A blank response is returned if the session was successfully aborted. |  -  |
| **0** | An unexpected client error. |  -  |

