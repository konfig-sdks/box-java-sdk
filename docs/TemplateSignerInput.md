

# TemplateSignerInput

Input created by a Signer on a Template

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentTagId** | **String** | This references the ID of a specific tag contained in a file of the sign request. |  [optional] |
|**textValue** | **String** | Text prefill value |  [optional] |
|**checkboxValue** | **Boolean** | Checkbox prefill value |  [optional] |
|**dateValue** | **LocalDate** | Date prefill value |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of input |  [optional] |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | Content type of input |  [optional] |
|**isRequired** | **Boolean** | Whether or not the input is required. |  [optional] |
|**pageIndex** | **Integer** | Index of page that the input is on. |  |
|**documentId** | **String** | Document identifier. |  [optional] |
|**dropdownChoices** | **List&lt;String&gt;** | When the input is of the type &#x60;dropdown&#x60; this values will be filled with all the dropdown options. |  [optional] |
|**groupId** | **String** | When the input is of type &#x60;radio&#x60; they can be grouped to gather with this identifier. |  [optional] |
|**coordinates** | [**TemplateSignerInputAllOfCoordinates**](TemplateSignerInputAllOfCoordinates.md) |  |  [optional] |
|**dimensions** | [**TemplateSignerInputAllOfDimensions**](TemplateSignerInputAllOfDimensions.md) |  |  [optional] |
|**label** | **String** | The label field is used especially for text, attachment, radio, and checkbox type inputs. |  [optional] |
|**readOnly** | **Boolean** | Whether this input was defined as read-only(immutable by signers) or not |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SIGNATURE | &quot;signature&quot; |
| DATE | &quot;date&quot; |
| TEXT | &quot;text&quot; |
| CHECKBOX | &quot;checkbox&quot; |
| ATTACHMENT | &quot;attachment&quot; |
| RADIO | &quot;radio&quot; |
| DROPDOWN | &quot;dropdown&quot; |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| SIGNATURE | &quot;signature&quot; |
| INITIAL | &quot;initial&quot; |
| STAMP | &quot;stamp&quot; |
| DATE | &quot;date&quot; |
| CHECKBOX | &quot;checkbox&quot; |
| TEXT | &quot;text&quot; |
| FULL_NAME | &quot;full_name&quot; |
| FIRST_NAME | &quot;first_name&quot; |
| LAST_NAME | &quot;last_name&quot; |
| COMPANY | &quot;company&quot; |
| TITLE | &quot;title&quot; |
| EMAIL | &quot;email&quot; |
| ATTACHMENT | &quot;attachment&quot; |
| RADIO | &quot;radio&quot; |
| DROPDOWN | &quot;dropdown&quot; |



