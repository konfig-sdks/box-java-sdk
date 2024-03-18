# TrashedItemsApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listRetrievedItems**](TrashedItemsApi.md#listRetrievedItems) | **GET** /folders/trash/items | List trashed items |


<a name="listRetrievedItems"></a>
# **listRetrievedItems**
> Items listRetrievedItems().fields(fields).limit(limit).offset(offset).usemarker(usemarker).marker(marker).direction(direction).sort(sort).execute();

List trashed items

Retrieves the files and folders that have been moved to the trash.  Any attribute in the full files or folders objects can be passed in with the &#x60;fields&#x60; parameter to retrieve those specific attributes that are not returned by default.  This endpoint defaults to use offset-based pagination, yet also supports marker-based pagination using the &#x60;marker&#x60; parameter.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrashedItemsApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    Long limit = 1000L; // The maximum number of items to return per page.
    Long offset = 0L; // The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response.
    Boolean usemarker = true; // Specifies whether to use marker-based pagination instead of offset-based pagination. Only one pagination method can be used at a time.  By setting this value to true, the API will return a `marker` field that can be passed as a parameter to this endpoint to get the next page of the response.
    String marker = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii"; // Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.
    String direction = "ASC"; // The direction to sort results in. This can be either in alphabetical ascending (`ASC`) or descending (`DESC`) order.
    String sort = "name"; // Defines the **second** attribute by which items are sorted.  Items are always sorted by their `type` first, with folders listed before files, and files listed before web links.  This parameter is not supported when using marker-based pagination.
    try {
      Items result = client
              .trashedItems
              .listRetrievedItems()
              .fields(fields)
              .limit(limit)
              .offset(offset)
              .usemarker(usemarker)
              .marker(marker)
              .direction(direction)
              .sort(sort)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCount());
      System.out.println(result.getLimit());
      System.out.println(result.getOffset());
      System.out.println(result.getOrder());
      System.out.println(result.getEntries());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrashedItemsApi#listRetrievedItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Items> response = client
              .trashedItems
              .listRetrievedItems()
              .fields(fields)
              .limit(limit)
              .offset(offset)
              .usemarker(usemarker)
              .marker(marker)
              .direction(direction)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrashedItemsApi#listRetrievedItems");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **limit** | **Long**| The maximum number of items to return per page. | [optional] |
| **offset** | **Long**| The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response. | [optional] [default to 0] |
| **usemarker** | **Boolean**| Specifies whether to use marker-based pagination instead of offset-based pagination. Only one pagination method can be used at a time.  By setting this value to true, the API will return a &#x60;marker&#x60; field that can be passed as a parameter to this endpoint to get the next page of the response. | [optional] |
| **marker** | **String**| Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. | [optional] |
| **direction** | **String**| The direction to sort results in. This can be either in alphabetical ascending (&#x60;ASC&#x60;) or descending (&#x60;DESC&#x60;) order. | [optional] [enum: ASC, DESC] |
| **sort** | **String**| Defines the **second** attribute by which items are sorted.  Items are always sorted by their &#x60;type&#x60; first, with folders listed before files, and files listed before web links.  This parameter is not supported when using marker-based pagination. | [optional] [enum: name, date, size] |

### Return type

[**Items**](Items.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of items that have been deleted |  -  |
| **0** | An unexpected client error. |  -  |

