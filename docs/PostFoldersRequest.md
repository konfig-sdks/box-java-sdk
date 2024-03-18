

# PostFoldersRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name for the new folder.  There are some restrictions to the file name. Names containing non-printable ASCII characters, forward and backward slashes (&#x60;/&#x60;, &#x60;\\&#x60;), as well as names with trailing spaces are prohibited.  Additionally, the names &#x60;.&#x60; and &#x60;..&#x60; are not allowed either. |  |
|**parent** | [**PostFoldersRequestParent**](PostFoldersRequestParent.md) |  |  |
|**folderUploadEmail** | [**PostFoldersRequestFolderUploadEmail**](PostFoldersRequestFolderUploadEmail.md) |  |  [optional] |
|**syncState** | [**SyncStateEnum**](#SyncStateEnum) | Specifies whether a folder should be synced to a user&#39;s device or not. This is used by Box Sync (discontinued) and is not used by Box Drive. |  [optional] |



## Enum: SyncStateEnum

| Name | Value |
|---- | -----|
| SYNCED | &quot;synced&quot; |
| NOT_SYNCED | &quot;not_synced&quot; |
| PARTIALLY_SYNCED | &quot;partially_synced&quot; |



