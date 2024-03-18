

# UploadsSmallFileRequestAttributes

The additional attributes of the file being uploaded. Mainly the name and the parent folder. These attributes are part of the multi part request body and are in JSON format.  <Message warning>    The `attributes` part of the body must come **before** the   `file` part. Requests that do not follow this format when   uploading the file will receive a HTTP `400` error with a   `metadata_after_file_contents` error code.  </Message>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the file |  |
|**parent** | [**UploadsSmallFileRequestAttributesParent**](UploadsSmallFileRequestAttributesParent.md) |  |  |
|**contentCreatedAt** | **OffsetDateTime** | Defines the time the file was originally created at.  If not set, the upload time will be used. |  [optional] |
|**contentModifiedAt** | **OffsetDateTime** | Defines the time the file was last modified at.  If not set, the upload time will be used. |  [optional] |



