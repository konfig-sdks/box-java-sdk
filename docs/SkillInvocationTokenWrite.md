

# SkillInvocationTokenWrite

The basics of an access token

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessToken** | **String** | The requested access token. |  [optional] |
|**expiresIn** | **Long** | The time in seconds by which this token will expire. |  [optional] |
|**tokenType** | [**TokenTypeEnum**](#TokenTypeEnum) | The type of access token returned. |  [optional] |
|**restrictedTo** | **String** | The permissions that this access token permits, providing a list of resources (files, folders, etc) and the scopes permitted for each of those resources. |  [optional] |



## Enum: TokenTypeEnum

| Name | Value |
|---- | -----|
| BEARER | &quot;bearer&quot; |



