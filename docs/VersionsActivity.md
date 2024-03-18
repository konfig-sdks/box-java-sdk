

# VersionsActivity

Versions activity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionBy** | [**List&lt;FileActivityUser&gt;**](FileActivityUser.md) | Users who performed one of the &#x60;action_types&#x60; (&#x60;created&#x60;, &#x60;deleted&#x60; or &#x60;restored&#x60;) |  [optional] |
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) |  |  [optional] |
|**end** | [**VersionsActivityEnd**](VersionsActivityEnd.md) |  |  [optional] |
|**start** | [**VersionsActivityStart**](VersionsActivityStart.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |



## Enum: ActionTypeEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| RESTORED | &quot;restored&quot; |
| TRASHED | &quot;trashed&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VERSIONS | &quot;versions&quot; |



