# WorkflowsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**startBasedOnRequest**](WorkflowsApi.md#startBasedOnRequest) | **POST** /workflows/{workflow_id}/start | Starts workflow based on request body |
| [**workflows**](WorkflowsApi.md#workflows) | **GET** /workflows | List workflows |


<a name="startBasedOnRequest"></a>
# **startBasedOnRequest**
> startBasedOnRequest(workflowId).workflowsStartBasedOnRequestRequest(workflowsStartBasedOnRequestRequest).execute();

Starts workflow based on request body

Initiates a flow with a trigger type of &#x60;WORKFLOW_MANUAL_START&#x60;.  You application must be authorized to use the &#x60;Manage Box Relay&#x60; application scope within the developer console.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowsApi;
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
    WorkflowsStartBasedOnRequestRequestFlow flow = new WorkflowsStartBasedOnRequestRequestFlow();
    List<WorkflowsStartBasedOnRequestRequestFilesInner> files = Arrays.asList(); // The array of files for which the workflow should start. All files must be in the workflow's configured folder.
    WorkflowsStartBasedOnRequestRequestFolder folder = new WorkflowsStartBasedOnRequestRequestFolder();
    String workflowId = "12345"; // The ID of the workflow.
    String type = "workflow_parameters"; // The type of the parameters object
    List<Outcome> outcomes = Arrays.asList(); // A configurable outcome the workflow should complete.
    try {
      client
              .workflows
              .startBasedOnRequest(flow, files, folder, workflowId)
              .type(type)
              .outcomes(outcomes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#startBasedOnRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .workflows
              .startBasedOnRequest(flow, files, folder, workflowId)
              .type(type)
              .outcomes(outcomes)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#startBasedOnRequest");
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
| **workflowId** | **String**| The ID of the workflow. | |
| **workflowsStartBasedOnRequestRequest** | [**WorkflowsStartBasedOnRequestRequest**](WorkflowsStartBasedOnRequestRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Starts the workflow. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="workflows"></a>
# **workflows**
> Workflows workflows(folderId).triggerType(triggerType).limit(limit).marker(marker).execute();

List workflows

Returns list of workflows that act on a given &#x60;folder ID&#x60;, and have a flow with a trigger type of &#x60;WORKFLOW_MANUAL_START&#x60;.  You application must be authorized to use the &#x60;Manage Box Relay&#x60; application scope within the developer console in to use this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowsApi;
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
    String folderId = "12345"; // The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/folder/123` the `folder_id` is `123`.  The root folder of a Box account is always represented by the ID `0`.
    String triggerType = "WORKFLOW_MANUAL_START"; // Type of trigger to search for.
    Long limit = 1000L; // The maximum number of items to return per page.
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    try {
      Workflows result = client
              .workflows
              .workflows(folderId)
              .triggerType(triggerType)
              .limit(limit)
              .marker(marker)
              .execute();
      System.out.println(result);
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
      System.out.println(result.getPrevMarker());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#workflows");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Workflows> response = client
              .workflows
              .workflows(folderId)
              .triggerType(triggerType)
              .limit(limit)
              .marker(marker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#workflows");
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
| **folderId** | **String**| The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folder/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;.  The root folder of a Box account is always represented by the ID &#x60;0&#x60;. | |
| **triggerType** | **String**| Type of trigger to search for. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |

### Return type

[**Workflows**](Workflows.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the workflow. |  -  |
| **0** | An unexpected client error. |  -  |

