

# FilesUpdateFileRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** | The tags for this item. These tags are shown in the Box web app and mobile apps next to an item.  To add or remove a tag, retrieve the item&#39;s current tags, modify them, and then update this field.  There is a limit of 100 tags per item, and 10,000 unique tags per enterprise. |  [optional] |
|**description** | **String** | The description for a file. This can be seen in the right-hand sidebar panel when viewing a file in the Box web app. Additionally, this index is used in the search index of the file, allowing users to find the file by the content in the description. |  [optional] |
|**name** | **String** | An optional different name for the file. This can be used to rename the file. |  [optional] |
|**parent** | [**FilesUpdateFileRequestParent**](FilesUpdateFileRequestParent.md) |  |  [optional] |
|**sharedLink** | [**FilesUpdateFileRequestSharedLink**](FilesUpdateFileRequestSharedLink.md) |  |  [optional] |
|**lock** | [**FilesUpdateFileRequestLock**](FilesUpdateFileRequestLock.md) |  |  [optional] |
|**dispositionAt** | **OffsetDateTime** | The retention expiration timestamp for the given file. This date cannot be shortened once set on a file. |  [optional] |
|**permissions** | [**FilesUpdateFileRequestPermissions**](FilesUpdateFileRequestPermissions.md) |  |  [optional] |
|**collections** | [**List&lt;Reference1&gt;**](Reference1.md) | An array of collections to make this file a member of. Currently we only support the &#x60;favorites&#x60; collection.  To get the ID for a collection, use the [List all collections][1] endpoint.  Passing an empty array &#x60;[]&#x60; or &#x60;null&#x60; will remove the file from all collections.  [1]: e://get-collections |  [optional] |



