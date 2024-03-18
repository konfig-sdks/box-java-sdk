

# WebLink

Web links are objects that point to URLs. These objects are also known as bookmarks within the Box web application.  Web link objects are treated similarly to file objects, they will also support most actions that apply to regular files.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this web link |  |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;web_link&#x60; |  |
|**etag** | **String** | The entity tag of this web link. Used with &#x60;If-Match&#x60; headers. |  [optional] |
|**url** | **String** | The URL this web link points to |  [optional] |
|**sequenceId** | [**String**](String.md) |  |  [optional] |
|**name** | **String** | The name of the web link |  [optional] |
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



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| WEB_LINK | &quot;web_link&quot; |



## Enum: ItemStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| TRASHED | &quot;trashed&quot; |
| DELETED | &quot;deleted&quot; |



