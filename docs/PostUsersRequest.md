

# PostUsersRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the user |  |
|**login** | **String** | The email address the user uses to log in  Required, unless &#x60;is_platform_access_only&#x60; is set to &#x60;true&#x60;. |  [optional] |
|**isPlatformAccessOnly** | **Boolean** | Specifies that the user is an app user. |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | The user’s enterprise role |  [optional] |
|**language** | **String** | The language of the user, formatted in modified version of the [ISO 639-1](https://raw.githubusercontent.com) format. |  [optional] |
|**isSyncEnabled** | **Boolean** | Whether the user can use Box Sync |  [optional] |
|**jobTitle** | **String** | The user’s job title |  [optional] |
|**phone** | **String** | The user’s phone number |  [optional] |
|**address** | **String** | The user’s address |  [optional] |
|**spaceAmount** | **Long** | The user’s total available space in bytes. Set this to &#x60;-1&#x60; to indicate unlimited storage. |  [optional] |
|**trackingCodes** | [**List&lt;TrackingCode&gt;**](TrackingCode.md) | Tracking codes allow an admin to generate reports from the admin console and assign an attribute to a specific group of users. This setting must be enabled for an enterprise before it can be used. |  [optional] |
|**canSeeManagedUsers** | **Boolean** | Whether the user can see other enterprise users in their contact list |  [optional] |
|**timezone** | **String** | The user&#39;s timezone |  [optional] |
|**isExternalCollabRestricted** | **Boolean** | Whether the user is allowed to collaborate with users outside their enterprise |  [optional] |
|**isExemptFromDeviceLimits** | **Boolean** | Whether to exempt the user from enterprise device limits |  [optional] |
|**isExemptFromLoginVerification** | **Boolean** | Whether the user must use two-factor authentication |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The user&#39;s account status |  [optional] |
|**externalAppUserId** | **String** | An external identifier for an app user, which can be used to look up the user. This can be used to tie user IDs from external identity providers to Box users. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| COADMIN | &quot;coadmin&quot; |
| USER | &quot;user&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| CANNOT_DELETE_EDIT | &quot;cannot_delete_edit&quot; |
| CANNOT_DELETE_EDIT_UPLOAD | &quot;cannot_delete_edit_upload&quot; |



