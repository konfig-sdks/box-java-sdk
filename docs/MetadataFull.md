

# MetadataFull

An instance of a metadata template, which has been applied to a file or folder.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**$parent** | **String** | The identifier of the item that this metadata instance has been attached to. This combines the &#x60;type&#x60; and the &#x60;id&#x60; of the parent in the form &#x60;{type}_{id}&#x60;. |  [optional] |
|**$template** | **String** | The name of the template |  [optional] |
|**$scope** | **String** | An ID for the scope in which this template has been applied. This will be &#x60;enterprise_{enterprise_id}&#x60; for templates defined for use in this enterprise, and &#x60;global&#x60; for general templates that are available to all enterprises using Box. |  [optional] |
|**$version** | **Integer** | The version of the metadata instance. This version starts at 0 and increases every time a user-defined property is modified. |  [optional] |
|**$canEdit** | **Boolean** | Whether the user can edit this metadata instance. |  [optional] |
|**$id** | **UUID** | A UUID to identify the metadata instance. |  [optional] |
|**$type** | **String** | A unique identifier for the \&quot;type\&quot; of this instance. This is an internal system property and should not be used by a client application. |  [optional] |
|**$typeVersion** | **Integer** | The last-known version of the template of the object. This is an internal system property and should not be used by a client application. |  [optional] |



