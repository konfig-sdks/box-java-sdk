# TasksApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInfo**](TasksApi.md#getInfo) | **GET** /tasks/{task_id} | Get task |
| [**listOnFile**](TasksApi.md#listOnFile) | **GET** /files/{file_id}/tasks | List tasks on file |
| [**removeFile**](TasksApi.md#removeFile) | **DELETE** /tasks/{task_id} | Remove task |
| [**tasks**](TasksApi.md#tasks) | **POST** /tasks | Create task |
| [**updateTaskConfiguration**](TasksApi.md#updateTaskConfiguration) | **PUT** /tasks/{task_id} | Update task |


<a name="getInfo"></a>
# **getInfo**
> Task getInfo(taskId).execute();

Get task

Retrieves information about a specific task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    String taskId = "12345"; // The ID of the task.
    try {
      Task result = client
              .tasks
              .getInfo(taskId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getItem());
      System.out.println(result.getDueAt());
      System.out.println(result.getAction());
      System.out.println(result.getMessage());
      System.out.println(result.getTaskAssignmentCollection());
      System.out.println(result.getIsCompleted());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCompletionRule());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Task> response = client
              .tasks
              .getInfo(taskId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getInfo");
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
| **taskId** | **String**| The ID of the task. | |

### Return type

[**Task**](Task.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a task object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listOnFile"></a>
# **listOnFile**
> Tasks listOnFile(fileId).execute();

List tasks on file

Retrieves a list of all the tasks for a file. This endpoint does not support pagination.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    String fileId = "12345"; // The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/files/123` the `file_id` is `123`.
    try {
      Tasks result = client
              .tasks
              .listOnFile(fileId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCount());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#listOnFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Tasks> response = client
              .tasks
              .listOnFile(fileId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#listOnFile");
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
| **fileId** | **String**| The unique identifier that represents a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/files/123&#x60; the &#x60;file_id&#x60; is &#x60;123&#x60;. | |

### Return type

[**Tasks**](Tasks.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of tasks on a file.  If there are no tasks on this file an empty collection is returned instead. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="removeFile"></a>
# **removeFile**
> removeFile(taskId).execute();

Remove task

Removes a task from a file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    String taskId = "12345"; // The ID of the task.
    try {
      client
              .tasks
              .removeFile(taskId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#removeFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tasks
              .removeFile(taskId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#removeFile");
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
| **taskId** | **String**| The ID of the task. | |

### Return type

null (empty response body)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns an empty response when the task was successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="tasks"></a>
# **tasks**
> Task tasks().postTasksRequest(postTasksRequest).execute();

Create task

Creates a single task on a file. This task is not assigned to any user and will need to be assigned separately.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    PostTasksRequestItem item = new PostTasksRequestItem();
    String action = "review"; // The action the task assignee will be prompted to do. Must be  * `review` defines an approval task that can be approved or rejected * `complete` defines a general task which can be completed
    String message = ""; // An optional message to include with the task.
    OffsetDateTime dueAt = OffsetDateTime.now(); // Defines when the task is due. Defaults to `null` if not provided.
    String completionRule = "all_assignees"; // Defines which assignees need to complete this task before the task is considered completed.  * `all_assignees` (default) requires all assignees to review or approve the the task in order for it to be considered completed. * `any_assignee` accepts any one assignee to review or approve the the task in order for it to be considered completed.
    try {
      Task result = client
              .tasks
              .tasks(item)
              .action(action)
              .message(message)
              .dueAt(dueAt)
              .completionRule(completionRule)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getItem());
      System.out.println(result.getDueAt());
      System.out.println(result.getAction());
      System.out.println(result.getMessage());
      System.out.println(result.getTaskAssignmentCollection());
      System.out.println(result.getIsCompleted());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCompletionRule());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#tasks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Task> response = client
              .tasks
              .tasks(item)
              .action(action)
              .message(message)
              .dueAt(dueAt)
              .completionRule(completionRule)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#tasks");
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
| **postTasksRequest** | [**PostTasksRequest**](PostTasksRequest.md)|  | [optional] |

### Return type

[**Task**](Task.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns the newly created task. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateTaskConfiguration"></a>
# **updateTaskConfiguration**
> Task updateTaskConfiguration(taskId).tasksUpdateTaskConfigurationRequest(tasksUpdateTaskConfigurationRequest).execute();

Update task

Updates a task. This can be used to update a task&#39;s configuration, or to update its completion state.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    String taskId = "12345"; // The ID of the task.
    String action = "review"; // The action the task assignee will be prompted to do. Must be  * `review` defines an approval task that can be approved or rejected * `complete` defines a general task which can be completed
    String message = "message_example"; // The message included with the task.
    OffsetDateTime dueAt = OffsetDateTime.now(); // When the task is due at.
    String completionRule = "all_assignees"; // Defines which assignees need to complete this task before the task is considered completed.  * `all_assignees` (default) requires all assignees to review or approve the the task in order for it to be considered completed. * `any_assignee` accepts any one assignee to review or approve the the task in order for it to be considered completed.
    try {
      Task result = client
              .tasks
              .updateTaskConfiguration(taskId)
              .action(action)
              .message(message)
              .dueAt(dueAt)
              .completionRule(completionRule)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getItem());
      System.out.println(result.getDueAt());
      System.out.println(result.getAction());
      System.out.println(result.getMessage());
      System.out.println(result.getTaskAssignmentCollection());
      System.out.println(result.getIsCompleted());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCompletionRule());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#updateTaskConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Task> response = client
              .tasks
              .updateTaskConfiguration(taskId)
              .action(action)
              .message(message)
              .dueAt(dueAt)
              .completionRule(completionRule)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#updateTaskConfiguration");
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
| **taskId** | **String**| The ID of the task. | |
| **tasksUpdateTaskConfigurationRequest** | [**TasksUpdateTaskConfigurationRequest**](TasksUpdateTaskConfigurationRequest.md)|  | [optional] |

### Return type

[**Task**](Task.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated task object |  -  |
| **0** | An unexpected client error. |  -  |

