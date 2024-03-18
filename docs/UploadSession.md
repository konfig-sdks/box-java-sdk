

# UploadSession

An upload session for chunk uploading a file.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this session |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;upload_session&#x60; |  [optional] |
|**sessionExpiresAt** | **OffsetDateTime** | The date and time when this session expires. |  [optional] |
|**partSize** | **Long** | The  size in bytes that must be used for all parts of of the upload.  Only the last part is allowed to be of a smaller size. |  [optional] |
|**totalParts** | **Integer** | The total number of parts expected in this upload session, as determined by the file size and part size. |  [optional] |
|**numPartsProcessed** | **Integer** | The number of parts that have been uploaded and processed by the server. This starts at &#x60;0&#x60;.  When committing a file files, inspecting this property can provide insight if all parts have been uploaded correctly. |  [optional] |
|**sessionEndpoints** | [**UploadSessionSessionEndpoints**](UploadSessionSessionEndpoints.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UPLOAD_SESSION | &quot;upload_session&quot; |



