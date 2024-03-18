

# MetadataQuery

Create a search using SQL-like syntax to return items that match specific metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**from** | **String** | Specifies the template used in the query. Must be in the form &#x60;scope.templateKey&#x60;. Not all templates can be used in this field, most notably the built-in, Box-provided classification templates can not be used in a query. |  |
|**query** | **String** | The query to perform. A query is a logical expression that is very similar to a SQL &#x60;SELECT&#x60; statement. Values in the search query can be turned into parameters specified in the &#x60;query_param&#x60; arguments list to prevent having to manually insert search values into the query string.  For example, a value of &#x60;:amount&#x60; would represent the &#x60;amount&#x60; value in &#x60;query_params&#x60; object. |  [optional] |
|**queryParams** | **Map&lt;String, String&gt;** | Set of arguments corresponding to the parameters specified in the &#x60;query&#x60;. The type of each parameter used in the &#x60;query_params&#x60; must match the type of the corresponding metadata template field. |  [optional] |
|**ancestorFolderId** | **String** | The ID of the folder that you are restricting the query to. A value of zero will return results from all folders you have access to. A non-zero value will only return results found in the folder corresponding to the ID or in any of its subfolders. |  |
|**orderBy** | [**List&lt;MetadataQueryOrderByInner&gt;**](MetadataQueryOrderByInner.md) | A list of template fields and directions to sort the metadata query results by.  The ordering &#x60;direction&#x60; must be the same for each item in the array. |  [optional] |
|**limit** | **Integer** | A value between 0 and 100 that indicates the maximum number of results to return for a single request. This only specifies a maximum boundary and will not guarantee the minimum number of results returned. |  [optional] |
|**marker** | **String** | Marker to use for requesting the next page. |  [optional] |
|**fields** | **List&lt;String&gt;** | By default, this endpoint returns only the most basic info about the items for which the query matches. This attribute can be used to specify a list of additional attributes to return for any item, including its metadata.  This attribute takes a list of item fields, metadata template identifiers, or metadata template field identifiers.  For example:  * &#x60;created_by&#x60; will add the details of the user who created the item to the response. * &#x60;metadata.&lt;scope&gt;.&lt;templateKey&gt;&#x60; will return the mini-representation of the metadata instance identified by the &#x60;scope&#x60; and &#x60;templateKey&#x60;. * &#x60;metadata.&lt;scope&gt;.&lt;templateKey&gt;.&lt;field&gt;&#x60; will return all the mini-representation of the metadata instance identified by the &#x60;scope&#x60; and &#x60;templateKey&#x60; plus the field specified by the &#x60;field&#x60; name. Multiple fields for the same &#x60;scope&#x60; and &#x60;templateKey&#x60; can be defined. |  [optional] |



