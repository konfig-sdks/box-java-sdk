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
 * The part of an API response that describes marker based pagination
 */
@ApiModel(description = "The part of an API response that describes marker based pagination")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ShieldInformationBarrierSegmentsAllOf {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;

  public static final String SERIALIZED_NAME_NEXT_MARKER = "next_marker";
  @SerializedName(SERIALIZED_NAME_NEXT_MARKER)
  private String nextMarker;

  public ShieldInformationBarrierSegmentsAllOf() {
  }

  public ShieldInformationBarrierSegmentsAllOf limit(Long limit) {
    
    
    
    
    this.limit = limit;
    return this;
  }

   /**
   * The limit that was used for these entries. This will be the same as the &#x60;limit&#x60; query parameter unless that value exceeded the maximum value allowed. The maximum value varies by API.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "The limit that was used for these entries. This will be the same as the `limit` query parameter unless that value exceeded the maximum value allowed. The maximum value varies by API.")

  public Long getLimit() {
    return limit;
  }


  public void setLimit(Long limit) {
    
    
    
    this.limit = limit;
  }


  public ShieldInformationBarrierSegmentsAllOf nextMarker(String nextMarker) {
    
    
    
    
    this.nextMarker = nextMarker;
    return this;
  }

   /**
   * The marker for the start of the next page of results.
   * @return nextMarker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JV9IRGZmieiBasejOG9yDCRNgd2ymoZIbjsxbJMjIs3kioVii", value = "The marker for the start of the next page of results.")

  public String getNextMarker() {
    return nextMarker;
  }


  public void setNextMarker(String nextMarker) {
    
    
    
    this.nextMarker = nextMarker;
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
   * @return the ShieldInformationBarrierSegmentsAllOf instance itself
   */
  public ShieldInformationBarrierSegmentsAllOf putAdditionalProperty(String key, Object value) {
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
    ShieldInformationBarrierSegmentsAllOf shieldInformationBarrierSegmentsAllOf = (ShieldInformationBarrierSegmentsAllOf) o;
    return Objects.equals(this.limit, shieldInformationBarrierSegmentsAllOf.limit) &&
        Objects.equals(this.nextMarker, shieldInformationBarrierSegmentsAllOf.nextMarker)&&
        Objects.equals(this.additionalProperties, shieldInformationBarrierSegmentsAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, nextMarker, additionalProperties);
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
    sb.append("class ShieldInformationBarrierSegmentsAllOf {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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
    openapiFields.add("limit");
    openapiFields.add("next_marker");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShieldInformationBarrierSegmentsAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShieldInformationBarrierSegmentsAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShieldInformationBarrierSegmentsAllOf is not found in the empty JSON string", ShieldInformationBarrierSegmentsAllOf.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("next_marker").isJsonNull() && (jsonObj.get("next_marker") != null && !jsonObj.get("next_marker").isJsonNull()) && !jsonObj.get("next_marker").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_marker` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_marker").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShieldInformationBarrierSegmentsAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShieldInformationBarrierSegmentsAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShieldInformationBarrierSegmentsAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShieldInformationBarrierSegmentsAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ShieldInformationBarrierSegmentsAllOf>() {
           @Override
           public void write(JsonWriter out, ShieldInformationBarrierSegmentsAllOf value) throws IOException {
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
           public ShieldInformationBarrierSegmentsAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ShieldInformationBarrierSegmentsAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ShieldInformationBarrierSegmentsAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShieldInformationBarrierSegmentsAllOf
  * @throws IOException if the JSON string is invalid with respect to ShieldInformationBarrierSegmentsAllOf
  */
  public static ShieldInformationBarrierSegmentsAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShieldInformationBarrierSegmentsAllOf.class);
  }

 /**
  * Convert an instance of ShieldInformationBarrierSegmentsAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

