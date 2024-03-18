# UserAvatarsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOrUpdateImage**](UserAvatarsApi.md#addOrUpdateImage) | **POST** /users/{user_id}/avatar | Add or update user avatar |
| [**getImage**](UserAvatarsApi.md#getImage) | **GET** /users/{user_id}/avatar | Get user avatar |
| [**removeExisting**](UserAvatarsApi.md#removeExisting) | **DELETE** /users/{user_id}/avatar | Delete user avatar |


<a name="addOrUpdateImage"></a>
# **addOrUpdateImage**
> UserAvatar addOrUpdateImage(userId, pic).userAvatarsAddOrUpdateImageRequest(userAvatarsAddOrUpdateImageRequest).execute();

Add or update user avatar

Adds or updates a user avatar.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserAvatarsApi;
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
    String userId = "12345"; // The ID of the user.
    File pic = new File("/path/to/file"); // The image file to be uploaded to Box. Accepted file extensions are `.jpg` or `.png`. The maximum file size is 1MB.
    try {
      UserAvatar result = client
              .userAvatars
              .addOrUpdateImage(userId, pic)
              .execute();
      System.out.println(result);
      System.out.println(result.getPicUrls());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAvatarsApi#addOrUpdateImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserAvatar> response = client
              .userAvatars
              .addOrUpdateImage(userId, pic)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAvatarsApi#addOrUpdateImage");
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
| **userId** | **String**| The ID of the user. | |
| **pic** | **File**| The image file to be uploaded to Box. Accepted file extensions are &#x60;.jpg&#x60; or &#x60;.png&#x60;. The maximum file size is 1MB. | |
| **userAvatarsAddOrUpdateImageRequest** | [**UserAvatarsAddOrUpdateImageRequest**](UserAvatarsAddOrUpdateImageRequest.md)|  | [optional] |

### Return type

[**UserAvatar**](UserAvatar.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | * &#x60;ok&#x60;: Returns the &#x60;pic_urls&#x60; object with URLs to existing user avatars that were updated. |  -  |
| **201** | * &#x60;created&#x60;: Returns the &#x60;pic_urls&#x60; object with URLS to user avatars uploaded to Box with the request. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getImage"></a>
# **getImage**
> File getImage(userId).execute();

Get user avatar

Retrieves an image of a the user&#39;s avatar.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserAvatarsApi;
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
    String userId = "12345"; // The ID of the user.
    try {
      File result = client
              .userAvatars
              .getImage(userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAvatarsApi#getImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .userAvatars
              .getImage(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAvatarsApi#getImage");
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
| **userId** | **String**| The ID of the user. | |

### Return type

[**File**](File.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/jpg, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | When an avatar can be found for the user the image data will be returned in the body of the response. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeExisting"></a>
# **removeExisting**
> removeExisting(userId).execute();

Delete user avatar

Removes an existing user avatar. You cannot reverse this operation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserAvatarsApi;
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
    String userId = "12345"; // The ID of the user.
    try {
      client
              .userAvatars
              .removeExisting(userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAvatarsApi#removeExisting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .userAvatars
              .removeExisting(userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAvatarsApi#removeExisting");
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
| **userId** | **String**| The ID of the user. | |

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
| **204** | * &#x60;no_content&#x60;: Removes the avatar and returns an empty response. |  -  |
| **0** | An unexpected client error. |  -  |

