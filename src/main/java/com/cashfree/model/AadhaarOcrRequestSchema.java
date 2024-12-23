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
import java.io.File;
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
 * Request body schema for Aadhaar Verification via OCR.
 */
@Schema(description = "Request body schema for Aadhaar Verification via OCR.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-21T07:15:37.235803Z[Etc/UTC]")
public class AadhaarOcrRequestSchema {
  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId = "12345678";

  public static final String SERIALIZED_NAME_BACK_IMAGE = "back_image";
  @SerializedName(SERIALIZED_NAME_BACK_IMAGE)
  private File backImage;

  public static final String SERIALIZED_NAME_FRONT_IMAGE = "front_image";
  @SerializedName(SERIALIZED_NAME_FRONT_IMAGE)
  private File frontImage;

  public AadhaarOcrRequestSchema() {
  }

  public AadhaarOcrRequestSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * Get verificationId
   * @return verificationId
  **/
  @javax.annotation.Nonnull
  @Schema(example = "12345678", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public AadhaarOcrRequestSchema backImage(File backImage) {
    
    this.backImage = backImage;
    return this;
  }

   /**
   * It is the scanned image of the back of the aadhaar card. Allowed file type - JPEG/JPG/PNG. The max file size of both the files is 10MB.
   * @return backImage
  **/
  @javax.annotation.Nullable
  @Schema(example = "[B@738ed8f5", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the scanned image of the back of the aadhaar card. Allowed file type - JPEG/JPG/PNG. The max file size of both the files is 10MB.")
  public File getBackImage() {
    return backImage;
  }


  public void setBackImage(File backImage) {
    this.backImage = backImage;
  }


  public AadhaarOcrRequestSchema frontImage(File frontImage) {
    
    this.frontImage = frontImage;
    return this;
  }

   /**
   * It is the scanned image of the front of the aadhaar card. Allowed file type - JPEG/JPG/PNG. The max file size of both the files is 10MB.
   * @return frontImage
  **/
  @javax.annotation.Nonnull
  @Schema(example = "[B@1cfb7450", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the scanned image of the front of the aadhaar card. Allowed file type - JPEG/JPG/PNG. The max file size of both the files is 10MB.")
  public File getFrontImage() {
    return frontImage;
  }


  public void setFrontImage(File frontImage) {
    this.frontImage = frontImage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AadhaarOcrRequestSchema aadhaarOcrRequestSchema = (AadhaarOcrRequestSchema) o;
    return Objects.equals(this.verificationId, aadhaarOcrRequestSchema.verificationId) &&
        Objects.equals(this.backImage, aadhaarOcrRequestSchema.backImage) &&
        Objects.equals(this.frontImage, aadhaarOcrRequestSchema.frontImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationId, backImage, frontImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AadhaarOcrRequestSchema {\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    backImage: ").append(toIndentedString(backImage)).append("\n");
    sb.append("    frontImage: ").append(toIndentedString(frontImage)).append("\n");
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
    openapiFields.add("back_image");
    openapiFields.add("front_image");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("verification_id");
    openapiRequiredFields.add("front_image");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AadhaarOcrRequestSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AadhaarOcrRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AadhaarOcrRequestSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AadhaarOcrRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AadhaarOcrRequestSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AadhaarOcrRequestSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AadhaarOcrRequestSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AadhaarOcrRequestSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<AadhaarOcrRequestSchema>() {
           @Override
           public void write(JsonWriter out, AadhaarOcrRequestSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AadhaarOcrRequestSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AadhaarOcrRequestSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AadhaarOcrRequestSchema
  * @throws IOException if the JSON string is invalid with respect to AadhaarOcrRequestSchema
  */
  public static AadhaarOcrRequestSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AadhaarOcrRequestSchema.class);
  }

 /**
  * Convert an instance of AadhaarOcrRequestSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

