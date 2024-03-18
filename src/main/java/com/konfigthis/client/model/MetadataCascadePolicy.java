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
import com.konfigthis.client.model.MetadataCascadePolicyOwnerEnterprise;
import com.konfigthis.client.model.MetadataCascadePolicyParent;
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
 * A metadata cascade policy automatically applies a metadata template instance to all the files and folders within the targeted folder.
 */
@ApiModel(description = "A metadata cascade policy automatically applies a metadata template instance to all the files and folders within the targeted folder.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MetadataCascadePolicy {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * &#x60;metadata_cascade_policy&#x60;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    METADATA_CASCADE_POLICY("metadata_cascade_policy");

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

  public static final String SERIALIZED_NAME_OWNER_ENTERPRISE = "owner_enterprise";
  @SerializedName(SERIALIZED_NAME_OWNER_ENTERPRISE)
  private MetadataCascadePolicyOwnerEnterprise ownerEnterprise;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private MetadataCascadePolicyParent parent;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_TEMPLATE_KEY = "templateKey";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_KEY)
  private String templateKey;

  public MetadataCascadePolicy() {
  }

  public MetadataCascadePolicy id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the metadata cascade policy object
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6fd4ff89-8fc1-42cf-8b29-1890dedd26d7", required = true, value = "The ID of the metadata cascade policy object")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public MetadataCascadePolicy type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;metadata_cascade_policy&#x60;
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "METADATA_CASCADE_POLICY", required = true, value = "`metadata_cascade_policy`")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public MetadataCascadePolicy ownerEnterprise(MetadataCascadePolicyOwnerEnterprise ownerEnterprise) {
    
    
    
    
    this.ownerEnterprise = ownerEnterprise;
    return this;
  }

   /**
   * Get ownerEnterprise
   * @return ownerEnterprise
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MetadataCascadePolicyOwnerEnterprise getOwnerEnterprise() {
    return ownerEnterprise;
  }


  public void setOwnerEnterprise(MetadataCascadePolicyOwnerEnterprise ownerEnterprise) {
    
    
    
    this.ownerEnterprise = ownerEnterprise;
  }


  public MetadataCascadePolicy parent(MetadataCascadePolicyParent parent) {
    
    
    
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MetadataCascadePolicyParent getParent() {
    return parent;
  }


  public void setParent(MetadataCascadePolicyParent parent) {
    
    
    
    this.parent = parent;
  }


  public MetadataCascadePolicy scope(String scope) {
    
    
    
    
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the metadata cascade policy can either be &#x60;global&#x60; or &#x60;enterprise_*&#x60;. The &#x60;global&#x60; scope is used for policies that are available to any Box enterprise. The &#x60;enterprise_*&#x60; scope represents policies that have been created within a specific enterprise, where &#x60;*&#x60; will be the ID of that enterprise.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "enterprise_123456", value = "The scope of the metadata cascade policy can either be `global` or `enterprise_*`. The `global` scope is used for policies that are available to any Box enterprise. The `enterprise_*` scope represents policies that have been created within a specific enterprise, where `*` will be the ID of that enterprise.")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    
    
    
    this.scope = scope;
  }


  public MetadataCascadePolicy templateKey(String templateKey) {
    
    
    
    
    this.templateKey = templateKey;
    return this;
  }

   /**
   * The key of the template that is cascaded down to the folder&#39;s children.  In many cases the template key is automatically derived of its display name, for example &#x60;Contract Template&#x60; would become &#x60;contractTemplate&#x60;. In some cases the creator of the template will have provided its own template key.  Please [list the templates for an enterprise][list], or get all instances on a [file][file] or [folder][folder] to inspect a template&#39;s key.  [list]: e://get-metadata-templates-enterprise [file]: e://get-files-id-metadata [folder]: e://get-folders-id-metadata
   * @return templateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "productInfo", value = "The key of the template that is cascaded down to the folder's children.  In many cases the template key is automatically derived of its display name, for example `Contract Template` would become `contractTemplate`. In some cases the creator of the template will have provided its own template key.  Please [list the templates for an enterprise][list], or get all instances on a [file][file] or [folder][folder] to inspect a template's key.  [list]: e://get-metadata-templates-enterprise [file]: e://get-files-id-metadata [folder]: e://get-folders-id-metadata")

  public String getTemplateKey() {
    return templateKey;
  }


  public void setTemplateKey(String templateKey) {
    
    
    
    this.templateKey = templateKey;
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
   * @return the MetadataCascadePolicy instance itself
   */
  public MetadataCascadePolicy putAdditionalProperty(String key, Object value) {
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
    MetadataCascadePolicy metadataCascadePolicy = (MetadataCascadePolicy) o;
    return Objects.equals(this.id, metadataCascadePolicy.id) &&
        Objects.equals(this.type, metadataCascadePolicy.type) &&
        Objects.equals(this.ownerEnterprise, metadataCascadePolicy.ownerEnterprise) &&
        Objects.equals(this.parent, metadataCascadePolicy.parent) &&
        Objects.equals(this.scope, metadataCascadePolicy.scope) &&
        Objects.equals(this.templateKey, metadataCascadePolicy.templateKey)&&
        Objects.equals(this.additionalProperties, metadataCascadePolicy.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, ownerEnterprise, parent, scope, templateKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataCascadePolicy {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ownerEnterprise: ").append(toIndentedString(ownerEnterprise)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    templateKey: ").append(toIndentedString(templateKey)).append("\n");
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
    openapiFields.add("owner_enterprise");
    openapiFields.add("parent");
    openapiFields.add("scope");
    openapiFields.add("templateKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetadataCascadePolicy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MetadataCascadePolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetadataCascadePolicy is not found in the empty JSON string", MetadataCascadePolicy.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MetadataCascadePolicy.openapiRequiredFields) {
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
      // validate the optional field `owner_enterprise`
      if (jsonObj.get("owner_enterprise") != null && !jsonObj.get("owner_enterprise").isJsonNull()) {
        MetadataCascadePolicyOwnerEnterprise.validateJsonObject(jsonObj.getAsJsonObject("owner_enterprise"));
      }
      // validate the optional field `parent`
      if (jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonNull()) {
        MetadataCascadePolicyParent.validateJsonObject(jsonObj.getAsJsonObject("parent"));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if ((jsonObj.get("templateKey") != null && !jsonObj.get("templateKey").isJsonNull()) && !jsonObj.get("templateKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetadataCascadePolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetadataCascadePolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetadataCascadePolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetadataCascadePolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<MetadataCascadePolicy>() {
           @Override
           public void write(JsonWriter out, MetadataCascadePolicy value) throws IOException {
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
           public MetadataCascadePolicy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MetadataCascadePolicy instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MetadataCascadePolicy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetadataCascadePolicy
  * @throws IOException if the JSON string is invalid with respect to MetadataCascadePolicy
  */
  public static MetadataCascadePolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetadataCascadePolicy.class);
  }

 /**
  * Convert an instance of MetadataCascadePolicy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
