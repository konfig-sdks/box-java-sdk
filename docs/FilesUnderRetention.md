

# FilesUnderRetention

A list of files under retention.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**limit** | **Long** | The limit that was used for these entries. This will be the same as the &#x60;limit&#x60; query parameter unless that value exceeded the maximum value allowed. The maximum value varies by API. |  [optional] |
|**nextMarker** | **String** | The marker for the start of the next page of results. |  [optional] |
|**prevMarker** | **String** | The marker for the start of the previous page of results. |  [optional] |
|**entries** | [**List&lt;FileMini&gt;**](FileMini.md) | A list of files |  [optional] |



