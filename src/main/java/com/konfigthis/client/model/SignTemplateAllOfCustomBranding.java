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
 * Custom branding applied to notifications and signature requests.
 */
@ApiModel(description = "Custom branding applied to notifications and signature requests.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SignTemplateAllOfCustomBranding {
  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_LOGO_URI = "logo_uri";
  @SerializedName(SERIALIZED_NAME_LOGO_URI)
  private String logoUri;

  public static final String SERIALIZED_NAME_BRANDING_COLOR = "branding_color";
  @SerializedName(SERIALIZED_NAME_BRANDING_COLOR)
  private String brandingColor;

  public static final String SERIALIZED_NAME_EMAIL_FOOTER_TEXT = "email_footer_text";
  @SerializedName(SERIALIZED_NAME_EMAIL_FOOTER_TEXT)
  private String emailFooterText;

  public SignTemplateAllOfCustomBranding() {
  }

  public SignTemplateAllOfCustomBranding companyName(String companyName) {
    
    
    
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Name of the company
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Corporation inc.", value = "Name of the company")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    
    
    
    this.companyName = companyName;
  }


  public SignTemplateAllOfCustomBranding logoUri(String logoUri) {
    
    
    
    
    this.logoUri = logoUri;
    return this;
  }

   /**
   * Custom branding logo URI in the form of a base64 image.
   * @return logoUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAA AAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNk+A 8AAQUBAScY42YAAAAASUVORK5CYII=", value = "Custom branding logo URI in the form of a base64 image.")

  public String getLogoUri() {
    return logoUri;
  }


  public void setLogoUri(String logoUri) {
    
    
    
    this.logoUri = logoUri;
  }


  public SignTemplateAllOfCustomBranding brandingColor(String brandingColor) {
    
    
    
    
    this.brandingColor = brandingColor;
    return this;
  }

   /**
   * Custom branding color in hex.
   * @return brandingColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9E5E6F", value = "Custom branding color in hex.")

  public String getBrandingColor() {
    return brandingColor;
  }


  public void setBrandingColor(String brandingColor) {
    
    
    
    this.brandingColor = brandingColor;
  }


  public SignTemplateAllOfCustomBranding emailFooterText(String emailFooterText) {
    
    
    
    
    this.emailFooterText = emailFooterText;
    return this;
  }

   /**
   * Content of the email footer.
   * @return emailFooterText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Contact email email@mail.com", value = "Content of the email footer.")

  public String getEmailFooterText() {
    return emailFooterText;
  }


  public void setEmailFooterText(String emailFooterText) {
    
    
    
    this.emailFooterText = emailFooterText;
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
   * @return the SignTemplateAllOfCustomBranding instance itself
   */
  public SignTemplateAllOfCustomBranding putAdditionalProperty(String key, Object value) {
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
    SignTemplateAllOfCustomBranding signTemplateAllOfCustomBranding = (SignTemplateAllOfCustomBranding) o;
    return Objects.equals(this.companyName, signTemplateAllOfCustomBranding.companyName) &&
        Objects.equals(this.logoUri, signTemplateAllOfCustomBranding.logoUri) &&
        Objects.equals(this.brandingColor, signTemplateAllOfCustomBranding.brandingColor) &&
        Objects.equals(this.emailFooterText, signTemplateAllOfCustomBranding.emailFooterText)&&
        Objects.equals(this.additionalProperties, signTemplateAllOfCustomBranding.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, logoUri, brandingColor, emailFooterText, additionalProperties);
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
    sb.append("class SignTemplateAllOfCustomBranding {\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    brandingColor: ").append(toIndentedString(brandingColor)).append("\n");
    sb.append("    emailFooterText: ").append(toIndentedString(emailFooterText)).append("\n");
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
    openapiFields.add("company_name");
    openapiFields.add("logo_uri");
    openapiFields.add("branding_color");
    openapiFields.add("email_footer_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SignTemplateAllOfCustomBranding
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SignTemplateAllOfCustomBranding.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignTemplateAllOfCustomBranding is not found in the empty JSON string", SignTemplateAllOfCustomBranding.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("company_name").isJsonNull() && (jsonObj.get("company_name") != null && !jsonObj.get("company_name").isJsonNull()) && !jsonObj.get("company_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_name").toString()));
      }
      if (!jsonObj.get("logo_uri").isJsonNull() && (jsonObj.get("logo_uri") != null && !jsonObj.get("logo_uri").isJsonNull()) && !jsonObj.get("logo_uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_uri").toString()));
      }
      if (!jsonObj.get("branding_color").isJsonNull() && (jsonObj.get("branding_color") != null && !jsonObj.get("branding_color").isJsonNull()) && !jsonObj.get("branding_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branding_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branding_color").toString()));
      }
      if (!jsonObj.get("email_footer_text").isJsonNull() && (jsonObj.get("email_footer_text") != null && !jsonObj.get("email_footer_text").isJsonNull()) && !jsonObj.get("email_footer_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_footer_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_footer_text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SignTemplateAllOfCustomBranding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignTemplateAllOfCustomBranding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignTemplateAllOfCustomBranding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignTemplateAllOfCustomBranding.class));

       return (TypeAdapter<T>) new TypeAdapter<SignTemplateAllOfCustomBranding>() {
           @Override
           public void write(JsonWriter out, SignTemplateAllOfCustomBranding value) throws IOException {
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
           public SignTemplateAllOfCustomBranding read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SignTemplateAllOfCustomBranding instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SignTemplateAllOfCustomBranding given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SignTemplateAllOfCustomBranding
  * @throws IOException if the JSON string is invalid with respect to SignTemplateAllOfCustomBranding
  */
  public static SignTemplateAllOfCustomBranding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignTemplateAllOfCustomBranding.class);
  }

 /**
  * Convert an instance of SignTemplateAllOfCustomBranding to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
