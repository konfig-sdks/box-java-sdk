

# TimelineSkillCard

A Box Skill metadata card that places a list of images on a timeline.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | The optional date and time this card was created at. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;skill_card&#x60; |  |
|**skillCardType** | [**SkillCardTypeEnum**](#SkillCardTypeEnum) | &#x60;timeline&#x60; |  |
|**skillCardTitle** | [**TimelineSkillCardSkillCardTitle**](TimelineSkillCardSkillCardTitle.md) |  |  [optional] |
|**skill** | [**TimelineSkillCardSkill**](TimelineSkillCardSkill.md) |  |  |
|**invocation** | [**TimelineSkillCardInvocation**](TimelineSkillCardInvocation.md) |  |  |
|**duration** | **Integer** | An total duration in seconds of the timeline. |  [optional] |
|**entries** | [**List&lt;TimelineSkillCardEntriesInner&gt;**](TimelineSkillCardEntriesInner.md) | A list of entries on the timeline. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SKILL_CARD | &quot;skill_card&quot; |



## Enum: SkillCardTypeEnum

| Name | Value |
|---- | -----|
| TIMELINE | &quot;timeline&quot; |



