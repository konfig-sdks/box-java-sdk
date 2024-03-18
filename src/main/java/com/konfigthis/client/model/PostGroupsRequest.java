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
 * PostGroupsRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PostGroupsRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROVENANCE = "provenance";
  @SerializedName(SERIALIZED_NAME_PROVENANCE)
  private String provenance;

  public static final String SERIALIZED_NAME_EXTERNAL_SYNC_IDENTIFIER = "external_sync_identifier";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SYNC_IDENTIFIER)
  private String externalSyncIdentifier;

  /**
   * Specifies who can invite the group to collaborate on folders.  When set to &#x60;admins_only&#x60; the enterprise admin, co-admins, and the group&#39;s admin can invite the group.  When set to &#x60;admins_and_members&#x60; all the admins listed above and group members can invite the group.  When set to &#x60;all_managed_users&#x60; all managed users in the enterprise can invite the group.
   */
  @JsonAdapter(InvitabilityLevelEnum.Adapter.class)
 public enum InvitabilityLevelEnum {
    ADMINS_ONLY("admins_only"),
    
    ADMINS_AND_MEMBERS("admins_and_members"),
    
    ALL_MANAGED_USERS("all_managed_users");

    private String value;

    InvitabilityLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InvitabilityLevelEnum fromValue(String value) {
      for (InvitabilityLevelEnum b : InvitabilityLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InvitabilityLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InvitabilityLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InvitabilityLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InvitabilityLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INVITABILITY_LEVEL = "invitability_level";
  @SerializedName(SERIALIZED_NAME_INVITABILITY_LEVEL)
  private InvitabilityLevelEnum invitabilityLevel;

  /**
   * Specifies who can see the members of the group.  * &#x60;admins_only&#x60; - the enterprise admin, co-admins, group&#39;s   group admin * &#x60;admins_and_members&#x60; - all admins and group members * &#x60;all_managed_users&#x60; - all managed users in the   enterprise
   */
  @JsonAdapter(MemberViewabilityLevelEnum.Adapter.class)
 public enum MemberViewabilityLevelEnum {
    ADMINS_ONLY("admins_only"),
    
    ADMINS_AND_MEMBERS("admins_and_members"),
    
    ALL_MANAGED_USERS("all_managed_users");

    private String value;

    MemberViewabilityLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MemberViewabilityLevelEnum fromValue(String value) {
      for (MemberViewabilityLevelEnum b : MemberViewabilityLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MemberViewabilityLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MemberViewabilityLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MemberViewabilityLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MemberViewabilityLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MEMBER_VIEWABILITY_LEVEL = "member_viewability_level";
  @SerializedName(SERIALIZED_NAME_MEMBER_VIEWABILITY_LEVEL)
  private MemberViewabilityLevelEnum memberViewabilityLevel;

  public PostGroupsRequest() {
  }

  public PostGroupsRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A human readable description of the group.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"Customer Support Group - as imported from Active Directory\"", value = "A human readable description of the group.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public PostGroupsRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the new group to be created. This name must be unique within the enterprise.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Customer Support", required = true, value = "The name of the new group to be created. This name must be unique within the enterprise.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public PostGroupsRequest provenance(String provenance) {
    
    
    
    
    this.provenance = provenance;
    return this;
  }

   /**
   * Keeps track of which external source this group is coming, for example &#x60;Active Directory&#x60;, or &#x60;Okta&#x60;.  Setting this will also prevent Box admins from editing the group name and its members directly via the Box web application.  This is desirable for one-way syncing of groups.
   * @return provenance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Active Directory", value = "Keeps track of which external source this group is coming, for example `Active Directory`, or `Okta`.  Setting this will also prevent Box admins from editing the group name and its members directly via the Box web application.  This is desirable for one-way syncing of groups.")

  public String getProvenance() {
    return provenance;
  }


  public void setProvenance(String provenance) {
    
    
    
    this.provenance = provenance;
  }


  public PostGroupsRequest externalSyncIdentifier(String externalSyncIdentifier) {
    
    
    
    
    this.externalSyncIdentifier = externalSyncIdentifier;
    return this;
  }

   /**
   * An arbitrary identifier that can be used by external group sync tools to link this Box Group to an external group.  Example values of this field could be an **Active Directory Object ID** or a **Google Group ID**.  We recommend you use of this field in order to avoid issues when group names are updated in either Box or external systems.
   * @return externalSyncIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AD:123456", value = "An arbitrary identifier that can be used by external group sync tools to link this Box Group to an external group.  Example values of this field could be an **Active Directory Object ID** or a **Google Group ID**.  We recommend you use of this field in order to avoid issues when group names are updated in either Box or external systems.")

  public String getExternalSyncIdentifier() {
    return externalSyncIdentifier;
  }


  public void setExternalSyncIdentifier(String externalSyncIdentifier) {
    
    
    
    this.externalSyncIdentifier = externalSyncIdentifier;
  }


  public PostGroupsRequest invitabilityLevel(InvitabilityLevelEnum invitabilityLevel) {
    
    
    
    
    this.invitabilityLevel = invitabilityLevel;
    return this;
  }

   /**
   * Specifies who can invite the group to collaborate on folders.  When set to &#x60;admins_only&#x60; the enterprise admin, co-admins, and the group&#39;s admin can invite the group.  When set to &#x60;admins_and_members&#x60; all the admins listed above and group members can invite the group.  When set to &#x60;all_managed_users&#x60; all managed users in the enterprise can invite the group.
   * @return invitabilityLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ADMINS_ONLY", value = "Specifies who can invite the group to collaborate on folders.  When set to `admins_only` the enterprise admin, co-admins, and the group's admin can invite the group.  When set to `admins_and_members` all the admins listed above and group members can invite the group.  When set to `all_managed_users` all managed users in the enterprise can invite the group.")

  public InvitabilityLevelEnum getInvitabilityLevel() {
    return invitabilityLevel;
  }


  public void setInvitabilityLevel(InvitabilityLevelEnum invitabilityLevel) {
    
    
    
    this.invitabilityLevel = invitabilityLevel;
  }


  public PostGroupsRequest memberViewabilityLevel(MemberViewabilityLevelEnum memberViewabilityLevel) {
    
    
    
    
    this.memberViewabilityLevel = memberViewabilityLevel;
    return this;
  }

   /**
   * Specifies who can see the members of the group.  * &#x60;admins_only&#x60; - the enterprise admin, co-admins, group&#39;s   group admin * &#x60;admins_and_members&#x60; - all admins and group members * &#x60;all_managed_users&#x60; - all managed users in the   enterprise
   * @return memberViewabilityLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ADMINS_ONLY", value = "Specifies who can see the members of the group.  * `admins_only` - the enterprise admin, co-admins, group's   group admin * `admins_and_members` - all admins and group members * `all_managed_users` - all managed users in the   enterprise")

  public MemberViewabilityLevelEnum getMemberViewabilityLevel() {
    return memberViewabilityLevel;
  }


  public void setMemberViewabilityLevel(MemberViewabilityLevelEnum memberViewabilityLevel) {
    
    
    
    this.memberViewabilityLevel = memberViewabilityLevel;
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
   * @return the PostGroupsRequest instance itself
   */
  public PostGroupsRequest putAdditionalProperty(String key, Object value) {
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
    PostGroupsRequest postGroupsRequest = (PostGroupsRequest) o;
    return Objects.equals(this.description, postGroupsRequest.description) &&
        Objects.equals(this.name, postGroupsRequest.name) &&
        Objects.equals(this.provenance, postGroupsRequest.provenance) &&
        Objects.equals(this.externalSyncIdentifier, postGroupsRequest.externalSyncIdentifier) &&
        Objects.equals(this.invitabilityLevel, postGroupsRequest.invitabilityLevel) &&
        Objects.equals(this.memberViewabilityLevel, postGroupsRequest.memberViewabilityLevel)&&
        Objects.equals(this.additionalProperties, postGroupsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, provenance, externalSyncIdentifier, invitabilityLevel, memberViewabilityLevel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostGroupsRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    provenance: ").append(toIndentedString(provenance)).append("\n");
    sb.append("    externalSyncIdentifier: ").append(toIndentedString(externalSyncIdentifier)).append("\n");
    sb.append("    invitabilityLevel: ").append(toIndentedString(invitabilityLevel)).append("\n");
    sb.append("    memberViewabilityLevel: ").append(toIndentedString(memberViewabilityLevel)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("provenance");
    openapiFields.add("external_sync_identifier");
    openapiFields.add("invitability_level");
    openapiFields.add("member_viewability_level");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostGroupsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PostGroupsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostGroupsRequest is not found in the empty JSON string", PostGroupsRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PostGroupsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("provenance") != null && !jsonObj.get("provenance").isJsonNull()) && !jsonObj.get("provenance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provenance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provenance").toString()));
      }
      if ((jsonObj.get("external_sync_identifier") != null && !jsonObj.get("external_sync_identifier").isJsonNull()) && !jsonObj.get("external_sync_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_sync_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_sync_identifier").toString()));
      }
      if ((jsonObj.get("invitability_level") != null && !jsonObj.get("invitability_level").isJsonNull()) && !jsonObj.get("invitability_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invitability_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invitability_level").toString()));
      }
      if ((jsonObj.get("member_viewability_level") != null && !jsonObj.get("member_viewability_level").isJsonNull()) && !jsonObj.get("member_viewability_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_viewability_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_viewability_level").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostGroupsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostGroupsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostGroupsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostGroupsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PostGroupsRequest>() {
           @Override
           public void write(JsonWriter out, PostGroupsRequest value) throws IOException {
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
           public PostGroupsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PostGroupsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PostGroupsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostGroupsRequest
  * @throws IOException if the JSON string is invalid with respect to PostGroupsRequest
  */
  public static PostGroupsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostGroupsRequest.class);
  }

 /**
  * Convert an instance of PostGroupsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

