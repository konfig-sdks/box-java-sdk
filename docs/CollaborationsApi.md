# CollaborationsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**collaborations**](CollaborationsApi.md#collaborations) | **POST** /collaborations | Create collaboration |
| [**getSingleCollaboration**](CollaborationsApi.md#getSingleCollaboration) | **GET** /collaborations/{collaboration_id} | Get collaboration |
| [**removeSingleCollaboration**](CollaborationsApi.md#removeSingleCollaboration) | **DELETE** /collaborations/{collaboration_id} | Remove collaboration |
| [**updateCollaboration**](CollaborationsApi.md#updateCollaboration) | **PUT** /collaborations/{collaboration_id} | Update collaboration |


<a name="collaborations"></a>
# **collaborations**
> Collaboration collaborations().fields(fields).notify(notify).postCollaborationsRequest(postCollaborationsRequest).execute();

Create collaboration

Adds a collaboration for a single user or a single group to a file or folder.  Collaborations can be created using email address, user IDs, or a group IDs.  If a collaboration is being created with a group, access to this endpoint is dependent on the group&#39;s ability to be invited.  If collaboration is in &#x60;pending&#x60; status, the following fields are redacted: - &#x60;login&#x60; and &#x60;name&#x60; are hidden if a collaboration was created using &#x60;user_id&#x60;, -  &#x60;name&#x60; is hidden if a collaboration was created using &#x60;login&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CollaborationsApi;
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
    PostCollaborationsRequestItem item = new PostCollaborationsRequestItem();
    PostCollaborationsRequestAccessibleBy accessibleBy = new PostCollaborationsRequestAccessibleBy();
    String role = "editor"; // The level of access granted.
    Boolean isAccessOnly = true; // If set to `true`, collaborators have access to shared items, but such items won't be visible in the All Files list. Additionally, collaborators won't see the the path to the root folder for the shared item.
    Boolean canViewPath = true; // Determines if the invited users can see the entire parent path to the associated folder. The user will not gain privileges in any parent folder and therefore can not see content the user is not collaborated on.  Be aware that this meaningfully increases the time required to load the invitee's **All Files** page. We recommend you limit the number of collaborations with `can_view_path` enabled to 1,000 per user.  Only owner or co-owners can invite collaborators with a `can_view_path` of `true`.  `can_view_path` can only be used for folder collaborations.
    OffsetDateTime expiresAt = OffsetDateTime.now(); // Set the expiration date for the collaboration. At this date, the collaboration will be automatically removed from the item.  This feature will only work if the **Automatically remove invited collaborators: Allow folder owners to extend the expiry date** setting has been enabled in the **Enterprise Settings** of the **Admin Console**. When the setting is not enabled, collaborations can not have an expiry date and a value for this field will be result in an error.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    Boolean notify = true; // Determines if users should receive email notification for the action performed.
    try {
      Collaboration result = client
              .collaborations
              .collaborations(item, accessibleBy, role)
              .isAccessOnly(isAccessOnly)
              .canViewPath(canViewPath)
              .expiresAt(expiresAt)
              .fields(fields)
              .notify(notify)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getItem());
      System.out.println(result.getAccessibleBy());
      System.out.println(result.getInviteEmail());
      System.out.println(result.getRole());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getIsAccessOnly());
      System.out.println(result.getStatus());
      System.out.println(result.getAcknowledgedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getAcceptanceRequirementsStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollaborationsApi#collaborations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Collaboration> response = client
              .collaborations
              .collaborations(item, accessibleBy, role)
              .isAccessOnly(isAccessOnly)
              .canViewPath(canViewPath)
              .expiresAt(expiresAt)
              .fields(fields)
              .notify(notify)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollaborationsApi#collaborations");
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
| **notify** | **Boolean**| Determines if users should receive email notification for the action performed. | [optional] |
| **postCollaborationsRequest** | [**PostCollaborationsRequest**](PostCollaborationsRequest.md)|  | [optional] |

### Return type

[**Collaboration**](Collaboration.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a new collaboration object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getSingleCollaboration"></a>
# **getSingleCollaboration**
> Collaboration getSingleCollaboration(collaborationId).fields(fields).execute();

Get collaboration

Retrieves a single collaboration.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CollaborationsApi;
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
    String collaborationId = "1234"; // The ID of the collaboration
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    try {
      Collaboration result = client
              .collaborations
              .getSingleCollaboration(collaborationId)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getItem());
      System.out.println(result.getAccessibleBy());
      System.out.println(result.getInviteEmail());
      System.out.println(result.getRole());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getIsAccessOnly());
      System.out.println(result.getStatus());
      System.out.println(result.getAcknowledgedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getAcceptanceRequirementsStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollaborationsApi#getSingleCollaboration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Collaboration> response = client
              .collaborations
              .getSingleCollaboration(collaborationId)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollaborationsApi#getSingleCollaboration");
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
| **collaborationId** | **String**| The ID of the collaboration | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |

### Return type

[**Collaboration**](Collaboration.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collaboration object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeSingleCollaboration"></a>
# **removeSingleCollaboration**
> removeSingleCollaboration(collaborationId).execute();

Remove collaboration

Deletes a single collaboration.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CollaborationsApi;
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
    String collaborationId = "1234"; // The ID of the collaboration
    try {
      client
              .collaborations
              .removeSingleCollaboration(collaborationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CollaborationsApi#removeSingleCollaboration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .collaborations
              .removeSingleCollaboration(collaborationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CollaborationsApi#removeSingleCollaboration");
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
| **collaborationId** | **String**| The ID of the collaboration | |

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
| **204** | A blank response is returned if the collaboration was successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateCollaboration"></a>
# **updateCollaboration**
> Collaboration updateCollaboration(collaborationId).collaborationsUpdateCollaborationRequest(collaborationsUpdateCollaborationRequest).execute();

Update collaboration

Updates a collaboration. Can be used to change the owner of an item, or to accept collaboration invites.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CollaborationsApi;
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
    String role = "editor"; // The level of access granted.
    String collaborationId = "1234"; // The ID of the collaboration
    String status = "pending"; // <!--alex ignore reject--> Set the status of a `pending` collaboration invitation, effectively accepting, or rejecting the invite.
    OffsetDateTime expiresAt = OffsetDateTime.now(); // Update the expiration date for the collaboration. At this date, the collaboration will be automatically removed from the item.  This feature will only work if the **Automatically remove invited collaborators: Allow folder owners to extend the expiry date** setting has been enabled in the **Enterprise Settings** of the **Admin Console**. When the setting is not enabled, collaborations can not have an expiry date and a value for this field will be result in an error.  Additionally, a collaboration can only be given an expiration if it was created after the **Automatically remove invited collaborator** setting was enabled.
    Boolean canViewPath = true; // Determines if the invited users can see the entire parent path to the associated folder. The user will not gain privileges in any parent folder and therefore can not see content the user is not collaborated on.  Be aware that this meaningfully increases the time required to load the invitee's **All Files** page. We recommend you limit the number of collaborations with `can_view_path` enabled to 1,000 per user.  Only owner or co-owners can invite collaborators with a `can_view_path` of `true`.  `can_view_path` can only be used for folder collaborations.
    try {
      Collaboration result = client
              .collaborations
              .updateCollaboration(role, collaborationId)
              .status(status)
              .expiresAt(expiresAt)
              .canViewPath(canViewPath)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getItem());
      System.out.println(result.getAccessibleBy());
      System.out.println(result.getInviteEmail());
      System.out.println(result.getRole());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getIsAccessOnly());
      System.out.println(result.getStatus());
      System.out.println(result.getAcknowledgedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getAcceptanceRequirementsStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollaborationsApi#updateCollaboration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Collaboration> response = client
              .collaborations
              .updateCollaboration(role, collaborationId)
              .status(status)
              .expiresAt(expiresAt)
              .canViewPath(canViewPath)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CollaborationsApi#updateCollaboration");
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
| **collaborationId** | **String**| The ID of the collaboration | |
| **collaborationsUpdateCollaborationRequest** | [**CollaborationsUpdateCollaborationRequest**](CollaborationsUpdateCollaborationRequest.md)|  | [optional] |

### Return type

[**Collaboration**](Collaboration.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an updated collaboration object unless the owner has changed. |  -  |
| **204** | If the role is changed to &#x60;owner&#x60;, the collaboration is deleted and a new collaboration is created. The previous &#x60;owner&#x60; of the old collaboration will be a &#x60;co-owner&#x60; on the new collaboration. |  -  |
| **0** | An unexpected client error. |  -  |

