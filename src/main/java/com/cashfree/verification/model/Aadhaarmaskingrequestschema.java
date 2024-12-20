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

import com.cashfree.verification.JSON;

/**
 * Find the request parameters to mask aadhaar information
 */
@Schema(description = "Find the request parameters to mask aadhaar information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T10:11:49.428720Z[Etc/UTC]")
public class Aadhaarmaskingrequestschema {
  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private File image;

  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId = "testverificationid";

  public Aadhaarmaskingrequestschema() {
  }

  public Aadhaarmaskingrequestschema image(File image) {
    
    this.image = image;
    return this;
  }

   /**
   * It is the image file of the aadhaar card that needs masking. Accepted formats - short, long, and PVC. Allowed file type - JPEG/JPG/PNG. The maximum file size should be 10 MB.
   * @return image
  **/
  @javax.annotation.Nonnull
  @Schema(example = "[B@ef220e4", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the image file of the aadhaar card that needs masking. Accepted formats - short, long, and PVC. Allowed file type - JPEG/JPG/PNG. The maximum file size should be 10 MB.")
  public File getImage() {
    return image;
  }


  public void setImage(File image) {
    this.image = image;
  }


  public Aadhaarmaskingrequestschema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It is the unique ID you create to identify the verification request. The maximum character limit is 50. Only alphanumeric, period (.), hyphen (-), and underscore ( _ ) are allowed.
   * @return verificationId
  **/
  @javax.annotation.Nonnull
  @Schema(example = "testverificationid", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the unique ID you create to identify the verification request. The maximum character limit is 50. Only alphanumeric, period (.), hyphen (-), and underscore ( _ ) are allowed.")
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
    Aadhaarmaskingrequestschema aadhaarmaskingrequestschema = (Aadhaarmaskingrequestschema) o;
    return Objects.equals(this.image, aadhaarmaskingrequestschema.image) &&
        Objects.equals(this.verificationId, aadhaarmaskingrequestschema.verificationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, verificationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Aadhaarmaskingrequestschema {\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
    openapiFields.add("image");
    openapiFields.add("verification_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image");
    openapiRequiredFields.add("verification_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Aadhaarmaskingrequestschema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Aadhaarmaskingrequestschema.openapiRequiredFields) {
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
  * @throws IOException if the JSON Element is invalid with respect to Aadhaarmaskingrequestschema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Aadhaarmaskingrequestschema.openapiRequiredFields) {
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
       if (!Aadhaarmaskingrequestschema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Aadhaarmaskingrequestschema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Aadhaarmaskingrequestschema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Aadhaarmaskingrequestschema.class));

       return (TypeAdapter<T>) new TypeAdapter<Aadhaarmaskingrequestschema>() {
           @Override
           public void write(JsonWriter out, Aadhaarmaskingrequestschema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Aadhaarmaskingrequestschema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Aadhaarmaskingrequestschema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Aadhaarmaskingrequestschema
  * @throws IOException if the JSON string is invalid with respect to Aadhaarmaskingrequestschema
  */
  public static Aadhaarmaskingrequestschema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Aadhaarmaskingrequestschema.class);
  }

 /**
  * Convert an instance of Aadhaarmaskingrequestschema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

