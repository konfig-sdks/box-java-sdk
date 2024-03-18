

# CollaborationItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this web link |  |
|**etag** | **String** | The entity tag of this web link. Used with &#x60;If-Match&#x60; headers. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;web_link&#x60; |  |
|**sequenceId** | [**String**](String.md) |  |  [optional] |
|**name** | **String** | The name of the web link |  [optional] |
|**sha1** | **String** | The SHA1 hash of the file. This can be used to compare the contents of a file on Box with a local file. |  [optional] |
|**fileVersion** | [**FileVersionMini**](FileVersionMini.md) |  |  [optional] |
|**description** | **String** | The description accompanying the web link. This is visible within the Box web application. |  [optional] |
|**size** | **Long** | The folder size in bytes.  Be careful parsing this integer as its value can get very large. |  [optional] |
|**pathCollection** | [**Object**](Object.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | When this file was created on Box’s servers. |  [optional] |
|**modifiedAt** | **OffsetDateTime** | When this file was last updated on the Box servers. |  [optional] |
|**trashedAt** | **OffsetDateTime** | When this file was moved to the trash. |  [optional] |
|**purgedAt** | **OffsetDateTime** | When this file will be permanently deleted. |  [optional] |
|**contentCreatedAt** | **OffsetDateTime** | The date and time at which this folder was originally created. |  [optional] |
|**contentModifiedAt** | **OffsetDateTime** | The date and time at which this folder was last updated. |  [optional] |
|**createdBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**modifiedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**ownedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**sharedLink** | [**Object**](Object.md) |  |  [optional] |
|**parent** | [**FolderMini**](FolderMini.md) |  |  [optional] |
|**itemStatus** | [**ItemStatusEnum**](#ItemStatusEnum) | Whether this item is deleted or not. Values include &#x60;active&#x60;, &#x60;trashed&#x60; if the file has been moved to the trash, and &#x60;deleted&#x60; if the file has been permanently deleted |  [optional] |
|**folderUploadEmail** | [**FolderAllOfFolderUploadEmail**](FolderAllOfFolderUploadEmail.md) |  |  [optional] |
|**itemCollection** | [**Items**](Items.md) |  |  [optional] |
|**url** | **String** | The URL this web link points to |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| WEB_LINK | &quot;web_link&quot; |



## Enum: ItemStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| TRASHED | &quot;trashed&quot; |
| DELETED | &quot;deleted&quot; |



