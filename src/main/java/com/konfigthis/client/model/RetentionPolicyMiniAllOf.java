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
 * RetentionPolicyMiniAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RetentionPolicyMiniAllOf {
  public static final String SERIALIZED_NAME_POLICY_NAME = "policy_name";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  private String policyName;

  public static final String SERIALIZED_NAME_RETENTION_LENGTH = "retention_length";
  @SerializedName(SERIALIZED_NAME_RETENTION_LENGTH)
  private String retentionLength;

  /**
   * The disposition action of the retention policy. This action can be &#x60;permanently_delete&#x60;, which will cause the content retained by the policy to be permanently deleted, or &#x60;remove_retention&#x60;, which will lift the retention policy from the content, allowing it to be deleted by users, once the retention policy has expired.
   */
  @JsonAdapter(DispositionActionEnum.Adapter.class)
 public enum DispositionActionEnum {
    PERMANENTLY_DELETE("permanently_delete"),
    
    REMOVE_RETENTION("remove_retention");

    private String value;

    DispositionActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DispositionActionEnum fromValue(String value) {
      for (DispositionActionEnum b : DispositionActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DispositionActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DispositionActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DispositionActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DispositionActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISPOSITION_ACTION = "disposition_action";
  @SerializedName(SERIALIZED_NAME_DISPOSITION_ACTION)
  private DispositionActionEnum dispositionAction;

  public RetentionPolicyMiniAllOf() {
  }

  public RetentionPolicyMiniAllOf policyName(String policyName) {
    
    
    
    
    this.policyName = policyName;
    return this;
  }

   /**
   * The name given to the retention policy.
   * @return policyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Some Policy Name", value = "The name given to the retention policy.")

  public String getPolicyName() {
    return policyName;
  }


  public void setPolicyName(String policyName) {
    
    
    
    this.policyName = policyName;
  }


  public RetentionPolicyMiniAllOf retentionLength(String retentionLength) {
    
    
    
    
    this.retentionLength = retentionLength;
    return this;
  }

   /**
   * The length of the retention policy. This value specifies the duration in days that the retention policy will be active for after being assigned to content.  If the policy has a &#x60;policy_type&#x60; of &#x60;indefinite&#x60;, the &#x60;retention_length&#x60; will also be &#x60;indefinite&#x60;.
   * @return retentionLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "365", value = "The length of the retention policy. This value specifies the duration in days that the retention policy will be active for after being assigned to content.  If the policy has a `policy_type` of `indefinite`, the `retention_length` will also be `indefinite`.")

  public String getRetentionLength() {
    return retentionLength;
  }


  public void setRetentionLength(String retentionLength) {
    
    
    
    this.retentionLength = retentionLength;
  }


  public RetentionPolicyMiniAllOf dispositionAction(DispositionActionEnum dispositionAction) {
    
    
    
    
    this.dispositionAction = dispositionAction;
    return this;
  }

   /**
   * The disposition action of the retention policy. This action can be &#x60;permanently_delete&#x60;, which will cause the content retained by the policy to be permanently deleted, or &#x60;remove_retention&#x60;, which will lift the retention policy from the content, allowing it to be deleted by users, once the retention policy has expired.
   * @return dispositionAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PERMANENTLY_DELETE", value = "The disposition action of the retention policy. This action can be `permanently_delete`, which will cause the content retained by the policy to be permanently deleted, or `remove_retention`, which will lift the retention policy from the content, allowing it to be deleted by users, once the retention policy has expired.")

  public DispositionActionEnum getDispositionAction() {
    return dispositionAction;
  }


  public void setDispositionAction(DispositionActionEnum dispositionAction) {
    
    
    
    this.dispositionAction = dispositionAction;
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
   * @return the RetentionPolicyMiniAllOf instance itself
   */
  public RetentionPolicyMiniAllOf putAdditionalProperty(String key, Object value) {
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
    RetentionPolicyMiniAllOf retentionPolicyMiniAllOf = (RetentionPolicyMiniAllOf) o;
    return Objects.equals(this.policyName, retentionPolicyMiniAllOf.policyName) &&
        Objects.equals(this.retentionLength, retentionPolicyMiniAllOf.retentionLength) &&
        Objects.equals(this.dispositionAction, retentionPolicyMiniAllOf.dispositionAction)&&
        Objects.equals(this.additionalProperties, retentionPolicyMiniAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyName, retentionLength, dispositionAction, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionPolicyMiniAllOf {\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    retentionLength: ").append(toIndentedString(retentionLength)).append("\n");
    sb.append("    dispositionAction: ").append(toIndentedString(dispositionAction)).append("\n");
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
    openapiFields.add("policy_name");
    openapiFields.add("retention_length");
    openapiFields.add("disposition_action");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetentionPolicyMiniAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetentionPolicyMiniAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetentionPolicyMiniAllOf is not found in the empty JSON string", RetentionPolicyMiniAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("policy_name") != null && !jsonObj.get("policy_name").isJsonNull()) && !jsonObj.get("policy_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_name").toString()));
      }
      if ((jsonObj.get("retention_length") != null && !jsonObj.get("retention_length").isJsonNull()) && !jsonObj.get("retention_length").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retention_length` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retention_length").toString()));
      }
      if ((jsonObj.get("disposition_action") != null && !jsonObj.get("disposition_action").isJsonNull()) && !jsonObj.get("disposition_action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disposition_action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disposition_action").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetentionPolicyMiniAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetentionPolicyMiniAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetentionPolicyMiniAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetentionPolicyMiniAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<RetentionPolicyMiniAllOf>() {
           @Override
           public void write(JsonWriter out, RetentionPolicyMiniAllOf value) throws IOException {
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
           public RetentionPolicyMiniAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RetentionPolicyMiniAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RetentionPolicyMiniAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetentionPolicyMiniAllOf
  * @throws IOException if the JSON string is invalid with respect to RetentionPolicyMiniAllOf
  */
  public static RetentionPolicyMiniAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetentionPolicyMiniAllOf.class);
  }

 /**
  * Convert an instance of RetentionPolicyMiniAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

