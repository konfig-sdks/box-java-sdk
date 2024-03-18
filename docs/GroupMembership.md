

# GroupMembership

Membership is used to signify that a user is part of a group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this group membership |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;group_membership&#x60; |  [optional] |
|**user** | [**GroupMembershipUser**](GroupMembershipUser.md) |  |  [optional] |
|**group** | [**GroupMembershipGroup**](GroupMembershipGroup.md) |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | The role of the user in the group. |  [optional] |
|**createdAt** | **OffsetDateTime** | The time this membership was created. |  [optional] |
|**modifiedAt** | **OffsetDateTime** | The time this membership was last modified. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GROUP_MEMBERSHIP | &quot;group_membership&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| MEMBER | &quot;member&quot; |
| ADMIN | &quot;admin&quot; |



