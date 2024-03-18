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
 * SearchResultsWithSharedLinksAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SearchResultsWithSharedLinksAllOf {
  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Long offset;

  public SearchResultsWithSharedLinksAllOf() {
  }

  public SearchResultsWithSharedLinksAllOf totalCount(Long totalCount) {
    
    
    
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * One greater than the offset of the last entry in the search results. The total number of entries in the collection may be less than &#x60;total_count&#x60;.
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000", value = "One greater than the offset of the last entry in the search results. The total number of entries in the collection may be less than `total_count`.")

  public Long getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Long totalCount) {
    
    
    
    this.totalCount = totalCount;
  }


  public SearchResultsWithSharedLinksAllOf limit(Long limit) {
    
    
    
    
    this.limit = limit;
    return this;
  }

   /**
   * The limit that was used for this search. This will be the same as the &#x60;limit&#x60; query parameter unless that value exceeded the maximum value allowed.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "The limit that was used for this search. This will be the same as the `limit` query parameter unless that value exceeded the maximum value allowed.")

  public Long getLimit() {
    return limit;
  }


  public void setLimit(Long limit) {
    
    
    
    this.limit = limit;
  }


  public SearchResultsWithSharedLinksAllOf offset(Long offset) {
    
    
    
    
    this.offset = offset;
    return this;
  }

   /**
   * The 0-based offset of the first entry in this set. This will be the same as the &#x60;offset&#x60; query parameter used.
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000", value = "The 0-based offset of the first entry in this set. This will be the same as the `offset` query parameter used.")

  public Long getOffset() {
    return offset;
  }


  public void setOffset(Long offset) {
    
    
    
    this.offset = offset;
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
   * @return the SearchResultsWithSharedLinksAllOf instance itself
   */
  public SearchResultsWithSharedLinksAllOf putAdditionalProperty(String key, Object value) {
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
    SearchResultsWithSharedLinksAllOf searchResultsWithSharedLinksAllOf = (SearchResultsWithSharedLinksAllOf) o;
    return Objects.equals(this.totalCount, searchResultsWithSharedLinksAllOf.totalCount) &&
        Objects.equals(this.limit, searchResultsWithSharedLinksAllOf.limit) &&
        Objects.equals(this.offset, searchResultsWithSharedLinksAllOf.offset)&&
        Objects.equals(this.additionalProperties, searchResultsWithSharedLinksAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, limit, offset, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultsWithSharedLinksAllOf {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
    openapiFields.add("total_count");
    openapiFields.add("limit");
    openapiFields.add("offset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchResultsWithSharedLinksAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchResultsWithSharedLinksAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchResultsWithSharedLinksAllOf is not found in the empty JSON string", SearchResultsWithSharedLinksAllOf.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchResultsWithSharedLinksAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchResultsWithSharedLinksAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchResultsWithSharedLinksAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchResultsWithSharedLinksAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchResultsWithSharedLinksAllOf>() {
           @Override
           public void write(JsonWriter out, SearchResultsWithSharedLinksAllOf value) throws IOException {
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
           public SearchResultsWithSharedLinksAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SearchResultsWithSharedLinksAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SearchResultsWithSharedLinksAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchResultsWithSharedLinksAllOf
  * @throws IOException if the JSON string is invalid with respect to SearchResultsWithSharedLinksAllOf
  */
  public static SearchResultsWithSharedLinksAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchResultsWithSharedLinksAllOf.class);
  }

 /**
  * Convert an instance of SearchResultsWithSharedLinksAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

