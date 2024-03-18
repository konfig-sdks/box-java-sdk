

# StatusSkillCardStatus

Sets the status of the skill. This can be used to show a message to the user while the Skill is processing the data, or if it was not able to process the file.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | [**CodeEnum**](#CodeEnum) | A code for the status of this Skill invocation. By default each of these will have their own accompanied messages. These can be adjusted by setting the &#x60;message&#x60; value on this object. |  |
|**message** | **String** | A custom message that can be provided with this status. This will be shown in the web app to the end user. |  [optional] |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| INVOKED | &quot;invoked&quot; |
| PROCESSING | &quot;processing&quot; |
| SUCCESS | &quot;success&quot; |
| TRANSIENT_FAILURE | &quot;transient_failure&quot; |
| PERMANENT_FAILURE | &quot;permanent_failure&quot; |



