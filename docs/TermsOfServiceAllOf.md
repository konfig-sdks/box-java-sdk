

# TermsOfServiceAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Whether these terms are enabled or not |  [optional] |
|**enterprise** | [**Object**](Object.md) |  |  [optional] |
|**tosType** | [**TosTypeEnum**](#TosTypeEnum) | Whether to apply these terms to managed users or external users |  [optional] |
|**text** | **String** | The text for your terms and conditions. This text could be empty if the &#x60;status&#x60; is set to &#x60;disabled&#x60;. |  [optional] |
|**createdAt** | **OffsetDateTime** | When the legal item was created |  [optional] |
|**modifiedAt** | **OffsetDateTime** | When the legal item was modified. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;enabled&quot; |
| DISABLED | &quot;disabled&quot; |



## Enum: TosTypeEnum

| Name | Value |
|---- | -----|
| MANAGED | &quot;managed&quot; |
| EXTERNAL | &quot;external&quot; |



