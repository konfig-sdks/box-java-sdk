# SearchApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**itemsByMetadata**](SearchApi.md#itemsByMetadata) | **POST** /metadata_queries/execute_read | Query files/folders by metadata |
| [**search**](SearchApi.md#search) | **GET** /search | Search for content |


<a name="itemsByMetadata"></a>
# **itemsByMetadata**
> MetadataQueryResults itemsByMetadata().metadataQuery(metadataQuery).execute();

Query files/folders by metadata

Create a search using SQL-like syntax to return items that match specific metadata.  By default, this endpoint returns only the most basic info about the items for which the query matches. To get additional fields for each item, including any of the metadata, use the &#x60;fields&#x60; attribute in the query.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SearchApi;
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
    String from = "from_example"; // Specifies the template used in the query. Must be in the form `scope.templateKey`. Not all templates can be used in this field, most notably the built-in, Box-provided classification templates can not be used in a query.
    String ancestorFolderId = "ancestorFolderId_example"; // The ID of the folder that you are restricting the query to. A value of zero will return results from all folders you have access to. A non-zero value will only return results found in the folder corresponding to the ID or in any of its subfolders.
    String query = "query_example"; // The query to perform. A query is a logical expression that is very similar to a SQL `SELECT` statement. Values in the search query can be turned into parameters specified in the `query_param` arguments list to prevent having to manually insert search values into the query string.  For example, a value of `:amount` would represent the `amount` value in `query_params` object.
    Map<String, String> queryParams = new HashMap(); // Set of arguments corresponding to the parameters specified in the `query`. The type of each parameter used in the `query_params` must match the type of the corresponding metadata template field.
    List<MetadataQueryOrderByInner> orderBy = Arrays.asList(); // A list of template fields and directions to sort the metadata query results by.  The ordering `direction` must be the same for each item in the array.
    Integer limit = 100; // A value between 0 and 100 that indicates the maximum number of results to return for a single request. This only specifies a maximum boundary and will not guarantee the minimum number of results returned.
    String marker = "marker_example"; // Marker to use for requesting the next page.
    List<String> fields = Arrays.asList(); // By default, this endpoint returns only the most basic info about the items for which the query matches. This attribute can be used to specify a list of additional attributes to return for any item, including its metadata.  This attribute takes a list of item fields, metadata template identifiers, or metadata template field identifiers.  For example:  * `created_by` will add the details of the user who created the item to the response. * `metadata.<scope>.<templateKey>` will return the mini-representation of the metadata instance identified by the `scope` and `templateKey`. * `metadata.<scope>.<templateKey>.<field>` will return all the mini-representation of the metadata instance identified by the `scope` and `templateKey` plus the field specified by the `field` name. Multiple fields for the same `scope` and `templateKey` can be defined.
    try {
      MetadataQueryResults result = client
              .search
              .itemsByMetadata(from, ancestorFolderId)
              .query(query)
              .queryParams(queryParams)
              .orderBy(orderBy)
              .limit(limit)
              .marker(marker)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntries());
      System.out.println(result.getLimit());
      System.out.println(result.getNextMarker());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#itemsByMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetadataQueryResults> response = client
              .search
              .itemsByMetadata(from, ancestorFolderId)
              .query(query)
              .queryParams(queryParams)
              .orderBy(orderBy)
              .limit(limit)
              .marker(marker)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#itemsByMetadata");
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
| **metadataQuery** | [**MetadataQuery**](MetadataQuery.md)|  | [optional] |

### Return type

[**MetadataQueryResults**](MetadataQueryResults.md)

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of files and folders that match this metadata query. |  -  |
| **0** | An unexpected client error. |  -  |

<a name="search"></a>
# **search**
> Object search().query(query).scope(scope).fileExtensions(fileExtensions).createdAtRange(createdAtRange).updatedAtRange(updatedAtRange).sizeRange(sizeRange).ownerUserIds(ownerUserIds).recentUpdaterUserIds(recentUpdaterUserIds).ancestorFolderIds(ancestorFolderIds).contentTypes(contentTypes).type(type).trashContent(trashContent).mdfilters(mdfilters).sort(sort).direction(direction).limit(limit).includeRecentSharedLinks(includeRecentSharedLinks).fields(fields).offset(offset).deletedUserIds(deletedUserIds).deletedAtRange(deletedAtRange).execute();

Search for content

Searches for files, folders, web links, and shared files across the users content or across the entire enterprise.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SearchApi;
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
    String query = "sales"; // The string to search for. This query is matched against item names, descriptions, text content of files, and various other fields of the different item types.  This parameter supports a variety of operators to further refine the results returns.  * `\"\"` - by wrapping a query in double quotes only exact matches are   returned by the API. Exact searches do not return search matches   based on specific character sequences. Instead, they return   matches based on phrases, that is, word sequences. For example:   A search for `\"Blue-Box\"` may return search results including   the sequence `\"blue.box\"`, `\"Blue Box\"`, and `\"Blue-Box\"`;   any item containing the words `Blue` and `Box` consecutively, in   the order specified. * `AND` - returns items that contain both the search terms. For   example, a search for `marketing AND BoxWorks` returns items   that have both `marketing` and `BoxWorks` within its text in any order.   It does not return a result that only has `BoxWorks` in its text. * `OR` - returns items that contain either of the search terms. For   example, a search for `marketing OR BoxWorks` returns a result that   has either `marketing` or `BoxWorks` within its text. Using this   operator is not necessary as we implicitly interpret multi-word   queries as `OR` unless another supported boolean term is used. * `NOT` - returns items that do not contain the search term provided.   For example, a search for `marketing AND NOT BoxWorks` returns a result   that has only `marketing` within its text. Results containing   `BoxWorks` are omitted.  We do not support lower case (that is, `and`, `or`, and `not`) or mixed case (that is, `And`, `Or`, and `Not`) operators.  This field is required unless the `mdfilters` parameter is defined.
    String scope = "user_content"; // Limits the search results to either the files that the user has access to, or to files available to the entire enterprise.  The scope defaults to `user_content`, which limits the search results to content that is available to the currently authenticated user.  The `enterprise_content` can be requested by an admin through our support channels. Once this scope has been enabled for a user, it will allow that use to query for content across the entire enterprise and not only the content that they have access to.
    List<String> fileExtensions = Arrays.asList(); // Limits the search results to any files that match any of the provided file extensions. This list is a comma-separated list of file extensions without the dots.
    List<String> createdAtRange = Arrays.asList(); // Limits the search results to any items created within a given date range.  Date ranges are defined as comma separated RFC3339 timestamps.  If the the start date is omitted (`,2014-05-17T13:35:01-07:00`) anything created before the end date will be returned.  If the end date is omitted (`2014-05-15T13:35:01-07:00,`) the current date will be used as the end date instead.
    List<String> updatedAtRange = Arrays.asList(); // Limits the search results to any items updated within a given date range.  Date ranges are defined as comma separated RFC3339 timestamps.  If the start date is omitted (`,2014-05-17T13:35:01-07:00`) anything updated before the end date will be returned.  If the end date is omitted (`2014-05-15T13:35:01-07:00,`) the current date will be used as the end date instead.
    List<Integer> sizeRange = Arrays.asList(); // Limits the search results to any items with a size within a given file size range. This applied to files and folders.  Size ranges are defined as comma separated list of a lower and upper byte size limit (inclusive).  The upper and lower bound can be omitted to create open ranges.
    List<String> ownerUserIds = Arrays.asList(); // Limits the search results to any items that are owned by the given list of owners, defined as a list of comma separated user IDs.  The items still need to be owned or shared with the currently authenticated user for them to show up in the search results. If the user does not have access to any files owned by any of the users an empty result set will be returned.  To search across an entire enterprise, we recommend using the `enterprise_content` scope parameter which can be requested with our support team.
    List<String> recentUpdaterUserIds = Arrays.asList(); // Limits the search results to any items that have been updated by the given list of users, defined as a list of comma separated user IDs.  The items still need to be owned or shared with the currently authenticated user for them to show up in the search results. If the user does not have access to any files owned by any of the users an empty result set will be returned.  This feature only searches back to the last 10 versions of an item.
    List<String> ancestorFolderIds = Arrays.asList(); // Limits the search results to items within the given list of folders, defined as a comma separated lists of folder IDs.  Search results will also include items within any subfolders of those ancestor folders.  The folders still need to be owned or shared with the currently authenticated user. If the folder is not accessible by this user, or it does not exist, a `HTTP 404` error code will be returned instead.  To search across an entire enterprise, we recommend using the `enterprise_content` scope parameter which can be requested with our support team.
    List<String> contentTypes = Arrays.asList(); // Limits the search results to any items that match the search query for a specific part of the file, for example the file description.  Content types are defined as a comma separated lists of Box recognized content types. The allowed content types are as follows.  * `name` - The name of the item, as defined by its `name` field. * `description` - The description of the item, as defined by its   `description` field. * `file_content` - The actual content of the file. * `comments` - The content of any of the comments on a file or    folder. * `tags` - Any tags that are applied to an item, as defined by its    `tags` field.
    String type = "file"; // Limits the search results to any items of this type. This parameter only takes one value. By default the API returns items that match any of these types.  * `file` - Limits the search results to files * `folder` - Limits the search results to folders * `web_link` - Limits the search results to web links, also known    as bookmarks
    String trashContent = "non_trashed_only"; // Determines if the search should look in the trash for items.  By default, this API only returns search results for items not currently in the trash (`non_trashed_only`).  * `trashed_only` - Only searches for items currently in the trash * `non_trashed_only` - Only searches for items currently not in   the trash * `all_items` - Searches for both trashed and non-trashed items.
    List<MetadataFilter> mdfilters = Arrays.asList(); // Limits the search results to any items for which the metadata matches the provided filter.  This parameter contains a list of 1 metadata template to filter the search results by. This list can currently only contain one entry, though this might be expanded in the future.  This parameter is required unless the `query` parameter is provided.
    String sort = "modified_at"; // Defines the order in which search results are returned. This API defaults to returning items by relevance unless this parameter is explicitly specified.  * `relevance` (default) returns the results sorted by relevance to the query search term. The relevance is based on the occurrence of the search term in the items name, description, content, and additional properties. * `modified_at` returns the results ordered in descending order by date at which the item was last modified.
    String direction = "DESC"; // Defines the direction in which search results are ordered. This API defaults to returning items in descending (`DESC`) order unless this parameter is explicitly specified.  When results are sorted by `relevance` the ordering is locked to returning items in descending order of relevance, and this parameter is ignored.
    Long limit = 30L; // Defines the maximum number of items to return as part of a page of results.
    Boolean includeRecentSharedLinks = false; // Defines whether the search results should include any items that the user recently accessed through a shared link.  When this parameter has been set to true, the format of the response of this API changes to return a list of [Search Results with Shared Links](r://search_results_with_shared_links)
    List<String> fields = Arrays.asList(); // A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.
    Long offset = 0L; // The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response.
    List<String> deletedUserIds = Arrays.asList(); // Limits the search results to items that were deleted by the given list of users, defined as a list of comma separated user IDs.  The `trash_content` parameter needs to be set to `trashed_only`.  If searching in trash is not performed, an empty result set is returned. The items need to be owned or shared with the currently authenticated user for them to show up in the search results.  If the user does not have access to any files owned by any of the users, an empty result set is returned.  Data available from 2023-02-01 onwards.
    List<String> deletedAtRange = Arrays.asList(); // Limits the search results to any items deleted within a given date range.  Date ranges are defined as comma separated RFC3339 timestamps.  If the the start date is omitted (`2014-05-17T13:35:01-07:00`), anything deleted before the end date will be returned.  If the end date is omitted (`2014-05-15T13:35:01-07:00`), the current date will be used as the end date instead.  The `trash_content` parameter needs to be set to `trashed_only`.  If searching in trash is not performed, then an empty result is returned.  Data available from 2023-02-01 onwards.
    try {
      Object result = client
              .search
              .search()
              .query(query)
              .scope(scope)
              .fileExtensions(fileExtensions)
              .createdAtRange(createdAtRange)
              .updatedAtRange(updatedAtRange)
              .sizeRange(sizeRange)
              .ownerUserIds(ownerUserIds)
              .recentUpdaterUserIds(recentUpdaterUserIds)
              .ancestorFolderIds(ancestorFolderIds)
              .contentTypes(contentTypes)
              .type(type)
              .trashContent(trashContent)
              .mdfilters(mdfilters)
              .sort(sort)
              .direction(direction)
              .limit(limit)
              .includeRecentSharedLinks(includeRecentSharedLinks)
              .fields(fields)
              .offset(offset)
              .deletedUserIds(deletedUserIds)
              .deletedAtRange(deletedAtRange)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#search");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .search
              .search()
              .query(query)
              .scope(scope)
              .fileExtensions(fileExtensions)
              .createdAtRange(createdAtRange)
              .updatedAtRange(updatedAtRange)
              .sizeRange(sizeRange)
              .ownerUserIds(ownerUserIds)
              .recentUpdaterUserIds(recentUpdaterUserIds)
              .ancestorFolderIds(ancestorFolderIds)
              .contentTypes(contentTypes)
              .type(type)
              .trashContent(trashContent)
              .mdfilters(mdfilters)
              .sort(sort)
              .direction(direction)
              .limit(limit)
              .includeRecentSharedLinks(includeRecentSharedLinks)
              .fields(fields)
              .offset(offset)
              .deletedUserIds(deletedUserIds)
              .deletedAtRange(deletedAtRange)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#search");
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
| **query** | **String**| The string to search for. This query is matched against item names, descriptions, text content of files, and various other fields of the different item types.  This parameter supports a variety of operators to further refine the results returns.  * &#x60;\&quot;\&quot;&#x60; - by wrapping a query in double quotes only exact matches are   returned by the API. Exact searches do not return search matches   based on specific character sequences. Instead, they return   matches based on phrases, that is, word sequences. For example:   A search for &#x60;\&quot;Blue-Box\&quot;&#x60; may return search results including   the sequence &#x60;\&quot;blue.box\&quot;&#x60;, &#x60;\&quot;Blue Box\&quot;&#x60;, and &#x60;\&quot;Blue-Box\&quot;&#x60;;   any item containing the words &#x60;Blue&#x60; and &#x60;Box&#x60; consecutively, in   the order specified. * &#x60;AND&#x60; - returns items that contain both the search terms. For   example, a search for &#x60;marketing AND BoxWorks&#x60; returns items   that have both &#x60;marketing&#x60; and &#x60;BoxWorks&#x60; within its text in any order.   It does not return a result that only has &#x60;BoxWorks&#x60; in its text. * &#x60;OR&#x60; - returns items that contain either of the search terms. For   example, a search for &#x60;marketing OR BoxWorks&#x60; returns a result that   has either &#x60;marketing&#x60; or &#x60;BoxWorks&#x60; within its text. Using this   operator is not necessary as we implicitly interpret multi-word   queries as &#x60;OR&#x60; unless another supported boolean term is used. * &#x60;NOT&#x60; - returns items that do not contain the search term provided.   For example, a search for &#x60;marketing AND NOT BoxWorks&#x60; returns a result   that has only &#x60;marketing&#x60; within its text. Results containing   &#x60;BoxWorks&#x60; are omitted.  We do not support lower case (that is, &#x60;and&#x60;, &#x60;or&#x60;, and &#x60;not&#x60;) or mixed case (that is, &#x60;And&#x60;, &#x60;Or&#x60;, and &#x60;Not&#x60;) operators.  This field is required unless the &#x60;mdfilters&#x60; parameter is defined. | [optional] |
| **scope** | **String**| Limits the search results to either the files that the user has access to, or to files available to the entire enterprise.  The scope defaults to &#x60;user_content&#x60;, which limits the search results to content that is available to the currently authenticated user.  The &#x60;enterprise_content&#x60; can be requested by an admin through our support channels. Once this scope has been enabled for a user, it will allow that use to query for content across the entire enterprise and not only the content that they have access to. | [optional] [default to user_content] [enum: user_content, enterprise_content] |
| **fileExtensions** | [**List&lt;String&gt;**](String.md)| Limits the search results to any files that match any of the provided file extensions. This list is a comma-separated list of file extensions without the dots. | [optional] |
| **createdAtRange** | [**List&lt;String&gt;**](String.md)| Limits the search results to any items created within a given date range.  Date ranges are defined as comma separated RFC3339 timestamps.  If the the start date is omitted (&#x60;,2014-05-17T13:35:01-07:00&#x60;) anything created before the end date will be returned.  If the end date is omitted (&#x60;2014-05-15T13:35:01-07:00,&#x60;) the current date will be used as the end date instead. | [optional] |
| **updatedAtRange** | [**List&lt;String&gt;**](String.md)| Limits the search results to any items updated within a given date range.  Date ranges are defined as comma separated RFC3339 timestamps.  If the start date is omitted (&#x60;,2014-05-17T13:35:01-07:00&#x60;) anything updated before the end date will be returned.  If the end date is omitted (&#x60;2014-05-15T13:35:01-07:00,&#x60;) the current date will be used as the end date instead. | [optional] |
| **sizeRange** | [**List&lt;Integer&gt;**](Integer.md)| Limits the search results to any items with a size within a given file size range. This applied to files and folders.  Size ranges are defined as comma separated list of a lower and upper byte size limit (inclusive).  The upper and lower bound can be omitted to create open ranges. | [optional] |
| **ownerUserIds** | [**List&lt;String&gt;**](String.md)| Limits the search results to any items that are owned by the given list of owners, defined as a list of comma separated user IDs.  The items still need to be owned or shared with the currently authenticated user for them to show up in the search results. If the user does not have access to any files owned by any of the users an empty result set will be returned.  To search across an entire enterprise, we recommend using the &#x60;enterprise_content&#x60; scope parameter which can be requested with our support team. | [optional] |
| **recentUpdaterUserIds** | [**List&lt;String&gt;**](String.md)| Limits the search results to any items that have been updated by the given list of users, defined as a list of comma separated user IDs.  The items still need to be owned or shared with the currently authenticated user for them to show up in the search results. If the user does not have access to any files owned by any of the users an empty result set will be returned.  This feature only searches back to the last 10 versions of an item. | [optional] |
| **ancestorFolderIds** | [**List&lt;String&gt;**](String.md)| Limits the search results to items within the given list of folders, defined as a comma separated lists of folder IDs.  Search results will also include items within any subfolders of those ancestor folders.  The folders still need to be owned or shared with the currently authenticated user. If the folder is not accessible by this user, or it does not exist, a &#x60;HTTP 404&#x60; error code will be returned instead.  To search across an entire enterprise, we recommend using the &#x60;enterprise_content&#x60; scope parameter which can be requested with our support team. | [optional] |
| **contentTypes** | [**List&lt;String&gt;**](String.md)| Limits the search results to any items that match the search query for a specific part of the file, for example the file description.  Content types are defined as a comma separated lists of Box recognized content types. The allowed content types are as follows.  * &#x60;name&#x60; - The name of the item, as defined by its &#x60;name&#x60; field. * &#x60;description&#x60; - The description of the item, as defined by its   &#x60;description&#x60; field. * &#x60;file_content&#x60; - The actual content of the file. * &#x60;comments&#x60; - The content of any of the comments on a file or    folder. * &#x60;tags&#x60; - Any tags that are applied to an item, as defined by its    &#x60;tags&#x60; field. | [optional] [enum: name, description, file_content, comments, tag] |
| **type** | **String**| Limits the search results to any items of this type. This parameter only takes one value. By default the API returns items that match any of these types.  * &#x60;file&#x60; - Limits the search results to files * &#x60;folder&#x60; - Limits the search results to folders * &#x60;web_link&#x60; - Limits the search results to web links, also known    as bookmarks | [optional] [enum: file, folder, web_link] |
| **trashContent** | **String**| Determines if the search should look in the trash for items.  By default, this API only returns search results for items not currently in the trash (&#x60;non_trashed_only&#x60;).  * &#x60;trashed_only&#x60; - Only searches for items currently in the trash * &#x60;non_trashed_only&#x60; - Only searches for items currently not in   the trash * &#x60;all_items&#x60; - Searches for both trashed and non-trashed items. | [optional] [default to non_trashed_only] [enum: non_trashed_only, trashed_only, all_items] |
| **mdfilters** | [**List&lt;MetadataFilter&gt;**](MetadataFilter.md)| Limits the search results to any items for which the metadata matches the provided filter.  This parameter contains a list of 1 metadata template to filter the search results by. This list can currently only contain one entry, though this might be expanded in the future.  This parameter is required unless the &#x60;query&#x60; parameter is provided. | [optional] |
| **sort** | **String**| Defines the order in which search results are returned. This API defaults to returning items by relevance unless this parameter is explicitly specified.  * &#x60;relevance&#x60; (default) returns the results sorted by relevance to the query search term. The relevance is based on the occurrence of the search term in the items name, description, content, and additional properties. * &#x60;modified_at&#x60; returns the results ordered in descending order by date at which the item was last modified. | [optional] [default to relevance] [enum: modified_at, relevance] |
| **direction** | **String**| Defines the direction in which search results are ordered. This API defaults to returning items in descending (&#x60;DESC&#x60;) order unless this parameter is explicitly specified.  When results are sorted by &#x60;relevance&#x60; the ordering is locked to returning items in descending order of relevance, and this parameter is ignored. | [optional] [default to DESC] [enum: DESC, ASC] |
| **limit** | **Long**| Defines the maximum number of items to return as part of a page of results. | [optional] [default to 30] |
| **includeRecentSharedLinks** | **Boolean**| Defines whether the search results should include any items that the user recently accessed through a shared link.  When this parameter has been set to true, the format of the response of this API changes to return a list of [Search Results with Shared Links](r://search_results_with_shared_links) | [optional] [default to false] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested. | [optional] |
| **offset** | **Long**| The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response. | [optional] [default to 0] |
| **deletedUserIds** | [**List&lt;String&gt;**](String.md)| Limits the search results to items that were deleted by the given list of users, defined as a list of comma separated user IDs.  The &#x60;trash_content&#x60; parameter needs to be set to &#x60;trashed_only&#x60;.  If searching in trash is not performed, an empty result set is returned. The items need to be owned or shared with the currently authenticated user for them to show up in the search results.  If the user does not have access to any files owned by any of the users, an empty result set is returned.  Data available from 2023-02-01 onwards. | [optional] |
| **deletedAtRange** | [**List&lt;String&gt;**](String.md)| Limits the search results to any items deleted within a given date range.  Date ranges are defined as comma separated RFC3339 timestamps.  If the the start date is omitted (&#x60;2014-05-17T13:35:01-07:00&#x60;), anything deleted before the end date will be returned.  If the end date is omitted (&#x60;2014-05-15T13:35:01-07:00&#x60;), the current date will be used as the end date instead.  The &#x60;trash_content&#x60; parameter needs to be set to &#x60;trashed_only&#x60;.  If searching in trash is not performed, then an empty result is returned.  Data available from 2023-02-01 onwards. | [optional] |

### Return type

**Object**

### Authorization

[OAuth2Security](../README.md#OAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of search results. If there are no matching search results, the &#x60;entries&#x60; array will be empty. |  -  |
| **0** | An unexpected client error. |  -  |

