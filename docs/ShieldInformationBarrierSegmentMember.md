

# ShieldInformationBarrierSegmentMember

A standard representation of a shield information barrier segment member object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for the shield information barrier segment member |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the shield information barrier segment member |  [optional] |
|**user** | [**UserBase**](UserBase.md) |  |  [optional] |
|**shieldInformationBarrier** | [**ShieldInformationBarrierBase**](ShieldInformationBarrierBase.md) |  |  [optional] |
|**shieldInformationBarrierSegment** | [**ShieldInformationBarrierSegmentMemberAllOfShieldInformationBarrierSegment**](ShieldInformationBarrierSegmentMemberAllOfShieldInformationBarrierSegment.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | ISO date time string when this shield information barrier object was created. |  [optional] |
|**createdBy** | [**UserBase**](UserBase.md) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** | ISO date time string when this shield information barrier segment Member was updated. |  [optional] |
|**updatedBy** | [**UserBase**](UserBase.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHIELD_INFORMATION_BARRIER_SEGMENT_MEMBER | &quot;shield_information_barrier_segment_member&quot; |



