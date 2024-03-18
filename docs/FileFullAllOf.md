

# FileFullAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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



