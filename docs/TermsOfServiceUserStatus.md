

# TermsOfServiceUserStatus

The association between a Terms of Service and a user

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this terms of service user status |  |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;terms_of_service_user_status&#x60; |  |
|**tos** | [**TermsOfServiceUserStatusTos**](TermsOfServiceUserStatusTos.md) |  |  [optional] |
|**user** | [**TermsOfServiceUserStatusUser**](TermsOfServiceUserStatusUser.md) |  |  [optional] |
|**isAccepted** | **Boolean** | If the user has accepted the terms of services |  [optional] |
|**createdAt** | **OffsetDateTime** | When the legal item was created |  [optional] |
|**modifiedAt** | **OffsetDateTime** | When the legal item was modified. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TERMS_OF_SERVICE_USER_STATUS | &quot;terms_of_service_user_status&quot; |



