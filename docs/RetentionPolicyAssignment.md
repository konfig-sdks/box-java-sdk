

# RetentionPolicyAssignment

A retention assignment represents a rule specifying the files a retention policy retains. Assignments can retain files based on their folder or metadata, or hold all files in the enterprise.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for a retention policy assignment. |  |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;retention_policy_assignment&#x60; |  |
|**retentionPolicy** | [**RetentionPolicyAssignmentRetentionPolicy**](RetentionPolicyAssignmentRetentionPolicy.md) |  |  [optional] |
|**assignedTo** | [**RetentionPolicyAssignmentAssignedTo**](RetentionPolicyAssignmentAssignedTo.md) |  |  [optional] |
|**filterFields** | [**List&lt;RetentionPolicyAssignmentFilterFieldsInner&gt;**](RetentionPolicyAssignmentFilterFieldsInner.md) | An array of field objects. Values are only returned if the &#x60;assigned_to&#x60; type is &#x60;metadata_template&#x60;. Otherwise, the array is blank. |  [optional] |
|**assignedBy** | [**RetentionPolicyAssignmentAssignedBy**](RetentionPolicyAssignmentAssignedBy.md) |  |  [optional] |
|**assignedAt** | **OffsetDateTime** | When the retention policy assignment object was created. |  [optional] |
|**startDateField** | **String** | The date the retention policy assignment begins. If the &#x60;assigned_to&#x60; type is &#x60;metadata_template&#x60;, this field can be a date field&#39;s metadata attribute key id. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RETENTION_POLICY_ASSIGNMENT | &quot;retention_policy_assignment&quot; |



