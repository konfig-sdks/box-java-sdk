

# AccessToken

A token that can be used to make authenticated API calls.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessToken** | **String** | The requested access token. |  [optional] |
|**expiresIn** | **Long** | The time in seconds by which this token will expire. |  [optional] |
|**tokenType** | [**TokenTypeEnum**](#TokenTypeEnum) | The type of access token returned. |  [optional] |
|**restrictedTo** | [**List&lt;FileOrFolderScope&gt;**](FileOrFolderScope.md) | The permissions that this access token permits, providing a list of resources (files, folders, etc) and the scopes permitted for each of those resources. |  [optional] |
|**refreshToken** | **String** | The refresh token for this access token, which can be used to request a new access token when the current one expires. |  [optional] |
|**issuedTokenType** | [**IssuedTokenTypeEnum**](#IssuedTokenTypeEnum) | The type of downscoped access token returned. This is only returned if an access token has been downscoped. |  [optional] |



## Enum: TokenTypeEnum

| Name | Value |
|---- | -----|
| BEARER | &quot;bearer&quot; |



## Enum: IssuedTokenTypeEnum

| Name | Value |
|---- | -----|
| URN_IETF_PARAMS_OAUTH_TOKEN_TYPE_ACCESS_TOKEN | &quot;urn:ietf:params:oauth:token-type:access_token&quot; |



