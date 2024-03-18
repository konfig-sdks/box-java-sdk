

# Group

A standard representation of a group, as returned from any group API endpoints by default

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this object |  |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;group&#x60; |  |
|**name** | **String** | The name of the group |  [optional] |
|**groupType** | [**GroupTypeEnum**](#GroupTypeEnum) | The type of the group. |  [optional] |
|**createdAt** | **OffsetDateTime** | When the group object was created |  [optional] |
|**modifiedAt** | **OffsetDateTime** | When the group object was last modified |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GROUP | &quot;group&quot; |



## Enum: GroupTypeEnum

| Name | Value |
|---- | -----|
| MANAGED_GROUP | &quot;managed_group&quot; |
| ALL_USERS_GROUP | &quot;all_users_group&quot; |



