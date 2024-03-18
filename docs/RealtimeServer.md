

# RealtimeServer

A real-time server that can be used for long polling user events

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | &#x60;realtime_server&#x60; |  [optional] |
|**url** | **String** | The URL for the server. |  [optional] |
|**ttl** | **Integer** | The time in minutes for which this server is available |  [optional] |
|**maxRetries** | **Integer** | The maximum number of retries this server will allow before a new long poll should be started by getting a [new list of server](https://raw.githubusercontent.com). |  [optional] |
|**retryTimeout** | **Integer** | The maximum number of seconds without a response after which you should retry the long poll connection.  This helps to overcome network issues where the long poll looks to be working but no packages are coming through. |  [optional] |



