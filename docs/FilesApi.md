# FilesApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCopy**](FilesApi.md#createCopy) | **POST** /files/{file_id}/copy | Copy file |
| [**deleteFile**](FilesApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete file |
| [**getDetails**](FilesApi.md#getDetails) | **GET** /files/{file_id} | Get file information |
| [**getThumbnail**](FilesApi.md#getThumbnail) | **GET** /files/{file_id}/thumbnail.{extension} | Get file thumbnail |
| [**preflightCheckBeforeUpload**](FilesApi.md#preflightCheckBeforeUpload) | **OPTIONS** /files/content | Preflight check before upload |
| [**updateFile**](FilesApi.md#updateFile) | **PUT** /files/{file_id} | Update file |


<a name="createCopy"></a>
# **createCopy**
> FileFull createCopy(fileId).fields(fields).filesCreateCopyRequest(filesCreateCopyRequest).execute();

Copy file

Creates a copy of a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    FilesCreateCopyRequestParent parent = new FilesCreateCopyRequestParent();
    String fileId = "12345"; // The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/files/123` the `file_id` is `123`.
    String version = "version_example"; // An optional ID of the specific file version to copy.
    String name = "name_example"; // An optional new name for the copied file.  There are some restrictions to the file name. Names containing non-printable ASCII characters, forward and backward slashes (`/`, `\\\\`), and protected names like `.` and `..` are automatically sanitized by removing the non-allowed characters.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      FileFull result = client
              .files
              .createCopy(parent, fileId)
              .version(version)
              .name(name)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEtag());
      System.out.println(result.getType());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getSha1());
      System.out.println(result.getFileVersion());
      System.out.println(result.getDescription());
      System.out.println(result.getSize());
      System.out.println(result.getPathCollection());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getContentCreatedAt());
      System.out.println(result.getContentModifiedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getSharedLink());
      System.out.println(result.getParent());
      System.out.println(result.getItemStatus());
      System.out.println(result.getTags());
      System.out.println(result.getVersionNumber());
      System.out.println(result.getCommentCount());
      System.out.println(result.getPermissions());
      System.out.println(result.getLock());
      System.out.println(result.getExtension());
      System.out.println(result.getIsPackage());
      System.out.println(result.getExpiringEmbedLink());
      System.out.println(result.getWatermarkInfo());
      System.out.println(result.getIsAccessibleViaSharedLink());
      System.out.println(result.getAllowedInviteeRoles());
      System.out.println(result.getIsExternallyOwned());
      System.out.println(result.getHasCollaborations());
      System.out.println(result.getMetadata());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getRepresentations());
      System.out.println(result.getClassification());
      System.out.println(result.getUploaderDisplayName());
      System.out.println(result.getDispositionAt());
      System.out.println(result.getSharedLinkPermissionOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#createCopy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileFull> response = client
              .files
              .createCopy(parent, fileId)
              .version(version)
              .name(name)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#createCopy");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **filesCreateCopyRequest** | [**FilesCreateCopyRequest**](FilesCreateCopyRequest.md)|  | [optional] |

### Return type

[**FileFull**](FileFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a new file object representing the copied file.  Not all available fields are returned by default. Use the [fields](https://raw.githubusercontent.com) query parameter to explicitly request any specific fields. |  -  |
| **304** | Returns an empty response when the &#x60;If-None-Match&#x60; header matches the current &#x60;etag&#x60; value of the file. This indicates that the file has not changed since it was last requested. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="deleteFile"></a>
# **deleteFile**
> deleteFile(fileId).ifMatch(ifMatch).execute();

Delete file

Deletes a file, either permanently or by moving it to the trash.  The the enterprise settings determine whether the item will be permanently deleted from Box or moved to the trash.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String ifMatch = "1"; // Ensures this item hasn't recently changed before making changes.  Pass in the item's last observed `etag` value into this header and the endpoint will fail with a `412 Precondition Failed` if it has changed since.
    try {
      client
              .files
              .deleteFile(fileId)
              .ifMatch(ifMatch)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#deleteFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .files
              .deleteFile(fileId)
              .ifMatch(ifMatch)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#deleteFile");
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
| **ifMatch** | **String**| Ensures this item hasn&#39;t recently changed before making changes.  Pass in the item&#39;s last observed &#x60;etag&#x60; value into this header and the endpoint will fail with a &#x60;412 Precondition Failed&#x60; if it has changed since. | [optional] |

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
| **204** | Returns an empty response when the file has been successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getDetails"></a>
# **getDetails**
> FileFull getDetails(fileId).fields(fields).ifNoneMatch(ifNoneMatch).boxapi(boxapi).xRepHints(xRepHints).execute();

Get file information

Retrieves the details about a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.  Additionally this field can be used to query any metadata applied to the file by specifying the `metadata` field as well as the scope and key of the template to retrieve, for example `?field=metadata.enterprise_12345.contractTemplate`.
    String ifNoneMatch = "1"; // Ensures an item is only returned if it has changed.  Pass in the item's last observed `etag` value into this header and the endpoint will fail with a `304 Not Modified` if the item has not changed since.
    String boxapi = "shared_link=[link]&shared_link_password=[password]"; // The URL, and optional password, for the shared link of this item.  This header can be used to access items that have not been explicitly shared with a user.  Use the format `shared_link=[link]` or if a password is required then use `shared_link=[link]&shared_link_password=[password]`.  This header can be used on the file or folder shared, as well as on any files or folders nested within the item.
    String xRepHints = "[pdf]"; // A header required to request specific `representations` of a file. Use this in combination with the `fields` query parameter to request a specific file representation.  The general format for these representations is `X-Rep-Hints: [...]` where `[...]` is one or many hints in the format `[fileType?query]`.  For example, to request a `png` representation in `32x32` as well as `64x64` pixel dimensions provide the following hints.  `x-rep-hints: [jpg?dimensions=32x32][jpg?dimensions=64x64]`  Additionally, a `text` representation is available for all document file types in Box using the `[extracted_text]` representation.  `x-rep-hints: [extracted_text]`
    try {
      FileFull result = client
              .files
              .getDetails(fileId)
              .fields(fields)
              .ifNoneMatch(ifNoneMatch)
              .boxapi(boxapi)
              .xRepHints(xRepHints)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEtag());
      System.out.println(result.getType());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getSha1());
      System.out.println(result.getFileVersion());
      System.out.println(result.getDescription());
      System.out.println(result.getSize());
      System.out.println(result.getPathCollection());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getContentCreatedAt());
      System.out.println(result.getContentModifiedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getSharedLink());
      System.out.println(result.getParent());
      System.out.println(result.getItemStatus());
      System.out.println(result.getTags());
      System.out.println(result.getVersionNumber());
      System.out.println(result.getCommentCount());
      System.out.println(result.getPermissions());
      System.out.println(result.getLock());
      System.out.println(result.getExtension());
      System.out.println(result.getIsPackage());
      System.out.println(result.getExpiringEmbedLink());
      System.out.println(result.getWatermarkInfo());
      System.out.println(result.getIsAccessibleViaSharedLink());
      System.out.println(result.getAllowedInviteeRoles());
      System.out.println(result.getIsExternallyOwned());
      System.out.println(result.getHasCollaborations());
      System.out.println(result.getMetadata());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getRepresentations());
      System.out.println(result.getClassification());
      System.out.println(result.getUploaderDisplayName());
      System.out.println(result.getDispositionAt());
      System.out.println(result.getSharedLinkPermissionOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileFull> response = client
              .files
              .getDetails(fileId)
              .fields(fields)
              .ifNoneMatch(ifNoneMatch)
              .boxapi(boxapi)
              .xRepHints(xRepHints)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getDetails");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.  Additionally this field can be used to query any metadata applied to the file by specifying the &#x60;metadata&#x60; field as well as the scope and key of the template to retrieve, for example &#x60;?field&#x3D;metadata.enterprise_12345.contractTemplate&#x60;. | [optional] |
| **ifNoneMatch** | **String**| Ensures an item is only returned if it has changed.  Pass in the item&#39;s last observed &#x60;etag&#x60; value into this header and the endpoint will fail with a &#x60;304 Not Modified&#x60; if the item has not changed since. | [optional] |
| **boxapi** | **String**| The URL, and optional password, for the shared link of this item.  This header can be used to access items that have not been explicitly shared with a user.  Use the format &#x60;shared_link&#x3D;[link]&#x60; or if a password is required then use &#x60;shared_link&#x3D;[link]&amp;shared_link_password&#x3D;[password]&#x60;.  This header can be used on the file or folder shared, as well as on any files or folders nested within the item. | [optional] |
| **xRepHints** | **String**| A header required to request specific &#x60;representations&#x60; of a file. Use this in combination with the &#x60;fields&#x60; query parameter to request a specific file representation.  The general format for these representations is &#x60;X-Rep-Hints: [...]&#x60; where &#x60;[...]&#x60; is one or many hints in the format &#x60;[fileType?query]&#x60;.  For example, to request a &#x60;png&#x60; representation in &#x60;32x32&#x60; as well as &#x60;64x64&#x60; pixel dimensions provide the following hints.  &#x60;x-rep-hints: [jpg?dimensions&#x3D;32x32][jpg?dimensions&#x3D;64x64]&#x60;  Additionally, a &#x60;text&#x60; representation is available for all document file types in Box using the &#x60;[extracted_text]&#x60; representation.  &#x60;x-rep-hints: [extracted_text]&#x60; | [optional] |

### Return type

[**FileFull**](FileFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a file object.  Not all available fields are returned by default. Use the [fields](https://raw.githubusercontent.com) query parameter to explicitly request any specific fields. |  -  |
| **304** | Returns an empty response when the &#x60;If-None-Match&#x60; header matches the current &#x60;etag&#x60; value of the folder. This indicates that the folder has not changed since it was last requested. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getThumbnail"></a>
# **getThumbnail**
> File getThumbnail(fileId, extension).minHeight(minHeight).minWidth(minWidth).maxHeight(maxHeight).maxWidth(maxWidth).execute();

Get file thumbnail

Retrieves a thumbnail, or smaller image representation, of a file.  Sizes of &#x60;32x32&#x60;,&#x60;64x64&#x60;, &#x60;128x128&#x60;, and &#x60;256x256&#x60; can be returned in the &#x60;.png&#x60; format and sizes of &#x60;32x32&#x60;, &#x60;160x160&#x60;, and &#x60;320x320&#x60; can be returned in the &#x60;.jpg&#x60; format.  Thumbnails can be generated for the image and video file formats listed [found on our community site][1].  [1]: https://community.box.com/t5/Migrating-and-Previewing-Content/File-Types-and-Fonts-Supported-in-Box-Content-Preview/ta-p/327

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String extension = "png"; // The file format for the thumbnail
    Integer minHeight = 32; // The minimum height of the thumbnail
    Integer minWidth = 32; // The minimum width of the thumbnail
    Integer maxHeight = 320; // The maximum height of the thumbnail
    Integer maxWidth = 320; // The maximum width of the thumbnail
    try {
      File result = client
              .files
              .getThumbnail(fileId, extension)
              .minHeight(minHeight)
              .minWidth(minWidth)
              .maxHeight(maxHeight)
              .maxWidth(maxWidth)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .files
              .getThumbnail(fileId, extension)
              .minHeight(minHeight)
              .minWidth(minWidth)
              .maxHeight(maxHeight)
              .maxWidth(maxWidth)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getThumbnail");
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
| **extension** | **String**| The file format for the thumbnail | [enum: png, jpg] |
| **minHeight** | **Integer**| The minimum height of the thumbnail | [optional] |
| **minWidth** | **Integer**| The minimum width of the thumbnail | [optional] |
| **maxHeight** | **Integer**| The maximum height of the thumbnail | [optional] |
| **maxWidth** | **Integer**| The maximum width of the thumbnail | [optional] |

### Return type

[**File**](File.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png, image/jpg, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When a thumbnail can be created the thumbnail data will be returned in the body of the response. |  -  |
| **202** | Sometimes generating a thumbnail can take a few seconds. In these situations the API returns a &#x60;Location&#x60;-header pointing to a placeholder graphic for this file type.  The placeholder graphic can be used in a user interface until the thumbnail generation has completed. The &#x60;Retry-After&#x60;-header indicates when to the thumbnail will be ready. At that time, retry this endpoint to retrieve the thumbnail. |  * Retry-After - The time in seconds after which the thumbnail will be available.  Your application  only attempt to get the thumbnail again after this time. <br>  * Location - A pointer to a placeholder graphic that can be used for this file type. <br>  |
| **302** | Returns an error when Box is not able to create a thumbnail for this file type.  Instead, a &#x60;Location&#x60;-header pointing to a placeholder graphic for this file type will be returned. |  * Location - A pointer to a placeholder graphic that can be used for this file type. <br>  |
| **0** | An unexpected client error. |  -  |

<a name="preflightCheckBeforeUpload"></a>
# **preflightCheckBeforeUpload**
> UploadUrl preflightCheckBeforeUpload().filesPreflightCheckBeforeUploadRequest(filesPreflightCheckBeforeUploadRequest).execute();

Preflight check before upload

Performs a check to verify that a file will be accepted by Box before you upload the entire file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    String name = "name_example"; // The name for the file
    Integer size = 56; // The size of the file in bytes
    FilesPreflightCheckBeforeUploadRequestParent parent = new FilesPreflightCheckBeforeUploadRequestParent();
    try {
      UploadUrl result = client
              .files
              .preflightCheckBeforeUpload()
              .name(name)
              .size(size)
              .parent(parent)
              .execute();
      System.out.println(result);
      System.out.println(result.getUploadUrl());
      System.out.println(result.getUploadToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#preflightCheckBeforeUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadUrl> response = client
              .files
              .preflightCheckBeforeUpload()
              .name(name)
              .size(size)
              .parent(parent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#preflightCheckBeforeUpload");
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
| **filesPreflightCheckBeforeUploadRequest** | [**FilesPreflightCheckBeforeUploadRequest**](FilesPreflightCheckBeforeUploadRequest.md)|  | [optional] |

### Return type

[**UploadUrl**](UploadUrl.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | If the check passed, the response will include a session URL that can be used to upload the file to. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateFile"></a>
# **updateFile**
> FileFull updateFile(fileId).fields(fields).ifMatch(ifMatch).filesUpdateFileRequest(filesUpdateFileRequest).execute();

Update file

Updates a file. This can be used to rename or move a file, create a shared link, or lock a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FilesApi;
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
    List<String> tags = Arrays.asList(); // The tags for this item. These tags are shown in the Box web app and mobile apps next to an item.  To add or remove a tag, retrieve the item's current tags, modify them, and then update this field.  There is a limit of 100 tags per item, and 10,000 unique tags per enterprise.
    String description = "description_example"; // The description for a file. This can be seen in the right-hand sidebar panel when viewing a file in the Box web app. Additionally, this index is used in the search index of the file, allowing users to find the file by the content in the description.
    String name = "name_example"; // An optional different name for the file. This can be used to rename the file.
    FilesUpdateFileRequestParent parent = new FilesUpdateFileRequestParent();
    FilesUpdateFileRequestSharedLink sharedLink = new FilesUpdateFileRequestSharedLink();
    FilesUpdateFileRequestLock lock = new FilesUpdateFileRequestLock();
    OffsetDateTime dispositionAt = OffsetDateTime.now(); // The retention expiration timestamp for the given file. This date cannot be shortened once set on a file.
    FilesUpdateFileRequestPermissions permissions = new FilesUpdateFileRequestPermissions();
    List<Reference1> collections = Arrays.asList(); // An array of collections to make this file a member of. Currently we only support the `favorites` collection.  To get the ID for a collection, use the [List all collections][1] endpoint.  Passing an empty array `[]` or `null` will remove the file from all collections.  [1]: e://get-collections
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    String ifMatch = "1"; // Ensures this item hasn't recently changed before making changes.  Pass in the item's last observed `etag` value into this header and the endpoint will fail with a `412 Precondition Failed` if it has changed since.
    try {
      FileFull result = client
              .files
              .updateFile(fileId)
              .tags(tags)
              .description(description)
              .name(name)
              .parent(parent)
              .sharedLink(sharedLink)
              .lock(lock)
              .dispositionAt(dispositionAt)
              .permissions(permissions)
              .collections(collections)
              .fields(fields)
              .ifMatch(ifMatch)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEtag());
      System.out.println(result.getType());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getSha1());
      System.out.println(result.getFileVersion());
      System.out.println(result.getDescription());
      System.out.println(result.getSize());
      System.out.println(result.getPathCollection());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getContentCreatedAt());
      System.out.println(result.getContentModifiedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getSharedLink());
      System.out.println(result.getParent());
      System.out.println(result.getItemStatus());
      System.out.println(result.getTags());
      System.out.println(result.getVersionNumber());
      System.out.println(result.getCommentCount());
      System.out.println(result.getPermissions());
      System.out.println(result.getLock());
      System.out.println(result.getExtension());
      System.out.println(result.getIsPackage());
      System.out.println(result.getExpiringEmbedLink());
      System.out.println(result.getWatermarkInfo());
      System.out.println(result.getIsAccessibleViaSharedLink());
      System.out.println(result.getAllowedInviteeRoles());
      System.out.println(result.getIsExternallyOwned());
      System.out.println(result.getHasCollaborations());
      System.out.println(result.getMetadata());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getRepresentations());
      System.out.println(result.getClassification());
      System.out.println(result.getUploaderDisplayName());
      System.out.println(result.getDispositionAt());
      System.out.println(result.getSharedLinkPermissionOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#updateFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileFull> response = client
              .files
              .updateFile(fileId)
              .tags(tags)
              .description(description)
              .name(name)
              .parent(parent)
              .sharedLink(sharedLink)
              .lock(lock)
              .dispositionAt(dispositionAt)
              .permissions(permissions)
              .collections(collections)
              .fields(fields)
              .ifMatch(ifMatch)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#updateFile");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **ifMatch** | **String**| Ensures this item hasn&#39;t recently changed before making changes.  Pass in the item&#39;s last observed &#x60;etag&#x60; value into this header and the endpoint will fail with a &#x60;412 Precondition Failed&#x60; if it has changed since. | [optional] |
| **filesUpdateFileRequest** | [**FilesUpdateFileRequest**](FilesUpdateFileRequest.md)|  | [optional] |

### Return type

[**FileFull**](FileFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a file object.  Not all available fields are returned by default. Use the [fields](https://raw.githubusercontent.com) query parameter to explicitly request any specific fields. |  -  |
| **0** | An unexpected client error. |  -  |

