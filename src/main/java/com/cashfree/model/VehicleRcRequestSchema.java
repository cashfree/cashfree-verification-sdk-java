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
 * Find the request parameters to verify vehicle RC information
 */
@Schema(description = "Find the request parameters to verify vehicle RC information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-08T05:03:36.102379Z[Etc/UTC]")
public class VehicleRcRequestSchema {
  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId = "test001";

  public static final String SERIALIZED_NAME_VEHICLE_NUMBER = "vehicle_number";
  @SerializedName(SERIALIZED_NAME_VEHICLE_NUMBER)
  private String vehicleNumber;

  public VehicleRcRequestSchema() {
  }

  public VehicleRcRequestSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It is the unique ID you create to identify the verification request. The maximum character limit is 50. Only alphanumeric, period (.), hyphen (-), and underscore ( _ ) are allowed.
   * @return verificationId
  **/
  @javax.annotation.Nonnull
  @Schema(example = "test001", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the unique ID you create to identify the verification request. The maximum character limit is 50. Only alphanumeric, period (.), hyphen (-), and underscore ( _ ) are allowed.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public VehicleRcRequestSchema vehicleNumber(String vehicleNumber) {
    
    this.vehicleNumber = vehicleNumber;
    return this;
  }

   /**
   * It is the registration number of the vehicle
   * @return vehicleNumber
  **/
  @javax.annotation.Nonnull
  @Schema(example = "PY01MW8769", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the registration number of the vehicle")
  public String getVehicleNumber() {
    return vehicleNumber;
  }


  public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleRcRequestSchema vehicleRcRequestSchema = (VehicleRcRequestSchema) o;
    return Objects.equals(this.verificationId, vehicleRcRequestSchema.verificationId) &&
        Objects.equals(this.vehicleNumber, vehicleRcRequestSchema.vehicleNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationId, vehicleNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleRcRequestSchema {\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    vehicleNumber: ").append(toIndentedString(vehicleNumber)).append("\n");
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
    openapiFields.add("vehicle_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("verification_id");
    openapiRequiredFields.add("vehicle_number");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VehicleRcRequestSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VehicleRcRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if (!jsonObj.get("vehicle_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vehicle_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vehicle_number").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VehicleRcRequestSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VehicleRcRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if (!jsonObj.get("vehicle_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vehicle_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vehicle_number").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VehicleRcRequestSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VehicleRcRequestSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VehicleRcRequestSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VehicleRcRequestSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<VehicleRcRequestSchema>() {
           @Override
           public void write(JsonWriter out, VehicleRcRequestSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VehicleRcRequestSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VehicleRcRequestSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VehicleRcRequestSchema
  * @throws IOException if the JSON string is invalid with respect to VehicleRcRequestSchema
  */
  public static VehicleRcRequestSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VehicleRcRequestSchema.class);
  }

 /**
  * Convert an instance of VehicleRcRequestSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

