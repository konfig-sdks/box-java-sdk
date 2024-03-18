

# WorkflowsStartBasedOnRequestRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of the parameters object |  [optional] |
|**flow** | [**WorkflowsStartBasedOnRequestRequestFlow**](WorkflowsStartBasedOnRequestRequestFlow.md) |  |  |
|**files** | [**List&lt;WorkflowsStartBasedOnRequestRequestFilesInner&gt;**](WorkflowsStartBasedOnRequestRequestFilesInner.md) | The array of files for which the workflow should start. All files must be in the workflow&#39;s configured folder. |  |
|**folder** | [**WorkflowsStartBasedOnRequestRequestFolder**](WorkflowsStartBasedOnRequestRequestFolder.md) |  |  |
|**outcomes** | [**List&lt;Outcome&gt;**](Outcome.md) | A configurable outcome the workflow should complete. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| WORKFLOW_PARAMETERS | &quot;workflow_parameters&quot; |



