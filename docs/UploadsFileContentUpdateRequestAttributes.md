

# UploadsFileContentUpdateRequestAttributes

The additional attributes of the file being uploaded. Mainly the name and the parent folder. These attributes are part of the multi part request body and are in JSON format.  <Message warning>    The `attributes` part of the body must come **before** the   `file` part. Requests that do not follow this format when   uploading the file will receive a HTTP `400` error with a   `metadata_after_file_contents` error code.  </Message>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | An optional new name for the file. If specified, the file will be renamed when the new version is uploaded. |  |
|**contentModifiedAt** | **OffsetDateTime** | Defines the time the file was last modified at.  If not set, the upload time will be used. |  [optional] |



