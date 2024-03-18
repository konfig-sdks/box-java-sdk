

# LegalHoldPolicyAssignment

Legal Hold Assignments are used to assign Legal Hold Policies to Users, Folders, Files, or File Versions.  Creating a Legal Hold Assignment puts a hold on the File-Versions that belong to the Assignment's 'apply-to' entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this legal hold assignment |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;legal_hold_policy_assignment&#x60; |  [optional] |
|**legalHoldPolicy** | [**LegalHoldPolicyMini**](LegalHoldPolicyMini.md) |  |  [optional] |
|**assignedTo** | [**Object**](Object.md) |  |  [optional] |
|**assignedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**assignedAt** | **OffsetDateTime** | When the legal hold policy assignment object was created |  [optional] |
|**deletedAt** | **OffsetDateTime** | When the assignment release request was sent. (Because it can take time for an assignment to fully delete, this isn&#39;t quite the same time that the assignment is fully deleted). If null, Assignment was not deleted. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LEGAL_HOLD_POLICY_ASSIGNMENT | &quot;legal_hold_policy_assignment&quot; |



