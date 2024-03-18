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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.TrashFileCreatedBy;
import com.konfigthis.client.model.TrashFileFileVersion;
import com.konfigthis.client.model.TrashFileModifiedBy;
import com.konfigthis.client.model.TrashFileOwnedBy;
import com.konfigthis.client.model.TrashFileParent;
import com.konfigthis.client.model.TrashFilePathCollection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Represents a trashed file.
 */
@ApiModel(description = "Represents a trashed file.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TrashFile {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  /**
   * &#x60;file&#x60;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    FILE("file");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_SEQUENCE_ID = "sequence_id";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_ID)
  private String sequenceId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHA1 = "sha1";
  @SerializedName(SERIALIZED_NAME_SHA1)
  private String sha1;

  public static final String SERIALIZED_NAME_FILE_VERSION = "file_version";
  @SerializedName(SERIALIZED_NAME_FILE_VERSION)
  private TrashFileFileVersion fileVersion;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_PATH_COLLECTION = "path_collection";
  @SerializedName(SERIALIZED_NAME_PATH_COLLECTION)
  private TrashFilePathCollection pathCollection;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_MODIFIED_AT = "modified_at";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT)
  private OffsetDateTime modifiedAt;

  public static final String SERIALIZED_NAME_TRASHED_AT = "trashed_at";
  @SerializedName(SERIALIZED_NAME_TRASHED_AT)
  private OffsetDateTime trashedAt;

  public static final String SERIALIZED_NAME_PURGED_AT = "purged_at";
  @SerializedName(SERIALIZED_NAME_PURGED_AT)
  private OffsetDateTime purgedAt;

  public static final String SERIALIZED_NAME_CONTENT_CREATED_AT = "content_created_at";
  @SerializedName(SERIALIZED_NAME_CONTENT_CREATED_AT)
  private OffsetDateTime contentCreatedAt;

  public static final String SERIALIZED_NAME_CONTENT_MODIFIED_AT = "content_modified_at";
  @SerializedName(SERIALIZED_NAME_CONTENT_MODIFIED_AT)
  private OffsetDateTime contentModifiedAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private TrashFileCreatedBy createdBy;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modified_by";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private TrashFileModifiedBy modifiedBy;

  public static final String SERIALIZED_NAME_OWNED_BY = "owned_by";
  @SerializedName(SERIALIZED_NAME_OWNED_BY)
  private TrashFileOwnedBy ownedBy;

  public static final String SERIALIZED_NAME_SHARED_LINK = "shared_link";
  @SerializedName(SERIALIZED_NAME_SHARED_LINK)
  private String sharedLink;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private TrashFileParent parent;

  /**
   * Defines if this item has been deleted or not.  * &#x60;active&#x60; when the item has is not in the trash * &#x60;trashed&#x60; when the item has been moved to the trash but not deleted * &#x60;deleted&#x60; when the item has been permanently deleted.
   */
  @JsonAdapter(ItemStatusEnum.Adapter.class)
 public enum ItemStatusEnum {
    ACTIVE("active"),
    
    TRASHED("trashed"),
    
    DELETED("deleted");

    private String value;

    ItemStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ItemStatusEnum fromValue(String value) {
      for (ItemStatusEnum b : ItemStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ItemStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ItemStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ItemStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ItemStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ITEM_STATUS = "item_status";
  @SerializedName(SERIALIZED_NAME_ITEM_STATUS)
  private ItemStatusEnum itemStatus;

  public TrashFile() {
  }

  public TrashFile description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The optional description of this file
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Contract for Q1 renewal", required = true, value = "The optional description of this file")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public TrashFile id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier that represent a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/files/123&#x60; the &#x60;file_id&#x60; is &#x60;123&#x60;.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123456789", required = true, value = "The unique identifier that represent a file.  The ID for any file can be determined by visiting a file in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/files/123` the `file_id` is `123`.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public TrashFile etag(String etag) {
    
    
    
    
    this.etag = etag;
    return this;
  }

   /**
   * The HTTP &#x60;etag&#x60; of this file. This can be used within some API endpoints in the &#x60;If-Match&#x60; and &#x60;If-None-Match&#x60; headers to only perform changes on the file if (no) changes have happened.
   * @return etag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The HTTP `etag` of this file. This can be used within some API endpoints in the `If-Match` and `If-None-Match` headers to only perform changes on the file if (no) changes have happened.")

  public String getEtag() {
    return etag;
  }


  public void setEtag(String etag) {
    
    
    
    this.etag = etag;
  }


  public TrashFile type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;file&#x60;
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "FILE", required = true, value = "`file`")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public TrashFile sequenceId(String sequenceId) {
    
    
    
    
    this.sequenceId = sequenceId;
    return this;
  }

   /**
   * Get sequenceId
   * @return sequenceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSequenceId() {
    return sequenceId;
  }


  public void setSequenceId(String sequenceId) {
    
    
    
    this.sequenceId = sequenceId;
  }


  public TrashFile name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the file
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Contract.pdf", value = "The name of the file")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public TrashFile sha1(String sha1) {
    
    
    
    
    this.sha1 = sha1;
    return this;
  }

   /**
   * The SHA1 hash of the file. This can be used to compare the contents of a file on Box with a local file.
   * @return sha1
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "85136C79CBF9FE36BB9D05D0639C70C265C18D37", required = true, value = "The SHA1 hash of the file. This can be used to compare the contents of a file on Box with a local file.")

  public String getSha1() {
    return sha1;
  }


  public void setSha1(String sha1) {
    
    
    
    this.sha1 = sha1;
  }


  public TrashFile fileVersion(TrashFileFileVersion fileVersion) {
    
    
    
    
    this.fileVersion = fileVersion;
    return this;
  }

   /**
   * Get fileVersion
   * @return fileVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrashFileFileVersion getFileVersion() {
    return fileVersion;
  }


  public void setFileVersion(TrashFileFileVersion fileVersion) {
    
    
    
    this.fileVersion = fileVersion;
  }


  public TrashFile size(Integer size) {
    
    
    
    
    this.size = size;
    return this;
  }

   /**
   * The file size in bytes. Be careful parsing this integer as it can get very large and cause an integer overflow.
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "629644", required = true, value = "The file size in bytes. Be careful parsing this integer as it can get very large and cause an integer overflow.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    
    
    
    this.size = size;
  }


  public TrashFile pathCollection(TrashFilePathCollection pathCollection) {
    
    
    
    
    this.pathCollection = pathCollection;
    return this;
  }

   /**
   * Get pathCollection
   * @return pathCollection
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TrashFilePathCollection getPathCollection() {
    return pathCollection;
  }


  public void setPathCollection(TrashFilePathCollection pathCollection) {
    
    
    
    this.pathCollection = pathCollection;
  }


  public TrashFile createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when the file was created on Box.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", required = true, value = "The date and time when the file was created on Box.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public TrashFile modifiedAt(OffsetDateTime modifiedAt) {
    
    
    
    
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * The date and time when the file was last updated on Box.
   * @return modifiedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", required = true, value = "The date and time when the file was last updated on Box.")

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }


  public void setModifiedAt(OffsetDateTime modifiedAt) {
    
    
    
    this.modifiedAt = modifiedAt;
  }


  public TrashFile trashedAt(OffsetDateTime trashedAt) {
    
    
    
    
    this.trashedAt = trashedAt;
    return this;
  }

   /**
   * The time at which this file was put in the trash.
   * @return trashedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "The time at which this file was put in the trash.")

  public OffsetDateTime getTrashedAt() {
    return trashedAt;
  }


  public void setTrashedAt(OffsetDateTime trashedAt) {
    
    
    
    this.trashedAt = trashedAt;
  }


  public TrashFile purgedAt(OffsetDateTime purgedAt) {
    
    
    
    
    this.purgedAt = purgedAt;
    return this;
  }

   /**
   * The time at which this file is expected to be purged from the trash.
   * @return purgedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "The time at which this file is expected to be purged from the trash.")

  public OffsetDateTime getPurgedAt() {
    return purgedAt;
  }


  public void setPurgedAt(OffsetDateTime purgedAt) {
    
    
    
    this.purgedAt = purgedAt;
  }


  public TrashFile contentCreatedAt(OffsetDateTime contentCreatedAt) {
    
    
    
    
    this.contentCreatedAt = contentCreatedAt;
    return this;
  }

   /**
   * The date and time at which this file was originally created, which might be before it was uploaded to Box.
   * @return contentCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "The date and time at which this file was originally created, which might be before it was uploaded to Box.")

  public OffsetDateTime getContentCreatedAt() {
    return contentCreatedAt;
  }


  public void setContentCreatedAt(OffsetDateTime contentCreatedAt) {
    
    
    
    this.contentCreatedAt = contentCreatedAt;
  }


  public TrashFile contentModifiedAt(OffsetDateTime contentModifiedAt) {
    
    
    
    
    this.contentModifiedAt = contentModifiedAt;
    return this;
  }

   /**
   * The date and time at which this file was last updated, which might be before it was uploaded to Box.
   * @return contentModifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "The date and time at which this file was last updated, which might be before it was uploaded to Box.")

  public OffsetDateTime getContentModifiedAt() {
    return contentModifiedAt;
  }


  public void setContentModifiedAt(OffsetDateTime contentModifiedAt) {
    
    
    
    this.contentModifiedAt = contentModifiedAt;
  }


  public TrashFile createdBy(TrashFileCreatedBy createdBy) {
    
    
    
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrashFileCreatedBy getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(TrashFileCreatedBy createdBy) {
    
    
    
    this.createdBy = createdBy;
  }


  public TrashFile modifiedBy(TrashFileModifiedBy modifiedBy) {
    
    
    
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TrashFileModifiedBy getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(TrashFileModifiedBy modifiedBy) {
    
    
    
    this.modifiedBy = modifiedBy;
  }


  public TrashFile ownedBy(TrashFileOwnedBy ownedBy) {
    
    
    
    
    this.ownedBy = ownedBy;
    return this;
  }

   /**
   * Get ownedBy
   * @return ownedBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TrashFileOwnedBy getOwnedBy() {
    return ownedBy;
  }


  public void setOwnedBy(TrashFileOwnedBy ownedBy) {
    
    
    
    this.ownedBy = ownedBy;
  }


  public TrashFile sharedLink(String sharedLink) {
    
    
    
    
    this.sharedLink = sharedLink;
    return this;
  }

   /**
   * The shared link for this file. This will be &#x60;null&#x60; if a file has been trashed, since the link will no longer be active.
   * @return sharedLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The shared link for this file. This will be `null` if a file has been trashed, since the link will no longer be active.")

  public String getSharedLink() {
    return sharedLink;
  }


  public void setSharedLink(String sharedLink) {
    
    
    
    this.sharedLink = sharedLink;
  }


  public TrashFile parent(TrashFileParent parent) {
    
    
    
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrashFileParent getParent() {
    return parent;
  }


  public void setParent(TrashFileParent parent) {
    
    
    
    this.parent = parent;
  }


  public TrashFile itemStatus(ItemStatusEnum itemStatus) {
    
    
    
    
    this.itemStatus = itemStatus;
    return this;
  }

   /**
   * Defines if this item has been deleted or not.  * &#x60;active&#x60; when the item has is not in the trash * &#x60;trashed&#x60; when the item has been moved to the trash but not deleted * &#x60;deleted&#x60; when the item has been permanently deleted.
   * @return itemStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "TRASHED", required = true, value = "Defines if this item has been deleted or not.  * `active` when the item has is not in the trash * `trashed` when the item has been moved to the trash but not deleted * `deleted` when the item has been permanently deleted.")

  public ItemStatusEnum getItemStatus() {
    return itemStatus;
  }


  public void setItemStatus(ItemStatusEnum itemStatus) {
    
    
    
    this.itemStatus = itemStatus;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the TrashFile instance itself
   */
  public TrashFile putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrashFile trashFile = (TrashFile) o;
    return Objects.equals(this.description, trashFile.description) &&
        Objects.equals(this.id, trashFile.id) &&
        Objects.equals(this.etag, trashFile.etag) &&
        Objects.equals(this.type, trashFile.type) &&
        Objects.equals(this.sequenceId, trashFile.sequenceId) &&
        Objects.equals(this.name, trashFile.name) &&
        Objects.equals(this.sha1, trashFile.sha1) &&
        Objects.equals(this.fileVersion, trashFile.fileVersion) &&
        Objects.equals(this.size, trashFile.size) &&
        Objects.equals(this.pathCollection, trashFile.pathCollection) &&
        Objects.equals(this.createdAt, trashFile.createdAt) &&
        Objects.equals(this.modifiedAt, trashFile.modifiedAt) &&
        Objects.equals(this.trashedAt, trashFile.trashedAt) &&
        Objects.equals(this.purgedAt, trashFile.purgedAt) &&
        Objects.equals(this.contentCreatedAt, trashFile.contentCreatedAt) &&
        Objects.equals(this.contentModifiedAt, trashFile.contentModifiedAt) &&
        Objects.equals(this.createdBy, trashFile.createdBy) &&
        Objects.equals(this.modifiedBy, trashFile.modifiedBy) &&
        Objects.equals(this.ownedBy, trashFile.ownedBy) &&
        Objects.equals(this.sharedLink, trashFile.sharedLink) &&
        Objects.equals(this.parent, trashFile.parent) &&
        Objects.equals(this.itemStatus, trashFile.itemStatus)&&
        Objects.equals(this.additionalProperties, trashFile.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, etag, type, sequenceId, name, sha1, fileVersion, size, pathCollection, createdAt, modifiedAt, trashedAt, purgedAt, contentCreatedAt, contentModifiedAt, createdBy, modifiedBy, ownedBy, sharedLink, parent, itemStatus, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrashFile {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sequenceId: ").append(toIndentedString(sequenceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
    sb.append("    fileVersion: ").append(toIndentedString(fileVersion)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    pathCollection: ").append(toIndentedString(pathCollection)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    trashedAt: ").append(toIndentedString(trashedAt)).append("\n");
    sb.append("    purgedAt: ").append(toIndentedString(purgedAt)).append("\n");
    sb.append("    contentCreatedAt: ").append(toIndentedString(contentCreatedAt)).append("\n");
    sb.append("    contentModifiedAt: ").append(toIndentedString(contentModifiedAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
    sb.append("    sharedLink: ").append(toIndentedString(sharedLink)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("etag");
    openapiFields.add("type");
    openapiFields.add("sequence_id");
    openapiFields.add("name");
    openapiFields.add("sha1");
    openapiFields.add("file_version");
    openapiFields.add("size");
    openapiFields.add("path_collection");
    openapiFields.add("created_at");
    openapiFields.add("modified_at");
    openapiFields.add("trashed_at");
    openapiFields.add("purged_at");
    openapiFields.add("content_created_at");
    openapiFields.add("content_modified_at");
    openapiFields.add("created_by");
    openapiFields.add("modified_by");
    openapiFields.add("owned_by");
    openapiFields.add("shared_link");
    openapiFields.add("parent");
    openapiFields.add("item_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("sequence_id");
    openapiRequiredFields.add("sha1");
    openapiRequiredFields.add("size");
    openapiRequiredFields.add("path_collection");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("modified_at");
    openapiRequiredFields.add("modified_by");
    openapiRequiredFields.add("owned_by");
    openapiRequiredFields.add("item_status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrashFile
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TrashFile.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrashFile is not found in the empty JSON string", TrashFile.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TrashFile.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("etag").isJsonNull() && (jsonObj.get("etag") != null && !jsonObj.get("etag").isJsonNull()) && !jsonObj.get("etag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `etag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("etag").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `sequence_id`
      String.validateJsonObject(jsonObj.getAsJsonObject("sequence_id"));
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("sha1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha1").toString()));
      }
      // validate the optional field `file_version`
      if (jsonObj.get("file_version") != null && !jsonObj.get("file_version").isJsonNull()) {
        TrashFileFileVersion.validateJsonObject(jsonObj.getAsJsonObject("file_version"));
      }
      // validate the required field `path_collection`
      TrashFilePathCollection.validateJsonObject(jsonObj.getAsJsonObject("path_collection"));
      // validate the optional field `created_by`
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) {
        TrashFileCreatedBy.validateJsonObject(jsonObj.getAsJsonObject("created_by"));
      }
      // validate the required field `modified_by`
      TrashFileModifiedBy.validateJsonObject(jsonObj.getAsJsonObject("modified_by"));
      // validate the required field `owned_by`
      TrashFileOwnedBy.validateJsonObject(jsonObj.getAsJsonObject("owned_by"));
      if (!jsonObj.get("shared_link").isJsonNull() && (jsonObj.get("shared_link") != null && !jsonObj.get("shared_link").isJsonNull()) && !jsonObj.get("shared_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shared_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shared_link").toString()));
      }
      // validate the optional field `parent`
      if (jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonNull()) {
        TrashFileParent.validateJsonObject(jsonObj.getAsJsonObject("parent"));
      }
      if (!jsonObj.get("item_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrashFile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrashFile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrashFile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrashFile.class));

       return (TypeAdapter<T>) new TypeAdapter<TrashFile>() {
           @Override
           public void write(JsonWriter out, TrashFile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public TrashFile read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TrashFile instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrashFile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrashFile
  * @throws IOException if the JSON string is invalid with respect to TrashFile
  */
  public static TrashFile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrashFile.class);
  }

 /**
  * Convert an instance of TrashFile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

