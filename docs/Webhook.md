

# Webhook

Represents a configured webhook.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this webhook. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;webhook&#x60; |  [optional] |
|**target** | [**WebhookMiniTarget**](WebhookMiniTarget.md) |  |  [optional] |
|**createdBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | A timestamp identifying the time that the webhook was created. |  [optional] |
|**address** | **String** | The URL that is notified by this webhook |  [optional] |
|**triggers** | [**List&lt;TriggersEnum&gt;**](#List&lt;TriggersEnum&gt;) | An array of event names that this webhook is to be triggered for |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| WEBHOOK | &quot;webhook&quot; |



## Enum: List&lt;TriggersEnum&gt;

| Name | Value |
|---- | -----|
| FILE_UPLOADED | &quot;FILE.UPLOADED&quot; |
| FILE_PREVIEWED | &quot;FILE.PREVIEWED&quot; |
| FILE_DOWNLOADED | &quot;FILE.DOWNLOADED&quot; |
| FILE_TRASHED | &quot;FILE.TRASHED&quot; |
| FILE_DELETED | &quot;FILE.DELETED&quot; |
| FILE_RESTORED | &quot;FILE.RESTORED&quot; |
| FILE_COPIED | &quot;FILE.COPIED&quot; |
| FILE_MOVED | &quot;FILE.MOVED&quot; |
| FILE_LOCKED | &quot;FILE.LOCKED&quot; |
| FILE_UNLOCKED | &quot;FILE.UNLOCKED&quot; |
| FILE_RENAMED | &quot;FILE.RENAMED&quot; |
| COMMENT_CREATED | &quot;COMMENT.CREATED&quot; |
| COMMENT_UPDATED | &quot;COMMENT.UPDATED&quot; |
| COMMENT_DELETED | &quot;COMMENT.DELETED&quot; |
| TASK_ASSIGNMENT_CREATED | &quot;TASK_ASSIGNMENT.CREATED&quot; |
| TASK_ASSIGNMENT_UPDATED | &quot;TASK_ASSIGNMENT.UPDATED&quot; |
| METADATA_INSTANCE_CREATED | &quot;METADATA_INSTANCE.CREATED&quot; |
| METADATA_INSTANCE_UPDATED | &quot;METADATA_INSTANCE.UPDATED&quot; |
| METADATA_INSTANCE_DELETED | &quot;METADATA_INSTANCE.DELETED&quot; |
| FOLDER_CREATED | &quot;FOLDER.CREATED&quot; |
| FOLDER_RENAMED | &quot;FOLDER.RENAMED&quot; |
| FOLDER_DOWNLOADED | &quot;FOLDER.DOWNLOADED&quot; |
| FOLDER_RESTORED | &quot;FOLDER.RESTORED&quot; |
| FOLDER_DELETED | &quot;FOLDER.DELETED&quot; |
| FOLDER_COPIED | &quot;FOLDER.COPIED&quot; |
| FOLDER_MOVED | &quot;FOLDER.MOVED&quot; |
| FOLDER_TRASHED | &quot;FOLDER.TRASHED&quot; |
| WEBHOOK_DELETED | &quot;WEBHOOK.DELETED&quot; |
| COLLABORATION_CREATED | &quot;COLLABORATION.CREATED&quot; |
| COLLABORATION_ACCEPTED | &quot;COLLABORATION.ACCEPTED&quot; |
| COLLABORATION_REJECTED | &quot;COLLABORATION.REJECTED&quot; |
| COLLABORATION_REMOVED | &quot;COLLABORATION.REMOVED&quot; |
| COLLABORATION_UPDATED | &quot;COLLABORATION.UPDATED&quot; |
| SHARED_LINK_DELETED | &quot;SHARED_LINK.DELETED&quot; |
| SHARED_LINK_CREATED | &quot;SHARED_LINK.CREATED&quot; |
| SHARED_LINK_UPDATED | &quot;SHARED_LINK.UPDATED&quot; |
| SIGN_REQUEST_COMPLETED | &quot;SIGN_REQUEST.COMPLETED&quot; |
| SIGN_REQUEST_DECLINED | &quot;SIGN_REQUEST.DECLINED&quot; |
| SIGN_REQUEST_EXPIRED | &quot;SIGN_REQUEST.EXPIRED&quot; |
| SIGN_REQUEST_SIGNER_EMAIL_BOUNCED | &quot;SIGN_REQUEST.SIGNER_EMAIL_BOUNCED&quot; |



