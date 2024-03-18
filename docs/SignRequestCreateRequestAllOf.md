

# SignRequestCreateRequestAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceFiles** | [**List&lt;FileBase&gt;**](FileBase.md) | List of files to create a signing document from. This is currently limited to ten files. Only the ID and type fields are required for each file. |  [optional] |
|**signatureColor** | [**SignatureColorEnum**](#SignatureColorEnum) | Force a specific color for the signature (blue, black, or red) |  [optional] |
|**signers** | [**List&lt;SignRequestCreateSigner&gt;**](SignRequestCreateSigner.md) | Array of signers for the sign request. 35 is the max number of signers permitted. |  [optional] |
|**parentFolder** | [**FolderMini**](FolderMini.md) |  |  [optional] |



## Enum: SignatureColorEnum

| Name | Value |
|---- | -----|
| BLUE | &quot;blue&quot; |
| BLACK | &quot;black&quot; |
| RED | &quot;red&quot; |



