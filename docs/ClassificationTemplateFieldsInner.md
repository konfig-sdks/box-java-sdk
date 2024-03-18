

# ClassificationTemplateFieldsInner

The metadata template field that represents the available classifications.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique ID of the field. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The array item type. |  |
|**key** | [**KeyEnum**](#KeyEnum) | Defines classifications  available in the enterprise. |  |
|**displayName** | [**DisplayNameEnum**](#DisplayNameEnum) | &#x60;Classification&#x60; |  |
|**hidden** | **Boolean** | Classifications are always visible to web and mobile users. |  [optional] |
|**options** | [**List&lt;ClassificationTemplateFieldsInnerOptionsInner&gt;**](ClassificationTemplateFieldsInnerOptionsInner.md) | A list of classifications available in this enterprise. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ENUM | &quot;enum&quot; |



## Enum: KeyEnum

| Name | Value |
|---- | -----|
| BOX__SECURITY__CLASSIFICATION__KEY | &quot;Box__Security__Classification__Key&quot; |



## Enum: DisplayNameEnum

| Name | Value |
|---- | -----|
| CLASSIFICATION | &quot;Classification&quot; |



