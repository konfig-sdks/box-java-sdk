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
 * A full representation of a file version, as can be returned from any file version API endpoints by default
 */
@ApiModel(description = "A full representation of a file version, as can be returned from any file version API endpoints by default")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FileVersionFull {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * &#x60;file_version&#x60;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    FILE_VERSION("file_version");

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

  public static final String SERIALIZED_NAME_SHA1 = "sha1";
  @SerializedName(SERIALIZED_NAME_SHA1)
  private String sha1;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_MODIFIED_AT = "modified_at";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT)
  private OffsetDateTime modifiedAt;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modified_by";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private UserMini modifiedBy;

  public static final String SERIALIZED_NAME_TRASHED_AT = "trashed_at";
  @SerializedName(SERIALIZED_NAME_TRASHED_AT)
  private OffsetDateTime trashedAt;

  public static final String SERIALIZED_NAME_TRASHED_BY = "trashed_by";
  @SerializedName(SERIALIZED_NAME_TRASHED_BY)
  private UserMini trashedBy;

  public static final String SERIALIZED_NAME_RESTORED_AT = "restored_at";
  @SerializedName(SERIALIZED_NAME_RESTORED_AT)
  private OffsetDateTime restoredAt;

  public static final String SERIALIZED_NAME_RESTORED_BY = "restored_by";
  @SerializedName(SERIALIZED_NAME_RESTORED_BY)
  private UserMini restoredBy;

  public static final String SERIALIZED_NAME_PURGED_AT = "purged_at";
  @SerializedName(SERIALIZED_NAME_PURGED_AT)
  private OffsetDateTime purgedAt;

  public static final String SERIALIZED_NAME_UPLOADER_DISPLAY_NAME = "uploader_display_name";
  @SerializedName(SERIALIZED_NAME_UPLOADER_DISPLAY_NAME)
  private String uploaderDisplayName;

  public static final String SERIALIZED_NAME_VERSION_NUMBER = "version_number";
  @SerializedName(SERIALIZED_NAME_VERSION_NUMBER)
  private String versionNumber;

  public FileVersionFull() {
  }

  public FileVersionFull id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier that represent a file version.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12345", required = true, value = "The unique identifier that represent a file version.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public FileVersionFull type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;file_version&#x60;
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "FILE_VERSION", required = true, value = "`file_version`")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public FileVersionFull sha1(String sha1) {
    
    
    
    
    this.sha1 = sha1;
    return this;
  }

   /**
   * The SHA1 hash of this version of the file.
   * @return sha1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "134b65991ed521fcfe4724b7d814ab8ded5185dc", value = "The SHA1 hash of this version of the file.")

  public String getSha1() {
    return sha1;
  }


  public void setSha1(String sha1) {
    
    
    
    this.sha1 = sha1;
  }


  public FileVersionFull name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the file version
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tigers.jpeg", value = "The name of the file version")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public FileVersionFull size(Long size) {
    
    
    
    
    this.size = size;
    return this;
  }

   /**
   * Size of the file version in bytes
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "629644", value = "Size of the file version in bytes")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    
    
    
    this.size = size;
  }


  public FileVersionFull createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When the file version object was created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When the file version object was created")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public FileVersionFull modifiedAt(OffsetDateTime modifiedAt) {
    
    
    
    
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * When the file version object was last updated
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When the file version object was last updated")

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }


  public void setModifiedAt(OffsetDateTime modifiedAt) {
    
    
    
    this.modifiedAt = modifiedAt;
  }


  public FileVersionFull modifiedBy(UserMini modifiedBy) {
    
    
    
    
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


  public FileVersionFull trashedAt(OffsetDateTime trashedAt) {
    
    
    
    
    this.trashedAt = trashedAt;
    return this;
  }

   /**
   * When the file version object was trashed.
   * @return trashedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When the file version object was trashed.")

  public OffsetDateTime getTrashedAt() {
    return trashedAt;
  }


  public void setTrashedAt(OffsetDateTime trashedAt) {
    
    
    
    this.trashedAt = trashedAt;
  }


  public FileVersionFull trashedBy(UserMini trashedBy) {
    
    
    
    
    this.trashedBy = trashedBy;
    return this;
  }

   /**
   * Get trashedBy
   * @return trashedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserMini getTrashedBy() {
    return trashedBy;
  }


  public void setTrashedBy(UserMini trashedBy) {
    
    
    
    this.trashedBy = trashedBy;
  }


  public FileVersionFull restoredAt(OffsetDateTime restoredAt) {
    
    
    
    
    this.restoredAt = restoredAt;
    return this;
  }

   /**
   * When the file version was restored from the trash.
   * @return restoredAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When the file version was restored from the trash.")

  public OffsetDateTime getRestoredAt() {
    return restoredAt;
  }


  public void setRestoredAt(OffsetDateTime restoredAt) {
    
    
    
    this.restoredAt = restoredAt;
  }


  public FileVersionFull restoredBy(UserMini restoredBy) {
    
    
    
    
    this.restoredBy = restoredBy;
    return this;
  }

   /**
   * Get restoredBy
   * @return restoredBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserMini getRestoredBy() {
    return restoredBy;
  }


  public void setRestoredBy(UserMini restoredBy) {
    
    
    
    this.restoredBy = restoredBy;
  }


  public FileVersionFull purgedAt(OffsetDateTime purgedAt) {
    
    
    
    
    this.purgedAt = purgedAt;
    return this;
  }

   /**
   * When the file version object will be permanently deleted.
   * @return purgedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When the file version object will be permanently deleted.")

  public OffsetDateTime getPurgedAt() {
    return purgedAt;
  }


  public void setPurgedAt(OffsetDateTime purgedAt) {
    
    
    
    this.purgedAt = purgedAt;
  }


  public FileVersionFull uploaderDisplayName(String uploaderDisplayName) {
    
    
    
    
    this.uploaderDisplayName = uploaderDisplayName;
    return this;
  }

   /**
   * Get uploaderDisplayName
   * @return uploaderDisplayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUploaderDisplayName() {
    return uploaderDisplayName;
  }


  public void setUploaderDisplayName(String uploaderDisplayName) {
    
    
    
    this.uploaderDisplayName = uploaderDisplayName;
  }


  public FileVersionFull versionNumber(String versionNumber) {
    
    
    
    
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * The version number of this file version
   * @return versionNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The version number of this file version")

  public String getVersionNumber() {
    return versionNumber;
  }


  public void setVersionNumber(String versionNumber) {
    
    
    
    this.versionNumber = versionNumber;
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
   * @return the FileVersionFull instance itself
   */
  public FileVersionFull putAdditionalProperty(String key, Object value) {
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
    FileVersionFull fileVersionFull = (FileVersionFull) o;
    return Objects.equals(this.id, fileVersionFull.id) &&
        Objects.equals(this.type, fileVersionFull.type) &&
        Objects.equals(this.sha1, fileVersionFull.sha1) &&
        Objects.equals(this.name, fileVersionFull.name) &&
        Objects.equals(this.size, fileVersionFull.size) &&
        Objects.equals(this.createdAt, fileVersionFull.createdAt) &&
        Objects.equals(this.modifiedAt, fileVersionFull.modifiedAt) &&
        Objects.equals(this.modifiedBy, fileVersionFull.modifiedBy) &&
        Objects.equals(this.trashedAt, fileVersionFull.trashedAt) &&
        Objects.equals(this.trashedBy, fileVersionFull.trashedBy) &&
        Objects.equals(this.restoredAt, fileVersionFull.restoredAt) &&
        Objects.equals(this.restoredBy, fileVersionFull.restoredBy) &&
        Objects.equals(this.purgedAt, fileVersionFull.purgedAt) &&
        Objects.equals(this.uploaderDisplayName, fileVersionFull.uploaderDisplayName) &&
        Objects.equals(this.versionNumber, fileVersionFull.versionNumber)&&
        Objects.equals(this.additionalProperties, fileVersionFull.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, sha1, name, size, createdAt, modifiedAt, modifiedBy, trashedAt, trashedBy, restoredAt, restoredBy, purgedAt, uploaderDisplayName, versionNumber, additionalProperties);
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
    sb.append("class FileVersionFull {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    trashedAt: ").append(toIndentedString(trashedAt)).append("\n");
    sb.append("    trashedBy: ").append(toIndentedString(trashedBy)).append("\n");
    sb.append("    restoredAt: ").append(toIndentedString(restoredAt)).append("\n");
    sb.append("    restoredBy: ").append(toIndentedString(restoredBy)).append("\n");
    sb.append("    purgedAt: ").append(toIndentedString(purgedAt)).append("\n");
    sb.append("    uploaderDisplayName: ").append(toIndentedString(uploaderDisplayName)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("sha1");
    openapiFields.add("name");
    openapiFields.add("size");
    openapiFields.add("created_at");
    openapiFields.add("modified_at");
    openapiFields.add("modified_by");
    openapiFields.add("trashed_at");
    openapiFields.add("trashed_by");
    openapiFields.add("restored_at");
    openapiFields.add("restored_by");
    openapiFields.add("purged_at");
    openapiFields.add("uploader_display_name");
    openapiFields.add("version_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FileVersionFull
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FileVersionFull.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileVersionFull is not found in the empty JSON string", FileVersionFull.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FileVersionFull.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("sha1") != null && !jsonObj.get("sha1").isJsonNull()) && !jsonObj.get("sha1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha1").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `modified_by`
      if (jsonObj.get("modified_by") != null && !jsonObj.get("modified_by").isJsonNull()) {
        UserMini.validateJsonObject(jsonObj.getAsJsonObject("modified_by"));
      }
      // validate the optional field `trashed_by`
      if (jsonObj.get("trashed_by") != null && !jsonObj.get("trashed_by").isJsonNull()) {
        UserMini.validateJsonObject(jsonObj.getAsJsonObject("trashed_by"));
      }
      // validate the optional field `restored_by`
      if (jsonObj.get("restored_by") != null && !jsonObj.get("restored_by").isJsonNull()) {
        UserMini.validateJsonObject(jsonObj.getAsJsonObject("restored_by"));
      }
      // validate the optional field `uploader_display_name`
      if (jsonObj.get("uploader_display_name") != null && !jsonObj.get("uploader_display_name").isJsonNull()) {
        String.validateJsonObject(jsonObj.getAsJsonObject("uploader_display_name"));
      }
      if ((jsonObj.get("version_number") != null && !jsonObj.get("version_number").isJsonNull()) && !jsonObj.get("version_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVersionFull.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVersionFull' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVersionFull> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVersionFull.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVersionFull>() {
           @Override
           public void write(JsonWriter out, FileVersionFull value) throws IOException {
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
           public FileVersionFull read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FileVersionFull instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FileVersionFull given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVersionFull
  * @throws IOException if the JSON string is invalid with respect to FileVersionFull
  */
  public static FileVersionFull fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVersionFull.class);
  }

 /**
  * Convert an instance of FileVersionFull to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

