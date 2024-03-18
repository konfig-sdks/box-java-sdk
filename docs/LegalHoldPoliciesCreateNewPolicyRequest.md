

# LegalHoldPoliciesCreateNewPolicyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for the policy. |  [optional] |
|**policyName** | **String** | The name of the policy. |  |
|**filterStartedAt** | **OffsetDateTime** | The filter start date.  When this policy is applied using a &#x60;custodian&#x60; legal hold assignments, it will only apply to file versions created or uploaded inside of the date range. Other assignment types, such as folders and files, will ignore the date filter.  Required if &#x60;is_ongoing&#x60; is set to &#x60;false&#x60;. |  [optional] |
|**filterEndedAt** | **OffsetDateTime** | The filter end date.  When this policy is applied using a &#x60;custodian&#x60; legal hold assignments, it will only apply to file versions created or uploaded inside of the date range. Other assignment types, such as folders and files, will ignore the date filter.  Required if &#x60;is_ongoing&#x60; is set to &#x60;false&#x60;. |  [optional] |
|**isOngoing** | **Boolean** | Whether new assignments under this policy should continue applying to files even after initialization.  When this policy is applied using a legal hold assignment, it will continue applying the policy to any new file versions even after it has been applied.  For example, if a legal hold assignment is placed on a user today, and that user uploads a file tomorrow, that file will get held. This will continue until the policy is retired.  Required if no filter dates are set. |  [optional] |



