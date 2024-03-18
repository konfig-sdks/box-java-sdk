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
import com.konfigthis.client.model.RetentionPolicyAllOfAssignmentCounts;
import com.konfigthis.client.model.UserMini;
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
 * RetentionPolicyAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RetentionPolicyAllOf {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * The type of the retention policy. A retention policy type can either be &#x60;finite&#x60;, where a specific amount of time to retain the content is known upfront, or &#x60;indefinite&#x60;, where the amount of time to retain the content is still unknown.
   */
  @JsonAdapter(PolicyTypeEnum.Adapter.class)
 public enum PolicyTypeEnum {
    FINITE("finite"),
    
    INDEFINITE("indefinite");

    private String value;

    PolicyTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PolicyTypeEnum fromValue(String value) {
      for (PolicyTypeEnum b : PolicyTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PolicyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PolicyTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PolicyTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PolicyTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_POLICY_TYPE = "policy_type";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  private PolicyTypeEnum policyType;

  /**
   * Specifies the retention type:  * &#x60;modifiable&#x60;: You can modify the retention policy. For example,  you can add or remove folders, shorten or lengthen  the policy duration, or delete the assignment.  Use this type if your retention policy  is not related to any regulatory purposes.  * &#x60;non-modifiable&#x60;: You can modify the retention policy  only in a limited way: add a folder, lengthen the duration,  retire the policy, change the disposition action  or notification settings. You cannot perform other actions,  such as deleting the assignment or shortening the  policy duration. Use this type to ensure  compliance with regulatory retention policies.
   */
  @JsonAdapter(RetentionTypeEnum.Adapter.class)
 public enum RetentionTypeEnum {
    MODIFIABLE("modifiable"),
    
    NON_MODIFIABLE("non_modifiable");

    private String value;

    RetentionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RetentionTypeEnum fromValue(String value) {
      for (RetentionTypeEnum b : RetentionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RetentionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RetentionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RetentionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RetentionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RETENTION_TYPE = "retention_type";
  @SerializedName(SERIALIZED_NAME_RETENTION_TYPE)
  private RetentionTypeEnum retentionType;

  /**
   * The status of the retention policy. The status of a policy will be &#x60;active&#x60;, unless explicitly retired by an administrator, in which case the status will be &#x60;retired&#x60;. Once a policy has been retired, it cannot become active again.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    ACTIVE("active"),
    
    RETIRED("retired");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UserMini createdBy;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_MODIFIED_AT = "modified_at";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT)
  private OffsetDateTime modifiedAt;

  public static final String SERIALIZED_NAME_CAN_OWNER_EXTEND_RETENTION = "can_owner_extend_retention";
  @SerializedName(SERIALIZED_NAME_CAN_OWNER_EXTEND_RETENTION)
  private Boolean canOwnerExtendRetention;

  public static final String SERIALIZED_NAME_ARE_OWNERS_NOTIFIED = "are_owners_notified";
  @SerializedName(SERIALIZED_NAME_ARE_OWNERS_NOTIFIED)
  private Boolean areOwnersNotified;

  public static final String SERIALIZED_NAME_CUSTOM_NOTIFICATION_RECIPIENTS = "custom_notification_recipients";
  @SerializedName(SERIALIZED_NAME_CUSTOM_NOTIFICATION_RECIPIENTS)
  private List<UserMini> customNotificationRecipients = null;

  public static final String SERIALIZED_NAME_ASSIGNMENT_COUNTS = "assignment_counts";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENT_COUNTS)
  private RetentionPolicyAllOfAssignmentCounts assignmentCounts;

  public RetentionPolicyAllOf() {
  }

  public RetentionPolicyAllOf description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The additional text description of the retention policy.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Policy to retain all reports for at least one month", value = "The additional text description of the retention policy.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public RetentionPolicyAllOf policyType(PolicyTypeEnum policyType) {
    
    
    
    
    this.policyType = policyType;
    return this;
  }

   /**
   * The type of the retention policy. A retention policy type can either be &#x60;finite&#x60;, where a specific amount of time to retain the content is known upfront, or &#x60;indefinite&#x60;, where the amount of time to retain the content is still unknown.
   * @return policyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FINITE", value = "The type of the retention policy. A retention policy type can either be `finite`, where a specific amount of time to retain the content is known upfront, or `indefinite`, where the amount of time to retain the content is still unknown.")

  public PolicyTypeEnum getPolicyType() {
    return policyType;
  }


  public void setPolicyType(PolicyTypeEnum policyType) {
    
    
    
    this.policyType = policyType;
  }


  public RetentionPolicyAllOf retentionType(RetentionTypeEnum retentionType) {
    
    
    
    
    this.retentionType = retentionType;
    return this;
  }

   /**
   * Specifies the retention type:  * &#x60;modifiable&#x60;: You can modify the retention policy. For example,  you can add or remove folders, shorten or lengthen  the policy duration, or delete the assignment.  Use this type if your retention policy  is not related to any regulatory purposes.  * &#x60;non-modifiable&#x60;: You can modify the retention policy  only in a limited way: add a folder, lengthen the duration,  retire the policy, change the disposition action  or notification settings. You cannot perform other actions,  such as deleting the assignment or shortening the  policy duration. Use this type to ensure  compliance with regulatory retention policies.
   * @return retentionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NON_MODIFIABLE", value = "Specifies the retention type:  * `modifiable`: You can modify the retention policy. For example,  you can add or remove folders, shorten or lengthen  the policy duration, or delete the assignment.  Use this type if your retention policy  is not related to any regulatory purposes.  * `non-modifiable`: You can modify the retention policy  only in a limited way: add a folder, lengthen the duration,  retire the policy, change the disposition action  or notification settings. You cannot perform other actions,  such as deleting the assignment or shortening the  policy duration. Use this type to ensure  compliance with regulatory retention policies.")

  public RetentionTypeEnum getRetentionType() {
    return retentionType;
  }


  public void setRetentionType(RetentionTypeEnum retentionType) {
    
    
    
    this.retentionType = retentionType;
  }


  public RetentionPolicyAllOf status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of the retention policy. The status of a policy will be &#x60;active&#x60;, unless explicitly retired by an administrator, in which case the status will be &#x60;retired&#x60;. Once a policy has been retired, it cannot become active again.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACTIVE", value = "The status of the retention policy. The status of a policy will be `active`, unless explicitly retired by an administrator, in which case the status will be `retired`. Once a policy has been retired, it cannot become active again.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public RetentionPolicyAllOf createdBy(UserMini createdBy) {
    
    
    
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserMini getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(UserMini createdBy) {
    
    
    
    this.createdBy = createdBy;
  }


  public RetentionPolicyAllOf createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When the retention policy object was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When the retention policy object was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public RetentionPolicyAllOf modifiedAt(OffsetDateTime modifiedAt) {
    
    
    
    
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * When the retention policy object was last modified.
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When the retention policy object was last modified.")

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }


  public void setModifiedAt(OffsetDateTime modifiedAt) {
    
    
    
    this.modifiedAt = modifiedAt;
  }


  public RetentionPolicyAllOf canOwnerExtendRetention(Boolean canOwnerExtendRetention) {
    
    
    
    
    this.canOwnerExtendRetention = canOwnerExtendRetention;
    return this;
  }

   /**
   * Determines if the owner of items under the policy can extend the retention when the original retention duration is about to end.
   * @return canOwnerExtendRetention
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Determines if the owner of items under the policy can extend the retention when the original retention duration is about to end.")

  public Boolean getCanOwnerExtendRetention() {
    return canOwnerExtendRetention;
  }


  public void setCanOwnerExtendRetention(Boolean canOwnerExtendRetention) {
    
    
    
    this.canOwnerExtendRetention = canOwnerExtendRetention;
  }


  public RetentionPolicyAllOf areOwnersNotified(Boolean areOwnersNotified) {
    
    
    
    
    this.areOwnersNotified = areOwnersNotified;
    return this;
  }

   /**
   * Determines if owners and co-owners of items under the policy are notified when the retention duration is about to end.
   * @return areOwnersNotified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Determines if owners and co-owners of items under the policy are notified when the retention duration is about to end.")

  public Boolean getAreOwnersNotified() {
    return areOwnersNotified;
  }


  public void setAreOwnersNotified(Boolean areOwnersNotified) {
    
    
    
    this.areOwnersNotified = areOwnersNotified;
  }


  public RetentionPolicyAllOf customNotificationRecipients(List<UserMini> customNotificationRecipients) {
    
    
    
    
    this.customNotificationRecipients = customNotificationRecipients;
    return this;
  }

  public RetentionPolicyAllOf addCustomNotificationRecipientsItem(UserMini customNotificationRecipientsItem) {
    if (this.customNotificationRecipients == null) {
      this.customNotificationRecipients = new ArrayList<>();
    }
    this.customNotificationRecipients.add(customNotificationRecipientsItem);
    return this;
  }

   /**
   * A list of users notified when the retention policy duration is about to end.
   * @return customNotificationRecipients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of users notified when the retention policy duration is about to end.")

  public List<UserMini> getCustomNotificationRecipients() {
    return customNotificationRecipients;
  }


  public void setCustomNotificationRecipients(List<UserMini> customNotificationRecipients) {
    
    
    
    this.customNotificationRecipients = customNotificationRecipients;
  }


  public RetentionPolicyAllOf assignmentCounts(RetentionPolicyAllOfAssignmentCounts assignmentCounts) {
    
    
    
    
    this.assignmentCounts = assignmentCounts;
    return this;
  }

   /**
   * Get assignmentCounts
   * @return assignmentCounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetentionPolicyAllOfAssignmentCounts getAssignmentCounts() {
    return assignmentCounts;
  }


  public void setAssignmentCounts(RetentionPolicyAllOfAssignmentCounts assignmentCounts) {
    
    
    
    this.assignmentCounts = assignmentCounts;
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
   * @return the RetentionPolicyAllOf instance itself
   */
  public RetentionPolicyAllOf putAdditionalProperty(String key, Object value) {
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
    RetentionPolicyAllOf retentionPolicyAllOf = (RetentionPolicyAllOf) o;
    return Objects.equals(this.description, retentionPolicyAllOf.description) &&
        Objects.equals(this.policyType, retentionPolicyAllOf.policyType) &&
        Objects.equals(this.retentionType, retentionPolicyAllOf.retentionType) &&
        Objects.equals(this.status, retentionPolicyAllOf.status) &&
        Objects.equals(this.createdBy, retentionPolicyAllOf.createdBy) &&
        Objects.equals(this.createdAt, retentionPolicyAllOf.createdAt) &&
        Objects.equals(this.modifiedAt, retentionPolicyAllOf.modifiedAt) &&
        Objects.equals(this.canOwnerExtendRetention, retentionPolicyAllOf.canOwnerExtendRetention) &&
        Objects.equals(this.areOwnersNotified, retentionPolicyAllOf.areOwnersNotified) &&
        Objects.equals(this.customNotificationRecipients, retentionPolicyAllOf.customNotificationRecipients) &&
        Objects.equals(this.assignmentCounts, retentionPolicyAllOf.assignmentCounts)&&
        Objects.equals(this.additionalProperties, retentionPolicyAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, policyType, retentionType, status, createdBy, createdAt, modifiedAt, canOwnerExtendRetention, areOwnersNotified, customNotificationRecipients, assignmentCounts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionPolicyAllOf {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    retentionType: ").append(toIndentedString(retentionType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    canOwnerExtendRetention: ").append(toIndentedString(canOwnerExtendRetention)).append("\n");
    sb.append("    areOwnersNotified: ").append(toIndentedString(areOwnersNotified)).append("\n");
    sb.append("    customNotificationRecipients: ").append(toIndentedString(customNotificationRecipients)).append("\n");
    sb.append("    assignmentCounts: ").append(toIndentedString(assignmentCounts)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("policy_type");
    openapiFields.add("retention_type");
    openapiFields.add("status");
    openapiFields.add("created_by");
    openapiFields.add("created_at");
    openapiFields.add("modified_at");
    openapiFields.add("can_owner_extend_retention");
    openapiFields.add("are_owners_notified");
    openapiFields.add("custom_notification_recipients");
    openapiFields.add("assignment_counts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetentionPolicyAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetentionPolicyAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetentionPolicyAllOf is not found in the empty JSON string", RetentionPolicyAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("policy_type") != null && !jsonObj.get("policy_type").isJsonNull()) && !jsonObj.get("policy_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_type").toString()));
      }
      if ((jsonObj.get("retention_type") != null && !jsonObj.get("retention_type").isJsonNull()) && !jsonObj.get("retention_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retention_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retention_type").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `created_by`
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) {
        UserMini.validateJsonObject(jsonObj.getAsJsonObject("created_by"));
      }
      if (jsonObj.get("custom_notification_recipients") != null && !jsonObj.get("custom_notification_recipients").isJsonNull()) {
        JsonArray jsonArraycustomNotificationRecipients = jsonObj.getAsJsonArray("custom_notification_recipients");
        if (jsonArraycustomNotificationRecipients != null) {
          // ensure the json data is an array
          if (!jsonObj.get("custom_notification_recipients").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `custom_notification_recipients` to be an array in the JSON string but got `%s`", jsonObj.get("custom_notification_recipients").toString()));
          }

          // validate the optional field `custom_notification_recipients` (array)
          for (int i = 0; i < jsonArraycustomNotificationRecipients.size(); i++) {
            UserMini.validateJsonObject(jsonArraycustomNotificationRecipients.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `assignment_counts`
      if (jsonObj.get("assignment_counts") != null && !jsonObj.get("assignment_counts").isJsonNull()) {
        RetentionPolicyAllOfAssignmentCounts.validateJsonObject(jsonObj.getAsJsonObject("assignment_counts"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetentionPolicyAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetentionPolicyAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetentionPolicyAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetentionPolicyAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<RetentionPolicyAllOf>() {
           @Override
           public void write(JsonWriter out, RetentionPolicyAllOf value) throws IOException {
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
           public RetentionPolicyAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RetentionPolicyAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RetentionPolicyAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetentionPolicyAllOf
  * @throws IOException if the JSON string is invalid with respect to RetentionPolicyAllOf
  */
  public static RetentionPolicyAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetentionPolicyAllOf.class);
  }

 /**
  * Convert an instance of RetentionPolicyAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
