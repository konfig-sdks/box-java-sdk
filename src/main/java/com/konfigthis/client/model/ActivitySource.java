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
import com.konfigthis.client.model.Annotation;
import com.konfigthis.client.model.AppActivity;
import com.konfigthis.client.model.FaCommentFull;
import com.konfigthis.client.model.TaskFull;
import com.konfigthis.client.model.VersionsActivity;
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
 * One of &#x60;annotation&#x60;, &#x60;app_activity&#x60;, &#x60;comment&#x60;, &#x60;task&#x60;, or &#x60;versions&#x60; is not null.
 */
@ApiModel(description = "One of `annotation`, `app_activity`, `comment`, `task`, or `versions` is not null.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ActivitySource {
  public static final String SERIALIZED_NAME_ANNOTATION = "annotation";
  @SerializedName(SERIALIZED_NAME_ANNOTATION)
  private Annotation annotation;

  public static final String SERIALIZED_NAME_APP_ACTIVITY = "app_activity";
  @SerializedName(SERIALIZED_NAME_APP_ACTIVITY)
  private AppActivity appActivity;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private FaCommentFull comment;

  public static final String SERIALIZED_NAME_TASK = "task";
  @SerializedName(SERIALIZED_NAME_TASK)
  private TaskFull task;

  public static final String SERIALIZED_NAME_VERSIONS = "versions";
  @SerializedName(SERIALIZED_NAME_VERSIONS)
  private VersionsActivity versions;

  public ActivitySource() {
  }

  public ActivitySource annotation(Annotation annotation) {
    
    
    
    
    this.annotation = annotation;
    return this;
  }

   /**
   * Get annotation
   * @return annotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Annotation getAnnotation() {
    return annotation;
  }


  public void setAnnotation(Annotation annotation) {
    
    
    
    this.annotation = annotation;
  }


  public ActivitySource appActivity(AppActivity appActivity) {
    
    
    
    
    this.appActivity = appActivity;
    return this;
  }

   /**
   * Get appActivity
   * @return appActivity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AppActivity getAppActivity() {
    return appActivity;
  }


  public void setAppActivity(AppActivity appActivity) {
    
    
    
    this.appActivity = appActivity;
  }


  public ActivitySource comment(FaCommentFull comment) {
    
    
    
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FaCommentFull getComment() {
    return comment;
  }


  public void setComment(FaCommentFull comment) {
    
    
    
    this.comment = comment;
  }


  public ActivitySource task(TaskFull task) {
    
    
    
    
    this.task = task;
    return this;
  }

   /**
   * Get task
   * @return task
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskFull getTask() {
    return task;
  }


  public void setTask(TaskFull task) {
    
    
    
    this.task = task;
  }


  public ActivitySource versions(VersionsActivity versions) {
    
    
    
    
    this.versions = versions;
    return this;
  }

   /**
   * Get versions
   * @return versions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VersionsActivity getVersions() {
    return versions;
  }


  public void setVersions(VersionsActivity versions) {
    
    
    
    this.versions = versions;
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
   * @return the ActivitySource instance itself
   */
  public ActivitySource putAdditionalProperty(String key, Object value) {
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
    ActivitySource activitySource = (ActivitySource) o;
    return Objects.equals(this.annotation, activitySource.annotation) &&
        Objects.equals(this.appActivity, activitySource.appActivity) &&
        Objects.equals(this.comment, activitySource.comment) &&
        Objects.equals(this.task, activitySource.task) &&
        Objects.equals(this.versions, activitySource.versions)&&
        Objects.equals(this.additionalProperties, activitySource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotation, appActivity, comment, task, versions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivitySource {\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    appActivity: ").append(toIndentedString(appActivity)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
    openapiFields.add("annotation");
    openapiFields.add("app_activity");
    openapiFields.add("comment");
    openapiFields.add("task");
    openapiFields.add("versions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActivitySource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ActivitySource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActivitySource is not found in the empty JSON string", ActivitySource.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `annotation`
      if (jsonObj.get("annotation") != null && !jsonObj.get("annotation").isJsonNull()) {
        Annotation.validateJsonObject(jsonObj.getAsJsonObject("annotation"));
      }
      // validate the optional field `app_activity`
      if (jsonObj.get("app_activity") != null && !jsonObj.get("app_activity").isJsonNull()) {
        AppActivity.validateJsonObject(jsonObj.getAsJsonObject("app_activity"));
      }
      // validate the optional field `comment`
      if (jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) {
        FaCommentFull.validateJsonObject(jsonObj.getAsJsonObject("comment"));
      }
      // validate the optional field `task`
      if (jsonObj.get("task") != null && !jsonObj.get("task").isJsonNull()) {
        TaskFull.validateJsonObject(jsonObj.getAsJsonObject("task"));
      }
      // validate the optional field `versions`
      if (jsonObj.get("versions") != null && !jsonObj.get("versions").isJsonNull()) {
        VersionsActivity.validateJsonObject(jsonObj.getAsJsonObject("versions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActivitySource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActivitySource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActivitySource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActivitySource.class));

       return (TypeAdapter<T>) new TypeAdapter<ActivitySource>() {
           @Override
           public void write(JsonWriter out, ActivitySource value) throws IOException {
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
           public ActivitySource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ActivitySource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ActivitySource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActivitySource
  * @throws IOException if the JSON string is invalid with respect to ActivitySource
  */
  public static ActivitySource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActivitySource.class);
  }

 /**
  * Convert an instance of ActivitySource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

