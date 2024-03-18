

# FilesCreateCopyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | An optional ID of the specific file version to copy. |  [optional] |
|**name** | **String** | An optional new name for the copied file.  There are some restrictions to the file name. Names containing non-printable ASCII characters, forward and backward slashes (&#x60;/&#x60;, &#x60;\\&#x60;), and protected names like &#x60;.&#x60; and &#x60;..&#x60; are automatically sanitized by removing the non-allowed characters. |  [optional] |
|**parent** | [**FilesCreateCopyRequestParent**](FilesCreateCopyRequestParent.md) |  |  |



