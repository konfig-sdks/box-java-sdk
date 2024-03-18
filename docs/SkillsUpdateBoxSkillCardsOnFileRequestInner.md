

# SkillsUpdateBoxSkillCardsOnFileRequestInner

An operation that replaces an existing card.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**op** | [**OpEnum**](#OpEnum) | &#x60;replace&#x60; |  [optional] |
|**path** | **String** | The JSON Path that represents the card to replace. In most cases this will be in the format &#x60;/cards/{index}&#x60; where &#x60;index&#x60; is the zero-indexed position of the card in the list of cards. |  [optional] |
|**value** | [**SkillsUpdateBoxSkillCardsOnFileRequestInnerValue**](SkillsUpdateBoxSkillCardsOnFileRequestInnerValue.md) |  |  [optional] |



## Enum: OpEnum

| Name | Value |
|---- | -----|
| REPLACE | &quot;replace&quot; |



