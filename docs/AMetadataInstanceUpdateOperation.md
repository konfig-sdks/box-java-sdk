

# AMetadataInstanceUpdateOperation

A [JSON-Patch](https://tools.ietf.org/html/rfc6902) operation for a change to make to the metadata instance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**op** | [**OpEnum**](#OpEnum) | The type of change to perform on the template. Some of these are hazardous as they will change existing templates. |  [optional] |
|**path** | **String** | The location in the metadata JSON object to apply the changes to, in the format of a [JSON-Pointer](https://tools.ietf.org/html/rfc6901).  The path must always be prefixed with a &#x60;/&#x60; to represent the root of the template. The characters &#x60;~&#x60; and &#x60;/&#x60; are reserved characters and must be escaped in the key. |  [optional] |
|**value** | **String** | The value to be set or tested.  Required for &#x60;add&#x60;, &#x60;replace&#x60;, and &#x60;test&#x60; operations. For &#x60;add&#x60;, if the value exists already the previous value will be overwritten by the new value. For &#x60;replace&#x60;, the value must exist before replacing.  For &#x60;test&#x60;, the existing value at the &#x60;path&#x60; location must match the specified value. |  [optional] |
|**from** | **String** | The location in the metadata JSON object to move or copy a value from. Required for &#x60;move&#x60; or &#x60;copy&#x60; operations and must be in the format of a [JSON-Pointer](https://tools.ietf.org/html/rfc6901). |  [optional] |



## Enum: OpEnum

| Name | Value |
|---- | -----|
| ADD | &quot;add&quot; |
| REPLACE | &quot;replace&quot; |
| REMOVE | &quot;remove&quot; |
| TEST | &quot;test&quot; |
| MOVE | &quot;move&quot; |
| COPY | &quot;copy&quot; |



