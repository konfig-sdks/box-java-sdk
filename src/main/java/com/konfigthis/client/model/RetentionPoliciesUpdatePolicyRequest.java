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
import com.konfigthis.client.model.UserBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * RetentionPoliciesUpdatePolicyRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RetentionPoliciesUpdatePolicyRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policy_name";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  private String policyName;

  /**
   * Gets or Sets dispositionAction
   */
  @JsonAdapter(DispositionActionEnum.Adapter.class)
 public enum DispositionActionEnum {
    PERMANENTLY_DELETE("permanently_delete"),
    
    REMOVE_RETENTION("remove_retention");

    private String value;

    DispositionActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DispositionActionEnum fromValue(String value) {
      for (DispositionActionEnum b : DispositionActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DispositionActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DispositionActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DispositionActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DispositionActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISPOSITION_ACTION = "disposition_action";
  @SerializedName(SERIALIZED_NAME_DISPOSITION_ACTION)
  private DispositionActionEnum dispositionAction;

  public static final String SERIALIZED_NAME_RETENTION_TYPE = "retention_type";
  @SerializedName(SERIALIZED_NAME_RETENTION_TYPE)
  private String retentionType;

  public static final String SERIALIZED_NAME_RETENTION_LENGTH = "retention_length";
  @SerializedName(SERIALIZED_NAME_RETENTION_LENGTH)
  private Object retentionLength = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CAN_OWNER_EXTEND_RETENTION = "can_owner_extend_retention";
  @SerializedName(SERIALIZED_NAME_CAN_OWNER_EXTEND_RETENTION)
  private Boolean canOwnerExtendRetention;

  public static final String SERIALIZED_NAME_ARE_OWNERS_NOTIFIED = "are_owners_notified";
  @SerializedName(SERIALIZED_NAME_ARE_OWNERS_NOTIFIED)
  private Boolean areOwnersNotified;

  public static final String SERIALIZED_NAME_CUSTOM_NOTIFICATION_RECIPIENTS = "custom_notification_recipients";
  @SerializedName(SERIALIZED_NAME_CUSTOM_NOTIFICATION_RECIPIENTS)
  private List<UserBase> customNotificationRecipients = null;

  public RetentionPoliciesUpdatePolicyRequest() {
  }

  public RetentionPoliciesUpdatePolicyRequest description(String description) {
    
    
    
    
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


  public RetentionPoliciesUpdatePolicyRequest policyName(String policyName) {
    
    
    
    
    this.policyName = policyName;
    return this;
  }

   /**
   * The name for the retention policy
   * @return policyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Some Policy Name", value = "The name for the retention policy")

  public String getPolicyName() {
    return policyName;
  }


  public void setPolicyName(String policyName) {
    
    
    
    this.policyName = policyName;
  }


  public RetentionPoliciesUpdatePolicyRequest dispositionAction(DispositionActionEnum dispositionAction) {
    
    
    
    
    this.dispositionAction = dispositionAction;
    return this;
  }

   /**
   * Get dispositionAction
   * @return dispositionAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DispositionActionEnum getDispositionAction() {
    return dispositionAction;
  }


  public void setDispositionAction(DispositionActionEnum dispositionAction) {
    
    
    
    this.dispositionAction = dispositionAction;
  }


  public RetentionPoliciesUpdatePolicyRequest retentionType(String retentionType) {
    
    
    
    
    this.retentionType = retentionType;
    return this;
  }

   /**
   * Specifies the retention type:  * &#x60;modifiable&#x60;: You can modify the retention policy. For example, you can add or remove folders, shorten or lengthen the policy duration, or delete the assignment. Use this type if your retention policy is not related to any regulatory purposes. * &#x60;non-modifiable&#x60;: You can modify the retention policy only in a limited way: add a folder, lengthen the duration, retire the policy, change the disposition action or notification settings. You cannot perform other actions, such as deleting the assignment or shortening the policy duration. Use this type to ensure compliance with regulatory retention policies.  When updating a retention policy, you can use &#x60;non-modifiable&#x60; type only. You can convert a &#x60;modifiable&#x60; policy to &#x60;non-modifiable&#x60;, but not the other way around.
   * @return retentionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "non-modifiable", value = "Specifies the retention type:  * `modifiable`: You can modify the retention policy. For example, you can add or remove folders, shorten or lengthen the policy duration, or delete the assignment. Use this type if your retention policy is not related to any regulatory purposes. * `non-modifiable`: You can modify the retention policy only in a limited way: add a folder, lengthen the duration, retire the policy, change the disposition action or notification settings. You cannot perform other actions, such as deleting the assignment or shortening the policy duration. Use this type to ensure compliance with regulatory retention policies.  When updating a retention policy, you can use `non-modifiable` type only. You can convert a `modifiable` policy to `non-modifiable`, but not the other way around.")

  public String getRetentionType() {
    return retentionType;
  }


  public void setRetentionType(String retentionType) {
    
    
    
    this.retentionType = retentionType;
  }


  public RetentionPoliciesUpdatePolicyRequest retentionLength(Object retentionLength) {
    
    
    
    
    this.retentionLength = retentionLength;
    return this;
  }

   /**
   * Get retentionLength
   * @return retentionLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getRetentionLength() {
    return retentionLength;
  }


  public void setRetentionLength(Object retentionLength) {
    
    
    
    this.retentionLength = retentionLength;
  }


  public RetentionPoliciesUpdatePolicyRequest status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Used to retire a retention policy.  If not retiring a policy, do not include this parameter or set it to &#x60;null&#x60;.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "retired", value = "Used to retire a retention policy.  If not retiring a policy, do not include this parameter or set it to `null`.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public RetentionPoliciesUpdatePolicyRequest canOwnerExtendRetention(Boolean canOwnerExtendRetention) {
    
    
    
    
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


  public RetentionPoliciesUpdatePolicyRequest areOwnersNotified(Boolean areOwnersNotified) {
    
    
    
    
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


  public RetentionPoliciesUpdatePolicyRequest customNotificationRecipients(List<UserBase> customNotificationRecipients) {
    
    
    
    
    this.customNotificationRecipients = customNotificationRecipients;
    return this;
  }

  public RetentionPoliciesUpdatePolicyRequest addCustomNotificationRecipientsItem(UserBase customNotificationRecipientsItem) {
    if (this.customNotificationRecipients == null) {
      this.customNotificationRecipients = new ArrayList<>();
    }
    this.customNotificationRecipients.add(customNotificationRecipientsItem);
    return this;
  }

   /**
   * A list of users notified when the retention duration is about to end.
   * @return customNotificationRecipients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of users notified when the retention duration is about to end.")

  public List<UserBase> getCustomNotificationRecipients() {
    return customNotificationRecipients;
  }


  public void setCustomNotificationRecipients(List<UserBase> customNotificationRecipients) {
    
    
    
    this.customNotificationRecipients = customNotificationRecipients;
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
   * @return the RetentionPoliciesUpdatePolicyRequest instance itself
   */
  public RetentionPoliciesUpdatePolicyRequest putAdditionalProperty(String key, Object value) {
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
    RetentionPoliciesUpdatePolicyRequest retentionPoliciesUpdatePolicyRequest = (RetentionPoliciesUpdatePolicyRequest) o;
    return Objects.equals(this.description, retentionPoliciesUpdatePolicyRequest.description) &&
        Objects.equals(this.policyName, retentionPoliciesUpdatePolicyRequest.policyName) &&
        Objects.equals(this.dispositionAction, retentionPoliciesUpdatePolicyRequest.dispositionAction) &&
        Objects.equals(this.retentionType, retentionPoliciesUpdatePolicyRequest.retentionType) &&
        Objects.equals(this.retentionLength, retentionPoliciesUpdatePolicyRequest.retentionLength) &&
        Objects.equals(this.status, retentionPoliciesUpdatePolicyRequest.status) &&
        Objects.equals(this.canOwnerExtendRetention, retentionPoliciesUpdatePolicyRequest.canOwnerExtendRetention) &&
        Objects.equals(this.areOwnersNotified, retentionPoliciesUpdatePolicyRequest.areOwnersNotified) &&
        Objects.equals(this.customNotificationRecipients, retentionPoliciesUpdatePolicyRequest.customNotificationRecipients)&&
        Objects.equals(this.additionalProperties, retentionPoliciesUpdatePolicyRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, policyName, dispositionAction, retentionType, retentionLength, status, canOwnerExtendRetention, areOwnersNotified, customNotificationRecipients, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionPoliciesUpdatePolicyRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    dispositionAction: ").append(toIndentedString(dispositionAction)).append("\n");
    sb.append("    retentionType: ").append(toIndentedString(retentionType)).append("\n");
    sb.append("    retentionLength: ").append(toIndentedString(retentionLength)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    canOwnerExtendRetention: ").append(toIndentedString(canOwnerExtendRetention)).append("\n");
    sb.append("    areOwnersNotified: ").append(toIndentedString(areOwnersNotified)).append("\n");
    sb.append("    customNotificationRecipients: ").append(toIndentedString(customNotificationRecipients)).append("\n");
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
    openapiFields.add("policy_name");
    openapiFields.add("disposition_action");
    openapiFields.add("retention_type");
    openapiFields.add("retention_length");
    openapiFields.add("status");
    openapiFields.add("can_owner_extend_retention");
    openapiFields.add("are_owners_notified");
    openapiFields.add("custom_notification_recipients");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetentionPoliciesUpdatePolicyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetentionPoliciesUpdatePolicyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetentionPoliciesUpdatePolicyRequest is not found in the empty JSON string", RetentionPoliciesUpdatePolicyRequest.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonNull() && (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("policy_name").isJsonNull() && (jsonObj.get("policy_name") != null && !jsonObj.get("policy_name").isJsonNull()) && !jsonObj.get("policy_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_name").toString()));
      }
      if (!jsonObj.get("disposition_action").isJsonNull() && (jsonObj.get("disposition_action") != null && !jsonObj.get("disposition_action").isJsonNull()) && !jsonObj.get("disposition_action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disposition_action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disposition_action").toString()));
      }
      if (!jsonObj.get("retention_type").isJsonNull() && (jsonObj.get("retention_type") != null && !jsonObj.get("retention_type").isJsonNull()) && !jsonObj.get("retention_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retention_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retention_type").toString()));
      }
      if (!jsonObj.get("status").isJsonNull() && (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
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
            UserBase.validateJsonObject(jsonArraycustomNotificationRecipients.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetentionPoliciesUpdatePolicyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetentionPoliciesUpdatePolicyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetentionPoliciesUpdatePolicyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetentionPoliciesUpdatePolicyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RetentionPoliciesUpdatePolicyRequest>() {
           @Override
           public void write(JsonWriter out, RetentionPoliciesUpdatePolicyRequest value) throws IOException {
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
           public RetentionPoliciesUpdatePolicyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RetentionPoliciesUpdatePolicyRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RetentionPoliciesUpdatePolicyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetentionPoliciesUpdatePolicyRequest
  * @throws IOException if the JSON string is invalid with respect to RetentionPoliciesUpdatePolicyRequest
  */
  public static RetentionPoliciesUpdatePolicyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetentionPoliciesUpdatePolicyRequest.class);
  }

 /**
  * Convert an instance of RetentionPoliciesUpdatePolicyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

