

# FolderAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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



## Enum: ItemStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| TRASHED | &quot;trashed&quot; |
| DELETED | &quot;deleted&quot; |



