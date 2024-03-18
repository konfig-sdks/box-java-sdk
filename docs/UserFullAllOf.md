

# UserFullAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| COADMIN | &quot;coadmin&quot; |
| USER | &quot;user&quot; |



