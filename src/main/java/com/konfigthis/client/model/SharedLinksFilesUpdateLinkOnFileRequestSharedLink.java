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
import com.konfigthis.client.model.SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions;
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
 * The settings for the shared link to update.
 */
@ApiModel(description = "The settings for the shared link to update.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SharedLinksFilesUpdateLinkOnFileRequestSharedLink {
  /**
   * The level of access for the shared link. This can be restricted to anyone with the link (&#x60;open&#x60;), only people within the company (&#x60;company&#x60;) and only those who have been invited to the folder (&#x60;collaborators&#x60;).  If not set, this field defaults to the access level specified by the enterprise admin. To create a shared link with this default setting pass the &#x60;shared_link&#x60; object with no &#x60;access&#x60; field, for example &#x60;{ \&quot;shared_link\&quot;: {} }&#x60;.  The &#x60;company&#x60; access level is only available to paid accounts.
   */
  @JsonAdapter(AccessEnum.Adapter.class)
 public enum AccessEnum {
    OPEN("open"),
    
    COMPANY("company"),
    
    COLLABORATORS("collaborators");

    private String value;

    AccessEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessEnum fromValue(String value) {
      for (AccessEnum b : AccessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccessEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccessEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCESS = "access";
  @SerializedName(SERIALIZED_NAME_ACCESS)
  private AccessEnum access;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_VANITY_NAME = "vanity_name";
  @SerializedName(SERIALIZED_NAME_VANITY_NAME)
  private String vanityName;

  public static final String SERIALIZED_NAME_UNSHARED_AT = "unshared_at";
  @SerializedName(SERIALIZED_NAME_UNSHARED_AT)
  private OffsetDateTime unsharedAt;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions permissions;

  public SharedLinksFilesUpdateLinkOnFileRequestSharedLink() {
  }

  public SharedLinksFilesUpdateLinkOnFileRequestSharedLink access(AccessEnum access) {
    
    
    
    
    this.access = access;
    return this;
  }

   /**
   * The level of access for the shared link. This can be restricted to anyone with the link (&#x60;open&#x60;), only people within the company (&#x60;company&#x60;) and only those who have been invited to the folder (&#x60;collaborators&#x60;).  If not set, this field defaults to the access level specified by the enterprise admin. To create a shared link with this default setting pass the &#x60;shared_link&#x60; object with no &#x60;access&#x60; field, for example &#x60;{ \&quot;shared_link\&quot;: {} }&#x60;.  The &#x60;company&#x60; access level is only available to paid accounts.
   * @return access
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OPEN", value = "The level of access for the shared link. This can be restricted to anyone with the link (`open`), only people within the company (`company`) and only those who have been invited to the folder (`collaborators`).  If not set, this field defaults to the access level specified by the enterprise admin. To create a shared link with this default setting pass the `shared_link` object with no `access` field, for example `{ \"shared_link\": {} }`.  The `company` access level is only available to paid accounts.")

  public AccessEnum getAccess() {
    return access;
  }


  public void setAccess(AccessEnum access) {
    
    
    
    this.access = access;
  }


  public SharedLinksFilesUpdateLinkOnFileRequestSharedLink password(String password) {
    
    
    
    
    this.password = password;
    return this;
  }

   /**
   * The password required to access the shared link. Set the password to &#x60;null&#x60; to remove it. Passwords must now be at least eight characters long and include a number, upper case letter, or a non-numeric or non-alphabetic character. A password can only be set when &#x60;access&#x60; is set to &#x60;open&#x60;.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "do-n8t-use-this-Password", value = "The password required to access the shared link. Set the password to `null` to remove it. Passwords must now be at least eight characters long and include a number, upper case letter, or a non-numeric or non-alphabetic character. A password can only be set when `access` is set to `open`.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    
    
    
    this.password = password;
  }


  public SharedLinksFilesUpdateLinkOnFileRequestSharedLink vanityName(String vanityName) {
    
    
    if (vanityName != null && vanityName.length() < 12) {
      throw new IllegalArgumentException("Invalid value for vanityName. Length must be greater than or equal to 12.");
    }
    
    this.vanityName = vanityName;
    return this;
  }

   /**
   * Defines a custom vanity name to use in the shared link URL, for example &#x60;https://app.box.com/v/my-shared-link&#x60;.  Custom URLs should not be used when sharing sensitive content as vanity URLs are a lot easier to guess than regular shared links.
   * @return vanityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-shared-link", value = "Defines a custom vanity name to use in the shared link URL, for example `https://app.box.com/v/my-shared-link`.  Custom URLs should not be used when sharing sensitive content as vanity URLs are a lot easier to guess than regular shared links.")

  public String getVanityName() {
    return vanityName;
  }


  public void setVanityName(String vanityName) {
    
    
    if (vanityName != null && vanityName.length() < 12) {
      throw new IllegalArgumentException("Invalid value for vanityName. Length must be greater than or equal to 12.");
    }
    this.vanityName = vanityName;
  }


  public SharedLinksFilesUpdateLinkOnFileRequestSharedLink unsharedAt(OffsetDateTime unsharedAt) {
    
    
    
    
    this.unsharedAt = unsharedAt;
    return this;
  }

   /**
   * The timestamp at which this shared link will expire. This field can only be set by users with paid accounts. The value must be greater than the current date and time.
   * @return unsharedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "The timestamp at which this shared link will expire. This field can only be set by users with paid accounts. The value must be greater than the current date and time.")

  public OffsetDateTime getUnsharedAt() {
    return unsharedAt;
  }


  public void setUnsharedAt(OffsetDateTime unsharedAt) {
    
    
    
    this.unsharedAt = unsharedAt;
  }


  public SharedLinksFilesUpdateLinkOnFileRequestSharedLink permissions(SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions permissions) {
    
    
    
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions getPermissions() {
    return permissions;
  }


  public void setPermissions(SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions permissions) {
    
    
    
    this.permissions = permissions;
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
   * @return the SharedLinksFilesUpdateLinkOnFileRequestSharedLink instance itself
   */
  public SharedLinksFilesUpdateLinkOnFileRequestSharedLink putAdditionalProperty(String key, Object value) {
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
    SharedLinksFilesUpdateLinkOnFileRequestSharedLink sharedLinksFilesUpdateLinkOnFileRequestSharedLink = (SharedLinksFilesUpdateLinkOnFileRequestSharedLink) o;
    return Objects.equals(this.access, sharedLinksFilesUpdateLinkOnFileRequestSharedLink.access) &&
        Objects.equals(this.password, sharedLinksFilesUpdateLinkOnFileRequestSharedLink.password) &&
        Objects.equals(this.vanityName, sharedLinksFilesUpdateLinkOnFileRequestSharedLink.vanityName) &&
        Objects.equals(this.unsharedAt, sharedLinksFilesUpdateLinkOnFileRequestSharedLink.unsharedAt) &&
        Objects.equals(this.permissions, sharedLinksFilesUpdateLinkOnFileRequestSharedLink.permissions)&&
        Objects.equals(this.additionalProperties, sharedLinksFilesUpdateLinkOnFileRequestSharedLink.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, password, vanityName, unsharedAt, permissions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedLinksFilesUpdateLinkOnFileRequestSharedLink {\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    vanityName: ").append(toIndentedString(vanityName)).append("\n");
    sb.append("    unsharedAt: ").append(toIndentedString(unsharedAt)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
    openapiFields.add("access");
    openapiFields.add("password");
    openapiFields.add("vanity_name");
    openapiFields.add("unshared_at");
    openapiFields.add("permissions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SharedLinksFilesUpdateLinkOnFileRequestSharedLink
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SharedLinksFilesUpdateLinkOnFileRequestSharedLink.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SharedLinksFilesUpdateLinkOnFileRequestSharedLink is not found in the empty JSON string", SharedLinksFilesUpdateLinkOnFileRequestSharedLink.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("access") != null && !jsonObj.get("access").isJsonNull()) && !jsonObj.get("access").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("vanity_name") != null && !jsonObj.get("vanity_name").isJsonNull()) && !jsonObj.get("vanity_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vanity_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vanity_name").toString()));
      }
      // validate the optional field `permissions`
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull()) {
        SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions.validateJsonObject(jsonObj.getAsJsonObject("permissions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedLinksFilesUpdateLinkOnFileRequestSharedLink.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedLinksFilesUpdateLinkOnFileRequestSharedLink' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedLinksFilesUpdateLinkOnFileRequestSharedLink> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedLinksFilesUpdateLinkOnFileRequestSharedLink.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedLinksFilesUpdateLinkOnFileRequestSharedLink>() {
           @Override
           public void write(JsonWriter out, SharedLinksFilesUpdateLinkOnFileRequestSharedLink value) throws IOException {
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
           public SharedLinksFilesUpdateLinkOnFileRequestSharedLink read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SharedLinksFilesUpdateLinkOnFileRequestSharedLink instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SharedLinksFilesUpdateLinkOnFileRequestSharedLink given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedLinksFilesUpdateLinkOnFileRequestSharedLink
  * @throws IOException if the JSON string is invalid with respect to SharedLinksFilesUpdateLinkOnFileRequestSharedLink
  */
  public static SharedLinksFilesUpdateLinkOnFileRequestSharedLink fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedLinksFilesUpdateLinkOnFileRequestSharedLink.class);
  }

 /**
  * Convert an instance of SharedLinksFilesUpdateLinkOnFileRequestSharedLink to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

