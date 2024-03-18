

# ZipDownloadNameConflictsInnerInner

A file or folder for which a conflict was encountered, This object provides the type and identifier of the original item, as well as a mapping between its original name and it's new name as it will appear in the archive.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier of the item |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of this item |  [optional] |
|**originalName** | **String** | The original name of this item |  [optional] |
|**downloadName** | **String** | The new name of this item as it will appear in the downloaded &#x60;zip&#x60; archive. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILE | &quot;file&quot; |
| FOLDER | &quot;folder&quot; |



