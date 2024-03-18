

# SkillsUpdateAllBoxSkillCardsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Defines the status of this invocation. Set this to &#x60;success&#x60; when setting Skill cards. |  |
|**metadata** | [**SkillsUpdateAllBoxSkillCardsRequestMetadata**](SkillsUpdateAllBoxSkillCardsRequestMetadata.md) |  |  |
|**_file** | [**SkillsUpdateAllBoxSkillCardsRequestFile**](SkillsUpdateAllBoxSkillCardsRequestFile.md) |  |  |
|**fileVersion** | [**SkillsUpdateAllBoxSkillCardsRequestFileVersion**](SkillsUpdateAllBoxSkillCardsRequestFileVersion.md) |  |  [optional] |
|**usage** | [**SkillsUpdateAllBoxSkillCardsRequestUsage**](SkillsUpdateAllBoxSkillCardsRequestUsage.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| INVOKED | &quot;invoked&quot; |
| PROCESSING | &quot;processing&quot; |
| SUCCESS | &quot;success&quot; |
| TRANSIENT_FAILURE | &quot;transient_failure&quot; |
| PERMANENT_FAILURE | &quot;permanent_failure&quot; |



