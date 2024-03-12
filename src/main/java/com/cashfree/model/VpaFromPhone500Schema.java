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
import java.util.Arrays;

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
 * Internal error response
 */
@Schema(description = "Internal error response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-12T04:15:15.893702Z[Etc/UTC]")
public class VpaFromPhone500Schema {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private Integer referenceId;

  public static final String SERIALIZED_NAME_ACCOUNT_STATUS = "account_status";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_STATUS)
  private String accountStatus;

  public static final String SERIALIZED_NAME_MOBILE_NUMBER = "mobile_number";
  @SerializedName(SERIALIZED_NAME_MOBILE_NUMBER)
  private String mobileNumber;

  public VpaFromPhone500Schema() {
  }

  public VpaFromPhone500Schema status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * It displays the status of the API request.
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(example = "FAILURE", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the API request.")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public VpaFromPhone500Schema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It displays the unique ID you created to identify the API request.
   * @return verificationId
  **/
  @javax.annotation.Nullable
  @Schema(example = "test_verification_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID you created to identify the API request.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public VpaFromPhone500Schema message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * It displays details about the success or failure of the API request
   * @return message
  **/
  @javax.annotation.Nullable
  @Schema(example = "Unable to validate, please retry later", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays details about the success or failure of the API request")
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public VpaFromPhone500Schema referenceId(Integer referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * It displays the unique ID created by Cashfree Payments for reference purposes.
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @Schema(example = "1338", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by Cashfree Payments for reference purposes.")
  public Integer getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(Integer referenceId) {
    this.referenceId = referenceId;
  }


  public VpaFromPhone500Schema accountStatus(String accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * It displays the status of the account.
   * @return accountStatus
  **/
  @javax.annotation.Nullable
  @Schema(example = "UNABLE_TO_VALIDATE", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the account.")
  public String getAccountStatus() {
    return accountStatus;
  }


  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }


  public VpaFromPhone500Schema mobileNumber(String mobileNumber) {
    
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * It displays the mobile number of the individual.
   * @return mobileNumber
  **/
  @javax.annotation.Nullable
  @Schema(example = "7777777777", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the mobile number of the individual.")
  public String getMobileNumber() {
    return mobileNumber;
  }


  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VpaFromPhone500Schema vpaFromPhone500Schema = (VpaFromPhone500Schema) o;
    return Objects.equals(this.status, vpaFromPhone500Schema.status) &&
        Objects.equals(this.verificationId, vpaFromPhone500Schema.verificationId) &&
        Objects.equals(this.message, vpaFromPhone500Schema.message) &&
        Objects.equals(this.referenceId, vpaFromPhone500Schema.referenceId) &&
        Objects.equals(this.accountStatus, vpaFromPhone500Schema.accountStatus) &&
        Objects.equals(this.mobileNumber, vpaFromPhone500Schema.mobileNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, verificationId, message, referenceId, accountStatus, mobileNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VpaFromPhone500Schema {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("verification_id");
    openapiFields.add("message");
    openapiFields.add("reference_id");
    openapiFields.add("account_status");
    openapiFields.add("mobile_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VpaFromPhone500Schema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("account_status") != null && !jsonObj.get("account_status").isJsonNull()) && !jsonObj.get("account_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_status").toString()));
      }
      if ((jsonObj.get("mobile_number") != null && !jsonObj.get("mobile_number").isJsonNull()) && !jsonObj.get("mobile_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile_number").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VpaFromPhone500Schema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("account_status") != null && !jsonObj.get("account_status").isJsonNull()) && !jsonObj.get("account_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_status").toString()));
      }
      if ((jsonObj.get("mobile_number") != null && !jsonObj.get("mobile_number").isJsonNull()) && !jsonObj.get("mobile_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile_number").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VpaFromPhone500Schema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VpaFromPhone500Schema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VpaFromPhone500Schema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VpaFromPhone500Schema.class));

       return (TypeAdapter<T>) new TypeAdapter<VpaFromPhone500Schema>() {
           @Override
           public void write(JsonWriter out, VpaFromPhone500Schema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VpaFromPhone500Schema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VpaFromPhone500Schema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VpaFromPhone500Schema
  * @throws IOException if the JSON string is invalid with respect to VpaFromPhone500Schema
  */
  public static VpaFromPhone500Schema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VpaFromPhone500Schema.class);
  }

 /**
  * Convert an instance of VpaFromPhone500Schema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

