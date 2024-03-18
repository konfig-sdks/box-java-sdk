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
 * Specifies which &#x60;float&#x60; field on the template to filter the search results by, specifying a range of values that can match.
 */
@ApiModel(description = "Specifies which `float` field on the template to filter the search results by, specifying a range of values that can match.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MetadataFieldFilterFloatRange {
  public static final String SERIALIZED_NAME_LT = "lt";
  @SerializedName(SERIALIZED_NAME_LT)
  private Double lt;

  public static final String SERIALIZED_NAME_GT = "gt";
  @SerializedName(SERIALIZED_NAME_GT)
  private Double gt;

  public MetadataFieldFilterFloatRange() {
  }

  public MetadataFieldFilterFloatRange lt(Double lt) {
    
    
    
    
    this.lt = lt;
    return this;
  }

  public MetadataFieldFilterFloatRange lt(Integer lt) {
    
    
    
    
    this.lt = lt.doubleValue();
    return this;
  }

   /**
   * Specifies the (inclusive) upper bound for the metadata field value. The value of a field must be lower than (&#x60;lt&#x60;) or equal to this value for the search query to match this template.
   * @return lt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200000", value = "Specifies the (inclusive) upper bound for the metadata field value. The value of a field must be lower than (`lt`) or equal to this value for the search query to match this template.")

  public Double getLt() {
    return lt;
  }


  public void setLt(Double lt) {
    
    
    
    this.lt = lt;
  }


  public MetadataFieldFilterFloatRange gt(Double gt) {
    
    
    
    
    this.gt = gt;
    return this;
  }

  public MetadataFieldFilterFloatRange gt(Integer gt) {
    
    
    
    
    this.gt = gt.doubleValue();
    return this;
  }

   /**
   * Specifies the (inclusive) lower bound for the metadata field value. The value of a field must be greater than (&#x60;gt&#x60;) or equal to this value for the search query to match this template.
   * @return gt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100000", value = "Specifies the (inclusive) lower bound for the metadata field value. The value of a field must be greater than (`gt`) or equal to this value for the search query to match this template.")

  public Double getGt() {
    return gt;
  }


  public void setGt(Double gt) {
    
    
    
    this.gt = gt;
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
   * @return the MetadataFieldFilterFloatRange instance itself
   */
  public MetadataFieldFilterFloatRange putAdditionalProperty(String key, Object value) {
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
    MetadataFieldFilterFloatRange metadataFieldFilterFloatRange = (MetadataFieldFilterFloatRange) o;
    return Objects.equals(this.lt, metadataFieldFilterFloatRange.lt) &&
        Objects.equals(this.gt, metadataFieldFilterFloatRange.gt)&&
        Objects.equals(this.additionalProperties, metadataFieldFilterFloatRange.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lt, gt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataFieldFilterFloatRange {\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
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
    openapiFields.add("lt");
    openapiFields.add("gt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetadataFieldFilterFloatRange
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MetadataFieldFilterFloatRange.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetadataFieldFilterFloatRange is not found in the empty JSON string", MetadataFieldFilterFloatRange.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetadataFieldFilterFloatRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetadataFieldFilterFloatRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetadataFieldFilterFloatRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetadataFieldFilterFloatRange.class));

       return (TypeAdapter<T>) new TypeAdapter<MetadataFieldFilterFloatRange>() {
           @Override
           public void write(JsonWriter out, MetadataFieldFilterFloatRange value) throws IOException {
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
           public MetadataFieldFilterFloatRange read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MetadataFieldFilterFloatRange instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MetadataFieldFilterFloatRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetadataFieldFilterFloatRange
  * @throws IOException if the JSON string is invalid with respect to MetadataFieldFilterFloatRange
  */
  public static MetadataFieldFilterFloatRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetadataFieldFilterFloatRange.class);
  }

 /**
  * Convert an instance of MetadataFieldFilterFloatRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

