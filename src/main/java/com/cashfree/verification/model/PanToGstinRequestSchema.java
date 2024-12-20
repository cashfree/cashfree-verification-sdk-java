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
 * Find the request parameters to fetch the list of GSTIN associated with PAN
 */
@Schema(description = "Find the request parameters to fetch the list of GSTIN associated with PAN")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T10:11:49.428720Z[Etc/UTC]")
public class PanToGstinRequestSchema {
  public static final String SERIALIZED_NAME_PAN = "pan";
  @SerializedName(SERIALIZED_NAME_PAN)
  private String pan = "AZJPG7110R";

  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId = "testverificationid";

  public PanToGstinRequestSchema() {
  }

  public PanToGstinRequestSchema pan(String pan) {
    
    this.pan = pan;
    return this;
  }

   /**
   * It is the unique 10-character alphanumeric identifier issued by the Income Tax Department.
   * @return pan
  **/
  @javax.annotation.Nonnull
  @Schema(example = "AZJPG7110R", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the unique 10-character alphanumeric identifier issued by the Income Tax Department.")
  public String getPan() {
    return pan;
  }


  public void setPan(String pan) {
    this.pan = pan;
  }


  public PanToGstinRequestSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It is the unique ID you create to identify the request. The maximum character limit is 50. Alphanumeric, period (.), hyphen (-), and underscore ( _ ) are allowed.
   * @return verificationId
  **/
  @javax.annotation.Nonnull
  @Schema(example = "testverificationid", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the unique ID you create to identify the request. The maximum character limit is 50. Alphanumeric, period (.), hyphen (-), and underscore ( _ ) are allowed.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PanToGstinRequestSchema panToGstinRequestSchema = (PanToGstinRequestSchema) o;
    return Objects.equals(this.pan, panToGstinRequestSchema.pan) &&
        Objects.equals(this.verificationId, panToGstinRequestSchema.verificationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pan, verificationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PanToGstinRequestSchema {\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
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
    openapiFields.add("pan");
    openapiFields.add("verification_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pan");
    openapiRequiredFields.add("verification_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PanToGstinRequestSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PanToGstinRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("pan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan").toString()));
      }
      if (!jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PanToGstinRequestSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PanToGstinRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("pan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan").toString()));
      }
      if (!jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PanToGstinRequestSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PanToGstinRequestSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PanToGstinRequestSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PanToGstinRequestSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<PanToGstinRequestSchema>() {
           @Override
           public void write(JsonWriter out, PanToGstinRequestSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PanToGstinRequestSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PanToGstinRequestSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PanToGstinRequestSchema
  * @throws IOException if the JSON string is invalid with respect to PanToGstinRequestSchema
  */
  public static PanToGstinRequestSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PanToGstinRequestSchema.class);
  }

 /**
  * Convert an instance of PanToGstinRequestSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

