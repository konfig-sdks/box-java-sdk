

# SkillInvocation

The payload of a Box skill as sent to a skill's `invocation_url`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;skill_invocation&#x60; |  [optional] |
|**id** | **String** | Unique identifier for the invocation request. |  [optional] |
|**skill** | [**SkillInvocationSkill**](SkillInvocationSkill.md) |  |  [optional] |
|**token** | [**SkillInvocationToken**](SkillInvocationToken.md) |  |  [optional] |
|**status** | [**SkillInvocationStatus**](SkillInvocationStatus.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The time this invocation was created. |  [optional] |
|**trigger** | **String** | Action that triggered the invocation |  [optional] |
|**enterprise** | [**SkillInvocationEnterprise**](SkillInvocationEnterprise.md) |  |  [optional] |
|**source** | [**SkillInvocationSource**](SkillInvocationSource.md) |  |  [optional] |
|**event** | [**SkillInvocationEvent**](SkillInvocationEvent.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SKILL_INVOCATION | &quot;skill_invocation&quot; |



