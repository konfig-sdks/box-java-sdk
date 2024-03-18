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
import com.konfigthis.client.model.UploadSessionSessionEndpoints;
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
 * An upload session for chunk uploading a file.
 */
@ApiModel(description = "An upload session for chunk uploading a file.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UploadSession {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * &#x60;upload_session&#x60;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    UPLOAD_SESSION("upload_session");

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

  public static final String SERIALIZED_NAME_SESSION_EXPIRES_AT = "session_expires_at";
  @SerializedName(SERIALIZED_NAME_SESSION_EXPIRES_AT)
  private OffsetDateTime sessionExpiresAt;

  public static final String SERIALIZED_NAME_PART_SIZE = "part_size";
  @SerializedName(SERIALIZED_NAME_PART_SIZE)
  private Long partSize;

  public static final String SERIALIZED_NAME_TOTAL_PARTS = "total_parts";
  @SerializedName(SERIALIZED_NAME_TOTAL_PARTS)
  private Integer totalParts;

  public static final String SERIALIZED_NAME_NUM_PARTS_PROCESSED = "num_parts_processed";
  @SerializedName(SERIALIZED_NAME_NUM_PARTS_PROCESSED)
  private Integer numPartsProcessed;

  public static final String SERIALIZED_NAME_SESSION_ENDPOINTS = "session_endpoints";
  @SerializedName(SERIALIZED_NAME_SESSION_ENDPOINTS)
  private UploadSessionSessionEndpoints sessionEndpoints;

  public UploadSession() {
  }

  public UploadSession id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for this session
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "F971964745A5CD0C001BBE4E58196BFD", value = "The unique identifier for this session")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public UploadSession type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;upload_session&#x60;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UPLOAD_SESSION", value = "`upload_session`")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public UploadSession sessionExpiresAt(OffsetDateTime sessionExpiresAt) {
    
    
    
    
    this.sessionExpiresAt = sessionExpiresAt;
    return this;
  }

   /**
   * The date and time when this session expires.
   * @return sessionExpiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "The date and time when this session expires.")

  public OffsetDateTime getSessionExpiresAt() {
    return sessionExpiresAt;
  }


  public void setSessionExpiresAt(OffsetDateTime sessionExpiresAt) {
    
    
    
    this.sessionExpiresAt = sessionExpiresAt;
  }


  public UploadSession partSize(Long partSize) {
    
    
    
    
    this.partSize = partSize;
    return this;
  }

   /**
   * The  size in bytes that must be used for all parts of of the upload.  Only the last part is allowed to be of a smaller size.
   * @return partSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1024", value = "The  size in bytes that must be used for all parts of of the upload.  Only the last part is allowed to be of a smaller size.")

  public Long getPartSize() {
    return partSize;
  }


  public void setPartSize(Long partSize) {
    
    
    
    this.partSize = partSize;
  }


  public UploadSession totalParts(Integer totalParts) {
    
    
    
    
    this.totalParts = totalParts;
    return this;
  }

   /**
   * The total number of parts expected in this upload session, as determined by the file size and part size.
   * @return totalParts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "The total number of parts expected in this upload session, as determined by the file size and part size.")

  public Integer getTotalParts() {
    return totalParts;
  }


  public void setTotalParts(Integer totalParts) {
    
    
    
    this.totalParts = totalParts;
  }


  public UploadSession numPartsProcessed(Integer numPartsProcessed) {
    
    
    
    
    this.numPartsProcessed = numPartsProcessed;
    return this;
  }

   /**
   * The number of parts that have been uploaded and processed by the server. This starts at &#x60;0&#x60;.  When committing a file files, inspecting this property can provide insight if all parts have been uploaded correctly.
   * @return numPartsProcessed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "455", value = "The number of parts that have been uploaded and processed by the server. This starts at `0`.  When committing a file files, inspecting this property can provide insight if all parts have been uploaded correctly.")

  public Integer getNumPartsProcessed() {
    return numPartsProcessed;
  }


  public void setNumPartsProcessed(Integer numPartsProcessed) {
    
    
    
    this.numPartsProcessed = numPartsProcessed;
  }


  public UploadSession sessionEndpoints(UploadSessionSessionEndpoints sessionEndpoints) {
    
    
    
    
    this.sessionEndpoints = sessionEndpoints;
    return this;
  }

   /**
   * Get sessionEndpoints
   * @return sessionEndpoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UploadSessionSessionEndpoints getSessionEndpoints() {
    return sessionEndpoints;
  }


  public void setSessionEndpoints(UploadSessionSessionEndpoints sessionEndpoints) {
    
    
    
    this.sessionEndpoints = sessionEndpoints;
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
   * @return the UploadSession instance itself
   */
  public UploadSession putAdditionalProperty(String key, Object value) {
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
    UploadSession uploadSession = (UploadSession) o;
    return Objects.equals(this.id, uploadSession.id) &&
        Objects.equals(this.type, uploadSession.type) &&
        Objects.equals(this.sessionExpiresAt, uploadSession.sessionExpiresAt) &&
        Objects.equals(this.partSize, uploadSession.partSize) &&
        Objects.equals(this.totalParts, uploadSession.totalParts) &&
        Objects.equals(this.numPartsProcessed, uploadSession.numPartsProcessed) &&
        Objects.equals(this.sessionEndpoints, uploadSession.sessionEndpoints)&&
        Objects.equals(this.additionalProperties, uploadSession.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, sessionExpiresAt, partSize, totalParts, numPartsProcessed, sessionEndpoints, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadSession {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sessionExpiresAt: ").append(toIndentedString(sessionExpiresAt)).append("\n");
    sb.append("    partSize: ").append(toIndentedString(partSize)).append("\n");
    sb.append("    totalParts: ").append(toIndentedString(totalParts)).append("\n");
    sb.append("    numPartsProcessed: ").append(toIndentedString(numPartsProcessed)).append("\n");
    sb.append("    sessionEndpoints: ").append(toIndentedString(sessionEndpoints)).append("\n");
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
    openapiFields.add("session_expires_at");
    openapiFields.add("part_size");
    openapiFields.add("total_parts");
    openapiFields.add("num_parts_processed");
    openapiFields.add("session_endpoints");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UploadSession
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UploadSession.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadSession is not found in the empty JSON string", UploadSession.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `session_endpoints`
      if (jsonObj.get("session_endpoints") != null && !jsonObj.get("session_endpoints").isJsonNull()) {
        UploadSessionSessionEndpoints.validateJsonObject(jsonObj.getAsJsonObject("session_endpoints"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadSession.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadSession' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadSession> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadSession.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadSession>() {
           @Override
           public void write(JsonWriter out, UploadSession value) throws IOException {
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
           public UploadSession read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UploadSession instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UploadSession given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadSession
  * @throws IOException if the JSON string is invalid with respect to UploadSession
  */
  public static UploadSession fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadSession.class);
  }

 /**
  * Convert an instance of UploadSession to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

