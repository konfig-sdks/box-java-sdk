

# MetadataQueryIndex

A metadata query index

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the metadata query index. |  [optional] |
|**type** | **String** | Value is always &#x60;metadata_query_index&#x60; |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the metadata query index |  |
|**fields** | [**List&lt;MetadataQueryIndexFieldsInner&gt;**](MetadataQueryIndexFieldsInner.md) | A list of template fields which make up the index. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| BUILDING | &quot;building&quot; |
| ACTIVE | &quot;active&quot; |
| DISABLED | &quot;disabled&quot; |



