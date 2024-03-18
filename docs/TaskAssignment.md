

# TaskAssignment

A task assignment defines which task is assigned to which user to complete.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this task assignment |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;task_assignment&#x60; |  [optional] |
|**item** | [**TaskAssignmentItem**](TaskAssignmentItem.md) |  |  [optional] |
|**assignedTo** | [**TaskAssignmentAssignedTo**](TaskAssignmentAssignedTo.md) |  |  [optional] |
|**message** | **String** | A message that will is included with the task assignment. This is visible to the assigned user in the web and mobile UI. |  [optional] |
|**completedAt** | **OffsetDateTime** | The date at which this task assignment was completed. This will be &#x60;null&#x60; if the task is not completed yet. |  [optional] |
|**assignedAt** | **OffsetDateTime** | The date at which this task was assigned to the user. |  [optional] |
|**remindedAt** | **OffsetDateTime** | The date at which the assigned user was reminded of this task assignment. |  [optional] |
|**resolutionState** | [**ResolutionStateEnum**](#ResolutionStateEnum) | The current state of the assignment. The available states depend on the &#x60;action&#x60; value of the task object. |  [optional] |
|**assignedBy** | [**TaskAssignmentAssignedBy**](TaskAssignmentAssignedBy.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TASK_ASSIGNMENT | &quot;task_assignment&quot; |



## Enum: ResolutionStateEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;completed&quot; |
| INCOMPLETE | &quot;incomplete&quot; |
| APPROVED | &quot;approved&quot; |
| REJECTED | &quot;rejected&quot; |



