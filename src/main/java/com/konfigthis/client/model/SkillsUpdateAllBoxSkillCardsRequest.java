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
import com.konfigthis.client.model.SkillsUpdateAllBoxSkillCardsRequestFile;
import com.konfigthis.client.model.SkillsUpdateAllBoxSkillCardsRequestFileVersion;
import com.konfigthis.client.model.SkillsUpdateAllBoxSkillCardsRequestMetadata;
import com.konfigthis.client.model.SkillsUpdateAllBoxSkillCardsRequestUsage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * SkillsUpdateAllBoxSkillCardsRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SkillsUpdateAllBoxSkillCardsRequest {
  /**
   * Defines the status of this invocation. Set this to &#x60;success&#x60; when setting Skill cards.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    INVOKED("invoked"),
    
    PROCESSING("processing"),
    
    SUCCESS("success"),
    
    TRANSIENT_FAILURE("transient_failure"),
    
    PERMANENT_FAILURE("permanent_failure");

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

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private SkillsUpdateAllBoxSkillCardsRequestMetadata metadata;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private SkillsUpdateAllBoxSkillCardsRequestFile _file;

  public static final String SERIALIZED_NAME_FILE_VERSION = "file_version";
  @SerializedName(SERIALIZED_NAME_FILE_VERSION)
  private SkillsUpdateAllBoxSkillCardsRequestFileVersion fileVersion;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private SkillsUpdateAllBoxSkillCardsRequestUsage usage;

  public SkillsUpdateAllBoxSkillCardsRequest() {
  }

  public SkillsUpdateAllBoxSkillCardsRequest status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Defines the status of this invocation. Set this to &#x60;success&#x60; when setting Skill cards.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SUCCESS", required = true, value = "Defines the status of this invocation. Set this to `success` when setting Skill cards.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public SkillsUpdateAllBoxSkillCardsRequest metadata(SkillsUpdateAllBoxSkillCardsRequestMetadata metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SkillsUpdateAllBoxSkillCardsRequestMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(SkillsUpdateAllBoxSkillCardsRequestMetadata metadata) {
    
    
    
    this.metadata = metadata;
  }


  public SkillsUpdateAllBoxSkillCardsRequest _file(SkillsUpdateAllBoxSkillCardsRequestFile _file) {
    
    
    
    
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SkillsUpdateAllBoxSkillCardsRequestFile getFile() {
    return _file;
  }


  public void setFile(SkillsUpdateAllBoxSkillCardsRequestFile _file) {
    
    
    
    this._file = _file;
  }


  public SkillsUpdateAllBoxSkillCardsRequest fileVersion(SkillsUpdateAllBoxSkillCardsRequestFileVersion fileVersion) {
    
    
    
    
    this.fileVersion = fileVersion;
    return this;
  }

   /**
   * Get fileVersion
   * @return fileVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SkillsUpdateAllBoxSkillCardsRequestFileVersion getFileVersion() {
    return fileVersion;
  }


  public void setFileVersion(SkillsUpdateAllBoxSkillCardsRequestFileVersion fileVersion) {
    
    
    
    this.fileVersion = fileVersion;
  }


  public SkillsUpdateAllBoxSkillCardsRequest usage(SkillsUpdateAllBoxSkillCardsRequestUsage usage) {
    
    
    
    
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SkillsUpdateAllBoxSkillCardsRequestUsage getUsage() {
    return usage;
  }


  public void setUsage(SkillsUpdateAllBoxSkillCardsRequestUsage usage) {
    
    
    
    this.usage = usage;
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
   * @return the SkillsUpdateAllBoxSkillCardsRequest instance itself
   */
  public SkillsUpdateAllBoxSkillCardsRequest putAdditionalProperty(String key, Object value) {
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
    SkillsUpdateAllBoxSkillCardsRequest skillsUpdateAllBoxSkillCardsRequest = (SkillsUpdateAllBoxSkillCardsRequest) o;
    return Objects.equals(this.status, skillsUpdateAllBoxSkillCardsRequest.status) &&
        Objects.equals(this.metadata, skillsUpdateAllBoxSkillCardsRequest.metadata) &&
        Objects.equals(this._file, skillsUpdateAllBoxSkillCardsRequest._file) &&
        Objects.equals(this.fileVersion, skillsUpdateAllBoxSkillCardsRequest.fileVersion) &&
        Objects.equals(this.usage, skillsUpdateAllBoxSkillCardsRequest.usage)&&
        Objects.equals(this.additionalProperties, skillsUpdateAllBoxSkillCardsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, metadata, _file, fileVersion, usage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillsUpdateAllBoxSkillCardsRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    fileVersion: ").append(toIndentedString(fileVersion)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("metadata");
    openapiFields.add("file");
    openapiFields.add("file_version");
    openapiFields.add("usage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("file");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkillsUpdateAllBoxSkillCardsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SkillsUpdateAllBoxSkillCardsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkillsUpdateAllBoxSkillCardsRequest is not found in the empty JSON string", SkillsUpdateAllBoxSkillCardsRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SkillsUpdateAllBoxSkillCardsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `metadata`
      SkillsUpdateAllBoxSkillCardsRequestMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      // validate the required field `file`
      SkillsUpdateAllBoxSkillCardsRequestFile.validateJsonObject(jsonObj.getAsJsonObject("file"));
      // validate the optional field `file_version`
      if (jsonObj.get("file_version") != null && !jsonObj.get("file_version").isJsonNull()) {
        SkillsUpdateAllBoxSkillCardsRequestFileVersion.validateJsonObject(jsonObj.getAsJsonObject("file_version"));
      }
      // validate the optional field `usage`
      if (jsonObj.get("usage") != null && !jsonObj.get("usage").isJsonNull()) {
        SkillsUpdateAllBoxSkillCardsRequestUsage.validateJsonObject(jsonObj.getAsJsonObject("usage"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkillsUpdateAllBoxSkillCardsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkillsUpdateAllBoxSkillCardsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkillsUpdateAllBoxSkillCardsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkillsUpdateAllBoxSkillCardsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SkillsUpdateAllBoxSkillCardsRequest>() {
           @Override
           public void write(JsonWriter out, SkillsUpdateAllBoxSkillCardsRequest value) throws IOException {
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
           public SkillsUpdateAllBoxSkillCardsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SkillsUpdateAllBoxSkillCardsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SkillsUpdateAllBoxSkillCardsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkillsUpdateAllBoxSkillCardsRequest
  * @throws IOException if the JSON string is invalid with respect to SkillsUpdateAllBoxSkillCardsRequest
  */
  public static SkillsUpdateAllBoxSkillCardsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkillsUpdateAllBoxSkillCardsRequest.class);
  }

 /**
  * Convert an instance of SkillsUpdateAllBoxSkillCardsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

