

# RetentionPolicyAssignmentAssignedTo

The `type` and `id` of the content that is under retention. The `type` can either be `folder` `enterprise`, or `metadata_template`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the folder, enterprise, or metadata template the policy is assigned to. Set to null or omit when type is set to enterprise. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of resource the policy is assigned to. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FOLDER | &quot;folder&quot; |
| ENTERPRISE | &quot;enterprise&quot; |
| METADATA_TEMPLATE | &quot;metadata_template&quot; |



