

# WorkflowAllOfFlows

A step in a Box Relay Workflow. Each flow contains a `Trigger` and a collection of Outcomes to perform once the conditions of a `Trigger` are met

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier of the flow |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The flow&#39;s resource type |  [optional] |
|**trigger** | [**Object**](Object.md) |  |  [optional] |
|**outcomes** | [**List**](List.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | When this flow was created |  [optional] |
|**createdBy** | [**UserBase**](UserBase.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FLOW | &quot;flow&quot; |



