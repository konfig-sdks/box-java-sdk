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
 * A list of endpoints for a chunked upload session.
 */
@ApiModel(description = "A list of endpoints for a chunked upload session.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SessionEndpoints {
  public static final String SERIALIZED_NAME_UPLOAD_PART = "upload_part";
  @SerializedName(SERIALIZED_NAME_UPLOAD_PART)
  private String uploadPart;

  public static final String SERIALIZED_NAME_COMMIT = "commit";
  @SerializedName(SERIALIZED_NAME_COMMIT)
  private String commit;

  public static final String SERIALIZED_NAME_ABORT = "abort";
  @SerializedName(SERIALIZED_NAME_ABORT)
  private String abort;

  public static final String SERIALIZED_NAME_LIST_PARTS = "list_parts";
  @SerializedName(SERIALIZED_NAME_LIST_PARTS)
  private String listParts;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_LOG_EVENT = "log_event";
  @SerializedName(SERIALIZED_NAME_LOG_EVENT)
  private String logEvent;

  public SessionEndpoints() {
  }

  public SessionEndpoints uploadPart(String uploadPart) {
    
    
    
    
    this.uploadPart = uploadPart;
    return this;
  }

   /**
   * The URL to upload parts to
   * @return uploadPart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://upload.box.com/api/2.0/files/upload_sessions/F971964745A5CD0C001BBE4E58196BFD", value = "The URL to upload parts to")

  public String getUploadPart() {
    return uploadPart;
  }


  public void setUploadPart(String uploadPart) {
    
    
    
    this.uploadPart = uploadPart;
  }


  public SessionEndpoints commit(String commit) {
    
    
    
    
    this.commit = commit;
    return this;
  }

   /**
   * The URL used to commit the file
   * @return commit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://upload.box.com/api/2.0/files/upload_sessions/F971964745A5CD0C001BBE4E58196BFD/commit", value = "The URL used to commit the file")

  public String getCommit() {
    return commit;
  }


  public void setCommit(String commit) {
    
    
    
    this.commit = commit;
  }


  public SessionEndpoints abort(String abort) {
    
    
    
    
    this.abort = abort;
    return this;
  }

   /**
   * The URL for used to abort the session.
   * @return abort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://upload.box.com/api/2.0/files/upload_sessions/F971964745A5CD0C001BBE4E58196BFD", value = "The URL for used to abort the session.")

  public String getAbort() {
    return abort;
  }


  public void setAbort(String abort) {
    
    
    
    this.abort = abort;
  }


  public SessionEndpoints listParts(String listParts) {
    
    
    
    
    this.listParts = listParts;
    return this;
  }

   /**
   * The URL users to list all parts.
   * @return listParts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://upload.box.com/api/2.0/files/upload_sessions/F971964745A5CD0C001BBE4E58196BFD/parts", value = "The URL users to list all parts.")

  public String getListParts() {
    return listParts;
  }


  public void setListParts(String listParts) {
    
    
    
    this.listParts = listParts;
  }


  public SessionEndpoints status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The URL used to get the status of the upload.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://upload.box.com/api/2.0/files/upload_sessions/F971964745A5CD0C001BBE4E58196BFD", value = "The URL used to get the status of the upload.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public SessionEndpoints logEvent(String logEvent) {
    
    
    
    
    this.logEvent = logEvent;
    return this;
  }

   /**
   * The URL used to get the upload log from.
   * @return logEvent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://upload.box.com/api/2.0/files/upload_sessions/F971964745A5CD0C001BBE4E58196BFD/log", value = "The URL used to get the upload log from.")

  public String getLogEvent() {
    return logEvent;
  }


  public void setLogEvent(String logEvent) {
    
    
    
    this.logEvent = logEvent;
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
   * @return the SessionEndpoints instance itself
   */
  public SessionEndpoints putAdditionalProperty(String key, Object value) {
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
    SessionEndpoints sessionEndpoints = (SessionEndpoints) o;
    return Objects.equals(this.uploadPart, sessionEndpoints.uploadPart) &&
        Objects.equals(this.commit, sessionEndpoints.commit) &&
        Objects.equals(this.abort, sessionEndpoints.abort) &&
        Objects.equals(this.listParts, sessionEndpoints.listParts) &&
        Objects.equals(this.status, sessionEndpoints.status) &&
        Objects.equals(this.logEvent, sessionEndpoints.logEvent)&&
        Objects.equals(this.additionalProperties, sessionEndpoints.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadPart, commit, abort, listParts, status, logEvent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionEndpoints {\n");
    sb.append("    uploadPart: ").append(toIndentedString(uploadPart)).append("\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    abort: ").append(toIndentedString(abort)).append("\n");
    sb.append("    listParts: ").append(toIndentedString(listParts)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    logEvent: ").append(toIndentedString(logEvent)).append("\n");
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
    openapiFields.add("upload_part");
    openapiFields.add("commit");
    openapiFields.add("abort");
    openapiFields.add("list_parts");
    openapiFields.add("status");
    openapiFields.add("log_event");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SessionEndpoints
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SessionEndpoints.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SessionEndpoints is not found in the empty JSON string", SessionEndpoints.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("upload_part") != null && !jsonObj.get("upload_part").isJsonNull()) && !jsonObj.get("upload_part").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upload_part` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upload_part").toString()));
      }
      if ((jsonObj.get("commit") != null && !jsonObj.get("commit").isJsonNull()) && !jsonObj.get("commit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit").toString()));
      }
      if ((jsonObj.get("abort") != null && !jsonObj.get("abort").isJsonNull()) && !jsonObj.get("abort").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `abort` to be a primitive type in the JSON string but got `%s`", jsonObj.get("abort").toString()));
      }
      if ((jsonObj.get("list_parts") != null && !jsonObj.get("list_parts").isJsonNull()) && !jsonObj.get("list_parts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_parts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_parts").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("log_event") != null && !jsonObj.get("log_event").isJsonNull()) && !jsonObj.get("log_event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `log_event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("log_event").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SessionEndpoints.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SessionEndpoints' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SessionEndpoints> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SessionEndpoints.class));

       return (TypeAdapter<T>) new TypeAdapter<SessionEndpoints>() {
           @Override
           public void write(JsonWriter out, SessionEndpoints value) throws IOException {
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
           public SessionEndpoints read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SessionEndpoints instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SessionEndpoints given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SessionEndpoints
  * @throws IOException if the JSON string is invalid with respect to SessionEndpoints
  */
  public static SessionEndpoints fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SessionEndpoints.class);
  }

 /**
  * Convert an instance of SessionEndpoints to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

