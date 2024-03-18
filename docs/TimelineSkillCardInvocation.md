

# TimelineSkillCardInvocation

The invocation of this service, used to track which instance of a service applied the metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;skill_invocation&#x60; |  |
|**id** | **String** | A custom identifier that represent the instance of the service that applied this metadata. For example, if your &#x60;image-recognition-service&#x60; runs on multiple nodes, this field can be used to identify the ID of the node that was used to apply the metadata. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SKILL_INVOCATION | &quot;skill_invocation&quot; |



