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
import com.konfigthis.client.model.SignRequestPrefillTag;
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
 * A request to create a sign request object
 */
@ApiModel(description = "A request to create a sign request object")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SignRequestCreateRequest {
  public static final String SERIALIZED_NAME_IS_DOCUMENT_PREPARATION_NEEDED = "is_document_preparation_needed";
  @SerializedName(SERIALIZED_NAME_IS_DOCUMENT_PREPARATION_NEEDED)
  private Boolean isDocumentPreparationNeeded;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirect_url";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;

  public static final String SERIALIZED_NAME_DECLINED_REDIRECT_URL = "declined_redirect_url";
  @SerializedName(SERIALIZED_NAME_DECLINED_REDIRECT_URL)
  private String declinedRedirectUrl;

  public static final String SERIALIZED_NAME_ARE_TEXT_SIGNATURES_ENABLED = "are_text_signatures_enabled";
  @SerializedName(SERIALIZED_NAME_ARE_TEXT_SIGNATURES_ENABLED)
  private Boolean areTextSignaturesEnabled = true;

  public static final String SERIALIZED_NAME_EMAIL_SUBJECT = "email_subject";
  @SerializedName(SERIALIZED_NAME_EMAIL_SUBJECT)
  private String emailSubject;

  public static final String SERIALIZED_NAME_EMAIL_MESSAGE = "email_message";
  @SerializedName(SERIALIZED_NAME_EMAIL_MESSAGE)
  private String emailMessage;

  public static final String SERIALIZED_NAME_ARE_REMINDERS_ENABLED = "are_reminders_enabled";
  @SerializedName(SERIALIZED_NAME_ARE_REMINDERS_ENABLED)
  private Boolean areRemindersEnabled;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PREFILL_TAGS = "prefill_tags";
  @SerializedName(SERIALIZED_NAME_PREFILL_TAGS)
  private List<SignRequestPrefillTag> prefillTags = null;

  public static final String SERIALIZED_NAME_DAYS_VALID = "days_valid";
  @SerializedName(SERIALIZED_NAME_DAYS_VALID)
  private Integer daysValid;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_IS_PHONE_VERIFICATION_REQUIRED_TO_VIEW = "is_phone_verification_required_to_view";
  @SerializedName(SERIALIZED_NAME_IS_PHONE_VERIFICATION_REQUIRED_TO_VIEW)
  private Boolean isPhoneVerificationRequiredToView;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

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
  private List<SignRequestCreateSigner> signers = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARENT_FOLDER = "parent_folder";
  @SerializedName(SERIALIZED_NAME_PARENT_FOLDER)
  private FolderMini parentFolder;

  public SignRequestCreateRequest() {
  }

  public SignRequestCreateRequest isDocumentPreparationNeeded(Boolean isDocumentPreparationNeeded) {
    
    
    
    
    this.isDocumentPreparationNeeded = isDocumentPreparationNeeded;
    return this;
  }

   /**
   * Indicates if the sender should receive a &#x60;prepare_url&#x60; in the response to complete document preparation via UI.
   * @return isDocumentPreparationNeeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if the sender should receive a `prepare_url` in the response to complete document preparation via UI.")

  public Boolean getIsDocumentPreparationNeeded() {
    return isDocumentPreparationNeeded;
  }


  public void setIsDocumentPreparationNeeded(Boolean isDocumentPreparationNeeded) {
    
    
    
    this.isDocumentPreparationNeeded = isDocumentPreparationNeeded;
  }


  public SignRequestCreateRequest redirectUrl(String redirectUrl) {
    
    
    
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * When specified, signature request will be redirected to this url when a document is signed.
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.example.com", value = "When specified, signature request will be redirected to this url when a document is signed.")

  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    
    
    
    this.redirectUrl = redirectUrl;
  }


  public SignRequestCreateRequest declinedRedirectUrl(String declinedRedirectUrl) {
    
    
    
    
    this.declinedRedirectUrl = declinedRedirectUrl;
    return this;
  }

   /**
   * The uri that a signer will be redirected to after declining to sign a document.
   * @return declinedRedirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://declined-redirect.com", value = "The uri that a signer will be redirected to after declining to sign a document.")

  public String getDeclinedRedirectUrl() {
    return declinedRedirectUrl;
  }


  public void setDeclinedRedirectUrl(String declinedRedirectUrl) {
    
    
    
    this.declinedRedirectUrl = declinedRedirectUrl;
  }


  public SignRequestCreateRequest areTextSignaturesEnabled(Boolean areTextSignaturesEnabled) {
    
    
    
    
    this.areTextSignaturesEnabled = areTextSignaturesEnabled;
    return this;
  }

   /**
   * Disables the usage of signatures generated by typing (text).
   * @return areTextSignaturesEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Disables the usage of signatures generated by typing (text).")

  public Boolean getAreTextSignaturesEnabled() {
    return areTextSignaturesEnabled;
  }


  public void setAreTextSignaturesEnabled(Boolean areTextSignaturesEnabled) {
    
    
    
    this.areTextSignaturesEnabled = areTextSignaturesEnabled;
  }


  public SignRequestCreateRequest emailSubject(String emailSubject) {
    
    
    
    
    this.emailSubject = emailSubject;
    return this;
  }

   /**
   * Subject of sign request email. This is cleaned by sign request. If this field is not passed, a default subject will be used.
   * @return emailSubject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sign Request from Acme", value = "Subject of sign request email. This is cleaned by sign request. If this field is not passed, a default subject will be used.")

  public String getEmailSubject() {
    return emailSubject;
  }


  public void setEmailSubject(String emailSubject) {
    
    
    
    this.emailSubject = emailSubject;
  }


  public SignRequestCreateRequest emailMessage(String emailMessage) {
    
    
    
    
    this.emailMessage = emailMessage;
    return this;
  }

   /**
   * Message to include in sign request email. The field is cleaned through sanitization of specific characters. However, some html tags are allowed. Links included in the message are also converted to hyperlinks in the email. The message may contain the following html tags including &#x60;a&#x60;, &#x60;abbr&#x60;, &#x60;acronym&#x60;, &#x60;b&#x60;, &#x60;blockquote&#x60;, &#x60;code&#x60;, &#x60;em&#x60;, &#x60;i&#x60;, &#x60;ul&#x60;, &#x60;li&#x60;, &#x60;ol&#x60;, and &#x60;strong&#x60;. Be aware that when the text to html ratio is too high, the email may end up in spam filters. Custom styles on these tags are not allowed. If this field is not passed, a default message will be used.
   * @return emailMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hello! Please sign the document below", value = "Message to include in sign request email. The field is cleaned through sanitization of specific characters. However, some html tags are allowed. Links included in the message are also converted to hyperlinks in the email. The message may contain the following html tags including `a`, `abbr`, `acronym`, `b`, `blockquote`, `code`, `em`, `i`, `ul`, `li`, `ol`, and `strong`. Be aware that when the text to html ratio is too high, the email may end up in spam filters. Custom styles on these tags are not allowed. If this field is not passed, a default message will be used.")

  public String getEmailMessage() {
    return emailMessage;
  }


  public void setEmailMessage(String emailMessage) {
    
    
    
    this.emailMessage = emailMessage;
  }


  public SignRequestCreateRequest areRemindersEnabled(Boolean areRemindersEnabled) {
    
    
    
    
    this.areRemindersEnabled = areRemindersEnabled;
    return this;
  }

   /**
   * Reminds signers to sign a document on day 3, 8, 13 and 18. Reminders are only sent to outstanding signers.
   * @return areRemindersEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Reminds signers to sign a document on day 3, 8, 13 and 18. Reminders are only sent to outstanding signers.")

  public Boolean getAreRemindersEnabled() {
    return areRemindersEnabled;
  }


  public void setAreRemindersEnabled(Boolean areRemindersEnabled) {
    
    
    
    this.areRemindersEnabled = areRemindersEnabled;
  }


  public SignRequestCreateRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name of the sign request.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "name", value = "Name of the sign request.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public SignRequestCreateRequest prefillTags(List<SignRequestPrefillTag> prefillTags) {
    
    
    
    
    this.prefillTags = prefillTags;
    return this;
  }

  public SignRequestCreateRequest addPrefillTagsItem(SignRequestPrefillTag prefillTagsItem) {
    if (this.prefillTags == null) {
      this.prefillTags = new ArrayList<>();
    }
    this.prefillTags.add(prefillTagsItem);
    return this;
  }

   /**
   * When a document contains sign related tags in the content, you can prefill them using this &#x60;prefill_tags&#x60; by referencing the &#39;id&#39; of the tag as the &#x60;external_id&#x60; field of the prefill tag.
   * @return prefillTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When a document contains sign related tags in the content, you can prefill them using this `prefill_tags` by referencing the 'id' of the tag as the `external_id` field of the prefill tag.")

  public List<SignRequestPrefillTag> getPrefillTags() {
    return prefillTags;
  }


  public void setPrefillTags(List<SignRequestPrefillTag> prefillTags) {
    
    
    
    this.prefillTags = prefillTags;
  }


  public SignRequestCreateRequest daysValid(Integer daysValid) {
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


  public SignRequestCreateRequest externalId(String externalId) {
    
    
    
    
    this.externalId = externalId;
    return this;
  }

   /**
   * This can be used to reference an ID in an external system that the sign request is related to.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "This can be used to reference an ID in an external system that the sign request is related to.")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    
    
    
    this.externalId = externalId;
  }


  public SignRequestCreateRequest isPhoneVerificationRequiredToView(Boolean isPhoneVerificationRequiredToView) {
    
    
    
    
    this.isPhoneVerificationRequiredToView = isPhoneVerificationRequiredToView;
    return this;
  }

   /**
   * Forces signers to verify a text message prior to viewing the document. You must specify the phone number of signers to have this setting apply to them.
   * @return isPhoneVerificationRequiredToView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Forces signers to verify a text message prior to viewing the document. You must specify the phone number of signers to have this setting apply to them.")

  public Boolean getIsPhoneVerificationRequiredToView() {
    return isPhoneVerificationRequiredToView;
  }


  public void setIsPhoneVerificationRequiredToView(Boolean isPhoneVerificationRequiredToView) {
    
    
    
    this.isPhoneVerificationRequiredToView = isPhoneVerificationRequiredToView;
  }


  public SignRequestCreateRequest templateId(String templateId) {
    
    
    
    
    this.templateId = templateId;
    return this;
  }

   /**
   * When a signature request is created from a template this field will indicate the id of that template.
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123075213-af2c8822-3ef2-4952-8557-52d69c2fe9cb", value = "When a signature request is created from a template this field will indicate the id of that template.")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    
    
    
    this.templateId = templateId;
  }


  public SignRequestCreateRequest sourceFiles(List<FileBase> sourceFiles) {
    
    
    
    
    this.sourceFiles = sourceFiles;
    return this;
  }

  public SignRequestCreateRequest addSourceFilesItem(FileBase sourceFilesItem) {
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


  public SignRequestCreateRequest signatureColor(SignatureColorEnum signatureColor) {
    
    
    
    
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


  public SignRequestCreateRequest signers(List<SignRequestCreateSigner> signers) {
    
    
    
    
    this.signers = signers;
    return this;
  }

  public SignRequestCreateRequest addSignersItem(SignRequestCreateSigner signersItem) {
    this.signers.add(signersItem);
    return this;
  }

   /**
   * Array of signers for the sign request. 35 is the max number of signers permitted.
   * @return signers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Array of signers for the sign request. 35 is the max number of signers permitted.")

  public List<SignRequestCreateSigner> getSigners() {
    return signers;
  }


  public void setSigners(List<SignRequestCreateSigner> signers) {
    
    
    
    this.signers = signers;
  }


  public SignRequestCreateRequest parentFolder(FolderMini parentFolder) {
    
    
    
    
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
   * @return the SignRequestCreateRequest instance itself
   */
  public SignRequestCreateRequest putAdditionalProperty(String key, Object value) {
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
    SignRequestCreateRequest signRequestCreateRequest = (SignRequestCreateRequest) o;
    return Objects.equals(this.isDocumentPreparationNeeded, signRequestCreateRequest.isDocumentPreparationNeeded) &&
        Objects.equals(this.redirectUrl, signRequestCreateRequest.redirectUrl) &&
        Objects.equals(this.declinedRedirectUrl, signRequestCreateRequest.declinedRedirectUrl) &&
        Objects.equals(this.areTextSignaturesEnabled, signRequestCreateRequest.areTextSignaturesEnabled) &&
        Objects.equals(this.emailSubject, signRequestCreateRequest.emailSubject) &&
        Objects.equals(this.emailMessage, signRequestCreateRequest.emailMessage) &&
        Objects.equals(this.areRemindersEnabled, signRequestCreateRequest.areRemindersEnabled) &&
        Objects.equals(this.name, signRequestCreateRequest.name) &&
        Objects.equals(this.prefillTags, signRequestCreateRequest.prefillTags) &&
        Objects.equals(this.daysValid, signRequestCreateRequest.daysValid) &&
        Objects.equals(this.externalId, signRequestCreateRequest.externalId) &&
        Objects.equals(this.isPhoneVerificationRequiredToView, signRequestCreateRequest.isPhoneVerificationRequiredToView) &&
        Objects.equals(this.templateId, signRequestCreateRequest.templateId) &&
        Objects.equals(this.sourceFiles, signRequestCreateRequest.sourceFiles) &&
        Objects.equals(this.signatureColor, signRequestCreateRequest.signatureColor) &&
        Objects.equals(this.signers, signRequestCreateRequest.signers) &&
        Objects.equals(this.parentFolder, signRequestCreateRequest.parentFolder)&&
        Objects.equals(this.additionalProperties, signRequestCreateRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDocumentPreparationNeeded, redirectUrl, declinedRedirectUrl, areTextSignaturesEnabled, emailSubject, emailMessage, areRemindersEnabled, name, prefillTags, daysValid, externalId, isPhoneVerificationRequiredToView, templateId, sourceFiles, signatureColor, signers, parentFolder, additionalProperties);
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
    sb.append("class SignRequestCreateRequest {\n");
    sb.append("    isDocumentPreparationNeeded: ").append(toIndentedString(isDocumentPreparationNeeded)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    declinedRedirectUrl: ").append(toIndentedString(declinedRedirectUrl)).append("\n");
    sb.append("    areTextSignaturesEnabled: ").append(toIndentedString(areTextSignaturesEnabled)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    emailMessage: ").append(toIndentedString(emailMessage)).append("\n");
    sb.append("    areRemindersEnabled: ").append(toIndentedString(areRemindersEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefillTags: ").append(toIndentedString(prefillTags)).append("\n");
    sb.append("    daysValid: ").append(toIndentedString(daysValid)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    isPhoneVerificationRequiredToView: ").append(toIndentedString(isPhoneVerificationRequiredToView)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("is_document_preparation_needed");
    openapiFields.add("redirect_url");
    openapiFields.add("declined_redirect_url");
    openapiFields.add("are_text_signatures_enabled");
    openapiFields.add("email_subject");
    openapiFields.add("email_message");
    openapiFields.add("are_reminders_enabled");
    openapiFields.add("name");
    openapiFields.add("prefill_tags");
    openapiFields.add("days_valid");
    openapiFields.add("external_id");
    openapiFields.add("is_phone_verification_required_to_view");
    openapiFields.add("template_id");
    openapiFields.add("source_files");
    openapiFields.add("signature_color");
    openapiFields.add("signers");
    openapiFields.add("parent_folder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("signers");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SignRequestCreateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SignRequestCreateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignRequestCreateRequest is not found in the empty JSON string", SignRequestCreateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SignRequestCreateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("redirect_url").isJsonNull() && (jsonObj.get("redirect_url") != null && !jsonObj.get("redirect_url").isJsonNull()) && !jsonObj.get("redirect_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirect_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirect_url").toString()));
      }
      if (!jsonObj.get("declined_redirect_url").isJsonNull() && (jsonObj.get("declined_redirect_url") != null && !jsonObj.get("declined_redirect_url").isJsonNull()) && !jsonObj.get("declined_redirect_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `declined_redirect_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("declined_redirect_url").toString()));
      }
      if (!jsonObj.get("email_subject").isJsonNull() && (jsonObj.get("email_subject") != null && !jsonObj.get("email_subject").isJsonNull()) && !jsonObj.get("email_subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_subject").toString()));
      }
      if (!jsonObj.get("email_message").isJsonNull() && (jsonObj.get("email_message") != null && !jsonObj.get("email_message").isJsonNull()) && !jsonObj.get("email_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_message").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("prefill_tags") != null && !jsonObj.get("prefill_tags").isJsonNull()) {
        JsonArray jsonArrayprefillTags = jsonObj.getAsJsonArray("prefill_tags");
        if (jsonArrayprefillTags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("prefill_tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `prefill_tags` to be an array in the JSON string but got `%s`", jsonObj.get("prefill_tags").toString()));
          }

          // validate the optional field `prefill_tags` (array)
          for (int i = 0; i < jsonArrayprefillTags.size(); i++) {
            SignRequestPrefillTag.validateJsonObject(jsonArrayprefillTags.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("external_id").isJsonNull() && (jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if (!jsonObj.get("template_id").isJsonNull() && (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonNull()) && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
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
      // ensure the json data is an array
      if (!jsonObj.get("signers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `signers` to be an array in the JSON string but got `%s`", jsonObj.get("signers").toString()));
      }

      JsonArray jsonArraysigners = jsonObj.getAsJsonArray("signers");
      // validate the required field `signers` (array)
      for (int i = 0; i < jsonArraysigners.size(); i++) {
        SignRequestCreateSigner.validateJsonObject(jsonArraysigners.get(i).getAsJsonObject());
      };
      // validate the optional field `parent_folder`
      if (jsonObj.get("parent_folder") != null && !jsonObj.get("parent_folder").isJsonNull()) {
        FolderMini.validateJsonObject(jsonObj.getAsJsonObject("parent_folder"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SignRequestCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignRequestCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignRequestCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignRequestCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SignRequestCreateRequest>() {
           @Override
           public void write(JsonWriter out, SignRequestCreateRequest value) throws IOException {
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
           public SignRequestCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SignRequestCreateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SignRequestCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SignRequestCreateRequest
  * @throws IOException if the JSON string is invalid with respect to SignRequestCreateRequest
  */
  public static SignRequestCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignRequestCreateRequest.class);
  }

 /**
  * Convert an instance of SignRequestCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

