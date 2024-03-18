

# ClassificationTemplate

A metadata template that holds the security classifications defined by an enterprise.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the classification template. |  |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;metadata_template&#x60; |  |
|**scope** | **String** | The scope of the classification template. This is in the format &#x60;enterprise_{id}&#x60; where the &#x60;id&#x60; is the enterprise ID. |  |
|**templateKey** | [**TemplateKeyEnum**](#TemplateKeyEnum) | &#x60;securityClassification-6VMVochwUWo&#x60; |  |
|**displayName** | [**DisplayNameEnum**](#DisplayNameEnum) | The name of this template as shown in web and mobile interfaces. |  |
|**hidden** | **Boolean** | Determines if the template is always available in web and mobile interfaces. |  [optional] |
|**copyInstanceOnItemCopy** | **Boolean** | Determines if  classifications are copied along when the file or folder is copied. |  [optional] |
|**fields** | [**List&lt;ClassificationTemplateFieldsInner&gt;**](ClassificationTemplateFieldsInner.md) | A list of fields for this classification template. This includes only one field, the &#x60;Box__Security__Classification__Key&#x60;, which defines the different classifications available in this enterprise. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| METADATA_TEMPLATE | &quot;metadata_template&quot; |



## Enum: TemplateKeyEnum

| Name | Value |
|---- | -----|
| SECURITYCLASSIFICATION_6VMVOCHWUWO | &quot;securityClassification-6VMVochwUWo&quot; |



## Enum: DisplayNameEnum

| Name | Value |
|---- | -----|
| CLASSIFICATION | &quot;Classification&quot; |



