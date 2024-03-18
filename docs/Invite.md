

# Invite

An invite for a user to an enterprise.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this invite |  |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;invite&#x60; |  |
|**invitedTo** | [**EnterpriseProperty**](EnterpriseProperty.md) |  |  [optional] |
|**actionableBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**invitedBy** | [**UserMini**](UserMini.md) |  |  [optional] |
|**status** | **String** | The status of the invite |  [optional] |
|**createdAt** | **OffsetDateTime** | When the invite was created |  [optional] |
|**modifiedAt** | **OffsetDateTime** | When the invite was modified. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INVITE | &quot;invite&quot; |



