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
 * Success response for creating a DigiLocker URL for document verification
 */
@Schema(description = "Success response for creating a DigiLocker URL for document verification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-12T04:15:15.893702Z[Etc/UTC]")
public class DigiLockerVerificationCreateUrlResponseSchema {
  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private Integer referenceId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_DOCUMENT_REQUESTED = "document_requested";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_REQUESTED)
  private List<String> documentRequested;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirect_url";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;

  public DigiLockerVerificationCreateUrlResponseSchema() {
  }

  public DigiLockerVerificationCreateUrlResponseSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It displays the unique ID you created to identify this API request.
   * @return verificationId
  **/
  @javax.annotation.Nullable
  @Schema(example = "ABC00123", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID you created to identify this API request.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public DigiLockerVerificationCreateUrlResponseSchema referenceId(Integer referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * It displays the unique ID created by Cashfree Payments for reference purposes.
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @Schema(example = "12345", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by Cashfree Payments for reference purposes.")
  public Integer getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(Integer referenceId) {
    this.referenceId = referenceId;
  }


  public DigiLockerVerificationCreateUrlResponseSchema url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * It displays the URL received to retrieve and verify aadhaar information from DigiLocker.
   * @return url
  **/
  @javax.annotation.Nullable
  @Schema(example = "DIGILOCKER_URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the URL received to retrieve and verify aadhaar information from DigiLocker.")
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public DigiLockerVerificationCreateUrlResponseSchema status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * It displays the status of the verification request.
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(example = "PENDING", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the verification request.")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public DigiLockerVerificationCreateUrlResponseSchema documentRequested(List<String> documentRequested) {
    
    this.documentRequested = documentRequested;
    return this;
  }

  public DigiLockerVerificationCreateUrlResponseSchema addDocumentRequestedItem(String documentRequestedItem) {
    if (this.documentRequested == null) {
      this.documentRequested = new ArrayList<>();
    }
    this.documentRequested.add(documentRequestedItem);
    return this;
  }

   /**
   * It displays the list of documents requested for verification.
   * @return documentRequested
  **/
  @javax.annotation.Nullable
  @Schema(example = "[\"AADHAAR\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the list of documents requested for verification.")
  public List<String> getDocumentRequested() {
    return documentRequested;
  }


  public void setDocumentRequested(List<String> documentRequested) {
    this.documentRequested = documentRequested;
  }


  public DigiLockerVerificationCreateUrlResponseSchema redirectUrl(String redirectUrl) {
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * It displays the URL entered in the request that takes the user to after completing the DigiLocker journey. 
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @Schema(example = "REDIRECT_URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the URL entered in the request that takes the user to after completing the DigiLocker journey. ")
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
    DigiLockerVerificationCreateUrlResponseSchema digiLockerVerificationCreateUrlResponseSchema = (DigiLockerVerificationCreateUrlResponseSchema) o;
    return Objects.equals(this.verificationId, digiLockerVerificationCreateUrlResponseSchema.verificationId) &&
        Objects.equals(this.referenceId, digiLockerVerificationCreateUrlResponseSchema.referenceId) &&
        Objects.equals(this.url, digiLockerVerificationCreateUrlResponseSchema.url) &&
        Objects.equals(this.status, digiLockerVerificationCreateUrlResponseSchema.status) &&
        Objects.equals(this.documentRequested, digiLockerVerificationCreateUrlResponseSchema.documentRequested) &&
        Objects.equals(this.redirectUrl, digiLockerVerificationCreateUrlResponseSchema.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationId, referenceId, url, status, documentRequested, redirectUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigiLockerVerificationCreateUrlResponseSchema {\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("reference_id");
    openapiFields.add("url");
    openapiFields.add("status");
    openapiFields.add("document_requested");
    openapiFields.add("redirect_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DigiLockerVerificationCreateUrlResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("document_requested") != null && !jsonObj.get("document_requested").isJsonNull() && !jsonObj.get("document_requested").isJsonArray()) {
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
  * @throws IOException if the JSON Element is invalid with respect to DigiLockerVerificationCreateUrlResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("document_requested") != null && !jsonObj.get("document_requested").isJsonNull() && !jsonObj.get("document_requested").isJsonArray()) {
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
       if (!DigiLockerVerificationCreateUrlResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DigiLockerVerificationCreateUrlResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DigiLockerVerificationCreateUrlResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DigiLockerVerificationCreateUrlResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<DigiLockerVerificationCreateUrlResponseSchema>() {
           @Override
           public void write(JsonWriter out, DigiLockerVerificationCreateUrlResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DigiLockerVerificationCreateUrlResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DigiLockerVerificationCreateUrlResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DigiLockerVerificationCreateUrlResponseSchema
  * @throws IOException if the JSON string is invalid with respect to DigiLockerVerificationCreateUrlResponseSchema
  */
  public static DigiLockerVerificationCreateUrlResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DigiLockerVerificationCreateUrlResponseSchema.class);
  }

 /**
  * Convert an instance of DigiLockerVerificationCreateUrlResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

