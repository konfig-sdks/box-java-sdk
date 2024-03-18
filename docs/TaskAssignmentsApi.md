# TaskAssignmentsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignMultipleUsers**](TaskAssignmentsApi.md#assignMultipleUsers) | **POST** /task_assignments | Assign task |
| [**deleteSpecificAssignment**](TaskAssignmentsApi.md#deleteSpecificAssignment) | **DELETE** /task_assignments/{task_assignment_id} | Unassign task |
| [**getTaskAssignmentInfo**](TaskAssignmentsApi.md#getTaskAssignmentInfo) | **GET** /task_assignments/{task_assignment_id} | Get task assignment |
| [**listForTask**](TaskAssignmentsApi.md#listForTask) | **GET** /tasks/{task_id}/assignments | List task assignments |
| [**updateStateAssignedToUser**](TaskAssignmentsApi.md#updateStateAssignedToUser) | **PUT** /task_assignments/{task_assignment_id} | Update task assignment |


<a name="assignMultipleUsers"></a>
# **assignMultipleUsers**
> TaskAssignment assignMultipleUsers().taskAssignmentsAssignMultipleUsersRequest(taskAssignmentsAssignMultipleUsersRequest).execute();

Assign task

Assigns a task to a user.  A task can be assigned to more than one user by creating multiple assignments.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskAssignmentsApi;
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
    TaskAssignmentsAssignMultipleUsersRequestTask task = new TaskAssignmentsAssignMultipleUsersRequestTask();
    TaskAssignmentsAssignMultipleUsersRequestAssignTo assignTo = new TaskAssignmentsAssignMultipleUsersRequestAssignTo();
    try {
      TaskAssignment result = client
              .taskAssignments
              .assignMultipleUsers(task, assignTo)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getItem());
      System.out.println(result.getAssignedTo());
      System.out.println(result.getMessage());
      System.out.println(result.getCompletedAt());
      System.out.println(result.getAssignedAt());
      System.out.println(result.getRemindedAt());
      System.out.println(result.getResolutionState());
      System.out.println(result.getAssignedBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskAssignmentsApi#assignMultipleUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskAssignment> response = client
              .taskAssignments
              .assignMultipleUsers(task, assignTo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskAssignmentsApi#assignMultipleUsers");
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
| **taskAssignmentsAssignMultipleUsersRequest** | [**TaskAssignmentsAssignMultipleUsersRequest**](TaskAssignmentsAssignMultipleUsersRequest.md)|  | [optional] |

### Return type

[**TaskAssignment**](TaskAssignment.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns a new task assignment object. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="deleteSpecificAssignment"></a>
# **deleteSpecificAssignment**
> deleteSpecificAssignment(taskAssignmentId).execute();

Unassign task

Deletes a specific task assignment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskAssignmentsApi;
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
    String taskAssignmentId = "12345"; // The ID of the task assignment.
    try {
      client
              .taskAssignments
              .deleteSpecificAssignment(taskAssignmentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskAssignmentsApi#deleteSpecificAssignment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .taskAssignments
              .deleteSpecificAssignment(taskAssignmentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskAssignmentsApi#deleteSpecificAssignment");
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
| **taskAssignmentId** | **String**| The ID of the task assignment. | |

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
| **204** | Returns an empty response when the task assignment was successfully deleted. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="getTaskAssignmentInfo"></a>
# **getTaskAssignmentInfo**
> TaskAssignment getTaskAssignmentInfo(taskAssignmentId).execute();

Get task assignment

Retrieves information about a task assignment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskAssignmentsApi;
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
    String taskAssignmentId = "12345"; // The ID of the task assignment.
    try {
      TaskAssignment result = client
              .taskAssignments
              .getTaskAssignmentInfo(taskAssignmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getItem());
      System.out.println(result.getAssignedTo());
      System.out.println(result.getMessage());
      System.out.println(result.getCompletedAt());
      System.out.println(result.getAssignedAt());
      System.out.println(result.getRemindedAt());
      System.out.println(result.getResolutionState());
      System.out.println(result.getAssignedBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskAssignmentsApi#getTaskAssignmentInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskAssignment> response = client
              .taskAssignments
              .getTaskAssignmentInfo(taskAssignmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskAssignmentsApi#getTaskAssignmentInfo");
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
| **taskAssignmentId** | **String**| The ID of the task assignment. | |

### Return type

[**TaskAssignment**](TaskAssignment.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a task assignment, specifying who the task has been assigned to and by whom. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="listForTask"></a>
# **listForTask**
> TaskAssignments listForTask(taskId).execute();

List task assignments

Lists all of the assignments for a given task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskAssignmentsApi;
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
      TaskAssignments result = client
              .taskAssignments
              .listForTask(taskId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCount());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskAssignmentsApi#listForTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskAssignments> response = client
              .taskAssignments
              .listForTask(taskId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskAssignmentsApi#listForTask");
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

[**TaskAssignments**](TaskAssignments.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of task assignment defining what task on a file has been assigned to which users and by who. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="updateStateAssignedToUser"></a>
# **updateStateAssignedToUser**
> TaskAssignment updateStateAssignedToUser(taskAssignmentId).taskAssignmentsUpdateStateAssignedToUserRequest(taskAssignmentsUpdateStateAssignedToUserRequest).execute();

Update task assignment

Updates a task assignment. This endpoint can be used to update the state of a task assigned to a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskAssignmentsApi;
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
    String taskAssignmentId = "12345"; // The ID of the task assignment.
    String message = "message_example"; // An optional message by the assignee that can be added to the task.
    String resolutionState = "completed"; // The state of the task assigned to the user.  * For a task with an `action` value of `complete` this can be `incomplete` or `completed`. * For a task with an `action` of `review` this can be `incomplete`, `approved`, or `rejected`.
    try {
      TaskAssignment result = client
              .taskAssignments
              .updateStateAssignedToUser(taskAssignmentId)
              .message(message)
              .resolutionState(resolutionState)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getItem());
      System.out.println(result.getAssignedTo());
      System.out.println(result.getMessage());
      System.out.println(result.getCompletedAt());
      System.out.println(result.getAssignedAt());
      System.out.println(result.getRemindedAt());
      System.out.println(result.getResolutionState());
      System.out.println(result.getAssignedBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskAssignmentsApi#updateStateAssignedToUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskAssignment> response = client
              .taskAssignments
              .updateStateAssignedToUser(taskAssignmentId)
              .message(message)
              .resolutionState(resolutionState)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskAssignmentsApi#updateStateAssignedToUser");
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
| **taskAssignmentId** | **String**| The ID of the task assignment. | |
| **taskAssignmentsUpdateStateAssignedToUserRequest** | [**TaskAssignmentsUpdateStateAssignedToUserRequest**](TaskAssignmentsUpdateStateAssignedToUserRequest.md)|  | [optional] |

### Return type

[**TaskAssignment**](TaskAssignment.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated task assignment object. |  -  |
| **0** | An unexpected client error. |  -  |

