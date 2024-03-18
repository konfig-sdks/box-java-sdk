

# SignTemplateAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | object type |  [optional] |
|**id** | **String** | Template identifier. |  [optional] |
|**name** | **String** | The name of the template. |  [optional] |
|**emailSubject** | **String** | Subject of signature request email. This is cleaned by sign request. If this field is not passed, a default subject will be used. |  [optional] |
|**emailMessage** | **String** | Message to include in signature request email. The field is cleaned through sanitization of specific characters. However, some html tags are allowed. Links included in the message are also converted to hyperlinks in the email. The message may contain the following html tags including &#x60;a&#x60;, &#x60;abbr&#x60;, &#x60;acronym&#x60;, &#x60;b&#x60;, &#x60;blockquote&#x60;, &#x60;code&#x60;, &#x60;em&#x60;, &#x60;i&#x60;, &#x60;ul&#x60;, &#x60;li&#x60;, &#x60;ol&#x60;, and &#x60;strong&#x60;. Be aware that when the text to html ratio is too high, the email may end up in spam filters. Custom styles on these tags are not allowed. If this field is not passed, a default message will be used. |  [optional] |
|**daysValid** | **Integer** | Set the number of days after which the created signature request will automatically expire if not completed. By default, we do not apply any expiration date on signature requests, and the signature request does not expire. |  [optional] |
|**parentFolder** | [**FolderMini**](FolderMini.md) |  |  [optional] |
|**sourceFiles** | [**List&lt;FileMini&gt;**](FileMini.md) | List of files to create a signing document from. Only the ID and type fields are required for each file. |  [optional] |
|**areFieldsLocked** | **Boolean** | Indicates if the template input fields are editable or not. |  [optional] |
|**areOptionsLocked** | **Boolean** | Indicates if the template document options are editable or not, for example renaming the document. |  [optional] |
|**areRecipientsLocked** | **Boolean** | Indicates if the template signers are editable or not. |  [optional] |
|**areEmailSettingsLocked** | **Boolean** | Indicates if the template email settings are editable or not. |  [optional] |
|**areFilesLocked** | **Boolean** | Indicates if the template files are editable or not. This includes deleting or renaming template files. |  [optional] |
|**signers** | [**List&lt;TemplateSigner&gt;**](TemplateSigner.md) | Array of signers for the template. |  [optional] |
|**additionalInfo** | [**SignTemplateAllOfAdditionalInfo**](SignTemplateAllOfAdditionalInfo.md) |  |  [optional] |
|**readySignLink** | [**SignTemplateAllOfReadySignLink**](SignTemplateAllOfReadySignLink.md) |  |  [optional] |
|**customBranding** | [**SignTemplateAllOfCustomBranding**](SignTemplateAllOfCustomBranding.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SIGN_TEMPLATE | &quot;sign-template&quot; |



