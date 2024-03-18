

# TermsOfServiceCreateForEnterpriseAndTypeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Whether this terms of service is active. |  |
|**tosType** | [**TosTypeEnum**](#TosTypeEnum) | The type of user to set the terms of service for. |  [optional] |
|**text** | **String** | The terms of service text to display to users.  The text can be set to empty if the &#x60;status&#x60; is set to &#x60;disabled&#x60;. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;enabled&quot; |
| DISABLED | &quot;disabled&quot; |



## Enum: TosTypeEnum

| Name | Value |
|---- | -----|
| EXTERNAL | &quot;external&quot; |
| MANAGED | &quot;managed&quot; |



