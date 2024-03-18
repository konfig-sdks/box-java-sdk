

# RecentItem

A recent item accessed by a user.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | &#x60;recent_item&#x60; |  [optional] |
|**item** | [**RecentItemItem**](RecentItemItem.md) |  |  [optional] |
|**interactionType** | [**InteractionTypeEnum**](#InteractionTypeEnum) | The most recent type of access the user performed on the item. |  [optional] |
|**interactedAt** | **OffsetDateTime** | The time of the most recent interaction. |  [optional] |
|**interactionSharedLink** | **String** | If the item was accessed through a shared link it will appear here, otherwise this will be null. |  [optional] |



## Enum: InteractionTypeEnum

| Name | Value |
|---- | -----|
| PREVIEW | &quot;item_preview&quot; |
| UPLOAD | &quot;item_upload&quot; |
| COMMENT | &quot;item_comment&quot; |
| OPEN | &quot;item_open&quot; |
| MODIFY | &quot;item_modify&quot; |



