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
import java.time.OffsetDateTime;
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
 * Final decision made by the signer
 */
@ApiModel(description = "Final decision made by the signer")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SignRequestSignerAllOfSignerDecision {
  /**
   * Type of decision made by the signer
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    SIGNED("signed"),
    
    DECLINED("declined");

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

  public static final String SERIALIZED_NAME_FINALIZED_AT = "finalized_at";
  @SerializedName(SERIALIZED_NAME_FINALIZED_AT)
  private OffsetDateTime finalizedAt;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additional_info";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public SignRequestSignerAllOfSignerDecision() {
  }

  public SignRequestSignerAllOfSignerDecision type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Type of decision made by the signer
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SIGNED", value = "Type of decision made by the signer")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public SignRequestSignerAllOfSignerDecision finalizedAt(OffsetDateTime finalizedAt) {
    
    
    
    
    this.finalizedAt = finalizedAt;
    return this;
  }

   /**
   * Date and Time that the decision was made
   * @return finalizedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-04-26T08:12:13.982Z", value = "Date and Time that the decision was made")

  public OffsetDateTime getFinalizedAt() {
    return finalizedAt;
  }


  public void setFinalizedAt(OffsetDateTime finalizedAt) {
    
    
    
    this.finalizedAt = finalizedAt;
  }


  public SignRequestSignerAllOfSignerDecision additionalInfo(String additionalInfo) {
    
    
    
    
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Additional info about the decision, such as the decline reason from the signer
   * @return additionalInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Requesting changes before signing.", value = "Additional info about the decision, such as the decline reason from the signer")

  public String getAdditionalInfo() {
    return additionalInfo;
  }


  public void setAdditionalInfo(String additionalInfo) {
    
    
    
    this.additionalInfo = additionalInfo;
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
   * @return the SignRequestSignerAllOfSignerDecision instance itself
   */
  public SignRequestSignerAllOfSignerDecision putAdditionalProperty(String key, Object value) {
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
    SignRequestSignerAllOfSignerDecision signRequestSignerAllOfSignerDecision = (SignRequestSignerAllOfSignerDecision) o;
    return Objects.equals(this.type, signRequestSignerAllOfSignerDecision.type) &&
        Objects.equals(this.finalizedAt, signRequestSignerAllOfSignerDecision.finalizedAt) &&
        Objects.equals(this.additionalInfo, signRequestSignerAllOfSignerDecision.additionalInfo)&&
        Objects.equals(this.additionalProperties, signRequestSignerAllOfSignerDecision.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, finalizedAt, additionalInfo, additionalProperties);
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
    sb.append("class SignRequestSignerAllOfSignerDecision {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    finalizedAt: ").append(toIndentedString(finalizedAt)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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
    openapiFields.add("finalized_at");
    openapiFields.add("additional_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SignRequestSignerAllOfSignerDecision
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SignRequestSignerAllOfSignerDecision.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignRequestSignerAllOfSignerDecision is not found in the empty JSON string", SignRequestSignerAllOfSignerDecision.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("additional_info").isJsonNull() && (jsonObj.get("additional_info") != null && !jsonObj.get("additional_info").isJsonNull()) && !jsonObj.get("additional_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additional_info").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SignRequestSignerAllOfSignerDecision.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignRequestSignerAllOfSignerDecision' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignRequestSignerAllOfSignerDecision> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignRequestSignerAllOfSignerDecision.class));

       return (TypeAdapter<T>) new TypeAdapter<SignRequestSignerAllOfSignerDecision>() {
           @Override
           public void write(JsonWriter out, SignRequestSignerAllOfSignerDecision value) throws IOException {
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
           public SignRequestSignerAllOfSignerDecision read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SignRequestSignerAllOfSignerDecision instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SignRequestSignerAllOfSignerDecision given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SignRequestSignerAllOfSignerDecision
  * @throws IOException if the JSON string is invalid with respect to SignRequestSignerAllOfSignerDecision
  */
  public static SignRequestSignerAllOfSignerDecision fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignRequestSignerAllOfSignerDecision.class);
  }

 /**
  * Convert an instance of SignRequestSignerAllOfSignerDecision to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
