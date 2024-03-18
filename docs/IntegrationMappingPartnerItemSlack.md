

# IntegrationMappingPartnerItemSlack

The schema for an integration mapping mapped item object for type Slack.  Depending if Box for Slack is installed at the org or workspace level, provide **either** `slack_org_id` **or** `slack_workspace_id`. Do not use both parameters at the same time.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of the mapped item referenced in &#x60;id&#x60; |  |
|**id** | **String** | ID of the mapped item (of type referenced in &#x60;type&#x60;) |  |
|**slackWorkspaceId** | **String** | ID of the Slack workspace with which the item is associated. Use this parameter if Box for Slack is installed at a workspace level. Do not use &#x60;slack_org_id&#x60; at the same time. |  [optional] |
|**slackOrgId** | **String** | ID of the Slack org with which the item is associated. Use this parameter if Box for Slack is installed at the org level. Do not use &#x60;slack_workspace_id&#x60; at the same time. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CHANNEL | &quot;channel&quot; |



