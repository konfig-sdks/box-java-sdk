

# ShieldInformationBarrierReport

A standard representation of a shield information barrier report object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for the shield information barrier report |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the shield information barrier report |  [optional] |
|**shieldInformationBarrier** | [**ShieldInformationBarrierReference**](ShieldInformationBarrierReference.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the shield information report |  [optional] |
|**details** | [**ShieldInformationBarrierReportDetails**](ShieldInformationBarrierReportDetails.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | ISO date time string when this shield information barrier report object was created. |  [optional] |
|**createdBy** | [**UserBase**](UserBase.md) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** | ISO date time string when this shield information barrier report was updated. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHIELD_INFORMATION_BARRIER_REPORT | &quot;shield_information_barrier_report&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| ERROR | &quot;error&quot; |
| DONE | &quot;done&quot; |
| CANCELLED | &quot;cancelled&quot; |



