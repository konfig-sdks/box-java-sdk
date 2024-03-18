

# WorkflowFull

Box Relay Workflows are objects that represent a named collection of flows.  You application must be authorized to use the `Manage Box Relay` application scope within the developer console in order to use this resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description for a workflow. |  [optional] |
|**id** | **String** | The unique identifier for the workflow |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;workflow&#x60; |  [optional] |
|**name** | **String** | The name of the workflow |  [optional] |
|**isEnabled** | **Boolean** | Specifies if this workflow is enabled |  [optional] |
|**flows** | [**List&lt;WorkflowAllOfFlows&gt;**](WorkflowAllOfFlows.md) | A list of flows assigned to a workflow. |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time when the workflow was created on Box |  [optional] |
|**modifiedAt** | **OffsetDateTime** | The date and time when the workflow was last updated on Box |  [optional] |
|**createdBy** | [**UserBase**](UserBase.md) |  |  [optional] |
|**modifiedBy** | [**UserBase**](UserBase.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| WORKFLOW | &quot;workflow&quot; |



