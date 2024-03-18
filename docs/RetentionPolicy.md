

# RetentionPolicy

A retention policy blocks permanent deletion of content for a specified amount of time. Admins can create retention policies and then later assign them to specific folders, metadata templates, or their entire enterprise.  To use this feature, you must have the manage retention policies scope enabled for your API key via your application management console.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier that represents a retention policy. |  |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;retention_policy&#x60; |  |
|**policyName** | **String** | The name given to the retention policy. |  [optional] |
|**retentionLength** | **String** | The length of the retention policy. This value specifies the duration in days that the retention policy will be active for after being assigned to content.  If the policy has a &#x60;policy_type&#x60; of &#x60;indefinite&#x60;, the &#x60;retention_length&#x60; will also be &#x60;indefinite&#x60;. |  [optional] |
|**dispositionAction** | [**DispositionActionEnum**](#DispositionActionEnum) | The disposition action of the retention policy. This action can be &#x60;permanently_delete&#x60;, which will cause the content retained by the policy to be permanently deleted, or &#x60;remove_retention&#x60;, which will lift the retention policy from the content, allowing it to be deleted by users, once the retention policy has expired. |  [optional] |
|**description** | **String** | The additional text description of the retention policy. |  [optional] |
|**policyType** | [**PolicyTypeEnum**](#PolicyTypeEnum) | The type of the retention policy. A retention policy type can either be &#x60;finite&#x60;, where a specific amount of time to retain the content is known upfront, or &#x60;indefinite&#x60;, where the amount of time to retain the content is still unknown. |  [optional] |
|**retentionType** | [**RetentionTypeEnum**](#RetentionTypeEnum) | Specifies the retention type:  * &#x60;modifiable&#x60;: You can modify the retention policy. For example,  you can add or remove folders, shorten or lengthen  the policy duration, or delete the assignment.  Use this type if your retention policy  is not related to any regulatory purposes.  * &#x60;non-modifiable&#x60;: You can modify the retention policy  only in a limited way: add a folder, lengthen the duration,  retire the policy, change the disposition action  or notification settings. You cannot perform other actions,  such as deleting the assignment or shortening the  policy duration. Use this type to ensure  compliance with regulatory retention policies. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the retention policy. The status of a policy will be &#x60;active&#x60;, unless explicitly retired by an administrator, in which case the status will be &#x60;retired&#x60;. Once a policy has been retired, it cannot become active again. |  [optional] |
|**createdBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | When the retention policy object was created. |  [optional] |
|**modifiedAt** | **OffsetDateTime** | When the retention policy object was last modified. |  [optional] |
|**canOwnerExtendRetention** | **Boolean** | Determines if the owner of items under the policy can extend the retention when the original retention duration is about to end. |  [optional] |
|**areOwnersNotified** | **Boolean** | Determines if owners and co-owners of items under the policy are notified when the retention duration is about to end. |  [optional] |
|**customNotificationRecipients** | [**List&lt;UserMini&gt;**](UserMini.md) | A list of users notified when the retention policy duration is about to end. |  [optional] |
|**assignmentCounts** | [**RetentionPolicyAllOfAssignmentCounts**](RetentionPolicyAllOfAssignmentCounts.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RETENTION_POLICY | &quot;retention_policy&quot; |



## Enum: DispositionActionEnum

| Name | Value |
|---- | -----|
| PERMANENTLY_DELETE | &quot;permanently_delete&quot; |
| REMOVE_RETENTION | &quot;remove_retention&quot; |



## Enum: PolicyTypeEnum

| Name | Value |
|---- | -----|
| FINITE | &quot;finite&quot; |
| INDEFINITE | &quot;indefinite&quot; |



## Enum: RetentionTypeEnum

| Name | Value |
|---- | -----|
| MODIFIABLE | &quot;modifiable&quot; |
| NON_MODIFIABLE | &quot;non_modifiable&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| RETIRED | &quot;retired&quot; |



