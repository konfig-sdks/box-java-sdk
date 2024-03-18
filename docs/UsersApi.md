# UsersApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /users/{user_id} | Delete user |
| [**getCurrentUser**](UsersApi.md#getCurrentUser) | **GET** /users/me | Get current user |
| [**getUserInfo**](UsersApi.md#getUserInfo) | **GET** /users/{user_id} | Get user |
| [**updateManagedUser**](UsersApi.md#updateManagedUser) | **PUT** /users/{user_id} | Update user |
| [**users**](UsersApi.md#users) | **GET** /users | List enterprise users |
| [**users_0**](UsersApi.md#users_0) | **POST** /users | Create user |


<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(userId).notify(notify).force(force).execute();

Delete user

Deletes a user. By default this will fail if the user still owns any content. Move their owned content first before proceeding, or use the &#x60;force&#x60; field to delete the user and their files.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    Boolean notify = true; // Whether the user will receive email notification of the deletion
    Boolean force = true; // Whether the user should be deleted even if this user still own files
    try {
      client
              .users
              .deleteUser(userId)
              .notify(notify)
              .force(force)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deleteUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .users
              .deleteUser(userId)
              .notify(notify)
              .force(force)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deleteUser");
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
| **notify** | **Boolean**| Whether the user will receive email notification of the deletion | [optional] |
| **force** | **Boolean**| Whether the user should be deleted even if this user still own files | [optional] |

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
| **204** | Removes the user and returns an empty response. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getCurrentUser"></a>
# **getCurrentUser**
> UserFull getCurrentUser().fields(fields).execute();

Get current user

Retrieves information about the user who is currently authenticated.  In the case of a client-side authenticated OAuth 2.0 application this will be the user who authorized the app.  In the case of a JWT, server-side authenticated application this will be the service account that belongs to the application by default.  Use the &#x60;As-User&#x60; header to change who this API call is made on behalf of.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      UserFull result = client
              .users
              .getCurrentUser()
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getName());
      System.out.println(result.getLogin());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getLanguage());
      System.out.println(result.getTimezone());
      System.out.println(result.getSpaceAmount());
      System.out.println(result.getSpaceUsed());
      System.out.println(result.getMaxUploadSize());
      System.out.println(result.getStatus());
      System.out.println(result.getJobTitle());
      System.out.println(result.getPhone());
      System.out.println(result.getAddress());
      System.out.println(result.getAvatarUrl());
      System.out.println(result.getNotificationEmail());
      System.out.println(result.getRole());
      System.out.println(result.getTrackingCodes());
      System.out.println(result.getCanSeeManagedUsers());
      System.out.println(result.getIsSyncEnabled());
      System.out.println(result.getIsExternalCollabRestricted());
      System.out.println(result.getIsExemptFromDeviceLimits());
      System.out.println(result.getIsExemptFromLoginVerification());
      System.out.println(result.getEnterprise());
      System.out.println(result.getMyTags());
      System.out.println(result.getHostname());
      System.out.println(result.getIsPlatformAccessOnly());
      System.out.println(result.getExternalAppUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getCurrentUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserFull> response = client
              .users
              .getCurrentUser()
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getCurrentUser");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |

### Return type

[**UserFull**](UserFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single user object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getUserInfo"></a>
# **getUserInfo**
> UserFull getUserInfo(userId).fields(fields).execute();

Get user

Retrieves information about a user in the enterprise.  The application and the authenticated user need to have the permission to look up users in the entire enterprise.  This endpoint also returns a limited set of information for external users who are collaborated on content owned by the enterprise for authenticated users with the right scopes. In this case, disallowed fields will return null instead.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      UserFull result = client
              .users
              .getUserInfo(userId)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getName());
      System.out.println(result.getLogin());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getLanguage());
      System.out.println(result.getTimezone());
      System.out.println(result.getSpaceAmount());
      System.out.println(result.getSpaceUsed());
      System.out.println(result.getMaxUploadSize());
      System.out.println(result.getStatus());
      System.out.println(result.getJobTitle());
      System.out.println(result.getPhone());
      System.out.println(result.getAddress());
      System.out.println(result.getAvatarUrl());
      System.out.println(result.getNotificationEmail());
      System.out.println(result.getRole());
      System.out.println(result.getTrackingCodes());
      System.out.println(result.getCanSeeManagedUsers());
      System.out.println(result.getIsSyncEnabled());
      System.out.println(result.getIsExternalCollabRestricted());
      System.out.println(result.getIsExemptFromDeviceLimits());
      System.out.println(result.getIsExemptFromLoginVerification());
      System.out.println(result.getEnterprise());
      System.out.println(result.getMyTags());
      System.out.println(result.getHostname());
      System.out.println(result.getIsPlatformAccessOnly());
      System.out.println(result.getExternalAppUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserFull> response = client
              .users
              .getUserInfo(userId)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserInfo");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |

### Return type

[**UserFull**](UserFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single user object.  Not all available fields are returned by default. Use the [fields](https://raw.githubusercontent.com) query parameter to explicitly request any specific fields using the [fields](https://raw.githubusercontent.com) parameter. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateManagedUser"></a>
# **updateManagedUser**
> UserFull updateManagedUser(userId).fields(fields).usersUpdateManagedUserRequest(usersUpdateManagedUserRequest).execute();

Update user

Updates a managed or app user in an enterprise. This endpoint is only available to users and applications with the right admin permissions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String enterprise = "enterprise_example"; // Set this to `null` to roll the user out of the enterprise and make them a free user
    Boolean notify = true; // Whether the user should receive an email when they are rolled out of an enterprise
    String name = "name_example"; // The name of the user
    String login = "login_example"; // The email address the user uses to log in  Note: If the target user's email is not confirmed, then the primary login address cannot be changed.
    String role = "coadmin"; // The user’s enterprise role
    String language = "language_example"; // The language of the user, formatted in modified version of the [ISO 639-1](https://raw.githubusercontent.com) format.
    Boolean isSyncEnabled = true; // Whether the user can use Box Sync
    String jobTitle = "jobTitle_example"; // The user’s job title
    String phone = "phone_example"; // The user’s phone number
    String address = "address_example"; // The user’s address
    List<TrackingCode> trackingCodes = Arrays.asList(); // Tracking codes allow an admin to generate reports from the admin console and assign an attribute to a specific group of users. This setting must be enabled for an enterprise before it can be used.
    Boolean canSeeManagedUsers = true; // Whether the user can see other enterprise users in their contact list
    String timezone = "timezone_example"; // The user's timezone
    Boolean isExternalCollabRestricted = true; // Whether the user is allowed to collaborate with users outside their enterprise
    Boolean isExemptFromDeviceLimits = true; // Whether to exempt the user from enterprise device limits
    Boolean isExemptFromLoginVerification = true; // Whether the user must use two-factor authentication
    Boolean isPasswordResetRequired = true; // Whether the user is required to reset their password
    String status = "active"; // The user's account status
    Long spaceAmount = 56L; // The user’s total available space in bytes. Set this to `-1` to indicate unlimited storage.
    UsersUpdateManagedUserRequestNotificationEmail notificationEmail = new UsersUpdateManagedUserRequestNotificationEmail();
    String externalAppUserId = "externalAppUserId_example"; // An external identifier for an app user, which can be used to look up the user. This can be used to tie user IDs from external identity providers to Box users.  Note: In order to update this field, you need to request a token using the application that created the app user.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      UserFull result = client
              .users
              .updateManagedUser(userId)
              .enterprise(enterprise)
              .notify(notify)
              .name(name)
              .login(login)
              .role(role)
              .language(language)
              .isSyncEnabled(isSyncEnabled)
              .jobTitle(jobTitle)
              .phone(phone)
              .address(address)
              .trackingCodes(trackingCodes)
              .canSeeManagedUsers(canSeeManagedUsers)
              .timezone(timezone)
              .isExternalCollabRestricted(isExternalCollabRestricted)
              .isExemptFromDeviceLimits(isExemptFromDeviceLimits)
              .isExemptFromLoginVerification(isExemptFromLoginVerification)
              .isPasswordResetRequired(isPasswordResetRequired)
              .status(status)
              .spaceAmount(spaceAmount)
              .notificationEmail(notificationEmail)
              .externalAppUserId(externalAppUserId)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getName());
      System.out.println(result.getLogin());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getLanguage());
      System.out.println(result.getTimezone());
      System.out.println(result.getSpaceAmount());
      System.out.println(result.getSpaceUsed());
      System.out.println(result.getMaxUploadSize());
      System.out.println(result.getStatus());
      System.out.println(result.getJobTitle());
      System.out.println(result.getPhone());
      System.out.println(result.getAddress());
      System.out.println(result.getAvatarUrl());
      System.out.println(result.getNotificationEmail());
      System.out.println(result.getRole());
      System.out.println(result.getTrackingCodes());
      System.out.println(result.getCanSeeManagedUsers());
      System.out.println(result.getIsSyncEnabled());
      System.out.println(result.getIsExternalCollabRestricted());
      System.out.println(result.getIsExemptFromDeviceLimits());
      System.out.println(result.getIsExemptFromLoginVerification());
      System.out.println(result.getEnterprise());
      System.out.println(result.getMyTags());
      System.out.println(result.getHostname());
      System.out.println(result.getIsPlatformAccessOnly());
      System.out.println(result.getExternalAppUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateManagedUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserFull> response = client
              .users
              .updateManagedUser(userId)
              .enterprise(enterprise)
              .notify(notify)
              .name(name)
              .login(login)
              .role(role)
              .language(language)
              .isSyncEnabled(isSyncEnabled)
              .jobTitle(jobTitle)
              .phone(phone)
              .address(address)
              .trackingCodes(trackingCodes)
              .canSeeManagedUsers(canSeeManagedUsers)
              .timezone(timezone)
              .isExternalCollabRestricted(isExternalCollabRestricted)
              .isExemptFromDeviceLimits(isExemptFromDeviceLimits)
              .isExemptFromLoginVerification(isExemptFromLoginVerification)
              .isPasswordResetRequired(isPasswordResetRequired)
              .status(status)
              .spaceAmount(spaceAmount)
              .notificationEmail(notificationEmail)
              .externalAppUserId(externalAppUserId)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateManagedUser");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **usersUpdateManagedUserRequest** | [**UsersUpdateManagedUserRequest**](UsersUpdateManagedUserRequest.md)|  | [optional] |

### Return type

[**UserFull**](UserFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated user object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="users"></a>
# **users**
> Users users().filterTerm(filterTerm).userType(userType).externalAppUserId(externalAppUserId).fields(fields).offset(offset).limit(limit).usemarker(usemarker).marker(marker).execute();

List enterprise users

Returns a list of all users for the Enterprise along with their &#x60;user_id&#x60;, &#x60;public_name&#x60;, and &#x60;login&#x60;.  The application and the authenticated user need to have the permission to look up users in the entire enterprise.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String filterTerm = "john"; // Limits the results to only users who's `name` or `login` start with the search term.  For externally managed users, the search term needs to completely match the in order to find the user, and it will only return one user at a time.
    String userType = "all"; // Limits the results to the kind of user specified.  * `all` returns every kind of user for whom the   `login` or `name` partially matches the   `filter_term`. It will only return an external user   if the login matches the `filter_term` completely,   and in that case it will only return that user. * `managed` returns all managed and app users for whom   the `login` or `name` partially matches the   `filter_term`. * `external` returns all external users for whom the   `login` matches the `filter_term` exactly.
    String externalAppUserId = "my-user-1234"; // Limits the results to app users with the given `external_app_user_id` value.  When creating an app user, an `external_app_user_id` value can be set. This value can then be used in this endpoint to find any users that match that `external_app_user_id` value.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    Long offset = 0L; // The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response.
    Long limit = 1000L; // The maximum number of items to return per page.
    Boolean usemarker = true; // Specifies whether to use marker-based pagination instead of offset-based pagination. Only one pagination method can be used at a time.  By setting this value to true, the API will return a `marker` field that can be passed as a parameter to this endpoint to get the next page of the response.
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    try {
      Users result = client
              .users
              .users()
              .filterTerm(filterTerm)
              .userType(userType)
              .externalAppUserId(externalAppUserId)
              .fields(fields)
              .offset(offset)
              .limit(limit)
              .usemarker(usemarker)
              .marker(marker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCount());
      System.out.println(result.getLimit());
      System.out.println(result.getOffset());
      System.out.println(result.getOrder());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#users");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Users> response = client
              .users
              .users()
              .filterTerm(filterTerm)
              .userType(userType)
              .externalAppUserId(externalAppUserId)
              .fields(fields)
              .offset(offset)
              .limit(limit)
              .usemarker(usemarker)
              .marker(marker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#users");
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
| **filterTerm** | **String**| Limits the results to only users who&#39;s &#x60;name&#x60; or &#x60;login&#x60; start with the search term.  For externally managed users, the search term needs to completely match the in order to find the user, and it will only return one user at a time. | [optional] |
| **userType** | **String**| Limits the results to the kind of user specified.  * &#x60;all&#x60; returns every kind of user for whom the   &#x60;login&#x60; or &#x60;name&#x60; partially matches the   &#x60;filter_term&#x60;. It will only return an external user   if the login matches the &#x60;filter_term&#x60; completely,   and in that case it will only return that user. * &#x60;managed&#x60; returns all managed and app users for whom   the &#x60;login&#x60; or &#x60;name&#x60; partially matches the   &#x60;filter_term&#x60;. * &#x60;external&#x60; returns all external users for whom the   &#x60;login&#x60; matches the &#x60;filter_term&#x60; exactly. | [optional] [enum: all, managed, external] |
| **externalAppUserId** | **String**| Limits the results to app users with the given &#x60;external_app_user_id&#x60; value.  When creating an app user, an &#x60;external_app_user_id&#x60; value can be set. This value can then be used in this endpoint to find any users that match that &#x60;external_app_user_id&#x60; value. | [optional] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **offset** | **Long**| The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response. | [optional] [default to 0] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |
| **usemarker** | **Boolean**| Specifies whether to use marker-based pagination instead of offset-based pagination. Only one pagination method can be used at a time.  By setting this value to true, the API will return a &#x60;marker&#x60; field that can be passed as a parameter to this endpoint to get the next page of the response. | [optional] |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |

### Return type

[**Users**](Users.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns all of the users in the enterprise. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="users_0"></a>
# **users_0**
> UserFull users_0().fields(fields).postUsersRequest(postUsersRequest).execute();

Create user

Creates a new managed user in an enterprise. This endpoint is only available to users and applications with the right admin permissions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String name = "name_example"; // The name of the user
    String login = "login_example"; // The email address the user uses to log in  Required, unless `is_platform_access_only` is set to `true`.
    Boolean isPlatformAccessOnly = true; // Specifies that the user is an app user.
    String role = "coadmin"; // The user’s enterprise role
    String language = "language_example"; // The language of the user, formatted in modified version of the [ISO 639-1](https://raw.githubusercontent.com) format.
    Boolean isSyncEnabled = true; // Whether the user can use Box Sync
    String jobTitle = "jobTitle_example"; // The user’s job title
    String phone = "phone_example"; // The user’s phone number
    String address = "address_example"; // The user’s address
    Long spaceAmount = 56L; // The user’s total available space in bytes. Set this to `-1` to indicate unlimited storage.
    List<TrackingCode> trackingCodes = Arrays.asList(); // Tracking codes allow an admin to generate reports from the admin console and assign an attribute to a specific group of users. This setting must be enabled for an enterprise before it can be used.
    Boolean canSeeManagedUsers = true; // Whether the user can see other enterprise users in their contact list
    String timezone = "timezone_example"; // The user's timezone
    Boolean isExternalCollabRestricted = true; // Whether the user is allowed to collaborate with users outside their enterprise
    Boolean isExemptFromDeviceLimits = true; // Whether to exempt the user from enterprise device limits
    Boolean isExemptFromLoginVerification = true; // Whether the user must use two-factor authentication
    String status = "active"; // The user's account status
    String externalAppUserId = "externalAppUserId_example"; // An external identifier for an app user, which can be used to look up the user. This can be used to tie user IDs from external identity providers to Box users.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      UserFull result = client
              .users
              .users_0(name)
              .login(login)
              .isPlatformAccessOnly(isPlatformAccessOnly)
              .role(role)
              .language(language)
              .isSyncEnabled(isSyncEnabled)
              .jobTitle(jobTitle)
              .phone(phone)
              .address(address)
              .spaceAmount(spaceAmount)
              .trackingCodes(trackingCodes)
              .canSeeManagedUsers(canSeeManagedUsers)
              .timezone(timezone)
              .isExternalCollabRestricted(isExternalCollabRestricted)
              .isExemptFromDeviceLimits(isExemptFromDeviceLimits)
              .isExemptFromLoginVerification(isExemptFromLoginVerification)
              .status(status)
              .externalAppUserId(externalAppUserId)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getName());
      System.out.println(result.getLogin());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getLanguage());
      System.out.println(result.getTimezone());
      System.out.println(result.getSpaceAmount());
      System.out.println(result.getSpaceUsed());
      System.out.println(result.getMaxUploadSize());
      System.out.println(result.getStatus());
      System.out.println(result.getJobTitle());
      System.out.println(result.getPhone());
      System.out.println(result.getAddress());
      System.out.println(result.getAvatarUrl());
      System.out.println(result.getNotificationEmail());
      System.out.println(result.getRole());
      System.out.println(result.getTrackingCodes());
      System.out.println(result.getCanSeeManagedUsers());
      System.out.println(result.getIsSyncEnabled());
      System.out.println(result.getIsExternalCollabRestricted());
      System.out.println(result.getIsExemptFromDeviceLimits());
      System.out.println(result.getIsExemptFromLoginVerification());
      System.out.println(result.getEnterprise());
      System.out.println(result.getMyTags());
      System.out.println(result.getHostname());
      System.out.println(result.getIsPlatformAccessOnly());
      System.out.println(result.getExternalAppUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#users_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserFull> response = client
              .users
              .users_0(name)
              .login(login)
              .isPlatformAccessOnly(isPlatformAccessOnly)
              .role(role)
              .language(language)
              .isSyncEnabled(isSyncEnabled)
              .jobTitle(jobTitle)
              .phone(phone)
              .address(address)
              .spaceAmount(spaceAmount)
              .trackingCodes(trackingCodes)
              .canSeeManagedUsers(canSeeManagedUsers)
              .timezone(timezone)
              .isExternalCollabRestricted(isExternalCollabRestricted)
              .isExemptFromDeviceLimits(isExemptFromDeviceLimits)
              .isExemptFromLoginVerification(isExemptFromLoginVerification)
              .status(status)
              .externalAppUserId(externalAppUserId)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#users_0");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **postUsersRequest** | [**PostUsersRequest**](PostUsersRequest.md)|  | [optional] |

### Return type

[**UserFull**](UserFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a user object for the newly created user. |  -  |
| **0** | An unexpected client error. |  -  |

