

# SearchResultsWithSharedLinks

A list of files, folders and web links that matched the search query, including the additional information about any shared links through which the item has been shared with the user.  This response format is only returned when the `include_recent_shared_links` query parameter has been set to `true`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalCount** | **Long** | One greater than the offset of the last entry in the search results. The total number of entries in the collection may be less than &#x60;total_count&#x60;. |  [optional] |
|**limit** | **Long** | The limit that was used for this search. This will be the same as the &#x60;limit&#x60; query parameter unless that value exceeded the maximum value allowed. |  [optional] |
|**offset** | **Long** | The 0-based offset of the first entry in this set. This will be the same as the &#x60;offset&#x60; query parameter used. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Specifies the response as search result items with shared links |  |
|**entries** | [**List&lt;SearchResultWithSharedLink&gt;**](SearchResultWithSharedLink.md) | The search results for the query provided, including the additional information about any shared links through which the item has been shared with the user. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SEARCH_RESULTS_WITH_SHARED_LINKS | &quot;search_results_with_shared_links&quot; |



