

# ClientError

A generic error

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | error |  [optional] |
|**status** | **Integer** | The HTTP status of the response. |  [optional] |
|**code** | [**CodeEnum**](#CodeEnum) | A Box-specific error code |  [optional] |
|**message** | **String** | A short message describing the error. |  [optional] |
|**contextInfo** | [**ClientErrorContextInfo**](ClientErrorContextInfo.md) |  |  [optional] |
|**helpUrl** | **String** | A URL that links to more information about why this error occurred. |  [optional] |
|**requestId** | **String** | A unique identifier for this response, which can be used when contacting Box support. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ERROR | &quot;error&quot; |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| ACCEPTED | &quot;accepted&quot; |
| NO_CONTENT | &quot;no_content&quot; |
| REDIRECT | &quot;redirect&quot; |
| NOT_MODIFIED | &quot;not_modified&quot; |
| BAD_REQUEST | &quot;bad_request&quot; |
| UNAUTHORIZED | &quot;unauthorized&quot; |
| FORBIDDEN | &quot;forbidden&quot; |
| NOT_FOUND | &quot;not_found&quot; |
| METHOD_NOT_ALLOWED | &quot;method_not_allowed&quot; |
| CONFLICT | &quot;conflict&quot; |
| PRECONDITION_FAILED | &quot;precondition_failed&quot; |
| TOO_MANY_REQUESTS | &quot;too_many_requests&quot; |
| INTERNAL_SERVER_ERROR | &quot;internal_server_error&quot; |
| UNAVAILABLE | &quot;unavailable&quot; |
| ITEM_NAME_INVALID | &quot;item_name_invalid&quot; |
| INSUFFICIENT_SCOPE | &quot;insufficient_scope&quot; |



