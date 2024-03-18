

# Workflows

A list of workflows.  You application must be authorized to use the `Manage Box Relay` application scope within the developer console in order to use this resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**limit** | **Long** | The limit that was used for these entries. This will be the same as the &#x60;limit&#x60; query parameter unless that value exceeded the maximum value allowed. The maximum value varies by API. |  [optional] |
|**nextMarker** | **String** | The marker for the start of the next page of results. |  [optional] |
|**prevMarker** | **String** | The marker for the start of the previous page of results. |  [optional] |
|**entries** | [**List&lt;Workflow&gt;**](Workflow.md) | A list of workflows |  [optional] |



