

# SearchResultWithSharedLink

A single of files, folder or web link that matched the search query, including the additional information about the shared link through which the item has been shared with the user.  This response format is only returned when the `include_recent_shared_links` query parameter has been set to `true`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessibleViaSharedLink** | **String** | The optional shared link through which the user has access to this item. This value is only returned for items for which the user has recently accessed the file through a shared link. For all other items this value will return &#x60;null&#x60;. |  [optional] |
|**item** | [**SearchResultWithSharedLinkItem**](SearchResultWithSharedLinkItem.md) |  |  [optional] |
|**type** | **String** | The result type. The value is always &#x60;search_result&#x60;. |  [optional] |



