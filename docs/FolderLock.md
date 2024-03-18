

# FolderLock

Folder locks define access restrictions placed by folder owners to prevent specific folders from being moved or deleted.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**folder** | [**FolderLockFolder**](FolderLockFolder.md) |  |  [optional] |
|**id** | **String** | The unique identifier for this folder lock. |  [optional] |
|**type** | **String** | The object type, always &#x60;folder_lock&#x60;. |  [optional] |
|**createdBy** | [**FolderLockCreatedBy**](FolderLockCreatedBy.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | When the folder lock object was created. |  [optional] |
|**lockedOperations** | [**FolderLockLockedOperations**](FolderLockLockedOperations.md) |  |  [optional] |
|**lockType** | **String** | The lock type, always &#x60;freeze&#x60;. |  [optional] |



