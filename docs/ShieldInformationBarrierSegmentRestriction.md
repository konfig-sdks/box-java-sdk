

# ShieldInformationBarrierSegmentRestriction

A standard representation of a segment restriction of a shield information barrier object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Shield information barrier segment restriction |  [optional] |
|**id** | **String** | The unique identifier for the shield information barrier segment restriction. |  [optional] |
|**shieldInformationBarrierSegment** | [**ShieldInformationBarrierSegmentRestrictionMiniAllOfShieldInformationBarrierSegment**](ShieldInformationBarrierSegmentRestrictionMiniAllOfShieldInformationBarrierSegment.md) |  |  |
|**restrictedSegment** | [**ShieldInformationBarrierSegmentRestrictionMiniAllOfRestrictedSegment**](ShieldInformationBarrierSegmentRestrictionMiniAllOfRestrictedSegment.md) |  |  |
|**shieldInformationBarrier** | [**ShieldInformationBarrierBase**](ShieldInformationBarrierBase.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | ISO date time string when this shield information barrier Segment Restriction object was created. |  [optional] |
|**createdBy** | [**UserBase**](UserBase.md) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** | ISO date time string when this shield information barrier segment Restriction was updated. |  [optional] |
|**updatedBy** | [**UserBase**](UserBase.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHIELD_INFORMATION_BARRIER_SEGMENT_RESTRICTION | &quot;shield_information_barrier_segment_restriction&quot; |



