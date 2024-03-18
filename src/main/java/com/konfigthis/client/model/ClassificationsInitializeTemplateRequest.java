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
import com.konfigthis.client.model.ClassificationsInitializeTemplateRequestFieldsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * ClassificationsInitializeTemplateRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ClassificationsInitializeTemplateRequest {
  /**
   * The scope in which to create the classifications. This should be &#x60;enterprise&#x60; or &#x60;enterprise_{id}&#x60; where &#x60;id&#x60; is the unique ID of the enterprise.
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
 public enum ScopeEnum {
    ENTERPRISE("enterprise");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScopeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private ScopeEnum scope;

  /**
   * Defines the list of metadata templates.
   */
  @JsonAdapter(TemplateKeyEnum.Adapter.class)
 public enum TemplateKeyEnum {
    SECURITYCLASSIFICATION_6VMVOCHWUWO("securityClassification-6VMVochwUWo");

    private String value;

    TemplateKeyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TemplateKeyEnum fromValue(String value) {
      for (TemplateKeyEnum b : TemplateKeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TemplateKeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TemplateKeyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TemplateKeyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TemplateKeyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TEMPLATE_KEY = "templateKey";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_KEY)
  private TemplateKeyEnum templateKey;

  /**
   * The name of the template as shown in web and mobile interfaces.
   */
  @JsonAdapter(DisplayNameEnum.Adapter.class)
 public enum DisplayNameEnum {
    CLASSIFICATION("Classification");

    private String value;

    DisplayNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisplayNameEnum fromValue(String value) {
      for (DisplayNameEnum b : DisplayNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DisplayNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisplayNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisplayNameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DisplayNameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private DisplayNameEnum displayName;

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  private Boolean hidden;

  public static final String SERIALIZED_NAME_COPY_INSTANCE_ON_ITEM_COPY = "copyInstanceOnItemCopy";
  @SerializedName(SERIALIZED_NAME_COPY_INSTANCE_ON_ITEM_COPY)
  private Boolean copyInstanceOnItemCopy;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<ClassificationsInitializeTemplateRequestFieldsInner> fields = new ArrayList<>();

  public ClassificationsInitializeTemplateRequest() {
  }

  public ClassificationsInitializeTemplateRequest scope(ScopeEnum scope) {
    
    
    
    
    this.scope = scope;
    return this;
  }

   /**
   * The scope in which to create the classifications. This should be &#x60;enterprise&#x60; or &#x60;enterprise_{id}&#x60; where &#x60;id&#x60; is the unique ID of the enterprise.
   * @return scope
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ENTERPRISE", required = true, value = "The scope in which to create the classifications. This should be `enterprise` or `enterprise_{id}` where `id` is the unique ID of the enterprise.")

  public ScopeEnum getScope() {
    return scope;
  }


  public void setScope(ScopeEnum scope) {
    
    
    
    this.scope = scope;
  }


  public ClassificationsInitializeTemplateRequest templateKey(TemplateKeyEnum templateKey) {
    
    
    
    
    this.templateKey = templateKey;
    return this;
  }

   /**
   * Defines the list of metadata templates.
   * @return templateKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SECURITYCLASSIFICATION_6VMVOCHWUWO", required = true, value = "Defines the list of metadata templates.")

  public TemplateKeyEnum getTemplateKey() {
    return templateKey;
  }


  public void setTemplateKey(TemplateKeyEnum templateKey) {
    
    
    
    this.templateKey = templateKey;
  }


  public ClassificationsInitializeTemplateRequest displayName(DisplayNameEnum displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the template as shown in web and mobile interfaces.
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CLASSIFICATION", required = true, value = "The name of the template as shown in web and mobile interfaces.")

  public DisplayNameEnum getDisplayName() {
    return displayName;
  }


  public void setDisplayName(DisplayNameEnum displayName) {
    
    
    
    this.displayName = displayName;
  }


  public ClassificationsInitializeTemplateRequest hidden(Boolean hidden) {
    
    
    
    
    this.hidden = hidden;
    return this;
  }

   /**
   * Determines if the classification template is hidden or available on web and mobile devices.
   * @return hidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Determines if the classification template is hidden or available on web and mobile devices.")

  public Boolean getHidden() {
    return hidden;
  }


  public void setHidden(Boolean hidden) {
    
    
    
    this.hidden = hidden;
  }


  public ClassificationsInitializeTemplateRequest copyInstanceOnItemCopy(Boolean copyInstanceOnItemCopy) {
    
    
    
    
    this.copyInstanceOnItemCopy = copyInstanceOnItemCopy;
    return this;
  }

   /**
   * Determines if classifications are copied along when the file or folder is copied.
   * @return copyInstanceOnItemCopy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Determines if classifications are copied along when the file or folder is copied.")

  public Boolean getCopyInstanceOnItemCopy() {
    return copyInstanceOnItemCopy;
  }


  public void setCopyInstanceOnItemCopy(Boolean copyInstanceOnItemCopy) {
    
    
    
    this.copyInstanceOnItemCopy = copyInstanceOnItemCopy;
  }


  public ClassificationsInitializeTemplateRequest fields(List<ClassificationsInitializeTemplateRequestFieldsInner> fields) {
    
    
    
    
    this.fields = fields;
    return this;
  }

  public ClassificationsInitializeTemplateRequest addFieldsItem(ClassificationsInitializeTemplateRequestFieldsInner fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * The classification template requires exactly one field, which holds all the valid classification values.
   * @return fields
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The classification template requires exactly one field, which holds all the valid classification values.")

  public List<ClassificationsInitializeTemplateRequestFieldsInner> getFields() {
    return fields;
  }


  public void setFields(List<ClassificationsInitializeTemplateRequestFieldsInner> fields) {
    
    
    
    this.fields = fields;
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
   * @return the ClassificationsInitializeTemplateRequest instance itself
   */
  public ClassificationsInitializeTemplateRequest putAdditionalProperty(String key, Object value) {
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
    ClassificationsInitializeTemplateRequest classificationsInitializeTemplateRequest = (ClassificationsInitializeTemplateRequest) o;
    return Objects.equals(this.scope, classificationsInitializeTemplateRequest.scope) &&
        Objects.equals(this.templateKey, classificationsInitializeTemplateRequest.templateKey) &&
        Objects.equals(this.displayName, classificationsInitializeTemplateRequest.displayName) &&
        Objects.equals(this.hidden, classificationsInitializeTemplateRequest.hidden) &&
        Objects.equals(this.copyInstanceOnItemCopy, classificationsInitializeTemplateRequest.copyInstanceOnItemCopy) &&
        Objects.equals(this.fields, classificationsInitializeTemplateRequest.fields)&&
        Objects.equals(this.additionalProperties, classificationsInitializeTemplateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, templateKey, displayName, hidden, copyInstanceOnItemCopy, fields, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationsInitializeTemplateRequest {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    templateKey: ").append(toIndentedString(templateKey)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    copyInstanceOnItemCopy: ").append(toIndentedString(copyInstanceOnItemCopy)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
    openapiFields.add("scope");
    openapiFields.add("templateKey");
    openapiFields.add("displayName");
    openapiFields.add("hidden");
    openapiFields.add("copyInstanceOnItemCopy");
    openapiFields.add("fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("scope");
    openapiRequiredFields.add("templateKey");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("fields");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ClassificationsInitializeTemplateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ClassificationsInitializeTemplateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClassificationsInitializeTemplateRequest is not found in the empty JSON string", ClassificationsInitializeTemplateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ClassificationsInitializeTemplateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if (!jsonObj.get("templateKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateKey").toString()));
      }
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
      }

      JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
      // validate the required field `fields` (array)
      for (int i = 0; i < jsonArrayfields.size(); i++) {
        ClassificationsInitializeTemplateRequestFieldsInner.validateJsonObject(jsonArrayfields.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClassificationsInitializeTemplateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClassificationsInitializeTemplateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClassificationsInitializeTemplateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClassificationsInitializeTemplateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ClassificationsInitializeTemplateRequest>() {
           @Override
           public void write(JsonWriter out, ClassificationsInitializeTemplateRequest value) throws IOException {
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
           public ClassificationsInitializeTemplateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ClassificationsInitializeTemplateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ClassificationsInitializeTemplateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClassificationsInitializeTemplateRequest
  * @throws IOException if the JSON string is invalid with respect to ClassificationsInitializeTemplateRequest
  */
  public static ClassificationsInitializeTemplateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClassificationsInitializeTemplateRequest.class);
  }

 /**
  * Convert an instance of ClassificationsInitializeTemplateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
