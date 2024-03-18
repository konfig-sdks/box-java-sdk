

# EventSourceAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier that represent a folder.  The ID for any folder can be determined by visiting a folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folders/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;. |  |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;folder&#x60; |  |
|**name** | **String** | The name of the folder. |  [optional] |
|**login** | **String** | The primary email address of this user |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time when the folder was created. This value may be &#x60;null&#x60; for some folders such as the root folder or the trash folder. |  [optional] |
|**modifiedAt** | **OffsetDateTime** | The date and time when the folder was last updated. This value may be &#x60;null&#x60; for some folders such as the root folder or the trash folder. |  [optional] |
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
|**itemType** | [**ItemTypeEnum**](#ItemTypeEnum) | The type of the item that the event represents. Can be &#x60;file&#x60; or &#x60;folder&#x60;.  |  |
|**itemId** | **String** | The unique identifier that represents the item.  |  |
|**itemName** | **String** | The name of the item.  |  |
|**classification** | [**EventSourceClassification**](EventSourceClassification.md) |  |  [optional] |
|**parent** | [**FolderMini**](FolderMini.md) |  |  [optional] |
|**ownedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**etag** | **String** | The HTTP &#x60;etag&#x60; of this folder. This can be used within some API endpoints in the &#x60;If-Match&#x60; and &#x60;If-None-Match&#x60; headers to only perform changes on the folder if (no) changes have happened. |  [optional] |
|**sequenceId** | [**String**](String.md) |  |  [optional] |
|**sha1** | **String** | The SHA1 hash of the file. This can be used to compare the contents of a file on Box with a local file. |  [optional] |
|**fileVersion** | [**FileVersionMini**](FileVersionMini.md) |  |  [optional] |
|**description** | [**String**](String.md) |  |  [optional] |
|**size** | **Long** | The folder size in bytes.  Be careful parsing this integer as its value can get very large. |  [optional] |
|**pathCollection** | [**Object**](Object.md) |  |  [optional] |
|**trashedAt** | **OffsetDateTime** | The time at which this folder was put in the trash. |  [optional] |
|**purgedAt** | **OffsetDateTime** | The time at which this folder is expected to be purged from the trash. |  [optional] |
|**contentCreatedAt** | **OffsetDateTime** | The date and time at which this folder was originally created. |  [optional] |
|**contentModifiedAt** | **OffsetDateTime** | The date and time at which this folder was last updated. |  [optional] |
|**createdBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**modifiedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**sharedLink** | [**Object**](Object.md) |  |  [optional] |
|**itemStatus** | [**ItemStatusEnum**](#ItemStatusEnum) | Defines if this item has been deleted or not.  * &#x60;active&#x60; when the item has is not in the trash * &#x60;trashed&#x60; when the item has been moved to the trash but not deleted * &#x60;deleted&#x60; when the item has been permanently deleted. |  [optional] |
|**folderUploadEmail** | [**FolderAllOfFolderUploadEmail**](FolderAllOfFolderUploadEmail.md) |  |  [optional] |
|**itemCollection** | [**Items**](Items.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FOLDER | &quot;folder&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| CANNOT_DELETE_EDIT | &quot;cannot_delete_edit&quot; |
| CANNOT_DELETE_EDIT_UPLOAD | &quot;cannot_delete_edit_upload&quot; |



## Enum: ItemTypeEnum

| Name | Value |
|---- | -----|
| FILE | &quot;file&quot; |
| FOLDER | &quot;folder&quot; |



## Enum: ItemStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| TRASHED | &quot;trashed&quot; |
| DELETED | &quot;deleted&quot; |



