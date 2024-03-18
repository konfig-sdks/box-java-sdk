

# Event

The description of an event that happened within Box

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | &#x60;event&#x60; |  [optional] |
|**createdAt** | **OffsetDateTime** | When the event object was created |  [optional] |
|**recordedAt** | **OffsetDateTime** | When the event object was recorded in database |  [optional] |
|**eventId** | **String** | The ID of the event object. You can use this to detect duplicate events |  [optional] |
|**createdBy** | [**EventCreatedBy**](EventCreatedBy.md) |  |  [optional] |
|**eventType** | [**String**](String.md) |  |  [optional] |
|**sessionId** | **String** | The session of the user that performed the action. Not all events will populate this attribute. |  [optional] |
|**source** | [**EventSource**](EventSource.md) |  |  [optional] |
|**additionalDetails** | **Object** | This object provides additional information about the event if available.  This can include how a user performed an event as well as additional information to correlate an event to external KeySafe logs. Not all events have an &#x60;additional_details&#x60; object.  This object is only available in the Enterprise Events. |  [optional] |



