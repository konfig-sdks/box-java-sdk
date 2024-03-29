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
import com.konfigthis.client.model.FileBase;
import com.konfigthis.client.model.FolderMini;
import com.konfigthis.client.model.SignRequestCreateSigner;
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
 * SignRequestCreateRequestAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SignRequestCreateRequestAllOf {
  public static final String SERIALIZED_NAME_SOURCE_FILES = "source_files";
  @SerializedName(SERIALIZED_NAME_SOURCE_FILES)
  private List<FileBase> sourceFiles = null;

  /**
   * Force a specific color for the signature (blue, black, or red)
   */
  @JsonAdapter(SignatureColorEnum.Adapter.class)
 public enum SignatureColorEnum {
    BLUE("blue"),
    
    BLACK("black"),
    
    RED("red");

    private String value;

    SignatureColorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignatureColorEnum fromValue(String value) {
      for (SignatureColorEnum b : SignatureColorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SignatureColorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SignatureColorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SignatureColorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SignatureColorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SIGNATURE_COLOR = "signature_color";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_COLOR)
  private SignatureColorEnum signatureColor;

  public static final String SERIALIZED_NAME_SIGNERS = "signers";
  @SerializedName(SERIALIZED_NAME_SIGNERS)
  private List<SignRequestCreateSigner> signers = null;

  public static final String SERIALIZED_NAME_PARENT_FOLDER = "parent_folder";
  @SerializedName(SERIALIZED_NAME_PARENT_FOLDER)
  private FolderMini parentFolder;

  public SignRequestCreateRequestAllOf() {
  }

  public SignRequestCreateRequestAllOf sourceFiles(List<FileBase> sourceFiles) {
    
    
    
    
    this.sourceFiles = sourceFiles;
    return this;
  }

  public SignRequestCreateRequestAllOf addSourceFilesItem(FileBase sourceFilesItem) {
    if (this.sourceFiles == null) {
      this.sourceFiles = new ArrayList<>();
    }
    this.sourceFiles.add(sourceFilesItem);
    return this;
  }

   /**
   * List of files to create a signing document from. This is currently limited to ten files. Only the ID and type fields are required for each file.
   * @return sourceFiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of files to create a signing document from. This is currently limited to ten files. Only the ID and type fields are required for each file.")

  public List<FileBase> getSourceFiles() {
    return sourceFiles;
  }


  public void setSourceFiles(List<FileBase> sourceFiles) {
    
    
    
    this.sourceFiles = sourceFiles;
  }


  public SignRequestCreateRequestAllOf signatureColor(SignatureColorEnum signatureColor) {
    
    
    
    
    this.signatureColor = signatureColor;
    return this;
  }

   /**
   * Force a specific color for the signature (blue, black, or red)
   * @return signatureColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BLUE", value = "Force a specific color for the signature (blue, black, or red)")

  public SignatureColorEnum getSignatureColor() {
    return signatureColor;
  }


  public void setSignatureColor(SignatureColorEnum signatureColor) {
    
    
    
    this.signatureColor = signatureColor;
  }


  public SignRequestCreateRequestAllOf signers(List<SignRequestCreateSigner> signers) {
    
    
    
    
    this.signers = signers;
    return this;
  }

  public SignRequestCreateRequestAllOf addSignersItem(SignRequestCreateSigner signersItem) {
    if (this.signers == null) {
      this.signers = new ArrayList<>();
    }
    this.signers.add(signersItem);
    return this;
  }

   /**
   * Array of signers for the sign request. 35 is the max number of signers permitted.
   * @return signers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of signers for the sign request. 35 is the max number of signers permitted.")

  public List<SignRequestCreateSigner> getSigners() {
    return signers;
  }


  public void setSigners(List<SignRequestCreateSigner> signers) {
    
    
    
    this.signers = signers;
  }


  public SignRequestCreateRequestAllOf parentFolder(FolderMini parentFolder) {
    
    
    
    
    this.parentFolder = parentFolder;
    return this;
  }

   /**
   * Get parentFolder
   * @return parentFolder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FolderMini getParentFolder() {
    return parentFolder;
  }


  public void setParentFolder(FolderMini parentFolder) {
    
    
    
    this.parentFolder = parentFolder;
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
   * @return the SignRequestCreateRequestAllOf instance itself
   */
  public SignRequestCreateRequestAllOf putAdditionalProperty(String key, Object value) {
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
    SignRequestCreateRequestAllOf signRequestCreateRequestAllOf = (SignRequestCreateRequestAllOf) o;
    return Objects.equals(this.sourceFiles, signRequestCreateRequestAllOf.sourceFiles) &&
        Objects.equals(this.signatureColor, signRequestCreateRequestAllOf.signatureColor) &&
        Objects.equals(this.signers, signRequestCreateRequestAllOf.signers) &&
        Objects.equals(this.parentFolder, signRequestCreateRequestAllOf.parentFolder)&&
        Objects.equals(this.additionalProperties, signRequestCreateRequestAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceFiles, signatureColor, signers, parentFolder, additionalProperties);
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
    sb.append("class SignRequestCreateRequestAllOf {\n");
    sb.append("    sourceFiles: ").append(toIndentedString(sourceFiles)).append("\n");
    sb.append("    signatureColor: ").append(toIndentedString(signatureColor)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    parentFolder: ").append(toIndentedString(parentFolder)).append("\n");
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
    openapiFields.add("source_files");
    openapiFields.add("signature_color");
    openapiFields.add("signers");
    openapiFields.add("parent_folder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SignRequestCreateRequestAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SignRequestCreateRequestAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignRequestCreateRequestAllOf is not found in the empty JSON string", SignRequestCreateRequestAllOf.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("source_files") != null && !jsonObj.get("source_files").isJsonNull()) {
        JsonArray jsonArraysourceFiles = jsonObj.getAsJsonArray("source_files");
        if (jsonArraysourceFiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("source_files").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `source_files` to be an array in the JSON string but got `%s`", jsonObj.get("source_files").toString()));
          }

          // validate the optional field `source_files` (array)
          for (int i = 0; i < jsonArraysourceFiles.size(); i++) {
            FileBase.validateJsonObject(jsonArraysourceFiles.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("signature_color").isJsonNull() && (jsonObj.get("signature_color") != null && !jsonObj.get("signature_color").isJsonNull()) && !jsonObj.get("signature_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature_color").toString()));
      }
      if (jsonObj.get("signers") != null && !jsonObj.get("signers").isJsonNull()) {
        JsonArray jsonArraysigners = jsonObj.getAsJsonArray("signers");
        if (jsonArraysigners != null) {
          // ensure the json data is an array
          if (!jsonObj.get("signers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `signers` to be an array in the JSON string but got `%s`", jsonObj.get("signers").toString()));
          }

          // validate the optional field `signers` (array)
          for (int i = 0; i < jsonArraysigners.size(); i++) {
            SignRequestCreateSigner.validateJsonObject(jsonArraysigners.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `parent_folder`
      if (jsonObj.get("parent_folder") != null && !jsonObj.get("parent_folder").isJsonNull()) {
        FolderMini.validateJsonObject(jsonObj.getAsJsonObject("parent_folder"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SignRequestCreateRequestAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignRequestCreateRequestAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignRequestCreateRequestAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignRequestCreateRequestAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<SignRequestCreateRequestAllOf>() {
           @Override
           public void write(JsonWriter out, SignRequestCreateRequestAllOf value) throws IOException {
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
           public SignRequestCreateRequestAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SignRequestCreateRequestAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SignRequestCreateRequestAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SignRequestCreateRequestAllOf
  * @throws IOException if the JSON string is invalid with respect to SignRequestCreateRequestAllOf
  */
  public static SignRequestCreateRequestAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignRequestCreateRequestAllOf.class);
  }

 /**
  * Convert an instance of SignRequestCreateRequestAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

