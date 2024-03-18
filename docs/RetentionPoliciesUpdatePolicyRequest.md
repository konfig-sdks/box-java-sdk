

# RetentionPoliciesUpdatePolicyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The additional text description of the retention policy. |  [optional] |
|**policyName** | **String** | The name for the retention policy |  [optional] |
|**dispositionAction** | [**DispositionActionEnum**](#DispositionActionEnum) |  |  [optional] |
|**retentionType** | **String** | Specifies the retention type:  * &#x60;modifiable&#x60;: You can modify the retention policy. For example, you can add or remove folders, shorten or lengthen the policy duration, or delete the assignment. Use this type if your retention policy is not related to any regulatory purposes. * &#x60;non-modifiable&#x60;: You can modify the retention policy only in a limited way: add a folder, lengthen the duration, retire the policy, change the disposition action or notification settings. You cannot perform other actions, such as deleting the assignment or shortening the policy duration. Use this type to ensure compliance with regulatory retention policies.  When updating a retention policy, you can use &#x60;non-modifiable&#x60; type only. You can convert a &#x60;modifiable&#x60; policy to &#x60;non-modifiable&#x60;, but not the other way around. |  [optional] |
|**retentionLength** | **Object** |  |  [optional] |
|**status** | **String** | Used to retire a retention policy.  If not retiring a policy, do not include this parameter or set it to &#x60;null&#x60;. |  [optional] |
|**canOwnerExtendRetention** | **Boolean** | Determines if the owner of items under the policy can extend the retention when the original retention duration is about to end. |  [optional] |
|**areOwnersNotified** | **Boolean** | Determines if owners and co-owners of items under the policy are notified when the retention duration is about to end. |  [optional] |
|**customNotificationRecipients** | [**List&lt;UserBase&gt;**](UserBase.md) | A list of users notified when the retention duration is about to end. |  [optional] |



## Enum: DispositionActionEnum

| Name | Value |
|---- | -----|
| PERMANENTLY_DELETE | &quot;permanently_delete&quot; |
| REMOVE_RETENTION | &quot;remove_retention&quot; |



