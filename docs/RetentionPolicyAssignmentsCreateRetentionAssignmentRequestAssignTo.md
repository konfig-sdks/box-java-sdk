

# RetentionPolicyAssignmentsCreateRetentionAssignmentRequestAssignTo

The item to assign the policy to

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of item to assign the policy to. |  |
|**id** | **String** | The ID of item to assign the policy to. Set to &#x60;null&#x60; or omit when &#x60;type&#x60; is set to &#x60;enterprise&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ENTERPRISE | &quot;enterprise&quot; |
| FOLDER | &quot;folder&quot; |
| METADATA_TEMPLATE | &quot;metadata_template&quot; |



