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

import com.cashfree.verification.JSON;

/**
 * Find the request parameters to generate an OTP for aadhaar verification
 */
@Schema(description = "Find the request parameters to generate an OTP for aadhaar verification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T10:11:49.428720Z[Etc/UTC]")
public class OfflineAadhaarSendOtpRequestSchema {
  public static final String SERIALIZED_NAME_AADHAAR_NUMBER = "aadhaar_number";
  @SerializedName(SERIALIZED_NAME_AADHAAR_NUMBER)
  private String aadhaarNumber = "655675523712";

  public OfflineAadhaarSendOtpRequestSchema() {
  }

  public OfflineAadhaarSendOtpRequestSchema aadhaarNumber(String aadhaarNumber) {
    
    this.aadhaarNumber = aadhaarNumber;
    return this;
  }

   /**
   * It is the unique 12-digit identification number issued by the Unique Identification Authority of India (UIDAI).
   * @return aadhaarNumber
  **/
  @javax.annotation.Nonnull
  @Schema(example = "655675523712", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the unique 12-digit identification number issued by the Unique Identification Authority of India (UIDAI).")
  public String getAadhaarNumber() {
    return aadhaarNumber;
  }


  public void setAadhaarNumber(String aadhaarNumber) {
    this.aadhaarNumber = aadhaarNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineAadhaarSendOtpRequestSchema offlineAadhaarSendOtpRequestSchema = (OfflineAadhaarSendOtpRequestSchema) o;
    return Objects.equals(this.aadhaarNumber, offlineAadhaarSendOtpRequestSchema.aadhaarNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aadhaarNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineAadhaarSendOtpRequestSchema {\n");
    sb.append("    aadhaarNumber: ").append(toIndentedString(aadhaarNumber)).append("\n");
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
    openapiFields.add("aadhaar_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("aadhaar_number");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfflineAadhaarSendOtpRequestSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OfflineAadhaarSendOtpRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("aadhaar_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aadhaar_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aadhaar_number").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfflineAadhaarSendOtpRequestSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OfflineAadhaarSendOtpRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("aadhaar_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aadhaar_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aadhaar_number").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfflineAadhaarSendOtpRequestSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfflineAadhaarSendOtpRequestSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfflineAadhaarSendOtpRequestSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfflineAadhaarSendOtpRequestSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<OfflineAadhaarSendOtpRequestSchema>() {
           @Override
           public void write(JsonWriter out, OfflineAadhaarSendOtpRequestSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfflineAadhaarSendOtpRequestSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OfflineAadhaarSendOtpRequestSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OfflineAadhaarSendOtpRequestSchema
  * @throws IOException if the JSON string is invalid with respect to OfflineAadhaarSendOtpRequestSchema
  */
  public static OfflineAadhaarSendOtpRequestSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfflineAadhaarSendOtpRequestSchema.class);
  }

 /**
  * Convert an instance of OfflineAadhaarSendOtpRequestSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

