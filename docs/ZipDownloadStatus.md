

# ZipDownloadStatus

The status of a `zip` archive being downloaded.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalFileCount** | **Integer** | The total number of files in the archive. |  [optional] |
|**downloadedFileCount** | **Integer** | The number of files that have already been downloaded. |  [optional] |
|**skippedFileCount** | **Integer** | The number of files that have been skipped as they could not be downloaded. In many cases this is due to permission issues that have surfaced between the creation of the request for the archive and the archive being downloaded. |  [optional] |
|**skippedFolderCount** | **Integer** | The number of folders that have been skipped as they could not be downloaded. In many cases this is due to permission issues that have surfaced between the creation of the request for the archive and the archive being downloaded. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The state of the archive being downloaded. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;in_progress&quot; |
| FAILED | &quot;failed&quot; |
| SUCCEEDED | &quot;succeeded&quot; |



