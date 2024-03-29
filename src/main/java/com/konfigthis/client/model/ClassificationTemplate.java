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
import com.konfigthis.client.model.ClassificationTemplateFieldsInner;
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
 * A metadata template that holds the security classifications defined by an enterprise.
 */
@ApiModel(description = "A metadata template that holds the security classifications defined by an enterprise.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ClassificationTemplate {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * &#x60;metadata_template&#x60;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    METADATA_TEMPLATE("metadata_template");

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

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  /**
   * &#x60;securityClassification-6VMVochwUWo&#x60;
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
   * The name of this template as shown in web and mobile interfaces.
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
  private List<ClassificationTemplateFieldsInner> fields = new ArrayList<>();

  public ClassificationTemplate() {
  }

  public ClassificationTemplate id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the classification template.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "58063d82-4128-7b43-bba9-92f706befcdf", required = true, value = "The ID of the classification template.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ClassificationTemplate type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;metadata_template&#x60;
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "METADATA_TEMPLATE", required = true, value = "`metadata_template`")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public ClassificationTemplate scope(String scope) {
    
    
    
    
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the classification template. This is in the format &#x60;enterprise_{id}&#x60; where the &#x60;id&#x60; is the enterprise ID.
   * @return scope
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "enterprise_123456", required = true, value = "The scope of the classification template. This is in the format `enterprise_{id}` where the `id` is the enterprise ID.")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    
    
    
    this.scope = scope;
  }


  public ClassificationTemplate templateKey(TemplateKeyEnum templateKey) {
    
    
    
    
    this.templateKey = templateKey;
    return this;
  }

   /**
   * &#x60;securityClassification-6VMVochwUWo&#x60;
   * @return templateKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SECURITYCLASSIFICATION_6VMVOCHWUWO", required = true, value = "`securityClassification-6VMVochwUWo`")

  public TemplateKeyEnum getTemplateKey() {
    return templateKey;
  }


  public void setTemplateKey(TemplateKeyEnum templateKey) {
    
    
    
    this.templateKey = templateKey;
  }


  public ClassificationTemplate displayName(DisplayNameEnum displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of this template as shown in web and mobile interfaces.
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CLASSIFICATION", required = true, value = "The name of this template as shown in web and mobile interfaces.")

  public DisplayNameEnum getDisplayName() {
    return displayName;
  }


  public void setDisplayName(DisplayNameEnum displayName) {
    
    
    
    this.displayName = displayName;
  }


  public ClassificationTemplate hidden(Boolean hidden) {
    
    
    
    
    this.hidden = hidden;
    return this;
  }

   /**
   * Determines if the template is always available in web and mobile interfaces.
   * @return hidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Determines if the template is always available in web and mobile interfaces.")

  public Boolean getHidden() {
    return hidden;
  }


  public void setHidden(Boolean hidden) {
    
    
    
    this.hidden = hidden;
  }


  public ClassificationTemplate copyInstanceOnItemCopy(Boolean copyInstanceOnItemCopy) {
    
    
    
    
    this.copyInstanceOnItemCopy = copyInstanceOnItemCopy;
    return this;
  }

   /**
   * Determines if  classifications are copied along when the file or folder is copied.
   * @return copyInstanceOnItemCopy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Determines if  classifications are copied along when the file or folder is copied.")

  public Boolean getCopyInstanceOnItemCopy() {
    return copyInstanceOnItemCopy;
  }


  public void setCopyInstanceOnItemCopy(Boolean copyInstanceOnItemCopy) {
    
    
    
    this.copyInstanceOnItemCopy = copyInstanceOnItemCopy;
  }


  public ClassificationTemplate fields(List<ClassificationTemplateFieldsInner> fields) {
    
    
    
    
    this.fields = fields;
    return this;
  }

  public ClassificationTemplate addFieldsItem(ClassificationTemplateFieldsInner fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * A list of fields for this classification template. This includes only one field, the &#x60;Box__Security__Classification__Key&#x60;, which defines the different classifications available in this enterprise.
   * @return fields
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of fields for this classification template. This includes only one field, the `Box__Security__Classification__Key`, which defines the different classifications available in this enterprise.")

  public List<ClassificationTemplateFieldsInner> getFields() {
    return fields;
  }


  public void setFields(List<ClassificationTemplateFieldsInner> fields) {
    
    
    
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
   * @return the ClassificationTemplate instance itself
   */
  public ClassificationTemplate putAdditionalProperty(String key, Object value) {
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
    ClassificationTemplate classificationTemplate = (ClassificationTemplate) o;
    return Objects.equals(this.id, classificationTemplate.id) &&
        Objects.equals(this.type, classificationTemplate.type) &&
        Objects.equals(this.scope, classificationTemplate.scope) &&
        Objects.equals(this.templateKey, classificationTemplate.templateKey) &&
        Objects.equals(this.displayName, classificationTemplate.displayName) &&
        Objects.equals(this.hidden, classificationTemplate.hidden) &&
        Objects.equals(this.copyInstanceOnItemCopy, classificationTemplate.copyInstanceOnItemCopy) &&
        Objects.equals(this.fields, classificationTemplate.fields)&&
        Objects.equals(this.additionalProperties, classificationTemplate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, scope, templateKey, displayName, hidden, copyInstanceOnItemCopy, fields, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationTemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("scope");
    openapiFields.add("templateKey");
    openapiFields.add("displayName");
    openapiFields.add("hidden");
    openapiFields.add("copyInstanceOnItemCopy");
    openapiFields.add("fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("scope");
    openapiRequiredFields.add("templateKey");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("fields");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ClassificationTemplate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ClassificationTemplate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClassificationTemplate is not found in the empty JSON string", ClassificationTemplate.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ClassificationTemplate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
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
        ClassificationTemplateFieldsInner.validateJsonObject(jsonArrayfields.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClassificationTemplate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClassificationTemplate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClassificationTemplate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClassificationTemplate.class));

       return (TypeAdapter<T>) new TypeAdapter<ClassificationTemplate>() {
           @Override
           public void write(JsonWriter out, ClassificationTemplate value) throws IOException {
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
           public ClassificationTemplate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ClassificationTemplate instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ClassificationTemplate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClassificationTemplate
  * @throws IOException if the JSON string is invalid with respect to ClassificationTemplate
  */
  public static ClassificationTemplate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClassificationTemplate.class);
  }

 /**
  * Convert an instance of ClassificationTemplate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

