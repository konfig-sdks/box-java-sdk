

# Reply

Reply object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | reply object id. |  [optional] |
|**createdAt** | **OffsetDateTime** | When the reply object was created. |  [optional] |
|**createdBy** | [**FileActivityUser**](FileActivityUser.md) |  |  [optional] |
|**message** | **String** | Reply message |  [optional] |
|**parent** | [**ReplyParent**](ReplyParent.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Reply type |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COMMENT | &quot;comment&quot; |



