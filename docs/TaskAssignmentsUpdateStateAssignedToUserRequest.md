

# TaskAssignmentsUpdateStateAssignedToUserRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** | An optional message by the assignee that can be added to the task. |  [optional] |
|**resolutionState** | [**ResolutionStateEnum**](#ResolutionStateEnum) | The state of the task assigned to the user.  * For a task with an &#x60;action&#x60; value of &#x60;complete&#x60; this can be &#x60;incomplete&#x60; or &#x60;completed&#x60;. * For a task with an &#x60;action&#x60; of &#x60;review&#x60; this can be &#x60;incomplete&#x60;, &#x60;approved&#x60;, or &#x60;rejected&#x60;. |  [optional] |



## Enum: ResolutionStateEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;completed&quot; |
| INCOMPLETE | &quot;incomplete&quot; |
| APPROVED | &quot;approved&quot; |
| REJECTED | &quot;rejected&quot; |



