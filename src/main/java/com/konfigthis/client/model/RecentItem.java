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
import com.konfigthis.client.model.RecentItemItem;
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
 * A recent item accessed by a user.
 */
@ApiModel(description = "A recent item accessed by a user.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RecentItem {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private RecentItemItem item;

  /**
   * The most recent type of access the user performed on the item.
   */
  @JsonAdapter(InteractionTypeEnum.Adapter.class)
 public enum InteractionTypeEnum {
    PREVIEW("item_preview"),
    
    UPLOAD("item_upload"),
    
    COMMENT("item_comment"),
    
    OPEN("item_open"),
    
    MODIFY("item_modify");

    private String value;

    InteractionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InteractionTypeEnum fromValue(String value) {
      for (InteractionTypeEnum b : InteractionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InteractionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InteractionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InteractionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InteractionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INTERACTION_TYPE = "interaction_type";
  @SerializedName(SERIALIZED_NAME_INTERACTION_TYPE)
  private InteractionTypeEnum interactionType;

  public static final String SERIALIZED_NAME_INTERACTED_AT = "interacted_at";
  @SerializedName(SERIALIZED_NAME_INTERACTED_AT)
  private OffsetDateTime interactedAt;

  public static final String SERIALIZED_NAME_INTERACTION_SHARED_LINK = "interaction_shared_link";
  @SerializedName(SERIALIZED_NAME_INTERACTION_SHARED_LINK)
  private String interactionSharedLink;

  public RecentItem() {
  }

  public RecentItem type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;recent_item&#x60;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "recent_item", value = "`recent_item`")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public RecentItem item(RecentItemItem item) {
    
    
    
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecentItemItem getItem() {
    return item;
  }


  public void setItem(RecentItemItem item) {
    
    
    
    this.item = item;
  }


  public RecentItem interactionType(InteractionTypeEnum interactionType) {
    
    
    
    
    this.interactionType = interactionType;
    return this;
  }

   /**
   * The most recent type of access the user performed on the item.
   * @return interactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ITEM_PREVIEW", value = "The most recent type of access the user performed on the item.")

  public InteractionTypeEnum getInteractionType() {
    return interactionType;
  }


  public void setInteractionType(InteractionTypeEnum interactionType) {
    
    
    
    this.interactionType = interactionType;
  }


  public RecentItem interactedAt(OffsetDateTime interactedAt) {
    
    
    
    
    this.interactedAt = interactedAt;
    return this;
  }

   /**
   * The time of the most recent interaction.
   * @return interactedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-04-13T13:53:23-07:00", value = "The time of the most recent interaction.")

  public OffsetDateTime getInteractedAt() {
    return interactedAt;
  }


  public void setInteractedAt(OffsetDateTime interactedAt) {
    
    
    
    this.interactedAt = interactedAt;
  }


  public RecentItem interactionSharedLink(String interactionSharedLink) {
    
    
    
    
    this.interactionSharedLink = interactionSharedLink;
    return this;
  }

   /**
   * If the item was accessed through a shared link it will appear here, otherwise this will be null.
   * @return interactionSharedLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.box.com/shared/static/rh935iit6ewrmw0unyul.jpeg", value = "If the item was accessed through a shared link it will appear here, otherwise this will be null.")

  public String getInteractionSharedLink() {
    return interactionSharedLink;
  }


  public void setInteractionSharedLink(String interactionSharedLink) {
    
    
    
    this.interactionSharedLink = interactionSharedLink;
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
   * @return the RecentItem instance itself
   */
  public RecentItem putAdditionalProperty(String key, Object value) {
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
    RecentItem recentItem = (RecentItem) o;
    return Objects.equals(this.type, recentItem.type) &&
        Objects.equals(this.item, recentItem.item) &&
        Objects.equals(this.interactionType, recentItem.interactionType) &&
        Objects.equals(this.interactedAt, recentItem.interactedAt) &&
        Objects.equals(this.interactionSharedLink, recentItem.interactionSharedLink)&&
        Objects.equals(this.additionalProperties, recentItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, item, interactionType, interactedAt, interactionSharedLink, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecentItem {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
    sb.append("    interactedAt: ").append(toIndentedString(interactedAt)).append("\n");
    sb.append("    interactionSharedLink: ").append(toIndentedString(interactionSharedLink)).append("\n");
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
    openapiFields.add("item");
    openapiFields.add("interaction_type");
    openapiFields.add("interacted_at");
    openapiFields.add("interaction_shared_link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecentItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RecentItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecentItem is not found in the empty JSON string", RecentItem.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `item`
      if (jsonObj.get("item") != null && !jsonObj.get("item").isJsonNull()) {
        RecentItemItem.validateJsonObject(jsonObj.getAsJsonObject("item"));
      }
      if ((jsonObj.get("interaction_type") != null && !jsonObj.get("interaction_type").isJsonNull()) && !jsonObj.get("interaction_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interaction_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interaction_type").toString()));
      }
      if ((jsonObj.get("interaction_shared_link") != null && !jsonObj.get("interaction_shared_link").isJsonNull()) && !jsonObj.get("interaction_shared_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interaction_shared_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interaction_shared_link").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecentItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecentItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecentItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecentItem.class));

       return (TypeAdapter<T>) new TypeAdapter<RecentItem>() {
           @Override
           public void write(JsonWriter out, RecentItem value) throws IOException {
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
           public RecentItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RecentItem instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RecentItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecentItem
  * @throws IOException if the JSON string is invalid with respect to RecentItem
  */
  public static RecentItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecentItem.class);
  }

 /**
  * Convert an instance of RecentItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

