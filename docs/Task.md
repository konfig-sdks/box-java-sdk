

# Task

A task allows for file-centric workflows within Box. Users can create tasks on files and assign them to other users for them to complete the tasks.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this task |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;task&#x60; |  [optional] |
|**item** | [**TaskItem**](TaskItem.md) |  |  [optional] |
|**dueAt** | **OffsetDateTime** | When the task is due |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | The type of task the task assignee will be prompted to perform. |  [optional] |
|**message** | **String** | A message that will be included with the task |  [optional] |
|**taskAssignmentCollection** | [**TaskTaskAssignmentCollection**](TaskTaskAssignmentCollection.md) |  |  [optional] |
|**isCompleted** | **Boolean** | Whether the task has been completed |  [optional] |
|**createdBy** | [**TaskCreatedBy**](TaskCreatedBy.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | When the task object was created |  [optional] |
|**completionRule** | [**CompletionRuleEnum**](#CompletionRuleEnum) | Defines which assignees need to complete this task before the task is considered completed.  * &#x60;all_assignees&#x60; requires all assignees to review or approve the the task in order for it to be considered completed. * &#x60;any_assignee&#x60; accepts any one assignee to review or approve the the task in order for it to be considered completed. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TASK | &quot;task&quot; |



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



