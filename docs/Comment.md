

# Comment

Standard representation of a comment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this comment. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;comment&#x60; |  [optional] |
|**isReplyComment** | **Boolean** | Whether or not this comment is a reply to another comment |  [optional] |
|**message** | **String** | The text of the comment, as provided by the user |  [optional] |
|**createdBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The time this comment was created |  [optional] |
|**modifiedAt** | **OffsetDateTime** | The time this comment was last modified |  [optional] |
|**item** | [**Object**](Object.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COMMENT | &quot;comment&quot; |



