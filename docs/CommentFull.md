

# CommentFull

Comments are messages created on files. Comments can be made independently or created as responses to other comments

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
|**taggedMessage** | **String** | The string representing the comment text with @mentions included. @mention format is @[id:username] where &#x60;id&#x60; is user&#39;s Box ID and &#x60;username&#x60; is their display name. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COMMENT | &quot;comment&quot; |



