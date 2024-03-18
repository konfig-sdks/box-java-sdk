

# FaCommentFull

Full representation of a comment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique id of the comment |  |
|**type** | [**TypeEnum**](#TypeEnum) | type of the object |  [optional] |
|**createdAt** | **OffsetDateTime** | When the comment object was created. |  [optional] |
|**createdBy** | [**FileActivityUser**](FileActivityUser.md) |  |  [optional] |
|**isReplyComment** | **Boolean** | Whether or not this comment is a reply to another comment. |  [optional] |
|**item** | [**FaCommentBase**](FaCommentBase.md) |  |  [optional] |
|**message** | **String** | The text of the comment, as provided by the user. |  [optional] |
|**modifiedAt** | **OffsetDateTime** | When the comment object was modified. |  [optional] |
|**parent** | [**FaCommentBase**](FaCommentBase.md) |  |  [optional] |
|**replies** | [**List&lt;Reply&gt;**](Reply.md) | Array of reply comments |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | status of the comment |  [optional] |
|**totalReplyCount** | **Double** | Total replies that are present for the comment |  [optional] |
|**taggedMessage** | **String** | The string representing the comment text with @mentions included. @mention format is @[id:username] where id is user&#39;s Box ID and username is their display name. |  [optional] |
|**permissions** | [**FaCommentFullAllOfPermissions**](FaCommentFullAllOfPermissions.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COMMENT | &quot;comment&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| RESOLVED | &quot;resolved&quot; |
| DELETED | &quot;deleted&quot; |



