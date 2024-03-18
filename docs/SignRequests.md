

# SignRequests

A standard representation of a sign request, as returned from any Box Sign API endpoints by default.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**limit** | **Long** | The limit that was used for these entries. This will be the same as the &#x60;limit&#x60; query parameter unless that value exceeded the maximum value allowed. The maximum value varies by API. |  [optional] |
|**nextMarker** | **String** | The marker for the start of the next page of results. |  [optional] |
|**entries** | [**List&lt;SignRequest&gt;**](SignRequest.md) | A list of sign requests |  [optional] |



