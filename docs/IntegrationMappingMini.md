

# IntegrationMappingMini

A mini representation of an integration mapping object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier of a folder mapping (part of a composite key together with &#x60;integration_type&#x60;) |  [optional] |
|**integrationType** | [**IntegrationTypeEnum**](#IntegrationTypeEnum) | Identifies the Box partner app, with which the mapping is associated. Currently only supports Slack. (part of the composite key together with &#x60;id&#x60;) |  [optional] |
|**partnerItemId** | **String** | ID of the mapped partner item |  [optional] |
|**partnerItemType** | [**PartnerItemTypeEnum**](#PartnerItemTypeEnum) | Domain-specific type of the mapped partner item |  [optional] |
|**boxItemId** | **String** | ID of the Box item mapped to the object referenced in &#x60;partner_item_id&#x60; |  [optional] |
|**boxItemType** | [**BoxItemTypeEnum**](#BoxItemTypeEnum) | Type of the Box object referenced in &#x60;box_item_id&#x60; |  [optional] |



## Enum: IntegrationTypeEnum

| Name | Value |
|---- | -----|
| SLACK | &quot;slack&quot; |



## Enum: PartnerItemTypeEnum

| Name | Value |
|---- | -----|
| CHANNEL | &quot;channel&quot; |



## Enum: BoxItemTypeEnum

| Name | Value |
|---- | -----|
| FOLDER | &quot;folder&quot; |



