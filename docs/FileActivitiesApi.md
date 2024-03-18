# FileActivitiesApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listByFileId**](FileActivitiesApi.md#listByFileId) | **GET** /file_activities | List file activities |


<a name="listByFileId"></a>
# **listByFileId**
> Activities listByFileId(fileId).activityTypes(activityTypes).commentFields(commentFields).versionsFields(versionsFields).annotationFields(annotationFields).taskFields(taskFields).appActivityFields(appActivityFields).replyLimit(replyLimit).status(status).enableReplies(enableReplies).limit(limit).marker(marker).execute();

List file activities

List file activities by file ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileActivitiesApi;
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
    String fileId = "888578620991"; // File ID for which to retrieve activity
    List<String> activityTypes = Arrays.asList(); // Comma-separated list of activity types to return. This field is ignored if marker is passed in. Defaults to all activity types.
    List<String> commentFields = Arrays.asList(); // fields that are required for comments
    List<String> versionsFields = Arrays.asList(); // fields that are required for versions
    List<String> annotationFields = Arrays.asList(); // fields that are required for annotations
    List<String> taskFields = Arrays.asList(); // fields that are required for tasks
    List<String> appActivityFields = Arrays.asList(); // fields that are required for `app_activity`
    String replyLimit = "1"; // maximum number of replies the response should contain per each top level activity[annotation, comment]
    String status = "open"; // Used to filter an annotation or a comment based on the status
    Boolean enableReplies = true; // Whether or not replies should be returned
    Long limit = 1000L; // The maximum number of items to return per page.
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    try {
      Activities result = client
              .fileActivities
              .listByFileId(fileId)
              .activityTypes(activityTypes)
              .commentFields(commentFields)
              .versionsFields(versionsFields)
              .annotationFields(annotationFields)
              .taskFields(taskFields)
              .appActivityFields(appActivityFields)
              .replyLimit(replyLimit)
              .status(status)
              .enableReplies(enableReplies)
              .limit(limit)
              .marker(marker)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileActivitiesApi#listByFileId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Activities> response = client
              .fileActivities
              .listByFileId(fileId)
              .activityTypes(activityTypes)
              .commentFields(commentFields)
              .versionsFields(versionsFields)
              .annotationFields(annotationFields)
              .taskFields(taskFields)
              .appActivityFields(appActivityFields)
              .replyLimit(replyLimit)
              .status(status)
              .enableReplies(enableReplies)
              .limit(limit)
              .marker(marker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileActivitiesApi#listByFileId");
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
| **fileId** | **String**| File ID for which to retrieve activity | |
| **activityTypes** | [**List&lt;String&gt;**](String.md)| Comma-separated list of activity types to return. This field is ignored if marker is passed in. Defaults to all activity types. | [optional] [enum: annotation, app_activity, comment, task, versions] |
| **commentFields** | [**List&lt;String&gt;**](String.md)| fields that are required for comments | [optional] |
| **versionsFields** | [**List&lt;String&gt;**](String.md)| fields that are required for versions | [optional] |
| **annotationFields** | [**List&lt;String&gt;**](String.md)| fields that are required for annotations | [optional] |
| **taskFields** | [**List&lt;String&gt;**](String.md)| fields that are required for tasks | [optional] |
| **appActivityFields** | [**List&lt;String&gt;**](String.md)| fields that are required for &#x60;app_activity&#x60; | [optional] |
| **replyLimit** | **String**| maximum number of replies the response should contain per each top level activity[annotation, comment] | [optional] |
| **status** | **String**| Used to filter an annotation or a comment based on the status | [optional] [enum: open, resolved, deleted] |
| **enableReplies** | **Boolean**| Whether or not replies should be returned | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |

### Return type

[**Activities**](Activities.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Results of activity items for the requested file ID |  -  |
| **0** | An unexpected error. |  -  |

