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
import com.konfigthis.client.model.FileMini;
import com.konfigthis.client.model.FolderMini;
import com.konfigthis.client.model.SignRequestAllOfSignFiles;
import com.konfigthis.client.model.SignRequestSigner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * SignRequestAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SignRequestAllOf {
  /**
   * object type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    SIGN_REQUEST("sign-request");

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

  public static final String SERIALIZED_NAME_SOURCE_FILES = "source_files";
  @SerializedName(SERIALIZED_NAME_SOURCE_FILES)
  private List<FileBase> sourceFiles = null;

  public static final String SERIALIZED_NAME_SIGNERS = "signers";
  @SerializedName(SERIALIZED_NAME_SIGNERS)
  private List<SignRequestSigner> signers = null;

  public static final String SERIALIZED_NAME_SIGNATURE_COLOR = "signature_color";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_COLOR)
  private String signatureColor;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PREPARE_URL = "prepare_url";
  @SerializedName(SERIALIZED_NAME_PREPARE_URL)
  private String prepareUrl;

  public static final String SERIALIZED_NAME_SIGNING_LOG = "signing_log";
  @SerializedName(SERIALIZED_NAME_SIGNING_LOG)
  private FileMini signingLog;

  /**
   * Describes the status of the sign request
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    CONVERTING("converting"),
    
    CREATED("created"),
    
    SENT("sent"),
    
    VIEWED("viewed"),
    
    SIGNED("signed"),
    
    CANCELLED("cancelled"),
    
    DECLINED("declined"),
    
    ERROR_CONVERTING("error_converting"),
    
    ERROR_SENDING("error_sending"),
    
    EXPIRED("expired"),
    
    FINALIZING("finalizing"),
    
    ERROR_FINALIZING("error_finalizing");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_SIGN_FILES = "sign_files";
  @SerializedName(SERIALIZED_NAME_SIGN_FILES)
  private SignRequestAllOfSignFiles signFiles;

  public static final String SERIALIZED_NAME_AUTO_EXPIRE_AT = "auto_expire_at";
  @SerializedName(SERIALIZED_NAME_AUTO_EXPIRE_AT)
  private OffsetDateTime autoExpireAt;

  public static final String SERIALIZED_NAME_PARENT_FOLDER = "parent_folder";
  @SerializedName(SERIALIZED_NAME_PARENT_FOLDER)
  private FolderMini parentFolder;

  public SignRequestAllOf() {
  }

  public SignRequestAllOf type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * object type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SIGN_REQUEST", value = "object type")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public SignRequestAllOf sourceFiles(List<FileBase> sourceFiles) {
    
    
    
    
    this.sourceFiles = sourceFiles;
    return this;
  }

  public SignRequestAllOf addSourceFilesItem(FileBase sourceFilesItem) {
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


  public SignRequestAllOf signers(List<SignRequestSigner> signers) {
    
    
    
    
    this.signers = signers;
    return this;
  }

  public SignRequestAllOf addSignersItem(SignRequestSigner signersItem) {
    if (this.signers == null) {
      this.signers = new ArrayList<>();
    }
    this.signers.add(signersItem);
    return this;
  }

   /**
   * Array of signers for the sign request
   * @return signers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of signers for the sign request")

  public List<SignRequestSigner> getSigners() {
    return signers;
  }


  public void setSigners(List<SignRequestSigner> signers) {
    
    
    
    this.signers = signers;
  }


  public SignRequestAllOf signatureColor(String signatureColor) {
    
    
    
    
    this.signatureColor = signatureColor;
    return this;
  }

   /**
   * Force a specific color for the signature (blue, black, or red).
   * @return signatureColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "blue", value = "Force a specific color for the signature (blue, black, or red).")

  public String getSignatureColor() {
    return signatureColor;
  }


  public void setSignatureColor(String signatureColor) {
    
    
    
    this.signatureColor = signatureColor;
  }


  public SignRequestAllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Sign request ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "Sign request ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public SignRequestAllOf prepareUrl(String prepareUrl) {
    
    
    
    
    this.prepareUrl = prepareUrl;
    return this;
  }

   /**
   * This URL is returned if &#x60;is_document_preparation_needed&#x60; is set to &#x60;true&#x60; in the request. It is used to prepare the sign request via UI. The sign request is not sent until preparation is complete.
   * @return prepareUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://prepareurl.com", value = "This URL is returned if `is_document_preparation_needed` is set to `true` in the request. It is used to prepare the sign request via UI. The sign request is not sent until preparation is complete.")

  public String getPrepareUrl() {
    return prepareUrl;
  }


  public void setPrepareUrl(String prepareUrl) {
    
    
    
    this.prepareUrl = prepareUrl;
  }


  public SignRequestAllOf signingLog(FileMini signingLog) {
    
    
    
    
    this.signingLog = signingLog;
    return this;
  }

   /**
   * Get signingLog
   * @return signingLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileMini getSigningLog() {
    return signingLog;
  }


  public void setSigningLog(FileMini signingLog) {
    
    
    
    this.signingLog = signingLog;
  }


  public SignRequestAllOf status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Describes the status of the sign request
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CONVERTING", value = "Describes the status of the sign request")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public SignRequestAllOf signFiles(SignRequestAllOfSignFiles signFiles) {
    
    
    
    
    this.signFiles = signFiles;
    return this;
  }

   /**
   * Get signFiles
   * @return signFiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignRequestAllOfSignFiles getSignFiles() {
    return signFiles;
  }


  public void setSignFiles(SignRequestAllOfSignFiles signFiles) {
    
    
    
    this.signFiles = signFiles;
  }


  public SignRequestAllOf autoExpireAt(OffsetDateTime autoExpireAt) {
    
    
    
    
    this.autoExpireAt = autoExpireAt;
    return this;
  }

   /**
   * Uses &#x60;days_valid&#x60; to calculate the date and time, in GMT, the sign request will expire if unsigned.
   * @return autoExpireAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-04-26T08:12:13.982Z", value = "Uses `days_valid` to calculate the date and time, in GMT, the sign request will expire if unsigned.")

  public OffsetDateTime getAutoExpireAt() {
    return autoExpireAt;
  }


  public void setAutoExpireAt(OffsetDateTime autoExpireAt) {
    
    
    
    this.autoExpireAt = autoExpireAt;
  }


  public SignRequestAllOf parentFolder(FolderMini parentFolder) {
    
    
    
    
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
   * @return the SignRequestAllOf instance itself
   */
  public SignRequestAllOf putAdditionalProperty(String key, Object value) {
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
    SignRequestAllOf signRequestAllOf = (SignRequestAllOf) o;
    return Objects.equals(this.type, signRequestAllOf.type) &&
        Objects.equals(this.sourceFiles, signRequestAllOf.sourceFiles) &&
        Objects.equals(this.signers, signRequestAllOf.signers) &&
        Objects.equals(this.signatureColor, signRequestAllOf.signatureColor) &&
        Objects.equals(this.id, signRequestAllOf.id) &&
        Objects.equals(this.prepareUrl, signRequestAllOf.prepareUrl) &&
        Objects.equals(this.signingLog, signRequestAllOf.signingLog) &&
        Objects.equals(this.status, signRequestAllOf.status) &&
        Objects.equals(this.signFiles, signRequestAllOf.signFiles) &&
        Objects.equals(this.autoExpireAt, signRequestAllOf.autoExpireAt) &&
        Objects.equals(this.parentFolder, signRequestAllOf.parentFolder)&&
        Objects.equals(this.additionalProperties, signRequestAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, sourceFiles, signers, signatureColor, id, prepareUrl, signingLog, status, signFiles, autoExpireAt, parentFolder, additionalProperties);
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
    sb.append("class SignRequestAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sourceFiles: ").append(toIndentedString(sourceFiles)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    signatureColor: ").append(toIndentedString(signatureColor)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    prepareUrl: ").append(toIndentedString(prepareUrl)).append("\n");
    sb.append("    signingLog: ").append(toIndentedString(signingLog)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    signFiles: ").append(toIndentedString(signFiles)).append("\n");
    sb.append("    autoExpireAt: ").append(toIndentedString(autoExpireAt)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("source_files");
    openapiFields.add("signers");
    openapiFields.add("signature_color");
    openapiFields.add("id");
    openapiFields.add("prepare_url");
    openapiFields.add("signing_log");
    openapiFields.add("status");
    openapiFields.add("sign_files");
    openapiFields.add("auto_expire_at");
    openapiFields.add("parent_folder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SignRequestAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SignRequestAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignRequestAllOf is not found in the empty JSON string", SignRequestAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
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
      if (jsonObj.get("signers") != null && !jsonObj.get("signers").isJsonNull()) {
        JsonArray jsonArraysigners = jsonObj.getAsJsonArray("signers");
        if (jsonArraysigners != null) {
          // ensure the json data is an array
          if (!jsonObj.get("signers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `signers` to be an array in the JSON string but got `%s`", jsonObj.get("signers").toString()));
          }

          // validate the optional field `signers` (array)
          for (int i = 0; i < jsonArraysigners.size(); i++) {
            SignRequestSigner.validateJsonObject(jsonArraysigners.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("signature_color").isJsonNull() && (jsonObj.get("signature_color") != null && !jsonObj.get("signature_color").isJsonNull()) && !jsonObj.get("signature_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature_color").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("prepare_url").isJsonNull() && (jsonObj.get("prepare_url") != null && !jsonObj.get("prepare_url").isJsonNull()) && !jsonObj.get("prepare_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prepare_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prepare_url").toString()));
      }
      // validate the optional field `signing_log`
      if (jsonObj.get("signing_log") != null && !jsonObj.get("signing_log").isJsonNull()) {
        FileMini.validateJsonObject(jsonObj.getAsJsonObject("signing_log"));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `sign_files`
      if (jsonObj.get("sign_files") != null && !jsonObj.get("sign_files").isJsonNull()) {
        SignRequestAllOfSignFiles.validateJsonObject(jsonObj.getAsJsonObject("sign_files"));
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
       if (!SignRequestAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignRequestAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignRequestAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignRequestAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<SignRequestAllOf>() {
           @Override
           public void write(JsonWriter out, SignRequestAllOf value) throws IOException {
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
           public SignRequestAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SignRequestAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SignRequestAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SignRequestAllOf
  * @throws IOException if the JSON string is invalid with respect to SignRequestAllOf
  */
  public static SignRequestAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignRequestAllOf.class);
  }

 /**
  * Convert an instance of SignRequestAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

