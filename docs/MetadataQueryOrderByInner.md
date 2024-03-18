

# MetadataQueryOrderByInner

An object representing one of the metadata template fields to sort the metadata query results by.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fieldKey** | **String** | The metadata template field to order by.  The &#x60;field_key&#x60; represents the &#x60;key&#x60; value of a field from the metadata template being searched for. |  [optional] |
|**direction** | [**DirectionEnum**](#DirectionEnum) | The direction to order by, either ascending or descending.  The &#x60;ordering&#x60; direction must be the same for each item in the array. |  [optional] |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| ASC | &quot;ASC&quot; |
| DESC | &quot;DESC&quot; |
| ASC | &quot;asc&quot; |
| DESC | &quot;desc&quot; |



