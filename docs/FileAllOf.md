

# FileAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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



## Enum: ItemStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| TRASHED | &quot;trashed&quot; |
| DELETED | &quot;deleted&quot; |



