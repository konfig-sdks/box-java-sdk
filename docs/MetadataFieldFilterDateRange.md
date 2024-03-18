

# MetadataFieldFilterDateRange

Match a `date` metadata field to a range of values.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lt** | **OffsetDateTime** | Specifies the (inclusive) upper bound for the metadata field value. The value of a field must be lower than (&#x60;lt&#x60;) or equal to this value for the search query to match this template. |  [optional] |
|**gt** | **OffsetDateTime** | Specifies the (inclusive) lower bound for the metadata field value. The value of a field must be greater than (&#x60;gt&#x60;) or equal to this value for the search query to match this template. |  [optional] |



