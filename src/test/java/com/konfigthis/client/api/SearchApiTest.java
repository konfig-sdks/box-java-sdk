/*
 * Box Platform API
 * [Box Platform](https://box.dev) provides functionality to provide access to content stored within [Box](https://box.com). It provides endpoints for basic manipulation of files and folders, management of users within an enterprise, as well as more complex topics such as legal holds and retention policies.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: devrel@box.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ClientError;
import com.konfigthis.client.model.MetadataFilter;
import com.konfigthis.client.model.MetadataQuery;
import com.konfigthis.client.model.MetadataQueryOrderByInner;
import com.konfigthis.client.model.MetadataQueryResults;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
@Disabled
public class SearchApiTest {

    private static SearchApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SearchApi(apiClient);
    }

    /**
     * Query files/folders by metadata
     *
     * Create a search using SQL-like syntax to return items that match specific metadata.  By default, this endpoint returns only the most basic info about the items for which the query matches. To get additional fields for each item, including any of the metadata, use the &#x60;fields&#x60; attribute in the query.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void itemsByMetadataTest() throws ApiException {
        String from = null;
        String ancestorFolderId = null;
        String query = null;
        Map<String, String> queryParams = null;
        List<MetadataQueryOrderByInner> orderBy = null;
        Integer limit = null;
        String marker = null;
        List<String> fields = null;
        MetadataQueryResults response = api.itemsByMetadata(from, ancestorFolderId)
                .query(query)
                .queryParams(queryParams)
                .orderBy(orderBy)
                .limit(limit)
                .marker(marker)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * Search for content
     *
     * Searches for files, folders, web links, and shared files across the users content or across the entire enterprise.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchTest() throws ApiException {
        String query = null;
        String scope = null;
        List<String> fileExtensions = null;
        List<String> createdAtRange = null;
        List<String> updatedAtRange = null;
        List<Integer> sizeRange = null;
        List<String> ownerUserIds = null;
        List<String> recentUpdaterUserIds = null;
        List<String> ancestorFolderIds = null;
        List<String> contentTypes = null;
        String type = null;
        String trashContent = null;
        List<MetadataFilter> mdfilters = null;
        String sort = null;
        String direction = null;
        Long limit = null;
        Boolean includeRecentSharedLinks = null;
        List<String> fields = null;
        Long offset = null;
        List<String> deletedUserIds = null;
        List<String> deletedAtRange = null;
        Object response = api.search()
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
        // TODO: test validations
    }

}
