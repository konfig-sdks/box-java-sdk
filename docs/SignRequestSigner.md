

# SignRequestSigner

The schema for a Signer in a GET Sign Request request body

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | Email address of the signer. The email address of the signer is required when making signature requests, except when using templates that are configured to include emails. |  |
|**role** | [**RoleEnum**](#RoleEnum) | Defines the role of the signer in the sign request. A &#x60;signer&#x60; must sign the document and an &#x60;approver&#x60; must approve the document. A &#x60;final_copy_reader&#x60; only receives the final signed document and signing log. |  [optional] |
|**isInPerson** | **Boolean** | Used in combination with an embed URL for a sender. After the sender signs, they are redirected to the next &#x60;in_person&#x60; signer. |  [optional] |
|**order** | **Integer** | Order of the signer |  [optional] |
|**embedUrlExternalUserId** | **String** | User ID for the signer in an external application responsible for authentication when accessing the embed URL. |  [optional] |
|**redirectUrl** | **String** | The URL that a signer will be redirected to after signing a document. Defining this URL overrides default or global redirect URL settings for a specific signer. If no declined redirect URL is specified, this URL will be used for decline actions as well. |  [optional] |
|**declinedRedirectUrl** | **String** | The URL that a signer will be redirect to after declining to sign a document. Defining this URL overrides default or global declined redirect URL settings for a specific signer. |  [optional] |
|**loginRequired** | **Boolean** | If set to true, signer will need to login to a Box account before signing the request. If the signer does not have an existing account, they will have an option to create a free Box account. |  [optional] |
|**verificationPhoneNumber** | **String** | If set, this phone number is be used to verify the signer via two factor authentication before they are able to sign the document. |  [optional] |
|**password** | **String** | If set, the signer is required to enter the password before they are able to sign a document. This field is write only. |  [optional] |
|**signerGroupId** | **String** | If set, signers who have the same value will be assigned to the same input and to the same signer group. A signer group is not a Box Group. It is an entity that belongs to a Sign Request and can only be used/accessed within this Sign Request. A signer group is expected to have more than one signer. If the provided value is only used for one signer, this value will be ignored and request will be handled as it was intended for an individual signer. The value provided can be any string and only used to determine which signers belongs to same group. A successful response will provide a generated UUID value instead for signers in the same signer group. |  [optional] |
|**hasViewedDocument** | **Boolean** | Set to &#x60;true&#x60; if the signer views the document |  [optional] [readonly] |
|**signerDecision** | [**SignRequestSignerAllOfSignerDecision**](SignRequestSignerAllOfSignerDecision.md) |  |  [optional] |
|**inputs** | [**List&lt;SignRequestSignerInput&gt;**](SignRequestSignerInput.md) |  |  [optional] [readonly] |
|**embedUrl** | **String** | URL to direct a signer to for signing |  [optional] [readonly] |
|**iframeableEmbedUrl** | **String** | This URL is specifically designed for signing documents within an HTML &#x60;iframe&#x60; tag. It will be returned in the response only if the &#x60;embed_url_external_user_id&#x60; parameter was passed in the &#x60;create sign request&#x60; call. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| SIGNER | &quot;signer&quot; |
| APPROVER | &quot;approver&quot; |
| FINAL_COPY_READER | &quot;final_copy_reader&quot; |



