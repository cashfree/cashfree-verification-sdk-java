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


package com.cashfree.verification.model;

import java.util.Objects;
import com.cashfree.verification.model.DigiLockerVerificationGetStatusResponseSchemaUserDetails;
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

import com.cashfree.verification.JSON;

/**
 * Success response of Get DigiLocker Verification Status
 */
@Schema(description = "Success response of Get DigiLocker Verification Status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T10:11:49.428720Z[Etc/UTC]")
public class DigiLockerVerificationGetStatusResponseSchema {
  public static final String SERIALIZED_NAME_USER_DETAILS = "user_details";
  @SerializedName(SERIALIZED_NAME_USER_DETAILS)
  private DigiLockerVerificationGetStatusResponseSchemaUserDetails userDetails;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_DOCUMENT_REQUESTED = "document_requested";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_REQUESTED)
  private List<String> documentRequested;

  public static final String SERIALIZED_NAME_DOCUMENT_CONSENT = "document_consent";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_CONSENT)
  private List<String> documentConsent;

  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private Integer referenceId;

  public DigiLockerVerificationGetStatusResponseSchema() {
  }

  public DigiLockerVerificationGetStatusResponseSchema userDetails(DigiLockerVerificationGetStatusResponseSchemaUserDetails userDetails) {
    
    this.userDetails = userDetails;
    return this;
  }

   /**
   * Get userDetails
   * @return userDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public DigiLockerVerificationGetStatusResponseSchemaUserDetails getUserDetails() {
    return userDetails;
  }


  public void setUserDetails(DigiLockerVerificationGetStatusResponseSchemaUserDetails userDetails) {
    this.userDetails = userDetails;
  }


  public DigiLockerVerificationGetStatusResponseSchema status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * It displays the status of the API request.
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(example = "PENDING", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the API request.")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public DigiLockerVerificationGetStatusResponseSchema documentRequested(List<String> documentRequested) {
    
    this.documentRequested = documentRequested;
    return this;
  }

  public DigiLockerVerificationGetStatusResponseSchema addDocumentRequestedItem(String documentRequestedItem) {
    if (this.documentRequested == null) {
      this.documentRequested = new ArrayList<>();
    }
    this.documentRequested.add(documentRequestedItem);
    return this;
  }

   /**
   * It contains the information of the requested document(s) for verification.
   * @return documentRequested
  **/
  @javax.annotation.Nullable
  @Schema(example = "[\"AADHAAR\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It contains the information of the requested document(s) for verification.")
  public List<String> getDocumentRequested() {
    return documentRequested;
  }


  public void setDocumentRequested(List<String> documentRequested) {
    this.documentRequested = documentRequested;
  }


  public DigiLockerVerificationGetStatusResponseSchema documentConsent(List<String> documentConsent) {
    
    this.documentConsent = documentConsent;
    return this;
  }

  public DigiLockerVerificationGetStatusResponseSchema addDocumentConsentItem(String documentConsentItem) {
    if (this.documentConsent == null) {
      this.documentConsent = new ArrayList<>();
    }
    this.documentConsent.add(documentConsentItem);
    return this;
  }

   /**
   * It displays the consent of the individual(user) for document verification.
   * @return documentConsent
  **/
  @javax.annotation.Nullable
  @Schema(example = "[\"AADHAAR\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the consent of the individual(user) for document verification.")
  public List<String> getDocumentConsent() {
    return documentConsent;
  }


  public void setDocumentConsent(List<String> documentConsent) {
    this.documentConsent = documentConsent;
  }


  public DigiLockerVerificationGetStatusResponseSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It displays the unique ID you created to identify the verification request.
   * @return verificationId
  **/
  @javax.annotation.Nullable
  @Schema(example = "ABC00123", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID you created to identify the verification request.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public DigiLockerVerificationGetStatusResponseSchema referenceId(Integer referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * It displays the unique ID created by Cashfree Payments for reference purposes.
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @Schema(example = "1234", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by Cashfree Payments for reference purposes.")
  public Integer getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(Integer referenceId) {
    this.referenceId = referenceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigiLockerVerificationGetStatusResponseSchema digiLockerVerificationGetStatusResponseSchema = (DigiLockerVerificationGetStatusResponseSchema) o;
    return Objects.equals(this.userDetails, digiLockerVerificationGetStatusResponseSchema.userDetails) &&
        Objects.equals(this.status, digiLockerVerificationGetStatusResponseSchema.status) &&
        Objects.equals(this.documentRequested, digiLockerVerificationGetStatusResponseSchema.documentRequested) &&
        Objects.equals(this.documentConsent, digiLockerVerificationGetStatusResponseSchema.documentConsent) &&
        Objects.equals(this.verificationId, digiLockerVerificationGetStatusResponseSchema.verificationId) &&
        Objects.equals(this.referenceId, digiLockerVerificationGetStatusResponseSchema.referenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userDetails, status, documentRequested, documentConsent, verificationId, referenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigiLockerVerificationGetStatusResponseSchema {\n");
    sb.append("    userDetails: ").append(toIndentedString(userDetails)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    documentRequested: ").append(toIndentedString(documentRequested)).append("\n");
    sb.append("    documentConsent: ").append(toIndentedString(documentConsent)).append("\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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
    openapiFields.add("user_details");
    openapiFields.add("status");
    openapiFields.add("document_requested");
    openapiFields.add("document_consent");
    openapiFields.add("verification_id");
    openapiFields.add("reference_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DigiLockerVerificationGetStatusResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `user_details`
      if (jsonObj.get("user_details") != null && !jsonObj.get("user_details").isJsonNull()) {
        DigiLockerVerificationGetStatusResponseSchemaUserDetails.validateJsonElement(jsonObj.get("user_details"));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("document_requested") != null && !jsonObj.get("document_requested").isJsonNull() && !jsonObj.get("document_requested").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_requested` to be an array in the JSON string but got `%s`", jsonObj.get("document_requested").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("document_consent") != null && !jsonObj.get("document_consent").isJsonNull() && !jsonObj.get("document_consent").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_consent` to be an array in the JSON string but got `%s`", jsonObj.get("document_consent").toString()));
      }
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DigiLockerVerificationGetStatusResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `user_details`
      if (jsonObj.get("user_details") != null && !jsonObj.get("user_details").isJsonNull()) {
        DigiLockerVerificationGetStatusResponseSchemaUserDetails.validateJsonElement(jsonObj.get("user_details"));
        return true;
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("document_requested") != null && !jsonObj.get("document_requested").isJsonNull() && !jsonObj.get("document_requested").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_requested` to be an array in the JSON string but got `%s`", jsonObj.get("document_requested").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("document_consent") != null && !jsonObj.get("document_consent").isJsonNull() && !jsonObj.get("document_consent").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_consent` to be an array in the JSON string but got `%s`", jsonObj.get("document_consent").toString()));
      }
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DigiLockerVerificationGetStatusResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DigiLockerVerificationGetStatusResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DigiLockerVerificationGetStatusResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DigiLockerVerificationGetStatusResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<DigiLockerVerificationGetStatusResponseSchema>() {
           @Override
           public void write(JsonWriter out, DigiLockerVerificationGetStatusResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DigiLockerVerificationGetStatusResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DigiLockerVerificationGetStatusResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DigiLockerVerificationGetStatusResponseSchema
  * @throws IOException if the JSON string is invalid with respect to DigiLockerVerificationGetStatusResponseSchema
  */
  public static DigiLockerVerificationGetStatusResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DigiLockerVerificationGetStatusResponseSchema.class);
  }

 /**
  * Convert an instance of DigiLockerVerificationGetStatusResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

