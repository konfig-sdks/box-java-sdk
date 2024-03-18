

# ClassificationsInitializeTemplateRequestFieldsInner

The `enum` field which holds all the valid classification values.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of the field that is always enum. |  |
|**key** | [**KeyEnum**](#KeyEnum) | Defines classifications  available in the enterprise. |  |
|**displayName** | [**DisplayNameEnum**](#DisplayNameEnum) | A display name for the classification. |  |
|**hidden** | **Boolean** | Determines if the classification template is hidden or available on web and mobile devices. |  [optional] |
|**options** | [**List&lt;ClassificationsInitializeTemplateRequestFieldsInnerOptionsInner&gt;**](ClassificationsInitializeTemplateRequestFieldsInnerOptionsInner.md) | The actual list of classifications that are present on this template. |  |



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



