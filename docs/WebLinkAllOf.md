

# WebLinkAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description accompanying the web link. This is visible within the Box web application. |  [optional] |
|**parent** | [**FolderMini**](FolderMini.md) |  |  [optional] |
|**pathCollection** | [**Object**](Object.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | When this file was created on Box’s servers. |  [optional] |
|**modifiedAt** | **OffsetDateTime** | When this file was last updated on the Box servers. |  [optional] |
|**trashedAt** | **OffsetDateTime** | When this file was moved to the trash. |  [optional] |
|**purgedAt** | **OffsetDateTime** | When this file will be permanently deleted. |  [optional] |
|**createdBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**modifiedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**ownedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**sharedLink** | [**Object**](Object.md) |  |  [optional] |
|**itemStatus** | [**ItemStatusEnum**](#ItemStatusEnum) | Whether this item is deleted or not. Values include &#x60;active&#x60;, &#x60;trashed&#x60; if the file has been moved to the trash, and &#x60;deleted&#x60; if the file has been permanently deleted |  [optional] |



## Enum: ItemStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| TRASHED | &quot;trashed&quot; |
| DELETED | &quot;deleted&quot; |



