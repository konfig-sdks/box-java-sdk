

# FolderAllOfFolderUploadEmail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | [**AccessEnum**](#AccessEnum) | When this parameter has been set, users can email files to the email address that has been automatically created for this folder.  To create an email address, set this property either when creating or updating the folder.  When set to &#x60;collaborators&#x60;, only emails from registered email addresses for collaborators will be accepted. This includes any email aliases a user might have registered.  When set to &#x60;open&#x60; it will accept emails from any email address. |  [optional] |
|**email** | **String** | The optional upload email address for this folder. |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| COLLABORATORS | &quot;collaborators&quot; |



