

# ShieldInformationBarrier

A standard representation of a shield information barrier object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for the shield information barrier |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the shield information barrier |  [optional] |
|**enterprise** | [**EnterpriseBase**](EnterpriseBase.md) | The &#x60;type&#x60; and &#x60;id&#x60; of enterprise this barrier is under. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the shield information barrier |  [optional] |
|**createdAt** | **OffsetDateTime** | ISO date time string when this shield information barrier object was created. |  [optional] |
|**createdBy** | [**UserBase**](UserBase.md) | The user who created this shield information barrier. |  [optional] |
|**updatedAt** | **OffsetDateTime** | ISO date time string when this shield information barrier was updated. |  [optional] |
|**updatedBy** | [**UserBase**](UserBase.md) | The user that updated this shield information barrier. |  [optional] |
|**enabledAt** | **OffsetDateTime** | ISO date time string when this shield information barrier was enabled. |  [optional] |
|**enabledBy** | [**ShieldInformationBarrierEnabledBy**](ShieldInformationBarrierEnabledBy.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHIELD_INFORMATION_BARRIER | &quot;shield_information_barrier&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;draft&quot; |
| PENDING | &quot;pending&quot; |
| DISABLED | &quot;disabled&quot; |
| ENABLED | &quot;enabled&quot; |
| INVALID | &quot;invalid&quot; |



