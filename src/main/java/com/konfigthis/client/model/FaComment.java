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
import com.konfigthis.client.model.FaCommentBase;
import com.konfigthis.client.model.FileActivityUser;
import com.konfigthis.client.model.Reply;
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
 * Standard representation of a comment.
 */
@ApiModel(description = "Standard representation of a comment.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FaComment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * type of the object
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    COMMENT("comment");

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

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private FileActivityUser createdBy;

  public static final String SERIALIZED_NAME_IS_REPLY_COMMENT = "is_reply_comment";
  @SerializedName(SERIALIZED_NAME_IS_REPLY_COMMENT)
  private Boolean isReplyComment;

  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private FaCommentBase item;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_MODIFIED_AT = "modified_at";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT)
  private OffsetDateTime modifiedAt;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private FaCommentBase parent;

  public static final String SERIALIZED_NAME_REPLIES = "replies";
  @SerializedName(SERIALIZED_NAME_REPLIES)
  private List<Reply> replies = null;

  /**
   * status of the comment
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    OPEN("open"),
    
    RESOLVED("resolved"),
    
    DELETED("deleted");

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

  public static final String SERIALIZED_NAME_TOTAL_REPLY_COUNT = "total_reply_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_REPLY_COUNT)
  private Double totalReplyCount;

  public FaComment() {
  }

  public FaComment id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * A unique id of the comment
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123", required = true, value = "A unique id of the comment")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public FaComment type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * type of the object
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COMMENT", value = "type of the object")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public FaComment createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When the comment object was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When the comment object was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public FaComment createdBy(FileActivityUser createdBy) {
    
    
    
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileActivityUser getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(FileActivityUser createdBy) {
    
    
    
    this.createdBy = createdBy;
  }


  public FaComment isReplyComment(Boolean isReplyComment) {
    
    
    
    
    this.isReplyComment = isReplyComment;
    return this;
  }

   /**
   * Whether or not this comment is a reply to another comment.
   * @return isReplyComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether or not this comment is a reply to another comment.")

  public Boolean getIsReplyComment() {
    return isReplyComment;
  }


  public void setIsReplyComment(Boolean isReplyComment) {
    
    
    
    this.isReplyComment = isReplyComment;
  }


  public FaComment item(FaCommentBase item) {
    
    
    
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FaCommentBase getItem() {
    return item;
  }


  public void setItem(FaCommentBase item) {
    
    
    
    this.item = item;
  }


  public FaComment message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * The text of the comment, as provided by the user.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hey, this is my comment.", value = "The text of the comment, as provided by the user.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
  }


  public FaComment modifiedAt(OffsetDateTime modifiedAt) {
    
    
    
    
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * When the comment object was modified.
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When the comment object was modified.")

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }


  public void setModifiedAt(OffsetDateTime modifiedAt) {
    
    
    
    this.modifiedAt = modifiedAt;
  }


  public FaComment parent(FaCommentBase parent) {
    
    
    
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FaCommentBase getParent() {
    return parent;
  }


  public void setParent(FaCommentBase parent) {
    
    
    
    this.parent = parent;
  }


  public FaComment replies(List<Reply> replies) {
    
    
    
    
    this.replies = replies;
    return this;
  }

  public FaComment addRepliesItem(Reply repliesItem) {
    if (this.replies == null) {
      this.replies = new ArrayList<>();
    }
    this.replies.add(repliesItem);
    return this;
  }

   /**
   * Array of reply comments
   * @return replies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of reply comments")

  public List<Reply> getReplies() {
    return replies;
  }


  public void setReplies(List<Reply> replies) {
    
    
    
    this.replies = replies;
  }


  public FaComment status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * status of the comment
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RESOLVED", value = "status of the comment")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public FaComment totalReplyCount(Double totalReplyCount) {
    
    
    
    
    this.totalReplyCount = totalReplyCount;
    return this;
  }

  public FaComment totalReplyCount(Integer totalReplyCount) {
    
    
    
    
    this.totalReplyCount = totalReplyCount.doubleValue();
    return this;
  }

   /**
   * Total replies that are present for the comment
   * @return totalReplyCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "Total replies that are present for the comment")

  public Double getTotalReplyCount() {
    return totalReplyCount;
  }


  public void setTotalReplyCount(Double totalReplyCount) {
    
    
    
    this.totalReplyCount = totalReplyCount;
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
   * @return the FaComment instance itself
   */
  public FaComment putAdditionalProperty(String key, Object value) {
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
    FaComment faComment = (FaComment) o;
    return Objects.equals(this.id, faComment.id) &&
        Objects.equals(this.type, faComment.type) &&
        Objects.equals(this.createdAt, faComment.createdAt) &&
        Objects.equals(this.createdBy, faComment.createdBy) &&
        Objects.equals(this.isReplyComment, faComment.isReplyComment) &&
        Objects.equals(this.item, faComment.item) &&
        Objects.equals(this.message, faComment.message) &&
        Objects.equals(this.modifiedAt, faComment.modifiedAt) &&
        Objects.equals(this.parent, faComment.parent) &&
        Objects.equals(this.replies, faComment.replies) &&
        Objects.equals(this.status, faComment.status) &&
        Objects.equals(this.totalReplyCount, faComment.totalReplyCount)&&
        Objects.equals(this.additionalProperties, faComment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, createdAt, createdBy, isReplyComment, item, message, modifiedAt, parent, replies, status, totalReplyCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaComment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    isReplyComment: ").append(toIndentedString(isReplyComment)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    replies: ").append(toIndentedString(replies)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalReplyCount: ").append(toIndentedString(totalReplyCount)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("created_by");
    openapiFields.add("is_reply_comment");
    openapiFields.add("item");
    openapiFields.add("message");
    openapiFields.add("modified_at");
    openapiFields.add("parent");
    openapiFields.add("replies");
    openapiFields.add("status");
    openapiFields.add("total_reply_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FaComment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FaComment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FaComment is not found in the empty JSON string", FaComment.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FaComment.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `created_by`
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) {
        FileActivityUser.validateJsonObject(jsonObj.getAsJsonObject("created_by"));
      }
      // validate the optional field `item`
      if (jsonObj.get("item") != null && !jsonObj.get("item").isJsonNull()) {
        FaCommentBase.validateJsonObject(jsonObj.getAsJsonObject("item"));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the optional field `parent`
      if (jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonNull()) {
        FaCommentBase.validateJsonObject(jsonObj.getAsJsonObject("parent"));
      }
      if (jsonObj.get("replies") != null && !jsonObj.get("replies").isJsonNull()) {
        JsonArray jsonArrayreplies = jsonObj.getAsJsonArray("replies");
        if (jsonArrayreplies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("replies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `replies` to be an array in the JSON string but got `%s`", jsonObj.get("replies").toString()));
          }

          // validate the optional field `replies` (array)
          for (int i = 0; i < jsonArrayreplies.size(); i++) {
            Reply.validateJsonObject(jsonArrayreplies.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FaComment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FaComment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FaComment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FaComment.class));

       return (TypeAdapter<T>) new TypeAdapter<FaComment>() {
           @Override
           public void write(JsonWriter out, FaComment value) throws IOException {
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
           public FaComment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FaComment instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FaComment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FaComment
  * @throws IOException if the JSON string is invalid with respect to FaComment
  */
  public static FaComment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FaComment.class);
  }

 /**
  * Convert an instance of FaComment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
