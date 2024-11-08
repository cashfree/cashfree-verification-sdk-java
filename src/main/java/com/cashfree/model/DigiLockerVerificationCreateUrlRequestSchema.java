/*
 * Cashfree Verification API's.
 * Cashfree's Verification APIs provide different types of verification to our merchants.
 *
 * The version of the OpenAPI document: 2023-12-18
 * Contact: developers@cashfree.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cashfree.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cashfree.JSON;

/**
 * Find the request parameters to create a DigiLocker URL for document verification
 */
@Schema(description = "Find the request parameters to create a DigiLocker URL for document verification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-08T05:03:36.102379Z[Etc/UTC]")
public class DigiLockerVerificationCreateUrlRequestSchema {
  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId = "ABC00123";

  /**
   * Gets or Sets documentRequested
   */
  @JsonAdapter(DocumentRequestedEnum.Adapter.class)
  public enum DocumentRequestedEnum {
    AADHAAR("AADHAAR"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    DocumentRequestedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocumentRequestedEnum fromValue(String value) {
      for (DocumentRequestedEnum b : DocumentRequestedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<DocumentRequestedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocumentRequestedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocumentRequestedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DocumentRequestedEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DOCUMENT_REQUESTED = "document_requested";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_REQUESTED)
  private List<DocumentRequestedEnum> documentRequested = new ArrayList<>();

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirect_url";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl = "https://www.cashfree.com";

  public DigiLockerVerificationCreateUrlRequestSchema() {
  }

  public DigiLockerVerificationCreateUrlRequestSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It is the unique ID you create to identify the API request. The maximum character limit is 50. Alphanumeric, period (.), hyphen (-). and underscore ( _ ) are allowed.
   * @return verificationId
  **/
  @javax.annotation.Nonnull
  @Schema(example = "ABC00123", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the unique ID you create to identify the API request. The maximum character limit is 50. Alphanumeric, period (.), hyphen (-). and underscore ( _ ) are allowed.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public DigiLockerVerificationCreateUrlRequestSchema documentRequested(List<DocumentRequestedEnum> documentRequested) {
    
    this.documentRequested = documentRequested;
    return this;
  }

  public DigiLockerVerificationCreateUrlRequestSchema addDocumentRequestedItem(DocumentRequestedEnum documentRequestedItem) {
    if (this.documentRequested == null) {
      this.documentRequested = new ArrayList<>();
    }
    this.documentRequested.add(documentRequestedItem);
    return this;
  }

   /**
   * It is the list of customer documents required for verification.
   * @return documentRequested
  **/
  @javax.annotation.Nonnull
  @Schema(example = "[\"AADHAAR\"]", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the list of customer documents required for verification.")
  public List<DocumentRequestedEnum> getDocumentRequested() {
    return documentRequested;
  }


  public void setDocumentRequested(List<DocumentRequestedEnum> documentRequested) {
    this.documentRequested = documentRequested;
  }


  public DigiLockerVerificationCreateUrlRequestSchema redirectUrl(String redirectUrl) {
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * It is the URL that you need to provide that takes the user to after completing the DigiLocker journey. It will contain the verification_id that can be used to get the status of the verification.
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @Schema(example = "https://www.cashfree.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the URL that you need to provide that takes the user to after completing the DigiLocker journey. It will contain the verification_id that can be used to get the status of the verification.")
  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigiLockerVerificationCreateUrlRequestSchema digiLockerVerificationCreateUrlRequestSchema = (DigiLockerVerificationCreateUrlRequestSchema) o;
    return Objects.equals(this.verificationId, digiLockerVerificationCreateUrlRequestSchema.verificationId) &&
        Objects.equals(this.documentRequested, digiLockerVerificationCreateUrlRequestSchema.documentRequested) &&
        Objects.equals(this.redirectUrl, digiLockerVerificationCreateUrlRequestSchema.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationId, documentRequested, redirectUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigiLockerVerificationCreateUrlRequestSchema {\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    documentRequested: ").append(toIndentedString(documentRequested)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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
    openapiFields.add("verification_id");
    openapiFields.add("document_requested");
    openapiFields.add("redirect_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("verification_id");
    openapiRequiredFields.add("document_requested");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DigiLockerVerificationCreateUrlRequestSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DigiLockerVerificationCreateUrlRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("document_requested") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("document_requested").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_requested` to be an array in the JSON string but got `%s`", jsonObj.get("document_requested").toString()));
      }
      if ((jsonObj.get("redirect_url") != null && !jsonObj.get("redirect_url").isJsonNull()) && !jsonObj.get("redirect_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirect_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirect_url").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DigiLockerVerificationCreateUrlRequestSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DigiLockerVerificationCreateUrlRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("document_requested") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("document_requested").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_requested` to be an array in the JSON string but got `%s`", jsonObj.get("document_requested").toString()));
      }
      if ((jsonObj.get("redirect_url") != null && !jsonObj.get("redirect_url").isJsonNull()) && !jsonObj.get("redirect_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirect_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirect_url").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DigiLockerVerificationCreateUrlRequestSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DigiLockerVerificationCreateUrlRequestSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DigiLockerVerificationCreateUrlRequestSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DigiLockerVerificationCreateUrlRequestSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<DigiLockerVerificationCreateUrlRequestSchema>() {
           @Override
           public void write(JsonWriter out, DigiLockerVerificationCreateUrlRequestSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DigiLockerVerificationCreateUrlRequestSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DigiLockerVerificationCreateUrlRequestSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DigiLockerVerificationCreateUrlRequestSchema
  * @throws IOException if the JSON string is invalid with respect to DigiLockerVerificationCreateUrlRequestSchema
  */
  public static DigiLockerVerificationCreateUrlRequestSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DigiLockerVerificationCreateUrlRequestSchema.class);
  }

 /**
  * Convert an instance of DigiLockerVerificationCreateUrlRequestSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

