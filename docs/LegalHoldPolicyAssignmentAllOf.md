

# LegalHoldPolicyAssignmentAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**legalHoldPolicy** | [**LegalHoldPolicyMini**](LegalHoldPolicyMini.md) |  |  [optional] |
|**assignedTo** | [**Object**](Object.md) |  |  [optional] |
|**assignedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**assignedAt** | **OffsetDateTime** | When the legal hold policy assignment object was created |  [optional] |
|**deletedAt** | **OffsetDateTime** | When the assignment release request was sent. (Because it can take time for an assignment to fully delete, this isn&#39;t quite the same time that the assignment is fully deleted). If null, Assignment was not deleted. |  [optional] |



