

# FileFull

A full representation of a file, as can be returned from any file API endpoints by default

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier that represent a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/files/123&#x60; the &#x60;file_id&#x60; is &#x60;123&#x60;. |  |
|**etag** | **String** | The HTTP &#x60;etag&#x60; of this file. This can be used within some API endpoints in the &#x60;If-Match&#x60; and &#x60;If-None-Match&#x60; headers to only perform changes on the file if (no) changes have happened. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;file&#x60; |  |
|**sequenceId** | [**String**](String.md) |  |  [optional] |
|**name** | **String** | The name of the file |  [optional] |
|**sha1** | **String** | The SHA1 hash of the file. This can be used to compare the contents of a file on Box with a local file. |  [optional] |
|**fileVersion** | [**FileVersionMini**](FileVersionMini.md) |  |  [optional] |
|**description** | **String** | The optional description of this file |  [optional] |
|**size** | **Integer** | The file size in bytes. Be careful parsing this integer as it can get very large and cause an integer overflow. |  [optional] |
|**pathCollection** | [**Object**](Object.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time when the file was created on Box. |  [optional] |
|**modifiedAt** | **OffsetDateTime** | The date and time when the file was last updated on Box. |  [optional] |
|**trashedAt** | **OffsetDateTime** | The time at which this file was put in the trash. |  [optional] |
|**purgedAt** | **OffsetDateTime** | The time at which this file is expected to be purged from the trash. |  [optional] |
|**contentCreatedAt** | **OffsetDateTime** | The date and time at which this file was originally created, which might be before it was uploaded to Box. |  [optional] |
|**contentModifiedAt** | **OffsetDateTime** | The date and time at which this file was last updated, which might be before it was uploaded to Box. |  [optional] |
|**createdBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**modifiedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**ownedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**sharedLink** | [**Object**](Object.md) |  |  [optional] |
|**parent** | [**FolderMini**](FolderMini.md) |  |  [optional] |
|**itemStatus** | [**ItemStatusEnum**](#ItemStatusEnum) | Defines if this item has been deleted or not.  * &#x60;active&#x60; when the item has is not in the trash * &#x60;trashed&#x60; when the item has been moved to the trash but not deleted * &#x60;deleted&#x60; when the item has been permanently deleted. |  [optional] |
|**tags** | [**List**](List.md) |  |  [optional] |
|**versionNumber** | **String** | The version number of this file |  [optional] |
|**commentCount** | **Integer** | The number of comments on this file |  [optional] |
|**permissions** | [**Object**](Object.md) |  |  [optional] |
|**lock** | [**Object**](Object.md) |  |  [optional] |
|**extension** | **String** | Indicates the (optional) file extension for this file. By default, this is set to an empty string. |  [optional] |
|**isPackage** | **Boolean** | Indicates if the file is a package. Packages are commonly used by Mac Applications and can include iWork files. |  [optional] |
|**expiringEmbedLink** | [**Object**](Object.md) |  |  [optional] |
|**watermarkInfo** | [**Object**](Object.md) |  |  [optional] |
|**isAccessibleViaSharedLink** | [**IsAccessibleViaSharedLinkEnum**](#IsAccessibleViaSharedLinkEnum) | Specifies if the file can be accessed via the direct shared link or a shared link to a parent folder. |  [optional] |
|**allowedInviteeRoles** | [**List&lt;AllowedInviteeRolesEnum&gt;**](#List&lt;AllowedInviteeRolesEnum&gt;) | A list of the types of roles that user can be invited at when sharing this file. |  [optional] |
|**isExternallyOwned** | **Boolean** | Specifies if this file is owned by a user outside of the authenticated enterprise. |  [optional] |
|**hasCollaborations** | **Boolean** | Specifies if this file has any other collaborators. |  [optional] |
|**metadata** | [**Map**](Map.md) |  |  [optional] |
|**expiresAt** | **OffsetDateTime** | When the file will automatically be deleted |  [optional] |
|**representations** | [**Object**](Object.md) |  |  [optional] |
|**classification** | [**Object**](Object.md) |  |  [optional] |
|**uploaderDisplayName** | [**String**](String.md) |  |  [optional] |
|**dispositionAt** | **OffsetDateTime** | The retention expiration timestamp for the given file |  [optional] |
|**sharedLinkPermissionOptions** | [**List&lt;SharedLinkPermissionOptionsEnum&gt;**](#List&lt;SharedLinkPermissionOptionsEnum&gt;) | A list of the types of roles that user can be invited at when sharing this file. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILE | &quot;file&quot; |



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



