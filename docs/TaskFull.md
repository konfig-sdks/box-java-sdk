

# TaskFull

The full representation of a task.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dueAt** | **OffsetDateTime** | When the task was due. |  [optional] |
|**id** | **String** | A unique id of the task |  |
|**type** | [**TypeEnum**](#TypeEnum) | type of the object |  [optional] |
|**description** | **String** | Description of the task. |  [optional] |
|**assignedTo** | [**TaskAssignees**](TaskAssignees.md) |  |  [optional] |
|**completedAt** | **OffsetDateTime** | When the task was completed. |  [optional] |
|**completionRule** | [**CompletionRuleEnum**](#CompletionRuleEnum) | Rule to complete the task. |  [optional] |
|**createdAt** | **OffsetDateTime** | When the task was created. |  [optional] |
|**createdBy** | [**FileActivityUser**](FileActivityUser.md) |  |  [optional] |
|**modifiedAt** | **OffsetDateTime** | When the task was modified. |  [optional] |
|**permissions** | [**TaskFullAllOfPermissions**](TaskFullAllOfPermissions.md) |  |  [optional] |
|**progressAt** | **OffsetDateTime** | When the task progress was started. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the task |  [optional] |
|**taskLinks** | [**TaskLinks**](TaskLinks.md) |  |  [optional] |
|**taskType** | [**TaskTypeEnum**](#TaskTypeEnum) | Type of the task |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TASK | &quot;task&quot; |



## Enum: CompletionRuleEnum

| Name | Value |
|---- | -----|
| ALL_ASSIGNEES | &quot;all_assignees&quot; |
| ANY_ASSIGNEE | &quot;any_assignee&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |
| COMPLETED | &quot;completed&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| NOT_STARTED | &quot;not_started&quot; |
| REJECTED | &quot;rejected&quot; |



## Enum: TaskTypeEnum

| Name | Value |
|---- | -----|
| APPROVAL | &quot;approval&quot; |
| GENERAL | &quot;general&quot; |



