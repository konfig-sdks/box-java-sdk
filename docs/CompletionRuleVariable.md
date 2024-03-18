

# CompletionRuleVariable

A completion rule object. Determines if an action should be completed by all or any assignees.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Completion Rule object type.  |  |
|**variableType** | [**VariableTypeEnum**](#VariableTypeEnum) | Variable type for the Completion Rule object.  |  |
|**variableValue** | [**VariableValueEnum**](#VariableValueEnum) | Variable values for a completion rule.  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VARIABLE | &quot;variable&quot; |



## Enum: VariableTypeEnum

| Name | Value |
|---- | -----|
| TASK_COMPLETION_RULE | &quot;task_completion_rule&quot; |



## Enum: VariableValueEnum

| Name | Value |
|---- | -----|
| ALL_ASSIGNEES | &quot;all_assignees&quot; |
| ANY_ASSIGNEES | &quot;any_assignees&quot; |



