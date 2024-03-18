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
import com.konfigthis.client.model.SignRequestSignerAllOfSignerDecision;
import com.konfigthis.client.model.SignRequestSignerInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * SignRequestSignerAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SignRequestSignerAllOf {
  public static final String SERIALIZED_NAME_HAS_VIEWED_DOCUMENT = "has_viewed_document";
  @SerializedName(SERIALIZED_NAME_HAS_VIEWED_DOCUMENT)
  private Boolean hasViewedDocument;

  public static final String SERIALIZED_NAME_SIGNER_DECISION = "signer_decision";
  @SerializedName(SERIALIZED_NAME_SIGNER_DECISION)
  private SignRequestSignerAllOfSignerDecision signerDecision;

  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  private List<SignRequestSignerInput> inputs = null;

  public static final String SERIALIZED_NAME_EMBED_URL = "embed_url";
  @SerializedName(SERIALIZED_NAME_EMBED_URL)
  private String embedUrl;

  public static final String SERIALIZED_NAME_IFRAMEABLE_EMBED_URL = "iframeable_embed_url";
  @SerializedName(SERIALIZED_NAME_IFRAMEABLE_EMBED_URL)
  private String iframeableEmbedUrl;

  public SignRequestSignerAllOf() {
  }

  
  public SignRequestSignerAllOf(
     Boolean hasViewedDocument, 
     List<SignRequestSignerInput> inputs, 
     String embedUrl
  ) {
    this();
    this.hasViewedDocument = hasViewedDocument;
    this.inputs = inputs;
    this.embedUrl = embedUrl;
  }

   /**
   * Set to &#x60;true&#x60; if the signer views the document
   * @return hasViewedDocument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Set to `true` if the signer views the document")

  public Boolean getHasViewedDocument() {
    return hasViewedDocument;
  }




  public SignRequestSignerAllOf signerDecision(SignRequestSignerAllOfSignerDecision signerDecision) {
    
    
    
    
    this.signerDecision = signerDecision;
    return this;
  }

   /**
   * Get signerDecision
   * @return signerDecision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignRequestSignerAllOfSignerDecision getSignerDecision() {
    return signerDecision;
  }


  public void setSignerDecision(SignRequestSignerAllOfSignerDecision signerDecision) {
    
    
    
    this.signerDecision = signerDecision;
  }


   /**
   * Get inputs
   * @return inputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SignRequestSignerInput> getInputs() {
    return inputs;
  }




   /**
   * URL to direct a signer to for signing
   * @return embedUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com", value = "URL to direct a signer to for signing")

  public String getEmbedUrl() {
    return embedUrl;
  }




  public SignRequestSignerAllOf iframeableEmbedUrl(String iframeableEmbedUrl) {
    
    
    
    
    this.iframeableEmbedUrl = iframeableEmbedUrl;
    return this;
  }

   /**
   * This URL is specifically designed for signing documents within an HTML &#x60;iframe&#x60; tag. It will be returned in the response only if the &#x60;embed_url_external_user_id&#x60; parameter was passed in the &#x60;create sign request&#x60; call.
   * @return iframeableEmbedUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://app.box.com/embed/sign/document/gfhr4222-a331-494b-808b-79bc7f3992a3/f14d7098-a331-494b-808b-79bc7f3992a4", value = "This URL is specifically designed for signing documents within an HTML `iframe` tag. It will be returned in the response only if the `embed_url_external_user_id` parameter was passed in the `create sign request` call.")

  public String getIframeableEmbedUrl() {
    return iframeableEmbedUrl;
  }


  public void setIframeableEmbedUrl(String iframeableEmbedUrl) {
    
    
    
    this.iframeableEmbedUrl = iframeableEmbedUrl;
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
   * @return the SignRequestSignerAllOf instance itself
   */
  public SignRequestSignerAllOf putAdditionalProperty(String key, Object value) {
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
    SignRequestSignerAllOf signRequestSignerAllOf = (SignRequestSignerAllOf) o;
    return Objects.equals(this.hasViewedDocument, signRequestSignerAllOf.hasViewedDocument) &&
        Objects.equals(this.signerDecision, signRequestSignerAllOf.signerDecision) &&
        Objects.equals(this.inputs, signRequestSignerAllOf.inputs) &&
        Objects.equals(this.embedUrl, signRequestSignerAllOf.embedUrl) &&
        Objects.equals(this.iframeableEmbedUrl, signRequestSignerAllOf.iframeableEmbedUrl)&&
        Objects.equals(this.additionalProperties, signRequestSignerAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasViewedDocument, signerDecision, inputs, embedUrl, iframeableEmbedUrl, additionalProperties);
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
    sb.append("class SignRequestSignerAllOf {\n");
    sb.append("    hasViewedDocument: ").append(toIndentedString(hasViewedDocument)).append("\n");
    sb.append("    signerDecision: ").append(toIndentedString(signerDecision)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    embedUrl: ").append(toIndentedString(embedUrl)).append("\n");
    sb.append("    iframeableEmbedUrl: ").append(toIndentedString(iframeableEmbedUrl)).append("\n");
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
    openapiFields.add("has_viewed_document");
    openapiFields.add("signer_decision");
    openapiFields.add("inputs");
    openapiFields.add("embed_url");
    openapiFields.add("iframeable_embed_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SignRequestSignerAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SignRequestSignerAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignRequestSignerAllOf is not found in the empty JSON string", SignRequestSignerAllOf.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `signer_decision`
      if (jsonObj.get("signer_decision") != null && !jsonObj.get("signer_decision").isJsonNull()) {
        SignRequestSignerAllOfSignerDecision.validateJsonObject(jsonObj.getAsJsonObject("signer_decision"));
      }
      if (jsonObj.get("inputs") != null && !jsonObj.get("inputs").isJsonNull()) {
        JsonArray jsonArrayinputs = jsonObj.getAsJsonArray("inputs");
        if (jsonArrayinputs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("inputs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `inputs` to be an array in the JSON string but got `%s`", jsonObj.get("inputs").toString()));
          }

          // validate the optional field `inputs` (array)
          for (int i = 0; i < jsonArrayinputs.size(); i++) {
            SignRequestSignerInput.validateJsonObject(jsonArrayinputs.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("embed_url").isJsonNull() && (jsonObj.get("embed_url") != null && !jsonObj.get("embed_url").isJsonNull()) && !jsonObj.get("embed_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `embed_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("embed_url").toString()));
      }
      if (!jsonObj.get("iframeable_embed_url").isJsonNull() && (jsonObj.get("iframeable_embed_url") != null && !jsonObj.get("iframeable_embed_url").isJsonNull()) && !jsonObj.get("iframeable_embed_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iframeable_embed_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iframeable_embed_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SignRequestSignerAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignRequestSignerAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignRequestSignerAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignRequestSignerAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<SignRequestSignerAllOf>() {
           @Override
           public void write(JsonWriter out, SignRequestSignerAllOf value) throws IOException {
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
           public SignRequestSignerAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SignRequestSignerAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SignRequestSignerAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SignRequestSignerAllOf
  * @throws IOException if the JSON string is invalid with respect to SignRequestSignerAllOf
  */
  public static SignRequestSignerAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignRequestSignerAllOf.class);
  }

 /**
  * Convert an instance of SignRequestSignerAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
