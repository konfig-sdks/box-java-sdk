

# SignTemplateAllOfReadySignLink

Box's ready-sign link feature enables you to create a link to a signature request that you've created from a template. Use this link when you want to post a signature request on a public form — such as an email, social media post, or web page — without knowing who the signers will be. Note: The ready-sign link feature is limited to Enterprise Plus customers and not available to Box Verified Enterprises.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | The URL that can be sent to signers. |  [optional] |
|**name** | **String** | Request name. |  [optional] |
|**instructions** | **String** | Extra instructions for all signers. |  [optional] |
|**folderId** | **String** | The destination folder to place final, signed document and signing log. Only &#x60;ID&#x60; and &#x60;type&#x60; fields are required. The root folder, folder ID &#x60;0&#x60;, cannot be used. |  [optional] |
|**isNotificationDisabled** | **Boolean** | Whether to disable notifications when a signer has signed. |  [optional] |
|**isActive** | **Boolean** | Whether the ready sign link is enabled or not. |  [optional] |



