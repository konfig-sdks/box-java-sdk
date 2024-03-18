

# PostOAuth2TokenRefreshAccessToken

A request to refresh an Access Token. Use this API to refresh an expired Access Token using a valid Refresh Token.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**grantType** | [**GrantTypeEnum**](#GrantTypeEnum) | The type of request being made, in this case a refresh request. |  |
|**clientId** | **String** | The client ID of the application requesting to refresh the token. |  |
|**clientSecret** | **String** | The client secret of the application requesting to refresh the token. |  |
|**refreshToken** | **String** | The refresh token to refresh. |  |



## Enum: GrantTypeEnum

| Name | Value |
|---- | -----|
| REFRESH_TOKEN | &quot;refresh_token&quot; |



