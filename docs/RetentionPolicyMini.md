

# RetentionPolicyMini

A mini representation of a retention policy, used when nested within another resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier that represents a retention policy. |  |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;retention_policy&#x60; |  |
|**policyName** | **String** | The name given to the retention policy. |  [optional] |
|**retentionLength** | **String** | The length of the retention policy. This value specifies the duration in days that the retention policy will be active for after being assigned to content.  If the policy has a &#x60;policy_type&#x60; of &#x60;indefinite&#x60;, the &#x60;retention_length&#x60; will also be &#x60;indefinite&#x60;. |  [optional] |
|**dispositionAction** | [**DispositionActionEnum**](#DispositionActionEnum) | The disposition action of the retention policy. This action can be &#x60;permanently_delete&#x60;, which will cause the content retained by the policy to be permanently deleted, or &#x60;remove_retention&#x60;, which will lift the retention policy from the content, allowing it to be deleted by users, once the retention policy has expired. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RETENTION_POLICY | &quot;retention_policy&quot; |



## Enum: DispositionActionEnum

| Name | Value |
|---- | -----|
| PERMANENTLY_DELETE | &quot;permanently_delete&quot; |
| REMOVE_RETENTION | &quot;remove_retention&quot; |



