

# StatusSkillCard

A Box Skill metadata card that puts a status message in the metadata sidebar.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | The optional date and time this card was created at. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;skill_card&#x60; |  |
|**skillCardType** | [**SkillCardTypeEnum**](#SkillCardTypeEnum) | &#x60;status&#x60; |  |
|**skillCardTitle** | [**StatusSkillCardSkillCardTitle**](StatusSkillCardSkillCardTitle.md) |  |  [optional] |
|**status** | [**StatusSkillCardStatus**](StatusSkillCardStatus.md) |  |  |
|**skill** | [**StatusSkillCardSkill**](StatusSkillCardSkill.md) |  |  |
|**invocation** | [**StatusSkillCardInvocation**](StatusSkillCardInvocation.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SKILL_CARD | &quot;skill_card&quot; |



## Enum: SkillCardTypeEnum

| Name | Value |
|---- | -----|
| STATUS | &quot;status&quot; |



