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
import com.konfigthis.client.model.EventCreatedBy;
import com.konfigthis.client.model.EventSource;
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
 * SkillInvocationEvent
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SkillInvocationEvent {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_RECORDED_AT = "recorded_at";
  @SerializedName(SERIALIZED_NAME_RECORDED_AT)
  private OffsetDateTime recordedAt;

  public static final String SERIALIZED_NAME_EVENT_ID = "event_id";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private String eventId;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private EventCreatedBy createdBy;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_SESSION_ID = "session_id";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private EventSource source;

  public static final String SERIALIZED_NAME_ADDITIONAL_DETAILS = "additional_details";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DETAILS)
  private Object additionalDetails;

  public SkillInvocationEvent() {
  }

  public SkillInvocationEvent type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;event&#x60;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "event", value = "`event`")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public SkillInvocationEvent createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When the event object was created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-12-12T10:53:43-08:00", value = "When the event object was created")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public SkillInvocationEvent recordedAt(OffsetDateTime recordedAt) {
    
    
    
    
    this.recordedAt = recordedAt;
    return this;
  }

   /**
   * When the event object was recorded in database
   * @return recordedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-12-12T10:54:43-08:00", value = "When the event object was recorded in database")

  public OffsetDateTime getRecordedAt() {
    return recordedAt;
  }


  public void setRecordedAt(OffsetDateTime recordedAt) {
    
    
    
    this.recordedAt = recordedAt;
  }


  public SkillInvocationEvent eventId(String eventId) {
    
    
    
    
    this.eventId = eventId;
    return this;
  }

   /**
   * The ID of the event object. You can use this to detect duplicate events
   * @return eventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f82c3ba03e41f7e8a7608363cc6c0390183c3f83", value = "The ID of the event object. You can use this to detect duplicate events")

  public String getEventId() {
    return eventId;
  }


  public void setEventId(String eventId) {
    
    
    
    this.eventId = eventId;
  }


  public SkillInvocationEvent createdBy(EventCreatedBy createdBy) {
    
    
    
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventCreatedBy getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(EventCreatedBy createdBy) {
    
    
    
    this.createdBy = createdBy;
  }


  public SkillInvocationEvent eventType(String eventType) {
    
    
    
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    
    
    
    this.eventType = eventType;
  }


  public SkillInvocationEvent sessionId(String sessionId) {
    
    
    
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * The session of the user that performed the action. Not all events will populate this attribute.
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "70090280850c8d2a1933c1", value = "The session of the user that performed the action. Not all events will populate this attribute.")

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    
    
    
    this.sessionId = sessionId;
  }


  public SkillInvocationEvent source(EventSource source) {
    
    
    
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventSource getSource() {
    return source;
  }


  public void setSource(EventSource source) {
    
    
    
    this.source = source;
  }


  public SkillInvocationEvent additionalDetails(Object additionalDetails) {
    
    
    
    
    this.additionalDetails = additionalDetails;
    return this;
  }

   /**
   * This object provides additional information about the event if available.  This can include how a user performed an event as well as additional information to correlate an event to external KeySafe logs. Not all events have an &#x60;additional_details&#x60; object.  This object is only available in the Enterprise Events.
   * @return additionalDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key\":\"value\"}", value = "This object provides additional information about the event if available.  This can include how a user performed an event as well as additional information to correlate an event to external KeySafe logs. Not all events have an `additional_details` object.  This object is only available in the Enterprise Events.")

  public Object getAdditionalDetails() {
    return additionalDetails;
  }


  public void setAdditionalDetails(Object additionalDetails) {
    
    
    
    this.additionalDetails = additionalDetails;
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
   * @return the SkillInvocationEvent instance itself
   */
  public SkillInvocationEvent putAdditionalProperty(String key, Object value) {
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
    SkillInvocationEvent skillInvocationEvent = (SkillInvocationEvent) o;
    return Objects.equals(this.type, skillInvocationEvent.type) &&
        Objects.equals(this.createdAt, skillInvocationEvent.createdAt) &&
        Objects.equals(this.recordedAt, skillInvocationEvent.recordedAt) &&
        Objects.equals(this.eventId, skillInvocationEvent.eventId) &&
        Objects.equals(this.createdBy, skillInvocationEvent.createdBy) &&
        Objects.equals(this.eventType, skillInvocationEvent.eventType) &&
        Objects.equals(this.sessionId, skillInvocationEvent.sessionId) &&
        Objects.equals(this.source, skillInvocationEvent.source) &&
        Objects.equals(this.additionalDetails, skillInvocationEvent.additionalDetails)&&
        Objects.equals(this.additionalProperties, skillInvocationEvent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, createdAt, recordedAt, eventId, createdBy, eventType, sessionId, source, additionalDetails, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillInvocationEvent {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    recordedAt: ").append(toIndentedString(recordedAt)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("created_at");
    openapiFields.add("recorded_at");
    openapiFields.add("event_id");
    openapiFields.add("created_by");
    openapiFields.add("event_type");
    openapiFields.add("session_id");
    openapiFields.add("source");
    openapiFields.add("additional_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkillInvocationEvent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SkillInvocationEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkillInvocationEvent is not found in the empty JSON string", SkillInvocationEvent.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("event_id") != null && !jsonObj.get("event_id").isJsonNull()) && !jsonObj.get("event_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_id").toString()));
      }
      // validate the optional field `created_by`
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) {
        EventCreatedBy.validateJsonObject(jsonObj.getAsJsonObject("created_by"));
      }
      // validate the optional field `event_type`
      if (jsonObj.get("event_type") != null && !jsonObj.get("event_type").isJsonNull()) {
        String.validateJsonObject(jsonObj.getAsJsonObject("event_type"));
      }
      if ((jsonObj.get("session_id") != null && !jsonObj.get("session_id").isJsonNull()) && !jsonObj.get("session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_id").toString()));
      }
      // validate the optional field `source`
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) {
        EventSource.validateJsonObject(jsonObj.getAsJsonObject("source"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkillInvocationEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkillInvocationEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkillInvocationEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkillInvocationEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<SkillInvocationEvent>() {
           @Override
           public void write(JsonWriter out, SkillInvocationEvent value) throws IOException {
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
           public SkillInvocationEvent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SkillInvocationEvent instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SkillInvocationEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkillInvocationEvent
  * @throws IOException if the JSON string is invalid with respect to SkillInvocationEvent
  */
  public static SkillInvocationEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkillInvocationEvent.class);
  }

 /**
  * Convert an instance of SkillInvocationEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

