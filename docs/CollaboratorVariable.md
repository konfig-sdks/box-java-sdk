

# CollaboratorVariable

A collaborator object. Allows to specify a list of user ID's that are affected by the workflow result.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Collaborator object type.  |  |
|**variableType** | [**VariableTypeEnum**](#VariableTypeEnum) | Variable type  for the Collaborator object.  |  |
|**variableValue** | [**List&lt;CollaboratorVariableVariableValueInner&gt;**](CollaboratorVariableVariableValueInner.md) | A list of user IDs. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VARIABLE | &quot;variable&quot; |



## Enum: VariableTypeEnum

| Name | Value |
|---- | -----|
| USER_LIST | &quot;user_list&quot; |



