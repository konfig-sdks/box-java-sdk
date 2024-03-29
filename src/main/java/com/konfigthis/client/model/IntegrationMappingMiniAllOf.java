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
 * IntegrationMappingMiniAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class IntegrationMappingMiniAllOf {
  public static final String SERIALIZED_NAME_PARTNER_ITEM_ID = "partner_item_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ITEM_ID)
  private String partnerItemId;

  /**
   * Domain-specific type of the mapped partner item
   */
  @JsonAdapter(PartnerItemTypeEnum.Adapter.class)
 public enum PartnerItemTypeEnum {
    CHANNEL("channel");

    private String value;

    PartnerItemTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PartnerItemTypeEnum fromValue(String value) {
      for (PartnerItemTypeEnum b : PartnerItemTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PartnerItemTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PartnerItemTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PartnerItemTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PartnerItemTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PARTNER_ITEM_TYPE = "partner_item_type";
  @SerializedName(SERIALIZED_NAME_PARTNER_ITEM_TYPE)
  private PartnerItemTypeEnum partnerItemType;

  public static final String SERIALIZED_NAME_BOX_ITEM_ID = "box_item_id";
  @SerializedName(SERIALIZED_NAME_BOX_ITEM_ID)
  private String boxItemId;

  /**
   * Type of the Box object referenced in &#x60;box_item_id&#x60;
   */
  @JsonAdapter(BoxItemTypeEnum.Adapter.class)
 public enum BoxItemTypeEnum {
    FOLDER("folder");

    private String value;

    BoxItemTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BoxItemTypeEnum fromValue(String value) {
      for (BoxItemTypeEnum b : BoxItemTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BoxItemTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BoxItemTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BoxItemTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BoxItemTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BOX_ITEM_TYPE = "box_item_type";
  @SerializedName(SERIALIZED_NAME_BOX_ITEM_TYPE)
  private BoxItemTypeEnum boxItemType;

  public IntegrationMappingMiniAllOf() {
  }

  public IntegrationMappingMiniAllOf partnerItemId(String partnerItemId) {
    
    
    
    
    this.partnerItemId = partnerItemId;
    return this;
  }

   /**
   * ID of the mapped partner item
   * @return partnerItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "C12351346", value = "ID of the mapped partner item")

  public String getPartnerItemId() {
    return partnerItemId;
  }


  public void setPartnerItemId(String partnerItemId) {
    
    
    
    this.partnerItemId = partnerItemId;
  }


  public IntegrationMappingMiniAllOf partnerItemType(PartnerItemTypeEnum partnerItemType) {
    
    
    
    
    this.partnerItemType = partnerItemType;
    return this;
  }

   /**
   * Domain-specific type of the mapped partner item
   * @return partnerItemType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CHANNEL", value = "Domain-specific type of the mapped partner item")

  public PartnerItemTypeEnum getPartnerItemType() {
    return partnerItemType;
  }


  public void setPartnerItemType(PartnerItemTypeEnum partnerItemType) {
    
    
    
    this.partnerItemType = partnerItemType;
  }


  public IntegrationMappingMiniAllOf boxItemId(String boxItemId) {
    
    
    
    
    this.boxItemId = boxItemId;
    return this;
  }

   /**
   * ID of the Box item mapped to the object referenced in &#x60;partner_item_id&#x60;
   * @return boxItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123124351", value = "ID of the Box item mapped to the object referenced in `partner_item_id`")

  public String getBoxItemId() {
    return boxItemId;
  }


  public void setBoxItemId(String boxItemId) {
    
    
    
    this.boxItemId = boxItemId;
  }


  public IntegrationMappingMiniAllOf boxItemType(BoxItemTypeEnum boxItemType) {
    
    
    
    
    this.boxItemType = boxItemType;
    return this;
  }

   /**
   * Type of the Box object referenced in &#x60;box_item_id&#x60;
   * @return boxItemType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FOLDER", value = "Type of the Box object referenced in `box_item_id`")

  public BoxItemTypeEnum getBoxItemType() {
    return boxItemType;
  }


  public void setBoxItemType(BoxItemTypeEnum boxItemType) {
    
    
    
    this.boxItemType = boxItemType;
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
   * @return the IntegrationMappingMiniAllOf instance itself
   */
  public IntegrationMappingMiniAllOf putAdditionalProperty(String key, Object value) {
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
    IntegrationMappingMiniAllOf integrationMappingMiniAllOf = (IntegrationMappingMiniAllOf) o;
    return Objects.equals(this.partnerItemId, integrationMappingMiniAllOf.partnerItemId) &&
        Objects.equals(this.partnerItemType, integrationMappingMiniAllOf.partnerItemType) &&
        Objects.equals(this.boxItemId, integrationMappingMiniAllOf.boxItemId) &&
        Objects.equals(this.boxItemType, integrationMappingMiniAllOf.boxItemType)&&
        Objects.equals(this.additionalProperties, integrationMappingMiniAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerItemId, partnerItemType, boxItemId, boxItemType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationMappingMiniAllOf {\n");
    sb.append("    partnerItemId: ").append(toIndentedString(partnerItemId)).append("\n");
    sb.append("    partnerItemType: ").append(toIndentedString(partnerItemType)).append("\n");
    sb.append("    boxItemId: ").append(toIndentedString(boxItemId)).append("\n");
    sb.append("    boxItemType: ").append(toIndentedString(boxItemType)).append("\n");
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
    openapiFields.add("partner_item_id");
    openapiFields.add("partner_item_type");
    openapiFields.add("box_item_id");
    openapiFields.add("box_item_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IntegrationMappingMiniAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IntegrationMappingMiniAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntegrationMappingMiniAllOf is not found in the empty JSON string", IntegrationMappingMiniAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("partner_item_id") != null && !jsonObj.get("partner_item_id").isJsonNull()) && !jsonObj.get("partner_item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_item_id").toString()));
      }
      if ((jsonObj.get("partner_item_type") != null && !jsonObj.get("partner_item_type").isJsonNull()) && !jsonObj.get("partner_item_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_item_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_item_type").toString()));
      }
      if ((jsonObj.get("box_item_id") != null && !jsonObj.get("box_item_id").isJsonNull()) && !jsonObj.get("box_item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_item_id").toString()));
      }
      if ((jsonObj.get("box_item_type") != null && !jsonObj.get("box_item_type").isJsonNull()) && !jsonObj.get("box_item_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_item_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_item_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntegrationMappingMiniAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntegrationMappingMiniAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntegrationMappingMiniAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntegrationMappingMiniAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<IntegrationMappingMiniAllOf>() {
           @Override
           public void write(JsonWriter out, IntegrationMappingMiniAllOf value) throws IOException {
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
           public IntegrationMappingMiniAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IntegrationMappingMiniAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IntegrationMappingMiniAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntegrationMappingMiniAllOf
  * @throws IOException if the JSON string is invalid with respect to IntegrationMappingMiniAllOf
  */
  public static IntegrationMappingMiniAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntegrationMappingMiniAllOf.class);
  }

 /**
  * Convert an instance of IntegrationMappingMiniAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

