

# SignRequestSignerInputAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of input |  [optional] |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | Content type of input |  [optional] |
|**pageIndex** | **Integer** | Index of page that the input is on |  [optional] |
|**readOnly** | **Boolean** | Whether this input was defined as read-only(immutable by signers) or not |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SIGNATURE | &quot;signature&quot; |
| DATE | &quot;date&quot; |
| TEXT | &quot;text&quot; |
| CHECKBOX | &quot;checkbox&quot; |
| RADIO | &quot;radio&quot; |
| DROPDOWN | &quot;dropdown&quot; |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| SIGNATURE | &quot;signature&quot; |
| INITIAL | &quot;initial&quot; |
| STAMP | &quot;stamp&quot; |
| DATE | &quot;date&quot; |
| CHECKBOX | &quot;checkbox&quot; |
| TEXT | &quot;text&quot; |
| FULL_NAME | &quot;full_name&quot; |
| FIRST_NAME | &quot;first_name&quot; |
| LAST_NAME | &quot;last_name&quot; |
| COMPANY | &quot;company&quot; |
| TITLE | &quot;title&quot; |
| EMAIL | &quot;email&quot; |
| ATTACHMENT | &quot;attachment&quot; |
| RADIO | &quot;radio&quot; |
| DROPDOWN | &quot;dropdown&quot; |



