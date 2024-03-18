

# SkillsUpdateBoxSkillCardsOnFileRequestInnerValue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | The optional date and time this card was created at. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;skill_card&#x60; |  |
|**skillCardType** | [**SkillCardTypeEnum**](#SkillCardTypeEnum) | &#x60;status&#x60; |  |
|**skillCardTitle** | [**StatusSkillCardSkillCardTitle**](StatusSkillCardSkillCardTitle.md) |  |  [optional] |
|**skill** | [**StatusSkillCardSkill**](StatusSkillCardSkill.md) |  |  |
|**invocation** | [**StatusSkillCardInvocation**](StatusSkillCardInvocation.md) |  |  |
|**entries** | [**List&lt;TranscriptSkillCardEntriesInner&gt;**](TranscriptSkillCardEntriesInner.md) | An list of entries for the card. This represents the individual entries of the transcription. |  |
|**duration** | **Integer** | An optional total duration in seconds.  Used with a &#x60;skill_card_type&#x60; of &#x60;transcript&#x60; or &#x60;timeline&#x60;. |  [optional] |
|**status** | [**StatusSkillCardStatus**](StatusSkillCardStatus.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SKILL_CARD | &quot;skill_card&quot; |



## Enum: SkillCardTypeEnum

| Name | Value |
|---- | -----|
| STATUS | &quot;status&quot; |



