# ZipDownloadsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRequest**](ZipDownloadsApi.md#createRequest) | **POST** /zip_downloads | Create zip download |
| [**getContentById**](ZipDownloadsApi.md#getContentById) | **GET** /zip_downloads/{zip_download_id}/content | Download zip archive |
| [**getStatus**](ZipDownloadsApi.md#getStatus) | **GET** /zip_downloads/{zip_download_id}/status | Get zip download status |


<a name="createRequest"></a>
# **createRequest**
> ZipDownload createRequest().zipDownloadRequest(zipDownloadRequest).execute();

Create zip download

Creates a request to download multiple files and folders as a single &#x60;zip&#x60; archive file. This API does not return the archive but instead performs all the checks to ensure that the user has access to all the items, and then returns a &#x60;download_url&#x60; and a &#x60;status_url&#x60; that can be used to download the archive.  The limit for an archive is either the Account&#39;s upload limit or 10,000 files, whichever is met first.  **Note**: Downloading a large file can be affected by various factors such as distance, network latency, bandwidth, and congestion, as well as packet loss ratio and current server load. For these reasons we recommend that a maximum ZIP archive total size does not exceed 25GB.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ZipDownloadsApi;
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
    List<ZipDownloadRequestItemsInner> items = Arrays.asList(); // A list of items to add to the `zip` archive. These can be folders or files.
    String downloadFileName = "downloadFileName_example"; // The optional name of the `zip` archive. This name will be appended by the `.zip` file extension, for example `January Financials.zip`.
    try {
      ZipDownload result = client
              .zipDownloads
              .createRequest(items)
              .downloadFileName(downloadFileName)
              .execute();
      System.out.println(result);
      System.out.println(result.getDownloadUrl());
      System.out.println(result.getStatusUrl());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getNameConflicts());
    } catch (ApiException e) {
      System.err.println("Exception when calling ZipDownloadsApi#createRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ZipDownload> response = client
              .zipDownloads
              .createRequest(items)
              .downloadFileName(downloadFileName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ZipDownloadsApi#createRequest");
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
| **zipDownloadRequest** | [**ZipDownloadRequest**](ZipDownloadRequest.md)|  | [optional] |

### Return type

[**ZipDownload**](ZipDownload.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | If the &#x60;zip&#x60; archive is ready to be downloaded, the API will return a response that will include a &#x60;download_url&#x60;, a &#x60;status_url&#x60;, as well as any conflicts that might have occurred when creating the request. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getContentById"></a>
# **getContentById**
> File getContentById(zipDownloadId).execute();

Download zip archive

Returns the contents of a &#x60;zip&#x60; archive in binary format. This URL does not require any form of authentication and could be used in a user&#39;s browser to download the archive to a user&#39;s device.  By default, this URL is only valid for a few seconds from the creation of the request for this archive. Once a download has started it can not be stopped and resumed, instead a new request for a zip archive would need to be created.  The URL of this endpoint should not be considered as fixed. Instead, use the [Create zip download](e://post_zip_downloads) API to request to create a &#x60;zip&#x60; archive, and then follow the &#x60;download_url&#x60; field in the response to this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ZipDownloadsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.box.com/2.0";
    Box client = new Box(configuration);
    String zipDownloadId = "Lu6fA9Ob-jyysp3AAvMF4AkLEwZwAYbL=tgj2zIC=eK9RvJnJbjJl9rNh2qBgHDpyOCAOhpM=vajg2mKq8Mdd"; // The unique identifier that represent this `zip` archive.
    try {
      File result = client
              .zipDownloads
              .getContentById(zipDownloadId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ZipDownloadsApi#getContentById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .zipDownloads
              .getContentById(zipDownloadId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ZipDownloadsApi#getContentById");
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
| **zipDownloadId** | **String**| The unique identifier that represent this &#x60;zip&#x60; archive. | |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the content of the items requested for this download, formatted as a stream of files and folders in a &#x60;zip&#x60; archive. |  * Content-Disposition - The name of the archive to be downloaded <br>  |
| **0** | An unexpected client error. |  -  |

<a name="getStatus"></a>
# **getStatus**
> ZipDownloadStatus getStatus(zipDownloadId).execute();

Get zip download status

Returns the download status of a &#x60;zip&#x60; archive, allowing an application to inspect the progress of the download as well as the number of items that might have been skipped.  This endpoint can only be accessed once the download has started. Subsequently this endpoint is valid for 12 hours from the start of the download.  The URL of this endpoint should not be considered as fixed. Instead, use the [Create zip download](e://post_zip_downloads) API to request to create a &#x60;zip&#x60; archive, and then follow the &#x60;status_url&#x60; field in the response to this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ZipDownloadsApi;
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
    String zipDownloadId = "Lu6fA9Ob-jyysp3AAvMF4AkLEwZwAYbL=tgj2zIC=eK9RvJnJbjJl9rNh2qBgHDpyOCAOhpM=vajg2mKq8Mdd"; // The unique identifier that represent this `zip` archive.
    try {
      ZipDownloadStatus result = client
              .zipDownloads
              .getStatus(zipDownloadId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalFileCount());
      System.out.println(result.getDownloadedFileCount());
      System.out.println(result.getSkippedFileCount());
      System.out.println(result.getSkippedFolderCount());
      System.out.println(result.getState());
    } catch (ApiException e) {
      System.err.println("Exception when calling ZipDownloadsApi#getStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ZipDownloadStatus> response = client
              .zipDownloads
              .getStatus(zipDownloadId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ZipDownloadsApi#getStatus");
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
| **zipDownloadId** | **String**| The unique identifier that represent this &#x60;zip&#x60; archive. | |

### Return type

[**ZipDownloadStatus**](ZipDownloadStatus.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the status of the &#x60;zip&#x60; archive that is being downloaded. |  -  |
| **0** | An unexpected client error. |  -  |

