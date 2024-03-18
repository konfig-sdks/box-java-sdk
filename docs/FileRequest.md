

# FileRequest

A standard representation of a file request, as returned from any file request API endpoints by default.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of file request. This is shown in the Box UI to users uploading files.  This defaults to title of the file request that was copied to create this file request. |  [optional] |
|**description** | **String** | The optional description of this file request. This is shown in the Box UI to users uploading files.  This defaults to description of the file request that was copied to create this file request. |  [optional] |
|**id** | **String** | The unique identifier for this file request. |  [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;file_request&#x60; |  [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the file request. This defaults to &#x60;active&#x60;.  When the status is set to &#x60;inactive&#x60;, the file request will no longer accept new submissions, and any visitor to the file request URL will receive a &#x60;HTTP 404&#x60; status code.  This defaults to status of file request that was copied to create this file request. |  [optional] |
|**isEmailRequired** | **Boolean** | Whether a file request submitter is required to provide their email address.  When this setting is set to true, the Box UI will show an email field on the file request form.  This defaults to setting of file request that was copied to create this file request. |  [optional] |
|**isDescriptionRequired** | **Boolean** | Whether a file request submitter is required to provide a description of the files they are submitting.  When this setting is set to true, the Box UI will show a description field on the file request form.  This defaults to setting of file request that was copied to create this file request. |  [optional] |
|**expiresAt** | **OffsetDateTime** | The date after which a file request will no longer accept new submissions.  After this date, the &#x60;status&#x60; will automatically be set to &#x60;inactive&#x60;. |  [optional] |
|**folder** | [**FileRequestFolder**](FileRequestFolder.md) |  |  |
|**url** | **String** | The generated URL for this file request. This URL can be shared with users to let them upload files to the associated folder. |  [optional] [readonly] |
|**etag** | **String** | The HTTP &#x60;etag&#x60; of this file. This can be used in combination with the &#x60;If-Match&#x60; header when updating a file request. By providing that header, a change will only be performed on the  file request if the &#x60;etag&#x60; on the file request still matches the &#x60;etag&#x60; provided in the &#x60;If-Match&#x60; header. |  [optional] |
|**createdBy** | [**FileRequestCreatedBy**](FileRequestCreatedBy.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time when the file request was created. |  |
|**updatedBy** | [**FileRequestUpdatedBy**](FileRequestUpdatedBy.md) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** | The date and time when the file request was last updated. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILE_REQUEST | &quot;file_request&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |



