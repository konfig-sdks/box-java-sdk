

# MetadataFieldRead

A field within a metadata template. Fields can be a basic text, date, or number field, or a list of options.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description of the field. This is not shown to the user. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of field. The basic fields are a &#x60;string&#x60; field for text, a &#x60;float&#x60; field for numbers, and a &#x60;date&#x60; fields to present the user with a date-time picker.  Additionally, metadata templates support an &#x60;enum&#x60; field for a basic list of items, and &#x60; multiSelect&#x60; field for a similar list of items where the user can select more than one value.  **Note**: The &#x60;integer&#x60; value is deprecated. It is still present in the response, but cannot be used in the POST request. |  |
|**key** | **String** | A unique identifier for the field. The identifier must be unique within the template to which it belongs. |  |
|**displayName** | **String** | The display name of the field as it is shown to the user in the web and mobile apps. |  |
|**hidden** | **Boolean** | Whether this field is hidden in the UI for the user and can only be set through the API instead. |  [optional] |
|**options** | [**List&lt;MetadataOptionWrite&gt;**](MetadataOptionWrite.md) | A list of options for this field. This is used in combination with the &#x60;enum&#x60; and &#x60;multiSelect&#x60; field types. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;string&quot; |
| FLOAT | &quot;float&quot; |
| DATE | &quot;date&quot; |
| ENUM | &quot;enum&quot; |
| MULTISELECT | &quot;multiSelect&quot; |
| INTEGER | &quot;integer&quot; |



