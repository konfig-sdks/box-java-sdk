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
import com.konfigthis.client.model.IntegrationMappingBoxItemSlack;
import com.konfigthis.client.model.IntegrationMappingPartnerItemSlack;
import com.konfigthis.client.model.IntegrationMappingSlackOptions;
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
 * A request to create a Slack Integration Mapping object
 */
@ApiModel(description = "A request to create a Slack Integration Mapping object")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class IntegrationMappingSlackCreateRequest {
  public static final String SERIALIZED_NAME_PARTNER_ITEM = "partner_item";
  @SerializedName(SERIALIZED_NAME_PARTNER_ITEM)
  private IntegrationMappingPartnerItemSlack partnerItem;

  public static final String SERIALIZED_NAME_BOX_ITEM = "box_item";
  @SerializedName(SERIALIZED_NAME_BOX_ITEM)
  private IntegrationMappingBoxItemSlack boxItem;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private IntegrationMappingSlackOptions options;

  public IntegrationMappingSlackCreateRequest() {
  }

  public IntegrationMappingSlackCreateRequest partnerItem(IntegrationMappingPartnerItemSlack partnerItem) {
    
    
    
    
    this.partnerItem = partnerItem;
    return this;
  }

   /**
   * Get partnerItem
   * @return partnerItem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IntegrationMappingPartnerItemSlack getPartnerItem() {
    return partnerItem;
  }


  public void setPartnerItem(IntegrationMappingPartnerItemSlack partnerItem) {
    
    
    
    this.partnerItem = partnerItem;
  }


  public IntegrationMappingSlackCreateRequest boxItem(IntegrationMappingBoxItemSlack boxItem) {
    
    
    
    
    this.boxItem = boxItem;
    return this;
  }

   /**
   * Get boxItem
   * @return boxItem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IntegrationMappingBoxItemSlack getBoxItem() {
    return boxItem;
  }


  public void setBoxItem(IntegrationMappingBoxItemSlack boxItem) {
    
    
    
    this.boxItem = boxItem;
  }


  public IntegrationMappingSlackCreateRequest options(IntegrationMappingSlackOptions options) {
    
    
    
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IntegrationMappingSlackOptions getOptions() {
    return options;
  }


  public void setOptions(IntegrationMappingSlackOptions options) {
    
    
    
    this.options = options;
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
   * @return the IntegrationMappingSlackCreateRequest instance itself
   */
  public IntegrationMappingSlackCreateRequest putAdditionalProperty(String key, Object value) {
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
    IntegrationMappingSlackCreateRequest integrationMappingSlackCreateRequest = (IntegrationMappingSlackCreateRequest) o;
    return Objects.equals(this.partnerItem, integrationMappingSlackCreateRequest.partnerItem) &&
        Objects.equals(this.boxItem, integrationMappingSlackCreateRequest.boxItem) &&
        Objects.equals(this.options, integrationMappingSlackCreateRequest.options)&&
        Objects.equals(this.additionalProperties, integrationMappingSlackCreateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerItem, boxItem, options, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationMappingSlackCreateRequest {\n");
    sb.append("    partnerItem: ").append(toIndentedString(partnerItem)).append("\n");
    sb.append("    boxItem: ").append(toIndentedString(boxItem)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("partner_item");
    openapiFields.add("box_item");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("partner_item");
    openapiRequiredFields.add("box_item");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IntegrationMappingSlackCreateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IntegrationMappingSlackCreateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntegrationMappingSlackCreateRequest is not found in the empty JSON string", IntegrationMappingSlackCreateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IntegrationMappingSlackCreateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `partner_item`
      IntegrationMappingPartnerItemSlack.validateJsonObject(jsonObj.getAsJsonObject("partner_item"));
      // validate the required field `box_item`
      IntegrationMappingBoxItemSlack.validateJsonObject(jsonObj.getAsJsonObject("box_item"));
      // validate the optional field `options`
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        IntegrationMappingSlackOptions.validateJsonObject(jsonObj.getAsJsonObject("options"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntegrationMappingSlackCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntegrationMappingSlackCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntegrationMappingSlackCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntegrationMappingSlackCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IntegrationMappingSlackCreateRequest>() {
           @Override
           public void write(JsonWriter out, IntegrationMappingSlackCreateRequest value) throws IOException {
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
           public IntegrationMappingSlackCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IntegrationMappingSlackCreateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IntegrationMappingSlackCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntegrationMappingSlackCreateRequest
  * @throws IOException if the JSON string is invalid with respect to IntegrationMappingSlackCreateRequest
  */
  public static IntegrationMappingSlackCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntegrationMappingSlackCreateRequest.class);
  }

 /**
  * Convert an instance of IntegrationMappingSlackCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

