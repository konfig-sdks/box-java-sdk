

# PostCommentsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** | The text of the comment.  To mention a user, use the &#x60;tagged_message&#x60; parameter instead. |  |
|**taggedMessage** | **String** | The text of the comment, including &#x60;@[user_id:name]&#x60; somewhere in the message to mention another user, which will send them an email notification, letting them know they have been mentioned.  The &#x60;user_id&#x60; is the target user&#39;s ID, where the &#x60;name&#x60; can be any custom phrase. In the Box UI this name will link to the user&#39;s profile.  If you are not mentioning another user, use &#x60;message&#x60; instead. |  [optional] |
|**item** | [**PostCommentsRequestItem**](PostCommentsRequestItem.md) |  |  |



