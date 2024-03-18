

# GroupMembershipsCreateMembershipRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**user** | [**GroupMembershipsCreateMembershipRequestUser**](GroupMembershipsCreateMembershipRequestUser.md) |  |  |
|**group** | [**GroupMembershipsCreateMembershipRequestGroup**](GroupMembershipsCreateMembershipRequestGroup.md) |  |  |
|**role** | [**RoleEnum**](#RoleEnum) | The role of the user in the group. |  [optional] |
|**configurablePermissions** | **Map&lt;String, Boolean&gt;** | Custom configuration for the permissions an admin if a group will receive. This option has no effect on members with a role of &#x60;member&#x60;.  Setting these permissions overwrites the default access levels of an admin.  Specifying a value of \&quot;null\&quot; for this object will disable all configurable permissions. Specifying permissions will set them accordingly, omitted permissions will be enabled by default. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| MEMBER | &quot;member&quot; |
| ADMIN | &quot;admin&quot; |



