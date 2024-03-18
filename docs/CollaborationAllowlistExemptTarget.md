

# CollaborationAllowlistExemptTarget

The user that is exempt from any of the restrictions imposed by the list of allowed collaboration domains for this enterprise.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this exemption |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;collaboration_whitelist_exempt_target&#x60; |  [optional] |
|**enterprise** | [**CollaborationAllowlistExemptTargetEnterprise**](CollaborationAllowlistExemptTargetEnterprise.md) |  |  [optional] |
|**user** | [**CollaborationAllowlistExemptTargetUser**](CollaborationAllowlistExemptTargetUser.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The time the entry was created |  [optional] |
|**modifiedAt** | **OffsetDateTime** | The time the entry was modified |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COLLABORATION_WHITELIST_EXEMPT_TARGET | &quot;collaboration_whitelist_exempt_target&quot; |



