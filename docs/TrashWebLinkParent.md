

# TrashWebLinkParent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier that represent a folder.  The ID for any folder can be determined by visiting a folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folders/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;. |  |
|**etag** | **String** | The HTTP &#x60;etag&#x60; of this folder. This can be used within some API endpoints in the &#x60;If-Match&#x60; and &#x60;If-None-Match&#x60; headers to only perform changes on the folder if (no) changes have happened. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;folder&#x60; |  |
|**sequenceId** | [**String**](String.md) |  |  [optional] |
|**name** | **String** | The name of the folder. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FOLDER | &quot;folder&quot; |



