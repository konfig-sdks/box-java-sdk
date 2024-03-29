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
 * A real-time server that can be used for long polling user events
 */
@ApiModel(description = "A real-time server that can be used for long polling user events")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RealtimeServer {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private Integer ttl;

  public static final String SERIALIZED_NAME_MAX_RETRIES = "max_retries";
  @SerializedName(SERIALIZED_NAME_MAX_RETRIES)
  private Integer maxRetries;

  public static final String SERIALIZED_NAME_RETRY_TIMEOUT = "retry_timeout";
  @SerializedName(SERIALIZED_NAME_RETRY_TIMEOUT)
  private Integer retryTimeout;

  public RealtimeServer() {
  }

  public RealtimeServer type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;realtime_server&#x60;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "realtime_server", value = "`realtime_server`")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public RealtimeServer url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * The URL for the server.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://2.realtime.services.box.net/subscribe?channel=cc807c9c4869ffb1c81a&stream_type=all", value = "The URL for the server.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public RealtimeServer ttl(Integer ttl) {
    
    
    
    
    this.ttl = ttl;
    return this;
  }

   /**
   * The time in minutes for which this server is available
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "The time in minutes for which this server is available")

  public Integer getTtl() {
    return ttl;
  }


  public void setTtl(Integer ttl) {
    
    
    
    this.ttl = ttl;
  }


  public RealtimeServer maxRetries(Integer maxRetries) {
    
    
    
    
    this.maxRetries = maxRetries;
    return this;
  }

   /**
   * The maximum number of retries this server will allow before a new long poll should be started by getting a [new list of server](https://raw.githubusercontent.com).
   * @return maxRetries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "The maximum number of retries this server will allow before a new long poll should be started by getting a [new list of server](https://raw.githubusercontent.com).")

  public Integer getMaxRetries() {
    return maxRetries;
  }


  public void setMaxRetries(Integer maxRetries) {
    
    
    
    this.maxRetries = maxRetries;
  }


  public RealtimeServer retryTimeout(Integer retryTimeout) {
    
    
    
    
    this.retryTimeout = retryTimeout;
    return this;
  }

   /**
   * The maximum number of seconds without a response after which you should retry the long poll connection.  This helps to overcome network issues where the long poll looks to be working but no packages are coming through.
   * @return retryTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "610", value = "The maximum number of seconds without a response after which you should retry the long poll connection.  This helps to overcome network issues where the long poll looks to be working but no packages are coming through.")

  public Integer getRetryTimeout() {
    return retryTimeout;
  }


  public void setRetryTimeout(Integer retryTimeout) {
    
    
    
    this.retryTimeout = retryTimeout;
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
   * @return the RealtimeServer instance itself
   */
  public RealtimeServer putAdditionalProperty(String key, Object value) {
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
    RealtimeServer realtimeServer = (RealtimeServer) o;
    return Objects.equals(this.type, realtimeServer.type) &&
        Objects.equals(this.url, realtimeServer.url) &&
        Objects.equals(this.ttl, realtimeServer.ttl) &&
        Objects.equals(this.maxRetries, realtimeServer.maxRetries) &&
        Objects.equals(this.retryTimeout, realtimeServer.retryTimeout)&&
        Objects.equals(this.additionalProperties, realtimeServer.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url, ttl, maxRetries, retryTimeout, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServer {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
    sb.append("    retryTimeout: ").append(toIndentedString(retryTimeout)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("url");
    openapiFields.add("ttl");
    openapiFields.add("max_retries");
    openapiFields.add("retry_timeout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RealtimeServer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RealtimeServer.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RealtimeServer is not found in the empty JSON string", RealtimeServer.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RealtimeServer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RealtimeServer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RealtimeServer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RealtimeServer.class));

       return (TypeAdapter<T>) new TypeAdapter<RealtimeServer>() {
           @Override
           public void write(JsonWriter out, RealtimeServer value) throws IOException {
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
           public RealtimeServer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RealtimeServer instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RealtimeServer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RealtimeServer
  * @throws IOException if the JSON string is invalid with respect to RealtimeServer
  */
  public static RealtimeServer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RealtimeServer.class);
  }

 /**
  * Convert an instance of RealtimeServer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

