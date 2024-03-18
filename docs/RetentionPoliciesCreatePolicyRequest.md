

# RetentionPoliciesCreatePolicyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The additional text description of the retention policy. |  [optional] |
|**policyName** | **String** | The name for the retention policy |  |
|**policyType** | [**PolicyTypeEnum**](#PolicyTypeEnum) | The type of the retention policy. A retention policy type can either be &#x60;finite&#x60;, where a specific amount of time to retain the content is known upfront, or &#x60;indefinite&#x60;, where the amount of time to retain the content is still unknown. |  |
|**dispositionAction** | [**DispositionActionEnum**](#DispositionActionEnum) | The disposition action of the retention policy. &#x60;permanently_delete&#x60; deletes the content retained by the policy permanently. &#x60;remove_retention&#x60; lifts retention policy from the content, allowing it to be deleted by users once the retention policy has expired. |  |
|**retentionLength** | **Object** |  |  [optional] |
|**retentionType** | [**RetentionTypeEnum**](#RetentionTypeEnum) | Specifies the retention type:  * &#x60;modifiable&#x60;: You can modify the retention policy. For example, you can add or remove folders, shorten or lengthen the policy duration, or delete the assignment. Use this type if your retention policy is not related to any regulatory purposes.  * &#x60;non_modifiable&#x60;: You can modify the retention policy only in a limited way: add a folder, lengthen the duration, retire the policy, change the disposition action or notification settings. You cannot perform other actions, such as deleting the assignment or shortening the policy duration. Use this type to ensure compliance with regulatory retention policies. |  [optional] |
|**canOwnerExtendRetention** | [**CanOwnerExtendRetentionEnum**](#CanOwnerExtendRetentionEnum) | Whether the owner of a file will be allowed to extend the retention. |  [optional] |
|**areOwnersNotified** | [**AreOwnersNotifiedEnum**](#AreOwnersNotifiedEnum) | Whether owner and co-owners of a file are notified when the policy nears expiration. |  [optional] |
|**customNotificationRecipients** | [**List&lt;UserMini&gt;**](UserMini.md) | A list of users notified when the retention policy duration is about to end. |  [optional] |



## Enum: PolicyTypeEnum

| Name | Value |
|---- | -----|
| FINITE | &quot;finite&quot; |
| INDEFINITE | &quot;indefinite&quot; |



## Enum: DispositionActionEnum

| Name | Value |
|---- | -----|
| PERMANENTLY_DELETE | &quot;permanently_delete&quot; |
| REMOVE_RETENTION | &quot;remove_retention&quot; |



## Enum: RetentionTypeEnum

| Name | Value |
|---- | -----|
| MODIFIABLE | &quot;modifiable&quot; |
| NON_MODIFIABLE | &quot;non_modifiable&quot; |



## Enum: CanOwnerExtendRetentionEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: AreOwnersNotifiedEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



