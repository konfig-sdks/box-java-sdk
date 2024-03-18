

# ClassificationsUpdateLabelsDescriptionsRequestInner

A single classification to update.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**op** | [**OpEnum**](#OpEnum) | The type of change to perform on the classification object. |  |
|**fieldKey** | [**FieldKeyEnum**](#FieldKeyEnum) | Defines classifications  available in the enterprise. |  |
|**enumOptionKey** | **String** | The original label of the classification to change. |  |
|**data** | [**ClassificationsUpdateLabelsDescriptionsRequestInnerData**](ClassificationsUpdateLabelsDescriptionsRequestInnerData.md) |  |  |



## Enum: OpEnum

| Name | Value |
|---- | -----|
| EDITENUMOPTION | &quot;editEnumOption&quot; |



## Enum: FieldKeyEnum

| Name | Value |
|---- | -----|
| BOX__SECURITY__CLASSIFICATION__KEY | &quot;Box__Security__Classification__Key&quot; |



