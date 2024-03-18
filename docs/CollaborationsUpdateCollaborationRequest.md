

# CollaborationsUpdateCollaborationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**role** | [**RoleEnum**](#RoleEnum) | The level of access granted. |  |
|**status** | [**StatusEnum**](#StatusEnum) | &lt;!--alex ignore reject--&gt; Set the status of a &#x60;pending&#x60; collaboration invitation, effectively accepting, or rejecting the invite. |  [optional] |
|**expiresAt** | **OffsetDateTime** | Update the expiration date for the collaboration. At this date, the collaboration will be automatically removed from the item.  This feature will only work if the **Automatically remove invited collaborators: Allow folder owners to extend the expiry date** setting has been enabled in the **Enterprise Settings** of the **Admin Console**. When the setting is not enabled, collaborations can not have an expiry date and a value for this field will be result in an error.  Additionally, a collaboration can only be given an expiration if it was created after the **Automatically remove invited collaborator** setting was enabled. |  [optional] |
|**canViewPath** | **Boolean** | Determines if the invited users can see the entire parent path to the associated folder. The user will not gain privileges in any parent folder and therefore can not see content the user is not collaborated on.  Be aware that this meaningfully increases the time required to load the invitee&#39;s **All Files** page. We recommend you limit the number of collaborations with &#x60;can_view_path&#x60; enabled to 1,000 per user.  Only owner or co-owners can invite collaborators with a &#x60;can_view_path&#x60; of &#x60;true&#x60;.  &#x60;can_view_path&#x60; can only be used for folder collaborations. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| EDITOR | &quot;editor&quot; |
| VIEWER | &quot;viewer&quot; |
| PREVIEWER | &quot;previewer&quot; |
| UPLOADER | &quot;uploader&quot; |
| PREVIEWER_UPLOADER | &quot;previewer uploader&quot; |
| VIEWER_UPLOADER | &quot;viewer uploader&quot; |
| CO_OWNER | &quot;co-owner&quot; |
| OWNER | &quot;owner&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| ACCEPTED | &quot;accepted&quot; |
| REJECTED | &quot;rejected&quot; |



