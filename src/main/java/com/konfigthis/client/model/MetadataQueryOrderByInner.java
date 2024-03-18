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
 * An object representing one of the metadata template fields to sort the metadata query results by.
 */
@ApiModel(description = "An object representing one of the metadata template fields to sort the metadata query results by.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MetadataQueryOrderByInner {
  public static final String SERIALIZED_NAME_FIELD_KEY = "field_key";
  @SerializedName(SERIALIZED_NAME_FIELD_KEY)
  private String fieldKey;

  /**
   * The direction to order by, either ascending or descending.  The &#x60;ordering&#x60; direction must be the same for each item in the array.
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
 public enum DirectionEnum {
    ASC("ASC"),
    
    DESC("DESC"),
    
    ASC("asc"),
    
    DESC("desc");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DirectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private DirectionEnum direction;

  public MetadataQueryOrderByInner() {
  }

  public MetadataQueryOrderByInner fieldKey(String fieldKey) {
    
    
    
    
    this.fieldKey = fieldKey;
    return this;
  }

   /**
   * The metadata template field to order by.  The &#x60;field_key&#x60; represents the &#x60;key&#x60; value of a field from the metadata template being searched for.
   * @return fieldKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "amount", value = "The metadata template field to order by.  The `field_key` represents the `key` value of a field from the metadata template being searched for.")

  public String getFieldKey() {
    return fieldKey;
  }


  public void setFieldKey(String fieldKey) {
    
    
    
    this.fieldKey = fieldKey;
  }


  public MetadataQueryOrderByInner direction(DirectionEnum direction) {
    
    
    
    
    this.direction = direction;
    return this;
  }

   /**
   * The direction to order by, either ascending or descending.  The &#x60;ordering&#x60; direction must be the same for each item in the array.
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ASC", value = "The direction to order by, either ascending or descending.  The `ordering` direction must be the same for each item in the array.")

  public DirectionEnum getDirection() {
    return direction;
  }


  public void setDirection(DirectionEnum direction) {
    
    
    
    this.direction = direction;
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
   * @return the MetadataQueryOrderByInner instance itself
   */
  public MetadataQueryOrderByInner putAdditionalProperty(String key, Object value) {
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
    MetadataQueryOrderByInner metadataQueryOrderByInner = (MetadataQueryOrderByInner) o;
    return Objects.equals(this.fieldKey, metadataQueryOrderByInner.fieldKey) &&
        Objects.equals(this.direction, metadataQueryOrderByInner.direction)&&
        Objects.equals(this.additionalProperties, metadataQueryOrderByInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldKey, direction, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataQueryOrderByInner {\n");
    sb.append("    fieldKey: ").append(toIndentedString(fieldKey)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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
    openapiFields.add("field_key");
    openapiFields.add("direction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetadataQueryOrderByInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MetadataQueryOrderByInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetadataQueryOrderByInner is not found in the empty JSON string", MetadataQueryOrderByInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("field_key") != null && !jsonObj.get("field_key").isJsonNull()) && !jsonObj.get("field_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field_key").toString()));
      }
      if ((jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonNull()) && !jsonObj.get("direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direction").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetadataQueryOrderByInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetadataQueryOrderByInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetadataQueryOrderByInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetadataQueryOrderByInner.class));

       return (TypeAdapter<T>) new TypeAdapter<MetadataQueryOrderByInner>() {
           @Override
           public void write(JsonWriter out, MetadataQueryOrderByInner value) throws IOException {
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
           public MetadataQueryOrderByInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MetadataQueryOrderByInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MetadataQueryOrderByInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetadataQueryOrderByInner
  * @throws IOException if the JSON string is invalid with respect to MetadataQueryOrderByInner
  */
  public static MetadataQueryOrderByInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetadataQueryOrderByInner.class);
  }

 /**
  * Convert an instance of MetadataQueryOrderByInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
