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
import com.konfigthis.client.model.TrashFolder;
import com.konfigthis.client.model.TrashFolderRestored;
import com.konfigthis.client.model.TrashedFoldersRestoreFolderRequest;
import com.konfigthis.client.model.TrashedFoldersRestoreFolderRequestParent;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TrashedFoldersApi
 */
@Disabled
public class TrashedFoldersApiTest {

    private static TrashedFoldersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TrashedFoldersApi(apiClient);
    }

    /**
     * Get trashed folder
     *
     * Retrieves a folder that has been moved to the trash.  Please note that only if the folder itself has been moved to the trash can it be retrieved with this API call. If instead one of its parent folders was moved to the trash, only that folder can be inspected using the [&#x60;GET /folders/:id/trash&#x60;](e://get_folders_id_trash) API.  To list all items that have been moved to the trash, please use the [&#x60;GET /folders/trash/items&#x60;](e://get-folders-trash-items/) API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getdFolderTest() throws ApiException {
        String folderId = null;
        List<String> fields = null;
        TrashFolder response = api.getdFolder(folderId)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * Permanently remove folder
     *
     * Permanently deletes a folder that is in the trash. This action cannot be undone.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void permanentlyRemoveFolderTest() throws ApiException {
        String folderId = null;
        api.permanentlyRemoveFolder(folderId)
                .execute();
        // TODO: test validations
    }

    /**
     * Restore folder
     *
     * Restores a folder that has been moved to the trash.  An optional new parent ID can be provided to restore the folder to in case the original folder has been deleted.  # Folder locking  During this operation, part of the file tree will be locked, mainly the source folder and all of its descendants, as well as the destination folder.  For the duration of the operation, no other move, copy, delete, or restore operation can performed on any of the locked folders.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void restoreFolderTest() throws ApiException {
        String folderId = null;
        String name = null;
        TrashedFoldersRestoreFolderRequestParent parent = null;
        List<String> fields = null;
        TrashFolderRestored response = api.restoreFolder(folderId)
                .name(name)
                .parent(parent)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

}
