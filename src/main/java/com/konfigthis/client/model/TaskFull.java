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
import com.konfigthis.client.model.FileActivityUser;
import com.konfigthis.client.model.TaskAssignees;
import com.konfigthis.client.model.TaskFullAllOfPermissions;
import com.konfigthis.client.model.TaskLinks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * The full representation of a task.
 */
@ApiModel(description = "The full representation of a task.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaskFull {
  public static final String SERIALIZED_NAME_DUE_AT = "due_at";
  @SerializedName(SERIALIZED_NAME_DUE_AT)
  private OffsetDateTime dueAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * type of the object
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    TASK("task");

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

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ASSIGNED_TO = "assigned_to";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_TO)
  private TaskAssignees assignedTo;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private OffsetDateTime completedAt;

  /**
   * Rule to complete the task.
   */
  @JsonAdapter(CompletionRuleEnum.Adapter.class)
 public enum CompletionRuleEnum {
    ALL_ASSIGNEES("all_assignees"),
    
    ANY_ASSIGNEE("any_assignee");

    private String value;

    CompletionRuleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompletionRuleEnum fromValue(String value) {
      for (CompletionRuleEnum b : CompletionRuleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CompletionRuleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompletionRuleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompletionRuleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CompletionRuleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COMPLETION_RULE = "completion_rule";
  @SerializedName(SERIALIZED_NAME_COMPLETION_RULE)
  private CompletionRuleEnum completionRule;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private FileActivityUser createdBy;

  public static final String SERIALIZED_NAME_MODIFIED_AT = "modified_at";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT)
  private OffsetDateTime modifiedAt;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private TaskFullAllOfPermissions permissions;

  public static final String SERIALIZED_NAME_PROGRESS_AT = "progress_at";
  @SerializedName(SERIALIZED_NAME_PROGRESS_AT)
  private OffsetDateTime progressAt;

  /**
   * Status of the task
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    APPROVED("approved"),
    
    COMPLETED("completed"),
    
    IN_PROGRESS("in_progress"),
    
    NOT_STARTED("not_started"),
    
    REJECTED("rejected");

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

  public static final String SERIALIZED_NAME_TASK_LINKS = "task_links";
  @SerializedName(SERIALIZED_NAME_TASK_LINKS)
  private TaskLinks taskLinks;

  /**
   * Type of the task
   */
  @JsonAdapter(TaskTypeEnum.Adapter.class)
 public enum TaskTypeEnum {
    APPROVAL("approval"),
    
    GENERAL("general");

    private String value;

    TaskTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TaskTypeEnum fromValue(String value) {
      for (TaskTypeEnum b : TaskTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TaskTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaskTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TaskTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TaskTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TASK_TYPE = "task_type";
  @SerializedName(SERIALIZED_NAME_TASK_TYPE)
  private TaskTypeEnum taskType;

  public TaskFull() {
  }

  public TaskFull dueAt(OffsetDateTime dueAt) {
    
    
    
    
    this.dueAt = dueAt;
    return this;
  }

   /**
   * When the task was due.
   * @return dueAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When the task was due.")

  public OffsetDateTime getDueAt() {
    return dueAt;
  }


  public void setDueAt(OffsetDateTime dueAt) {
    
    
    
    this.dueAt = dueAt;
  }


  public TaskFull id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * A unique id of the task
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123", required = true, value = "A unique id of the task")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public TaskFull type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * type of the object
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TASK", value = "type of the object")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public TaskFull description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Description of the task.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Pls work on this", value = "Description of the task.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public TaskFull assignedTo(TaskAssignees assignedTo) {
    
    
    
    
    this.assignedTo = assignedTo;
    return this;
  }

   /**
   * Get assignedTo
   * @return assignedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskAssignees getAssignedTo() {
    return assignedTo;
  }


  public void setAssignedTo(TaskAssignees assignedTo) {
    
    
    
    this.assignedTo = assignedTo;
  }


  public TaskFull completedAt(OffsetDateTime completedAt) {
    
    
    
    
    this.completedAt = completedAt;
    return this;
  }

   /**
   * When the task was completed.
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When the task was completed.")

  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }


  public void setCompletedAt(OffsetDateTime completedAt) {
    
    
    
    this.completedAt = completedAt;
  }


  public TaskFull completionRule(CompletionRuleEnum completionRule) {
    
    
    
    
    this.completionRule = completionRule;
    return this;
  }

   /**
   * Rule to complete the task.
   * @return completionRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ANY_ASSIGNEE", value = "Rule to complete the task.")

  public CompletionRuleEnum getCompletionRule() {
    return completionRule;
  }


  public void setCompletionRule(CompletionRuleEnum completionRule) {
    
    
    
    this.completionRule = completionRule;
  }


  public TaskFull createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When the task was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When the task was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public TaskFull createdBy(FileActivityUser createdBy) {
    
    
    
    
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


  public TaskFull modifiedAt(OffsetDateTime modifiedAt) {
    
    
    
    
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * When the task was modified.
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When the task was modified.")

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }


  public void setModifiedAt(OffsetDateTime modifiedAt) {
    
    
    
    this.modifiedAt = modifiedAt;
  }


  public TaskFull permissions(TaskFullAllOfPermissions permissions) {
    
    
    
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskFullAllOfPermissions getPermissions() {
    return permissions;
  }


  public void setPermissions(TaskFullAllOfPermissions permissions) {
    
    
    
    this.permissions = permissions;
  }


  public TaskFull progressAt(OffsetDateTime progressAt) {
    
    
    
    
    this.progressAt = progressAt;
    return this;
  }

   /**
   * When the task progress was started.
   * @return progressAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43-08:00", value = "When the task progress was started.")

  public OffsetDateTime getProgressAt() {
    return progressAt;
  }


  public void setProgressAt(OffsetDateTime progressAt) {
    
    
    
    this.progressAt = progressAt;
  }


  public TaskFull status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Status of the task
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IN_PROGRESS", value = "Status of the task")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public TaskFull taskLinks(TaskLinks taskLinks) {
    
    
    
    
    this.taskLinks = taskLinks;
    return this;
  }

   /**
   * Get taskLinks
   * @return taskLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskLinks getTaskLinks() {
    return taskLinks;
  }


  public void setTaskLinks(TaskLinks taskLinks) {
    
    
    
    this.taskLinks = taskLinks;
  }


  public TaskFull taskType(TaskTypeEnum taskType) {
    
    
    
    
    this.taskType = taskType;
    return this;
  }

   /**
   * Type of the task
   * @return taskType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APPROVAL", value = "Type of the task")

  public TaskTypeEnum getTaskType() {
    return taskType;
  }


  public void setTaskType(TaskTypeEnum taskType) {
    
    
    
    this.taskType = taskType;
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
   * @return the TaskFull instance itself
   */
  public TaskFull putAdditionalProperty(String key, Object value) {
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
    TaskFull taskFull = (TaskFull) o;
    return Objects.equals(this.dueAt, taskFull.dueAt) &&
        Objects.equals(this.id, taskFull.id) &&
        Objects.equals(this.type, taskFull.type) &&
        Objects.equals(this.description, taskFull.description) &&
        Objects.equals(this.assignedTo, taskFull.assignedTo) &&
        Objects.equals(this.completedAt, taskFull.completedAt) &&
        Objects.equals(this.completionRule, taskFull.completionRule) &&
        Objects.equals(this.createdAt, taskFull.createdAt) &&
        Objects.equals(this.createdBy, taskFull.createdBy) &&
        Objects.equals(this.modifiedAt, taskFull.modifiedAt) &&
        Objects.equals(this.permissions, taskFull.permissions) &&
        Objects.equals(this.progressAt, taskFull.progressAt) &&
        Objects.equals(this.status, taskFull.status) &&
        Objects.equals(this.taskLinks, taskFull.taskLinks) &&
        Objects.equals(this.taskType, taskFull.taskType)&&
        Objects.equals(this.additionalProperties, taskFull.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dueAt, id, type, description, assignedTo, completedAt, completionRule, createdAt, createdBy, modifiedAt, permissions, progressAt, status, taskLinks, taskType, additionalProperties);
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
    sb.append("class TaskFull {\n");
    sb.append("    dueAt: ").append(toIndentedString(dueAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    completionRule: ").append(toIndentedString(completionRule)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    progressAt: ").append(toIndentedString(progressAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taskLinks: ").append(toIndentedString(taskLinks)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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
    openapiFields.add("due_at");
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("description");
    openapiFields.add("assigned_to");
    openapiFields.add("completed_at");
    openapiFields.add("completion_rule");
    openapiFields.add("created_at");
    openapiFields.add("created_by");
    openapiFields.add("modified_at");
    openapiFields.add("permissions");
    openapiFields.add("progress_at");
    openapiFields.add("status");
    openapiFields.add("task_links");
    openapiFields.add("task_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaskFull
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaskFull.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskFull is not found in the empty JSON string", TaskFull.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaskFull.openapiRequiredFields) {
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
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `assigned_to`
      if (jsonObj.get("assigned_to") != null && !jsonObj.get("assigned_to").isJsonNull()) {
        TaskAssignees.validateJsonObject(jsonObj.getAsJsonObject("assigned_to"));
      }
      if ((jsonObj.get("completion_rule") != null && !jsonObj.get("completion_rule").isJsonNull()) && !jsonObj.get("completion_rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `completion_rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("completion_rule").toString()));
      }
      // validate the optional field `created_by`
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) {
        FileActivityUser.validateJsonObject(jsonObj.getAsJsonObject("created_by"));
      }
      // validate the optional field `permissions`
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull()) {
        TaskFullAllOfPermissions.validateJsonObject(jsonObj.getAsJsonObject("permissions"));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `task_links`
      if (jsonObj.get("task_links") != null && !jsonObj.get("task_links").isJsonNull()) {
        TaskLinks.validateJsonObject(jsonObj.getAsJsonObject("task_links"));
      }
      if ((jsonObj.get("task_type") != null && !jsonObj.get("task_type").isJsonNull()) && !jsonObj.get("task_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskFull.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskFull' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskFull> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskFull.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskFull>() {
           @Override
           public void write(JsonWriter out, TaskFull value) throws IOException {
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
           public TaskFull read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaskFull instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaskFull given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaskFull
  * @throws IOException if the JSON string is invalid with respect to TaskFull
  */
  public static TaskFull fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskFull.class);
  }

 /**
  * Convert an instance of TaskFull to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

