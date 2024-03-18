

# KeywordSkillCard

A skill card that contains a set of keywords

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | The optional date and time this card was created at. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;skill_card&#x60; |  |
|**skillCardType** | [**SkillCardTypeEnum**](#SkillCardTypeEnum) | &#x60;keyword&#x60; |  |
|**skillCardTitle** | [**KeywordSkillCardSkillCardTitle**](KeywordSkillCardSkillCardTitle.md) |  |  [optional] |
|**skill** | [**KeywordSkillCardSkill**](KeywordSkillCardSkill.md) |  |  |
|**invocation** | [**KeywordSkillCardInvocation**](KeywordSkillCardInvocation.md) |  |  |
|**entries** | [**List&lt;KeywordSkillCardEntriesInner&gt;**](KeywordSkillCardEntriesInner.md) | An list of entries in the metadata card. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SKILL_CARD | &quot;skill_card&quot; |



## Enum: SkillCardTypeEnum

| Name | Value |
|---- | -----|
| KEYWORD | &quot;keyword&quot; |



