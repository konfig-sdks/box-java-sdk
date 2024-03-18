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
import com.konfigthis.client.model.KeywordSkillCardEntriesInner;
import com.konfigthis.client.model.KeywordSkillCardInvocation;
import com.konfigthis.client.model.KeywordSkillCardSkill;
import com.konfigthis.client.model.KeywordSkillCardSkillCardTitle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * A skill card that contains a set of keywords
 */
@ApiModel(description = "A skill card that contains a set of keywords")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class KeywordSkillCard {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  /**
   * &#x60;skill_card&#x60;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    SKILL_CARD("skill_card");

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

  /**
   * &#x60;keyword&#x60;
   */
  @JsonAdapter(SkillCardTypeEnum.Adapter.class)
 public enum SkillCardTypeEnum {
    KEYWORD("keyword");

    private String value;

    SkillCardTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SkillCardTypeEnum fromValue(String value) {
      for (SkillCardTypeEnum b : SkillCardTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SkillCardTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SkillCardTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SkillCardTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SkillCardTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SKILL_CARD_TYPE = "skill_card_type";
  @SerializedName(SERIALIZED_NAME_SKILL_CARD_TYPE)
  private SkillCardTypeEnum skillCardType;

  public static final String SERIALIZED_NAME_SKILL_CARD_TITLE = "skill_card_title";
  @SerializedName(SERIALIZED_NAME_SKILL_CARD_TITLE)
  private KeywordSkillCardSkillCardTitle skillCardTitle;

  public static final String SERIALIZED_NAME_SKILL = "skill";
  @SerializedName(SERIALIZED_NAME_SKILL)
  private KeywordSkillCardSkill skill;

  public static final String SERIALIZED_NAME_INVOCATION = "invocation";
  @SerializedName(SERIALIZED_NAME_INVOCATION)
  private KeywordSkillCardInvocation invocation;

  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List<KeywordSkillCardEntriesInner> entries = new ArrayList<>();

  public KeywordSkillCard() {
  }

  public KeywordSkillCard createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The optional date and time this card was created at.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-04-13T13:53:23-07:00", value = "The optional date and time this card was created at.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public KeywordSkillCard type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;skill_card&#x60;
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SKILL_CARD", required = true, value = "`skill_card`")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public KeywordSkillCard skillCardType(SkillCardTypeEnum skillCardType) {
    
    
    
    
    this.skillCardType = skillCardType;
    return this;
  }

   /**
   * &#x60;keyword&#x60;
   * @return skillCardType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "KEYWORD", required = true, value = "`keyword`")

  public SkillCardTypeEnum getSkillCardType() {
    return skillCardType;
  }


  public void setSkillCardType(SkillCardTypeEnum skillCardType) {
    
    
    
    this.skillCardType = skillCardType;
  }


  public KeywordSkillCard skillCardTitle(KeywordSkillCardSkillCardTitle skillCardTitle) {
    
    
    
    
    this.skillCardTitle = skillCardTitle;
    return this;
  }

   /**
   * Get skillCardTitle
   * @return skillCardTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeywordSkillCardSkillCardTitle getSkillCardTitle() {
    return skillCardTitle;
  }


  public void setSkillCardTitle(KeywordSkillCardSkillCardTitle skillCardTitle) {
    
    
    
    this.skillCardTitle = skillCardTitle;
  }


  public KeywordSkillCard skill(KeywordSkillCardSkill skill) {
    
    
    
    
    this.skill = skill;
    return this;
  }

   /**
   * Get skill
   * @return skill
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public KeywordSkillCardSkill getSkill() {
    return skill;
  }


  public void setSkill(KeywordSkillCardSkill skill) {
    
    
    
    this.skill = skill;
  }


  public KeywordSkillCard invocation(KeywordSkillCardInvocation invocation) {
    
    
    
    
    this.invocation = invocation;
    return this;
  }

   /**
   * Get invocation
   * @return invocation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public KeywordSkillCardInvocation getInvocation() {
    return invocation;
  }


  public void setInvocation(KeywordSkillCardInvocation invocation) {
    
    
    
    this.invocation = invocation;
  }


  public KeywordSkillCard entries(List<KeywordSkillCardEntriesInner> entries) {
    
    
    
    
    this.entries = entries;
    return this;
  }

  public KeywordSkillCard addEntriesItem(KeywordSkillCardEntriesInner entriesItem) {
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * An list of entries in the metadata card.
   * @return entries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An list of entries in the metadata card.")

  public List<KeywordSkillCardEntriesInner> getEntries() {
    return entries;
  }


  public void setEntries(List<KeywordSkillCardEntriesInner> entries) {
    
    
    
    this.entries = entries;
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
   * @return the KeywordSkillCard instance itself
   */
  public KeywordSkillCard putAdditionalProperty(String key, Object value) {
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
    KeywordSkillCard keywordSkillCard = (KeywordSkillCard) o;
    return Objects.equals(this.createdAt, keywordSkillCard.createdAt) &&
        Objects.equals(this.type, keywordSkillCard.type) &&
        Objects.equals(this.skillCardType, keywordSkillCard.skillCardType) &&
        Objects.equals(this.skillCardTitle, keywordSkillCard.skillCardTitle) &&
        Objects.equals(this.skill, keywordSkillCard.skill) &&
        Objects.equals(this.invocation, keywordSkillCard.invocation) &&
        Objects.equals(this.entries, keywordSkillCard.entries)&&
        Objects.equals(this.additionalProperties, keywordSkillCard.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, type, skillCardType, skillCardTitle, skill, invocation, entries, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordSkillCard {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    skillCardType: ").append(toIndentedString(skillCardType)).append("\n");
    sb.append("    skillCardTitle: ").append(toIndentedString(skillCardTitle)).append("\n");
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    invocation: ").append(toIndentedString(invocation)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("type");
    openapiFields.add("skill_card_type");
    openapiFields.add("skill_card_title");
    openapiFields.add("skill");
    openapiFields.add("invocation");
    openapiFields.add("entries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("skill_card_type");
    openapiRequiredFields.add("skill");
    openapiRequiredFields.add("invocation");
    openapiRequiredFields.add("entries");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeywordSkillCard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeywordSkillCard.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeywordSkillCard is not found in the empty JSON string", KeywordSkillCard.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : KeywordSkillCard.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("skill_card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skill_card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skill_card_type").toString()));
      }
      // validate the optional field `skill_card_title`
      if (jsonObj.get("skill_card_title") != null && !jsonObj.get("skill_card_title").isJsonNull()) {
        KeywordSkillCardSkillCardTitle.validateJsonObject(jsonObj.getAsJsonObject("skill_card_title"));
      }
      // validate the required field `skill`
      KeywordSkillCardSkill.validateJsonObject(jsonObj.getAsJsonObject("skill"));
      // validate the required field `invocation`
      KeywordSkillCardInvocation.validateJsonObject(jsonObj.getAsJsonObject("invocation"));
      // ensure the json data is an array
      if (!jsonObj.get("entries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `entries` to be an array in the JSON string but got `%s`", jsonObj.get("entries").toString()));
      }

      JsonArray jsonArrayentries = jsonObj.getAsJsonArray("entries");
      // validate the required field `entries` (array)
      for (int i = 0; i < jsonArrayentries.size(); i++) {
        KeywordSkillCardEntriesInner.validateJsonObject(jsonArrayentries.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordSkillCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordSkillCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordSkillCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordSkillCard.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordSkillCard>() {
           @Override
           public void write(JsonWriter out, KeywordSkillCard value) throws IOException {
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
           public KeywordSkillCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             KeywordSkillCard instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of KeywordSkillCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeywordSkillCard
  * @throws IOException if the JSON string is invalid with respect to KeywordSkillCard
  */
  public static KeywordSkillCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordSkillCard.class);
  }

 /**
  * Convert an instance of KeywordSkillCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

