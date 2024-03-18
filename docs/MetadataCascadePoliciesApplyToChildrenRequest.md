

# MetadataCascadePoliciesApplyToChildrenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conflictResolution** | [**ConflictResolutionEnum**](#ConflictResolutionEnum) | Describes the desired behavior when dealing with the conflict where a metadata template already has an instance applied to a child.  * &#x60;none&#x60; will preserve the existing value on the file * &#x60;overwrite&#x60; will force-apply the templates values over   any existing values. |  |



## Enum: ConflictResolutionEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| OVERWRITE | &quot;overwrite&quot; |



