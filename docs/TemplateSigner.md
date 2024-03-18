

# TemplateSigner

The schema for a Signer for Templates

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inputs** | [**List&lt;TemplateSignerInput&gt;**](TemplateSignerInput.md) |  |  [optional] [readonly] |
|**email** | **String** | Email address of the signer |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | Defines the role of the signer in the signature request. A role of &#x60;signer&#x60; needs to sign the document, a role &#x60;approver&#x60; approves the document and a &#x60;final_copy_reader&#x60; role only receives the final signed document and signing log. |  [optional] |
|**isInPerson** | **Boolean** | Used in combination with an embed URL for a sender. After the sender signs, they will be redirected to the next &#x60;in_person&#x60; signer. |  [optional] |
|**order** | **Integer** | Order of the signer |  [optional] |
|**signerGroupId** | **String** | If provided, this value points signers that are assigned the same inputs and belongs to same signer group. A signer group is not a Box Group. It is an entity that belongs to the template itself and can only be used within Sign Requests created from it. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| SIGNER | &quot;signer&quot; |
| APPROVER | &quot;approver&quot; |
| FINAL_COPY_READER | &quot;final_copy_reader&quot; |



