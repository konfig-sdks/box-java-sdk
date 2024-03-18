

# SignRequestSignerAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hasViewedDocument** | **Boolean** | Set to &#x60;true&#x60; if the signer views the document |  [optional] [readonly] |
|**signerDecision** | [**SignRequestSignerAllOfSignerDecision**](SignRequestSignerAllOfSignerDecision.md) |  |  [optional] |
|**inputs** | [**List&lt;SignRequestSignerInput&gt;**](SignRequestSignerInput.md) |  |  [optional] [readonly] |
|**embedUrl** | **String** | URL to direct a signer to for signing |  [optional] [readonly] |
|**iframeableEmbedUrl** | **String** | This URL is specifically designed for signing documents within an HTML &#x60;iframe&#x60; tag. It will be returned in the response only if the &#x60;embed_url_external_user_id&#x60; parameter was passed in the &#x60;create sign request&#x60; call. |  [optional] |



