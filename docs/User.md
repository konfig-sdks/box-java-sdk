

# User

A standard representation of a user, as returned from any user API endpoints by default

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



