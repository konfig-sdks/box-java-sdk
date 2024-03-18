

# SkillInvocationStatus

The details status of this event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | [**StateEnum**](#StateEnum) | The state of this event.  * &#x60;invoked&#x60; - Triggered the skill with event details to start   applying skill on the file. * &#x60;processing&#x60; - Currently processing. * &#x60;success&#x60; - Completed processing with a success. * &#x60;transient_failure&#x60; - Encountered an issue which can be   retried. * &#x60;permanent_failure&#x60; -  Encountered a permanent issue and   retry would not help. |  [optional] |
|**message** | **String** | Status information |  [optional] |
|**errorCode** | **String** | Error code information, if error occurred. |  [optional] |
|**additionalInfo** | **String** | Additional status information. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| INVOKED | &quot;invoked&quot; |
| PROCESSING | &quot;processing&quot; |
| SUCCESS | &quot;success&quot; |
| TRANSIENT_FAILURE | &quot;transient_failure&quot; |
| PERMANENT_FAILURE | &quot;permanent_failure&quot; |



