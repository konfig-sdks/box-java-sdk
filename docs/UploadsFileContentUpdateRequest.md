

# UploadsFileContentUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**UploadsFileContentUpdateRequestAttributes**](UploadsFileContentUpdateRequestAttributes.md) |  |  |
|**_file** | **File** | The content of the file to upload to Box.  &lt;Message warning&gt;    The &#x60;attributes&#x60; part of the body must come **before** the   &#x60;file&#x60; part. Requests that do not follow this format when   uploading the file will receive a HTTP &#x60;400&#x60; error with a   &#x60;metadata_after_file_contents&#x60; error code.  &lt;/Message&gt; |  |



