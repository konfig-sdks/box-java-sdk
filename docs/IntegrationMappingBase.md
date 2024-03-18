

# IntegrationMappingBase

A base representation of an integration mapping object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier of a folder mapping (part of a composite key together with &#x60;integration_type&#x60;) |  [optional] |
|**integrationType** | [**IntegrationTypeEnum**](#IntegrationTypeEnum) | Identifies the Box partner app, with which the mapping is associated. Currently only supports Slack. (part of the composite key together with &#x60;id&#x60;) |  [optional] |



## Enum: IntegrationTypeEnum

| Name | Value |
|---- | -----|
| SLACK | &quot;slack&quot; |



