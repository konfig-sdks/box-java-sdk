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
 * SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions {
  public static final String SERIALIZED_NAME_CAN_DOWNLOAD = "can_download";
  @SerializedName(SERIALIZED_NAME_CAN_DOWNLOAD)
  private Boolean canDownload;

  public static final String SERIALIZED_NAME_CAN_PREVIEW = "can_preview";
  @SerializedName(SERIALIZED_NAME_CAN_PREVIEW)
  private Boolean canPreview;

  public static final String SERIALIZED_NAME_CAN_EDIT = "can_edit";
  @SerializedName(SERIALIZED_NAME_CAN_EDIT)
  private Boolean canEdit;

  public SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions() {
  }

  public SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions canDownload(Boolean canDownload) {
    
    
    
    
    this.canDownload = canDownload;
    return this;
  }

   /**
   * If the shared link allows for downloading of files. This can only be set when &#x60;access&#x60; is set to &#x60;open&#x60; or &#x60;company&#x60;.
   * @return canDownload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If the shared link allows for downloading of files. This can only be set when `access` is set to `open` or `company`.")

  public Boolean getCanDownload() {
    return canDownload;
  }


  public void setCanDownload(Boolean canDownload) {
    
    
    
    this.canDownload = canDownload;
  }


  public SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions canPreview(Boolean canPreview) {
    
    
    
    
    this.canPreview = canPreview;
    return this;
  }

   /**
   * If the shared link allows for previewing of files. This value is always &#x60;true&#x60;. For shared links on folders this also applies to any items in the folder.
   * @return canPreview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If the shared link allows for previewing of files. This value is always `true`. For shared links on folders this also applies to any items in the folder.")

  public Boolean getCanPreview() {
    return canPreview;
  }


  public void setCanPreview(Boolean canPreview) {
    
    
    
    this.canPreview = canPreview;
  }


  public SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions canEdit(Boolean canEdit) {
    
    
    
    
    this.canEdit = canEdit;
    return this;
  }

   /**
   * If the shared link allows for editing of files. This can only be set when &#x60;access&#x60; is set to &#x60;open&#x60; or &#x60;company&#x60;. This value can only be &#x60;true&#x60; is &#x60;can_download&#x60; is also &#x60;true&#x60;.
   * @return canEdit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If the shared link allows for editing of files. This can only be set when `access` is set to `open` or `company`. This value can only be `true` is `can_download` is also `true`.")

  public Boolean getCanEdit() {
    return canEdit;
  }


  public void setCanEdit(Boolean canEdit) {
    
    
    
    this.canEdit = canEdit;
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
   * @return the SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions instance itself
   */
  public SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions putAdditionalProperty(String key, Object value) {
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
    SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions sharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions = (SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions) o;
    return Objects.equals(this.canDownload, sharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions.canDownload) &&
        Objects.equals(this.canPreview, sharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions.canPreview) &&
        Objects.equals(this.canEdit, sharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions.canEdit)&&
        Objects.equals(this.additionalProperties, sharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDownload, canPreview, canEdit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions {\n");
    sb.append("    canDownload: ").append(toIndentedString(canDownload)).append("\n");
    sb.append("    canPreview: ").append(toIndentedString(canPreview)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
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
    openapiFields.add("can_download");
    openapiFields.add("can_preview");
    openapiFields.add("can_edit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions is not found in the empty JSON string", SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions>() {
           @Override
           public void write(JsonWriter out, SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions value) throws IOException {
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
           public SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions
  * @throws IOException if the JSON string is invalid with respect to SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions
  */
  public static SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions.class);
  }

 /**
  * Convert an instance of SharedLinksFilesUpdateLinkOnFileRequestSharedLinkPermissions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

