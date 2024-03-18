

# PostCollaborationsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**item** | [**PostCollaborationsRequestItem**](PostCollaborationsRequestItem.md) |  |  |
|**accessibleBy** | [**PostCollaborationsRequestAccessibleBy**](PostCollaborationsRequestAccessibleBy.md) |  |  |
|**role** | [**RoleEnum**](#RoleEnum) | The level of access granted. |  |
|**isAccessOnly** | **Boolean** | If set to &#x60;true&#x60;, collaborators have access to shared items, but such items won&#39;t be visible in the All Files list. Additionally, collaborators won&#39;t see the the path to the root folder for the shared item. |  [optional] |
|**canViewPath** | **Boolean** | Determines if the invited users can see the entire parent path to the associated folder. The user will not gain privileges in any parent folder and therefore can not see content the user is not collaborated on.  Be aware that this meaningfully increases the time required to load the invitee&#39;s **All Files** page. We recommend you limit the number of collaborations with &#x60;can_view_path&#x60; enabled to 1,000 per user.  Only owner or co-owners can invite collaborators with a &#x60;can_view_path&#x60; of &#x60;true&#x60;.  &#x60;can_view_path&#x60; can only be used for folder collaborations. |  [optional] |
|**expiresAt** | **OffsetDateTime** | Set the expiration date for the collaboration. At this date, the collaboration will be automatically removed from the item.  This feature will only work if the **Automatically remove invited collaborators: Allow folder owners to extend the expiry date** setting has been enabled in the **Enterprise Settings** of the **Admin Console**. When the setting is not enabled, collaborations can not have an expiry date and a value for this field will be result in an error. |  [optional] |



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



