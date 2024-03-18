

# TranscriptSkillCard

A Box Skill metadata card that adds a transcript to a file.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | The optional date and time this card was created at. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;skill_card&#x60; |  |
|**skillCardType** | [**SkillCardTypeEnum**](#SkillCardTypeEnum) | &#x60;transcript&#x60; |  |
|**skillCardTitle** | [**TranscriptSkillCardSkillCardTitle**](TranscriptSkillCardSkillCardTitle.md) |  |  [optional] |
|**skill** | [**TranscriptSkillCardSkill**](TranscriptSkillCardSkill.md) |  |  |
|**invocation** | [**TranscriptSkillCardInvocation**](TranscriptSkillCardInvocation.md) |  |  |
|**duration** | **Integer** | An optional total duration in seconds.  Used with a &#x60;skill_card_type&#x60; of &#x60;transcript&#x60; or &#x60;timeline&#x60;. |  [optional] |
|**entries** | [**List&lt;TranscriptSkillCardEntriesInner&gt;**](TranscriptSkillCardEntriesInner.md) | An list of entries for the card. This represents the individual entries of the transcription. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SKILL_CARD | &quot;skill_card&quot; |



## Enum: SkillCardTypeEnum

| Name | Value |
|---- | -----|
| TRANSCRIPT | &quot;transcript&quot; |



