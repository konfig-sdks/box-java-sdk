

# LegalHoldPolicy

Legal Hold Policy information describes the basic characteristics of the Policy, such as name, description, and filter dates.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this legal hold policy |  |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;legal_hold_policy&#x60; |  |
|**description** | **String** | Description of the legal hold policy. Optional property with a 500 character limit. |  [optional] |
|**policyName** | **String** | Name of the legal hold policy. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | * &#39;active&#39; - the policy is not in a transition state * &#39;applying&#39; - that the policy is in the process of   being applied * &#39;releasing&#39; - that the process is in the process   of being released * &#39;released&#39; - the policy is no longer active |  [optional] |
|**assignmentCounts** | [**LegalHoldPolicyAllOfAssignmentCounts**](LegalHoldPolicyAllOfAssignmentCounts.md) |  |  [optional] |
|**createdBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | When the legal hold policy object was created |  [optional] |
|**modifiedAt** | **OffsetDateTime** | When the legal hold policy object was modified. Does not update when assignments are added or removed. |  [optional] |
|**deletedAt** | **OffsetDateTime** | When the policy release request was sent. (Because it can take time for a policy to fully delete, this isn&#39;t quite the same time that the policy is fully deleted).  If &#x60;null&#x60;, the policy was not deleted. |  [optional] |
|**filterStartedAt** | **OffsetDateTime** | User-specified, optional date filter applies to Custodian assignments only |  [optional] |
|**filterEndedAt** | **OffsetDateTime** | User-specified, optional date filter applies to Custodian assignments only |  [optional] |
|**releaseNotes** | **String** | Optional notes about why the policy was created. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LEGAL_HOLD_POLICY | &quot;legal_hold_policy&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| APPLYING | &quot;applying&quot; |
| RELEASING | &quot;releasing&quot; |
| RELEASED | &quot;released&quot; |



