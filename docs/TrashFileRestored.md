

# TrashFileRestored

Represents a file restored from the trash.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The optional description of this file |  |
|**id** | **String** | The unique identifier that represent a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/files/123&#x60; the &#x60;file_id&#x60; is &#x60;123&#x60;. |  |
|**etag** | **String** | The HTTP &#x60;etag&#x60; of this file. This can be used within some API endpoints in the &#x60;If-Match&#x60; and &#x60;If-None-Match&#x60; headers to only perform changes on the file if (no) changes have happened. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;file&#x60; |  |
|**sequenceId** | [**String**](String.md) |  |  |
|**name** | **String** | The name of the file |  [optional] |
|**sha1** | **String** | The SHA1 hash of the file. This can be used to compare the contents of a file on Box with a local file. |  |
|**fileVersion** | [**TrashFileFileVersion**](TrashFileFileVersion.md) |  |  [optional] |
|**size** | **Integer** | The file size in bytes. Be careful parsing this integer as it can get very large and cause an integer overflow. |  |
|**pathCollection** | [**TrashFileRestoredPathCollection**](TrashFileRestoredPathCollection.md) |  |  |
|**createdAt** | **OffsetDateTime** | The date and time when the file was created on Box. |  |
|**modifiedAt** | **OffsetDateTime** | The date and time when the file was last updated on Box. |  |
|**trashedAt** | **String** | The time at which this file was put in the trash - becomes &#x60;null&#x60; after restore. |  [optional] |
|**purgedAt** | **String** | The time at which this file is expected to be purged from the trash  - becomes &#x60;null&#x60; after restore. |  [optional] |
|**contentCreatedAt** | **OffsetDateTime** | The date and time at which this file was originally created, which might be before it was uploaded to Box. |  [optional] |
|**contentModifiedAt** | **OffsetDateTime** | The date and time at which this file was last updated, which might be before it was uploaded to Box. |  [optional] |
|**createdBy** | [**TrashFileCreatedBy**](TrashFileCreatedBy.md) |  |  [optional] |
|**modifiedBy** | [**TrashFileModifiedBy**](TrashFileModifiedBy.md) |  |  |
|**ownedBy** | [**TrashFileOwnedBy**](TrashFileOwnedBy.md) |  |  |
|**sharedLink** | **String** | The shared link for this file. This will be &#x60;null&#x60; if a file had been trashed, even though the original shared link does become active again. |  [optional] |
|**parent** | [**TrashFileParent**](TrashFileParent.md) |  |  [optional] |
|**itemStatus** | [**ItemStatusEnum**](#ItemStatusEnum) | Defines if this item has been deleted or not.  * &#x60;active&#x60; when the item has is not in the trash * &#x60;trashed&#x60; when the item has been moved to the trash but not deleted * &#x60;deleted&#x60; when the item has been permanently deleted. |  |



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



