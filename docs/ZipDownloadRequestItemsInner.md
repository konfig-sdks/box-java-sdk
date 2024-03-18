

# ZipDownloadRequestItemsInner

An item to add to the `zip` archive. This can be a file or a folder.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of the item to add to the archive. |  |
|**id** | **String** | The identifier of the item to add to the archive. When this item is a folder then this can not be the root folder with ID &#x60;0&#x60;. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILE | &quot;file&quot; |
| FOLDER | &quot;folder&quot; |



