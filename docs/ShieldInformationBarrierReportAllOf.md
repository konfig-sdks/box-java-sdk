

# ShieldInformationBarrierReportAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**shieldInformationBarrier** | [**ShieldInformationBarrierReference**](ShieldInformationBarrierReference.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the shield information report |  [optional] |
|**details** | [**ShieldInformationBarrierReportDetails**](ShieldInformationBarrierReportDetails.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | ISO date time string when this shield information barrier report object was created. |  [optional] |
|**createdBy** | [**UserBase**](UserBase.md) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** | ISO date time string when this shield information barrier report was updated. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| ERROR | &quot;error&quot; |
| DONE | &quot;done&quot; |
| CANCELLED | &quot;cancelled&quot; |



