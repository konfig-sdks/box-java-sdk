

# MetadataTemplate

A template for metadata that can be applied to files and folders

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the metadata template. |  |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;metadata_template&#x60; |  |
|**scope** | **String** | The scope of the metadata template can either be &#x60;global&#x60; or &#x60;enterprise_*&#x60;. The &#x60;global&#x60; scope is used for templates that are available to any Box enterprise. The &#x60;enterprise_*&#x60; scope represents templates that have been created within a specific enterprise, where &#x60;*&#x60; will be the ID of that enterprise. |  [optional] |
|**templateKey** | **String** | A unique identifier for the template. This identifier is unique across the &#x60;scope&#x60; of the enterprise to which the metadata template is being applied, yet is not necessarily unique across different enterprises. |  [optional] |
|**displayName** | **String** | The display name of the template. This can be seen in the Box web app and mobile apps. |  [optional] |
|**hidden** | **Boolean** | Defines if this template is visible in the Box web app UI, or if it is purely intended for usage through the API. |  [optional] |
|**fields** | [**List&lt;MetadataTemplateFieldsInner&gt;**](MetadataTemplateFieldsInner.md) | An ordered list of template fields which are part of the template. Each field can be a regular text field, date field, number field, as well as a single or multi-select list. |  [optional] |
|**copyInstanceOnItemCopy** | **Boolean** | Whether or not to include the metadata when a file or folder is copied. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| METADATA_TEMPLATE | &quot;metadata_template&quot; |



