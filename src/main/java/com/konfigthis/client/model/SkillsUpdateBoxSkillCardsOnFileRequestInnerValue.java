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
import com.konfigthis.client.model.StatusSkillCardInvocation;
import com.konfigthis.client.model.StatusSkillCardSkill;
import com.konfigthis.client.model.StatusSkillCardSkillCardTitle;
import com.konfigthis.client.model.StatusSkillCardStatus;
import com.konfigthis.client.model.TranscriptSkillCardEntriesInner;
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
 * SkillsUpdateBoxSkillCardsOnFileRequestInnerValue
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SkillsUpdateBoxSkillCardsOnFileRequestInnerValue {
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
   * &#x60;status&#x60;
   */
  @JsonAdapter(SkillCardTypeEnum.Adapter.class)
 public enum SkillCardTypeEnum {
    STATUS("status");

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
  private StatusSkillCardSkillCardTitle skillCardTitle;

  public static final String SERIALIZED_NAME_SKILL = "skill";
  @SerializedName(SERIALIZED_NAME_SKILL)
  private StatusSkillCardSkill skill;

  public static final String SERIALIZED_NAME_INVOCATION = "invocation";
  @SerializedName(SERIALIZED_NAME_INVOCATION)
  private StatusSkillCardInvocation invocation;

  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List<TranscriptSkillCardEntriesInner> entries = new ArrayList<>();

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusSkillCardStatus status;

  public SkillsUpdateBoxSkillCardsOnFileRequestInnerValue() {
  }

  public SkillsUpdateBoxSkillCardsOnFileRequestInnerValue createdAt(OffsetDateTime createdAt) {
    
    
    
    
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


  public SkillsUpdateBoxSkillCardsOnFileRequestInnerValue type(TypeEnum type) {
    
    
    
    
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


  public SkillsUpdateBoxSkillCardsOnFileRequestInnerValue skillCardType(SkillCardTypeEnum skillCardType) {
    
    
    
    
    this.skillCardType = skillCardType;
    return this;
  }

   /**
   * &#x60;status&#x60;
   * @return skillCardType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "STATUS", required = true, value = "`status`")

  public SkillCardTypeEnum getSkillCardType() {
    return skillCardType;
  }


  public void setSkillCardType(SkillCardTypeEnum skillCardType) {
    
    
    
    this.skillCardType = skillCardType;
  }


  public SkillsUpdateBoxSkillCardsOnFileRequestInnerValue skillCardTitle(StatusSkillCardSkillCardTitle skillCardTitle) {
    
    
    
    
    this.skillCardTitle = skillCardTitle;
    return this;
  }

   /**
   * Get skillCardTitle
   * @return skillCardTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusSkillCardSkillCardTitle getSkillCardTitle() {
    return skillCardTitle;
  }


  public void setSkillCardTitle(StatusSkillCardSkillCardTitle skillCardTitle) {
    
    
    
    this.skillCardTitle = skillCardTitle;
  }


  public SkillsUpdateBoxSkillCardsOnFileRequestInnerValue skill(StatusSkillCardSkill skill) {
    
    
    
    
    this.skill = skill;
    return this;
  }

   /**
   * Get skill
   * @return skill
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public StatusSkillCardSkill getSkill() {
    return skill;
  }


  public void setSkill(StatusSkillCardSkill skill) {
    
    
    
    this.skill = skill;
  }


  public SkillsUpdateBoxSkillCardsOnFileRequestInnerValue invocation(StatusSkillCardInvocation invocation) {
    
    
    
    
    this.invocation = invocation;
    return this;
  }

   /**
   * Get invocation
   * @return invocation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public StatusSkillCardInvocation getInvocation() {
    return invocation;
  }


  public void setInvocation(StatusSkillCardInvocation invocation) {
    
    
    
    this.invocation = invocation;
  }


  public SkillsUpdateBoxSkillCardsOnFileRequestInnerValue entries(List<TranscriptSkillCardEntriesInner> entries) {
    
    
    
    
    this.entries = entries;
    return this;
  }

  public SkillsUpdateBoxSkillCardsOnFileRequestInnerValue addEntriesItem(TranscriptSkillCardEntriesInner entriesItem) {
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * An list of entries for the card. This represents the individual entries of the transcription.
   * @return entries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An list of entries for the card. This represents the individual entries of the transcription.")

  public List<TranscriptSkillCardEntriesInner> getEntries() {
    return entries;
  }


  public void setEntries(List<TranscriptSkillCardEntriesInner> entries) {
    
    
    
    this.entries = entries;
  }


  public SkillsUpdateBoxSkillCardsOnFileRequestInnerValue duration(Integer duration) {
    
    
    
    
    this.duration = duration;
    return this;
  }

   /**
   * An optional total duration in seconds.  Used with a &#x60;skill_card_type&#x60; of &#x60;transcript&#x60; or &#x60;timeline&#x60;.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "An optional total duration in seconds.  Used with a `skill_card_type` of `transcript` or `timeline`.")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    
    
    
    this.duration = duration;
  }


  public SkillsUpdateBoxSkillCardsOnFileRequestInnerValue status(StatusSkillCardStatus status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public StatusSkillCardStatus getStatus() {
    return status;
  }


  public void setStatus(StatusSkillCardStatus status) {
    
    
    
    this.status = status;
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
   * @return the SkillsUpdateBoxSkillCardsOnFileRequestInnerValue instance itself
   */
  public SkillsUpdateBoxSkillCardsOnFileRequestInnerValue putAdditionalProperty(String key, Object value) {
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
    SkillsUpdateBoxSkillCardsOnFileRequestInnerValue skillsUpdateBoxSkillCardsOnFileRequestInnerValue = (SkillsUpdateBoxSkillCardsOnFileRequestInnerValue) o;
    return Objects.equals(this.createdAt, skillsUpdateBoxSkillCardsOnFileRequestInnerValue.createdAt) &&
        Objects.equals(this.type, skillsUpdateBoxSkillCardsOnFileRequestInnerValue.type) &&
        Objects.equals(this.skillCardType, skillsUpdateBoxSkillCardsOnFileRequestInnerValue.skillCardType) &&
        Objects.equals(this.skillCardTitle, skillsUpdateBoxSkillCardsOnFileRequestInnerValue.skillCardTitle) &&
        Objects.equals(this.skill, skillsUpdateBoxSkillCardsOnFileRequestInnerValue.skill) &&
        Objects.equals(this.invocation, skillsUpdateBoxSkillCardsOnFileRequestInnerValue.invocation) &&
        Objects.equals(this.entries, skillsUpdateBoxSkillCardsOnFileRequestInnerValue.entries) &&
        Objects.equals(this.duration, skillsUpdateBoxSkillCardsOnFileRequestInnerValue.duration) &&
        Objects.equals(this.status, skillsUpdateBoxSkillCardsOnFileRequestInnerValue.status)&&
        Objects.equals(this.additionalProperties, skillsUpdateBoxSkillCardsOnFileRequestInnerValue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, type, skillCardType, skillCardTitle, skill, invocation, entries, duration, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillsUpdateBoxSkillCardsOnFileRequestInnerValue {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    skillCardType: ").append(toIndentedString(skillCardType)).append("\n");
    sb.append("    skillCardTitle: ").append(toIndentedString(skillCardTitle)).append("\n");
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    invocation: ").append(toIndentedString(invocation)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("duration");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("skill_card_type");
    openapiRequiredFields.add("skill");
    openapiRequiredFields.add("invocation");
    openapiRequiredFields.add("entries");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkillsUpdateBoxSkillCardsOnFileRequestInnerValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SkillsUpdateBoxSkillCardsOnFileRequestInnerValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkillsUpdateBoxSkillCardsOnFileRequestInnerValue is not found in the empty JSON string", SkillsUpdateBoxSkillCardsOnFileRequestInnerValue.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SkillsUpdateBoxSkillCardsOnFileRequestInnerValue.openapiRequiredFields) {
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
        StatusSkillCardSkillCardTitle.validateJsonObject(jsonObj.getAsJsonObject("skill_card_title"));
      }
      // validate the required field `skill`
      StatusSkillCardSkill.validateJsonObject(jsonObj.getAsJsonObject("skill"));
      // validate the required field `invocation`
      StatusSkillCardInvocation.validateJsonObject(jsonObj.getAsJsonObject("invocation"));
      // ensure the json data is an array
      if (!jsonObj.get("entries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `entries` to be an array in the JSON string but got `%s`", jsonObj.get("entries").toString()));
      }

      JsonArray jsonArrayentries = jsonObj.getAsJsonArray("entries");
      // validate the required field `entries` (array)
      for (int i = 0; i < jsonArrayentries.size(); i++) {
        TranscriptSkillCardEntriesInner.validateJsonObject(jsonArrayentries.get(i).getAsJsonObject());
      };
      // validate the required field `status`
      StatusSkillCardStatus.validateJsonObject(jsonObj.getAsJsonObject("status"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkillsUpdateBoxSkillCardsOnFileRequestInnerValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkillsUpdateBoxSkillCardsOnFileRequestInnerValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkillsUpdateBoxSkillCardsOnFileRequestInnerValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkillsUpdateBoxSkillCardsOnFileRequestInnerValue.class));

       return (TypeAdapter<T>) new TypeAdapter<SkillsUpdateBoxSkillCardsOnFileRequestInnerValue>() {
           @Override
           public void write(JsonWriter out, SkillsUpdateBoxSkillCardsOnFileRequestInnerValue value) throws IOException {
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
           public SkillsUpdateBoxSkillCardsOnFileRequestInnerValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SkillsUpdateBoxSkillCardsOnFileRequestInnerValue instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SkillsUpdateBoxSkillCardsOnFileRequestInnerValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkillsUpdateBoxSkillCardsOnFileRequestInnerValue
  * @throws IOException if the JSON string is invalid with respect to SkillsUpdateBoxSkillCardsOnFileRequestInnerValue
  */
  public static SkillsUpdateBoxSkillCardsOnFileRequestInnerValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkillsUpdateBoxSkillCardsOnFileRequestInnerValue.class);
  }

 /**
  * Convert an instance of SkillsUpdateBoxSkillCardsOnFileRequestInnerValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

