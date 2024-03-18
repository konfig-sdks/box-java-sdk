

# MetadataCascadePoliciesCreatePolicyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**folderId** | **String** | The ID of the folder to apply the policy to. This folder will need to already have an instance of the targeted metadata template applied to it. |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) | The scope of the targeted metadata template. This template will need to already have an instance applied to the targeted folder. |  |
|**templateKey** | **String** | The key of the targeted metadata template. This template will need to already have an instance applied to the targeted folder.  In many cases the template key is automatically derived of its display name, for example &#x60;Contract Template&#x60; would become &#x60;contractTemplate&#x60;. In some cases the creator of the template will have provided its own template key.  Please [list the templates for an enterprise][list], or get all instances on a [file][file] or [folder][folder] to inspect a template&#39;s key.  [list]: e://get-metadata-templates-enterprise [file]: e://get-files-id-metadata [folder]: e://get-folders-id-metadata |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| GLOBAL | &quot;global&quot; |
| ENTERPRISE | &quot;enterprise&quot; |



