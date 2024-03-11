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
 * Find the request parameters to submit the OTP for aadhaar verification
 */
@Schema(description = "Find the request parameters to submit the OTP for aadhaar verification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T13:08:13.353528Z[Etc/UTC]")
public class OfflineAadhaarVerifyOtpRequestSchema {
  public static final String SERIALIZED_NAME_OTP = "otp";
  @SerializedName(SERIALIZED_NAME_OTP)
  private String otp = "267987";

  public static final String SERIALIZED_NAME_REF_ID = "ref_id";
  @SerializedName(SERIALIZED_NAME_REF_ID)
  private String refId = "21637861";

  public OfflineAadhaarVerifyOtpRequestSchema() {
  }

  public OfflineAadhaarVerifyOtpRequestSchema otp(String otp) {
    
    this.otp = otp;
    return this;
  }

   /**
   * It is the OTP received on the registered phone number for offline aadhaar verification.
   * @return otp
  **/
  @javax.annotation.Nonnull
  @Schema(example = "267987", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the OTP received on the registered phone number for offline aadhaar verification.")
  public String getOtp() {
    return otp;
  }


  public void setOtp(String otp) {
    this.otp = otp;
  }


  public OfflineAadhaarVerifyOtpRequestSchema refId(String refId) {
    
    this.refId = refId;
    return this;
  }

   /**
   * It is the unique ID created by Cashfree Payments that you receive in the response of Generate OTP to Verify Aadhaar API.
   * @return refId
  **/
  @javax.annotation.Nonnull
  @Schema(example = "21637861", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the unique ID created by Cashfree Payments that you receive in the response of Generate OTP to Verify Aadhaar API.")
  public String getRefId() {
    return refId;
  }


  public void setRefId(String refId) {
    this.refId = refId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineAadhaarVerifyOtpRequestSchema offlineAadhaarVerifyOtpRequestSchema = (OfflineAadhaarVerifyOtpRequestSchema) o;
    return Objects.equals(this.otp, offlineAadhaarVerifyOtpRequestSchema.otp) &&
        Objects.equals(this.refId, offlineAadhaarVerifyOtpRequestSchema.refId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otp, refId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineAadhaarVerifyOtpRequestSchema {\n");
    sb.append("    otp: ").append(toIndentedString(otp)).append("\n");
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
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
    openapiFields.add("otp");
    openapiFields.add("ref_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("otp");
    openapiRequiredFields.add("ref_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfflineAadhaarVerifyOtpRequestSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OfflineAadhaarVerifyOtpRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("otp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `otp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("otp").toString()));
      }
      if (!jsonObj.get("ref_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref_id").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfflineAadhaarVerifyOtpRequestSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OfflineAadhaarVerifyOtpRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("otp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `otp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("otp").toString()));
      }
      if (!jsonObj.get("ref_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref_id").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfflineAadhaarVerifyOtpRequestSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfflineAadhaarVerifyOtpRequestSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfflineAadhaarVerifyOtpRequestSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfflineAadhaarVerifyOtpRequestSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<OfflineAadhaarVerifyOtpRequestSchema>() {
           @Override
           public void write(JsonWriter out, OfflineAadhaarVerifyOtpRequestSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfflineAadhaarVerifyOtpRequestSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OfflineAadhaarVerifyOtpRequestSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OfflineAadhaarVerifyOtpRequestSchema
  * @throws IOException if the JSON string is invalid with respect to OfflineAadhaarVerifyOtpRequestSchema
  */
  public static OfflineAadhaarVerifyOtpRequestSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfflineAadhaarVerifyOtpRequestSchema.class);
  }

 /**
  * Convert an instance of OfflineAadhaarVerifyOtpRequestSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

