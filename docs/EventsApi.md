# EventsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**events**](EventsApi.md#events) | **GET** /events | List user and enterprise events |
| [**events_0**](EventsApi.md#events_0) | **OPTIONS** /events | Get events long poll endpoint |


<a name="events"></a>
# **events**
> Events events().streamType(streamType).streamPosition(streamPosition).limit(limit).eventType(eventType).createdAfter(createdAfter).createdBefore(createdBefore).execute();

List user and enterprise events

Returns up to a year of past events for a given user or for the entire enterprise.  By default this returns events for the authenticated user. To retrieve events for the entire enterprise, set the &#x60;stream_type&#x60; to &#x60;admin_logs_streaming&#x60; for live monitoring of new events, or &#x60;admin_logs&#x60; for querying across historical events. The user making the API call will need to have admin privileges, and the application will need to have the scope &#x60;manage enterprise properties&#x60; checked.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.box.com/2.0";
    
    // Configure OAuth2 access token for authorization: OAuth2Security
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Box client = new Box(configuration);
    String streamType = "all"; // Defines the type of events that are returned  * `all` returns everything for a user and is the default * `changes` returns events that may cause file tree changes   such as file updates or collaborations. * `sync` is similar to `changes` but only applies to synced folders * `admin_logs` returns all events for an entire enterprise and   requires the user making the API call to have admin permissions. This   stream type is for programmatically pulling from a 1 year history of   events across all users within the enterprise and within a   `created_after` and `created_before` time frame. The complete history   of events will be returned in chronological order based on the event   time, but latency will be much higher than `admin_logs_streaming`. * `admin_logs_streaming` returns all events for an entire enterprise and   requires the user making the API call to have admin permissions. This   stream type is for polling for recent events across all users within   the enterprise. Latency will be much lower than `admin_logs`, but   events will not be returned in chronological order and may   contain duplicates.
    String streamPosition = "1348790499819"; // The location in the event stream to start receiving events from.  * `now` will return an empty list events and the latest stream position for initialization. * `0` or `null` will return all events.
    Long limit = 100L; // Limits the number of events returned  Note: Sometimes, the events less than the limit requested can be returned even when there may be more events remaining. This is primarily done in the case where a number of events have already been retrieved and these retrieved events are returned rather than delaying for an unknown amount of time to see if there are any more results.
    List<String> eventType = Arrays.asList(); // A comma-separated list of events to filter by. This can only be used when requesting the events with a `stream_type` of `admin_logs` or `adming_logs_streaming`. For any other `stream_type` this value will be ignored.
    OffsetDateTime createdAfter = OffsetDateTime.parse("2012-12-12T10:53:43-08:00"); // The lower bound date and time to return events for. This can only be used when requesting the events with a `stream_type` of `admin_logs`. For any other `stream_type` this value will be ignored.
    OffsetDateTime createdBefore = OffsetDateTime.parse("2013-12-12T10:53:43-08:00"); // The upper bound date and time to return events for. This can only be used when requesting the events with a `stream_type` of `admin_logs`. For any other `stream_type` this value will be ignored.
    try {
      Events result = client
              .events
              .events()
              .streamType(streamType)
              .streamPosition(streamPosition)
              .limit(limit)
              .eventType(eventType)
              .createdAfter(createdAfter)
              .createdBefore(createdBefore)
              .execute();
      System.out.println(result);
      System.out.println(result.getChunkSize());
      System.out.println(result.getNextStreamPosition());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#events");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Events> response = client
              .events
              .events()
              .streamType(streamType)
              .streamPosition(streamPosition)
              .limit(limit)
              .eventType(eventType)
              .createdAfter(createdAfter)
              .createdBefore(createdBefore)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#events");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **streamType** | **String**| Defines the type of events that are returned  * &#x60;all&#x60; returns everything for a user and is the default * &#x60;changes&#x60; returns events that may cause file tree changes   such as file updates or collaborations. * &#x60;sync&#x60; is similar to &#x60;changes&#x60; but only applies to synced folders * &#x60;admin_logs&#x60; returns all events for an entire enterprise and   requires the user making the API call to have admin permissions. This   stream type is for programmatically pulling from a 1 year history of   events across all users within the enterprise and within a   &#x60;created_after&#x60; and &#x60;created_before&#x60; time frame. The complete history   of events will be returned in chronological order based on the event   time, but latency will be much higher than &#x60;admin_logs_streaming&#x60;. * &#x60;admin_logs_streaming&#x60; returns all events for an entire enterprise and   requires the user making the API call to have admin permissions. This   stream type is for polling for recent events across all users within   the enterprise. Latency will be much lower than &#x60;admin_logs&#x60;, but   events will not be returned in chronological order and may   contain duplicates. | [optional] [default to all] [enum: all, changes, sync, admin_logs, admin_logs_streaming] |
| **streamPosition** | **String**| The location in the event stream to start receiving events from.  * &#x60;now&#x60; will return an empty list events and the latest stream position for initialization. * &#x60;0&#x60; or &#x60;null&#x60; will return all events. | [optional] |
| **limit** | **Long**| Limits the number of events returned  Note: Sometimes, the events less than the limit requested can be returned even when there may be more events remaining. This is primarily done in the case where a number of events have already been retrieved and these retrieved events are returned rather than delaying for an unknown amount of time to see if there are any more results. | [optional] [default to 100] |
| **eventType** | [**List&lt;String&gt;**](String.md)| A comma-separated list of events to filter by. This can only be used when requesting the events with a &#x60;stream_type&#x60; of &#x60;admin_logs&#x60; or &#x60;adming_logs_streaming&#x60;. For any other &#x60;stream_type&#x60; this value will be ignored. | [optional] [enum: ACCESS_GRANTED, ACCESS_REVOKED, ADD_DEVICE_ASSOCIATION, ADD_LOGIN_ACTIVITY_DEVICE, ADMIN_LOGIN, APPLICATION_CREATED, APPLICATION_PUBLIC_KEY_ADDED, APPLICATION_PUBLIC_KEY_DELETED, CHANGE_ADMIN_ROLE, CHANGE_FOLDER_PERMISSION, COLLABORATION_ACCEPT, COLLABORATION_EXPIRATION, COLLABORATION_INVITE, COLLABORATION_REMOVE, COLLABORATION_ROLE_CHANGE, COMMENT_CREATE, COMMENT_DELETE, CONTENT_WORKFLOW_ABNORMAL_DOWNLOAD_ACTIVITY, CONTENT_WORKFLOW_AUTOMATION_ADD, CONTENT_WORKFLOW_AUTOMATION_DELETE, CONTENT_WORKFLOW_POLICY_ADD, CONTENT_WORKFLOW_SHARING_POLICY_VIOLATION, CONTENT_WORKFLOW_UPLOAD_POLICY_VIOLATION, COPY, DATA_RETENTION_CREATE_RETENTION, DATA_RETENTION_REMOVE_RETENTION, DELETE, DELETE_USER, DEVICE_TRUST_CHECK_FAILED, DOWNLOAD, EDIT, EDIT_USER, EMAIL_ALIAS_CONFIRM, EMAIL_ALIAS_REMOVE, ENTERPRISE_APP_AUTHORIZATION_UPDATE, EXTERNAL_COLLAB_SECURITY_SETTINGS, FAILED_LOGIN, FILE_MARKED_MALICIOUS, FILE_WATERMARKED_DOWNLOAD, GROUP_ADD_ITEM, GROUP_ADD_USER, GROUP_CREATION, GROUP_DELETION, GROUP_EDITED, GROUP_REMOVE_ITEM, GROUP_REMOVE_USER, ITEM_MODIFY, ITEM_OPEN, ITEM_SHARED_UPDATE, ITEM_SYNC, ITEM_UNSYNC, LEGAL_HOLD_ASSIGNMENT_CREATE, LEGAL_HOLD_ASSIGNMENT_DELETE, LEGAL_HOLD_POLICY_CREATE, LEGAL_HOLD_POLICY_DELETE, LEGAL_HOLD_POLICY_UPDATE, LOCK, LOGIN, METADATA_INSTANCE_CREATE, METADATA_INSTANCE_DELETE, METADATA_INSTANCE_UPDATE, METADATA_TEMPLATE_CREATE, METADATA_TEMPLATE_DELETE, METADATA_TEMPLATE_UPDATE, MOVE, NEW_USER, OAUTH2_ACCESS_TOKEN_REVOKE, PREVIEW, REMOVE_DEVICE_ASSOCIATION, REMOVE_LOGIN_ACTIVITY_DEVICE, RENAME, RETENTION_POLICY_ASSIGNMENT_ADD, SHARE, SHARE_EXPIRATION, SHIELD_ALERT, SHIELD_EXTERNAL_COLLAB_ACCESS_BLOCKED, SHIELD_EXTERNAL_COLLAB_ACCESS_BLOCKED_MISSING_JUSTIFICATION, SHIELD_EXTERNAL_COLLAB_INVITE_BLOCKED, SHIELD_EXTERNAL_COLLAB_INVITE_BLOCKED_MISSING_JUSTIFICATION, SHIELD_JUSTIFICATION_APPROVAL, SHIELD_SHARED_LINK_ACCESS_BLOCKED, SHIELD_SHARED_LINK_STATUS_RESTRICTED_ON_CREATE, SHIELD_SHARED_LINK_STATUS_RESTRICTED_ON_UPDATE, SIGN_DOCUMENT_ASSIGNED, SIGN_DOCUMENT_CANCELLED, SIGN_DOCUMENT_COMPLETED, SIGN_DOCUMENT_CONVERTED, SIGN_DOCUMENT_CREATED, SIGN_DOCUMENT_DECLINED, SIGN_DOCUMENT_EXPIRED, SIGN_DOCUMENT_SIGNED, SIGN_DOCUMENT_VIEWED_BY_SIGNED, SIGNER_DOWNLOADED, SIGNER_FORWARDED, STORAGE_EXPIRATION, TASK_ASSIGNMENT_CREATE, TASK_ASSIGNMENT_DELETE, TASK_ASSIGNMENT_UPDATE, TASK_CREATE, TASK_UPDATE, TERMS_OF_SERVICE_ACCEPT, TERMS_OF_SERVICE_REJECT, UNDELETE, UNLOCK, UNSHARE, UPDATE_COLLABORATION_EXPIRATION, UPDATE_SHARE_EXPIRATION, UPLOAD, USER_AUTHENTICATE_OAUTH2_ACCESS_TOKEN_CREATE, WATERMARK_LABEL_CREATE, WATERMARK_LABEL_DELETE] |
| **createdAfter** | **OffsetDateTime**| The lower bound date and time to return events for. This can only be used when requesting the events with a &#x60;stream_type&#x60; of &#x60;admin_logs&#x60;. For any other &#x60;stream_type&#x60; this value will be ignored. | [optional] |
| **createdBefore** | **OffsetDateTime**| The upper bound date and time to return events for. This can only be used when requesting the events with a &#x60;stream_type&#x60; of &#x60;admin_logs&#x60;. For any other &#x60;stream_type&#x60; this value will be ignored. | [optional] |

### Return type

[**Events**](Events.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of event objects.  Events objects are returned in pages, with each page (chunk) including a list of event objects. The response includes a &#x60;chunk_size&#x60; parameter indicating how many events were returned in this chunk, as well as the next &#x60;stream_position&#x60; that can be queried. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="events_0"></a>
# **events_0**
> RealtimeServers events_0().execute();

Get events long poll endpoint

Returns a list of real-time servers that can be used for long-polling updates to the [event stream](https://raw.githubusercontent.com).  Long polling is the concept where a HTTP request is kept open until the server sends a response, then repeating the process over and over to receive updated responses.  Long polling the event stream can only be used for user events, not for enterprise events.  To use long polling, first use this endpoint to retrieve a list of long poll URLs. Next, make a long poll request to any of the provided URLs.  When an event occurs in monitored account a response with the value &#x60;new_change&#x60; will be sent. The response contains no other details as it only serves as a prompt to take further action such as sending a request to the [events endpoint](https://raw.githubusercontent.com) with the last known &#x60;stream_position&#x60;.  After the server sends this response it closes the connection. You must now repeat the long poll process to begin listening for events again.  If no events occur for a while and the connection times out you will receive a response with the value &#x60;reconnect&#x60;. When you receive this response you’ll make another call to this endpoint to restart the process.  If you receive no events in &#x60;retry_timeout&#x60; seconds then you will need to make another request to the real-time server (one of the URLs in the response for this endpoint). This might be necessary due to network errors.  Finally, if you receive a &#x60;max_retries&#x60; error when making a request to the real-time server, you should start over by making a call to this endpoint first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.box.com/2.0";
    
    // Configure OAuth2 access token for authorization: OAuth2Security
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Box client = new Box(configuration);
    try {
      RealtimeServers result = client
              .events
              .events_0()
              .execute();
      System.out.println(result);
      System.out.println(result.getChunkSize());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#events_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RealtimeServers> response = client
              .events
              .events_0()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#events_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RealtimeServers**](RealtimeServers.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a paginated array of servers that can be used instead of the regular endpoints for long-polling events. |  -  |
| **0** | An unexpected client error. |  -  |

