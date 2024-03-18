

# VersionsActivityStart


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | When the &#x60;file_version&#x60; object was created. |  [optional] |
|**createdBy** | [**FaFileVersionCreatedBy**](FaFileVersionCreatedBy.md) |  |  [optional] |
|**id** | **String** | The unique identifier that represent a file version. |  |
|**number** | **Integer** | Version number. |  [optional] |
|**restoredAt** | **OffsetDateTime** | When the &#x60;file_version&#x60; object was restored. |  [optional] |
|**restoredBy** | [**FaFileVersionRestoredBy**](FaFileVersionRestoredBy.md) |  |  [optional] |
|**trashedAt** | **OffsetDateTime** | When the &#x60;file_version&#x60; object was trashed. |  [optional] |
|**trashedBy** | [**FaFileVersionTrashedBy**](FaFileVersionTrashedBy.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;file_version&#x60; |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILE_VERSION | &quot;file_version&quot; |



