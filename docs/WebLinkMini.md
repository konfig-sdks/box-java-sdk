

# WebLinkMini

Web links are objects that point to URLs. These objects are also known as bookmarks within the Box web application.  Web link objects are treated similarly to file objects, they will also support most actions that apply to regular files.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this web link |  |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;web_link&#x60; |  |
|**etag** | **String** | The entity tag of this web link. Used with &#x60;If-Match&#x60; headers. |  [optional] |
|**url** | **String** | The URL this web link points to |  [optional] |
|**sequenceId** | [**String**](String.md) |  |  [optional] |
|**name** | **String** | The name of the web link |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| WEB_LINK | &quot;web_link&quot; |



