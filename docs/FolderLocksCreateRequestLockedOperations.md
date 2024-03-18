

# FolderLocksCreateRequestLockedOperations

The operations to lock for the folder. If `locked_operations` is included in the request, both `move` and `delete` must also be included and both set to `true`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**move** | **Boolean** | Whether moving the folder should be locked. |  |
|**delete** | **Boolean** | Whether deleting the folder should be locked. |  |



