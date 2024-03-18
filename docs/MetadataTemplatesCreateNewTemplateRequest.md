

# MetadataTemplatesCreateNewTemplateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | **String** | The scope of the metadata template to create. Applications can only create templates for use within the authenticated user&#39;s enterprise.  This value needs to be set to &#x60;enterprise&#x60;, as &#x60;global&#x60; scopes can not be created by applications. |  |
|**templateKey** | **String** | A unique identifier for the template. This identifier needs to be unique across the enterprise for which the metadata template is being created.  When not provided, the API will create a unique &#x60;templateKey&#x60; based on the value of the &#x60;displayName&#x60;. |  [optional] |
|**displayName** | **String** | The display name of the template. |  |
|**hidden** | **Boolean** | Defines if this template is visible in the Box web app UI, or if it is purely intended for usage through the API. |  [optional] |
|**fields** | [**List&lt;MetadataFieldWrite&gt;**](MetadataFieldWrite.md) | An ordered list of template fields which are part of the template. Each field can be a regular text field, date field, number field, as well as a single or multi-select list. |  [optional] |
|**copyInstanceOnItemCopy** | **Boolean** | Whether or not to copy any metadata attached to a file or folder when it is copied. By default, metadata is not copied along with a file or folder when it is copied. |  [optional] |



