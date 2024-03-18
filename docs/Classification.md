

# Classification

An instance of the classification metadata template, containing the classification applied to the file or folder.  To get more details about the classification applied to an item, request the classification metadata template.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**boxSecurityClassificationKey** | **String** | The name of the classification applied to the item. |  [optional] |
|**$parent** | **String** | The identifier of the item that this metadata instance has been attached to. This combines the &#x60;type&#x60; and the &#x60;id&#x60; of the parent in the form &#x60;{type}_{id}&#x60;. |  [optional] |
|**$template** | [**TemplateEnum**](#TemplateEnum) | &#x60;securityClassification-6VMVochwUWo&#x60; |  [optional] |
|**$scope** | **String** | The scope of the enterprise that this classification has been applied for.  This will be in the format &#x60;enterprise_{enterprise_id}&#x60;. |  [optional] |
|**$version** | **Integer** | The version of the metadata instance. This version starts at 0 and increases every time a classification is updated. |  [optional] |
|**$type** | **String** | The unique ID of this classification instance. This will be include the name of the classification template and a unique ID. |  [optional] |
|**$typeVersion** | **Double** | The version of the metadata template. This version starts at 0 and increases every time the template is updated. This is mostly for internal use. |  [optional] |
|**$canEdit** | **Boolean** | Whether an end user can change the classification. |  [optional] |



## Enum: TemplateEnum

| Name | Value |
|---- | -----|
| SECURITYCLASSIFICATION_6VMVOCHWUWO | &quot;securityClassification-6VMVochwUWo&quot; |



