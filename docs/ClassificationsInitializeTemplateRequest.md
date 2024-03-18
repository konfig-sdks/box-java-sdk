

# ClassificationsInitializeTemplateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**ScopeEnum**](#ScopeEnum) | The scope in which to create the classifications. This should be &#x60;enterprise&#x60; or &#x60;enterprise_{id}&#x60; where &#x60;id&#x60; is the unique ID of the enterprise. |  |
|**templateKey** | [**TemplateKeyEnum**](#TemplateKeyEnum) | Defines the list of metadata templates. |  |
|**displayName** | [**DisplayNameEnum**](#DisplayNameEnum) | The name of the template as shown in web and mobile interfaces. |  |
|**hidden** | **Boolean** | Determines if the classification template is hidden or available on web and mobile devices. |  [optional] |
|**copyInstanceOnItemCopy** | **Boolean** | Determines if classifications are copied along when the file or folder is copied. |  [optional] |
|**fields** | [**List&lt;ClassificationsInitializeTemplateRequestFieldsInner&gt;**](ClassificationsInitializeTemplateRequestFieldsInner.md) | The classification template requires exactly one field, which holds all the valid classification values. |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| ENTERPRISE | &quot;enterprise&quot; |



## Enum: TemplateKeyEnum

| Name | Value |
|---- | -----|
| SECURITYCLASSIFICATION_6VMVOCHWUWO | &quot;securityClassification-6VMVochwUWo&quot; |



## Enum: DisplayNameEnum

| Name | Value |
|---- | -----|
| CLASSIFICATION | &quot;Classification&quot; |



