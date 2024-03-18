

# CollaborationAccessibleByAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this object |  |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;group&#x60; |  |
|**name** | **String** | The name of the group |  [optional] |
|**login** | **String** | The primary email address of this user. If the collaboration status is &#x60;pending&#x60;, an empty string is returned. |  [optional] |
|**groupType** | [**GroupTypeEnum**](#GroupTypeEnum) | The type of the group. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GROUP | &quot;group&quot; |



## Enum: GroupTypeEnum

| Name | Value |
|---- | -----|
| MANAGED_GROUP | &quot;managed_group&quot; |
| ALL_USERS_GROUP | &quot;all_users_group&quot; |



