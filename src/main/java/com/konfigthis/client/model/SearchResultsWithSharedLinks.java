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
import com.konfigthis.client.model.SearchResultWithSharedLink;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * A list of files, folders and web links that matched the search query, including the additional information about any shared links through which the item has been shared with the user.  This response format is only returned when the &#x60;include_recent_shared_links&#x60; query parameter has been set to &#x60;true&#x60;.
 */
@ApiModel(description = "A list of files, folders and web links that matched the search query, including the additional information about any shared links through which the item has been shared with the user.  This response format is only returned when the `include_recent_shared_links` query parameter has been set to `true`.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SearchResultsWithSharedLinks {
  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Long offset;

  /**
   * Specifies the response as search result items with shared links
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    SEARCH_RESULTS_WITH_SHARED_LINKS("search_results_with_shared_links");

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

  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List<SearchResultWithSharedLink> entries = null;

  public SearchResultsWithSharedLinks() {
  }

  public SearchResultsWithSharedLinks totalCount(Long totalCount) {
    
    
    
    
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


  public SearchResultsWithSharedLinks limit(Long limit) {
    
    
    
    
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


  public SearchResultsWithSharedLinks offset(Long offset) {
    
    
    
    
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


  public SearchResultsWithSharedLinks type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Specifies the response as search result items with shared links
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SEARCH_RESULTS_WITH_SHARED_LINKS", required = true, value = "Specifies the response as search result items with shared links")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public SearchResultsWithSharedLinks entries(List<SearchResultWithSharedLink> entries) {
    
    
    
    
    this.entries = entries;
    return this;
  }

  public SearchResultsWithSharedLinks addEntriesItem(SearchResultWithSharedLink entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * The search results for the query provided, including the additional information about any shared links through which the item has been shared with the user.
   * @return entries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The search results for the query provided, including the additional information about any shared links through which the item has been shared with the user.")

  public List<SearchResultWithSharedLink> getEntries() {
    return entries;
  }


  public void setEntries(List<SearchResultWithSharedLink> entries) {
    
    
    
    this.entries = entries;
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
   * @return the SearchResultsWithSharedLinks instance itself
   */
  public SearchResultsWithSharedLinks putAdditionalProperty(String key, Object value) {
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
    SearchResultsWithSharedLinks searchResultsWithSharedLinks = (SearchResultsWithSharedLinks) o;
    return Objects.equals(this.totalCount, searchResultsWithSharedLinks.totalCount) &&
        Objects.equals(this.limit, searchResultsWithSharedLinks.limit) &&
        Objects.equals(this.offset, searchResultsWithSharedLinks.offset) &&
        Objects.equals(this.type, searchResultsWithSharedLinks.type) &&
        Objects.equals(this.entries, searchResultsWithSharedLinks.entries)&&
        Objects.equals(this.additionalProperties, searchResultsWithSharedLinks.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, limit, offset, type, entries, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultsWithSharedLinks {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("entries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchResultsWithSharedLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchResultsWithSharedLinks.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchResultsWithSharedLinks is not found in the empty JSON string", SearchResultsWithSharedLinks.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchResultsWithSharedLinks.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("entries") != null && !jsonObj.get("entries").isJsonNull()) {
        JsonArray jsonArrayentries = jsonObj.getAsJsonArray("entries");
        if (jsonArrayentries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("entries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `entries` to be an array in the JSON string but got `%s`", jsonObj.get("entries").toString()));
          }

          // validate the optional field `entries` (array)
          for (int i = 0; i < jsonArrayentries.size(); i++) {
            SearchResultWithSharedLink.validateJsonObject(jsonArrayentries.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchResultsWithSharedLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchResultsWithSharedLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchResultsWithSharedLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchResultsWithSharedLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchResultsWithSharedLinks>() {
           @Override
           public void write(JsonWriter out, SearchResultsWithSharedLinks value) throws IOException {
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
           public SearchResultsWithSharedLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SearchResultsWithSharedLinks instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SearchResultsWithSharedLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchResultsWithSharedLinks
  * @throws IOException if the JSON string is invalid with respect to SearchResultsWithSharedLinks
  */
  public static SearchResultsWithSharedLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchResultsWithSharedLinks.class);
  }

 /**
  * Convert an instance of SearchResultsWithSharedLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

