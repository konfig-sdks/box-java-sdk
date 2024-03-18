

# Annotation

Standard representation of an annotation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique id of the annotation |  |
|**type** | [**TypeEnum**](#TypeEnum) | type of the object |  [optional] |
|**description** | [**AnnotationAllOfDescription**](AnnotationAllOfDescription.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | When the annotation object was created. |  [optional] |
|**createdBy** | [**FileActivityUser**](FileActivityUser.md) |  |  [optional] |
|**fileVersion** | [**AnnotationAllOfFileVersion**](AnnotationAllOfFileVersion.md) |  |  |
|**modifiedAt** | **OffsetDateTime** | When the annotation object was modified |  [optional] |
|**modifiedBy** | [**FileActivityUser**](FileActivityUser.md) |  |  [optional] |
|**parent** | [**AnnotationBase**](AnnotationBase.md) |  |  [optional] |
|**permissions** | [**AnnotationAllOfPermissions**](AnnotationAllOfPermissions.md) |  |  [optional] |
|**replies** | [**List&lt;Reply&gt;**](Reply.md) | An array of replies if the annotation has replies, else empty |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | status of the annotation |  [optional] |
|**target** | **Object** |  |  |
|**totalReplyCount** | **Double** | Total replies that are present for the annotation |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ANNOTATION | &quot;annotation&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| RESOLVED | &quot;resolved&quot; |
| DELETED | &quot;deleted&quot; |



