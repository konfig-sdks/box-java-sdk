

# SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canDownload** | **Boolean** | If the shared link allows for downloading of files. This can only be set when &#x60;access&#x60; is set to &#x60;open&#x60; or &#x60;company&#x60;. |  [optional] |
|**canPreview** | **Boolean** | If the shared link allows for previewing of files. This value is always &#x60;true&#x60;. For shared links on folders this also applies to any items in the folder. |  [optional] |
|**canEdit** | **Boolean** | If the shared link allows for editing of files. This can only be set when &#x60;access&#x60; is set to &#x60;open&#x60; or &#x60;company&#x60;. This value can only be &#x60;true&#x60; is &#x60;can_download&#x60; is also &#x60;true&#x60;. |  [optional] |



