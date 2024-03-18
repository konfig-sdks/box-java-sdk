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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
 * The metadata assigned to a using for Box skills.
 */
@ApiModel(description = "The metadata assigned to a using for Box skills.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SkillCardsMetadata {
  public static final String SERIALIZED_NAME_$_CAN_EDIT = "$canEdit";
  @SerializedName(SERIALIZED_NAME_$_CAN_EDIT)
  private Boolean $canEdit;

  public static final String SERIALIZED_NAME_$_ID = "$id";
  @SerializedName(SERIALIZED_NAME_$_ID)
  private UUID $id;

  public static final String SERIALIZED_NAME_$_PARENT = "$parent";
  @SerializedName(SERIALIZED_NAME_$_PARENT)
  private String $parent;

  public static final String SERIALIZED_NAME_$_SCOPE = "$scope";
  @SerializedName(SERIALIZED_NAME_$_SCOPE)
  private String $scope;

  public static final String SERIALIZED_NAME_$_TEMPLATE = "$template";
  @SerializedName(SERIALIZED_NAME_$_TEMPLATE)
  private String $template;

  public static final String SERIALIZED_NAME_$_TYPE = "$type";
  @SerializedName(SERIALIZED_NAME_$_TYPE)
  private String $type;

  public static final String SERIALIZED_NAME_$_TYPE_VERSION = "$typeVersion";
  @SerializedName(SERIALIZED_NAME_$_TYPE_VERSION)
  private Integer $typeVersion;

  public static final String SERIALIZED_NAME_$_VERSION = "$version";
  @SerializedName(SERIALIZED_NAME_$_VERSION)
  private Integer $version;

  public static final String SERIALIZED_NAME_CARDS = "cards";
  @SerializedName(SERIALIZED_NAME_CARDS)
  private List<Object> cards = null;

  public SkillCardsMetadata() {
  }

  public SkillCardsMetadata $canEdit(Boolean $canEdit) {
    
    
    
    
    this.$canEdit = $canEdit;
    return this;
  }

   /**
   * Whether the user can edit this metadata
   * @return $canEdit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the user can edit this metadata")

  public Boolean get$CanEdit() {
    return $canEdit;
  }


  public void set$CanEdit(Boolean $canEdit) {
    
    
    
    this.$canEdit = $canEdit;
  }


  public SkillCardsMetadata $id(UUID $id) {
    
    
    
    
    this.$id = $id;
    return this;
  }

   /**
   * A UUID to identify the metadata object
   * @return $id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01234500-12f1-1234-aa12-b1d234cb567e", value = "A UUID to identify the metadata object")

  public UUID get$Id() {
    return $id;
  }


  public void set$Id(UUID $id) {
    
    
    
    this.$id = $id;
  }


  public SkillCardsMetadata $parent(String $parent) {
    
    
    
    
    this.$parent = $parent;
    return this;
  }

   /**
   * An ID for the parent folder
   * @return $parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "folder_59449484661,", value = "An ID for the parent folder")

  public String get$Parent() {
    return $parent;
  }


  public void set$Parent(String $parent) {
    
    
    
    this.$parent = $parent;
  }


  public SkillCardsMetadata $scope(String $scope) {
    
    
    
    
    this.$scope = $scope;
    return this;
  }

   /**
   * An ID for the scope in which this template has been applied
   * @return $scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "enterprise_27335", value = "An ID for the scope in which this template has been applied")

  public String get$Scope() {
    return $scope;
  }


  public void set$Scope(String $scope) {
    
    
    
    this.$scope = $scope;
  }


  public SkillCardsMetadata $template(String $template) {
    
    
    
    
    this.$template = $template;
    return this;
  }

   /**
   * The name of the template
   * @return $template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "properties", value = "The name of the template")

  public String get$Template() {
    return $template;
  }


  public void set$Template(String $template) {
    
    
    
    this.$template = $template;
  }


  public SkillCardsMetadata $type(String $type) {
    
    
    
    
    this.$type = $type;
    return this;
  }

   /**
   * A unique identifier for the \&quot;type\&quot; of this instance. This is an internal system property and should not be used by a client application.
   * @return $type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "properties-6bcba49f-ca6d-4d2a-a758-57fe6edf44d0", value = "A unique identifier for the \"type\" of this instance. This is an internal system property and should not be used by a client application.")

  public String get$Type() {
    return $type;
  }


  public void set$Type(String $type) {
    
    
    
    this.$type = $type;
  }


  public SkillCardsMetadata $typeVersion(Integer $typeVersion) {
    
    
    
    
    this.$typeVersion = $typeVersion;
    return this;
  }

   /**
   * The last-known version of the template of the object. This is an internal system property and should not be used by a client application.
   * @return $typeVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "The last-known version of the template of the object. This is an internal system property and should not be used by a client application.")

  public Integer get$TypeVersion() {
    return $typeVersion;
  }


  public void set$TypeVersion(Integer $typeVersion) {
    
    
    
    this.$typeVersion = $typeVersion;
  }


  public SkillCardsMetadata $version(Integer $version) {
    
    
    
    
    this.$version = $version;
    return this;
  }

   /**
   * The version of the metadata object. Starts at 0 and increases every time a user-defined property is modified.
   * @return $version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The version of the metadata object. Starts at 0 and increases every time a user-defined property is modified.")

  public Integer get$Version() {
    return $version;
  }


  public void set$Version(Integer $version) {
    
    
    
    this.$version = $version;
  }


  public SkillCardsMetadata cards(List<Object> cards) {
    
    
    
    
    this.cards = cards;
    return this;
  }

  public SkillCardsMetadata addCardsItem(Object cardsItem) {
    if (this.cards == null) {
      this.cards = new ArrayList<>();
    }
    this.cards.add(cardsItem);
    return this;
  }

   /**
   * A list of Box Skill cards that have been applied to this file.
   * @return cards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Box Skill cards that have been applied to this file.")

  public List<Object> getCards() {
    return cards;
  }


  public void setCards(List<Object> cards) {
    
    
    
    this.cards = cards;
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
   * @return the SkillCardsMetadata instance itself
   */
  public SkillCardsMetadata putAdditionalProperty(String key, Object value) {
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
    SkillCardsMetadata skillCardsMetadata = (SkillCardsMetadata) o;
    return Objects.equals(this.$canEdit, skillCardsMetadata.$canEdit) &&
        Objects.equals(this.$id, skillCardsMetadata.$id) &&
        Objects.equals(this.$parent, skillCardsMetadata.$parent) &&
        Objects.equals(this.$scope, skillCardsMetadata.$scope) &&
        Objects.equals(this.$template, skillCardsMetadata.$template) &&
        Objects.equals(this.$type, skillCardsMetadata.$type) &&
        Objects.equals(this.$typeVersion, skillCardsMetadata.$typeVersion) &&
        Objects.equals(this.$version, skillCardsMetadata.$version) &&
        Objects.equals(this.cards, skillCardsMetadata.cards)&&
        Objects.equals(this.additionalProperties, skillCardsMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash($canEdit, $id, $parent, $scope, $template, $type, $typeVersion, $version, cards, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillCardsMetadata {\n");
    sb.append("    $canEdit: ").append(toIndentedString($canEdit)).append("\n");
    sb.append("    $id: ").append(toIndentedString($id)).append("\n");
    sb.append("    $parent: ").append(toIndentedString($parent)).append("\n");
    sb.append("    $scope: ").append(toIndentedString($scope)).append("\n");
    sb.append("    $template: ").append(toIndentedString($template)).append("\n");
    sb.append("    $type: ").append(toIndentedString($type)).append("\n");
    sb.append("    $typeVersion: ").append(toIndentedString($typeVersion)).append("\n");
    sb.append("    $version: ").append(toIndentedString($version)).append("\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
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
    openapiFields.add("$canEdit");
    openapiFields.add("$id");
    openapiFields.add("$parent");
    openapiFields.add("$scope");
    openapiFields.add("$template");
    openapiFields.add("$type");
    openapiFields.add("$typeVersion");
    openapiFields.add("$version");
    openapiFields.add("cards");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkillCardsMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SkillCardsMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkillCardsMetadata is not found in the empty JSON string", SkillCardsMetadata.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("$id") != null && !jsonObj.get("$id").isJsonNull()) && !jsonObj.get("$id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$id").toString()));
      }
      if ((jsonObj.get("$parent") != null && !jsonObj.get("$parent").isJsonNull()) && !jsonObj.get("$parent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$parent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$parent").toString()));
      }
      if ((jsonObj.get("$scope") != null && !jsonObj.get("$scope").isJsonNull()) && !jsonObj.get("$scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$scope").toString()));
      }
      if ((jsonObj.get("$template") != null && !jsonObj.get("$template").isJsonNull()) && !jsonObj.get("$template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$template").toString()));
      }
      if ((jsonObj.get("$type") != null && !jsonObj.get("$type").isJsonNull()) && !jsonObj.get("$type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cards") != null && !jsonObj.get("cards").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cards` to be an array in the JSON string but got `%s`", jsonObj.get("cards").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkillCardsMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkillCardsMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkillCardsMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkillCardsMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<SkillCardsMetadata>() {
           @Override
           public void write(JsonWriter out, SkillCardsMetadata value) throws IOException {
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
           public SkillCardsMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SkillCardsMetadata instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SkillCardsMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkillCardsMetadata
  * @throws IOException if the JSON string is invalid with respect to SkillCardsMetadata
  */
  public static SkillCardsMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkillCardsMetadata.class);
  }

 /**
  * Convert an instance of SkillCardsMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

