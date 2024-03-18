

# TaskAssigneesEntriesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**completedAt** | **OffsetDateTime** | When the task assigned was completed. |  [optional] |
|**id** | **String** |  |  [optional] |
|**modifiedAt** | **OffsetDateTime** | When the task assigned was modified. |  [optional] |
|**permissions** | [**TaskAssigneesEntriesInnerPermissions**](TaskAssigneesEntriesInnerPermissions.md) |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**target** | [**FileActivityUser**](FileActivityUser.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| ASSIGNEE | &quot;assignee&quot; |
| CREATOR | &quot;creator&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |
| COMPLETED | &quot;completed&quot; |
| NOT_STARTED | &quot;not_started&quot; |
| REJECTED | &quot;rejected&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TASK_COLLABORATOR | &quot;task_collaborator&quot; |



