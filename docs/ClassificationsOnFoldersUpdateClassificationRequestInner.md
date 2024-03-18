

# ClassificationsOnFoldersUpdateClassificationRequestInner

The operation to perform on the classification metadata template instance. In this case, it use used to replace the value stored for the `Box__Security__Classification__Key` field with a new value.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**op** | [**OpEnum**](#OpEnum) | &#x60;replace&#x60; |  |
|**path** | [**PathEnum**](#PathEnum) | Defines classifications  available in the enterprise. |  |
|**value** | **String** | The name of the classification to apply to this folder.  To list the available classifications in an enterprise, use the classification API to retrieve the [classification template](e://get_metadata_templates_enterprise_securityClassification-6VMVochwUWo_schema) which lists all available classification keys. |  |



## Enum: OpEnum

| Name | Value |
|---- | -----|
| REPLACE | &quot;replace&quot; |



## Enum: PathEnum

| Name | Value |
|---- | -----|
| _BOX__SECURITY__CLASSIFICATION__KEY | &quot;/Box__Security__Classification__Key&quot; |



