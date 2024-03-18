

# FilesUpdateFileRequestPermissions

Defines who can download a file.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canDownload** | [**CanDownloadEnum**](#CanDownloadEnum) | Defines who is allowed to download this file. The possible values are either &#x60;open&#x60; for everyone or &#x60;company&#x60; for the other members of the user&#39;s enterprise.  This setting overrides the download permissions that are normally part of the &#x60;role&#x60; of a collaboration. When set to &#x60;company&#x60;, this essentially removes the download option for external users with &#x60;viewer&#x60; or &#x60;editor&#x60; a roles. |  [optional] |



## Enum: CanDownloadEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| COMPANY | &quot;company&quot; |



