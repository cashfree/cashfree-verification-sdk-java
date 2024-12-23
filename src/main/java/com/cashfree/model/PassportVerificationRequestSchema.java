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
 * Find the request parameters to verify passport information
 */
@Schema(description = "Find the request parameters to verify passport information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-21T07:15:37.235803Z[Etc/UTC]")
public class PassportVerificationRequestSchema {
  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId = "ABC00123";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FILE_NUMBER = "file_number";
  @SerializedName(SERIALIZED_NAME_FILE_NUMBER)
  private String fileNumber = "PA1079341954215";

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private String dob = "2007-03-01";

  public PassportVerificationRequestSchema() {
  }

  public PassportVerificationRequestSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It is the unique ID you create to identify the verification request. The maximum character limit is 50. Only alphanumeric, period (.), hyphen (-), and underscore ( _ ) are allowed.
   * @return verificationId
  **/
  @javax.annotation.Nonnull
  @Schema(example = "ABC00123", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the unique ID you create to identify the verification request. The maximum character limit is 50. Only alphanumeric, period (.), hyphen (-), and underscore ( _ ) are allowed.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public PassportVerificationRequestSchema name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * It is the name of the passport holder.
   * @return name
  **/
  @javax.annotation.Nullable
  @Schema(example = "John Doe", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the name of the passport holder.")
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PassportVerificationRequestSchema fileNumber(String fileNumber) {
    
    this.fileNumber = fileNumber;
    return this;
  }

   /**
   * It is the unique alphanumeric code that identifies an individual&#39;s passport application.
   * @return fileNumber
  **/
  @javax.annotation.Nonnull
  @Schema(example = "PA1079341954215", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the unique alphanumeric code that identifies an individual's passport application.")
  public String getFileNumber() {
    return fileNumber;
  }


  public void setFileNumber(String fileNumber) {
    this.fileNumber = fileNumber;
  }


  public PassportVerificationRequestSchema dob(String dob) {
    
    this.dob = dob;
    return this;
  }

   /**
   * It is the date of birth of the passport holder. The format is YYYY-MM-DD.
   * @return dob
  **/
  @javax.annotation.Nonnull
  @Schema(example = "2007-03-01", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the date of birth of the passport holder. The format is YYYY-MM-DD.")
  public String getDob() {
    return dob;
  }


  public void setDob(String dob) {
    this.dob = dob;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassportVerificationRequestSchema passportVerificationRequestSchema = (PassportVerificationRequestSchema) o;
    return Objects.equals(this.verificationId, passportVerificationRequestSchema.verificationId) &&
        Objects.equals(this.name, passportVerificationRequestSchema.name) &&
        Objects.equals(this.fileNumber, passportVerificationRequestSchema.fileNumber) &&
        Objects.equals(this.dob, passportVerificationRequestSchema.dob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationId, name, fileNumber, dob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassportVerificationRequestSchema {\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fileNumber: ").append(toIndentedString(fileNumber)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("file_number");
    openapiFields.add("dob");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("verification_id");
    openapiRequiredFields.add("file_number");
    openapiRequiredFields.add("dob");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PassportVerificationRequestSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PassportVerificationRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("file_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_number").toString()));
      }
      if (!jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PassportVerificationRequestSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PassportVerificationRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("file_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_number").toString()));
      }
      if (!jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PassportVerificationRequestSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PassportVerificationRequestSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PassportVerificationRequestSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PassportVerificationRequestSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<PassportVerificationRequestSchema>() {
           @Override
           public void write(JsonWriter out, PassportVerificationRequestSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PassportVerificationRequestSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PassportVerificationRequestSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PassportVerificationRequestSchema
  * @throws IOException if the JSON string is invalid with respect to PassportVerificationRequestSchema
  */
  public static PassportVerificationRequestSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PassportVerificationRequestSchema.class);
  }

 /**
  * Convert an instance of PassportVerificationRequestSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

