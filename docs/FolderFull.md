

# FolderFull

A full representation of a folder, as can be returned from any folder API endpoints by default

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier that represent a folder.  The ID for any folder can be determined by visiting a folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folders/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;. |  |
|**etag** | **String** | The HTTP &#x60;etag&#x60; of this folder. This can be used within some API endpoints in the &#x60;If-Match&#x60; and &#x60;If-None-Match&#x60; headers to only perform changes on the folder if (no) changes have happened. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;folder&#x60; |  |
|**sequenceId** | [**String**](String.md) |  |  [optional] |
|**name** | **String** | The name of the folder. |  [optional] |
|**description** | [**String**](String.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time when the folder was created. This value may be &#x60;null&#x60; for some folders such as the root folder or the trash folder. |  [optional] |
|**modifiedAt** | **OffsetDateTime** | The date and time when the folder was last updated. This value may be &#x60;null&#x60; for some folders such as the root folder or the trash folder. |  [optional] |
|**size** | **Long** | The folder size in bytes.  Be careful parsing this integer as its value can get very large. |  [optional] |
|**pathCollection** | [**Object**](Object.md) |  |  [optional] |
|**createdBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**modifiedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**trashedAt** | **OffsetDateTime** | The time at which this folder was put in the trash. |  [optional] |
|**purgedAt** | **OffsetDateTime** | The time at which this folder is expected to be purged from the trash. |  [optional] |
|**contentCreatedAt** | **OffsetDateTime** | The date and time at which this folder was originally created. |  [optional] |
|**contentModifiedAt** | **OffsetDateTime** | The date and time at which this folder was last updated. |  [optional] |
|**ownedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**sharedLink** | [**Object**](Object.md) |  |  [optional] |
|**folderUploadEmail** | [**FolderAllOfFolderUploadEmail**](FolderAllOfFolderUploadEmail.md) |  |  [optional] |
|**parent** | [**FolderMini**](FolderMini.md) |  |  [optional] |
|**itemStatus** | [**ItemStatusEnum**](#ItemStatusEnum) | Defines if this item has been deleted or not.  * &#x60;active&#x60; when the item has is not in the trash * &#x60;trashed&#x60; when the item has been moved to the trash but not deleted * &#x60;deleted&#x60; when the item has been permanently deleted. |  [optional] |
|**itemCollection** | [**Items**](Items.md) |  |  [optional] |
|**tags** | [**List**](List.md) |  |  [optional] |
|**syncState** | [**String**](String.md) |  |  [optional] |
|**hasCollaborations** | **Boolean** | Specifies if this folder has any other collaborators. |  [optional] |
|**permissions** | [**Object**](Object.md) |  |  [optional] |
|**canNonOwnersInvite** | [**Boolean**](Boolean.md) |  |  [optional] |
|**isExternallyOwned** | **Boolean** | Specifies if this folder is owned by a user outside of the authenticated enterprise. |  [optional] |
|**metadata** | [**Map**](Map.md) |  |  [optional] |
|**isCollaborationRestrictedToEnterprise** | [**Boolean**](Boolean.md) |  |  [optional] |
|**allowedSharedLinkAccessLevels** | [**List&lt;AllowedSharedLinkAccessLevelsEnum&gt;**](#List&lt;AllowedSharedLinkAccessLevelsEnum&gt;) | A list of access levels that are available for this folder.  For some folders, like the root folder, this will always be an empty list as sharing is not allowed at that level. |  [optional] |
|**allowedInviteeRoles** | [**List&lt;AllowedInviteeRolesEnum&gt;**](#List&lt;AllowedInviteeRolesEnum&gt;) | A list of the types of roles that user can be invited at when sharing this folder. |  [optional] |
|**watermarkInfo** | [**Object**](Object.md) |  |  [optional] |
|**isAccessibleViaSharedLink** | [**IsAccessibleViaSharedLinkEnum**](#IsAccessibleViaSharedLinkEnum) | Specifies if the folder can be accessed with the direct shared link or a shared link to a parent folder. |  [optional] |
|**canNonOwnersViewCollaborators** | **Boolean** | Specifies if collaborators who are not owners of this folder are restricted from viewing other collaborations on this folder.  It also restricts non-owners from inviting new collaborators. |  [optional] |
|**classification** | [**Object**](Object.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FOLDER | &quot;folder&quot; |



## Enum: ItemStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| TRASHED | &quot;trashed&quot; |
| DELETED | &quot;deleted&quot; |



## Enum: List&lt;AllowedSharedLinkAccessLevelsEnum&gt;

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| COMPANY | &quot;company&quot; |
| COLLABORATORS | &quot;collaborators&quot; |



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



## Enum: IsAccessibleViaSharedLinkEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



