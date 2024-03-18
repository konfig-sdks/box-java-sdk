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
import com.konfigthis.client.model.FileRequestCopyRequestAllOfFolder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * The request body to copy a file request.
 */
@ApiModel(description = "The request body to copy a file request.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FileRequestCopyRequest {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * An optional new status of the file request.  When the status is set to &#x60;inactive&#x60;, the file request will no longer accept new submissions, and any visitor to the file request URL will receive a &#x60;HTTP 404&#x60; status code.  This will default to the value on the existing file request.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_IS_EMAIL_REQUIRED = "is_email_required";
  @SerializedName(SERIALIZED_NAME_IS_EMAIL_REQUIRED)
  private Boolean isEmailRequired;

  public static final String SERIALIZED_NAME_IS_DESCRIPTION_REQUIRED = "is_description_required";
  @SerializedName(SERIALIZED_NAME_IS_DESCRIPTION_REQUIRED)
  private Boolean isDescriptionRequired;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_FOLDER = "folder";
  @SerializedName(SERIALIZED_NAME_FOLDER)
  private FileRequestCopyRequestAllOfFolder folder;

  public FileRequestCopyRequest() {
  }

  public FileRequestCopyRequest title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * An optional new title for the file request. This can be used to change the title of the file request.  This will default to the value on the existing file request.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Please upload required documents", value = "An optional new title for the file request. This can be used to change the title of the file request.  This will default to the value on the existing file request.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public FileRequestCopyRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * An optional new description for the file request. This can be used to change the description of the file request.  This will default to the value on the existing file request.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Please upload required documents", value = "An optional new description for the file request. This can be used to change the description of the file request.  This will default to the value on the existing file request.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public FileRequestCopyRequest status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * An optional new status of the file request.  When the status is set to &#x60;inactive&#x60;, the file request will no longer accept new submissions, and any visitor to the file request URL will receive a &#x60;HTTP 404&#x60; status code.  This will default to the value on the existing file request.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACTIVE", value = "An optional new status of the file request.  When the status is set to `inactive`, the file request will no longer accept new submissions, and any visitor to the file request URL will receive a `HTTP 404` status code.  This will default to the value on the existing file request.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public FileRequestCopyRequest isEmailRequired(Boolean isEmailRequired) {
    
    
    
    
    this.isEmailRequired = isEmailRequired;
    return this;
  }

   /**
   * Whether a file request submitter is required to provide their email address.  When this setting is set to true, the Box UI will show an email field on the file request form.  This will default to the value on the existing file request.
   * @return isEmailRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether a file request submitter is required to provide their email address.  When this setting is set to true, the Box UI will show an email field on the file request form.  This will default to the value on the existing file request.")

  public Boolean getIsEmailRequired() {
    return isEmailRequired;
  }


  public void setIsEmailRequired(Boolean isEmailRequired) {
    
    
    
    this.isEmailRequired = isEmailRequired;
  }


  public FileRequestCopyRequest isDescriptionRequired(Boolean isDescriptionRequired) {
    
    
    
    
    this.isDescriptionRequired = isDescriptionRequired;
    return this;
  }

   /**
   * Whether a file request submitter is required to provide a description of the files they are submitting.  When this setting is set to true, the Box UI will show a description field on the file request form.  This will default to the value on the existing file request.
   * @return isDescriptionRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether a file request submitter is required to provide a description of the files they are submitting.  When this setting is set to true, the Box UI will show a description field on the file request form.  This will default to the value on the existing file request.")

  public Boolean getIsDescriptionRequired() {
    return isDescriptionRequired;
  }


  public void setIsDescriptionRequired(Boolean isDescriptionRequired) {
    
    
    
    this.isDescriptionRequired = isDescriptionRequired;
  }


  public FileRequestCopyRequest expiresAt(OffsetDateTime expiresAt) {
    
    
    
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The date after which a file request will no longer accept new submissions.  After this date, the &#x60;status&#x60; will automatically be set to &#x60;inactive&#x60;.  This will default to the value on the existing file request.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-09-28T10:53:43-08:00", value = "The date after which a file request will no longer accept new submissions.  After this date, the `status` will automatically be set to `inactive`.  This will default to the value on the existing file request.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    
    
    
    this.expiresAt = expiresAt;
  }


  public FileRequestCopyRequest folder(FileRequestCopyRequestAllOfFolder folder) {
    
    
    
    
    this.folder = folder;
    return this;
  }

   /**
   * Get folder
   * @return folder
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FileRequestCopyRequestAllOfFolder getFolder() {
    return folder;
  }


  public void setFolder(FileRequestCopyRequestAllOfFolder folder) {
    
    
    
    this.folder = folder;
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
   * @return the FileRequestCopyRequest instance itself
   */
  public FileRequestCopyRequest putAdditionalProperty(String key, Object value) {
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
    FileRequestCopyRequest fileRequestCopyRequest = (FileRequestCopyRequest) o;
    return Objects.equals(this.title, fileRequestCopyRequest.title) &&
        Objects.equals(this.description, fileRequestCopyRequest.description) &&
        Objects.equals(this.status, fileRequestCopyRequest.status) &&
        Objects.equals(this.isEmailRequired, fileRequestCopyRequest.isEmailRequired) &&
        Objects.equals(this.isDescriptionRequired, fileRequestCopyRequest.isDescriptionRequired) &&
        Objects.equals(this.expiresAt, fileRequestCopyRequest.expiresAt) &&
        Objects.equals(this.folder, fileRequestCopyRequest.folder)&&
        Objects.equals(this.additionalProperties, fileRequestCopyRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, status, isEmailRequired, isDescriptionRequired, expiresAt, folder, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileRequestCopyRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isEmailRequired: ").append(toIndentedString(isEmailRequired)).append("\n");
    sb.append("    isDescriptionRequired: ").append(toIndentedString(isDescriptionRequired)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("status");
    openapiFields.add("is_email_required");
    openapiFields.add("is_description_required");
    openapiFields.add("expires_at");
    openapiFields.add("folder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("folder");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FileRequestCopyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FileRequestCopyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileRequestCopyRequest is not found in the empty JSON string", FileRequestCopyRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FileRequestCopyRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `folder`
      FileRequestCopyRequestAllOfFolder.validateJsonObject(jsonObj.getAsJsonObject("folder"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileRequestCopyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileRequestCopyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileRequestCopyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileRequestCopyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FileRequestCopyRequest>() {
           @Override
           public void write(JsonWriter out, FileRequestCopyRequest value) throws IOException {
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
           public FileRequestCopyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FileRequestCopyRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FileRequestCopyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileRequestCopyRequest
  * @throws IOException if the JSON string is invalid with respect to FileRequestCopyRequest
  */
  public static FileRequestCopyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileRequestCopyRequest.class);
  }

 /**
  * Convert an instance of FileRequestCopyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

