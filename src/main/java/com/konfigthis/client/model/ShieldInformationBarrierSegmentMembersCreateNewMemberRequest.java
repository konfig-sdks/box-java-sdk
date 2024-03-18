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
import com.konfigthis.client.model.ShieldInformationBarrierBase;
import com.konfigthis.client.model.ShieldInformationBarrierSegmentMembersCreateNewMemberRequestShieldInformationBarrierSegment;
import com.konfigthis.client.model.UserBase;
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
 * ShieldInformationBarrierSegmentMembersCreateNewMemberRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ShieldInformationBarrierSegmentMembersCreateNewMemberRequest {
  /**
   * -| A type of the shield barrier segment member.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    SHIELD_INFORMATION_BARRIER_SEGMENT_MEMBER("shield_information_barrier_segment_member");

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

  public static final String SERIALIZED_NAME_SHIELD_INFORMATION_BARRIER = "shield_information_barrier";
  @SerializedName(SERIALIZED_NAME_SHIELD_INFORMATION_BARRIER)
  private ShieldInformationBarrierBase shieldInformationBarrier;

  public static final String SERIALIZED_NAME_SHIELD_INFORMATION_BARRIER_SEGMENT = "shield_information_barrier_segment";
  @SerializedName(SERIALIZED_NAME_SHIELD_INFORMATION_BARRIER_SEGMENT)
  private ShieldInformationBarrierSegmentMembersCreateNewMemberRequestShieldInformationBarrierSegment shieldInformationBarrierSegment;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserBase user;

  public ShieldInformationBarrierSegmentMembersCreateNewMemberRequest() {
  }

  public ShieldInformationBarrierSegmentMembersCreateNewMemberRequest type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * -| A type of the shield barrier segment member.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SHIELD_INFORMATION_BARRIER_SEGMENT_MEMBER", value = "-| A type of the shield barrier segment member.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public ShieldInformationBarrierSegmentMembersCreateNewMemberRequest shieldInformationBarrier(ShieldInformationBarrierBase shieldInformationBarrier) {
    
    
    
    
    this.shieldInformationBarrier = shieldInformationBarrier;
    return this;
  }

   /**
   * Get shieldInformationBarrier
   * @return shieldInformationBarrier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShieldInformationBarrierBase getShieldInformationBarrier() {
    return shieldInformationBarrier;
  }


  public void setShieldInformationBarrier(ShieldInformationBarrierBase shieldInformationBarrier) {
    
    
    
    this.shieldInformationBarrier = shieldInformationBarrier;
  }


  public ShieldInformationBarrierSegmentMembersCreateNewMemberRequest shieldInformationBarrierSegment(ShieldInformationBarrierSegmentMembersCreateNewMemberRequestShieldInformationBarrierSegment shieldInformationBarrierSegment) {
    
    
    
    
    this.shieldInformationBarrierSegment = shieldInformationBarrierSegment;
    return this;
  }

   /**
   * Get shieldInformationBarrierSegment
   * @return shieldInformationBarrierSegment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ShieldInformationBarrierSegmentMembersCreateNewMemberRequestShieldInformationBarrierSegment getShieldInformationBarrierSegment() {
    return shieldInformationBarrierSegment;
  }


  public void setShieldInformationBarrierSegment(ShieldInformationBarrierSegmentMembersCreateNewMemberRequestShieldInformationBarrierSegment shieldInformationBarrierSegment) {
    
    
    
    this.shieldInformationBarrierSegment = shieldInformationBarrierSegment;
  }


  public ShieldInformationBarrierSegmentMembersCreateNewMemberRequest user(UserBase user) {
    
    
    
    
    this.user = user;
    return this;
  }

   /**
   * User to which restriction will be applied.
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "User to which restriction will be applied.")

  public UserBase getUser() {
    return user;
  }


  public void setUser(UserBase user) {
    
    
    
    this.user = user;
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
   * @return the ShieldInformationBarrierSegmentMembersCreateNewMemberRequest instance itself
   */
  public ShieldInformationBarrierSegmentMembersCreateNewMemberRequest putAdditionalProperty(String key, Object value) {
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
    ShieldInformationBarrierSegmentMembersCreateNewMemberRequest shieldInformationBarrierSegmentMembersCreateNewMemberRequest = (ShieldInformationBarrierSegmentMembersCreateNewMemberRequest) o;
    return Objects.equals(this.type, shieldInformationBarrierSegmentMembersCreateNewMemberRequest.type) &&
        Objects.equals(this.shieldInformationBarrier, shieldInformationBarrierSegmentMembersCreateNewMemberRequest.shieldInformationBarrier) &&
        Objects.equals(this.shieldInformationBarrierSegment, shieldInformationBarrierSegmentMembersCreateNewMemberRequest.shieldInformationBarrierSegment) &&
        Objects.equals(this.user, shieldInformationBarrierSegmentMembersCreateNewMemberRequest.user)&&
        Objects.equals(this.additionalProperties, shieldInformationBarrierSegmentMembersCreateNewMemberRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, shieldInformationBarrier, shieldInformationBarrierSegment, user, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShieldInformationBarrierSegmentMembersCreateNewMemberRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    shieldInformationBarrier: ").append(toIndentedString(shieldInformationBarrier)).append("\n");
    sb.append("    shieldInformationBarrierSegment: ").append(toIndentedString(shieldInformationBarrierSegment)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("shield_information_barrier");
    openapiFields.add("shield_information_barrier_segment");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("shield_information_barrier_segment");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShieldInformationBarrierSegmentMembersCreateNewMemberRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShieldInformationBarrierSegmentMembersCreateNewMemberRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShieldInformationBarrierSegmentMembersCreateNewMemberRequest is not found in the empty JSON string", ShieldInformationBarrierSegmentMembersCreateNewMemberRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ShieldInformationBarrierSegmentMembersCreateNewMemberRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `shield_information_barrier`
      if (jsonObj.get("shield_information_barrier") != null && !jsonObj.get("shield_information_barrier").isJsonNull()) {
        ShieldInformationBarrierBase.validateJsonObject(jsonObj.getAsJsonObject("shield_information_barrier"));
      }
      // validate the required field `shield_information_barrier_segment`
      ShieldInformationBarrierSegmentMembersCreateNewMemberRequestShieldInformationBarrierSegment.validateJsonObject(jsonObj.getAsJsonObject("shield_information_barrier_segment"));
      // validate the required field `user`
      UserBase.validateJsonObject(jsonObj.getAsJsonObject("user"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShieldInformationBarrierSegmentMembersCreateNewMemberRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShieldInformationBarrierSegmentMembersCreateNewMemberRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShieldInformationBarrierSegmentMembersCreateNewMemberRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShieldInformationBarrierSegmentMembersCreateNewMemberRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ShieldInformationBarrierSegmentMembersCreateNewMemberRequest>() {
           @Override
           public void write(JsonWriter out, ShieldInformationBarrierSegmentMembersCreateNewMemberRequest value) throws IOException {
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
           public ShieldInformationBarrierSegmentMembersCreateNewMemberRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ShieldInformationBarrierSegmentMembersCreateNewMemberRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ShieldInformationBarrierSegmentMembersCreateNewMemberRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShieldInformationBarrierSegmentMembersCreateNewMemberRequest
  * @throws IOException if the JSON string is invalid with respect to ShieldInformationBarrierSegmentMembersCreateNewMemberRequest
  */
  public static ShieldInformationBarrierSegmentMembersCreateNewMemberRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShieldInformationBarrierSegmentMembersCreateNewMemberRequest.class);
  }

 /**
  * Convert an instance of ShieldInformationBarrierSegmentMembersCreateNewMemberRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

