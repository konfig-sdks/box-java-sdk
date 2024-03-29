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
import com.konfigthis.client.model.FolderMini;
import com.konfigthis.client.model.UserMini;
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
 * WebLinkAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebLinkAllOf {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private FolderMini parent;

  public static final String SERIALIZED_NAME_PATH_COLLECTION = "path_collection";
  @SerializedName(SERIALIZED_NAME_PATH_COLLECTION)
  private Object pathCollection;

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

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UserMini createdBy;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modified_by";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private UserMini modifiedBy;

  public static final String SERIALIZED_NAME_OWNED_BY = "owned_by";
  @SerializedName(SERIALIZED_NAME_OWNED_BY)
  private UserMini ownedBy;

  public static final String SERIALIZED_NAME_SHARED_LINK = "shared_link";
  @SerializedName(SERIALIZED_NAME_SHARED_LINK)
  private Object sharedLink;

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

  public WebLinkAllOf() {
  }

  public WebLinkAllOf description(String description) {
    
    
    
    
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


  public WebLinkAllOf parent(FolderMini parent) {
    
    
    
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FolderMini getParent() {
    return parent;
  }


  public void setParent(FolderMini parent) {
    
    
    
    this.parent = parent;
  }


  public WebLinkAllOf pathCollection(Object pathCollection) {
    
    
    
    
    this.pathCollection = pathCollection;
    return this;
  }

   /**
   * Get pathCollection
   * @return pathCollection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPathCollection() {
    return pathCollection;
  }


  public void setPathCollection(Object pathCollection) {
    
    
    
    this.pathCollection = pathCollection;
  }


  public WebLinkAllOf createdAt(OffsetDateTime createdAt) {
    
    
    
    
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


  public WebLinkAllOf modifiedAt(OffsetDateTime modifiedAt) {
    
    
    
    
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


  public WebLinkAllOf trashedAt(OffsetDateTime trashedAt) {
    
    
    
    
    this.trashedAt = trashedAt;
    return this;
  }

   /**
   * When this file was moved to the trash.
   * @return trashedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When this file was moved to the trash.")

  public OffsetDateTime getTrashedAt() {
    return trashedAt;
  }


  public void setTrashedAt(OffsetDateTime trashedAt) {
    
    
    
    this.trashedAt = trashedAt;
  }


  public WebLinkAllOf purgedAt(OffsetDateTime purgedAt) {
    
    
    
    
    this.purgedAt = purgedAt;
    return this;
  }

   /**
   * When this file will be permanently deleted.
   * @return purgedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When this file will be permanently deleted.")

  public OffsetDateTime getPurgedAt() {
    return purgedAt;
  }


  public void setPurgedAt(OffsetDateTime purgedAt) {
    
    
    
    this.purgedAt = purgedAt;
  }


  public WebLinkAllOf createdBy(UserMini createdBy) {
    
    
    
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserMini getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(UserMini createdBy) {
    
    
    
    this.createdBy = createdBy;
  }


  public WebLinkAllOf modifiedBy(UserMini modifiedBy) {
    
    
    
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserMini getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(UserMini modifiedBy) {
    
    
    
    this.modifiedBy = modifiedBy;
  }


  public WebLinkAllOf ownedBy(UserMini ownedBy) {
    
    
    
    
    this.ownedBy = ownedBy;
    return this;
  }

   /**
   * Get ownedBy
   * @return ownedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserMini getOwnedBy() {
    return ownedBy;
  }


  public void setOwnedBy(UserMini ownedBy) {
    
    
    
    this.ownedBy = ownedBy;
  }


  public WebLinkAllOf sharedLink(Object sharedLink) {
    
    
    
    
    this.sharedLink = sharedLink;
    return this;
  }

   /**
   * Get sharedLink
   * @return sharedLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSharedLink() {
    return sharedLink;
  }


  public void setSharedLink(Object sharedLink) {
    
    
    
    this.sharedLink = sharedLink;
  }


  public WebLinkAllOf itemStatus(ItemStatusEnum itemStatus) {
    
    
    
    
    this.itemStatus = itemStatus;
    return this;
  }

   /**
   * Whether this item is deleted or not. Values include &#x60;active&#x60;, &#x60;trashed&#x60; if the file has been moved to the trash, and &#x60;deleted&#x60; if the file has been permanently deleted
   * @return itemStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACTIVE", value = "Whether this item is deleted or not. Values include `active`, `trashed` if the file has been moved to the trash, and `deleted` if the file has been permanently deleted")

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
   * @return the WebLinkAllOf instance itself
   */
  public WebLinkAllOf putAdditionalProperty(String key, Object value) {
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
    WebLinkAllOf webLinkAllOf = (WebLinkAllOf) o;
    return Objects.equals(this.description, webLinkAllOf.description) &&
        Objects.equals(this.parent, webLinkAllOf.parent) &&
        Objects.equals(this.pathCollection, webLinkAllOf.pathCollection) &&
        Objects.equals(this.createdAt, webLinkAllOf.createdAt) &&
        Objects.equals(this.modifiedAt, webLinkAllOf.modifiedAt) &&
        Objects.equals(this.trashedAt, webLinkAllOf.trashedAt) &&
        Objects.equals(this.purgedAt, webLinkAllOf.purgedAt) &&
        Objects.equals(this.createdBy, webLinkAllOf.createdBy) &&
        Objects.equals(this.modifiedBy, webLinkAllOf.modifiedBy) &&
        Objects.equals(this.ownedBy, webLinkAllOf.ownedBy) &&
        Objects.equals(this.sharedLink, webLinkAllOf.sharedLink) &&
        Objects.equals(this.itemStatus, webLinkAllOf.itemStatus)&&
        Objects.equals(this.additionalProperties, webLinkAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, parent, pathCollection, createdAt, modifiedAt, trashedAt, purgedAt, createdBy, modifiedBy, ownedBy, sharedLink, itemStatus, additionalProperties);
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
    sb.append("class WebLinkAllOf {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebLinkAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebLinkAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebLinkAllOf is not found in the empty JSON string", WebLinkAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `parent`
      if (jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonNull()) {
        FolderMini.validateJsonObject(jsonObj.getAsJsonObject("parent"));
      }
      // validate the optional field `path_collection`
      if (jsonObj.get("path_collection") != null && !jsonObj.get("path_collection").isJsonNull()) {
        Object.validateJsonObject(jsonObj.getAsJsonObject("path_collection"));
      }
      // validate the optional field `created_by`
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) {
        UserMini.validateJsonObject(jsonObj.getAsJsonObject("created_by"));
      }
      // validate the optional field `modified_by`
      if (jsonObj.get("modified_by") != null && !jsonObj.get("modified_by").isJsonNull()) {
        UserMini.validateJsonObject(jsonObj.getAsJsonObject("modified_by"));
      }
      // validate the optional field `owned_by`
      if (jsonObj.get("owned_by") != null && !jsonObj.get("owned_by").isJsonNull()) {
        UserMini.validateJsonObject(jsonObj.getAsJsonObject("owned_by"));
      }
      // validate the optional field `shared_link`
      if (jsonObj.get("shared_link") != null && !jsonObj.get("shared_link").isJsonNull()) {
        Object.validateJsonObject(jsonObj.getAsJsonObject("shared_link"));
      }
      if ((jsonObj.get("item_status") != null && !jsonObj.get("item_status").isJsonNull()) && !jsonObj.get("item_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebLinkAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebLinkAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebLinkAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebLinkAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<WebLinkAllOf>() {
           @Override
           public void write(JsonWriter out, WebLinkAllOf value) throws IOException {
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
           public WebLinkAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebLinkAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebLinkAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebLinkAllOf
  * @throws IOException if the JSON string is invalid with respect to WebLinkAllOf
  */
  public static WebLinkAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebLinkAllOf.class);
  }

 /**
  * Convert an instance of WebLinkAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

