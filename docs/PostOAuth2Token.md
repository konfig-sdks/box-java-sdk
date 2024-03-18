

# PostOAuth2Token

A request for a new OAuth 2.0 token

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**grantType** | [**GrantTypeEnum**](#GrantTypeEnum) | The type of request being made, either using a client-side obtained authorization code, a refresh token, a JWT assertion, client credentials grant or another access token for the purpose of downscoping a token. |  |
|**clientId** | **String** | The Client ID of the application requesting an access token.  Used in combination with &#x60;authorization_code&#x60;, &#x60;client_credentials&#x60;, or &#x60;urn:ietf:params:oauth:grant-type:jwt-bearer&#x60; as the &#x60;grant_type&#x60;. |  [optional] |
|**clientSecret** | **String** | The client secret of the application requesting an access token.  Used in combination with &#x60;authorization_code&#x60;, &#x60;client_credentials&#x60;, or &#x60;urn:ietf:params:oauth:grant-type:jwt-bearer&#x60; as the &#x60;grant_type&#x60;. |  [optional] |
|**code** | **String** | The client-side authorization code passed to your application by Box in the browser redirect after the user has successfully granted your application permission to make API calls on their behalf.  Used in combination with &#x60;authorization_code&#x60; as the &#x60;grant_type&#x60;. |  [optional] |
|**refreshToken** | **String** | A refresh token used to get a new access token with.  Used in combination with &#x60;refresh_token&#x60; as the &#x60;grant_type&#x60;. |  [optional] |
|**assertion** | **String** | A JWT assertion for which to request a new access token.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:jwt-bearer&#x60; as the &#x60;grant_type&#x60;. |  [optional] |
|**subjectToken** | **String** | The token to exchange for a downscoped token. This can be a regular access token, a JWT assertion, or an app token.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:token-exchange&#x60; as the &#x60;grant_type&#x60;. |  [optional] |
|**subjectTokenType** | [**SubjectTokenTypeEnum**](#SubjectTokenTypeEnum) | The type of &#x60;subject_token&#x60; passed in.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:token-exchange&#x60; as the &#x60;grant_type&#x60;. |  [optional] |
|**actorToken** | **String** | The token used to create an annotator token. This is a JWT assertion.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:token-exchange&#x60; as the &#x60;grant_type&#x60;. |  [optional] |
|**actorTokenType** | [**ActorTokenTypeEnum**](#ActorTokenTypeEnum) | The type of &#x60;actor_token&#x60; passed in.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:token-exchange&#x60; as the &#x60;grant_type&#x60;. |  [optional] |
|**scope** | **String** | The space-delimited list of scopes that you want apply to the new access token.  The &#x60;subject_token&#x60; will need to have all of these scopes or the call will error with **401 Unauthorized**. |  [optional] |
|**resource** | **String** | Full URL for the file that the token should be generated for. |  [optional] |
|**boxSubjectType** | [**BoxSubjectTypeEnum**](#BoxSubjectTypeEnum) | Used in combination with &#x60;client_credentials&#x60; as the &#x60;grant_type&#x60;. |  [optional] |
|**boxSubjectId** | **String** | Used in combination with &#x60;client_credentials&#x60; as the &#x60;grant_type&#x60;. Value is determined by &#x60;box_subject_type&#x60;. If &#x60;user&#x60; use user ID and if &#x60;enterprise&#x60; use enterprise ID. |  [optional] |
|**boxSharedLink** | **String** | Full URL of the shared link on the file or folder that the token should be generated for. |  [optional] |



## Enum: GrantTypeEnum

| Name | Value |
|---- | -----|
| AUTHORIZATION_CODE | &quot;authorization_code&quot; |
| REFRESH_TOKEN | &quot;refresh_token&quot; |
| CLIENT_CREDENTIALS | &quot;client_credentials&quot; |
| URN_IETF_PARAMS_OAUTH_GRANT_TYPE_JWT_BEARER | &quot;urn:ietf:params:oauth:grant-type:jwt-bearer&quot; |
| URN_IETF_PARAMS_OAUTH_GRANT_TYPE_TOKEN_EXCHANGE | &quot;urn:ietf:params:oauth:grant-type:token-exchange&quot; |



## Enum: SubjectTokenTypeEnum

| Name | Value |
|---- | -----|
| URN_IETF_PARAMS_OAUTH_TOKEN_TYPE_ACCESS_TOKEN | &quot;urn:ietf:params:oauth:token-type:access_token&quot; |



## Enum: ActorTokenTypeEnum

| Name | Value |
|---- | -----|
| URN_IETF_PARAMS_OAUTH_TOKEN_TYPE_ID_TOKEN | &quot;urn:ietf:params:oauth:token-type:id_token&quot; |



## Enum: BoxSubjectTypeEnum

| Name | Value |
|---- | -----|
| ENTERPRISE | &quot;enterprise&quot; |
| USER | &quot;user&quot; |



