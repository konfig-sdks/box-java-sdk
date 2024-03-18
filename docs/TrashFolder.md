

# TrashFolder

Represents a trashed folder.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | [**String**](String.md) |  |  |
|**id** | **String** | The unique identifier that represent a folder.  The ID for any folder can be determined by visiting a folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folders/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;. |  |
|**etag** | **String** | The HTTP &#x60;etag&#x60; of this folder. This can be used within some API endpoints in the &#x60;If-Match&#x60; and &#x60;If-None-Match&#x60; headers to only perform changes on the folder if (no) changes have happened. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;folder&#x60; |  |
|**sequenceId** | [**String**](String.md) |  |  [optional] |
|**name** | **String** | The name of the folder. |  |
|**createdAt** | **OffsetDateTime** | The date and time when the folder was created. This value may be &#x60;null&#x60; for some folders such as the root folder or the trash folder. |  [optional] |
|**modifiedAt** | **OffsetDateTime** | The date and time when the folder was last updated. This value may be &#x60;null&#x60; for some folders such as the root folder or the trash folder. |  [optional] |
|**size** | **Long** | The folder size in bytes.  Be careful parsing this integer as its value can get very large. |  |
|**pathCollection** | [**TrashFolderPathCollection**](TrashFolderPathCollection.md) |  |  |
|**createdBy** | [**TrashFolderCreatedBy**](TrashFolderCreatedBy.md) |  |  |
|**modifiedBy** | [**TrashFolderModifiedBy**](TrashFolderModifiedBy.md) |  |  |
|**trashedAt** | **OffsetDateTime** | The time at which this folder was put in the trash. |  [optional] |
|**purgedAt** | **OffsetDateTime** | The time at which this folder is expected to be purged from the trash. |  [optional] |
|**contentCreatedAt** | **OffsetDateTime** | The date and time at which this folder was originally created. |  [optional] |
|**contentModifiedAt** | **OffsetDateTime** | The date and time at which this folder was last updated. |  [optional] |
|**ownedBy** | [**TrashFolderOwnedBy**](TrashFolderOwnedBy.md) |  |  |
|**sharedLink** | **String** | The shared link for this folder. This will be &#x60;null&#x60; if a folder has been trashed, since the link will no longer be active. |  [optional] |
|**folderUploadEmail** | **String** | The folder upload email for this folder. This will be &#x60;null&#x60; if a folder has been trashed, since the upload will no longer work. |  [optional] |
|**parent** | [**TrashFolderParent**](TrashFolderParent.md) |  |  [optional] |
|**itemStatus** | [**ItemStatusEnum**](#ItemStatusEnum) | Defines if this item has been deleted or not.  * &#x60;active&#x60; when the item has is not in the trash * &#x60;trashed&#x60; when the item has been moved to the trash but not deleted * &#x60;deleted&#x60; when the item has been permanently deleted. |  |



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



