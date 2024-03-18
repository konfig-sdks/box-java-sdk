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
 * Web links are objects that point to URLs. These objects are also known as bookmarks within the Box web application.  Web link objects are treated similarly to file objects, they will also support most actions that apply to regular files.
 */
@ApiModel(description = "Web links are objects that point to URLs. These objects are also known as bookmarks within the Box web application.  Web link objects are treated similarly to file objects, they will also support most actions that apply to regular files.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebLinkMini {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * &#x60;web_link&#x60;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    WEB_LINK("web_link");

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

  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_SEQUENCE_ID = "sequence_id";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_ID)
  private String sequenceId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public WebLinkMini() {
  }

  public WebLinkMini id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for this web link
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "11446498", required = true, value = "The unique identifier for this web link")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public WebLinkMini type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;web_link&#x60;
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "WEB_LINK", required = true, value = "`web_link`")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public WebLinkMini etag(String etag) {
    
    
    
    
    this.etag = etag;
    return this;
  }

   /**
   * The entity tag of this web link. Used with &#x60;If-Match&#x60; headers.
   * @return etag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The entity tag of this web link. Used with `If-Match` headers.")

  public String getEtag() {
    return etag;
  }


  public void setEtag(String etag) {
    
    
    
    this.etag = etag;
  }


  public WebLinkMini url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * The URL this web link points to
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.example.com/example/1234", value = "The URL this web link points to")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public WebLinkMini sequenceId(String sequenceId) {
    
    
    
    
    this.sequenceId = sequenceId;
    return this;
  }

   /**
   * Get sequenceId
   * @return sequenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSequenceId() {
    return sequenceId;
  }


  public void setSequenceId(String sequenceId) {
    
    
    
    this.sequenceId = sequenceId;
  }


  public WebLinkMini name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the web link
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Bookmark", value = "The name of the web link")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
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
   * @return the WebLinkMini instance itself
   */
  public WebLinkMini putAdditionalProperty(String key, Object value) {
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
    WebLinkMini webLinkMini = (WebLinkMini) o;
    return Objects.equals(this.id, webLinkMini.id) &&
        Objects.equals(this.type, webLinkMini.type) &&
        Objects.equals(this.etag, webLinkMini.etag) &&
        Objects.equals(this.url, webLinkMini.url) &&
        Objects.equals(this.sequenceId, webLinkMini.sequenceId) &&
        Objects.equals(this.name, webLinkMini.name)&&
        Objects.equals(this.additionalProperties, webLinkMini.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, etag, url, sequenceId, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebLinkMini {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    sequenceId: ").append(toIndentedString(sequenceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("etag");
    openapiFields.add("url");
    openapiFields.add("sequence_id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebLinkMini
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebLinkMini.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebLinkMini is not found in the empty JSON string", WebLinkMini.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebLinkMini.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("etag") != null && !jsonObj.get("etag").isJsonNull()) && !jsonObj.get("etag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `etag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("etag").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the optional field `sequence_id`
      if (jsonObj.get("sequence_id") != null && !jsonObj.get("sequence_id").isJsonNull()) {
        String.validateJsonObject(jsonObj.getAsJsonObject("sequence_id"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebLinkMini.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebLinkMini' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebLinkMini> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebLinkMini.class));

       return (TypeAdapter<T>) new TypeAdapter<WebLinkMini>() {
           @Override
           public void write(JsonWriter out, WebLinkMini value) throws IOException {
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
           public WebLinkMini read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebLinkMini instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebLinkMini given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebLinkMini
  * @throws IOException if the JSON string is invalid with respect to WebLinkMini
  */
  public static WebLinkMini fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebLinkMini.class);
  }

 /**
  * Convert an instance of WebLinkMini to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

