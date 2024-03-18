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
 * A request for a new OAuth 2.0 token
 */
@ApiModel(description = "A request for a new OAuth 2.0 token")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PostOAuth2Token {
  /**
   * The type of request being made, either using a client-side obtained authorization code, a refresh token, a JWT assertion, client credentials grant or another access token for the purpose of downscoping a token.
   */
  @JsonAdapter(GrantTypeEnum.Adapter.class)
 public enum GrantTypeEnum {
    AUTHORIZATION_CODE("authorization_code"),
    
    REFRESH_TOKEN("refresh_token"),
    
    CLIENT_CREDENTIALS("client_credentials"),
    
    URN_IETF_PARAMS_OAUTH_GRANT_TYPE_JWT_BEARER("urn:ietf:params:oauth:grant-type:jwt-bearer"),
    
    URN_IETF_PARAMS_OAUTH_GRANT_TYPE_TOKEN_EXCHANGE("urn:ietf:params:oauth:grant-type:token-exchange");

    private String value;

    GrantTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GrantTypeEnum fromValue(String value) {
      for (GrantTypeEnum b : GrantTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GrantTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GrantTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GrantTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GrantTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GRANT_TYPE = "grant_type";
  @SerializedName(SERIALIZED_NAME_GRANT_TYPE)
  private GrantTypeEnum grantType;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refresh_token";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private String refreshToken;

  public static final String SERIALIZED_NAME_ASSERTION = "assertion";
  @SerializedName(SERIALIZED_NAME_ASSERTION)
  private String assertion;

  public static final String SERIALIZED_NAME_SUBJECT_TOKEN = "subject_token";
  @SerializedName(SERIALIZED_NAME_SUBJECT_TOKEN)
  private String subjectToken;

  /**
   * The type of &#x60;subject_token&#x60; passed in.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:token-exchange&#x60; as the &#x60;grant_type&#x60;.
   */
  @JsonAdapter(SubjectTokenTypeEnum.Adapter.class)
 public enum SubjectTokenTypeEnum {
    URN_IETF_PARAMS_OAUTH_TOKEN_TYPE_ACCESS_TOKEN("urn:ietf:params:oauth:token-type:access_token");

    private String value;

    SubjectTokenTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubjectTokenTypeEnum fromValue(String value) {
      for (SubjectTokenTypeEnum b : SubjectTokenTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubjectTokenTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubjectTokenTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubjectTokenTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubjectTokenTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBJECT_TOKEN_TYPE = "subject_token_type";
  @SerializedName(SERIALIZED_NAME_SUBJECT_TOKEN_TYPE)
  private SubjectTokenTypeEnum subjectTokenType;

  public static final String SERIALIZED_NAME_ACTOR_TOKEN = "actor_token";
  @SerializedName(SERIALIZED_NAME_ACTOR_TOKEN)
  private String actorToken;

  /**
   * The type of &#x60;actor_token&#x60; passed in.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:token-exchange&#x60; as the &#x60;grant_type&#x60;.
   */
  @JsonAdapter(ActorTokenTypeEnum.Adapter.class)
 public enum ActorTokenTypeEnum {
    URN_IETF_PARAMS_OAUTH_TOKEN_TYPE_ID_TOKEN("urn:ietf:params:oauth:token-type:id_token");

    private String value;

    ActorTokenTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActorTokenTypeEnum fromValue(String value) {
      for (ActorTokenTypeEnum b : ActorTokenTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActorTokenTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActorTokenTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActorTokenTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActorTokenTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTOR_TOKEN_TYPE = "actor_token_type";
  @SerializedName(SERIALIZED_NAME_ACTOR_TOKEN_TYPE)
  private ActorTokenTypeEnum actorTokenType;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;

  /**
   * Used in combination with &#x60;client_credentials&#x60; as the &#x60;grant_type&#x60;.
   */
  @JsonAdapter(BoxSubjectTypeEnum.Adapter.class)
 public enum BoxSubjectTypeEnum {
    ENTERPRISE("enterprise"),
    
    USER("user");

    private String value;

    BoxSubjectTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BoxSubjectTypeEnum fromValue(String value) {
      for (BoxSubjectTypeEnum b : BoxSubjectTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BoxSubjectTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BoxSubjectTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BoxSubjectTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BoxSubjectTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BOX_SUBJECT_TYPE = "box_subject_type";
  @SerializedName(SERIALIZED_NAME_BOX_SUBJECT_TYPE)
  private BoxSubjectTypeEnum boxSubjectType;

  public static final String SERIALIZED_NAME_BOX_SUBJECT_ID = "box_subject_id";
  @SerializedName(SERIALIZED_NAME_BOX_SUBJECT_ID)
  private String boxSubjectId;

  public static final String SERIALIZED_NAME_BOX_SHARED_LINK = "box_shared_link";
  @SerializedName(SERIALIZED_NAME_BOX_SHARED_LINK)
  private String boxSharedLink;

  public PostOAuth2Token() {
  }

  public PostOAuth2Token grantType(GrantTypeEnum grantType) {
    
    
    
    
    this.grantType = grantType;
    return this;
  }

   /**
   * The type of request being made, either using a client-side obtained authorization code, a refresh token, a JWT assertion, client credentials grant or another access token for the purpose of downscoping a token.
   * @return grantType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "AUTHORIZATION_CODE", required = true, value = "The type of request being made, either using a client-side obtained authorization code, a refresh token, a JWT assertion, client credentials grant or another access token for the purpose of downscoping a token.")

  public GrantTypeEnum getGrantType() {
    return grantType;
  }


  public void setGrantType(GrantTypeEnum grantType) {
    
    
    
    this.grantType = grantType;
  }


  public PostOAuth2Token clientId(String clientId) {
    
    
    
    
    this.clientId = clientId;
    return this;
  }

   /**
   * The Client ID of the application requesting an access token.  Used in combination with &#x60;authorization_code&#x60;, &#x60;client_credentials&#x60;, or &#x60;urn:ietf:params:oauth:grant-type:jwt-bearer&#x60; as the &#x60;grant_type&#x60;.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ly1nj6n11vionaie65emwzk575hnnmrk", value = "The Client ID of the application requesting an access token.  Used in combination with `authorization_code`, `client_credentials`, or `urn:ietf:params:oauth:grant-type:jwt-bearer` as the `grant_type`.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    
    
    
    this.clientId = clientId;
  }


  public PostOAuth2Token clientSecret(String clientSecret) {
    
    
    
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * The client secret of the application requesting an access token.  Used in combination with &#x60;authorization_code&#x60;, &#x60;client_credentials&#x60;, or &#x60;urn:ietf:params:oauth:grant-type:jwt-bearer&#x60; as the &#x60;grant_type&#x60;.
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "hOzsTeFlT6ko0dme22uGbQal04SBPYc1", value = "The client secret of the application requesting an access token.  Used in combination with `authorization_code`, `client_credentials`, or `urn:ietf:params:oauth:grant-type:jwt-bearer` as the `grant_type`.")

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    
    
    
    this.clientSecret = clientSecret;
  }


  public PostOAuth2Token code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * The client-side authorization code passed to your application by Box in the browser redirect after the user has successfully granted your application permission to make API calls on their behalf.  Used in combination with &#x60;authorization_code&#x60; as the &#x60;grant_type&#x60;.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "n22JPxrh18m4Y0wIZPIqYZK7VRrsMTWW", value = "The client-side authorization code passed to your application by Box in the browser redirect after the user has successfully granted your application permission to make API calls on their behalf.  Used in combination with `authorization_code` as the `grant_type`.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public PostOAuth2Token refreshToken(String refreshToken) {
    
    
    
    
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * A refresh token used to get a new access token with.  Used in combination with &#x60;refresh_token&#x60; as the &#x60;grant_type&#x60;.
   * @return refreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c3FIOG9vSGV4VHo4QzAyg5T1JvNnJoZ3ExaVNyQWw6WjRsanRKZG5lQk9qUE1BVQ", value = "A refresh token used to get a new access token with.  Used in combination with `refresh_token` as the `grant_type`.")

  public String getRefreshToken() {
    return refreshToken;
  }


  public void setRefreshToken(String refreshToken) {
    
    
    
    this.refreshToken = refreshToken;
  }


  public PostOAuth2Token assertion(String assertion) {
    
    
    
    
    this.assertion = assertion;
    return this;
  }

   /**
   * A JWT assertion for which to request a new access token.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:jwt-bearer&#x60; as the &#x60;grant_type&#x60;.
   * @return assertion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxxxx.yyyyy.zzzzz", value = "A JWT assertion for which to request a new access token.  Used in combination with `urn:ietf:params:oauth:grant-type:jwt-bearer` as the `grant_type`.")

  public String getAssertion() {
    return assertion;
  }


  public void setAssertion(String assertion) {
    
    
    
    this.assertion = assertion;
  }


  public PostOAuth2Token subjectToken(String subjectToken) {
    
    
    
    
    this.subjectToken = subjectToken;
    return this;
  }

   /**
   * The token to exchange for a downscoped token. This can be a regular access token, a JWT assertion, or an app token.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:token-exchange&#x60; as the &#x60;grant_type&#x60;.
   * @return subjectToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c3FIOG9vSGV4VHo4QzAyg5T1JvNnJoZ3ExaVNyQWw6WjRsanRKZG5lQk9qUE1BVQ", value = "The token to exchange for a downscoped token. This can be a regular access token, a JWT assertion, or an app token.  Used in combination with `urn:ietf:params:oauth:grant-type:token-exchange` as the `grant_type`.")

  public String getSubjectToken() {
    return subjectToken;
  }


  public void setSubjectToken(String subjectToken) {
    
    
    
    this.subjectToken = subjectToken;
  }


  public PostOAuth2Token subjectTokenType(SubjectTokenTypeEnum subjectTokenType) {
    
    
    
    
    this.subjectTokenType = subjectTokenType;
    return this;
  }

   /**
   * The type of &#x60;subject_token&#x60; passed in.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:token-exchange&#x60; as the &#x60;grant_type&#x60;.
   * @return subjectTokenType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "URN_IETF_PARAMS_OAUTH_TOKEN_TYPE_ACCESS_TOKEN", value = "The type of `subject_token` passed in.  Used in combination with `urn:ietf:params:oauth:grant-type:token-exchange` as the `grant_type`.")

  public SubjectTokenTypeEnum getSubjectTokenType() {
    return subjectTokenType;
  }


  public void setSubjectTokenType(SubjectTokenTypeEnum subjectTokenType) {
    
    
    
    this.subjectTokenType = subjectTokenType;
  }


  public PostOAuth2Token actorToken(String actorToken) {
    
    
    
    
    this.actorToken = actorToken;
    return this;
  }

   /**
   * The token used to create an annotator token. This is a JWT assertion.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:token-exchange&#x60; as the &#x60;grant_type&#x60;.
   * @return actorToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c3FIOG9vSGV4VHo4QzAyg5T1JvNnJoZ3ExaVNyQWw6WjRsanRKZG5lQk9qUE1BVQ", value = "The token used to create an annotator token. This is a JWT assertion.  Used in combination with `urn:ietf:params:oauth:grant-type:token-exchange` as the `grant_type`.")

  public String getActorToken() {
    return actorToken;
  }


  public void setActorToken(String actorToken) {
    
    
    
    this.actorToken = actorToken;
  }


  public PostOAuth2Token actorTokenType(ActorTokenTypeEnum actorTokenType) {
    
    
    
    
    this.actorTokenType = actorTokenType;
    return this;
  }

   /**
   * The type of &#x60;actor_token&#x60; passed in.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:token-exchange&#x60; as the &#x60;grant_type&#x60;.
   * @return actorTokenType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "URN_IETF_PARAMS_OAUTH_TOKEN_TYPE_ID_TOKEN", value = "The type of `actor_token` passed in.  Used in combination with `urn:ietf:params:oauth:grant-type:token-exchange` as the `grant_type`.")

  public ActorTokenTypeEnum getActorTokenType() {
    return actorTokenType;
  }


  public void setActorTokenType(ActorTokenTypeEnum actorTokenType) {
    
    
    
    this.actorTokenType = actorTokenType;
  }


  public PostOAuth2Token scope(String scope) {
    
    
    
    
    this.scope = scope;
    return this;
  }

   /**
   * The space-delimited list of scopes that you want apply to the new access token.  The &#x60;subject_token&#x60; will need to have all of these scopes or the call will error with **401 Unauthorized**.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "item_upload item_preview base_explorer", value = "The space-delimited list of scopes that you want apply to the new access token.  The `subject_token` will need to have all of these scopes or the call will error with **401 Unauthorized**.")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    
    
    
    this.scope = scope;
  }


  public PostOAuth2Token resource(String resource) {
    
    
    
    
    this.resource = resource;
    return this;
  }

   /**
   * Full URL for the file that the token should be generated for.
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.box.com/2.0/files/123456", value = "Full URL for the file that the token should be generated for.")

  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    
    
    
    this.resource = resource;
  }


  public PostOAuth2Token boxSubjectType(BoxSubjectTypeEnum boxSubjectType) {
    
    
    
    
    this.boxSubjectType = boxSubjectType;
    return this;
  }

   /**
   * Used in combination with &#x60;client_credentials&#x60; as the &#x60;grant_type&#x60;.
   * @return boxSubjectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTERPRISE", value = "Used in combination with `client_credentials` as the `grant_type`.")

  public BoxSubjectTypeEnum getBoxSubjectType() {
    return boxSubjectType;
  }


  public void setBoxSubjectType(BoxSubjectTypeEnum boxSubjectType) {
    
    
    
    this.boxSubjectType = boxSubjectType;
  }


  public PostOAuth2Token boxSubjectId(String boxSubjectId) {
    
    
    
    
    this.boxSubjectId = boxSubjectId;
    return this;
  }

   /**
   * Used in combination with &#x60;client_credentials&#x60; as the &#x60;grant_type&#x60;. Value is determined by &#x60;box_subject_type&#x60;. If &#x60;user&#x60; use user ID and if &#x60;enterprise&#x60; use enterprise ID.
   * @return boxSubjectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456789", value = "Used in combination with `client_credentials` as the `grant_type`. Value is determined by `box_subject_type`. If `user` use user ID and if `enterprise` use enterprise ID.")

  public String getBoxSubjectId() {
    return boxSubjectId;
  }


  public void setBoxSubjectId(String boxSubjectId) {
    
    
    
    this.boxSubjectId = boxSubjectId;
  }


  public PostOAuth2Token boxSharedLink(String boxSharedLink) {
    
    
    
    
    this.boxSharedLink = boxSharedLink;
    return this;
  }

   /**
   * Full URL of the shared link on the file or folder that the token should be generated for.
   * @return boxSharedLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://cloud.box.com/s/123456", value = "Full URL of the shared link on the file or folder that the token should be generated for.")

  public String getBoxSharedLink() {
    return boxSharedLink;
  }


  public void setBoxSharedLink(String boxSharedLink) {
    
    
    
    this.boxSharedLink = boxSharedLink;
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
   * @return the PostOAuth2Token instance itself
   */
  public PostOAuth2Token putAdditionalProperty(String key, Object value) {
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
    PostOAuth2Token postOAuth2Token = (PostOAuth2Token) o;
    return Objects.equals(this.grantType, postOAuth2Token.grantType) &&
        Objects.equals(this.clientId, postOAuth2Token.clientId) &&
        Objects.equals(this.clientSecret, postOAuth2Token.clientSecret) &&
        Objects.equals(this.code, postOAuth2Token.code) &&
        Objects.equals(this.refreshToken, postOAuth2Token.refreshToken) &&
        Objects.equals(this.assertion, postOAuth2Token.assertion) &&
        Objects.equals(this.subjectToken, postOAuth2Token.subjectToken) &&
        Objects.equals(this.subjectTokenType, postOAuth2Token.subjectTokenType) &&
        Objects.equals(this.actorToken, postOAuth2Token.actorToken) &&
        Objects.equals(this.actorTokenType, postOAuth2Token.actorTokenType) &&
        Objects.equals(this.scope, postOAuth2Token.scope) &&
        Objects.equals(this.resource, postOAuth2Token.resource) &&
        Objects.equals(this.boxSubjectType, postOAuth2Token.boxSubjectType) &&
        Objects.equals(this.boxSubjectId, postOAuth2Token.boxSubjectId) &&
        Objects.equals(this.boxSharedLink, postOAuth2Token.boxSharedLink)&&
        Objects.equals(this.additionalProperties, postOAuth2Token.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType, clientId, clientSecret, code, refreshToken, assertion, subjectToken, subjectTokenType, actorToken, actorTokenType, scope, resource, boxSubjectType, boxSubjectId, boxSharedLink, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOAuth2Token {\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    assertion: ").append(toIndentedString(assertion)).append("\n");
    sb.append("    subjectToken: ").append(toIndentedString(subjectToken)).append("\n");
    sb.append("    subjectTokenType: ").append(toIndentedString(subjectTokenType)).append("\n");
    sb.append("    actorToken: ").append(toIndentedString(actorToken)).append("\n");
    sb.append("    actorTokenType: ").append(toIndentedString(actorTokenType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    boxSubjectType: ").append(toIndentedString(boxSubjectType)).append("\n");
    sb.append("    boxSubjectId: ").append(toIndentedString(boxSubjectId)).append("\n");
    sb.append("    boxSharedLink: ").append(toIndentedString(boxSharedLink)).append("\n");
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
    openapiFields.add("grant_type");
    openapiFields.add("client_id");
    openapiFields.add("client_secret");
    openapiFields.add("code");
    openapiFields.add("refresh_token");
    openapiFields.add("assertion");
    openapiFields.add("subject_token");
    openapiFields.add("subject_token_type");
    openapiFields.add("actor_token");
    openapiFields.add("actor_token_type");
    openapiFields.add("scope");
    openapiFields.add("resource");
    openapiFields.add("box_subject_type");
    openapiFields.add("box_subject_id");
    openapiFields.add("box_shared_link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("grant_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostOAuth2Token
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PostOAuth2Token.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostOAuth2Token is not found in the empty JSON string", PostOAuth2Token.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PostOAuth2Token.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("grant_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grant_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grant_type").toString()));
      }
      if ((jsonObj.get("client_id") != null && !jsonObj.get("client_id").isJsonNull()) && !jsonObj.get("client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_id").toString()));
      }
      if ((jsonObj.get("client_secret") != null && !jsonObj.get("client_secret").isJsonNull()) && !jsonObj.get("client_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_secret").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("refresh_token") != null && !jsonObj.get("refresh_token").isJsonNull()) && !jsonObj.get("refresh_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refresh_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refresh_token").toString()));
      }
      if ((jsonObj.get("assertion") != null && !jsonObj.get("assertion").isJsonNull()) && !jsonObj.get("assertion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assertion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assertion").toString()));
      }
      if ((jsonObj.get("subject_token") != null && !jsonObj.get("subject_token").isJsonNull()) && !jsonObj.get("subject_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject_token").toString()));
      }
      if ((jsonObj.get("subject_token_type") != null && !jsonObj.get("subject_token_type").isJsonNull()) && !jsonObj.get("subject_token_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject_token_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject_token_type").toString()));
      }
      if ((jsonObj.get("actor_token") != null && !jsonObj.get("actor_token").isJsonNull()) && !jsonObj.get("actor_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actor_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actor_token").toString()));
      }
      if ((jsonObj.get("actor_token_type") != null && !jsonObj.get("actor_token_type").isJsonNull()) && !jsonObj.get("actor_token_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actor_token_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actor_token_type").toString()));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if ((jsonObj.get("resource") != null && !jsonObj.get("resource").isJsonNull()) && !jsonObj.get("resource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource").toString()));
      }
      if ((jsonObj.get("box_subject_type") != null && !jsonObj.get("box_subject_type").isJsonNull()) && !jsonObj.get("box_subject_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_subject_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_subject_type").toString()));
      }
      if ((jsonObj.get("box_subject_id") != null && !jsonObj.get("box_subject_id").isJsonNull()) && !jsonObj.get("box_subject_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_subject_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_subject_id").toString()));
      }
      if ((jsonObj.get("box_shared_link") != null && !jsonObj.get("box_shared_link").isJsonNull()) && !jsonObj.get("box_shared_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_shared_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_shared_link").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostOAuth2Token.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostOAuth2Token' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostOAuth2Token> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostOAuth2Token.class));

       return (TypeAdapter<T>) new TypeAdapter<PostOAuth2Token>() {
           @Override
           public void write(JsonWriter out, PostOAuth2Token value) throws IOException {
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
           public PostOAuth2Token read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PostOAuth2Token instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PostOAuth2Token given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostOAuth2Token
  * @throws IOException if the JSON string is invalid with respect to PostOAuth2Token
  */
  public static PostOAuth2Token fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostOAuth2Token.class);
  }

 /**
  * Convert an instance of PostOAuth2Token to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

