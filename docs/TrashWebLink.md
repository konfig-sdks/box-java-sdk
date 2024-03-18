

# TrashWebLink

Represents a trashed web link.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description accompanying the web link. This is visible within the Box web application. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;web_link&#x60; |  [optional] |
|**id** | **String** | The unique identifier for this web link |  [optional] |
|**sequenceId** | [**String**](String.md) |  |  [optional] |
|**etag** | **String** | The entity tag of this web link. Used with &#x60;If-Match&#x60; headers. |  [optional] |
|**name** | **String** | The name of the web link |  [optional] |
|**url** | **String** | The URL this web link points to |  [optional] |
|**parent** | [**TrashWebLinkParent**](TrashWebLinkParent.md) |  |  [optional] |
|**pathCollection** | [**TrashWebLinkPathCollection**](TrashWebLinkPathCollection.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | When this file was created on Box’s servers. |  [optional] |
|**modifiedAt** | **OffsetDateTime** | When this file was last updated on the Box servers. |  [optional] |
|**trashedAt** | **OffsetDateTime** | When this file was last moved to the trash. |  [optional] |
|**purgedAt** | **OffsetDateTime** | When this file will be permanently deleted. |  [optional] |
|**createdBy** | [**TrashWebLinkCreatedBy**](TrashWebLinkCreatedBy.md) |  |  [optional] |
|**modifiedBy** | [**TrashWebLinkModifiedBy**](TrashWebLinkModifiedBy.md) |  |  [optional] |
|**ownedBy** | [**TrashWebLinkOwnedBy**](TrashWebLinkOwnedBy.md) |  |  [optional] |
|**sharedLink** | **String** | The shared link for this bookmark. This will be &#x60;null&#x60; if a bookmark has been trashed, since the link will no longer be active. |  [optional] |
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



