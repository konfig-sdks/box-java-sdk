

# FoldersUpdateFolderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** | The tags for this item. These tags are shown in the Box web app and mobile apps next to an item.  To add or remove a tag, retrieve the item&#39;s current tags, modify them, and then update this field.  There is a limit of 100 tags per item, and 10,000 unique tags per enterprise. |  [optional] |
|**description** | **String** | The optional description of this folder |  [optional] |
|**name** | **String** | The optional new name for this folder. |  [optional] |
|**syncState** | [**SyncStateEnum**](#SyncStateEnum) | Specifies whether a folder should be synced to a user&#39;s device or not. This is used by Box Sync (discontinued) and is not used by Box Drive. |  [optional] |
|**canNonOwnersInvite** | **Boolean** | Specifies if users who are not the owner of the folder can invite new collaborators to the folder. |  [optional] |
|**parent** | [**FoldersUpdateFolderRequestParent**](FoldersUpdateFolderRequestParent.md) |  |  [optional] |
|**sharedLink** | [**FoldersUpdateFolderRequestSharedLink**](FoldersUpdateFolderRequestSharedLink.md) |  |  [optional] |
|**folderUploadEmail** | [**FoldersUpdateFolderRequestFolderUploadEmail**](FoldersUpdateFolderRequestFolderUploadEmail.md) |  |  [optional] |
|**isCollaborationRestrictedToEnterprise** | **Boolean** | Specifies if new invites to this folder are restricted to users within the enterprise. This does not affect existing collaborations. |  [optional] |
|**collections** | [**List&lt;Reference2&gt;**](Reference2.md) | An array of collections to make this folder a member of. Currently we only support the &#x60;favorites&#x60; collection.  To get the ID for a collection, use the [List all collections][1] endpoint.  Passing an empty array &#x60;[]&#x60; or &#x60;null&#x60; will remove the folder from all collections.  [1]: e://get-collections |  [optional] |
|**canNonOwnersViewCollaborators** | **Boolean** | Restricts collaborators who are not the owner of this folder from viewing other collaborations on this folder.  It also restricts non-owners from inviting new collaborators.  When setting this field to &#x60;false&#x60;, it is required to also set &#x60;can_non_owners_invite_collaborators&#x60; to &#x60;false&#x60; if it has not already been set. |  [optional] |



## Enum: SyncStateEnum

| Name | Value |
|---- | -----|
| SYNCED | &quot;synced&quot; |
| NOT_SYNCED | &quot;not_synced&quot; |
| PARTIALLY_SYNCED | &quot;partially_synced&quot; |



