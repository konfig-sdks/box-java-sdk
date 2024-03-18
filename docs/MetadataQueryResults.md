

# MetadataQueryResults

A page of files and folders that matched the metadata query.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entries** | **List&lt;Object&gt;** | The mini representation of the files and folders that match the search terms.  By default, this endpoint returns only the most basic info about the items. To get additional fields for each item, including any of the metadata, use the &#x60;fields&#x60; attribute in the query. |  [optional] |
|**limit** | **Long** | The limit that was used for this search. This will be the same as the &#x60;limit&#x60; query parameter unless that value exceeded the maximum value allowed. |  [optional] |
|**nextMarker** | **String** | The marker for the start of the next page of results. |  [optional] |



