

# FileVersionFull

A full representation of a file version, as can be returned from any file version API endpoints by default

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier that represent a file version. |  |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;file_version&#x60; |  |
|**sha1** | **String** | The SHA1 hash of this version of the file. |  [optional] |
|**name** | **String** | The name of the file version |  [optional] |
|**size** | **Long** | Size of the file version in bytes |  [optional] |
|**createdAt** | **OffsetDateTime** | When the file version object was created |  [optional] |
|**modifiedAt** | **OffsetDateTime** | When the file version object was last updated |  [optional] |
|**modifiedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**trashedAt** | **OffsetDateTime** | When the file version object was trashed. |  [optional] |
|**trashedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**restoredAt** | **OffsetDateTime** | When the file version was restored from the trash. |  [optional] |
|**restoredBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**purgedAt** | **OffsetDateTime** | When the file version object will be permanently deleted. |  [optional] |
|**uploaderDisplayName** | [**String**](String.md) |  |  [optional] |
|**versionNumber** | **String** | The version number of this file version |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILE_VERSION | &quot;file_version&quot; |



