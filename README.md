<div align="left">

[![Visit Box](./header.png)](https://box.com)

# [Box](https://box.com)

[Box Platform](https://box.dev) provides functionality to provide access to content stored within [Box](https://box.com). It provides endpoints for basic manipulation of files and folders, management of users within an enterprise, as well as more complex topics such as legal holds and retention policies.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Box&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>box-java-sdk</artifactId>
  <version>2.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:box-java-sdk:2.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/box-java-sdk-2.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.box.com/2.0";
    Box client = new Box(configuration);
    String responseType = "code"; // The type of response we'd like to receive.
    String clientId = "ly1nj6n11vionaie65emwzk575hnnmrk"; // The Client ID of the application that is requesting to authenticate the user. To get the Client ID for your application, log in to your Box developer console and click the **Edit Application** link for the application you're working with. In the OAuth 2.0 Parameters section of the configuration page, find the item labelled `client_id`. The text of that item is your application's Client ID.
    String redirectUri = "http://example.com/auth/callback"; // The URI to which Box redirects the browser after the user has granted or denied the application permission. This URI match one of the redirect URIs in the configuration of your application. It must be a valid HTTPS URI and it needs to be able to handle the redirection to complete the next step in the OAuth 2.0 flow. Although this parameter is optional, it must be a part of the authorization URL if you configured multiple redirect URIs for the application in the developer console. A missing parameter causes a `redirect_uri_missing` error after the user grants application access.
    String state = "my_state"; // A custom string of your choice. Box will pass the same string to the redirect URL when authentication is complete. This parameter can be used to identify a user on redirect, as well as protect against hijacked sessions and other exploits.
    String scope = "admin_readwrite"; // A space-separated list of application scopes you'd like to authenticate the user for. This defaults to all the scopes configured for the application in its configuration page.
    try {
      String result = client
              .authorization
              .authorize(responseType, clientId)
              .redirectUri(redirectUri)
              .state(state)
              .scope(scope)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#authorize");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .authorization
              .authorize(responseType, clientId)
              .redirectUri(redirectUri)
              .state(state)
              .scope(scope)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#authorize");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.box.com/2.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthorizationApi* | [**authorize**](docs/AuthorizationApi.md#authorize) | **GET** /authorize | Authorize user
*AuthorizationApi* | [**refreshAccessToken**](docs/AuthorizationApi.md#refreshAccessToken) | **POST** /oauth2/token#refresh | Refresh access token
*AuthorizationApi* | [**requestAccessToken**](docs/AuthorizationApi.md#requestAccessToken) | **POST** /oauth2/token | Request access token
*AuthorizationApi* | [**revokeAccessToken**](docs/AuthorizationApi.md#revokeAccessToken) | **POST** /oauth2/revoke | Revoke access token
*ClassificationsApi* | [**addNewClassifications**](docs/ClassificationsApi.md#addNewClassifications) | **PUT** /metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema#add | Add classification
*ClassificationsApi* | [**initializeTemplate**](docs/ClassificationsApi.md#initializeTemplate) | **POST** /metadata_templates/schema#classifications | Add initial classifications
*ClassificationsApi* | [**listAllClassifications**](docs/ClassificationsApi.md#listAllClassifications) | **GET** /metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema | List all classifications
*ClassificationsApi* | [**updateLabelsDescriptions**](docs/ClassificationsApi.md#updateLabelsDescriptions) | **PUT** /metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema#update | Update classification
*ClassificationsOnFilesApi* | [**addClassification**](docs/ClassificationsOnFilesApi.md#addClassification) | **POST** /files/{file_id}/metadata/enterprise/securityClassification-6VMVochwUWo | Add classification to file
*ClassificationsOnFilesApi* | [**getClassificationMetadataInstance**](docs/ClassificationsOnFilesApi.md#getClassificationMetadataInstance) | **GET** /files/{file_id}/metadata/enterprise/securityClassification-6VMVochwUWo | Get classification on file
*ClassificationsOnFilesApi* | [**removeClassification**](docs/ClassificationsOnFilesApi.md#removeClassification) | **DELETE** /files/{file_id}/metadata/enterprise/securityClassification-6VMVochwUWo | Remove classification from file
*ClassificationsOnFilesApi* | [**updateClassificationMetadataInstance**](docs/ClassificationsOnFilesApi.md#updateClassificationMetadataInstance) | **PUT** /files/{file_id}/metadata/enterprise/securityClassification-6VMVochwUWo | Update classification on file
*ClassificationsOnFoldersApi* | [**addClassificationToFolder**](docs/ClassificationsOnFoldersApi.md#addClassificationToFolder) | **POST** /folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo | Add classification to folder
*ClassificationsOnFoldersApi* | [**getClassificationMetadata**](docs/ClassificationsOnFoldersApi.md#getClassificationMetadata) | **GET** /folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo | Get classification on folder
*ClassificationsOnFoldersApi* | [**removeFromFolder**](docs/ClassificationsOnFoldersApi.md#removeFromFolder) | **DELETE** /folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo | Remove classification from folder
*ClassificationsOnFoldersApi* | [**updateClassification**](docs/ClassificationsOnFoldersApi.md#updateClassification) | **PUT** /folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo | Update classification on folder
*CollaborationsApi* | [**collaborations**](docs/CollaborationsApi.md#collaborations) | **POST** /collaborations | Create collaboration
*CollaborationsApi* | [**getSingleCollaboration**](docs/CollaborationsApi.md#getSingleCollaboration) | **GET** /collaborations/{collaboration_id} | Get collaboration
*CollaborationsApi* | [**removeSingleCollaboration**](docs/CollaborationsApi.md#removeSingleCollaboration) | **DELETE** /collaborations/{collaboration_id} | Remove collaboration
*CollaborationsApi* | [**updateCollaboration**](docs/CollaborationsApi.md#updateCollaboration) | **PUT** /collaborations/{collaboration_id} | Update collaboration
*CollaborationsListApi* | [**collaborations**](docs/CollaborationsListApi.md#collaborations) | **GET** /collaborations | List pending collaborations
*CollaborationsListApi* | [**fileAccessList**](docs/CollaborationsListApi.md#fileAccessList) | **GET** /files/{file_id}/collaborations | List file collaborations
*CollaborationsListApi* | [**folderAccess**](docs/CollaborationsListApi.md#folderAccess) | **GET** /folders/{folder_id}/collaborations | List folder collaborations
*CollaborationsListApi* | [**groupAccessDetails**](docs/CollaborationsListApi.md#groupAccessDetails) | **GET** /groups/{group_id}/collaborations | List group collaborations
*CollectionsApi* | [**collections**](docs/CollectionsApi.md#collections) | **GET** /collections | List all collections
*CollectionsApi* | [**listItems**](docs/CollectionsApi.md#listItems) | **GET** /collections/{collection_id}/items | List collection items
*CommentsApi* | [**comments**](docs/CommentsApi.md#comments) | **POST** /comments | Create comment
*CommentsApi* | [**getById**](docs/CommentsApi.md#getById) | **GET** /comments/{comment_id} | Get comment
*CommentsApi* | [**listFileComments**](docs/CommentsApi.md#listFileComments) | **GET** /files/{file_id}/comments | List file comments
*CommentsApi* | [**removeById**](docs/CommentsApi.md#removeById) | **DELETE** /comments/{comment_id} | Remove comment
*CommentsApi* | [**updateMessage**](docs/CommentsApi.md#updateMessage) | **PUT** /comments/{comment_id} | Update comment
*DevicePinnersApi* | [**getPinnerInfo**](docs/DevicePinnersApi.md#getPinnerInfo) | **GET** /device_pinners/{device_pinner_id} | Get device pin
*DevicePinnersApi* | [**listPinnerInfo**](docs/DevicePinnersApi.md#listPinnerInfo) | **GET** /enterprises/{enterprise_id}/device_pinners | List enterprise device pins
*DevicePinnersApi* | [**removeDevicePin**](docs/DevicePinnersApi.md#removeDevicePin) | **DELETE** /device_pinners/{device_pinner_id} | Remove device pin
*DomainRestrictionsUserExemptionsApi* | [**createUserExemptionFromCollaborationDomainRestrictions**](docs/DomainRestrictionsUserExemptionsApi.md#createUserExemptionFromCollaborationDomainRestrictions) | **POST** /collaboration_whitelist_exempt_targets | Create user exemption from collaboration domain restrictions
*DomainRestrictionsUserExemptionsApi* | [**getUserExemption**](docs/DomainRestrictionsUserExemptionsApi.md#getUserExemption) | **GET** /collaboration_whitelist_exempt_targets/{collaboration_whitelist_exempt_target_id} | Get user exempt from collaboration domain restrictions
*DomainRestrictionsUserExemptionsApi* | [**listExemptUsers**](docs/DomainRestrictionsUserExemptionsApi.md#listExemptUsers) | **GET** /collaboration_whitelist_exempt_targets | List users exempt from collaboration domain restrictions
*DomainRestrictionsUserExemptionsApi* | [**removeExemption**](docs/DomainRestrictionsUserExemptionsApi.md#removeExemption) | **DELETE** /collaboration_whitelist_exempt_targets/{collaboration_whitelist_exempt_target_id} | Remove user from list of users exempt from domain restrictions
*DomainRestrictionsForCollaborationsApi* | [**addAllowedDomainEntry**](docs/DomainRestrictionsForCollaborationsApi.md#addAllowedDomainEntry) | **POST** /collaboration_whitelist_entries | Add domain to list of allowed collaboration domains
*DomainRestrictionsForCollaborationsApi* | [**allowedCollaborationDomain**](docs/DomainRestrictionsForCollaborationsApi.md#allowedCollaborationDomain) | **GET** /collaboration_whitelist_entries/{collaboration_whitelist_entry_id} | Get allowed collaboration domain
*DomainRestrictionsForCollaborationsApi* | [**listAllowedCollaborationDomains**](docs/DomainRestrictionsForCollaborationsApi.md#listAllowedCollaborationDomains) | **GET** /collaboration_whitelist_entries | List allowed collaboration domains
*DomainRestrictionsForCollaborationsApi* | [**removeAllowedDomainEntry**](docs/DomainRestrictionsForCollaborationsApi.md#removeAllowedDomainEntry) | **DELETE** /collaboration_whitelist_entries/{collaboration_whitelist_entry_id} | Remove domain from list of allowed collaboration domains
*DownloadsApi* | [**fileContentGet**](docs/DownloadsApi.md#fileContentGet) | **GET** /files/{file_id}/content | Download file
*EmailAliasesApi* | [**createNewAlias**](docs/EmailAliasesApi.md#createNewAlias) | **POST** /users/{user_id}/email_aliases | Create email alias
*EmailAliasesApi* | [**listUserEmailAliases**](docs/EmailAliasesApi.md#listUserEmailAliases) | **GET** /users/{user_id}/email_aliases | List user&#39;s email aliases
*EmailAliasesApi* | [**removeAlias**](docs/EmailAliasesApi.md#removeAlias) | **DELETE** /users/{user_id}/email_aliases/{email_alias_id} | Remove email alias
*EventsApi* | [**events**](docs/EventsApi.md#events) | **GET** /events | List user and enterprise events
*EventsApi* | [**events_0**](docs/EventsApi.md#events_0) | **OPTIONS** /events | Get events long poll endpoint
*FileRequestsApi* | [**copyRequestToFolder**](docs/FileRequestsApi.md#copyRequestToFolder) | **POST** /file_requests/{file_request_id}/copy | Copy file request
*FileRequestsApi* | [**deletePermanently**](docs/FileRequestsApi.md#deletePermanently) | **DELETE** /file_requests/{file_request_id} | Delete file request
*FileRequestsApi* | [**getInformation**](docs/FileRequestsApi.md#getInformation) | **GET** /file_requests/{file_request_id} | Get file request
*FileRequestsApi* | [**updateRequest**](docs/FileRequestsApi.md#updateRequest) | **PUT** /file_requests/{file_request_id} | Update file request
*FileVersionLegalHoldsApi* | [**getFileVersionLegalHoldInfo**](docs/FileVersionLegalHoldsApi.md#getFileVersionLegalHoldInfo) | **GET** /file_version_legal_holds/{file_version_legal_hold_id} | Get file version legal hold
*FileVersionLegalHoldsApi* | [**listFileVersionLegalHolds**](docs/FileVersionLegalHoldsApi.md#listFileVersionLegalHolds) | **GET** /file_version_legal_holds | List file version legal holds
*FileVersionRetentionsApi* | [**getFileVersionRetentionInfo**](docs/FileVersionRetentionsApi.md#getFileVersionRetentionInfo) | **GET** /file_version_retentions/{file_version_retention_id} | Get retention on file
*FileVersionRetentionsApi* | [**listRetentions**](docs/FileVersionRetentionsApi.md#listRetentions) | **GET** /file_version_retentions | List file version retentions
*FileVersionsApi* | [**getSpecificVersion**](docs/FileVersionsApi.md#getSpecificVersion) | **GET** /files/{file_id}/versions/{file_version_id} | Get file version
*FileVersionsApi* | [**listAllVersions**](docs/FileVersionsApi.md#listAllVersions) | **GET** /files/{file_id}/versions | List all file versions
*FileVersionsApi* | [**moveToTrash**](docs/FileVersionsApi.md#moveToTrash) | **DELETE** /files/{file_id}/versions/{file_version_id} | Remove file version
*FileVersionsApi* | [**promoteFileVersion**](docs/FileVersionsApi.md#promoteFileVersion) | **POST** /files/{file_id}/versions/current | Promote file version
*FileVersionsApi* | [**restoreVersion**](docs/FileVersionsApi.md#restoreVersion) | **PUT** /files/{file_id}/versions/{file_version_id} | Restore file version
*FilesApi* | [**createCopy**](docs/FilesApi.md#createCopy) | **POST** /files/{file_id}/copy | Copy file
*FilesApi* | [**deleteFile**](docs/FilesApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete file
*FilesApi* | [**getDetails**](docs/FilesApi.md#getDetails) | **GET** /files/{file_id} | Get file information
*FilesApi* | [**getThumbnail**](docs/FilesApi.md#getThumbnail) | **GET** /files/{file_id}/thumbnail.{extension} | Get file thumbnail
*FilesApi* | [**preflightCheckBeforeUpload**](docs/FilesApi.md#preflightCheckBeforeUpload) | **OPTIONS** /files/content | Preflight check before upload
*FilesApi* | [**updateFile**](docs/FilesApi.md#updateFile) | **PUT** /files/{file_id} | Update file
*FolderLocksApi* | [**create**](docs/FolderLocksApi.md#create) | **POST** /folder_locks | Create folder lock
*FolderLocksApi* | [**deleteFolderLock**](docs/FolderLocksApi.md#deleteFolderLock) | **DELETE** /folder_locks/{folder_lock_id} | Delete folder lock
*FolderLocksApi* | [**listDetails**](docs/FolderLocksApi.md#listDetails) | **GET** /folder_locks | List folder locks
*FoldersApi* | [**createCopy**](docs/FoldersApi.md#createCopy) | **POST** /folders/{folder_id}/copy | Copy folder
*FoldersApi* | [**deleteById**](docs/FoldersApi.md#deleteById) | **DELETE** /folders/{folder_id} | Delete folder
*FoldersApi* | [**folders**](docs/FoldersApi.md#folders) | **POST** /folders | Create folder
*FoldersApi* | [**getFolderDetails**](docs/FoldersApi.md#getFolderDetails) | **GET** /folders/{folder_id} | Get folder information
*FoldersApi* | [**listItemsInFolder**](docs/FoldersApi.md#listItemsInFolder) | **GET** /folders/{folder_id}/items | List items in folder
*FoldersApi* | [**updateFolder**](docs/FoldersApi.md#updateFolder) | **PUT** /folders/{folder_id} | Update folder
*GroupMembershipsApi* | [**createMembership**](docs/GroupMembershipsApi.md#createMembership) | **POST** /group_memberships | Add user to group
*GroupMembershipsApi* | [**getAll**](docs/GroupMembershipsApi.md#getAll) | **GET** /users/{user_id}/memberships | List user&#39;s groups
*GroupMembershipsApi* | [**getSpecificMembership**](docs/GroupMembershipsApi.md#getSpecificMembership) | **GET** /group_memberships/{group_membership_id} | Get group membership
*GroupMembershipsApi* | [**listMembersOfGroup**](docs/GroupMembershipsApi.md#listMembersOfGroup) | **GET** /groups/{group_id}/memberships | List members of group
*GroupMembershipsApi* | [**removeUserFromGroup**](docs/GroupMembershipsApi.md#removeUserFromGroup) | **DELETE** /group_memberships/{group_membership_id} | Remove user from group
*GroupMembershipsApi* | [**updateMembership**](docs/GroupMembershipsApi.md#updateMembership) | **PUT** /group_memberships/{group_membership_id} | Update group membership
*GroupsApi* | [**getInfo**](docs/GroupsApi.md#getInfo) | **GET** /groups/{group_id} | Get group
*GroupsApi* | [**groups**](docs/GroupsApi.md#groups) | **GET** /groups | List groups for enterprise
*GroupsApi* | [**groups_0**](docs/GroupsApi.md#groups_0) | **POST** /groups | Create group
*GroupsApi* | [**remove**](docs/GroupsApi.md#remove) | **DELETE** /groups/{group_id} | Remove group
*GroupsApi* | [**updateGroup**](docs/GroupsApi.md#updateGroup) | **PUT** /groups/{group_id} | Update group
*IntegrationMappingsApi* | [**createSlackMapping**](docs/IntegrationMappingsApi.md#createSlackMapping) | **POST** /integration_mappings/slack | Create Slack integration mapping
*IntegrationMappingsApi* | [**deleteSlackMapping**](docs/IntegrationMappingsApi.md#deleteSlackMapping) | **DELETE** /integration_mappings/slack/{integration_mapping_id} | Delete Slack integration mapping
*IntegrationMappingsApi* | [**listSlackMappings**](docs/IntegrationMappingsApi.md#listSlackMappings) | **GET** /integration_mappings/slack | List Slack integration mappings
*IntegrationMappingsApi* | [**updateSlackMapping**](docs/IntegrationMappingsApi.md#updateSlackMapping) | **PUT** /integration_mappings/slack/{integration_mapping_id} | Update Slack integration mapping
*InvitesApi* | [**getUserInviteStatus**](docs/InvitesApi.md#getUserInviteStatus) | **GET** /invites/{invite_id} | Get user invite status
*InvitesApi* | [**invites**](docs/InvitesApi.md#invites) | **POST** /invites | Create user invite
*LegalHoldPoliciesApi* | [**createNewPolicy**](docs/LegalHoldPoliciesApi.md#createNewPolicy) | **POST** /legal_hold_policies | Create legal hold policy
*LegalHoldPoliciesApi* | [**getPolicy**](docs/LegalHoldPoliciesApi.md#getPolicy) | **GET** /legal_hold_policies/{legal_hold_policy_id} | Get legal hold policy
*LegalHoldPoliciesApi* | [**listAll**](docs/LegalHoldPoliciesApi.md#listAll) | **GET** /legal_hold_policies | List all legal hold policies
*LegalHoldPoliciesApi* | [**removePolicy**](docs/LegalHoldPoliciesApi.md#removePolicy) | **DELETE** /legal_hold_policies/{legal_hold_policy_id} | Remove legal hold policy
*LegalHoldPoliciesApi* | [**updatePolicy**](docs/LegalHoldPoliciesApi.md#updatePolicy) | **PUT** /legal_hold_policies/{legal_hold_policy_id} | Update legal hold policy
*LegalHoldPolicyAssignmentsApi* | [**assignFileLegalHold**](docs/LegalHoldPolicyAssignmentsApi.md#assignFileLegalHold) | **POST** /legal_hold_policy_assignments | Assign legal hold policy
*LegalHoldPolicyAssignmentsApi* | [**getAssignment**](docs/LegalHoldPolicyAssignmentsApi.md#getAssignment) | **GET** /legal_hold_policy_assignments/{legal_hold_policy_assignment_id} | Get legal hold policy assignment
*LegalHoldPolicyAssignmentsApi* | [**getListItems**](docs/LegalHoldPolicyAssignmentsApi.md#getListItems) | **GET** /legal_hold_policy_assignments | List legal hold policy assignments
*LegalHoldPolicyAssignmentsApi* | [**listFileVersions**](docs/LegalHoldPolicyAssignmentsApi.md#listFileVersions) | **GET** /legal_hold_policy_assignments/{legal_hold_policy_assignment_id}/files_on_hold | List current file versions for legal hold policy assignment
*LegalHoldPolicyAssignmentsApi* | [**listPreviousFileVersions**](docs/LegalHoldPolicyAssignmentsApi.md#listPreviousFileVersions) | **GET** /legal_hold_policy_assignments/{legal_hold_policy_assignment_id}/file_versions_on_hold | List previous file versions for legal hold policy assignment
*LegalHoldPolicyAssignmentsApi* | [**unassignPolicy**](docs/LegalHoldPolicyAssignmentsApi.md#unassignPolicy) | **DELETE** /legal_hold_policy_assignments/{legal_hold_policy_assignment_id} | Unassign legal hold policy
*MetadataCascadePoliciesApi* | [**applyToChildren**](docs/MetadataCascadePoliciesApi.md#applyToChildren) | **POST** /metadata_cascade_policies/{metadata_cascade_policy_id}/apply | Force-apply metadata cascade policy to folder
*MetadataCascadePoliciesApi* | [**createPolicy**](docs/MetadataCascadePoliciesApi.md#createPolicy) | **POST** /metadata_cascade_policies | Create metadata cascade policy
*MetadataCascadePoliciesApi* | [**getPolicyAssignedToFolder**](docs/MetadataCascadePoliciesApi.md#getPolicyAssignedToFolder) | **GET** /metadata_cascade_policies/{metadata_cascade_policy_id} | Get metadata cascade policy
*MetadataCascadePoliciesApi* | [**list**](docs/MetadataCascadePoliciesApi.md#list) | **GET** /metadata_cascade_policies | List metadata cascade policies
*MetadataCascadePoliciesApi* | [**removePolicy**](docs/MetadataCascadePoliciesApi.md#removePolicy) | **DELETE** /metadata_cascade_policies/{metadata_cascade_policy_id} | Remove metadata cascade policy
*MetadataInstancesFilesApi* | [**applyTemplate**](docs/MetadataInstancesFilesApi.md#applyTemplate) | **POST** /files/{file_id}/metadata/{scope}/{template_key} | Create metadata instance on file
*MetadataInstancesFilesApi* | [**getInstance**](docs/MetadataInstancesFilesApi.md#getInstance) | **GET** /files/{file_id}/metadata/{scope}/{template_key} | Get metadata instance on file
*MetadataInstancesFilesApi* | [**listFileMetadata**](docs/MetadataInstancesFilesApi.md#listFileMetadata) | **GET** /files/{file_id}/metadata | List metadata instances on file
*MetadataInstancesFilesApi* | [**removeInstance**](docs/MetadataInstancesFilesApi.md#removeInstance) | **DELETE** /files/{file_id}/metadata/{scope}/{template_key} | Remove metadata instance from file
*MetadataInstancesFilesApi* | [**updateInstanceOnFile**](docs/MetadataInstancesFilesApi.md#updateInstanceOnFile) | **PUT** /files/{file_id}/metadata/{scope}/{template_key} | Update metadata instance on file
*MetadataInstancesFoldersApi* | [**applyTemplate**](docs/MetadataInstancesFoldersApi.md#applyTemplate) | **POST** /folders/{folder_id}/metadata/{scope}/{template_key} | Create metadata instance on folder
*MetadataInstancesFoldersApi* | [**getFolderMetadataInstance**](docs/MetadataInstancesFoldersApi.md#getFolderMetadataInstance) | **GET** /folders/{folder_id}/metadata/{scope}/{template_key} | Get metadata instance on folder
*MetadataInstancesFoldersApi* | [**listOnFolder**](docs/MetadataInstancesFoldersApi.md#listOnFolder) | **GET** /folders/{folder_id}/metadata | List metadata instances on folder
*MetadataInstancesFoldersApi* | [**removeInstance**](docs/MetadataInstancesFoldersApi.md#removeInstance) | **DELETE** /folders/{folder_id}/metadata/{scope}/{template_key} | Remove metadata instance from folder
*MetadataInstancesFoldersApi* | [**updateInstanceOnFolder**](docs/MetadataInstancesFoldersApi.md#updateInstanceOnFolder) | **PUT** /folders/{folder_id}/metadata/{scope}/{template_key} | Update metadata instance on folder
*MetadataTemplatesApi* | [**createNewTemplate**](docs/MetadataTemplatesApi.md#createNewTemplate) | **POST** /metadata_templates/schema | Create metadata template
*MetadataTemplatesApi* | [**deleteSchema**](docs/MetadataTemplatesApi.md#deleteSchema) | **DELETE** /metadata_templates/{scope}/{template_key}/schema | Remove metadata template
*MetadataTemplatesApi* | [**findByInstanceId**](docs/MetadataTemplatesApi.md#findByInstanceId) | **GET** /metadata_templates | Find metadata template by instance ID
*MetadataTemplatesApi* | [**getById**](docs/MetadataTemplatesApi.md#getById) | **GET** /metadata_templates/{template_id} | Get metadata template by ID
*MetadataTemplatesApi* | [**getByNameSchema**](docs/MetadataTemplatesApi.md#getByNameSchema) | **GET** /metadata_templates/{scope}/{template_key}/schema | Get metadata template by name
*MetadataTemplatesApi* | [**listForEnterprise**](docs/MetadataTemplatesApi.md#listForEnterprise) | **GET** /metadata_templates/enterprise | List all metadata templates for enterprise
*MetadataTemplatesApi* | [**listGlobal**](docs/MetadataTemplatesApi.md#listGlobal) | **GET** /metadata_templates/global | List all global metadata templates
*MetadataTemplatesApi* | [**updateSchema**](docs/MetadataTemplatesApi.md#updateSchema) | **PUT** /metadata_templates/{scope}/{template_key}/schema | Update metadata template
*RecentItemsApi* | [**listAccessedItems**](docs/RecentItemsApi.md#listAccessedItems) | **GET** /recent_items | List recently accessed items
*RetentionPoliciesApi* | [**createPolicy**](docs/RetentionPoliciesApi.md#createPolicy) | **POST** /retention_policies | Create retention policy
*RetentionPoliciesApi* | [**deletePolicy**](docs/RetentionPoliciesApi.md#deletePolicy) | **DELETE** /retention_policies/{retention_policy_id} | Delete retention policy
*RetentionPoliciesApi* | [**getPolicy**](docs/RetentionPoliciesApi.md#getPolicy) | **GET** /retention_policies/{retention_policy_id} | Get retention policy
*RetentionPoliciesApi* | [**listAll**](docs/RetentionPoliciesApi.md#listAll) | **GET** /retention_policies | List retention policies
*RetentionPoliciesApi* | [**updatePolicy**](docs/RetentionPoliciesApi.md#updatePolicy) | **PUT** /retention_policies/{retention_policy_id} | Update retention policy
*RetentionPolicyAssignmentsApi* | [**createRetentionAssignment**](docs/RetentionPolicyAssignmentsApi.md#createRetentionAssignment) | **POST** /retention_policy_assignments | Assign retention policy
*RetentionPolicyAssignmentsApi* | [**getAssignment**](docs/RetentionPolicyAssignmentsApi.md#getAssignment) | **GET** /retention_policy_assignments/{retention_policy_assignment_id} | Get retention policy assignment
*RetentionPolicyAssignmentsApi* | [**listAllAssignments**](docs/RetentionPolicyAssignmentsApi.md#listAllAssignments) | **GET** /retention_policies/{retention_policy_id}/assignments | List retention policy assignments
*RetentionPolicyAssignmentsApi* | [**listFileVersionsUnderRetention**](docs/RetentionPolicyAssignmentsApi.md#listFileVersionsUnderRetention) | **GET** /retention_policy_assignments/{retention_policy_assignment_id}/file_versions_under_retention | Get file versions under retention
*RetentionPolicyAssignmentsApi* | [**listFilesUnderRetention**](docs/RetentionPolicyAssignmentsApi.md#listFilesUnderRetention) | **GET** /retention_policy_assignments/{retention_policy_assignment_id}/files_under_retention | Get files under retention
*RetentionPolicyAssignmentsApi* | [**removeAssignment**](docs/RetentionPolicyAssignmentsApi.md#removeAssignment) | **DELETE** /retention_policy_assignments/{retention_policy_assignment_id} | Remove retention policy assignment
*SearchApi* | [**itemsByMetadata**](docs/SearchApi.md#itemsByMetadata) | **POST** /metadata_queries/execute_read | Query files/folders by metadata
*SearchApi* | [**search**](docs/SearchApi.md#search) | **GET** /search | Search for content
*SessionTerminationApi* | [**createSessionTerminationJobs**](docs/SessionTerminationApi.md#createSessionTerminationJobs) | **POST** /users/terminate_sessions | Create jobs to terminate users session
*SessionTerminationApi* | [**createTerminationJobs**](docs/SessionTerminationApi.md#createTerminationJobs) | **POST** /groups/terminate_sessions | Create jobs to terminate user group session
*SharedLinksFilesApi* | [**addSharedLinkToFile**](docs/SharedLinksFilesApi.md#addSharedLinkToFile) | **PUT** /files/{file_id}#add_shared_link | Add shared link to file
*SharedLinksFilesApi* | [**getBySharedLink**](docs/SharedLinksFilesApi.md#getBySharedLink) | **GET** /shared_items | Find file for shared link
*SharedLinksFilesApi* | [**getSharedLinkInfo**](docs/SharedLinksFilesApi.md#getSharedLinkInfo) | **GET** /files/{file_id}#get_shared_link | Get shared link for file
*SharedLinksFilesApi* | [**removeSharedLink**](docs/SharedLinksFilesApi.md#removeSharedLink) | **PUT** /files/{file_id}#remove_shared_link | Remove shared link from file
*SharedLinksFilesApi* | [**updateLinkOnFile**](docs/SharedLinksFilesApi.md#updateLinkOnFile) | **PUT** /files/{file_id}#update_shared_link | Update shared link on file
*SharedLinksFoldersApi* | [**addLinkToFolder**](docs/SharedLinksFoldersApi.md#addLinkToFolder) | **PUT** /folders/{folder_id}#add_shared_link | Add shared link to folder
*SharedLinksFoldersApi* | [**findFolderBySharedLink**](docs/SharedLinksFoldersApi.md#findFolderBySharedLink) | **GET** /shared_items#folders | Find folder for shared link
*SharedLinksFoldersApi* | [**getSharedLinkForFolder**](docs/SharedLinksFoldersApi.md#getSharedLinkForFolder) | **GET** /folders/{folder_id}#get_shared_link | Get shared link for folder
*SharedLinksFoldersApi* | [**removeFromFolder**](docs/SharedLinksFoldersApi.md#removeFromFolder) | **PUT** /folders/{folder_id}#remove_shared_link | Remove shared link from folder
*SharedLinksFoldersApi* | [**updateFolderSharedLink**](docs/SharedLinksFoldersApi.md#updateFolderSharedLink) | **PUT** /folders/{folder_id}#update_shared_link | Update shared link on folder
*SharedLinksWebLinksApi* | [**addLinkToWebLink**](docs/SharedLinksWebLinksApi.md#addLinkToWebLink) | **PUT** /web_links/{web_link_id}#add_shared_link | Add shared link to web link
*SharedLinksWebLinksApi* | [**findSharedWebLink**](docs/SharedLinksWebLinksApi.md#findSharedWebLink) | **GET** /shared_items#web_links | Find web link for shared link
*SharedLinksWebLinksApi* | [**getLinkInfo**](docs/SharedLinksWebLinksApi.md#getLinkInfo) | **GET** /web_links/{web_link_id}#get_shared_link | Get shared link for web link
*SharedLinksWebLinksApi* | [**removeSharedLink**](docs/SharedLinksWebLinksApi.md#removeSharedLink) | **PUT** /web_links/{web_link_id}#remove_shared_link | Remove shared link from web link
*SharedLinksWebLinksApi* | [**updateSharedLink**](docs/SharedLinksWebLinksApi.md#updateSharedLink) | **PUT** /web_links/{web_link_id}#update_shared_link | Update shared link on web link
*ShieldInformationBarrierReportsApi* | [**createReport**](docs/ShieldInformationBarrierReportsApi.md#createReport) | **POST** /shield_information_barrier_reports | Create shield information barrier report
*ShieldInformationBarrierReportsApi* | [**getById**](docs/ShieldInformationBarrierReportsApi.md#getById) | **GET** /shield_information_barrier_reports/{shield_information_barrier_report_id} | Get shield information barrier report by ID
*ShieldInformationBarrierReportsApi* | [**listReports**](docs/ShieldInformationBarrierReportsApi.md#listReports) | **GET** /shield_information_barrier_reports | List shield information barrier reports
*ShieldInformationBarrierSegmentMembersApi* | [**createNewMember**](docs/ShieldInformationBarrierSegmentMembersApi.md#createNewMember) | **POST** /shield_information_barrier_segment_members | Create shield information barrier segment member
*ShieldInformationBarrierSegmentMembersApi* | [**getById**](docs/ShieldInformationBarrierSegmentMembersApi.md#getById) | **GET** /shield_information_barrier_segment_members/{shield_information_barrier_segment_member_id} | Get shield information barrier segment member by ID
*ShieldInformationBarrierSegmentMembersApi* | [**listSegmentMembersBasedOnIds**](docs/ShieldInformationBarrierSegmentMembersApi.md#listSegmentMembersBasedOnIds) | **GET** /shield_information_barrier_segment_members | List shield information barrier segment members
*ShieldInformationBarrierSegmentMembersApi* | [**removeById**](docs/ShieldInformationBarrierSegmentMembersApi.md#removeById) | **DELETE** /shield_information_barrier_segment_members/{shield_information_barrier_segment_member_id} | Delete shield information barrier segment member by ID
*ShieldInformationBarrierSegmentRestrictionsApi* | [**createBarrierObject**](docs/ShieldInformationBarrierSegmentRestrictionsApi.md#createBarrierObject) | **POST** /shield_information_barrier_segment_restrictions | Create shield information barrier segment restriction
*ShieldInformationBarrierSegmentRestrictionsApi* | [**getById**](docs/ShieldInformationBarrierSegmentRestrictionsApi.md#getById) | **GET** /shield_information_barrier_segment_restrictions/{shield_information_barrier_segment_restriction_id} | Get shield information barrier segment restriction by ID
*ShieldInformationBarrierSegmentRestrictionsApi* | [**listBasedOnSegmentId**](docs/ShieldInformationBarrierSegmentRestrictionsApi.md#listBasedOnSegmentId) | **GET** /shield_information_barrier_segment_restrictions | List shield information barrier segment restrictions
*ShieldInformationBarrierSegmentRestrictionsApi* | [**removeById**](docs/ShieldInformationBarrierSegmentRestrictionsApi.md#removeById) | **DELETE** /shield_information_barrier_segment_restrictions/{shield_information_barrier_segment_restriction_id} | Delete shield information barrier segment restriction by ID
*ShieldInformationBarrierSegmentsApi* | [**createSegment**](docs/ShieldInformationBarrierSegmentsApi.md#createSegment) | **POST** /shield_information_barrier_segments | Create shield information barrier segment
*ShieldInformationBarrierSegmentsApi* | [**deleteSegmentById**](docs/ShieldInformationBarrierSegmentsApi.md#deleteSegmentById) | **DELETE** /shield_information_barrier_segments/{shield_information_barrier_segment_id} | Delete shield information barrier segment
*ShieldInformationBarrierSegmentsApi* | [**getById**](docs/ShieldInformationBarrierSegmentsApi.md#getById) | **GET** /shield_information_barrier_segments/{shield_information_barrier_segment_id} | Get shield information barrier segment with specified ID
*ShieldInformationBarrierSegmentsApi* | [**listInformationObjects**](docs/ShieldInformationBarrierSegmentsApi.md#listInformationObjects) | **GET** /shield_information_barrier_segments | List shield information barrier segments
*ShieldInformationBarrierSegmentsApi* | [**updateById**](docs/ShieldInformationBarrierSegmentsApi.md#updateById) | **PUT** /shield_information_barrier_segments/{shield_information_barrier_segment_id} | Update shield information barrier segment with specified ID
*ShieldInformationBarriersApi* | [**addChangedStatus**](docs/ShieldInformationBarriersApi.md#addChangedStatus) | **POST** /shield_information_barriers/change_status | Add changed status of shield information barrier with specified ID
*ShieldInformationBarriersApi* | [**createBarrier**](docs/ShieldInformationBarriersApi.md#createBarrier) | **POST** /shield_information_barriers | Create shield information barrier
*ShieldInformationBarriersApi* | [**getById**](docs/ShieldInformationBarriersApi.md#getById) | **GET** /shield_information_barriers/{shield_information_barrier_id} | Get shield information barrier with specified ID
*ShieldInformationBarriersApi* | [**listInformationObjects**](docs/ShieldInformationBarriersApi.md#listInformationObjects) | **GET** /shield_information_barriers | List shield information barriers
*SignRequestsApi* | [**cancelRequest**](docs/SignRequestsApi.md#cancelRequest) | **POST** /sign_requests/{sign_request_id}/cancel | Cancel sign request
*SignRequestsApi* | [**createRequest**](docs/SignRequestsApi.md#createRequest) | **POST** /sign_requests | Create sign request
*SignRequestsApi* | [**getById**](docs/SignRequestsApi.md#getById) | **GET** /sign_requests/{sign_request_id} | Get sign request by ID
*SignRequestsApi* | [**list**](docs/SignRequestsApi.md#list) | **GET** /sign_requests | List sign requests
*SignRequestsApi* | [**resendSignRequestEmails**](docs/SignRequestsApi.md#resendSignRequestEmails) | **POST** /sign_requests/{sign_request_id}/resend | Resend sign request
*SignTemplatesApi* | [**getDetails**](docs/SignTemplatesApi.md#getDetails) | **GET** /sign_templates/{template_id} | Get Box Sign template by ID
*SignTemplatesApi* | [**listTemplates**](docs/SignTemplatesApi.md#listTemplates) | **GET** /sign_templates | List Box Sign templates
*SkillsApi* | [**applyBoxSkillCards**](docs/SkillsApi.md#applyBoxSkillCards) | **POST** /files/{file_id}/metadata/global/boxSkillsCards | Create Box Skill cards on file
*SkillsApi* | [**listBoxSkillCards**](docs/SkillsApi.md#listBoxSkillCards) | **GET** /files/{file_id}/metadata/global/boxSkillsCards | List Box Skill cards on file
*SkillsApi* | [**removeBoxSkillCards**](docs/SkillsApi.md#removeBoxSkillCards) | **DELETE** /files/{file_id}/metadata/global/boxSkillsCards | Remove Box Skill cards from file
*SkillsApi* | [**updateAllBoxSkillCards**](docs/SkillsApi.md#updateAllBoxSkillCards) | **PUT** /skill_invocations/{skill_id} | Update all Box Skill cards on file
*SkillsApi* | [**updateBoxSkillCardsOnFile**](docs/SkillsApi.md#updateBoxSkillCardsOnFile) | **PUT** /files/{file_id}/metadata/global/boxSkillsCards | Update Box Skill cards on file
*StandardAndZonesStoragePoliciesApi* | [**getSpecific**](docs/StandardAndZonesStoragePoliciesApi.md#getSpecific) | **GET** /storage_policies/{storage_policy_id} | Get storage policy
*StandardAndZonesStoragePoliciesApi* | [**listPolicies**](docs/StandardAndZonesStoragePoliciesApi.md#listPolicies) | **GET** /storage_policies | List storage policies
*StandardAndZonesStoragePolicyAssignmentsApi* | [**createAssignment**](docs/StandardAndZonesStoragePolicyAssignmentsApi.md#createAssignment) | **POST** /storage_policy_assignments | Assign storage policy
*StandardAndZonesStoragePolicyAssignmentsApi* | [**getSpecificAssignment**](docs/StandardAndZonesStoragePolicyAssignmentsApi.md#getSpecificAssignment) | **GET** /storage_policy_assignments/{storage_policy_assignment_id} | Get storage policy assignment
*StandardAndZonesStoragePolicyAssignmentsApi* | [**listAssignments**](docs/StandardAndZonesStoragePolicyAssignmentsApi.md#listAssignments) | **GET** /storage_policy_assignments | List storage policy assignments
*StandardAndZonesStoragePolicyAssignmentsApi* | [**unassignStoragePolicy**](docs/StandardAndZonesStoragePolicyAssignmentsApi.md#unassignStoragePolicy) | **DELETE** /storage_policy_assignments/{storage_policy_assignment_id} | Unassign storage policy
*StandardAndZonesStoragePolicyAssignmentsApi* | [**updateSpecificAssignment**](docs/StandardAndZonesStoragePolicyAssignmentsApi.md#updateSpecificAssignment) | **PUT** /storage_policy_assignments/{storage_policy_assignment_id} | Update storage policy assignment
*TaskAssignmentsApi* | [**assignMultipleUsers**](docs/TaskAssignmentsApi.md#assignMultipleUsers) | **POST** /task_assignments | Assign task
*TaskAssignmentsApi* | [**deleteSpecificAssignment**](docs/TaskAssignmentsApi.md#deleteSpecificAssignment) | **DELETE** /task_assignments/{task_assignment_id} | Unassign task
*TaskAssignmentsApi* | [**getTaskAssignmentInfo**](docs/TaskAssignmentsApi.md#getTaskAssignmentInfo) | **GET** /task_assignments/{task_assignment_id} | Get task assignment
*TaskAssignmentsApi* | [**listForTask**](docs/TaskAssignmentsApi.md#listForTask) | **GET** /tasks/{task_id}/assignments | List task assignments
*TaskAssignmentsApi* | [**updateStateAssignedToUser**](docs/TaskAssignmentsApi.md#updateStateAssignedToUser) | **PUT** /task_assignments/{task_assignment_id} | Update task assignment
*TasksApi* | [**getInfo**](docs/TasksApi.md#getInfo) | **GET** /tasks/{task_id} | Get task
*TasksApi* | [**listOnFile**](docs/TasksApi.md#listOnFile) | **GET** /files/{file_id}/tasks | List tasks on file
*TasksApi* | [**removeFile**](docs/TasksApi.md#removeFile) | **DELETE** /tasks/{task_id} | Remove task
*TasksApi* | [**tasks**](docs/TasksApi.md#tasks) | **POST** /tasks | Create task
*TasksApi* | [**updateTaskConfiguration**](docs/TasksApi.md#updateTaskConfiguration) | **PUT** /tasks/{task_id} | Update task
*TermsOfServiceApi* | [**createForEnterpriseAndType**](docs/TermsOfServiceApi.md#createForEnterpriseAndType) | **POST** /terms_of_services | Create terms of service
*TermsOfServiceApi* | [**getSettings**](docs/TermsOfServiceApi.md#getSettings) | **GET** /terms_of_services | List terms of services
*TermsOfServiceApi* | [**getSpecific**](docs/TermsOfServiceApi.md#getSpecific) | **GET** /terms_of_services/{terms_of_service_id} | Get terms of service
*TermsOfServiceApi* | [**updateSpecificTerm**](docs/TermsOfServiceApi.md#updateSpecificTerm) | **PUT** /terms_of_services/{terms_of_service_id} | Update terms of service
*TermsOfServiceUserStatusesApi* | [**createUserStatus**](docs/TermsOfServiceUserStatusesApi.md#createUserStatus) | **POST** /terms_of_service_user_statuses | Create terms of service status for new user
*TermsOfServiceUserStatusesApi* | [**listUserStatuses**](docs/TermsOfServiceUserStatusesApi.md#listUserStatuses) | **GET** /terms_of_service_user_statuses | List terms of service user statuses
*TermsOfServiceUserStatusesApi* | [**updateUserStatus**](docs/TermsOfServiceUserStatusesApi.md#updateUserStatus) | **PUT** /terms_of_service_user_statuses/{terms_of_service_user_status_id} | Update terms of service status for existing user
*TransferFoldersApi* | [**toDestination**](docs/TransferFoldersApi.md#toDestination) | **PUT** /users/{user_id}/folders/0 | Transfer owned folders
*TrashedFilesApi* | [**getFile**](docs/TrashedFilesApi.md#getFile) | **GET** /files/{file_id}/trash | Get trashed file
*TrashedFilesApi* | [**permanentlyRemoveFile**](docs/TrashedFilesApi.md#permanentlyRemoveFile) | **DELETE** /files/{file_id}/trash | Permanently remove file
*TrashedFilesApi* | [**restoreFile**](docs/TrashedFilesApi.md#restoreFile) | **POST** /files/{file_id} | Restore file
*TrashedFoldersApi* | [**getdFolder**](docs/TrashedFoldersApi.md#getdFolder) | **GET** /folders/{folder_id}/trash | Get trashed folder
*TrashedFoldersApi* | [**permanentlyRemoveFolder**](docs/TrashedFoldersApi.md#permanentlyRemoveFolder) | **DELETE** /folders/{folder_id}/trash | Permanently remove folder
*TrashedFoldersApi* | [**restoreFolder**](docs/TrashedFoldersApi.md#restoreFolder) | **POST** /folders/{folder_id} | Restore folder
*TrashedItemsApi* | [**listRetrievedItems**](docs/TrashedItemsApi.md#listRetrievedItems) | **GET** /folders/trash/items | List trashed items
*TrashedWebLinksApi* | [**getTrashedLink**](docs/TrashedWebLinksApi.md#getTrashedLink) | **GET** /web_links/{web_link_id}/trash | Get trashed web link
*TrashedWebLinksApi* | [**permanentlyRemove**](docs/TrashedWebLinksApi.md#permanentlyRemove) | **DELETE** /web_links/{web_link_id}/trash | Permanently remove web link
*TrashedWebLinksApi* | [**restoreWebLink**](docs/TrashedWebLinksApi.md#restoreWebLink) | **POST** /web_links/{web_link_id} | Restore web link
*UploadsApi* | [**fileContentUpdate**](docs/UploadsApi.md#fileContentUpdate) | **POST** /files/{file_id}/content | Upload file version
*UploadsApi* | [**smallFile**](docs/UploadsApi.md#smallFile) | **POST** /files/content | Upload file
*UploadsChunkedApi* | [**commitSession**](docs/UploadsChunkedApi.md#commitSession) | **POST** /files/upload_sessions/{upload_session_id}/commit | Commit upload session
*UploadsChunkedApi* | [**createSessionForUpload**](docs/UploadsChunkedApi.md#createSessionForUpload) | **POST** /files/upload_sessions | Create upload session
*UploadsChunkedApi* | [**createSessionForUpload_0**](docs/UploadsChunkedApi.md#createSessionForUpload_0) | **POST** /files/{file_id}/upload_sessions | Create upload session for existing file
*UploadsChunkedApi* | [**filePartUpdate**](docs/UploadsChunkedApi.md#filePartUpdate) | **PUT** /files/upload_sessions/{upload_session_id} | Upload part of file
*UploadsChunkedApi* | [**info**](docs/UploadsChunkedApi.md#info) | **GET** /files/upload_sessions/{upload_session_id} | Get upload session
*UploadsChunkedApi* | [**listParts**](docs/UploadsChunkedApi.md#listParts) | **GET** /files/upload_sessions/{upload_session_id}/parts | List parts
*UploadsChunkedApi* | [**removeUploadSession**](docs/UploadsChunkedApi.md#removeUploadSession) | **DELETE** /files/upload_sessions/{upload_session_id} | Remove upload session
*UserAvatarsApi* | [**addOrUpdateImage**](docs/UserAvatarsApi.md#addOrUpdateImage) | **POST** /users/{user_id}/avatar | Add or update user avatar
*UserAvatarsApi* | [**getImage**](docs/UserAvatarsApi.md#getImage) | **GET** /users/{user_id}/avatar | Get user avatar
*UserAvatarsApi* | [**removeExisting**](docs/UserAvatarsApi.md#removeExisting) | **DELETE** /users/{user_id}/avatar | Delete user avatar
*UsersApi* | [**deleteUser**](docs/UsersApi.md#deleteUser) | **DELETE** /users/{user_id} | Delete user
*UsersApi* | [**getCurrentUser**](docs/UsersApi.md#getCurrentUser) | **GET** /users/me | Get current user
*UsersApi* | [**getUserInfo**](docs/UsersApi.md#getUserInfo) | **GET** /users/{user_id} | Get user
*UsersApi* | [**updateManagedUser**](docs/UsersApi.md#updateManagedUser) | **PUT** /users/{user_id} | Update user
*UsersApi* | [**users**](docs/UsersApi.md#users) | **GET** /users | List enterprise users
*UsersApi* | [**users_0**](docs/UsersApi.md#users_0) | **POST** /users | Create user
*WatermarksFilesApi* | [**applyWatermarkToFile**](docs/WatermarksFilesApi.md#applyWatermarkToFile) | **PUT** /files/{file_id}/watermark | Apply watermark to file
*WatermarksFilesApi* | [**get**](docs/WatermarksFilesApi.md#get) | **GET** /files/{file_id}/watermark | Get watermark on file
*WatermarksFilesApi* | [**removeWatermark**](docs/WatermarksFilesApi.md#removeWatermark) | **DELETE** /files/{file_id}/watermark | Remove watermark from file
*WatermarksFoldersApi* | [**applyToFolder**](docs/WatermarksFoldersApi.md#applyToFolder) | **PUT** /folders/{folder_id}/watermark | Apply watermark to folder
*WatermarksFoldersApi* | [**getFolderWatermark**](docs/WatermarksFoldersApi.md#getFolderWatermark) | **GET** /folders/{folder_id}/watermark | Get watermark for folder
*WatermarksFoldersApi* | [**removeFolderWatermark**](docs/WatermarksFoldersApi.md#removeFolderWatermark) | **DELETE** /folders/{folder_id}/watermark | Remove watermark from folder
*WebLinksApi* | [**createObject**](docs/WebLinksApi.md#createObject) | **POST** /web_links | Create web link
*WebLinksApi* | [**getInformation**](docs/WebLinksApi.md#getInformation) | **GET** /web_links/{web_link_id} | Get web link
*WebLinksApi* | [**removeLink**](docs/WebLinksApi.md#removeLink) | **DELETE** /web_links/{web_link_id} | Remove web link
*WebLinksApi* | [**updateObject**](docs/WebLinksApi.md#updateObject) | **PUT** /web_links/{web_link_id} | Update web link
*WebhooksApi* | [**getSpecificWebhook**](docs/WebhooksApi.md#getSpecificWebhook) | **GET** /webhooks/{webhook_id} | Get webhook
*WebhooksApi* | [**remove**](docs/WebhooksApi.md#remove) | **DELETE** /webhooks/{webhook_id} | Remove webhook
*WebhooksApi* | [**updateWebhook**](docs/WebhooksApi.md#updateWebhook) | **PUT** /webhooks/{webhook_id} | Update webhook
*WebhooksApi* | [**webhooks**](docs/WebhooksApi.md#webhooks) | **GET** /webhooks | List all webhooks
*WebhooksApi* | [**webhooks_0**](docs/WebhooksApi.md#webhooks_0) | **POST** /webhooks | Create webhook
*WorkflowsApi* | [**startBasedOnRequest**](docs/WorkflowsApi.md#startBasedOnRequest) | **POST** /workflows/{workflow_id}/start | Starts workflow based on request body
*WorkflowsApi* | [**workflows**](docs/WorkflowsApi.md#workflows) | **GET** /workflows | List workflows
*ZipDownloadsApi* | [**createRequest**](docs/ZipDownloadsApi.md#createRequest) | **POST** /zip_downloads | Create zip download
*ZipDownloadsApi* | [**getContentById**](docs/ZipDownloadsApi.md#getContentById) | **GET** /zip_downloads/{zip_download_id}/content | Download zip archive
*ZipDownloadsApi* | [**getStatus**](docs/ZipDownloadsApi.md#getStatus) | **GET** /zip_downloads/{zip_download_id}/status | Get zip download status


## Documentation for Models

 - [AMetadataInstanceUpdateOperation](docs/AMetadataInstanceUpdateOperation.md)
 - [AMetadataInstanceUpdateOperation1](docs/AMetadataInstanceUpdateOperation1.md)
 - [AMetadataTemplateUpdateOperation](docs/AMetadataTemplateUpdateOperation.md)
 - [AccessToken](docs/AccessToken.md)
 - [Classification](docs/Classification.md)
 - [ClassificationTemplate](docs/ClassificationTemplate.md)
 - [ClassificationTemplateFieldsInner](docs/ClassificationTemplateFieldsInner.md)
 - [ClassificationTemplateFieldsInnerOptionsInner](docs/ClassificationTemplateFieldsInnerOptionsInner.md)
 - [ClassificationTemplateFieldsInnerOptionsInnerStaticConfig](docs/ClassificationTemplateFieldsInnerOptionsInnerStaticConfig.md)
 - [ClassificationTemplateFieldsInnerOptionsInnerStaticConfigClassification](docs/ClassificationTemplateFieldsInnerOptionsInnerStaticConfigClassification.md)
 - [ClassificationsAddNewClassificationsRequestInner](docs/ClassificationsAddNewClassificationsRequestInner.md)
 - [ClassificationsAddNewClassificationsRequestInnerData](docs/ClassificationsAddNewClassificationsRequestInnerData.md)
 - [ClassificationsAddNewClassificationsRequestInnerDataStaticConfig](docs/ClassificationsAddNewClassificationsRequestInnerDataStaticConfig.md)
 - [ClassificationsAddNewClassificationsRequestInnerDataStaticConfigClassification](docs/ClassificationsAddNewClassificationsRequestInnerDataStaticConfigClassification.md)
 - [ClassificationsInitializeTemplateRequest](docs/ClassificationsInitializeTemplateRequest.md)
 - [ClassificationsInitializeTemplateRequestFieldsInner](docs/ClassificationsInitializeTemplateRequestFieldsInner.md)
 - [ClassificationsInitializeTemplateRequestFieldsInnerOptionsInner](docs/ClassificationsInitializeTemplateRequestFieldsInnerOptionsInner.md)
 - [ClassificationsInitializeTemplateRequestFieldsInnerOptionsInnerStaticConfig](docs/ClassificationsInitializeTemplateRequestFieldsInnerOptionsInnerStaticConfig.md)
 - [ClassificationsInitializeTemplateRequestFieldsInnerOptionsInnerStaticConfigClassification](docs/ClassificationsInitializeTemplateRequestFieldsInnerOptionsInnerStaticConfigClassification.md)
 - [ClassificationsOnFilesAddClassificationRequest](docs/ClassificationsOnFilesAddClassificationRequest.md)
 - [ClassificationsOnFilesUpdateClassificationMetadataInstanceRequestInner](docs/ClassificationsOnFilesUpdateClassificationMetadataInstanceRequestInner.md)
 - [ClassificationsOnFoldersAddClassificationToFolderRequest](docs/ClassificationsOnFoldersAddClassificationToFolderRequest.md)
 - [ClassificationsOnFoldersUpdateClassificationRequestInner](docs/ClassificationsOnFoldersUpdateClassificationRequestInner.md)
 - [ClassificationsUpdateLabelsDescriptionsRequestInner](docs/ClassificationsUpdateLabelsDescriptionsRequestInner.md)
 - [ClassificationsUpdateLabelsDescriptionsRequestInnerData](docs/ClassificationsUpdateLabelsDescriptionsRequestInnerData.md)
 - [ClassificationsUpdateLabelsDescriptionsRequestInnerDataStaticConfig](docs/ClassificationsUpdateLabelsDescriptionsRequestInnerDataStaticConfig.md)
 - [ClassificationsUpdateLabelsDescriptionsRequestInnerDataStaticConfigClassification](docs/ClassificationsUpdateLabelsDescriptionsRequestInnerDataStaticConfigClassification.md)
 - [ClientError](docs/ClientError.md)
 - [ClientErrorContextInfo](docs/ClientErrorContextInfo.md)
 - [Collaboration](docs/Collaboration.md)
 - [CollaborationAcceptanceRequirementsStatus](docs/CollaborationAcceptanceRequirementsStatus.md)
 - [CollaborationAcceptanceRequirementsStatusStrongPasswordRequirement](docs/CollaborationAcceptanceRequirementsStatusStrongPasswordRequirement.md)
 - [CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirement](docs/CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirement.md)
 - [CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementTermsOfService](docs/CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirementTermsOfService.md)
 - [CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirement](docs/CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirement.md)
 - [CollaborationAccessibleBy](docs/CollaborationAccessibleBy.md)
 - [CollaborationAccessibleByAllOf](docs/CollaborationAccessibleByAllOf.md)
 - [CollaborationAllowlistEntries](docs/CollaborationAllowlistEntries.md)
 - [CollaborationAllowlistEntriesAllOf](docs/CollaborationAllowlistEntriesAllOf.md)
 - [CollaborationAllowlistEntriesAllOf1](docs/CollaborationAllowlistEntriesAllOf1.md)
 - [CollaborationAllowlistEntry](docs/CollaborationAllowlistEntry.md)
 - [CollaborationAllowlistEntryEnterprise](docs/CollaborationAllowlistEntryEnterprise.md)
 - [CollaborationAllowlistExemptTarget](docs/CollaborationAllowlistExemptTarget.md)
 - [CollaborationAllowlistExemptTargetEnterprise](docs/CollaborationAllowlistExemptTargetEnterprise.md)
 - [CollaborationAllowlistExemptTargetUser](docs/CollaborationAllowlistExemptTargetUser.md)
 - [CollaborationAllowlistExemptTargets](docs/CollaborationAllowlistExemptTargets.md)
 - [CollaborationAllowlistExemptTargetsAllOf](docs/CollaborationAllowlistExemptTargetsAllOf.md)
 - [CollaborationAllowlistExemptTargetsAllOf1](docs/CollaborationAllowlistExemptTargetsAllOf1.md)
 - [CollaborationCreatedBy](docs/CollaborationCreatedBy.md)
 - [CollaborationItem](docs/CollaborationItem.md)
 - [CollaborationItemAllOf](docs/CollaborationItemAllOf.md)
 - [Collaborations](docs/Collaborations.md)
 - [CollaborationsAllOf](docs/CollaborationsAllOf.md)
 - [CollaborationsAllOf1](docs/CollaborationsAllOf1.md)
 - [CollaborationsAllOfOrder](docs/CollaborationsAllOfOrder.md)
 - [CollaborationsUpdateCollaborationRequest](docs/CollaborationsUpdateCollaborationRequest.md)
 - [CollaboratorVariable](docs/CollaboratorVariable.md)
 - [CollaboratorVariableVariableValueInner](docs/CollaboratorVariableVariableValueInner.md)
 - [Collection](docs/Collection.md)
 - [Collections](docs/Collections.md)
 - [CollectionsAllOf](docs/CollectionsAllOf.md)
 - [CollectionsAllOf1](docs/CollectionsAllOf1.md)
 - [CollectionsAllOfOrder](docs/CollectionsAllOfOrder.md)
 - [Comment](docs/Comment.md)
 - [CommentAllOf](docs/CommentAllOf.md)
 - [CommentBase](docs/CommentBase.md)
 - [CommentFull](docs/CommentFull.md)
 - [CommentFullAllOf](docs/CommentFullAllOf.md)
 - [Comments](docs/Comments.md)
 - [CommentsAllOf](docs/CommentsAllOf.md)
 - [CommentsAllOf1](docs/CommentsAllOf1.md)
 - [CommentsAllOfOrder](docs/CommentsAllOfOrder.md)
 - [CommentsUpdateMessageRequest](docs/CommentsUpdateMessageRequest.md)
 - [CompletionRuleVariable](docs/CompletionRuleVariable.md)
 - [DevicePinner](docs/DevicePinner.md)
 - [DevicePinnerOwnedBy](docs/DevicePinnerOwnedBy.md)
 - [DevicePinners](docs/DevicePinners.md)
 - [DevicePinnersOrderInner](docs/DevicePinnersOrderInner.md)
 - [DomainRestrictionsForCollaborationsAddAllowedDomainEntryRequest](docs/DomainRestrictionsForCollaborationsAddAllowedDomainEntryRequest.md)
 - [DomainRestrictionsUserExemptionsCreateUserExemptionFromCollaborationDomainRestrictionsRequest](docs/DomainRestrictionsUserExemptionsCreateUserExemptionFromCollaborationDomainRestrictionsRequest.md)
 - [DomainRestrictionsUserExemptionsCreateUserExemptionFromCollaborationDomainRestrictionsRequestUser](docs/DomainRestrictionsUserExemptionsCreateUserExemptionFromCollaborationDomainRestrictionsRequestUser.md)
 - [EmailAlias](docs/EmailAlias.md)
 - [EmailAliases](docs/EmailAliases.md)
 - [EmailAliasesCreateNewAliasRequest](docs/EmailAliasesCreateNewAliasRequest.md)
 - [Enterprise](docs/Enterprise.md)
 - [Enterprise1](docs/Enterprise1.md)
 - [Enterprise2](docs/Enterprise2.md)
 - [EnterpriseBase](docs/EnterpriseBase.md)
 - [EnterpriseProperty](docs/EnterpriseProperty.md)
 - [Event](docs/Event.md)
 - [EventCreatedBy](docs/EventCreatedBy.md)
 - [EventSource](docs/EventSource.md)
 - [EventSourceAllOf](docs/EventSourceAllOf.md)
 - [EventSourceClassification](docs/EventSourceClassification.md)
 - [EventSourceOwnedBy](docs/EventSourceOwnedBy.md)
 - [EventSourceParent](docs/EventSourceParent.md)
 - [Events](docs/Events.md)
 - [FileAllOf](docs/FileAllOf.md)
 - [FileBase](docs/FileBase.md)
 - [FileConflict](docs/FileConflict.md)
 - [FileConflictAllOf](docs/FileConflictAllOf.md)
 - [FileFull](docs/FileFull.md)
 - [FileFullAllOf](docs/FileFullAllOf.md)
 - [FileMini](docs/FileMini.md)
 - [FileMiniAllOf](docs/FileMiniAllOf.md)
 - [FileOrFolderScope](docs/FileOrFolderScope.md)
 - [FileOrFolderScopeObject](docs/FileOrFolderScopeObject.md)
 - [FileOrFolderScopeObjectAllOf](docs/FileOrFolderScopeObjectAllOf.md)
 - [FileRequest](docs/FileRequest.md)
 - [FileRequestCopyRequest](docs/FileRequestCopyRequest.md)
 - [FileRequestCopyRequestAllOf](docs/FileRequestCopyRequestAllOf.md)
 - [FileRequestCopyRequestAllOfFolder](docs/FileRequestCopyRequestAllOfFolder.md)
 - [FileRequestCreatedBy](docs/FileRequestCreatedBy.md)
 - [FileRequestFolder](docs/FileRequestFolder.md)
 - [FileRequestUpdateRequest](docs/FileRequestUpdateRequest.md)
 - [FileRequestUpdatedBy](docs/FileRequestUpdatedBy.md)
 - [FileVersion](docs/FileVersion.md)
 - [FileVersionAllOf](docs/FileVersionAllOf.md)
 - [FileVersionBase](docs/FileVersionBase.md)
 - [FileVersionFull](docs/FileVersionFull.md)
 - [FileVersionFullAllOf](docs/FileVersionFullAllOf.md)
 - [FileVersionLegalHold](docs/FileVersionLegalHold.md)
 - [FileVersionLegalHoldFile](docs/FileVersionLegalHoldFile.md)
 - [FileVersionLegalHoldFileVersion](docs/FileVersionLegalHoldFileVersion.md)
 - [FileVersionLegalHolds](docs/FileVersionLegalHolds.md)
 - [FileVersionLegalHoldsAllOf](docs/FileVersionLegalHoldsAllOf.md)
 - [FileVersionLegalHoldsAllOf1](docs/FileVersionLegalHoldsAllOf1.md)
 - [FileVersionMini](docs/FileVersionMini.md)
 - [FileVersionMiniAllOf](docs/FileVersionMiniAllOf.md)
 - [FileVersionRetention](docs/FileVersionRetention.md)
 - [FileVersionRetentionFile](docs/FileVersionRetentionFile.md)
 - [FileVersionRetentionFileVersion](docs/FileVersionRetentionFileVersion.md)
 - [FileVersionRetentionWinningRetentionPolicy](docs/FileVersionRetentionWinningRetentionPolicy.md)
 - [FileVersionRetentions](docs/FileVersionRetentions.md)
 - [FileVersionRetentionsAllOf](docs/FileVersionRetentionsAllOf.md)
 - [FileVersionRetentionsAllOf1](docs/FileVersionRetentionsAllOf1.md)
 - [FileVersions](docs/FileVersions.md)
 - [FileVersionsAllOf](docs/FileVersionsAllOf.md)
 - [FileVersionsAllOf1](docs/FileVersionsAllOf1.md)
 - [FileVersionsAllOfOrder](docs/FileVersionsAllOfOrder.md)
 - [FileVersionsPromoteFileVersionRequest](docs/FileVersionsPromoteFileVersionRequest.md)
 - [FileVersionsRestoreVersionRequest](docs/FileVersionsRestoreVersionRequest.md)
 - [Files](docs/Files.md)
 - [FilesCreateCopyRequest](docs/FilesCreateCopyRequest.md)
 - [FilesCreateCopyRequestParent](docs/FilesCreateCopyRequestParent.md)
 - [FilesPreflightCheckBeforeUploadRequest](docs/FilesPreflightCheckBeforeUploadRequest.md)
 - [FilesPreflightCheckBeforeUploadRequestParent](docs/FilesPreflightCheckBeforeUploadRequestParent.md)
 - [FilesPreflightCheckBeforeUploadRequestParentAllOf](docs/FilesPreflightCheckBeforeUploadRequestParentAllOf.md)
 - [FilesUnderRetention](docs/FilesUnderRetention.md)
 - [FilesUnderRetentionAllOf](docs/FilesUnderRetentionAllOf.md)
 - [FilesUnderRetentionAllOf1](docs/FilesUnderRetentionAllOf1.md)
 - [FilesUpdateFileRequest](docs/FilesUpdateFileRequest.md)
 - [FilesUpdateFileRequestLock](docs/FilesUpdateFileRequestLock.md)
 - [FilesUpdateFileRequestParent](docs/FilesUpdateFileRequestParent.md)
 - [FilesUpdateFileRequestParentAllOf](docs/FilesUpdateFileRequestParentAllOf.md)
 - [FilesUpdateFileRequestPermissions](docs/FilesUpdateFileRequestPermissions.md)
 - [FilesUpdateFileRequestSharedLink](docs/FilesUpdateFileRequestSharedLink.md)
 - [FilesUpdateFileRequestSharedLinkAllOf](docs/FilesUpdateFileRequestSharedLinkAllOf.md)
 - [FilesUpdateFileRequestSharedLinkAllOfPermissions](docs/FilesUpdateFileRequestSharedLinkAllOfPermissions.md)
 - [Folder](docs/Folder.md)
 - [FolderAllOf](docs/FolderAllOf.md)
 - [FolderAllOfFolderUploadEmail](docs/FolderAllOfFolderUploadEmail.md)
 - [FolderBase](docs/FolderBase.md)
 - [FolderFull](docs/FolderFull.md)
 - [FolderFullAllOf](docs/FolderFullAllOf.md)
 - [FolderLock](docs/FolderLock.md)
 - [FolderLockCreatedBy](docs/FolderLockCreatedBy.md)
 - [FolderLockFolder](docs/FolderLockFolder.md)
 - [FolderLockLockedOperations](docs/FolderLockLockedOperations.md)
 - [FolderLocks](docs/FolderLocks.md)
 - [FolderLocksCreateRequest](docs/FolderLocksCreateRequest.md)
 - [FolderLocksCreateRequestFolder](docs/FolderLocksCreateRequestFolder.md)
 - [FolderLocksCreateRequestLockedOperations](docs/FolderLocksCreateRequestLockedOperations.md)
 - [FolderMini](docs/FolderMini.md)
 - [FolderMiniAllOf](docs/FolderMiniAllOf.md)
 - [FolderUploadEmail](docs/FolderUploadEmail.md)
 - [FolderUploadEmail1](docs/FolderUploadEmail1.md)
 - [FoldersCreateCopyRequest](docs/FoldersCreateCopyRequest.md)
 - [FoldersCreateCopyRequestParent](docs/FoldersCreateCopyRequestParent.md)
 - [FoldersUpdateFolderRequest](docs/FoldersUpdateFolderRequest.md)
 - [FoldersUpdateFolderRequestFolderUploadEmail](docs/FoldersUpdateFolderRequestFolderUploadEmail.md)
 - [FoldersUpdateFolderRequestParent](docs/FoldersUpdateFolderRequestParent.md)
 - [FoldersUpdateFolderRequestSharedLink](docs/FoldersUpdateFolderRequestSharedLink.md)
 - [FoldersUpdateFolderRequestSharedLinkAllOf](docs/FoldersUpdateFolderRequestSharedLinkAllOf.md)
 - [FoldersUpdateFolderRequestSharedLinkAllOfPermissions](docs/FoldersUpdateFolderRequestSharedLinkAllOfPermissions.md)
 - [Group](docs/Group.md)
 - [GroupAllOf](docs/GroupAllOf.md)
 - [GroupBase](docs/GroupBase.md)
 - [GroupFull](docs/GroupFull.md)
 - [GroupFullAllOf](docs/GroupFullAllOf.md)
 - [GroupMembership](docs/GroupMembership.md)
 - [GroupMembershipGroup](docs/GroupMembershipGroup.md)
 - [GroupMembershipUser](docs/GroupMembershipUser.md)
 - [GroupMemberships](docs/GroupMemberships.md)
 - [GroupMembershipsAllOf](docs/GroupMembershipsAllOf.md)
 - [GroupMembershipsAllOf1](docs/GroupMembershipsAllOf1.md)
 - [GroupMembershipsAllOfOrder](docs/GroupMembershipsAllOfOrder.md)
 - [GroupMembershipsCreateMembershipRequest](docs/GroupMembershipsCreateMembershipRequest.md)
 - [GroupMembershipsCreateMembershipRequestGroup](docs/GroupMembershipsCreateMembershipRequestGroup.md)
 - [GroupMembershipsCreateMembershipRequestUser](docs/GroupMembershipsCreateMembershipRequestUser.md)
 - [GroupMembershipsUpdateMembershipRequest](docs/GroupMembershipsUpdateMembershipRequest.md)
 - [GroupMini](docs/GroupMini.md)
 - [GroupMiniAllOf](docs/GroupMiniAllOf.md)
 - [Groups](docs/Groups.md)
 - [GroupsAllOf](docs/GroupsAllOf.md)
 - [GroupsAllOf1](docs/GroupsAllOf1.md)
 - [GroupsAllOfOrder](docs/GroupsAllOfOrder.md)
 - [GroupsUpdateGroupRequest](docs/GroupsUpdateGroupRequest.md)
 - [IntegrationMapping](docs/IntegrationMapping.md)
 - [IntegrationMappingAllOf](docs/IntegrationMappingAllOf.md)
 - [IntegrationMappingBase](docs/IntegrationMappingBase.md)
 - [IntegrationMappingBoxItemSlack](docs/IntegrationMappingBoxItemSlack.md)
 - [IntegrationMappingMini](docs/IntegrationMappingMini.md)
 - [IntegrationMappingMiniAllOf](docs/IntegrationMappingMiniAllOf.md)
 - [IntegrationMappingPartnerItemSlack](docs/IntegrationMappingPartnerItemSlack.md)
 - [IntegrationMappingSlackCreateRequest](docs/IntegrationMappingSlackCreateRequest.md)
 - [IntegrationMappingSlackOptions](docs/IntegrationMappingSlackOptions.md)
 - [IntegrationMappings](docs/IntegrationMappings.md)
 - [IntegrationMappingsAllOf](docs/IntegrationMappingsAllOf.md)
 - [IntegrationMappingsAllOf1](docs/IntegrationMappingsAllOf1.md)
 - [IntegrationMappingsUpdateSlackMappingRequest](docs/IntegrationMappingsUpdateSlackMappingRequest.md)
 - [Invite](docs/Invite.md)
 - [Items](docs/Items.md)
 - [ItemsAllOf](docs/ItemsAllOf.md)
 - [ItemsAllOf1](docs/ItemsAllOf1.md)
 - [ItemsAllOfOrder](docs/ItemsAllOfOrder.md)
 - [KeywordSkillCard](docs/KeywordSkillCard.md)
 - [KeywordSkillCardEntriesInner](docs/KeywordSkillCardEntriesInner.md)
 - [KeywordSkillCardInvocation](docs/KeywordSkillCardInvocation.md)
 - [KeywordSkillCardSkill](docs/KeywordSkillCardSkill.md)
 - [KeywordSkillCardSkillCardTitle](docs/KeywordSkillCardSkillCardTitle.md)
 - [LegalHoldPolicies](docs/LegalHoldPolicies.md)
 - [LegalHoldPoliciesAllOf](docs/LegalHoldPoliciesAllOf.md)
 - [LegalHoldPoliciesAllOf1](docs/LegalHoldPoliciesAllOf1.md)
 - [LegalHoldPoliciesCreateNewPolicyRequest](docs/LegalHoldPoliciesCreateNewPolicyRequest.md)
 - [LegalHoldPoliciesUpdatePolicyRequest](docs/LegalHoldPoliciesUpdatePolicyRequest.md)
 - [LegalHoldPolicy](docs/LegalHoldPolicy.md)
 - [LegalHoldPolicyAllOf](docs/LegalHoldPolicyAllOf.md)
 - [LegalHoldPolicyAllOfAssignmentCounts](docs/LegalHoldPolicyAllOfAssignmentCounts.md)
 - [LegalHoldPolicyAssignment](docs/LegalHoldPolicyAssignment.md)
 - [LegalHoldPolicyAssignmentAllOf](docs/LegalHoldPolicyAssignmentAllOf.md)
 - [LegalHoldPolicyAssignmentBase](docs/LegalHoldPolicyAssignmentBase.md)
 - [LegalHoldPolicyAssignments](docs/LegalHoldPolicyAssignments.md)
 - [LegalHoldPolicyAssignmentsAllOf](docs/LegalHoldPolicyAssignmentsAllOf.md)
 - [LegalHoldPolicyAssignmentsAllOf1](docs/LegalHoldPolicyAssignmentsAllOf1.md)
 - [LegalHoldPolicyAssignmentsAssignFileLegalHoldRequest](docs/LegalHoldPolicyAssignmentsAssignFileLegalHoldRequest.md)
 - [LegalHoldPolicyAssignmentsAssignFileLegalHoldRequestAssignTo](docs/LegalHoldPolicyAssignmentsAssignFileLegalHoldRequestAssignTo.md)
 - [LegalHoldPolicyMini](docs/LegalHoldPolicyMini.md)
 - [MetadataBase](docs/MetadataBase.md)
 - [MetadataCascadePolicies](docs/MetadataCascadePolicies.md)
 - [MetadataCascadePoliciesAllOf](docs/MetadataCascadePoliciesAllOf.md)
 - [MetadataCascadePoliciesAllOf1](docs/MetadataCascadePoliciesAllOf1.md)
 - [MetadataCascadePoliciesApplyToChildrenRequest](docs/MetadataCascadePoliciesApplyToChildrenRequest.md)
 - [MetadataCascadePoliciesCreatePolicyRequest](docs/MetadataCascadePoliciesCreatePolicyRequest.md)
 - [MetadataCascadePolicy](docs/MetadataCascadePolicy.md)
 - [MetadataCascadePolicyOwnerEnterprise](docs/MetadataCascadePolicyOwnerEnterprise.md)
 - [MetadataCascadePolicyParent](docs/MetadataCascadePolicyParent.md)
 - [MetadataFieldFilterDateRange](docs/MetadataFieldFilterDateRange.md)
 - [MetadataFieldFilterFloatRange](docs/MetadataFieldFilterFloatRange.md)
 - [MetadataFieldRead](docs/MetadataFieldRead.md)
 - [MetadataFieldWrite](docs/MetadataFieldWrite.md)
 - [MetadataFilter](docs/MetadataFilter.md)
 - [MetadataFull](docs/MetadataFull.md)
 - [MetadataFullAllOf](docs/MetadataFullAllOf.md)
 - [MetadataOptionWrite](docs/MetadataOptionWrite.md)
 - [MetadataOptionWrite1](docs/MetadataOptionWrite1.md)
 - [MetadataOptionWrite2](docs/MetadataOptionWrite2.md)
 - [MetadataQuery](docs/MetadataQuery.md)
 - [MetadataQueryIndex](docs/MetadataQueryIndex.md)
 - [MetadataQueryIndexFieldsInner](docs/MetadataQueryIndexFieldsInner.md)
 - [MetadataQueryIndexFieldsInnerAllOf](docs/MetadataQueryIndexFieldsInnerAllOf.md)
 - [MetadataQueryOrderByInner](docs/MetadataQueryOrderByInner.md)
 - [MetadataQueryResults](docs/MetadataQueryResults.md)
 - [MetadataTemplate](docs/MetadataTemplate.md)
 - [MetadataTemplateFieldsInner](docs/MetadataTemplateFieldsInner.md)
 - [MetadataTemplateFieldsInnerAllOf](docs/MetadataTemplateFieldsInnerAllOf.md)
 - [MetadataTemplateFieldsInnerAllOfOptionsInner](docs/MetadataTemplateFieldsInnerAllOfOptionsInner.md)
 - [MetadataTemplateFieldsInnerAllOfOptionsInnerAllOf](docs/MetadataTemplateFieldsInnerAllOfOptionsInnerAllOf.md)
 - [MetadataTemplates](docs/MetadataTemplates.md)
 - [MetadataTemplatesAllOf](docs/MetadataTemplatesAllOf.md)
 - [MetadataTemplatesAllOf1](docs/MetadataTemplatesAllOf1.md)
 - [MetadataTemplatesCreateNewTemplateRequest](docs/MetadataTemplatesCreateNewTemplateRequest.md)
 - [Metadatas](docs/Metadatas.md)
 - [ModelFile](docs/ModelFile.md)
 - [OAuth2Error](docs/OAuth2Error.md)
 - [Outcome](docs/Outcome.md)
 - [OutcomeCollaborators](docs/OutcomeCollaborators.md)
 - [OutcomeCompletionRule](docs/OutcomeCompletionRule.md)
 - [OutcomeFileCollaboratorRole](docs/OutcomeFileCollaboratorRole.md)
 - [OutcomeRole](docs/OutcomeRole.md)
 - [OutcomeTaskCollaborators](docs/OutcomeTaskCollaborators.md)
 - [PathCollection](docs/PathCollection.md)
 - [PathCollection1](docs/PathCollection1.md)
 - [PathCollection2](docs/PathCollection2.md)
 - [PathCollectionTrash](docs/PathCollectionTrash.md)
 - [PathCollectionTrash1](docs/PathCollectionTrash1.md)
 - [PathCollectionTrash1EntriesInner](docs/PathCollectionTrash1EntriesInner.md)
 - [PathCollectionTrash2](docs/PathCollectionTrash2.md)
 - [PathCollectionTrash2EntriesInner](docs/PathCollectionTrash2EntriesInner.md)
 - [PathCollectionTrashEntriesInner](docs/PathCollectionTrashEntriesInner.md)
 - [PostCollaborationsRequest](docs/PostCollaborationsRequest.md)
 - [PostCollaborationsRequestAccessibleBy](docs/PostCollaborationsRequestAccessibleBy.md)
 - [PostCollaborationsRequestItem](docs/PostCollaborationsRequestItem.md)
 - [PostCommentsRequest](docs/PostCommentsRequest.md)
 - [PostCommentsRequestItem](docs/PostCommentsRequestItem.md)
 - [PostFoldersRequest](docs/PostFoldersRequest.md)
 - [PostFoldersRequestFolderUploadEmail](docs/PostFoldersRequestFolderUploadEmail.md)
 - [PostFoldersRequestParent](docs/PostFoldersRequestParent.md)
 - [PostGroupsRequest](docs/PostGroupsRequest.md)
 - [PostInvitesRequest](docs/PostInvitesRequest.md)
 - [PostInvitesRequestActionableBy](docs/PostInvitesRequestActionableBy.md)
 - [PostInvitesRequestEnterprise](docs/PostInvitesRequestEnterprise.md)
 - [PostOAuth2Revoke](docs/PostOAuth2Revoke.md)
 - [PostOAuth2Token](docs/PostOAuth2Token.md)
 - [PostOAuth2TokenRefreshAccessToken](docs/PostOAuth2TokenRefreshAccessToken.md)
 - [PostTasksRequest](docs/PostTasksRequest.md)
 - [PostTasksRequestItem](docs/PostTasksRequestItem.md)
 - [PostUsersRequest](docs/PostUsersRequest.md)
 - [PostWebhooksRequest](docs/PostWebhooksRequest.md)
 - [PostWebhooksRequestTarget](docs/PostWebhooksRequestTarget.md)
 - [RealtimeServer](docs/RealtimeServer.md)
 - [RealtimeServers](docs/RealtimeServers.md)
 - [RecentItem](docs/RecentItem.md)
 - [RecentItemItem](docs/RecentItemItem.md)
 - [RecentItemItemAllOf](docs/RecentItemItemAllOf.md)
 - [RecentItems](docs/RecentItems.md)
 - [RecentItemsAllOf](docs/RecentItemsAllOf.md)
 - [RecentItemsAllOf1](docs/RecentItemsAllOf1.md)
 - [Reference](docs/Reference.md)
 - [Reference1](docs/Reference1.md)
 - [Reference2](docs/Reference2.md)
 - [RetentionPolicies](docs/RetentionPolicies.md)
 - [RetentionPoliciesAllOf](docs/RetentionPoliciesAllOf.md)
 - [RetentionPoliciesAllOf1](docs/RetentionPoliciesAllOf1.md)
 - [RetentionPoliciesCreatePolicyRequest](docs/RetentionPoliciesCreatePolicyRequest.md)
 - [RetentionPoliciesUpdatePolicyRequest](docs/RetentionPoliciesUpdatePolicyRequest.md)
 - [RetentionPolicy](docs/RetentionPolicy.md)
 - [RetentionPolicyAllOf](docs/RetentionPolicyAllOf.md)
 - [RetentionPolicyAllOfAssignmentCounts](docs/RetentionPolicyAllOfAssignmentCounts.md)
 - [RetentionPolicyAssignment](docs/RetentionPolicyAssignment.md)
 - [RetentionPolicyAssignmentAssignedBy](docs/RetentionPolicyAssignmentAssignedBy.md)
 - [RetentionPolicyAssignmentAssignedTo](docs/RetentionPolicyAssignmentAssignedTo.md)
 - [RetentionPolicyAssignmentBase](docs/RetentionPolicyAssignmentBase.md)
 - [RetentionPolicyAssignmentFilterFieldsInner](docs/RetentionPolicyAssignmentFilterFieldsInner.md)
 - [RetentionPolicyAssignmentRetentionPolicy](docs/RetentionPolicyAssignmentRetentionPolicy.md)
 - [RetentionPolicyAssignments](docs/RetentionPolicyAssignments.md)
 - [RetentionPolicyAssignmentsAllOf](docs/RetentionPolicyAssignmentsAllOf.md)
 - [RetentionPolicyAssignmentsAllOf1](docs/RetentionPolicyAssignmentsAllOf1.md)
 - [RetentionPolicyAssignmentsCreateRetentionAssignmentRequest](docs/RetentionPolicyAssignmentsCreateRetentionAssignmentRequest.md)
 - [RetentionPolicyAssignmentsCreateRetentionAssignmentRequestAssignTo](docs/RetentionPolicyAssignmentsCreateRetentionAssignmentRequestAssignTo.md)
 - [RetentionPolicyAssignmentsCreateRetentionAssignmentRequestFilterFieldsInner](docs/RetentionPolicyAssignmentsCreateRetentionAssignmentRequestFilterFieldsInner.md)
 - [RetentionPolicyBase](docs/RetentionPolicyBase.md)
 - [RetentionPolicyMini](docs/RetentionPolicyMini.md)
 - [RetentionPolicyMiniAllOf](docs/RetentionPolicyMiniAllOf.md)
 - [RoleVariable](docs/RoleVariable.md)
 - [SearchResultWithSharedLink](docs/SearchResultWithSharedLink.md)
 - [SearchResultWithSharedLinkItem](docs/SearchResultWithSharedLinkItem.md)
 - [SearchResults](docs/SearchResults.md)
 - [SearchResultsAllOf](docs/SearchResultsAllOf.md)
 - [SearchResultsAllOf1](docs/SearchResultsAllOf1.md)
 - [SearchResultsWithSharedLinks](docs/SearchResultsWithSharedLinks.md)
 - [SearchResultsWithSharedLinksAllOf](docs/SearchResultsWithSharedLinksAllOf.md)
 - [SearchResultsWithSharedLinksAllOf1](docs/SearchResultsWithSharedLinksAllOf1.md)
 - [SessionEndpoints](docs/SessionEndpoints.md)
 - [SessionTerminationCreateSessionTerminationJobsRequest](docs/SessionTerminationCreateSessionTerminationJobsRequest.md)
 - [SessionTerminationCreateTerminationJobsRequest](docs/SessionTerminationCreateTerminationJobsRequest.md)
 - [SessionTerminationMessage](docs/SessionTerminationMessage.md)
 - [SharedLinksFilesAddSharedLinkToFileRequest](docs/SharedLinksFilesAddSharedLinkToFileRequest.md)
 - [SharedLinksFilesAddSharedLinkToFileRequestSharedLink](docs/SharedLinksFilesAddSharedLinkToFileRequestSharedLink.md)
 - [SharedLinksFilesAddSharedLinkToFileRequestSharedLinkPermissions](docs/SharedLinksFilesAddSharedLinkToFileRequestSharedLinkPermissions.md)
 - [SharedLinksFilesRemoveSharedLinkRequest](docs/SharedLinksFilesRemoveSharedLinkRequest.md)
 - [SharedLinksFilesUpdateLinkOnFileRequest](docs/SharedLinksFilesUpdateLinkOnFileRequest.md)
 - [SharedLinksFilesUpdateLinkOnFileRequestSharedLink](docs/SharedLinksFilesUpdateLinkOnFileRequestSharedLink.md)
 - [SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions](docs/SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions.md)
 - [SharedLinksFoldersAddLinkToFolderRequest](docs/SharedLinksFoldersAddLinkToFolderRequest.md)
 - [SharedLinksFoldersAddLinkToFolderRequestSharedLink](docs/SharedLinksFoldersAddLinkToFolderRequestSharedLink.md)
 - [SharedLinksFoldersAddLinkToFolderRequestSharedLinkPermissions](docs/SharedLinksFoldersAddLinkToFolderRequestSharedLinkPermissions.md)
 - [SharedLinksFoldersRemoveFromFolderRequest](docs/SharedLinksFoldersRemoveFromFolderRequest.md)
 - [SharedLinksFoldersUpdateFolderSharedLinkRequest](docs/SharedLinksFoldersUpdateFolderSharedLinkRequest.md)
 - [SharedLinksFoldersUpdateFolderSharedLinkRequestSharedLink](docs/SharedLinksFoldersUpdateFolderSharedLinkRequestSharedLink.md)
 - [SharedLinksFoldersUpdateFolderSharedLinkRequestSharedLinkPermissions](docs/SharedLinksFoldersUpdateFolderSharedLinkRequestSharedLinkPermissions.md)
 - [SharedLinksWebLinksAddLinkToWebLinkRequest](docs/SharedLinksWebLinksAddLinkToWebLinkRequest.md)
 - [SharedLinksWebLinksAddLinkToWebLinkRequestSharedLink](docs/SharedLinksWebLinksAddLinkToWebLinkRequestSharedLink.md)
 - [SharedLinksWebLinksAddLinkToWebLinkRequestSharedLinkPermissions](docs/SharedLinksWebLinksAddLinkToWebLinkRequestSharedLinkPermissions.md)
 - [SharedLinksWebLinksRemoveSharedLinkRequest](docs/SharedLinksWebLinksRemoveSharedLinkRequest.md)
 - [SharedLinksWebLinksUpdateSharedLinkRequest](docs/SharedLinksWebLinksUpdateSharedLinkRequest.md)
 - [SharedLinksWebLinksUpdateSharedLinkRequestSharedLink](docs/SharedLinksWebLinksUpdateSharedLinkRequestSharedLink.md)
 - [SharedLinksWebLinksUpdateSharedLinkRequestSharedLinkPermissions](docs/SharedLinksWebLinksUpdateSharedLinkRequestSharedLinkPermissions.md)
 - [ShieldInformationBarrier](docs/ShieldInformationBarrier.md)
 - [ShieldInformationBarrierBase](docs/ShieldInformationBarrierBase.md)
 - [ShieldInformationBarrierEnabledBy](docs/ShieldInformationBarrierEnabledBy.md)
 - [ShieldInformationBarrierReference](docs/ShieldInformationBarrierReference.md)
 - [ShieldInformationBarrierReport](docs/ShieldInformationBarrierReport.md)
 - [ShieldInformationBarrierReportAllOf](docs/ShieldInformationBarrierReportAllOf.md)
 - [ShieldInformationBarrierReportBase](docs/ShieldInformationBarrierReportBase.md)
 - [ShieldInformationBarrierReportDetails](docs/ShieldInformationBarrierReportDetails.md)
 - [ShieldInformationBarrierReportDetailsDetails](docs/ShieldInformationBarrierReportDetailsDetails.md)
 - [ShieldInformationBarrierReports](docs/ShieldInformationBarrierReports.md)
 - [ShieldInformationBarrierReportsAllOf](docs/ShieldInformationBarrierReportsAllOf.md)
 - [ShieldInformationBarrierReportsAllOf1](docs/ShieldInformationBarrierReportsAllOf1.md)
 - [ShieldInformationBarrierSegment](docs/ShieldInformationBarrierSegment.md)
 - [ShieldInformationBarrierSegmentCreatedBy](docs/ShieldInformationBarrierSegmentCreatedBy.md)
 - [ShieldInformationBarrierSegmentMember](docs/ShieldInformationBarrierSegmentMember.md)
 - [ShieldInformationBarrierSegmentMemberAllOf](docs/ShieldInformationBarrierSegmentMemberAllOf.md)
 - [ShieldInformationBarrierSegmentMemberAllOfShieldInformationBarrierSegment](docs/ShieldInformationBarrierSegmentMemberAllOfShieldInformationBarrierSegment.md)
 - [ShieldInformationBarrierSegmentMemberBase](docs/ShieldInformationBarrierSegmentMemberBase.md)
 - [ShieldInformationBarrierSegmentMemberMini](docs/ShieldInformationBarrierSegmentMemberMini.md)
 - [ShieldInformationBarrierSegmentMemberMiniAllOf](docs/ShieldInformationBarrierSegmentMemberMiniAllOf.md)
 - [ShieldInformationBarrierSegmentMembers](docs/ShieldInformationBarrierSegmentMembers.md)
 - [ShieldInformationBarrierSegmentMembersAllOf](docs/ShieldInformationBarrierSegmentMembersAllOf.md)
 - [ShieldInformationBarrierSegmentMembersAllOf1](docs/ShieldInformationBarrierSegmentMembersAllOf1.md)
 - [ShieldInformationBarrierSegmentMembersCreateNewMemberRequest](docs/ShieldInformationBarrierSegmentMembersCreateNewMemberRequest.md)
 - [ShieldInformationBarrierSegmentMembersCreateNewMemberRequestShieldInformationBarrierSegment](docs/ShieldInformationBarrierSegmentMembersCreateNewMemberRequestShieldInformationBarrierSegment.md)
 - [ShieldInformationBarrierSegmentRestriction](docs/ShieldInformationBarrierSegmentRestriction.md)
 - [ShieldInformationBarrierSegmentRestrictionAllOf](docs/ShieldInformationBarrierSegmentRestrictionAllOf.md)
 - [ShieldInformationBarrierSegmentRestrictionBase](docs/ShieldInformationBarrierSegmentRestrictionBase.md)
 - [ShieldInformationBarrierSegmentRestrictionMini](docs/ShieldInformationBarrierSegmentRestrictionMini.md)
 - [ShieldInformationBarrierSegmentRestrictionMiniAllOf](docs/ShieldInformationBarrierSegmentRestrictionMiniAllOf.md)
 - [ShieldInformationBarrierSegmentRestrictionMiniAllOfRestrictedSegment](docs/ShieldInformationBarrierSegmentRestrictionMiniAllOfRestrictedSegment.md)
 - [ShieldInformationBarrierSegmentRestrictionMiniAllOfShieldInformationBarrierSegment](docs/ShieldInformationBarrierSegmentRestrictionMiniAllOfShieldInformationBarrierSegment.md)
 - [ShieldInformationBarrierSegmentRestrictions](docs/ShieldInformationBarrierSegmentRestrictions.md)
 - [ShieldInformationBarrierSegmentRestrictionsAllOf](docs/ShieldInformationBarrierSegmentRestrictionsAllOf.md)
 - [ShieldInformationBarrierSegmentRestrictionsAllOf1](docs/ShieldInformationBarrierSegmentRestrictionsAllOf1.md)
 - [ShieldInformationBarrierSegmentRestrictionsCreateBarrierObjectRequest](docs/ShieldInformationBarrierSegmentRestrictionsCreateBarrierObjectRequest.md)
 - [ShieldInformationBarrierSegmentRestrictionsCreateBarrierObjectRequestRestrictedSegment](docs/ShieldInformationBarrierSegmentRestrictionsCreateBarrierObjectRequestRestrictedSegment.md)
 - [ShieldInformationBarrierSegmentRestrictionsCreateBarrierObjectRequestShieldInformationBarrierSegment](docs/ShieldInformationBarrierSegmentRestrictionsCreateBarrierObjectRequestShieldInformationBarrierSegment.md)
 - [ShieldInformationBarrierSegmentUpdatedBy](docs/ShieldInformationBarrierSegmentUpdatedBy.md)
 - [ShieldInformationBarrierSegments](docs/ShieldInformationBarrierSegments.md)
 - [ShieldInformationBarrierSegmentsAllOf](docs/ShieldInformationBarrierSegmentsAllOf.md)
 - [ShieldInformationBarrierSegmentsAllOf1](docs/ShieldInformationBarrierSegmentsAllOf1.md)
 - [ShieldInformationBarrierSegmentsCreateSegmentRequest](docs/ShieldInformationBarrierSegmentsCreateSegmentRequest.md)
 - [ShieldInformationBarrierSegmentsUpdateByIdRequest](docs/ShieldInformationBarrierSegmentsUpdateByIdRequest.md)
 - [ShieldInformationBarriers](docs/ShieldInformationBarriers.md)
 - [ShieldInformationBarriersAddChangedStatusRequest](docs/ShieldInformationBarriersAddChangedStatusRequest.md)
 - [ShieldInformationBarriersAllOf](docs/ShieldInformationBarriersAllOf.md)
 - [ShieldInformationBarriersAllOf1](docs/ShieldInformationBarriersAllOf1.md)
 - [ShieldInformationBarriersCreateBarrierRequest](docs/ShieldInformationBarriersCreateBarrierRequest.md)
 - [SignRequest](docs/SignRequest.md)
 - [SignRequestAllOf](docs/SignRequestAllOf.md)
 - [SignRequestAllOfSignFiles](docs/SignRequestAllOfSignFiles.md)
 - [SignRequestBase](docs/SignRequestBase.md)
 - [SignRequestCreateRequest](docs/SignRequestCreateRequest.md)
 - [SignRequestCreateRequestAllOf](docs/SignRequestCreateRequestAllOf.md)
 - [SignRequestCreateSigner](docs/SignRequestCreateSigner.md)
 - [SignRequestPrefillTag](docs/SignRequestPrefillTag.md)
 - [SignRequestSigner](docs/SignRequestSigner.md)
 - [SignRequestSignerAllOf](docs/SignRequestSignerAllOf.md)
 - [SignRequestSignerAllOfSignerDecision](docs/SignRequestSignerAllOfSignerDecision.md)
 - [SignRequestSignerInput](docs/SignRequestSignerInput.md)
 - [SignRequestSignerInputAllOf](docs/SignRequestSignerInputAllOf.md)
 - [SignRequests](docs/SignRequests.md)
 - [SignRequestsAllOf](docs/SignRequestsAllOf.md)
 - [SignRequestsAllOf1](docs/SignRequestsAllOf1.md)
 - [SignTemplate](docs/SignTemplate.md)
 - [SignTemplateAllOf](docs/SignTemplateAllOf.md)
 - [SignTemplateAllOfAdditionalInfo](docs/SignTemplateAllOfAdditionalInfo.md)
 - [SignTemplateAllOfAdditionalInfoRequired](docs/SignTemplateAllOfAdditionalInfoRequired.md)
 - [SignTemplateAllOfCustomBranding](docs/SignTemplateAllOfCustomBranding.md)
 - [SignTemplateAllOfReadySignLink](docs/SignTemplateAllOfReadySignLink.md)
 - [SignTemplates](docs/SignTemplates.md)
 - [SignTemplatesAllOf](docs/SignTemplatesAllOf.md)
 - [SignTemplatesAllOf1](docs/SignTemplatesAllOf1.md)
 - [Skill](docs/Skill.md)
 - [SkillCardsMetadata](docs/SkillCardsMetadata.md)
 - [SkillInvocation](docs/SkillInvocation.md)
 - [SkillInvocationEnterprise](docs/SkillInvocationEnterprise.md)
 - [SkillInvocationEvent](docs/SkillInvocationEvent.md)
 - [SkillInvocationSkill](docs/SkillInvocationSkill.md)
 - [SkillInvocationSource](docs/SkillInvocationSource.md)
 - [SkillInvocationSourceAllOf](docs/SkillInvocationSourceAllOf.md)
 - [SkillInvocationStatus](docs/SkillInvocationStatus.md)
 - [SkillInvocationToken](docs/SkillInvocationToken.md)
 - [SkillInvocationTokenRead](docs/SkillInvocationTokenRead.md)
 - [SkillInvocationTokenWrite](docs/SkillInvocationTokenWrite.md)
 - [SkillsApplyBoxSkillCardsRequest](docs/SkillsApplyBoxSkillCardsRequest.md)
 - [SkillsUpdateAllBoxSkillCardsRequest](docs/SkillsUpdateAllBoxSkillCardsRequest.md)
 - [SkillsUpdateAllBoxSkillCardsRequestFile](docs/SkillsUpdateAllBoxSkillCardsRequestFile.md)
 - [SkillsUpdateAllBoxSkillCardsRequestFileVersion](docs/SkillsUpdateAllBoxSkillCardsRequestFileVersion.md)
 - [SkillsUpdateAllBoxSkillCardsRequestMetadata](docs/SkillsUpdateAllBoxSkillCardsRequestMetadata.md)
 - [SkillsUpdateAllBoxSkillCardsRequestUsage](docs/SkillsUpdateAllBoxSkillCardsRequestUsage.md)
 - [SkillsUpdateBoxSkillCardsOnFileRequestInner](docs/SkillsUpdateBoxSkillCardsOnFileRequestInner.md)
 - [SkillsUpdateBoxSkillCardsOnFileRequestInnerValue](docs/SkillsUpdateBoxSkillCardsOnFileRequestInnerValue.md)
 - [SkillsUpdateBoxSkillCardsOnFileRequestInnerValueAllOf](docs/SkillsUpdateBoxSkillCardsOnFileRequestInnerValueAllOf.md)
 - [StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequest](docs/StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequest.md)
 - [StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestAssignedTo](docs/StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestAssignedTo.md)
 - [StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy](docs/StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy.md)
 - [StandardAndZonesStoragePolicyAssignmentsUpdateSpecificAssignmentRequest](docs/StandardAndZonesStoragePolicyAssignmentsUpdateSpecificAssignmentRequest.md)
 - [StandardAndZonesStoragePolicyAssignmentsUpdateSpecificAssignmentRequestStoragePolicy](docs/StandardAndZonesStoragePolicyAssignmentsUpdateSpecificAssignmentRequestStoragePolicy.md)
 - [StatusSkillCard](docs/StatusSkillCard.md)
 - [StatusSkillCardInvocation](docs/StatusSkillCardInvocation.md)
 - [StatusSkillCardSkill](docs/StatusSkillCardSkill.md)
 - [StatusSkillCardSkillCardTitle](docs/StatusSkillCardSkillCardTitle.md)
 - [StatusSkillCardStatus](docs/StatusSkillCardStatus.md)
 - [StoragePolicies](docs/StoragePolicies.md)
 - [StoragePoliciesAllOf](docs/StoragePoliciesAllOf.md)
 - [StoragePoliciesAllOf1](docs/StoragePoliciesAllOf1.md)
 - [StoragePolicy](docs/StoragePolicy.md)
 - [StoragePolicyAllOf](docs/StoragePolicyAllOf.md)
 - [StoragePolicyAssignment](docs/StoragePolicyAssignment.md)
 - [StoragePolicyAssignmentAssignedTo](docs/StoragePolicyAssignmentAssignedTo.md)
 - [StoragePolicyAssignmentStoragePolicy](docs/StoragePolicyAssignmentStoragePolicy.md)
 - [StoragePolicyAssignments](docs/StoragePolicyAssignments.md)
 - [StoragePolicyAssignmentsAllOf](docs/StoragePolicyAssignmentsAllOf.md)
 - [StoragePolicyAssignmentsAllOf1](docs/StoragePolicyAssignmentsAllOf1.md)
 - [StoragePolicyMini](docs/StoragePolicyMini.md)
 - [Task](docs/Task.md)
 - [TaskAssignment](docs/TaskAssignment.md)
 - [TaskAssignmentAssignedBy](docs/TaskAssignmentAssignedBy.md)
 - [TaskAssignmentAssignedTo](docs/TaskAssignmentAssignedTo.md)
 - [TaskAssignmentItem](docs/TaskAssignmentItem.md)
 - [TaskAssignments](docs/TaskAssignments.md)
 - [TaskAssignmentsAssignMultipleUsersRequest](docs/TaskAssignmentsAssignMultipleUsersRequest.md)
 - [TaskAssignmentsAssignMultipleUsersRequestAssignTo](docs/TaskAssignmentsAssignMultipleUsersRequestAssignTo.md)
 - [TaskAssignmentsAssignMultipleUsersRequestTask](docs/TaskAssignmentsAssignMultipleUsersRequestTask.md)
 - [TaskAssignmentsUpdateStateAssignedToUserRequest](docs/TaskAssignmentsUpdateStateAssignedToUserRequest.md)
 - [TaskCreatedBy](docs/TaskCreatedBy.md)
 - [TaskItem](docs/TaskItem.md)
 - [TaskTaskAssignmentCollection](docs/TaskTaskAssignmentCollection.md)
 - [Tasks](docs/Tasks.md)
 - [TasksUpdateTaskConfigurationRequest](docs/TasksUpdateTaskConfigurationRequest.md)
 - [TemplateSigner](docs/TemplateSigner.md)
 - [TemplateSignerAllOf](docs/TemplateSignerAllOf.md)
 - [TemplateSignerInput](docs/TemplateSignerInput.md)
 - [TemplateSignerInputAllOf](docs/TemplateSignerInputAllOf.md)
 - [TemplateSignerInputAllOfCoordinates](docs/TemplateSignerInputAllOfCoordinates.md)
 - [TemplateSignerInputAllOfDimensions](docs/TemplateSignerInputAllOfDimensions.md)
 - [TermsOfService](docs/TermsOfService.md)
 - [TermsOfServiceAllOf](docs/TermsOfServiceAllOf.md)
 - [TermsOfServiceBase](docs/TermsOfServiceBase.md)
 - [TermsOfServiceCreateForEnterpriseAndTypeRequest](docs/TermsOfServiceCreateForEnterpriseAndTypeRequest.md)
 - [TermsOfServiceUpdateSpecificTermRequest](docs/TermsOfServiceUpdateSpecificTermRequest.md)
 - [TermsOfServiceUserStatus](docs/TermsOfServiceUserStatus.md)
 - [TermsOfServiceUserStatusTos](docs/TermsOfServiceUserStatusTos.md)
 - [TermsOfServiceUserStatusUser](docs/TermsOfServiceUserStatusUser.md)
 - [TermsOfServiceUserStatuses](docs/TermsOfServiceUserStatuses.md)
 - [TermsOfServiceUserStatusesCreateUserStatusRequest](docs/TermsOfServiceUserStatusesCreateUserStatusRequest.md)
 - [TermsOfServiceUserStatusesCreateUserStatusRequestTos](docs/TermsOfServiceUserStatusesCreateUserStatusRequestTos.md)
 - [TermsOfServiceUserStatusesCreateUserStatusRequestUser](docs/TermsOfServiceUserStatusesCreateUserStatusRequestUser.md)
 - [TermsOfServiceUserStatusesUpdateUserStatusRequest](docs/TermsOfServiceUserStatusesUpdateUserStatusRequest.md)
 - [TermsOfServices](docs/TermsOfServices.md)
 - [TimelineSkillCard](docs/TimelineSkillCard.md)
 - [TimelineSkillCardEntriesInner](docs/TimelineSkillCardEntriesInner.md)
 - [TimelineSkillCardEntriesInnerAppearsInner](docs/TimelineSkillCardEntriesInnerAppearsInner.md)
 - [TimelineSkillCardInvocation](docs/TimelineSkillCardInvocation.md)
 - [TimelineSkillCardSkill](docs/TimelineSkillCardSkill.md)
 - [TimelineSkillCardSkillCardTitle](docs/TimelineSkillCardSkillCardTitle.md)
 - [TrackingCode](docs/TrackingCode.md)
 - [TranscriptSkillCard](docs/TranscriptSkillCard.md)
 - [TranscriptSkillCardEntriesInner](docs/TranscriptSkillCardEntriesInner.md)
 - [TranscriptSkillCardEntriesInnerAppearsInner](docs/TranscriptSkillCardEntriesInnerAppearsInner.md)
 - [TranscriptSkillCardInvocation](docs/TranscriptSkillCardInvocation.md)
 - [TranscriptSkillCardSkill](docs/TranscriptSkillCardSkill.md)
 - [TranscriptSkillCardSkillCardTitle](docs/TranscriptSkillCardSkillCardTitle.md)
 - [TransferFoldersToDestinationRequest](docs/TransferFoldersToDestinationRequest.md)
 - [TransferFoldersToDestinationRequestOwnedBy](docs/TransferFoldersToDestinationRequestOwnedBy.md)
 - [TrashFile](docs/TrashFile.md)
 - [TrashFileCreatedBy](docs/TrashFileCreatedBy.md)
 - [TrashFileFileVersion](docs/TrashFileFileVersion.md)
 - [TrashFileModifiedBy](docs/TrashFileModifiedBy.md)
 - [TrashFileOwnedBy](docs/TrashFileOwnedBy.md)
 - [TrashFileParent](docs/TrashFileParent.md)
 - [TrashFilePathCollection](docs/TrashFilePathCollection.md)
 - [TrashFileRestored](docs/TrashFileRestored.md)
 - [TrashFileRestoredPathCollection](docs/TrashFileRestoredPathCollection.md)
 - [TrashFolder](docs/TrashFolder.md)
 - [TrashFolderCreatedBy](docs/TrashFolderCreatedBy.md)
 - [TrashFolderModifiedBy](docs/TrashFolderModifiedBy.md)
 - [TrashFolderOwnedBy](docs/TrashFolderOwnedBy.md)
 - [TrashFolderParent](docs/TrashFolderParent.md)
 - [TrashFolderPathCollection](docs/TrashFolderPathCollection.md)
 - [TrashFolderRestored](docs/TrashFolderRestored.md)
 - [TrashFolderRestoredPathCollection](docs/TrashFolderRestoredPathCollection.md)
 - [TrashWebLink](docs/TrashWebLink.md)
 - [TrashWebLinkCreatedBy](docs/TrashWebLinkCreatedBy.md)
 - [TrashWebLinkModifiedBy](docs/TrashWebLinkModifiedBy.md)
 - [TrashWebLinkOwnedBy](docs/TrashWebLinkOwnedBy.md)
 - [TrashWebLinkParent](docs/TrashWebLinkParent.md)
 - [TrashWebLinkPathCollection](docs/TrashWebLinkPathCollection.md)
 - [TrashWebLinkRestored](docs/TrashWebLinkRestored.md)
 - [TrashWebLinkRestoredPathCollection](docs/TrashWebLinkRestoredPathCollection.md)
 - [TrashedFilesRestoreFileRequest](docs/TrashedFilesRestoreFileRequest.md)
 - [TrashedFilesRestoreFileRequestParent](docs/TrashedFilesRestoreFileRequestParent.md)
 - [TrashedFilesRestoreFileRequestParentAllOf](docs/TrashedFilesRestoreFileRequestParentAllOf.md)
 - [TrashedFoldersRestoreFolderRequest](docs/TrashedFoldersRestoreFolderRequest.md)
 - [TrashedFoldersRestoreFolderRequestParent](docs/TrashedFoldersRestoreFolderRequestParent.md)
 - [TrashedFoldersRestoreFolderRequestParentAllOf](docs/TrashedFoldersRestoreFolderRequestParentAllOf.md)
 - [TrashedWebLinksRestoreWebLinkRequest](docs/TrashedWebLinksRestoreWebLinkRequest.md)
 - [TrashedWebLinksRestoreWebLinkRequestParent](docs/TrashedWebLinksRestoreWebLinkRequestParent.md)
 - [TrashedWebLinksRestoreWebLinkRequestParentAllOf](docs/TrashedWebLinksRestoreWebLinkRequestParentAllOf.md)
 - [UploadPart](docs/UploadPart.md)
 - [UploadPartAllOf](docs/UploadPartAllOf.md)
 - [UploadPartMini](docs/UploadPartMini.md)
 - [UploadParts](docs/UploadParts.md)
 - [UploadPartsAllOf](docs/UploadPartsAllOf.md)
 - [UploadPartsAllOf1](docs/UploadPartsAllOf1.md)
 - [UploadPartsAllOfOrder](docs/UploadPartsAllOfOrder.md)
 - [UploadSession](docs/UploadSession.md)
 - [UploadSessionSessionEndpoints](docs/UploadSessionSessionEndpoints.md)
 - [UploadUrl](docs/UploadUrl.md)
 - [UploadedPart](docs/UploadedPart.md)
 - [UploadsChunkedCommitSessionRequest](docs/UploadsChunkedCommitSessionRequest.md)
 - [UploadsChunkedCreateSessionForUploadRequest](docs/UploadsChunkedCreateSessionForUploadRequest.md)
 - [UploadsChunkedCreateSessionForUploadRequest1](docs/UploadsChunkedCreateSessionForUploadRequest1.md)
 - [UploadsFileContentUpdateRequest](docs/UploadsFileContentUpdateRequest.md)
 - [UploadsFileContentUpdateRequestAttributes](docs/UploadsFileContentUpdateRequestAttributes.md)
 - [UploadsSmallFileRequest](docs/UploadsSmallFileRequest.md)
 - [UploadsSmallFileRequestAttributes](docs/UploadsSmallFileRequestAttributes.md)
 - [UploadsSmallFileRequestAttributesParent](docs/UploadsSmallFileRequestAttributesParent.md)
 - [User](docs/User.md)
 - [UserAllOf](docs/UserAllOf.md)
 - [UserAllOfNotificationEmail](docs/UserAllOfNotificationEmail.md)
 - [UserAvatar](docs/UserAvatar.md)
 - [UserAvatarPicUrls](docs/UserAvatarPicUrls.md)
 - [UserAvatarsAddOrUpdateImageRequest](docs/UserAvatarsAddOrUpdateImageRequest.md)
 - [UserBase](docs/UserBase.md)
 - [UserCollaborations](docs/UserCollaborations.md)
 - [UserCollaborationsAllOf](docs/UserCollaborationsAllOf.md)
 - [UserFull](docs/UserFull.md)
 - [UserFullAllOf](docs/UserFullAllOf.md)
 - [UserIntegrationMappings](docs/UserIntegrationMappings.md)
 - [UserIntegrationMappingsAllOf](docs/UserIntegrationMappingsAllOf.md)
 - [UserMini](docs/UserMini.md)
 - [UserMiniAllOf](docs/UserMiniAllOf.md)
 - [Users](docs/Users.md)
 - [UsersAllOf](docs/UsersAllOf.md)
 - [UsersAllOf1](docs/UsersAllOf1.md)
 - [UsersAllOfOrder](docs/UsersAllOfOrder.md)
 - [UsersUpdateManagedUserRequest](docs/UsersUpdateManagedUserRequest.md)
 - [UsersUpdateManagedUserRequestNotificationEmail](docs/UsersUpdateManagedUserRequestNotificationEmail.md)
 - [Watermark](docs/Watermark.md)
 - [WatermarkWatermark](docs/WatermarkWatermark.md)
 - [WatermarksFilesApplyWatermarkToFileRequest](docs/WatermarksFilesApplyWatermarkToFileRequest.md)
 - [WatermarksFilesApplyWatermarkToFileRequestWatermark](docs/WatermarksFilesApplyWatermarkToFileRequestWatermark.md)
 - [WatermarksFoldersApplyToFolderRequest](docs/WatermarksFoldersApplyToFolderRequest.md)
 - [WatermarksFoldersApplyToFolderRequestWatermark](docs/WatermarksFoldersApplyToFolderRequestWatermark.md)
 - [WebLink](docs/WebLink.md)
 - [WebLinkAllOf](docs/WebLinkAllOf.md)
 - [WebLinkBase](docs/WebLinkBase.md)
 - [WebLinkMini](docs/WebLinkMini.md)
 - [WebLinkMiniAllOf](docs/WebLinkMiniAllOf.md)
 - [WebLinksCreateObjectRequest](docs/WebLinksCreateObjectRequest.md)
 - [WebLinksCreateObjectRequestParent](docs/WebLinksCreateObjectRequestParent.md)
 - [WebLinksUpdateObjectRequest](docs/WebLinksUpdateObjectRequest.md)
 - [WebLinksUpdateObjectRequestParent](docs/WebLinksUpdateObjectRequestParent.md)
 - [WebLinksUpdateObjectRequestParentAllOf](docs/WebLinksUpdateObjectRequestParentAllOf.md)
 - [WebLinksUpdateObjectRequestSharedLink](docs/WebLinksUpdateObjectRequestSharedLink.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookAllOf](docs/WebhookAllOf.md)
 - [WebhookInvocation](docs/WebhookInvocation.md)
 - [WebhookInvocationCreatedBy](docs/WebhookInvocationCreatedBy.md)
 - [WebhookInvocationSource](docs/WebhookInvocationSource.md)
 - [WebhookInvocationWebhook](docs/WebhookInvocationWebhook.md)
 - [WebhookMini](docs/WebhookMini.md)
 - [WebhookMiniTarget](docs/WebhookMiniTarget.md)
 - [Webhooks](docs/Webhooks.md)
 - [WebhooksAllOf](docs/WebhooksAllOf.md)
 - [WebhooksAllOf1](docs/WebhooksAllOf1.md)
 - [WebhooksUpdateWebhookRequest](docs/WebhooksUpdateWebhookRequest.md)
 - [WebhooksUpdateWebhookRequestTarget](docs/WebhooksUpdateWebhookRequestTarget.md)
 - [Workflow](docs/Workflow.md)
 - [WorkflowAllOf](docs/WorkflowAllOf.md)
 - [WorkflowAllOfFlows](docs/WorkflowAllOfFlows.md)
 - [WorkflowFull](docs/WorkflowFull.md)
 - [WorkflowFullAllOf](docs/WorkflowFullAllOf.md)
 - [WorkflowMini](docs/WorkflowMini.md)
 - [Workflows](docs/Workflows.md)
 - [WorkflowsAllOf](docs/WorkflowsAllOf.md)
 - [WorkflowsAllOf1](docs/WorkflowsAllOf1.md)
 - [WorkflowsStartBasedOnRequestRequest](docs/WorkflowsStartBasedOnRequestRequest.md)
 - [WorkflowsStartBasedOnRequestRequestFilesInner](docs/WorkflowsStartBasedOnRequestRequestFilesInner.md)
 - [WorkflowsStartBasedOnRequestRequestFlow](docs/WorkflowsStartBasedOnRequestRequestFlow.md)
 - [WorkflowsStartBasedOnRequestRequestFolder](docs/WorkflowsStartBasedOnRequestRequestFolder.md)
 - [ZipDownload](docs/ZipDownload.md)
 - [ZipDownloadNameConflictsInnerInner](docs/ZipDownloadNameConflictsInnerInner.md)
 - [ZipDownloadRequest](docs/ZipDownloadRequest.md)
 - [ZipDownloadRequestItemsInner](docs/ZipDownloadRequestItemsInner.md)
 - [ZipDownloadStatus](docs/ZipDownloadStatus.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
