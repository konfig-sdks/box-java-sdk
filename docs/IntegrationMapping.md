

# IntegrationMapping

A standard representation of an integration mapping object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier of a folder mapping (part of a composite key together with &#x60;integration_type&#x60;) |  [optional] |
|**integrationType** | [**IntegrationTypeEnum**](#IntegrationTypeEnum) | Identifies the Box partner app, with which the mapping is associated. Currently only supports Slack. (part of the composite key together with &#x60;id&#x60;) |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Mapping type |  |
|**partnerItem** | **Object** |  |  |
|**boxItem** | [**FolderMini**](FolderMini.md) |  |  |
|**isManuallyCreated** | **Boolean** | Identifies whether the mapping has been manually set (as opposed to being automatically created) |  [optional] |
|**options** | [**IntegrationMappingSlackOptions**](IntegrationMappingSlackOptions.md) |  |  [optional] |
|**createdBy** | [**UserIntegrationMappings**](UserIntegrationMappings.md) |  |  [optional] |
|**modifiedBy** | [**UserIntegrationMappings**](UserIntegrationMappings.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | When the integration mapping object was created |  [optional] |
|**modifiedAt** | **OffsetDateTime** | When the integration mapping object was last modified |  [optional] |



## Enum: IntegrationTypeEnum

| Name | Value |
|---- | -----|
| SLACK | &quot;slack&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INTEGRATION_MAPPING | &quot;integration_mapping&quot; |



