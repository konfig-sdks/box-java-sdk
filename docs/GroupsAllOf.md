

# GroupsAllOf

The part of an API response that describes pagination

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalCount** | **Long** | One greater than the offset of the last entry in the entire collection. The total number of entries in the collection may be less than &#x60;total_count&#x60;.  This field is only returned for calls that use offset-based pagination. For marker-based paginated APIs, this field will be omitted. |  [optional] |
|**limit** | **Long** | The limit that was used for these entries. This will be the same as the &#x60;limit&#x60; query parameter unless that value exceeded the maximum value allowed. The maximum value varies by API. |  [optional] |
|**offset** | **Long** | The 0-based offset of the first entry in this set. This will be the same as the &#x60;offset&#x60; query parameter.  This field is only returned for calls that use offset-based pagination. For marker-based paginated APIs, this field will be omitted. |  [optional] |
|**order** | [**List&lt;GroupsAllOfOrder&gt;**](GroupsAllOfOrder.md) | The order by which items are returned.  This field is only returned for calls that use offset-based pagination. For marker-based paginated APIs, this field will be omitted. |  [optional] |



