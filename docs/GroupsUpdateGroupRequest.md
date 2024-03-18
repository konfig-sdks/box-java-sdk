

# GroupsUpdateGroupRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A human readable description of the group. |  [optional] |
|**name** | **String** | The name of the new group to be created. Must be unique within the enterprise. |  [optional] |
|**provenance** | **String** | Keeps track of which external source this group is coming, for example &#x60;Active Directory&#x60;, or &#x60;Okta&#x60;.  Setting this will also prevent Box admins from editing the group name and its members directly via the Box web application.  This is desirable for one-way syncing of groups. |  [optional] |
|**externalSyncIdentifier** | **String** | An arbitrary identifier that can be used by external group sync tools to link this Box Group to an external group.  Example values of this field could be an **Active Directory Object ID** or a **Google Group ID**.  We recommend you use of this field in order to avoid issues when group names are updated in either Box or external systems. |  [optional] |
|**invitabilityLevel** | [**InvitabilityLevelEnum**](#InvitabilityLevelEnum) | Specifies who can invite the group to collaborate on folders.  When set to &#x60;admins_only&#x60; the enterprise admin, co-admins, and the group&#39;s admin can invite the group.  When set to &#x60;admins_and_members&#x60; all the admins listed above and group members can invite the group.  When set to &#x60;all_managed_users&#x60; all managed users in the enterprise can invite the group. |  [optional] |
|**memberViewabilityLevel** | [**MemberViewabilityLevelEnum**](#MemberViewabilityLevelEnum) | Specifies who can see the members of the group.  * &#x60;admins_only&#x60; - the enterprise admin, co-admins, group&#39;s   group admin * &#x60;admins_and_members&#x60; - all admins and group members * &#x60;all_managed_users&#x60; - all managed users in the   enterprise |  [optional] |



## Enum: InvitabilityLevelEnum

| Name | Value |
|---- | -----|
| ADMINS_ONLY | &quot;admins_only&quot; |
| ADMINS_AND_MEMBERS | &quot;admins_and_members&quot; |
| ALL_MANAGED_USERS | &quot;all_managed_users&quot; |



## Enum: MemberViewabilityLevelEnum

| Name | Value |
|---- | -----|
| ADMINS_ONLY | &quot;admins_only&quot; |
| ADMINS_AND_MEMBERS | &quot;admins_and_members&quot; |
| ALL_MANAGED_USERS | &quot;all_managed_users&quot; |



