

# MetadataFilter

A metadata template to filter the search results by.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**ScopeEnum**](#ScopeEnum) | Specifies the scope of the template to filter search results by.  This will be &#x60;enterprise_{enterprise_id}&#x60; for templates defined for use in this enterprise, and &#x60;global&#x60; for general templates that are available to all enterprises using Box. |  [optional] |
|**templateKey** | **String** | The key of the template to filter search results by.  In many cases the template key is automatically derived of its display name, for example &#x60;Contract Template&#x60; would become &#x60;contractTemplate&#x60;. In some cases the creator of the template will have provided its own template key.  Please [list the templates for an enterprise][list], or get all instances on a [file][file] or [folder][folder] to inspect a template&#39;s key.  [list]: e://get-metadata-templates-enterprise [file]: e://get-files-id-metadata [folder]: e://get-folders-id-metadata |  [optional] |
|**filters** | [**Map**](Map.md) |  |  [optional] |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| GLOBAL | &quot;global&quot; |
| ENTERPRISE | &quot;enterprise&quot; |
| ENTERPRISE__ENTERPRISE_ID_ | &quot;enterprise_{enterprise_id}&quot; |



