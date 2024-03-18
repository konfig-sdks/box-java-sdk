

# FolderFullAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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



