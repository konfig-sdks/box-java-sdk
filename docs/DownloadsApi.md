# DownloadsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fileContentGet**](DownloadsApi.md#fileContentGet) | **GET** /files/{file_id}/content | Download file |


<a name="fileContentGet"></a>
# **fileContentGet**
> File fileContentGet(fileId).range(range).boxapi(boxapi).version(version).accessToken(accessToken).execute();

Download file

Returns the contents of a file in binary format.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DownloadsApi;
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
    String range = "bytes=0-1024"; // The byte range of the content to download.  The format `bytes={start_byte}-{end_byte}` can be used to specify what section of the file to download.
    String boxapi = "shared_link=[link]&shared_link_password=[password]"; // The URL, and optional password, for the shared link of this item.  This header can be used to access items that have not been explicitly shared with a user.  Use the format `shared_link=[link]` or if a password is required then use `shared_link=[link]&shared_link_password=[password]`.  This header can be used on the file or folder shared, as well as on any files or folders nested within the item.
    String version = "4"; // The file version to download
    String accessToken = "c3FIOG9vSGV4VHo4QzAyg5T1JvNnJoZ3ExaVNyQWw6WjRsanRKZG5lQk9qUE1BVQ"; // An optional access token that can be used to pre-authenticate this request, which means that a download link can be shared with a browser or a third party service without them needing to know how to handle the authentication. When using this parameter, please make sure that the access token is sufficiently scoped down to only allow read access to that file and no other files or folders.
    try {
      File result = client
              .downloads
              .fileContentGet(fileId)
              .range(range)
              .boxapi(boxapi)
              .version(version)
              .accessToken(accessToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DownloadsApi#fileContentGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .downloads
              .fileContentGet(fileId)
              .range(range)
              .boxapi(boxapi)
              .version(version)
              .accessToken(accessToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DownloadsApi#fileContentGet");
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
| **range** | **String**| The byte range of the content to download.  The format &#x60;bytes&#x3D;{start_byte}-{end_byte}&#x60; can be used to specify what section of the file to download. | [optional] |
| **boxapi** | **String**| The URL, and optional password, for the shared link of this item.  This header can be used to access items that have not been explicitly shared with a user.  Use the format &#x60;shared_link&#x3D;[link]&#x60; or if a password is required then use &#x60;shared_link&#x3D;[link]&amp;shared_link_password&#x3D;[password]&#x60;.  This header can be used on the file or folder shared, as well as on any files or folders nested within the item. | [optional] |
| **version** | **String**| The file version to download | [optional] |
| **accessToken** | **String**| An optional access token that can be used to pre-authenticate this request, which means that a download link can be shared with a browser or a third party service without them needing to know how to handle the authentication. When using this parameter, please make sure that the access token is sufficiently scoped down to only allow read access to that file and no other files or folders. | [optional] |

### Return type

[**File**](File.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested file if the client has the **follow redirects** setting enabled to automatically follow HTTP &#x60;3xx&#x60; responses as redirects. If not, the request will return &#x60;302&#x60; instead. For details, see the [download file guide](g://downloads/file#download-url). |  -  |
| **202** | If the file is not ready to be downloaded yet &#x60;Retry-After&#x60; header will be returned indicating the time in seconds after which the file will be available for the client to download.  This response can occur when the file was uploaded immediately before the download request. |  * Retry-After - Indicates the number of seconds the client should wait before attempting their commit request again. <br>  |
| **302** | If the file is available for download the response will include a &#x60;Location&#x60; header for the file on &#x60;dl.boxcloud.com&#x60;.  The &#x60;dl.boxcloud.com&#x60; URL is not persistent and clients will need to follow the redirect to actually download the file. |  * Location - A pointer to a placeholder graphic that can be used for this file type. <br>  |
| **0** | An unexpected client error. |  -  |

