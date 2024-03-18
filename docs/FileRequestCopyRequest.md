

# FileRequestCopyRequest

The request body to copy a file request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | An optional new title for the file request. This can be used to change the title of the file request.  This will default to the value on the existing file request. |  [optional] |
|**description** | **String** | An optional new description for the file request. This can be used to change the description of the file request.  This will default to the value on the existing file request. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | An optional new status of the file request.  When the status is set to &#x60;inactive&#x60;, the file request will no longer accept new submissions, and any visitor to the file request URL will receive a &#x60;HTTP 404&#x60; status code.  This will default to the value on the existing file request. |  [optional] |
|**isEmailRequired** | **Boolean** | Whether a file request submitter is required to provide their email address.  When this setting is set to true, the Box UI will show an email field on the file request form.  This will default to the value on the existing file request. |  [optional] |
|**isDescriptionRequired** | **Boolean** | Whether a file request submitter is required to provide a description of the files they are submitting.  When this setting is set to true, the Box UI will show a description field on the file request form.  This will default to the value on the existing file request. |  [optional] |
|**expiresAt** | **OffsetDateTime** | The date after which a file request will no longer accept new submissions.  After this date, the &#x60;status&#x60; will automatically be set to &#x60;inactive&#x60;.  This will default to the value on the existing file request. |  [optional] |
|**folder** | [**FileRequestCopyRequestAllOfFolder**](FileRequestCopyRequestAllOfFolder.md) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |



