# TransferFoldersApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**toDestination**](TransferFoldersApi.md#toDestination) | **PUT** /users/{user_id}/folders/0 | Transfer owned folders |


<a name="toDestination"></a>
# **toDestination**
> FolderFull toDestination(userId).fields(fields).notify(notify).transferFoldersToDestinationRequest(transferFoldersToDestinationRequest).execute();

Transfer owned folders

Move all of the items (files, folders and workflows) owned by a user into another user&#39;s account  Only the root folder (&#x60;0&#x60;) can be transferred.  Folders can only be moved across users by users with administrative permissions.  All existing shared links and folder-level collaborations are transferred during the operation. Please note that while collaborations at the individual file-level are transferred during the operation, the collaborations are deleted when the original user is deleted.  This call will be performed synchronously which might lead to a slow response when the source user has a large number of items in all of its folders.  If the destination path has a metadata cascade policy attached to any of the parent folders, a metadata cascade operation will be kicked off asynchronously.  There is currently no way to check for when this operation is finished.  The destination folder&#39;s name will be in the format &#x60;{User}&#39;s Files and Folders&#x60;, where &#x60;{User}&#x60; is the display name of the user.  To make this API call your application will need to have the \&quot;Read and write all files and folders stored in Box\&quot; scope enabled.  Please make sure the destination user has access to &#x60;Relay&#x60; or &#x60;Relay Lite&#x60;, and has access to the files and folders involved in the workflows being transferred.  Admins will receive an email when the operation is completed.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransferFoldersApi;
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
    TransferFoldersToDestinationRequestOwnedBy ownedBy = new TransferFoldersToDestinationRequestOwnedBy();
    String userId = "12345"; // The ID of the user.
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    Boolean notify = true; // Determines if users should receive email notification for the action performed.
    try {
      FolderFull result = client
              .transferFolders
              .toDestination(ownedBy, userId)
              .fields(fields)
              .notify(notify)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEtag());
      System.out.println(result.getType());
      System.out.println(result.getSequenceId());
      System.out.println(result.getName());
      System.out.println(result.getDescription());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getSize());
      System.out.println(result.getPathCollection());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getModifiedBy());
      System.out.println(result.getTrashedAt());
      System.out.println(result.getPurgedAt());
      System.out.println(result.getContentCreatedAt());
      System.out.println(result.getContentModifiedAt());
      System.out.println(result.getOwnedBy());
      System.out.println(result.getSharedLink());
      System.out.println(result.getFolderUploadEmail());
      System.out.println(result.getParent());
      System.out.println(result.getItemStatus());
      System.out.println(result.getItemCollection());
      System.out.println(result.getTags());
      System.out.println(result.getSyncState());
      System.out.println(result.getHasCollaborations());
      System.out.println(result.getPermissions());
      System.out.println(result.getCanNonOwnersInvite());
      System.out.println(result.getIsExternallyOwned());
      System.out.println(result.getMetadata());
      System.out.println(result.getIsCollaborationRestrictedToEnterprise());
      System.out.println(result.getAllowedSharedLinkAccessLevels());
      System.out.println(result.getAllowedInviteeRoles());
      System.out.println(result.getWatermarkInfo());
      System.out.println(result.getIsAccessibleViaSharedLink());
      System.out.println(result.getCanNonOwnersViewCollaborators());
      System.out.println(result.getClassification());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferFoldersApi#toDestination");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FolderFull> response = client
              .transferFolders
              .toDestination(ownedBy, userId)
              .fields(fields)
              .notify(notify)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferFoldersApi#toDestination");
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
| **notify** | **Boolean**| Determines if users should receive email notification for the action performed. | [optional] |
| **transferFoldersToDestinationRequest** | [**TransferFoldersToDestinationRequest**](TransferFoldersToDestinationRequest.md)|  | [optional] |

### Return type

[**FolderFull**](FolderFull.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the information for the newly created destination folder. |  -  |
| **0** | An unexpected client error. |  -  |

