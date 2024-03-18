

# FileBase

The bare basic representation of a file, the minimal amount of fields returned when using the `fields` query parameter.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier that represent a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/files/123&#x60; the &#x60;file_id&#x60; is &#x60;123&#x60;. |  |
|**etag** | **String** | The HTTP &#x60;etag&#x60; of this file. This can be used within some API endpoints in the &#x60;If-Match&#x60; and &#x60;If-None-Match&#x60; headers to only perform changes on the file if (no) changes have happened. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;file&#x60; |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILE | &quot;file&quot; |



