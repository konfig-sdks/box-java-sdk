

# FileVersionRetention

A retention policy blocks permanent deletion of content for a specified amount of time. Admins can apply policies to specified folders, or an entire enterprise. A file version retention is a  record for a retained file version. To use this feature, you must  have the manage retention policies scope enabled for your API key via  your application management console. For more information about retention policies, please visit our help documentation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this file version retention. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;file_version_retention&#x60; |  [optional] |
|**fileVersion** | [**FileVersionRetentionFileVersion**](FileVersionRetentionFileVersion.md) |  |  [optional] |
|**_file** | [**FileVersionRetentionFile**](FileVersionRetentionFile.md) |  |  [optional] |
|**appliedAt** | **OffsetDateTime** | When this file version retention object was created |  [optional] |
|**dispositionAt** | **OffsetDateTime** | When the retention expires on this file version retention |  [optional] |
|**winningRetentionPolicy** | [**FileVersionRetentionWinningRetentionPolicy**](FileVersionRetentionWinningRetentionPolicy.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILE_VERSION_RETENTION | &quot;file_version_retention&quot; |



