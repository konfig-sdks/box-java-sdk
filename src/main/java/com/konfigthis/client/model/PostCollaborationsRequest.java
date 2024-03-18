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
import com.konfigthis.client.model.PostCollaborationsRequestAccessibleBy;
import com.konfigthis.client.model.PostCollaborationsRequestItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * PostCollaborationsRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PostCollaborationsRequest {
  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private PostCollaborationsRequestItem item;

  public static final String SERIALIZED_NAME_ACCESSIBLE_BY = "accessible_by";
  @SerializedName(SERIALIZED_NAME_ACCESSIBLE_BY)
  private PostCollaborationsRequestAccessibleBy accessibleBy;

  /**
   * The level of access granted.
   */
  @JsonAdapter(RoleEnum.Adapter.class)
 public enum RoleEnum {
    EDITOR("editor"),
    
    VIEWER("viewer"),
    
    PREVIEWER("previewer"),
    
    UPLOADER("uploader"),
    
    PREVIEWER_UPLOADER("previewer uploader"),
    
    VIEWER_UPLOADER("viewer uploader"),
    
    CO_OWNER("co-owner");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RoleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private RoleEnum role;

  public static final String SERIALIZED_NAME_IS_ACCESS_ONLY = "is_access_only";
  @SerializedName(SERIALIZED_NAME_IS_ACCESS_ONLY)
  private Boolean isAccessOnly;

  public static final String SERIALIZED_NAME_CAN_VIEW_PATH = "can_view_path";
  @SerializedName(SERIALIZED_NAME_CAN_VIEW_PATH)
  private Boolean canViewPath;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public PostCollaborationsRequest() {
  }

  public PostCollaborationsRequest item(PostCollaborationsRequestItem item) {
    
    
    
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PostCollaborationsRequestItem getItem() {
    return item;
  }


  public void setItem(PostCollaborationsRequestItem item) {
    
    
    
    this.item = item;
  }


  public PostCollaborationsRequest accessibleBy(PostCollaborationsRequestAccessibleBy accessibleBy) {
    
    
    
    
    this.accessibleBy = accessibleBy;
    return this;
  }

   /**
   * Get accessibleBy
   * @return accessibleBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PostCollaborationsRequestAccessibleBy getAccessibleBy() {
    return accessibleBy;
  }


  public void setAccessibleBy(PostCollaborationsRequestAccessibleBy accessibleBy) {
    
    
    
    this.accessibleBy = accessibleBy;
  }


  public PostCollaborationsRequest role(RoleEnum role) {
    
    
    
    
    this.role = role;
    return this;
  }

   /**
   * The level of access granted.
   * @return role
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "EDITOR", required = true, value = "The level of access granted.")

  public RoleEnum getRole() {
    return role;
  }


  public void setRole(RoleEnum role) {
    
    
    
    this.role = role;
  }


  public PostCollaborationsRequest isAccessOnly(Boolean isAccessOnly) {
    
    
    
    
    this.isAccessOnly = isAccessOnly;
    return this;
  }

   /**
   * If set to &#x60;true&#x60;, collaborators have access to shared items, but such items won&#39;t be visible in the All Files list. Additionally, collaborators won&#39;t see the the path to the root folder for the shared item.
   * @return isAccessOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If set to `true`, collaborators have access to shared items, but such items won't be visible in the All Files list. Additionally, collaborators won't see the the path to the root folder for the shared item.")

  public Boolean getIsAccessOnly() {
    return isAccessOnly;
  }


  public void setIsAccessOnly(Boolean isAccessOnly) {
    
    
    
    this.isAccessOnly = isAccessOnly;
  }


  public PostCollaborationsRequest canViewPath(Boolean canViewPath) {
    
    
    
    
    this.canViewPath = canViewPath;
    return this;
  }

   /**
   * Determines if the invited users can see the entire parent path to the associated folder. The user will not gain privileges in any parent folder and therefore can not see content the user is not collaborated on.  Be aware that this meaningfully increases the time required to load the invitee&#39;s **All Files** page. We recommend you limit the number of collaborations with &#x60;can_view_path&#x60; enabled to 1,000 per user.  Only owner or co-owners can invite collaborators with a &#x60;can_view_path&#x60; of &#x60;true&#x60;.  &#x60;can_view_path&#x60; can only be used for folder collaborations.
   * @return canViewPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Determines if the invited users can see the entire parent path to the associated folder. The user will not gain privileges in any parent folder and therefore can not see content the user is not collaborated on.  Be aware that this meaningfully increases the time required to load the invitee's **All Files** page. We recommend you limit the number of collaborations with `can_view_path` enabled to 1,000 per user.  Only owner or co-owners can invite collaborators with a `can_view_path` of `true`.  `can_view_path` can only be used for folder collaborations.")

  public Boolean getCanViewPath() {
    return canViewPath;
  }


  public void setCanViewPath(Boolean canViewPath) {
    
    
    
    this.canViewPath = canViewPath;
  }


  public PostCollaborationsRequest expiresAt(OffsetDateTime expiresAt) {
    
    
    
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Set the expiration date for the collaboration. At this date, the collaboration will be automatically removed from the item.  This feature will only work if the **Automatically remove invited collaborators: Allow folder owners to extend the expiry date** setting has been enabled in the **Enterprise Settings** of the **Admin Console**. When the setting is not enabled, collaborations can not have an expiry date and a value for this field will be result in an error.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-08-29T23:59-07:00", value = "Set the expiration date for the collaboration. At this date, the collaboration will be automatically removed from the item.  This feature will only work if the **Automatically remove invited collaborators: Allow folder owners to extend the expiry date** setting has been enabled in the **Enterprise Settings** of the **Admin Console**. When the setting is not enabled, collaborations can not have an expiry date and a value for this field will be result in an error.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    
    
    
    this.expiresAt = expiresAt;
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
   * @return the PostCollaborationsRequest instance itself
   */
  public PostCollaborationsRequest putAdditionalProperty(String key, Object value) {
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
    PostCollaborationsRequest postCollaborationsRequest = (PostCollaborationsRequest) o;
    return Objects.equals(this.item, postCollaborationsRequest.item) &&
        Objects.equals(this.accessibleBy, postCollaborationsRequest.accessibleBy) &&
        Objects.equals(this.role, postCollaborationsRequest.role) &&
        Objects.equals(this.isAccessOnly, postCollaborationsRequest.isAccessOnly) &&
        Objects.equals(this.canViewPath, postCollaborationsRequest.canViewPath) &&
        Objects.equals(this.expiresAt, postCollaborationsRequest.expiresAt)&&
        Objects.equals(this.additionalProperties, postCollaborationsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, accessibleBy, role, isAccessOnly, canViewPath, expiresAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCollaborationsRequest {\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    accessibleBy: ").append(toIndentedString(accessibleBy)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    isAccessOnly: ").append(toIndentedString(isAccessOnly)).append("\n");
    sb.append("    canViewPath: ").append(toIndentedString(canViewPath)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
    openapiFields.add("item");
    openapiFields.add("accessible_by");
    openapiFields.add("role");
    openapiFields.add("is_access_only");
    openapiFields.add("can_view_path");
    openapiFields.add("expires_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("item");
    openapiRequiredFields.add("accessible_by");
    openapiRequiredFields.add("role");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostCollaborationsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PostCollaborationsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostCollaborationsRequest is not found in the empty JSON string", PostCollaborationsRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PostCollaborationsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `item`
      PostCollaborationsRequestItem.validateJsonObject(jsonObj.getAsJsonObject("item"));
      // validate the required field `accessible_by`
      PostCollaborationsRequestAccessibleBy.validateJsonObject(jsonObj.getAsJsonObject("accessible_by"));
      if (!jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostCollaborationsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostCollaborationsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostCollaborationsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostCollaborationsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PostCollaborationsRequest>() {
           @Override
           public void write(JsonWriter out, PostCollaborationsRequest value) throws IOException {
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
           public PostCollaborationsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PostCollaborationsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PostCollaborationsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostCollaborationsRequest
  * @throws IOException if the JSON string is invalid with respect to PostCollaborationsRequest
  */
  public static PostCollaborationsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostCollaborationsRequest.class);
  }

 /**
  * Convert an instance of PostCollaborationsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

