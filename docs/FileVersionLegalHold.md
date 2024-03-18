

# FileVersionLegalHold

File-Version-Legal-Hold is an entity representing all holds on a File Version.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this file version legal hold |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;file_version_legal_hold&#x60; |  [optional] |
|**fileVersion** | [**FileVersionLegalHoldFileVersion**](FileVersionLegalHoldFileVersion.md) |  |  [optional] |
|**_file** | [**FileVersionLegalHoldFile**](FileVersionLegalHoldFile.md) |  |  [optional] |
|**legalHoldPolicyAssignments** | [**List&lt;LegalHoldPolicyAssignment&gt;**](LegalHoldPolicyAssignment.md) | List of assignments contributing to this Hold. |  [optional] |
|**deletedAt** | **OffsetDateTime** | Time that this File-Version-Legal-Hold was deleted. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILE_VERSION_LEGAL_HOLD | &quot;file_version_legal_hold&quot; |



