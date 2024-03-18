

# PostTasksRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**item** | [**PostTasksRequestItem**](PostTasksRequestItem.md) |  |  |
|**action** | [**ActionEnum**](#ActionEnum) | The action the task assignee will be prompted to do. Must be  * &#x60;review&#x60; defines an approval task that can be approved or rejected * &#x60;complete&#x60; defines a general task which can be completed |  [optional] |
|**message** | **String** | An optional message to include with the task. |  [optional] |
|**dueAt** | **OffsetDateTime** | Defines when the task is due. Defaults to &#x60;null&#x60; if not provided. |  [optional] |
|**completionRule** | [**CompletionRuleEnum**](#CompletionRuleEnum) | Defines which assignees need to complete this task before the task is considered completed.  * &#x60;all_assignees&#x60; (default) requires all assignees to review or approve the the task in order for it to be considered completed. * &#x60;any_assignee&#x60; accepts any one assignee to review or approve the the task in order for it to be considered completed. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| REVIEW | &quot;review&quot; |
| COMPLETE | &quot;complete&quot; |



## Enum: CompletionRuleEnum

| Name | Value |
|---- | -----|
| ALL_ASSIGNEES | &quot;all_assignees&quot; |
| ANY_ASSIGNEE | &quot;any_assignee&quot; |



