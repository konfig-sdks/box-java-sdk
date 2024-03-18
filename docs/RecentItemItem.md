

# RecentItemItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this web link |  |
|**etag** | **String** | The entity tag of this web link. Used with &#x60;If-Match&#x60; headers. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;web_link&#x60; |  |
|**sequenceId** | [**String**](String.md) |  |  [optional] |
|**name** | **String** | The name of the web link |  [optional] |
|**sha1** | **String** | The SHA1 hash of the file. This can be used to compare the contents of a file on Box with a local file. |  [optional] |
|**fileVersion** | [**FileVersionMini**](FileVersionMini.md) |  |  [optional] |
|**description** | **String** | The description accompanying the web link. This is visible within the Box web application. |  [optional] |
|**size** | **Long** | The folder size in bytes.  Be careful parsing this integer as its value can get very large. |  [optional] |
|**pathCollection** | [**Object**](Object.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | When this file was created on Box’s servers. |  [optional] |
|**modifiedAt** | **OffsetDateTime** | When this file was last updated on the Box servers. |  [optional] |
|**trashedAt** | **OffsetDateTime** | When this file was moved to the trash. |  [optional] |
|**purgedAt** | **OffsetDateTime** | When this file will be permanently deleted. |  [optional] |
|**contentCreatedAt** | **OffsetDateTime** | The date and time at which this folder was originally created. |  [optional] |
|**contentModifiedAt** | **OffsetDateTime** | The date and time at which this folder was last updated. |  [optional] |
|**createdBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**modifiedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**ownedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**sharedLink** | [**Object**](Object.md) |  |  [optional] |
|**parent** | [**FolderMini**](FolderMini.md) |  |  [optional] |
|**itemStatus** | [**ItemStatusEnum**](#ItemStatusEnum) | Whether this item is deleted or not. Values include &#x60;active&#x60;, &#x60;trashed&#x60; if the file has been moved to the trash, and &#x60;deleted&#x60; if the file has been permanently deleted |  [optional] |
|**tags** | [**List**](List.md) |  |  [optional] |
|**versionNumber** | **String** | The version number of this file |  [optional] |
|**commentCount** | **Integer** | The number of comments on this file |  [optional] |
|**permissions** | [**Object**](Object.md) |  |  [optional] |
|**lock** | [**Object**](Object.md) |  |  [optional] |
|**extension** | **String** | Indicates the (optional) file extension for this file. By default, this is set to an empty string. |  [optional] |
|**isPackage** | **Boolean** | Indicates if the file is a package. Packages are commonly used by Mac Applications and can include iWork files. |  [optional] |
|**expiringEmbedLink** | [**Object**](Object.md) |  |  [optional] |
|**watermarkInfo** | [**Object**](Object.md) |  |  [optional] |
|**isAccessibleViaSharedLink** | [**IsAccessibleViaSharedLinkEnum**](#IsAccessibleViaSharedLinkEnum) | Specifies if the folder can be accessed with the direct shared link or a shared link to a parent folder. |  [optional] |
|**allowedInviteeRoles** | [**List&lt;AllowedInviteeRolesEnum&gt;**](#List&lt;AllowedInviteeRolesEnum&gt;) | A list of the types of roles that user can be invited at when sharing this folder. |  [optional] |
|**isExternallyOwned** | **Boolean** | Specifies if this folder is owned by a user outside of the authenticated enterprise. |  [optional] |
|**hasCollaborations** | **Boolean** | Specifies if this folder has any other collaborators. |  [optional] |
|**metadata** | [**Map**](Map.md) |  |  [optional] |
|**expiresAt** | **OffsetDateTime** | When the file will automatically be deleted |  [optional] |
|**representations** | [**Object**](Object.md) |  |  [optional] |
|**classification** | [**Object**](Object.md) |  |  [optional] |
|**uploaderDisplayName** | [**String**](String.md) |  |  [optional] |
|**dispositionAt** | **OffsetDateTime** | The retention expiration timestamp for the given file |  [optional] |
|**sharedLinkPermissionOptions** | [**List&lt;SharedLinkPermissionOptionsEnum&gt;**](#List&lt;SharedLinkPermissionOptionsEnum&gt;) | A list of the types of roles that user can be invited at when sharing this file. |  [optional] |
|**folderUploadEmail** | [**FolderAllOfFolderUploadEmail**](FolderAllOfFolderUploadEmail.md) |  |  [optional] |
|**itemCollection** | [**Items**](Items.md) |  |  [optional] |
|**syncState** | [**String**](String.md) |  |  [optional] |
|**canNonOwnersInvite** | [**Boolean**](Boolean.md) |  |  [optional] |
|**isCollaborationRestrictedToEnterprise** | [**Boolean**](Boolean.md) |  |  [optional] |
|**allowedSharedLinkAccessLevels** | [**List&lt;AllowedSharedLinkAccessLevelsEnum&gt;**](#List&lt;AllowedSharedLinkAccessLevelsEnum&gt;) | A list of access levels that are available for this folder.  For some folders, like the root folder, this will always be an empty list as sharing is not allowed at that level. |  [optional] |
|**canNonOwnersViewCollaborators** | **Boolean** | Specifies if collaborators who are not owners of this folder are restricted from viewing other collaborations on this folder.  It also restricts non-owners from inviting new collaborators. |  [optional] |
|**url** | **String** | The URL this web link points to |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| WEB_LINK | &quot;web_link&quot; |



## Enum: ItemStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| TRASHED | &quot;trashed&quot; |
| DELETED | &quot;deleted&quot; |



## Enum: IsAccessibleViaSharedLinkEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: List&lt;AllowedInviteeRolesEnum&gt;

| Name | Value |
|---- | -----|
| EDITOR | &quot;editor&quot; |
| VIEWER | &quot;viewer&quot; |
| PREVIEWER | &quot;previewer&quot; |
| UPLOADER | &quot;uploader&quot; |
| PREVIEWER_UPLOADER | &quot;previewer uploader&quot; |
| VIEWER_UPLOADER | &quot;viewer uploader&quot; |
| CO_OWNER | &quot;co-owner&quot; |



## Enum: List&lt;SharedLinkPermissionOptionsEnum&gt;

| Name | Value |
|---- | -----|
| PREVIEW | &quot;can_preview&quot; |
| DOWNLOAD | &quot;can_download&quot; |
| EDIT | &quot;can_edit&quot; |



## Enum: List&lt;AllowedSharedLinkAccessLevelsEnum&gt;

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| COMPANY | &quot;company&quot; |
| COLLABORATORS | &quot;collaborators&quot; |



