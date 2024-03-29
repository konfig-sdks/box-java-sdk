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


package com.konfigthis.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.FileFull;
import com.konfigthis.client.model.FileVersionMini;
import com.konfigthis.client.model.FolderAllOfFolderUploadEmail;
import com.konfigthis.client.model.FolderFull;
import com.konfigthis.client.model.FolderMini;
import com.konfigthis.client.model.Items;
import com.konfigthis.client.model.UserMini;
import com.konfigthis.client.model.WebLink;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for RecentItemItemAllOf
 */
public class RecentItemItemAllOfTest {
    private final RecentItemItemAllOf model = new RecentItemItemAllOf();

    /**
     * Model tests for RecentItemItemAllOf
     */
    @Test
    public void testRecentItemItemAllOf() {
        // TODO: test RecentItemItemAllOf
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'etag'
     */
    @Test
    public void etagTest() {
        // TODO: test etag
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'sequenceId'
     */
    @Test
    public void sequenceIdTest() {
        // TODO: test sequenceId
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'sha1'
     */
    @Test
    public void sha1Test() {
        // TODO: test sha1
    }

    /**
     * Test the property 'fileVersion'
     */
    @Test
    public void fileVersionTest() {
        // TODO: test fileVersion
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'size'
     */
    @Test
    public void sizeTest() {
        // TODO: test size
    }

    /**
     * Test the property 'pathCollection'
     */
    @Test
    public void pathCollectionTest() {
        // TODO: test pathCollection
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'modifiedAt'
     */
    @Test
    public void modifiedAtTest() {
        // TODO: test modifiedAt
    }

    /**
     * Test the property 'trashedAt'
     */
    @Test
    public void trashedAtTest() {
        // TODO: test trashedAt
    }

    /**
     * Test the property 'purgedAt'
     */
    @Test
    public void purgedAtTest() {
        // TODO: test purgedAt
    }

    /**
     * Test the property 'contentCreatedAt'
     */
    @Test
    public void contentCreatedAtTest() {
        // TODO: test contentCreatedAt
    }

    /**
     * Test the property 'contentModifiedAt'
     */
    @Test
    public void contentModifiedAtTest() {
        // TODO: test contentModifiedAt
    }

    /**
     * Test the property 'createdBy'
     */
    @Test
    public void createdByTest() {
        // TODO: test createdBy
    }

    /**
     * Test the property 'modifiedBy'
     */
    @Test
    public void modifiedByTest() {
        // TODO: test modifiedBy
    }

    /**
     * Test the property 'ownedBy'
     */
    @Test
    public void ownedByTest() {
        // TODO: test ownedBy
    }

    /**
     * Test the property 'sharedLink'
     */
    @Test
    public void sharedLinkTest() {
        // TODO: test sharedLink
    }

    /**
     * Test the property 'parent'
     */
    @Test
    public void parentTest() {
        // TODO: test parent
    }

    /**
     * Test the property 'itemStatus'
     */
    @Test
    public void itemStatusTest() {
        // TODO: test itemStatus
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'versionNumber'
     */
    @Test
    public void versionNumberTest() {
        // TODO: test versionNumber
    }

    /**
     * Test the property 'commentCount'
     */
    @Test
    public void commentCountTest() {
        // TODO: test commentCount
    }

    /**
     * Test the property 'permissions'
     */
    @Test
    public void permissionsTest() {
        // TODO: test permissions
    }

    /**
     * Test the property 'lock'
     */
    @Test
    public void lockTest() {
        // TODO: test lock
    }

    /**
     * Test the property 'extension'
     */
    @Test
    public void extensionTest() {
        // TODO: test extension
    }

    /**
     * Test the property 'isPackage'
     */
    @Test
    public void isPackageTest() {
        // TODO: test isPackage
    }

    /**
     * Test the property 'expiringEmbedLink'
     */
    @Test
    public void expiringEmbedLinkTest() {
        // TODO: test expiringEmbedLink
    }

    /**
     * Test the property 'watermarkInfo'
     */
    @Test
    public void watermarkInfoTest() {
        // TODO: test watermarkInfo
    }

    /**
     * Test the property 'isAccessibleViaSharedLink'
     */
    @Test
    public void isAccessibleViaSharedLinkTest() {
        // TODO: test isAccessibleViaSharedLink
    }

    /**
     * Test the property 'allowedInviteeRoles'
     */
    @Test
    public void allowedInviteeRolesTest() {
        // TODO: test allowedInviteeRoles
    }

    /**
     * Test the property 'isExternallyOwned'
     */
    @Test
    public void isExternallyOwnedTest() {
        // TODO: test isExternallyOwned
    }

    /**
     * Test the property 'hasCollaborations'
     */
    @Test
    public void hasCollaborationsTest() {
        // TODO: test hasCollaborations
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    public void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'expiresAt'
     */
    @Test
    public void expiresAtTest() {
        // TODO: test expiresAt
    }

    /**
     * Test the property 'representations'
     */
    @Test
    public void representationsTest() {
        // TODO: test representations
    }

    /**
     * Test the property 'classification'
     */
    @Test
    public void classificationTest() {
        // TODO: test classification
    }

    /**
     * Test the property 'uploaderDisplayName'
     */
    @Test
    public void uploaderDisplayNameTest() {
        // TODO: test uploaderDisplayName
    }

    /**
     * Test the property 'dispositionAt'
     */
    @Test
    public void dispositionAtTest() {
        // TODO: test dispositionAt
    }

    /**
     * Test the property 'sharedLinkPermissionOptions'
     */
    @Test
    public void sharedLinkPermissionOptionsTest() {
        // TODO: test sharedLinkPermissionOptions
    }

    /**
     * Test the property 'folderUploadEmail'
     */
    @Test
    public void folderUploadEmailTest() {
        // TODO: test folderUploadEmail
    }

    /**
     * Test the property 'itemCollection'
     */
    @Test
    public void itemCollectionTest() {
        // TODO: test itemCollection
    }

    /**
     * Test the property 'syncState'
     */
    @Test
    public void syncStateTest() {
        // TODO: test syncState
    }

    /**
     * Test the property 'canNonOwnersInvite'
     */
    @Test
    public void canNonOwnersInviteTest() {
        // TODO: test canNonOwnersInvite
    }

    /**
     * Test the property 'isCollaborationRestrictedToEnterprise'
     */
    @Test
    public void isCollaborationRestrictedToEnterpriseTest() {
        // TODO: test isCollaborationRestrictedToEnterprise
    }

    /**
     * Test the property 'allowedSharedLinkAccessLevels'
     */
    @Test
    public void allowedSharedLinkAccessLevelsTest() {
        // TODO: test allowedSharedLinkAccessLevels
    }

    /**
     * Test the property 'canNonOwnersViewCollaborators'
     */
    @Test
    public void canNonOwnersViewCollaboratorsTest() {
        // TODO: test canNonOwnersViewCollaborators
    }

    /**
     * Test the property 'url'
     */
    @Test
    public void urlTest() {
        // TODO: test url
    }

}
