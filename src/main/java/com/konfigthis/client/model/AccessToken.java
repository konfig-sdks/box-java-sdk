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
import com.konfigthis.client.model.FileOrFolderScope;
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
 * A token that can be used to make authenticated API calls.
 */
@ApiModel(description = "A token that can be used to make authenticated API calls.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AccessToken {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private Long expiresIn;

  /**
   * The type of access token returned.
   */
  @JsonAdapter(TokenTypeEnum.Adapter.class)
 public enum TokenTypeEnum {
    BEARER("bearer");

    private String value;

    TokenTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TokenTypeEnum fromValue(String value) {
      for (TokenTypeEnum b : TokenTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TokenTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TokenTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TokenTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TokenTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "token_type";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private TokenTypeEnum tokenType;

  public static final String SERIALIZED_NAME_RESTRICTED_TO = "restricted_to";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_TO)
  private List<FileOrFolderScope> restrictedTo = null;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refresh_token";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private String refreshToken;

  /**
   * The type of downscoped access token returned. This is only returned if an access token has been downscoped.
   */
  @JsonAdapter(IssuedTokenTypeEnum.Adapter.class)
 public enum IssuedTokenTypeEnum {
    URN_IETF_PARAMS_OAUTH_TOKEN_TYPE_ACCESS_TOKEN("urn:ietf:params:oauth:token-type:access_token");

    private String value;

    IssuedTokenTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IssuedTokenTypeEnum fromValue(String value) {
      for (IssuedTokenTypeEnum b : IssuedTokenTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IssuedTokenTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IssuedTokenTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IssuedTokenTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IssuedTokenTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ISSUED_TOKEN_TYPE = "issued_token_type";
  @SerializedName(SERIALIZED_NAME_ISSUED_TOKEN_TYPE)
  private IssuedTokenTypeEnum issuedTokenType;

  public AccessToken() {
  }

  public AccessToken accessToken(String accessToken) {
    
    
    
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The requested access token.
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c3FIOG9vSGV4VHo4QzAyg5T1JvNnJoZ3ExaVNyQWw6WjRsanRKZG5lQk9qUE1BVQ", value = "The requested access token.")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    
    
    
    this.accessToken = accessToken;
  }


  public AccessToken expiresIn(Long expiresIn) {
    
    
    
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * The time in seconds by which this token will expire.
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3600", value = "The time in seconds by which this token will expire.")

  public Long getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(Long expiresIn) {
    
    
    
    this.expiresIn = expiresIn;
  }


  public AccessToken tokenType(TokenTypeEnum tokenType) {
    
    
    
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * The type of access token returned.
   * @return tokenType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BEARER", value = "The type of access token returned.")

  public TokenTypeEnum getTokenType() {
    return tokenType;
  }


  public void setTokenType(TokenTypeEnum tokenType) {
    
    
    
    this.tokenType = tokenType;
  }


  public AccessToken restrictedTo(List<FileOrFolderScope> restrictedTo) {
    
    
    
    
    this.restrictedTo = restrictedTo;
    return this;
  }

  public AccessToken addRestrictedToItem(FileOrFolderScope restrictedToItem) {
    if (this.restrictedTo == null) {
      this.restrictedTo = new ArrayList<>();
    }
    this.restrictedTo.add(restrictedToItem);
    return this;
  }

   /**
   * The permissions that this access token permits, providing a list of resources (files, folders, etc) and the scopes permitted for each of those resources.
   * @return restrictedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The permissions that this access token permits, providing a list of resources (files, folders, etc) and the scopes permitted for each of those resources.")

  public List<FileOrFolderScope> getRestrictedTo() {
    return restrictedTo;
  }


  public void setRestrictedTo(List<FileOrFolderScope> restrictedTo) {
    
    
    
    this.restrictedTo = restrictedTo;
  }


  public AccessToken refreshToken(String refreshToken) {
    
    
    
    
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * The refresh token for this access token, which can be used to request a new access token when the current one expires.
   * @return refreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c3FIOG9vSGV4VHo4QzAyg5T1JvNnJoZ3ExaVNyQWw6WjRsanRKZG5lQk9qUE1BVQ", value = "The refresh token for this access token, which can be used to request a new access token when the current one expires.")

  public String getRefreshToken() {
    return refreshToken;
  }


  public void setRefreshToken(String refreshToken) {
    
    
    
    this.refreshToken = refreshToken;
  }


  public AccessToken issuedTokenType(IssuedTokenTypeEnum issuedTokenType) {
    
    
    
    
    this.issuedTokenType = issuedTokenType;
    return this;
  }

   /**
   * The type of downscoped access token returned. This is only returned if an access token has been downscoped.
   * @return issuedTokenType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "URN_IETF_PARAMS_OAUTH_TOKEN_TYPE_ACCESS_TOKEN", value = "The type of downscoped access token returned. This is only returned if an access token has been downscoped.")

  public IssuedTokenTypeEnum getIssuedTokenType() {
    return issuedTokenType;
  }


  public void setIssuedTokenType(IssuedTokenTypeEnum issuedTokenType) {
    
    
    
    this.issuedTokenType = issuedTokenType;
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
   * @return the AccessToken instance itself
   */
  public AccessToken putAdditionalProperty(String key, Object value) {
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
    AccessToken accessToken = (AccessToken) o;
    return Objects.equals(this.accessToken, accessToken.accessToken) &&
        Objects.equals(this.expiresIn, accessToken.expiresIn) &&
        Objects.equals(this.tokenType, accessToken.tokenType) &&
        Objects.equals(this.restrictedTo, accessToken.restrictedTo) &&
        Objects.equals(this.refreshToken, accessToken.refreshToken) &&
        Objects.equals(this.issuedTokenType, accessToken.issuedTokenType)&&
        Objects.equals(this.additionalProperties, accessToken.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, tokenType, restrictedTo, refreshToken, issuedTokenType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessToken {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    restrictedTo: ").append(toIndentedString(restrictedTo)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    issuedTokenType: ").append(toIndentedString(issuedTokenType)).append("\n");
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
    openapiFields.add("access_token");
    openapiFields.add("expires_in");
    openapiFields.add("token_type");
    openapiFields.add("restricted_to");
    openapiFields.add("refresh_token");
    openapiFields.add("issued_token_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccessToken
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccessToken.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessToken is not found in the empty JSON string", AccessToken.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("access_token") != null && !jsonObj.get("access_token").isJsonNull()) && !jsonObj.get("access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_token").toString()));
      }
      if ((jsonObj.get("token_type") != null && !jsonObj.get("token_type").isJsonNull()) && !jsonObj.get("token_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_type").toString()));
      }
      if (jsonObj.get("restricted_to") != null && !jsonObj.get("restricted_to").isJsonNull()) {
        JsonArray jsonArrayrestrictedTo = jsonObj.getAsJsonArray("restricted_to");
        if (jsonArrayrestrictedTo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("restricted_to").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `restricted_to` to be an array in the JSON string but got `%s`", jsonObj.get("restricted_to").toString()));
          }

          // validate the optional field `restricted_to` (array)
          for (int i = 0; i < jsonArrayrestrictedTo.size(); i++) {
            FileOrFolderScope.validateJsonObject(jsonArrayrestrictedTo.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("refresh_token") != null && !jsonObj.get("refresh_token").isJsonNull()) && !jsonObj.get("refresh_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refresh_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refresh_token").toString()));
      }
      if ((jsonObj.get("issued_token_type") != null && !jsonObj.get("issued_token_type").isJsonNull()) && !jsonObj.get("issued_token_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issued_token_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issued_token_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessToken.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessToken' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessToken> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessToken.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessToken>() {
           @Override
           public void write(JsonWriter out, AccessToken value) throws IOException {
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
           public AccessToken read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccessToken instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccessToken given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessToken
  * @throws IOException if the JSON string is invalid with respect to AccessToken
  */
  public static AccessToken fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessToken.class);
  }

 /**
  * Convert an instance of AccessToken to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

