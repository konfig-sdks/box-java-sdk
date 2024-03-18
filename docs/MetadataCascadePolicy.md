

# MetadataCascadePolicy

A metadata cascade policy automatically applies a metadata template instance to all the files and folders within the targeted folder.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the metadata cascade policy object |  |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;metadata_cascade_policy&#x60; |  |
|**ownerEnterprise** | [**MetadataCascadePolicyOwnerEnterprise**](MetadataCascadePolicyOwnerEnterprise.md) |  |  [optional] |
|**parent** | [**MetadataCascadePolicyParent**](MetadataCascadePolicyParent.md) |  |  [optional] |
|**scope** | **String** | The scope of the metadata cascade policy can either be &#x60;global&#x60; or &#x60;enterprise_*&#x60;. The &#x60;global&#x60; scope is used for policies that are available to any Box enterprise. The &#x60;enterprise_*&#x60; scope represents policies that have been created within a specific enterprise, where &#x60;*&#x60; will be the ID of that enterprise. |  [optional] |
|**templateKey** | **String** | The key of the template that is cascaded down to the folder&#39;s children.  In many cases the template key is automatically derived of its display name, for example &#x60;Contract Template&#x60; would become &#x60;contractTemplate&#x60;. In some cases the creator of the template will have provided its own template key.  Please [list the templates for an enterprise][list], or get all instances on a [file][file] or [folder][folder] to inspect a template&#39;s key.  [list]: e://get-metadata-templates-enterprise [file]: e://get-files-id-metadata [folder]: e://get-folders-id-metadata |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| METADATA_CASCADE_POLICY | &quot;metadata_cascade_policy&quot; |



