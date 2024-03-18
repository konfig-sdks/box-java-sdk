# GroupMembershipsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMembership**](GroupMembershipsApi.md#createMembership) | **POST** /group_memberships | Add user to group |
| [**getAll**](GroupMembershipsApi.md#getAll) | **GET** /users/{user_id}/memberships | List user&#39;s groups |
| [**getSpecificMembership**](GroupMembershipsApi.md#getSpecificMembership) | **GET** /group_memberships/{group_membership_id} | Get group membership |
| [**listMembersOfGroup**](GroupMembershipsApi.md#listMembersOfGroup) | **GET** /groups/{group_id}/memberships | List members of group |
| [**removeUserFromGroup**](GroupMembershipsApi.md#removeUserFromGroup) | **DELETE** /group_memberships/{group_membership_id} | Remove user from group |
| [**updateMembership**](GroupMembershipsApi.md#updateMembership) | **PUT** /group_memberships/{group_membership_id} | Update group membership |


<a name="createMembership"></a>
# **createMembership**
> GroupMembership createMembership().fields(fields).groupMembershipsCreateMembershipRequest(groupMembershipsCreateMembershipRequest).execute();

Add user to group

Creates a group membership. Only users with admin-level permissions will be able to use this API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupMembershipsApi;
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
    GroupMembershipsCreateMembershipRequestUser user = new GroupMembershipsCreateMembershipRequestUser();
    GroupMembershipsCreateMembershipRequestGroup group = new GroupMembershipsCreateMembershipRequestGroup();
    String role = "member"; // The role of the user in the group.
    Map<String, Boolean> configurablePermissions = new HashMap(); // Custom configuration for the permissions an admin if a group will receive. This option has no effect on members with a role of `member`.  Setting these permissions overwrites the default access levels of an admin.  Specifying a value of \\\"null\\\" for this object will disable all configurable permissions. Specifying permissions will set them accordingly, omitted permissions will be enabled by default.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      GroupMembership result = client
              .groupMemberships
              .createMembership(user, group)
              .role(role)
              .configurablePermissions(configurablePermissions)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getUser());
      System.out.println(result.getGroup());
      System.out.println(result.getRole());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembershipsApi#createMembership");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupMembership> response = client
              .groupMemberships
              .createMembership(user, group)
              .role(role)
              .configurablePermissions(configurablePermissions)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembershipsApi#createMembership");
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
| **groupMembershipsCreateMembershipRequest** | [**GroupMembershipsCreateMembershipRequest**](GroupMembershipsCreateMembershipRequest.md)|  | [optional] |

### Return type

[**GroupMembership**](GroupMembership.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a new group membership object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getAll"></a>
# **getAll**
> GroupMemberships getAll(userId).limit(limit).offset(offset).execute();

List user&#39;s groups

Retrieves all the groups for a user. Only members of this group or users with admin-level permissions will be able to use this API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupMembershipsApi;
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
    Long limit = 1000L; // The maximum number of items to return per page.
    Long offset = 0L; // The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response.
    try {
      GroupMemberships result = client
              .groupMemberships
              .getAll(userId)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCount());
      System.out.println(result.getLimit());
      System.out.println(result.getOffset());
      System.out.println(result.getOrder());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembershipsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupMemberships> response = client
              .groupMemberships
              .getAll(userId)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembershipsApi#getAll");
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
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |
| **offset** | **Long**| The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response. | [optional] [default to 0] |

### Return type

[**GroupMemberships**](GroupMemberships.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of membership objects. If there are no memberships, an empty collection will be returned. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getSpecificMembership"></a>
# **getSpecificMembership**
> GroupMembership getSpecificMembership(groupMembershipId).fields(fields).execute();

Get group membership

Retrieves a specific group membership. Only admins of this group or users with admin-level permissions will be able to use this API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupMembershipsApi;
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
    String groupMembershipId = "434534"; // The ID of the group membership.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      GroupMembership result = client
              .groupMemberships
              .getSpecificMembership(groupMembershipId)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getUser());
      System.out.println(result.getGroup());
      System.out.println(result.getRole());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembershipsApi#getSpecificMembership");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupMembership> response = client
              .groupMemberships
              .getSpecificMembership(groupMembershipId)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembershipsApi#getSpecificMembership");
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
| **groupMembershipId** | **String**| The ID of the group membership. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |

### Return type

[**GroupMembership**](GroupMembership.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the group membership object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listMembersOfGroup"></a>
# **listMembersOfGroup**
> GroupMemberships listMembersOfGroup(groupId).limit(limit).offset(offset).execute();

List members of group

Retrieves all the members for a group. Only members of this group or users with admin-level permissions will be able to use this API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupMembershipsApi;
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
    String groupId = "57645"; // The ID of the group.
    Long limit = 1000L; // The maximum number of items to return per page.
    Long offset = 0L; // The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response.
    try {
      GroupMemberships result = client
              .groupMemberships
              .listMembersOfGroup(groupId)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCount());
      System.out.println(result.getLimit());
      System.out.println(result.getOffset());
      System.out.println(result.getOrder());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembershipsApi#listMembersOfGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupMemberships> response = client
              .groupMemberships
              .listMembersOfGroup(groupId)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembershipsApi#listMembersOfGroup");
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
| **groupId** | **String**| The ID of the group. | |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |
| **offset** | **Long**| The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response. | [optional] [default to 0] |

### Return type

[**GroupMemberships**](GroupMemberships.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of membership objects. If there are no memberships, an empty collection will be returned. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeUserFromGroup"></a>
# **removeUserFromGroup**
> removeUserFromGroup(groupMembershipId).execute();

Remove user from group

Deletes a specific group membership. Only admins of this group or users with admin-level permissions will be able to use this API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupMembershipsApi;
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
    String groupMembershipId = "434534"; // The ID of the group membership.
    try {
      client
              .groupMemberships
              .removeUserFromGroup(groupMembershipId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembershipsApi#removeUserFromGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .groupMemberships
              .removeUserFromGroup(groupMembershipId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembershipsApi#removeUserFromGroup");
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
| **groupMembershipId** | **String**| The ID of the group membership. | |

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
| **204** | A blank response is returned if the membership was successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateMembership"></a>
# **updateMembership**
> GroupMembership updateMembership(groupMembershipId).fields(fields).groupMembershipsUpdateMembershipRequest(groupMembershipsUpdateMembershipRequest).execute();

Update group membership

Updates a user&#39;s group membership. Only admins of this group or users with admin-level permissions will be able to use this API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupMembershipsApi;
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
    String groupMembershipId = "434534"; // The ID of the group membership.
    String role = "member"; // The role of the user in the group.
    Map<String, Boolean> configurablePermissions = new HashMap(); // Custom configuration for the permissions an admin if a group will receive. This option has no effect on members with a role of `member`.  Setting these permissions overwrites the default access levels of an admin.  Specifying a value of \\\"null\\\" for this object will disable all configurable permissions. Specifying permissions will set them accordingly, omitted permissions will be enabled by default.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      GroupMembership result = client
              .groupMemberships
              .updateMembership(groupMembershipId)
              .role(role)
              .configurablePermissions(configurablePermissions)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getUser());
      System.out.println(result.getGroup());
      System.out.println(result.getRole());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembershipsApi#updateMembership");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupMembership> response = client
              .groupMemberships
              .updateMembership(groupMembershipId)
              .role(role)
              .configurablePermissions(configurablePermissions)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupMembershipsApi#updateMembership");
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
| **groupMembershipId** | **String**| The ID of the group membership. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **groupMembershipsUpdateMembershipRequest** | [**GroupMembershipsUpdateMembershipRequest**](GroupMembershipsUpdateMembershipRequest.md)|  | [optional] |

### Return type

[**GroupMembership**](GroupMembership.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a new group membership object. |  -  |
| **0** | An unexpected client error. |  -  |

