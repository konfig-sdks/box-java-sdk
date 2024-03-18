

# PostCollaborationsRequestAccessibleBy

The user or group to give access to the item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of collaborator to invite. |  |
|**id** | **String** | The ID of the user or group.  Alternatively, use &#x60;login&#x60; to specify a user by email address. |  [optional] |
|**login** | **String** | The email address of the user to grant access to the item.  Alternatively, use &#x60;id&#x60; to specify a user by user ID. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| GROUP | &quot;group&quot; |



