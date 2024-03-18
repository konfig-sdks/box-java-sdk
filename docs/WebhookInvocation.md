

# WebhookInvocation

The event that is sent to a webhook address when an event happens.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this webhook invocation |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;webhook_event&#x60; |  [optional] |
|**webhook** | [**WebhookInvocationWebhook**](WebhookInvocationWebhook.md) |  |  [optional] |
|**createdBy** | [**WebhookInvocationCreatedBy**](WebhookInvocationCreatedBy.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | A timestamp identifying the time that the webhook event was triggered. |  [optional] |
|**trigger** | [**String**](String.md) |  |  [optional] |
|**source** | [**WebhookInvocationSource**](WebhookInvocationSource.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| WEBHOOK_EVENT | &quot;webhook_event&quot; |



