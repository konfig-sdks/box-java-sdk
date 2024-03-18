

# SignRequestSignerAllOfSignerDecision

Final decision made by the signer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of decision made by the signer |  [optional] |
|**finalizedAt** | **OffsetDateTime** | Date and Time that the decision was made |  [optional] |
|**additionalInfo** | **String** | Additional info about the decision, such as the decline reason from the signer |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SIGNED | &quot;signed&quot; |
| DECLINED | &quot;declined&quot; |



