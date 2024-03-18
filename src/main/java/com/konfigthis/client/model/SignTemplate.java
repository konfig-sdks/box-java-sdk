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
import com.konfigthis.client.model.FileMini;
import com.konfigthis.client.model.FolderMini;
import com.konfigthis.client.model.SignTemplateAllOfAdditionalInfo;
import com.konfigthis.client.model.SignTemplateAllOfCustomBranding;
import com.konfigthis.client.model.SignTemplateAllOfReadySignLink;
import com.konfigthis.client.model.TemplateSigner;
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
 * A Box Sign template object
 */
@ApiModel(description = "A Box Sign template object")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SignTemplate {
  /**
   * object type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    SIGN_TEMPLATE("sign-template");

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

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL_SUBJECT = "email_subject";
  @SerializedName(SERIALIZED_NAME_EMAIL_SUBJECT)
  private String emailSubject;

  public static final String SERIALIZED_NAME_EMAIL_MESSAGE = "email_message";
  @SerializedName(SERIALIZED_NAME_EMAIL_MESSAGE)
  private String emailMessage;

  public static final String SERIALIZED_NAME_DAYS_VALID = "days_valid";
  @SerializedName(SERIALIZED_NAME_DAYS_VALID)
  private Integer daysValid;

  public static final String SERIALIZED_NAME_PARENT_FOLDER = "parent_folder";
  @SerializedName(SERIALIZED_NAME_PARENT_FOLDER)
  private FolderMini parentFolder;

  public static final String SERIALIZED_NAME_SOURCE_FILES = "source_files";
  @SerializedName(SERIALIZED_NAME_SOURCE_FILES)
  private List<FileMini> sourceFiles = null;

  public static final String SERIALIZED_NAME_ARE_FIELDS_LOCKED = "are_fields_locked";
  @SerializedName(SERIALIZED_NAME_ARE_FIELDS_LOCKED)
  private Boolean areFieldsLocked;

  public static final String SERIALIZED_NAME_ARE_OPTIONS_LOCKED = "are_options_locked";
  @SerializedName(SERIALIZED_NAME_ARE_OPTIONS_LOCKED)
  private Boolean areOptionsLocked;

  public static final String SERIALIZED_NAME_ARE_RECIPIENTS_LOCKED = "are_recipients_locked";
  @SerializedName(SERIALIZED_NAME_ARE_RECIPIENTS_LOCKED)
  private Boolean areRecipientsLocked;

  public static final String SERIALIZED_NAME_ARE_EMAIL_SETTINGS_LOCKED = "are_email_settings_locked";
  @SerializedName(SERIALIZED_NAME_ARE_EMAIL_SETTINGS_LOCKED)
  private Boolean areEmailSettingsLocked;

  public static final String SERIALIZED_NAME_ARE_FILES_LOCKED = "are_files_locked";
  @SerializedName(SERIALIZED_NAME_ARE_FILES_LOCKED)
  private Boolean areFilesLocked;

  public static final String SERIALIZED_NAME_SIGNERS = "signers";
  @SerializedName(SERIALIZED_NAME_SIGNERS)
  private List<TemplateSigner> signers = null;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additional_info";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private SignTemplateAllOfAdditionalInfo additionalInfo;

  public static final String SERIALIZED_NAME_READY_SIGN_LINK = "ready_sign_link";
  @SerializedName(SERIALIZED_NAME_READY_SIGN_LINK)
  private SignTemplateAllOfReadySignLink readySignLink;

  public static final String SERIALIZED_NAME_CUSTOM_BRANDING = "custom_branding";
  @SerializedName(SERIALIZED_NAME_CUSTOM_BRANDING)
  private SignTemplateAllOfCustomBranding customBranding;

  public SignTemplate() {
  }

  public SignTemplate type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * object type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SIGN_TEMPLATE", value = "object type")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public SignTemplate id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Template identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4206996024-14944f75-c34b-478a-95a1-264b1ff80d35", value = "Template identifier.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public SignTemplate name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the template.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Official contract", value = "The name of the template.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public SignTemplate emailSubject(String emailSubject) {
    
    
    
    
    this.emailSubject = emailSubject;
    return this;
  }

   /**
   * Subject of signature request email. This is cleaned by sign request. If this field is not passed, a default subject will be used.
   * @return emailSubject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sign Request from Acme", value = "Subject of signature request email. This is cleaned by sign request. If this field is not passed, a default subject will be used.")

  public String getEmailSubject() {
    return emailSubject;
  }


  public void setEmailSubject(String emailSubject) {
    
    
    
    this.emailSubject = emailSubject;
  }


  public SignTemplate emailMessage(String emailMessage) {
    
    
    
    
    this.emailMessage = emailMessage;
    return this;
  }

   /**
   * Message to include in signature request email. The field is cleaned through sanitization of specific characters. However, some html tags are allowed. Links included in the message are also converted to hyperlinks in the email. The message may contain the following html tags including &#x60;a&#x60;, &#x60;abbr&#x60;, &#x60;acronym&#x60;, &#x60;b&#x60;, &#x60;blockquote&#x60;, &#x60;code&#x60;, &#x60;em&#x60;, &#x60;i&#x60;, &#x60;ul&#x60;, &#x60;li&#x60;, &#x60;ol&#x60;, and &#x60;strong&#x60;. Be aware that when the text to html ratio is too high, the email may end up in spam filters. Custom styles on these tags are not allowed. If this field is not passed, a default message will be used.
   * @return emailMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hello! Please sign the document below", value = "Message to include in signature request email. The field is cleaned through sanitization of specific characters. However, some html tags are allowed. Links included in the message are also converted to hyperlinks in the email. The message may contain the following html tags including `a`, `abbr`, `acronym`, `b`, `blockquote`, `code`, `em`, `i`, `ul`, `li`, `ol`, and `strong`. Be aware that when the text to html ratio is too high, the email may end up in spam filters. Custom styles on these tags are not allowed. If this field is not passed, a default message will be used.")

  public String getEmailMessage() {
    return emailMessage;
  }


  public void setEmailMessage(String emailMessage) {
    
    
    
    this.emailMessage = emailMessage;
  }


  public SignTemplate daysValid(Integer daysValid) {
    if (daysValid != null && daysValid < 0) {
      throw new IllegalArgumentException("Invalid value for daysValid. Must be greater than or equal to 0.");
    }
    if (daysValid != null && daysValid > 730) {
      throw new IllegalArgumentException("Invalid value for daysValid. Must be less than or equal to 730.");
    }
    
    
    this.daysValid = daysValid;
    return this;
  }

   /**
   * Set the number of days after which the created signature request will automatically expire if not completed. By default, we do not apply any expiration date on signature requests, and the signature request does not expire.
   * minimum: 0
   * maximum: 730
   * @return daysValid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Set the number of days after which the created signature request will automatically expire if not completed. By default, we do not apply any expiration date on signature requests, and the signature request does not expire.")

  public Integer getDaysValid() {
    return daysValid;
  }


  public void setDaysValid(Integer daysValid) {
    if (daysValid != null && daysValid < 0) {
      throw new IllegalArgumentException("Invalid value for daysValid. Must be greater than or equal to 0.");
    }
    if (daysValid != null && daysValid > 730) {
      throw new IllegalArgumentException("Invalid value for daysValid. Must be less than or equal to 730.");
    }
    
    this.daysValid = daysValid;
  }


  public SignTemplate parentFolder(FolderMini parentFolder) {
    
    
    
    
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


  public SignTemplate sourceFiles(List<FileMini> sourceFiles) {
    
    
    
    
    this.sourceFiles = sourceFiles;
    return this;
  }

  public SignTemplate addSourceFilesItem(FileMini sourceFilesItem) {
    if (this.sourceFiles == null) {
      this.sourceFiles = new ArrayList<>();
    }
    this.sourceFiles.add(sourceFilesItem);
    return this;
  }

   /**
   * List of files to create a signing document from. Only the ID and type fields are required for each file.
   * @return sourceFiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of files to create a signing document from. Only the ID and type fields are required for each file.")

  public List<FileMini> getSourceFiles() {
    return sourceFiles;
  }


  public void setSourceFiles(List<FileMini> sourceFiles) {
    
    
    
    this.sourceFiles = sourceFiles;
  }


  public SignTemplate areFieldsLocked(Boolean areFieldsLocked) {
    
    
    
    
    this.areFieldsLocked = areFieldsLocked;
    return this;
  }

   /**
   * Indicates if the template input fields are editable or not.
   * @return areFieldsLocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates if the template input fields are editable or not.")

  public Boolean getAreFieldsLocked() {
    return areFieldsLocked;
  }


  public void setAreFieldsLocked(Boolean areFieldsLocked) {
    
    
    
    this.areFieldsLocked = areFieldsLocked;
  }


  public SignTemplate areOptionsLocked(Boolean areOptionsLocked) {
    
    
    
    
    this.areOptionsLocked = areOptionsLocked;
    return this;
  }

   /**
   * Indicates if the template document options are editable or not, for example renaming the document.
   * @return areOptionsLocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if the template document options are editable or not, for example renaming the document.")

  public Boolean getAreOptionsLocked() {
    return areOptionsLocked;
  }


  public void setAreOptionsLocked(Boolean areOptionsLocked) {
    
    
    
    this.areOptionsLocked = areOptionsLocked;
  }


  public SignTemplate areRecipientsLocked(Boolean areRecipientsLocked) {
    
    
    
    
    this.areRecipientsLocked = areRecipientsLocked;
    return this;
  }

   /**
   * Indicates if the template signers are editable or not.
   * @return areRecipientsLocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates if the template signers are editable or not.")

  public Boolean getAreRecipientsLocked() {
    return areRecipientsLocked;
  }


  public void setAreRecipientsLocked(Boolean areRecipientsLocked) {
    
    
    
    this.areRecipientsLocked = areRecipientsLocked;
  }


  public SignTemplate areEmailSettingsLocked(Boolean areEmailSettingsLocked) {
    
    
    
    
    this.areEmailSettingsLocked = areEmailSettingsLocked;
    return this;
  }

   /**
   * Indicates if the template email settings are editable or not.
   * @return areEmailSettingsLocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if the template email settings are editable or not.")

  public Boolean getAreEmailSettingsLocked() {
    return areEmailSettingsLocked;
  }


  public void setAreEmailSettingsLocked(Boolean areEmailSettingsLocked) {
    
    
    
    this.areEmailSettingsLocked = areEmailSettingsLocked;
  }


  public SignTemplate areFilesLocked(Boolean areFilesLocked) {
    
    
    
    
    this.areFilesLocked = areFilesLocked;
    return this;
  }

   /**
   * Indicates if the template files are editable or not. This includes deleting or renaming template files.
   * @return areFilesLocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if the template files are editable or not. This includes deleting or renaming template files.")

  public Boolean getAreFilesLocked() {
    return areFilesLocked;
  }


  public void setAreFilesLocked(Boolean areFilesLocked) {
    
    
    
    this.areFilesLocked = areFilesLocked;
  }


  public SignTemplate signers(List<TemplateSigner> signers) {
    
    
    
    
    this.signers = signers;
    return this;
  }

  public SignTemplate addSignersItem(TemplateSigner signersItem) {
    if (this.signers == null) {
      this.signers = new ArrayList<>();
    }
    this.signers.add(signersItem);
    return this;
  }

   /**
   * Array of signers for the template.
   * @return signers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of signers for the template.")

  public List<TemplateSigner> getSigners() {
    return signers;
  }


  public void setSigners(List<TemplateSigner> signers) {
    
    
    
    this.signers = signers;
  }


  public SignTemplate additionalInfo(SignTemplateAllOfAdditionalInfo additionalInfo) {
    
    
    
    
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignTemplateAllOfAdditionalInfo getAdditionalInfo() {
    return additionalInfo;
  }


  public void setAdditionalInfo(SignTemplateAllOfAdditionalInfo additionalInfo) {
    
    
    
    this.additionalInfo = additionalInfo;
  }


  public SignTemplate readySignLink(SignTemplateAllOfReadySignLink readySignLink) {
    
    
    
    
    this.readySignLink = readySignLink;
    return this;
  }

   /**
   * Get readySignLink
   * @return readySignLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignTemplateAllOfReadySignLink getReadySignLink() {
    return readySignLink;
  }


  public void setReadySignLink(SignTemplateAllOfReadySignLink readySignLink) {
    
    
    
    this.readySignLink = readySignLink;
  }


  public SignTemplate customBranding(SignTemplateAllOfCustomBranding customBranding) {
    
    
    
    
    this.customBranding = customBranding;
    return this;
  }

   /**
   * Get customBranding
   * @return customBranding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignTemplateAllOfCustomBranding getCustomBranding() {
    return customBranding;
  }


  public void setCustomBranding(SignTemplateAllOfCustomBranding customBranding) {
    
    
    
    this.customBranding = customBranding;
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
   * @return the SignTemplate instance itself
   */
  public SignTemplate putAdditionalProperty(String key, Object value) {
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
    SignTemplate signTemplate = (SignTemplate) o;
    return Objects.equals(this.type, signTemplate.type) &&
        Objects.equals(this.id, signTemplate.id) &&
        Objects.equals(this.name, signTemplate.name) &&
        Objects.equals(this.emailSubject, signTemplate.emailSubject) &&
        Objects.equals(this.emailMessage, signTemplate.emailMessage) &&
        Objects.equals(this.daysValid, signTemplate.daysValid) &&
        Objects.equals(this.parentFolder, signTemplate.parentFolder) &&
        Objects.equals(this.sourceFiles, signTemplate.sourceFiles) &&
        Objects.equals(this.areFieldsLocked, signTemplate.areFieldsLocked) &&
        Objects.equals(this.areOptionsLocked, signTemplate.areOptionsLocked) &&
        Objects.equals(this.areRecipientsLocked, signTemplate.areRecipientsLocked) &&
        Objects.equals(this.areEmailSettingsLocked, signTemplate.areEmailSettingsLocked) &&
        Objects.equals(this.areFilesLocked, signTemplate.areFilesLocked) &&
        Objects.equals(this.signers, signTemplate.signers) &&
        Objects.equals(this.additionalInfo, signTemplate.additionalInfo) &&
        Objects.equals(this.readySignLink, signTemplate.readySignLink) &&
        Objects.equals(this.customBranding, signTemplate.customBranding)&&
        Objects.equals(this.additionalProperties, signTemplate.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, name, emailSubject, emailMessage, daysValid, parentFolder, sourceFiles, areFieldsLocked, areOptionsLocked, areRecipientsLocked, areEmailSettingsLocked, areFilesLocked, signers, additionalInfo, readySignLink, customBranding, additionalProperties);
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
    sb.append("class SignTemplate {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    emailMessage: ").append(toIndentedString(emailMessage)).append("\n");
    sb.append("    daysValid: ").append(toIndentedString(daysValid)).append("\n");
    sb.append("    parentFolder: ").append(toIndentedString(parentFolder)).append("\n");
    sb.append("    sourceFiles: ").append(toIndentedString(sourceFiles)).append("\n");
    sb.append("    areFieldsLocked: ").append(toIndentedString(areFieldsLocked)).append("\n");
    sb.append("    areOptionsLocked: ").append(toIndentedString(areOptionsLocked)).append("\n");
    sb.append("    areRecipientsLocked: ").append(toIndentedString(areRecipientsLocked)).append("\n");
    sb.append("    areEmailSettingsLocked: ").append(toIndentedString(areEmailSettingsLocked)).append("\n");
    sb.append("    areFilesLocked: ").append(toIndentedString(areFilesLocked)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    readySignLink: ").append(toIndentedString(readySignLink)).append("\n");
    sb.append("    customBranding: ").append(toIndentedString(customBranding)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("email_subject");
    openapiFields.add("email_message");
    openapiFields.add("days_valid");
    openapiFields.add("parent_folder");
    openapiFields.add("source_files");
    openapiFields.add("are_fields_locked");
    openapiFields.add("are_options_locked");
    openapiFields.add("are_recipients_locked");
    openapiFields.add("are_email_settings_locked");
    openapiFields.add("are_files_locked");
    openapiFields.add("signers");
    openapiFields.add("additional_info");
    openapiFields.add("ready_sign_link");
    openapiFields.add("custom_branding");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SignTemplate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SignTemplate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignTemplate is not found in the empty JSON string", SignTemplate.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonNull() && (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("email_subject").isJsonNull() && (jsonObj.get("email_subject") != null && !jsonObj.get("email_subject").isJsonNull()) && !jsonObj.get("email_subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_subject").toString()));
      }
      if (!jsonObj.get("email_message").isJsonNull() && (jsonObj.get("email_message") != null && !jsonObj.get("email_message").isJsonNull()) && !jsonObj.get("email_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_message").toString()));
      }
      // validate the optional field `parent_folder`
      if (jsonObj.get("parent_folder") != null && !jsonObj.get("parent_folder").isJsonNull()) {
        FolderMini.validateJsonObject(jsonObj.getAsJsonObject("parent_folder"));
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
            FileMini.validateJsonObject(jsonArraysourceFiles.get(i).getAsJsonObject());
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
            TemplateSigner.validateJsonObject(jsonArraysigners.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `additional_info`
      if (jsonObj.get("additional_info") != null && !jsonObj.get("additional_info").isJsonNull()) {
        SignTemplateAllOfAdditionalInfo.validateJsonObject(jsonObj.getAsJsonObject("additional_info"));
      }
      // validate the optional field `ready_sign_link`
      if (jsonObj.get("ready_sign_link") != null && !jsonObj.get("ready_sign_link").isJsonNull()) {
        SignTemplateAllOfReadySignLink.validateJsonObject(jsonObj.getAsJsonObject("ready_sign_link"));
      }
      // validate the optional field `custom_branding`
      if (jsonObj.get("custom_branding") != null && !jsonObj.get("custom_branding").isJsonNull()) {
        SignTemplateAllOfCustomBranding.validateJsonObject(jsonObj.getAsJsonObject("custom_branding"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SignTemplate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignTemplate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignTemplate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignTemplate.class));

       return (TypeAdapter<T>) new TypeAdapter<SignTemplate>() {
           @Override
           public void write(JsonWriter out, SignTemplate value) throws IOException {
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
           public SignTemplate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SignTemplate instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SignTemplate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SignTemplate
  * @throws IOException if the JSON string is invalid with respect to SignTemplate
  */
  public static SignTemplate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignTemplate.class);
  }

 /**
  * Convert an instance of SignTemplate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

