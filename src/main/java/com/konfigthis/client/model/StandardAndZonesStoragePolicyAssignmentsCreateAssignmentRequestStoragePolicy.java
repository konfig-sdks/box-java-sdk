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
 * The storage policy to assign to the user or enterprise
 */
@ApiModel(description = "The storage policy to assign to the user or enterprise")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy {
  /**
   * The type to assign.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    STORAGE_POLICY("storage_policy");

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

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy() {
  }

  public StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The type to assign.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "STORAGE_POLICY", required = true, value = "The type to assign.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the storage policy to assign.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1434325", required = true, value = "The ID of the storage policy to assign.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
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
   * @return the StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy instance itself
   */
  public StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy putAdditionalProperty(String key, Object value) {
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
    StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy standardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy = (StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy) o;
    return Objects.equals(this.type, standardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy.type) &&
        Objects.equals(this.id, standardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy.id)&&
        Objects.equals(this.additionalProperties, standardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy is not found in the empty JSON string", StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy>() {
           @Override
           public void write(JsonWriter out, StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy value) throws IOException {
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
           public StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy
  * @throws IOException if the JSON string is invalid with respect to StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy
  */
  public static StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy.class);
  }

 /**
  * Convert an instance of StandardAndZonesStoragePolicyAssignmentsCreateAssignmentRequestStoragePolicy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

