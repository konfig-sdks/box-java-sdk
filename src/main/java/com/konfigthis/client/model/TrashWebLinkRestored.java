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
import com.konfigthis.client.model.TrashWebLinkCreatedBy;
import com.konfigthis.client.model.TrashWebLinkModifiedBy;
import com.konfigthis.client.model.TrashWebLinkOwnedBy;
import com.konfigthis.client.model.TrashWebLinkParent;
import com.konfigthis.client.model.TrashWebLinkRestoredPathCollection;
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
 * Represents a web link restored from the trash.
 */
@ApiModel(description = "Represents a web link restored from the trash.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TrashWebLinkRestored {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * &#x60;web_link&#x60;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    WEB_LINK("web_link");

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

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SEQUENCE_ID = "sequence_id";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_ID)
  private String sequenceId;

  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private TrashWebLinkParent parent;

  public static final String SERIALIZED_NAME_PATH_COLLECTION = "path_collection";
  @SerializedName(SERIALIZED_NAME_PATH_COLLECTION)
  private TrashWebLinkRestoredPathCollection pathCollection;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_MODIFIED_AT = "modified_at";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT)
  private OffsetDateTime modifiedAt;

  public static final String SERIALIZED_NAME_TRASHED_AT = "trashed_at";
  @SerializedName(SERIALIZED_NAME_TRASHED_AT)
  private String trashedAt;

  public static final String SERIALIZED_NAME_PURGED_AT = "purged_at";
  @SerializedName(SERIALIZED_NAME_PURGED_AT)
  private String purgedAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private TrashWebLinkCreatedBy createdBy;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modified_by";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private TrashWebLinkModifiedBy modifiedBy;

  public static final String SERIALIZED_NAME_OWNED_BY = "owned_by";
  @SerializedName(SERIALIZED_NAME_OWNED_BY)
  private TrashWebLinkOwnedBy ownedBy;

  public static final String SERIALIZED_NAME_SHARED_LINK = "shared_link";
  @SerializedName(SERIALIZED_NAME_SHARED_LINK)
  private String sharedLink;

  /**
   * Whether this item is deleted or not. Values include &#x60;active&#x60;, &#x60;trashed&#x60; if the file has been moved to the trash, and &#x60;deleted&#x60; if the file has been permanently deleted
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

  public TrashWebLinkRestored() {
  }

  public TrashWebLinkRestored description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The description accompanying the web link. This is visible within the Box web application.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Example page", value = "The description accompanying the web link. This is visible within the Box web application.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public TrashWebLinkRestored type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;web_link&#x60;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WEB_LINK", value = "`web_link`")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public TrashWebLinkRestored id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for this web link
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11446498", value = "The unique identifier for this web link")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public TrashWebLinkRestored sequenceId(String sequenceId) {
    
    
    
    
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


  public TrashWebLinkRestored etag(String etag) {
    
    
    
    
    this.etag = etag;
    return this;
  }

   /**
   * The entity tag of this web link. Used with &#x60;If-Match&#x60; headers.
   * @return etag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The entity tag of this web link. Used with `If-Match` headers.")

  public String getEtag() {
    return etag;
  }


  public void setEtag(String etag) {
    
    
    
    this.etag = etag;
  }


  public TrashWebLinkRestored name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the web link
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Bookmark", value = "The name of the web link")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public TrashWebLinkRestored url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * The URL this web link points to
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.example.com/example/1234", value = "The URL this web link points to")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public TrashWebLinkRestored parent(TrashWebLinkParent parent) {
    
    
    
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrashWebLinkParent getParent() {
    return parent;
  }


  public void setParent(TrashWebLinkParent parent) {
    
    
    
    this.parent = parent;
  }


  public TrashWebLinkRestored pathCollection(TrashWebLinkRestoredPathCollection pathCollection) {
    
    
    
    
    this.pathCollection = pathCollection;
    return this;
  }

   /**
   * Get pathCollection
   * @return pathCollection
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TrashWebLinkRestoredPathCollection getPathCollection() {
    return pathCollection;
  }


  public void setPathCollection(TrashWebLinkRestoredPathCollection pathCollection) {
    
    
    
    this.pathCollection = pathCollection;
  }


  public TrashWebLinkRestored createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When this file was created on Box’s servers.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When this file was created on Box’s servers.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public TrashWebLinkRestored modifiedAt(OffsetDateTime modifiedAt) {
    
    
    
    
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * When this file was last updated on the Box servers.
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When this file was last updated on the Box servers.")

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }


  public void setModifiedAt(OffsetDateTime modifiedAt) {
    
    
    
    this.modifiedAt = modifiedAt;
  }


  public TrashWebLinkRestored trashedAt(String trashedAt) {
    
    
    
    
    this.trashedAt = trashedAt;
    return this;
  }

   /**
   * The time at which this bookmark was put in the trash - becomes &#x60;null&#x60; after restore.
   * @return trashedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time at which this bookmark was put in the trash - becomes `null` after restore.")

  public String getTrashedAt() {
    return trashedAt;
  }


  public void setTrashedAt(String trashedAt) {
    
    
    
    this.trashedAt = trashedAt;
  }


  public TrashWebLinkRestored purgedAt(String purgedAt) {
    
    
    
    
    this.purgedAt = purgedAt;
    return this;
  }

   /**
   * The time at which this bookmark will be permanently deleted - becomes &#x60;null&#x60; after restore.
   * @return purgedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time at which this bookmark will be permanently deleted - becomes `null` after restore.")

  public String getPurgedAt() {
    return purgedAt;
  }


  public void setPurgedAt(String purgedAt) {
    
    
    
    this.purgedAt = purgedAt;
  }


  public TrashWebLinkRestored createdBy(TrashWebLinkCreatedBy createdBy) {
    
    
    
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrashWebLinkCreatedBy getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(TrashWebLinkCreatedBy createdBy) {
    
    
    
    this.createdBy = createdBy;
  }


  public TrashWebLinkRestored modifiedBy(TrashWebLinkModifiedBy modifiedBy) {
    
    
    
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrashWebLinkModifiedBy getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(TrashWebLinkModifiedBy modifiedBy) {
    
    
    
    this.modifiedBy = modifiedBy;
  }


  public TrashWebLinkRestored ownedBy(TrashWebLinkOwnedBy ownedBy) {
    
    
    
    
    this.ownedBy = ownedBy;
    return this;
  }

   /**
   * Get ownedBy
   * @return ownedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrashWebLinkOwnedBy getOwnedBy() {
    return ownedBy;
  }


  public void setOwnedBy(TrashWebLinkOwnedBy ownedBy) {
    
    
    
    this.ownedBy = ownedBy;
  }


  public TrashWebLinkRestored sharedLink(String sharedLink) {
    
    
    
    
    this.sharedLink = sharedLink;
    return this;
  }

   /**
   * The shared link for this bookmark. This will be &#x60;null&#x60; if a bookmark had been trashed, even though the original shared link does become active again.
   * @return sharedLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The shared link for this bookmark. This will be `null` if a bookmark had been trashed, even though the original shared link does become active again.")

  public String getSharedLink() {
    return sharedLink;
  }


  public void setSharedLink(String sharedLink) {
    
    
    
    this.sharedLink = sharedLink;
  }


  public TrashWebLinkRestored itemStatus(ItemStatusEnum itemStatus) {
    
    
    
    
    this.itemStatus = itemStatus;
    return this;
  }

   /**
   * Whether this item is deleted or not. Values include &#x60;active&#x60;, &#x60;trashed&#x60; if the file has been moved to the trash, and &#x60;deleted&#x60; if the file has been permanently deleted
   * @return itemStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TRASHED", value = "Whether this item is deleted or not. Values include `active`, `trashed` if the file has been moved to the trash, and `deleted` if the file has been permanently deleted")

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
   * @return the TrashWebLinkRestored instance itself
   */
  public TrashWebLinkRestored putAdditionalProperty(String key, Object value) {
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
    TrashWebLinkRestored trashWebLinkRestored = (TrashWebLinkRestored) o;
    return Objects.equals(this.description, trashWebLinkRestored.description) &&
        Objects.equals(this.type, trashWebLinkRestored.type) &&
        Objects.equals(this.id, trashWebLinkRestored.id) &&
        Objects.equals(this.sequenceId, trashWebLinkRestored.sequenceId) &&
        Objects.equals(this.etag, trashWebLinkRestored.etag) &&
        Objects.equals(this.name, trashWebLinkRestored.name) &&
        Objects.equals(this.url, trashWebLinkRestored.url) &&
        Objects.equals(this.parent, trashWebLinkRestored.parent) &&
        Objects.equals(this.pathCollection, trashWebLinkRestored.pathCollection) &&
        Objects.equals(this.createdAt, trashWebLinkRestored.createdAt) &&
        Objects.equals(this.modifiedAt, trashWebLinkRestored.modifiedAt) &&
        Objects.equals(this.trashedAt, trashWebLinkRestored.trashedAt) &&
        Objects.equals(this.purgedAt, trashWebLinkRestored.purgedAt) &&
        Objects.equals(this.createdBy, trashWebLinkRestored.createdBy) &&
        Objects.equals(this.modifiedBy, trashWebLinkRestored.modifiedBy) &&
        Objects.equals(this.ownedBy, trashWebLinkRestored.ownedBy) &&
        Objects.equals(this.sharedLink, trashWebLinkRestored.sharedLink) &&
        Objects.equals(this.itemStatus, trashWebLinkRestored.itemStatus)&&
        Objects.equals(this.additionalProperties, trashWebLinkRestored.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, type, id, sequenceId, etag, name, url, parent, pathCollection, createdAt, modifiedAt, trashedAt, purgedAt, createdBy, modifiedBy, ownedBy, sharedLink, itemStatus, additionalProperties);
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
    sb.append("class TrashWebLinkRestored {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sequenceId: ").append(toIndentedString(sequenceId)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    pathCollection: ").append(toIndentedString(pathCollection)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    trashedAt: ").append(toIndentedString(trashedAt)).append("\n");
    sb.append("    purgedAt: ").append(toIndentedString(purgedAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
    sb.append("    sharedLink: ").append(toIndentedString(sharedLink)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("id");
    openapiFields.add("sequence_id");
    openapiFields.add("etag");
    openapiFields.add("name");
    openapiFields.add("url");
    openapiFields.add("parent");
    openapiFields.add("path_collection");
    openapiFields.add("created_at");
    openapiFields.add("modified_at");
    openapiFields.add("trashed_at");
    openapiFields.add("purged_at");
    openapiFields.add("created_by");
    openapiFields.add("modified_by");
    openapiFields.add("owned_by");
    openapiFields.add("shared_link");
    openapiFields.add("item_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sequence_id");
    openapiRequiredFields.add("path_collection");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrashWebLinkRestored
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TrashWebLinkRestored.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrashWebLinkRestored is not found in the empty JSON string", TrashWebLinkRestored.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TrashWebLinkRestored.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `sequence_id`
      String.validateJsonObject(jsonObj.getAsJsonObject("sequence_id"));
      if ((jsonObj.get("etag") != null && !jsonObj.get("etag").isJsonNull()) && !jsonObj.get("etag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `etag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("etag").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the optional field `parent`
      if (jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonNull()) {
        TrashWebLinkParent.validateJsonObject(jsonObj.getAsJsonObject("parent"));
      }
      // validate the required field `path_collection`
      TrashWebLinkRestoredPathCollection.validateJsonObject(jsonObj.getAsJsonObject("path_collection"));
      if (!jsonObj.get("trashed_at").isJsonNull() && (jsonObj.get("trashed_at") != null && !jsonObj.get("trashed_at").isJsonNull()) && !jsonObj.get("trashed_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trashed_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trashed_at").toString()));
      }
      if (!jsonObj.get("purged_at").isJsonNull() && (jsonObj.get("purged_at") != null && !jsonObj.get("purged_at").isJsonNull()) && !jsonObj.get("purged_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purged_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purged_at").toString()));
      }
      // validate the optional field `created_by`
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) {
        TrashWebLinkCreatedBy.validateJsonObject(jsonObj.getAsJsonObject("created_by"));
      }
      // validate the optional field `modified_by`
      if (jsonObj.get("modified_by") != null && !jsonObj.get("modified_by").isJsonNull()) {
        TrashWebLinkModifiedBy.validateJsonObject(jsonObj.getAsJsonObject("modified_by"));
      }
      // validate the optional field `owned_by`
      if (jsonObj.get("owned_by") != null && !jsonObj.get("owned_by").isJsonNull()) {
        TrashWebLinkOwnedBy.validateJsonObject(jsonObj.getAsJsonObject("owned_by"));
      }
      if (!jsonObj.get("shared_link").isJsonNull() && (jsonObj.get("shared_link") != null && !jsonObj.get("shared_link").isJsonNull()) && !jsonObj.get("shared_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shared_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shared_link").toString()));
      }
      if ((jsonObj.get("item_status") != null && !jsonObj.get("item_status").isJsonNull()) && !jsonObj.get("item_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrashWebLinkRestored.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrashWebLinkRestored' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrashWebLinkRestored> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrashWebLinkRestored.class));

       return (TypeAdapter<T>) new TypeAdapter<TrashWebLinkRestored>() {
           @Override
           public void write(JsonWriter out, TrashWebLinkRestored value) throws IOException {
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
           public TrashWebLinkRestored read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TrashWebLinkRestored instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TrashWebLinkRestored given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrashWebLinkRestored
  * @throws IOException if the JSON string is invalid with respect to TrashWebLinkRestored
  */
  public static TrashWebLinkRestored fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrashWebLinkRestored.class);
  }

 /**
  * Convert an instance of TrashWebLinkRestored to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

