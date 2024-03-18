

# FoldersUpdateFolderRequestSharedLink


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | [**AccessEnum**](#AccessEnum) | The level of access for the shared link. This can be restricted to anyone with the link (&#x60;open&#x60;), only people within the company (&#x60;company&#x60;) and only those who have been invited to the folder (&#x60;collaborators&#x60;).  If not set, this field defaults to the access level specified by the enterprise admin. To create a shared link with this default setting pass the &#x60;shared_link&#x60; object with no &#x60;access&#x60; field, for example &#x60;{ \&quot;shared_link\&quot;: {} }&#x60;.  The &#x60;company&#x60; access level is only available to paid accounts. |  [optional] |
|**password** | **String** | The password required to access the shared link. Set the password to &#x60;null&#x60; to remove it. Passwords must now be at least eight characters long and include a number, upper case letter, or a non-numeric or non-alphabetic character. A password can only be set when &#x60;access&#x60; is set to &#x60;open&#x60;. |  [optional] |
|**vanityName** | **String** | Defines a custom vanity name to use in the shared link URL, for example &#x60;https://app.box.com/v/my-shared-link&#x60;.  Custom URLs should not be used when sharing sensitive content as vanity URLs are a lot easier to guess than regular shared links. |  [optional] |
|**unsharedAt** | **OffsetDateTime** | The timestamp at which this shared link will expire. This field can only be set by users with paid accounts. |  [optional] |
|**permissions** | [**FoldersUpdateFolderRequestSharedLinkAllOfPermissions**](FoldersUpdateFolderRequestSharedLinkAllOfPermissions.md) |  |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| COMPANY | &quot;company&quot; |
| COLLABORATORS | &quot;collaborators&quot; |



