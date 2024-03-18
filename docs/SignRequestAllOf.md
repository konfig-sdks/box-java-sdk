

# SignRequestAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | object type |  [optional] |
|**sourceFiles** | [**List&lt;FileBase&gt;**](FileBase.md) | List of files to create a signing document from. This is currently limited to ten files. Only the ID and type fields are required for each file. |  [optional] |
|**signers** | [**List&lt;SignRequestSigner&gt;**](SignRequestSigner.md) | Array of signers for the sign request |  [optional] |
|**signatureColor** | **String** | Force a specific color for the signature (blue, black, or red). |  [optional] |
|**id** | **String** | Sign request ID |  [optional] |
|**prepareUrl** | **String** | This URL is returned if &#x60;is_document_preparation_needed&#x60; is set to &#x60;true&#x60; in the request. It is used to prepare the sign request via UI. The sign request is not sent until preparation is complete. |  [optional] |
|**signingLog** | [**FileMini**](FileMini.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Describes the status of the sign request |  [optional] |
|**signFiles** | [**SignRequestAllOfSignFiles**](SignRequestAllOfSignFiles.md) |  |  [optional] |
|**autoExpireAt** | **OffsetDateTime** | Uses &#x60;days_valid&#x60; to calculate the date and time, in GMT, the sign request will expire if unsigned. |  [optional] |
|**parentFolder** | [**FolderMini**](FolderMini.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SIGN_REQUEST | &quot;sign-request&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONVERTING | &quot;converting&quot; |
| CREATED | &quot;created&quot; |
| SENT | &quot;sent&quot; |
| VIEWED | &quot;viewed&quot; |
| SIGNED | &quot;signed&quot; |
| CANCELLED | &quot;cancelled&quot; |
| DECLINED | &quot;declined&quot; |
| ERROR_CONVERTING | &quot;error_converting&quot; |
| ERROR_SENDING | &quot;error_sending&quot; |
| EXPIRED | &quot;expired&quot; |
| FINALIZING | &quot;finalizing&quot; |
| ERROR_FINALIZING | &quot;error_finalizing&quot; |



