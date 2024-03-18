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
import com.konfigthis.client.model.WebhookMiniTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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
 * WebhookInvocationWebhook
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebhookInvocationWebhook {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * &#x60;webhook&#x60;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    WEBHOOK("webhook");

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

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private WebhookMiniTarget target;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UserMini createdBy;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  /**
   * The event name that triggered this webhook
   */
  @JsonAdapter(TriggersEnum.Adapter.class)
 public enum TriggersEnum {
    FILE_UPLOADED("FILE.UPLOADED"),
    
    FILE_PREVIEWED("FILE.PREVIEWED"),
    
    FILE_DOWNLOADED("FILE.DOWNLOADED"),
    
    FILE_TRASHED("FILE.TRASHED"),
    
    FILE_DELETED("FILE.DELETED"),
    
    FILE_RESTORED("FILE.RESTORED"),
    
    FILE_COPIED("FILE.COPIED"),
    
    FILE_MOVED("FILE.MOVED"),
    
    FILE_LOCKED("FILE.LOCKED"),
    
    FILE_UNLOCKED("FILE.UNLOCKED"),
    
    FILE_RENAMED("FILE.RENAMED"),
    
    COMMENT_CREATED("COMMENT.CREATED"),
    
    COMMENT_UPDATED("COMMENT.UPDATED"),
    
    COMMENT_DELETED("COMMENT.DELETED"),
    
    TASK_ASSIGNMENT_CREATED("TASK_ASSIGNMENT.CREATED"),
    
    TASK_ASSIGNMENT_UPDATED("TASK_ASSIGNMENT.UPDATED"),
    
    METADATA_INSTANCE_CREATED("METADATA_INSTANCE.CREATED"),
    
    METADATA_INSTANCE_UPDATED("METADATA_INSTANCE.UPDATED"),
    
    METADATA_INSTANCE_DELETED("METADATA_INSTANCE.DELETED"),
    
    FOLDER_CREATED("FOLDER.CREATED"),
    
    FOLDER_RENAMED("FOLDER.RENAMED"),
    
    FOLDER_DOWNLOADED("FOLDER.DOWNLOADED"),
    
    FOLDER_RESTORED("FOLDER.RESTORED"),
    
    FOLDER_DELETED("FOLDER.DELETED"),
    
    FOLDER_COPIED("FOLDER.COPIED"),
    
    FOLDER_MOVED("FOLDER.MOVED"),
    
    FOLDER_TRASHED("FOLDER.TRASHED"),
    
    WEBHOOK_DELETED("WEBHOOK.DELETED"),
    
    COLLABORATION_CREATED("COLLABORATION.CREATED"),
    
    COLLABORATION_ACCEPTED("COLLABORATION.ACCEPTED"),
    
    COLLABORATION_REJECTED("COLLABORATION.REJECTED"),
    
    COLLABORATION_REMOVED("COLLABORATION.REMOVED"),
    
    COLLABORATION_UPDATED("COLLABORATION.UPDATED"),
    
    SHARED_LINK_DELETED("SHARED_LINK.DELETED"),
    
    SHARED_LINK_CREATED("SHARED_LINK.CREATED"),
    
    SHARED_LINK_UPDATED("SHARED_LINK.UPDATED"),
    
    SIGN_REQUEST_COMPLETED("SIGN_REQUEST.COMPLETED"),
    
    SIGN_REQUEST_DECLINED("SIGN_REQUEST.DECLINED"),
    
    SIGN_REQUEST_EXPIRED("SIGN_REQUEST.EXPIRED"),
    
    SIGN_REQUEST_SIGNER_EMAIL_BOUNCED("SIGN_REQUEST.SIGNER_EMAIL_BOUNCED");

    private String value;

    TriggersEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TriggersEnum fromValue(String value) {
      for (TriggersEnum b : TriggersEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TriggersEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TriggersEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TriggersEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TriggersEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRIGGERS = "triggers";
  @SerializedName(SERIALIZED_NAME_TRIGGERS)
  private List<TriggersEnum> triggers = null;

  public WebhookInvocationWebhook() {
  }

  public WebhookInvocationWebhook id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for this webhook.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11446498", value = "The unique identifier for this webhook.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public WebhookInvocationWebhook type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;webhook&#x60;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WEBHOOK", value = "`webhook`")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public WebhookInvocationWebhook target(WebhookMiniTarget target) {
    
    
    
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookMiniTarget getTarget() {
    return target;
  }


  public void setTarget(WebhookMiniTarget target) {
    
    
    
    this.target = target;
  }


  public WebhookInvocationWebhook createdBy(UserMini createdBy) {
    
    
    
    
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


  public WebhookInvocationWebhook createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * A timestamp identifying the time that the webhook was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "A timestamp identifying the time that the webhook was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public WebhookInvocationWebhook address(String address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * The URL that is notified by this webhook
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/webhooks", value = "The URL that is notified by this webhook")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    
    
    
    this.address = address;
  }


  public WebhookInvocationWebhook triggers(List<TriggersEnum> triggers) {
    
    
    
    
    this.triggers = triggers;
    return this;
  }

  public WebhookInvocationWebhook addTriggersItem(TriggersEnum triggersItem) {
    if (this.triggers == null) {
      this.triggers = new ArrayList<>();
    }
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * An array of event names that this webhook is to be triggered for
   * @return triggers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"FILE.UPLOADED\"]", value = "An array of event names that this webhook is to be triggered for")

  public List<TriggersEnum> getTriggers() {
    return triggers;
  }


  public void setTriggers(List<TriggersEnum> triggers) {
    
    
    
    this.triggers = triggers;
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
   * @return the WebhookInvocationWebhook instance itself
   */
  public WebhookInvocationWebhook putAdditionalProperty(String key, Object value) {
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
    WebhookInvocationWebhook webhookInvocationWebhook = (WebhookInvocationWebhook) o;
    return Objects.equals(this.id, webhookInvocationWebhook.id) &&
        Objects.equals(this.type, webhookInvocationWebhook.type) &&
        Objects.equals(this.target, webhookInvocationWebhook.target) &&
        Objects.equals(this.createdBy, webhookInvocationWebhook.createdBy) &&
        Objects.equals(this.createdAt, webhookInvocationWebhook.createdAt) &&
        Objects.equals(this.address, webhookInvocationWebhook.address) &&
        Objects.equals(this.triggers, webhookInvocationWebhook.triggers)&&
        Objects.equals(this.additionalProperties, webhookInvocationWebhook.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, target, createdBy, createdAt, address, triggers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookInvocationWebhook {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
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
    openapiFields.add("target");
    openapiFields.add("created_by");
    openapiFields.add("created_at");
    openapiFields.add("address");
    openapiFields.add("triggers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookInvocationWebhook
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookInvocationWebhook.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookInvocationWebhook is not found in the empty JSON string", WebhookInvocationWebhook.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `target`
      if (jsonObj.get("target") != null && !jsonObj.get("target").isJsonNull()) {
        WebhookMiniTarget.validateJsonObject(jsonObj.getAsJsonObject("target"));
      }
      // validate the optional field `created_by`
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) {
        UserMini.validateJsonObject(jsonObj.getAsJsonObject("created_by"));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("triggers") != null && !jsonObj.get("triggers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `triggers` to be an array in the JSON string but got `%s`", jsonObj.get("triggers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookInvocationWebhook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookInvocationWebhook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookInvocationWebhook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookInvocationWebhook.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookInvocationWebhook>() {
           @Override
           public void write(JsonWriter out, WebhookInvocationWebhook value) throws IOException {
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
           public WebhookInvocationWebhook read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebhookInvocationWebhook instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebhookInvocationWebhook given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookInvocationWebhook
  * @throws IOException if the JSON string is invalid with respect to WebhookInvocationWebhook
  */
  public static WebhookInvocationWebhook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookInvocationWebhook.class);
  }

 /**
  * Convert an instance of WebhookInvocationWebhook to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

