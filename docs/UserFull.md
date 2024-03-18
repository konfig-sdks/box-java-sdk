

# UserFull

A full representation of a user, as can be returned from any user API endpoint.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this user |  |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;user&#x60; |  |
|**name** | **String** | The display name of this user |  [optional] |
|**login** | **String** | The primary email address of this user |  [optional] |
|**createdAt** | **OffsetDateTime** | When the user object was created |  [optional] |
|**modifiedAt** | **OffsetDateTime** | When the user object was last modified |  [optional] |
|**language** | **String** | The language of the user, formatted in modified version of the [ISO 639-1](https://raw.githubusercontent.com) format. |  [optional] |
|**timezone** | **String** | The user&#39;s timezone |  [optional] |
|**spaceAmount** | **Long** | The user’s total available space amount in bytes |  [optional] |
|**spaceUsed** | **Long** | The amount of space in use by the user |  [optional] |
|**maxUploadSize** | **Long** | The maximum individual file size in bytes the user can have |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The user&#39;s account status |  [optional] |
|**jobTitle** | **String** | The user’s job title |  [optional] |
|**phone** | **String** | The user’s phone number |  [optional] |
|**address** | **String** | The user’s address |  [optional] |
|**avatarUrl** | **String** | URL of the user’s avatar image |  [optional] |
|**notificationEmail** | [**UserAllOfNotificationEmail**](UserAllOfNotificationEmail.md) |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | The user’s enterprise role |  [optional] |
|**trackingCodes** | [**List&lt;TrackingCode&gt;**](TrackingCode.md) | Tracking codes allow an admin to generate reports from the admin console and assign an attribute to a specific group of users. This setting must be enabled for an enterprise before it can be used. |  [optional] |
|**canSeeManagedUsers** | **Boolean** | Whether the user can see other enterprise users in their contact list |  [optional] |
|**isSyncEnabled** | **Boolean** | Whether the user can use Box Sync |  [optional] |
|**isExternalCollabRestricted** | **Boolean** | Whether the user is allowed to collaborate with users outside their enterprise |  [optional] |
|**isExemptFromDeviceLimits** | **Boolean** | Whether to exempt the user from Enterprise device limits |  [optional] |
|**isExemptFromLoginVerification** | **Boolean** | Whether the user must use two-factor authentication |  [optional] |
|**enterprise** | [**Object**](Object.md) |  |  [optional] |
|**myTags** | **List&lt;String&gt;** | Tags for all files and folders owned by the user. Values returned will only contain tags that were set by the requester. |  [optional] |
|**hostname** | **String** | The root (protocol, subdomain, domain) of any links that need to be generated for the user |  [optional] |
|**isPlatformAccessOnly** | **Boolean** | Whether the user is an App User |  [optional] |
|**externalAppUserId** | **String** | An external identifier for an app user, which can be used to look up the user. This can be used to tie user IDs from external identity providers to Box users. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| CANNOT_DELETE_EDIT | &quot;cannot_delete_edit&quot; |
| CANNOT_DELETE_EDIT_UPLOAD | &quot;cannot_delete_edit_upload&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| COADMIN | &quot;coadmin&quot; |
| USER | &quot;user&quot; |



