

# RetentionPolicyAssignmentsCreateRetentionAssignmentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**policyId** | **String** | The ID of the retention policy to assign |  |
|**assignTo** | [**RetentionPolicyAssignmentsCreateRetentionAssignmentRequestAssignTo**](RetentionPolicyAssignmentsCreateRetentionAssignmentRequestAssignTo.md) |  |  |
|**filterFields** | [**List&lt;RetentionPolicyAssignmentsCreateRetentionAssignmentRequestFilterFieldsInner&gt;**](RetentionPolicyAssignmentsCreateRetentionAssignmentRequestFilterFieldsInner.md) | If the &#x60;assign_to&#x60; type is &#x60;metadata_template&#x60;, then optionally add the &#x60;filter_fields&#x60; parameter which will require an array of objects with a field entry and a value entry. Currently only one object of &#x60;field&#x60; and &#x60;value&#x60; is supported. |  [optional] |
|**startDateField** | **String** | The date the retention policy assignment begins.  If the &#x60;assigned_to&#x60; type is &#x60;metadata_template&#x60;, this field can be a date field&#39;s metadata attribute key id. |  [optional] |



