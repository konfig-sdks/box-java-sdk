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
 * The field which makes up the index.
 */
@ApiModel(description = "The field which makes up the index.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MetadataQueryIndexFieldsInner {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  /**
   * The sort direction of the field.
   */
  @JsonAdapter(SortDirectionEnum.Adapter.class)
 public enum SortDirectionEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    SortDirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortDirectionEnum fromValue(String value) {
      for (SortDirectionEnum b : SortDirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SortDirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortDirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortDirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SortDirectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SORT_DIRECTION = "sort_direction";
  @SerializedName(SERIALIZED_NAME_SORT_DIRECTION)
  private SortDirectionEnum sortDirection;

  public MetadataQueryIndexFieldsInner() {
  }

  public MetadataQueryIndexFieldsInner key(String key) {
    
    
    
    
    this.key = key;
    return this;
  }

   /**
   * The metadata template field key.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "vendor name", value = "The metadata template field key.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    
    
    
    this.key = key;
  }


  public MetadataQueryIndexFieldsInner sortDirection(SortDirectionEnum sortDirection) {
    
    
    
    
    this.sortDirection = sortDirection;
    return this;
  }

   /**
   * The sort direction of the field.
   * @return sortDirection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ASC", value = "The sort direction of the field.")

  public SortDirectionEnum getSortDirection() {
    return sortDirection;
  }


  public void setSortDirection(SortDirectionEnum sortDirection) {
    
    
    
    this.sortDirection = sortDirection;
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
   * @return the MetadataQueryIndexFieldsInner instance itself
   */
  public MetadataQueryIndexFieldsInner putAdditionalProperty(String key, Object value) {
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
    MetadataQueryIndexFieldsInner metadataQueryIndexFieldsInner = (MetadataQueryIndexFieldsInner) o;
    return Objects.equals(this.key, metadataQueryIndexFieldsInner.key) &&
        Objects.equals(this.sortDirection, metadataQueryIndexFieldsInner.sortDirection)&&
        Objects.equals(this.additionalProperties, metadataQueryIndexFieldsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, sortDirection, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataQueryIndexFieldsInner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("sort_direction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetadataQueryIndexFieldsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MetadataQueryIndexFieldsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetadataQueryIndexFieldsInner is not found in the empty JSON string", MetadataQueryIndexFieldsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("sort_direction") != null && !jsonObj.get("sort_direction").isJsonNull()) && !jsonObj.get("sort_direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort_direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort_direction").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetadataQueryIndexFieldsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetadataQueryIndexFieldsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetadataQueryIndexFieldsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetadataQueryIndexFieldsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<MetadataQueryIndexFieldsInner>() {
           @Override
           public void write(JsonWriter out, MetadataQueryIndexFieldsInner value) throws IOException {
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
           public MetadataQueryIndexFieldsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MetadataQueryIndexFieldsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MetadataQueryIndexFieldsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetadataQueryIndexFieldsInner
  * @throws IOException if the JSON string is invalid with respect to MetadataQueryIndexFieldsInner
  */
  public static MetadataQueryIndexFieldsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetadataQueryIndexFieldsInner.class);
  }

 /**
  * Convert an instance of MetadataQueryIndexFieldsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

