

# AMetadataTemplateUpdateOperation

A [JSON-Patch](https://tools.ietf.org/html/rfc6902) operation for a change to make to the metadata instance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**op** | [**OpEnum**](#OpEnum) | The type of change to perform on the template. Some of these are hazardous as they will change existing templates. |  |
|**data** | [**Map&lt;String, Object&gt;**](Object.md) | The data for the operation. This will vary depending on the operation being performed. |  [optional] |
|**fieldKey** | **String** | For operations that affect a single field this defines the key of the field that is affected. |  [optional] |
|**fieldKeys** | **List&lt;String&gt;** | For operations that affect multiple fields this defines the keys of the fields that are affected. |  [optional] |
|**enumOptionKey** | **String** | For operations that affect a single &#x60;enum&#x60; option this defines the key of the option that is affected. |  [optional] |
|**enumOptionKeys** | **List&lt;String&gt;** | For operations that affect multiple &#x60;enum&#x60; options this defines the keys of the options that are affected. |  [optional] |
|**multiSelectOptionKey** | **String** | For operations that affect a single multi select option this defines the key of the option that is affected. |  [optional] |
|**multiSelectOptionKeys** | **List&lt;String&gt;** | For operations that affect multiple multi select options this defines the keys of the options that are affected. |  [optional] |



## Enum: OpEnum

| Name | Value |
|---- | -----|
| EDITTEMPLATE | &quot;editTemplate&quot; |
| ADDFIELD | &quot;addField&quot; |
| REORDERFIELDS | &quot;reorderFields&quot; |
| ADDENUMOPTION | &quot;addEnumOption&quot; |
| REORDERENUMOPTIONS | &quot;reorderEnumOptions&quot; |
| REORDERMULTISELECTOPTIONS | &quot;reorderMultiSelectOptions&quot; |
| ADDMULTISELECTOPTION | &quot;addMultiSelectOption&quot; |
| EDITFIELD | &quot;editField&quot; |
| REMOVEFIELD | &quot;removeField&quot; |
| EDITENUMOPTION | &quot;editEnumOption&quot; |
| REMOVEENUMOPTION | &quot;removeEnumOption&quot; |
| EDITMULTISELECTOPTION | &quot;editMultiSelectOption&quot; |
| REMOVEMULTISELECTOPTION | &quot;removeMultiSelectOption&quot; |



