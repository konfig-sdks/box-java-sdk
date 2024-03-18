

# CollaborationAllowlistEntry

An entry that describes an approved domain for which users can collaborate with files and folders in your enterprise or vice versa.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this entry |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;collaboration_whitelist_entry&#x60; |  [optional] |
|**domain** | **String** | The whitelisted domain |  [optional] |
|**direction** | [**DirectionEnum**](#DirectionEnum) | The direction of the collaborations to allow. |  [optional] |
|**enterprise** | [**CollaborationAllowlistEntryEnterprise**](CollaborationAllowlistEntryEnterprise.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The time the entry was created at |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COLLABORATION_WHITELIST_ENTRY | &quot;collaboration_whitelist_entry&quot; |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |
| BOTH | &quot;both&quot; |



