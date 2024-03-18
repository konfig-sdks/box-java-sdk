

# FilesUpdateFileRequestLock

Defines a lock on an item. This prevents the item from being moved, renamed, or otherwise changed by anyone other than the user who created the lock.  Set this to `null` to remove the lock.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | [**AccessEnum**](#AccessEnum) | The type of this object. |  [optional] |
|**expiresAt** | **OffsetDateTime** | Defines the time at which the lock expires. |  [optional] |
|**isDownloadPrevented** | **Boolean** | Defines if the file can be downloaded while it is locked. |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| LOCK | &quot;lock&quot; |



