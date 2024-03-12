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
 * Success response for Verify Passport
 */
@Schema(description = "Success response for Verify Passport")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-12T04:15:15.893702Z[Etc/UTC]")
public class PassportVerificationResponseSchema {
  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private Integer referenceId;

  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_FILE_NUMBER = "file_number";
  @SerializedName(SERIALIZED_NAME_FILE_NUMBER)
  private String fileNumber;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private String dob;

  public static final String SERIALIZED_NAME_APPLICATION_TYPE = "application_type";
  @SerializedName(SERIALIZED_NAME_APPLICATION_TYPE)
  private String applicationType;

  public static final String SERIALIZED_NAME_APPLICATION_RECEIVED_DATE = "application_received_date";
  @SerializedName(SERIALIZED_NAME_APPLICATION_RECEIVED_DATE)
  private String applicationReceivedDate;

  public PassportVerificationResponseSchema() {
  }

  public PassportVerificationResponseSchema referenceId(Integer referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * It displays the unique ID created by Cashfree Payments for reference purposes.
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @Schema(example = "1358", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by Cashfree Payments for reference purposes.")
  public Integer getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(Integer referenceId) {
    this.referenceId = referenceId;
  }


  public PassportVerificationResponseSchema verificationId(String verificationId) {
    
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


  public PassportVerificationResponseSchema status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * It displays the status of the passport.
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(example = "VALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the passport.")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public PassportVerificationResponseSchema fileNumber(String fileNumber) {
    
    this.fileNumber = fileNumber;
    return this;
  }

   /**
   * It displays the unique alphanumeric code that identifies an individual&#39;s passport application.
   * @return fileNumber
  **/
  @javax.annotation.Nullable
  @Schema(example = "XX0000000000000", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique alphanumeric code that identifies an individual's passport application.")
  public String getFileNumber() {
    return fileNumber;
  }


  public void setFileNumber(String fileNumber) {
    this.fileNumber = fileNumber;
  }


  public PassportVerificationResponseSchema name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * It displays the name of the passport holder.
   * @return name
  **/
  @javax.annotation.Nullable
  @Schema(example = "John Doe", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the passport holder.")
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PassportVerificationResponseSchema dob(String dob) {
    
    this.dob = dob;
    return this;
  }

   /**
   * It displays the date of birth of the passport holder.
   * @return dob
  **/
  @javax.annotation.Nullable
  @Schema(example = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the date of birth of the passport holder.")
  public String getDob() {
    return dob;
  }


  public void setDob(String dob) {
    this.dob = dob;
  }


  public PassportVerificationResponseSchema applicationType(String applicationType) {
    
    this.applicationType = applicationType;
    return this;
  }

   /**
   * It displays the type of passport application.
   * @return applicationType
  **/
  @javax.annotation.Nullable
  @Schema(example = "NORMAL", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the type of passport application.")
  public String getApplicationType() {
    return applicationType;
  }


  public void setApplicationType(String applicationType) {
    this.applicationType = applicationType;
  }


  public PassportVerificationResponseSchema applicationReceivedDate(String applicationReceivedDate) {
    
    this.applicationReceivedDate = applicationReceivedDate;
    return this;
  }

   /**
   * It displays when the passport application was received.
   * @return applicationReceivedDate
  **/
  @javax.annotation.Nullable
  @Schema(example = "YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays when the passport application was received.")
  public String getApplicationReceivedDate() {
    return applicationReceivedDate;
  }


  public void setApplicationReceivedDate(String applicationReceivedDate) {
    this.applicationReceivedDate = applicationReceivedDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassportVerificationResponseSchema passportVerificationResponseSchema = (PassportVerificationResponseSchema) o;
    return Objects.equals(this.referenceId, passportVerificationResponseSchema.referenceId) &&
        Objects.equals(this.verificationId, passportVerificationResponseSchema.verificationId) &&
        Objects.equals(this.status, passportVerificationResponseSchema.status) &&
        Objects.equals(this.fileNumber, passportVerificationResponseSchema.fileNumber) &&
        Objects.equals(this.name, passportVerificationResponseSchema.name) &&
        Objects.equals(this.dob, passportVerificationResponseSchema.dob) &&
        Objects.equals(this.applicationType, passportVerificationResponseSchema.applicationType) &&
        Objects.equals(this.applicationReceivedDate, passportVerificationResponseSchema.applicationReceivedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, verificationId, status, fileNumber, name, dob, applicationType, applicationReceivedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassportVerificationResponseSchema {\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fileNumber: ").append(toIndentedString(fileNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
    sb.append("    applicationReceivedDate: ").append(toIndentedString(applicationReceivedDate)).append("\n");
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
    openapiFields.add("reference_id");
    openapiFields.add("verification_id");
    openapiFields.add("status");
    openapiFields.add("file_number");
    openapiFields.add("name");
    openapiFields.add("dob");
    openapiFields.add("application_type");
    openapiFields.add("application_received_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PassportVerificationResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("file_number") != null && !jsonObj.get("file_number").isJsonNull()) && !jsonObj.get("file_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_number").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("dob") != null && !jsonObj.get("dob").isJsonNull()) && !jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      if ((jsonObj.get("application_type") != null && !jsonObj.get("application_type").isJsonNull()) && !jsonObj.get("application_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_type").toString()));
      }
      if ((jsonObj.get("application_received_date") != null && !jsonObj.get("application_received_date").isJsonNull()) && !jsonObj.get("application_received_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_received_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_received_date").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PassportVerificationResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("file_number") != null && !jsonObj.get("file_number").isJsonNull()) && !jsonObj.get("file_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_number").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("dob") != null && !jsonObj.get("dob").isJsonNull()) && !jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      if ((jsonObj.get("application_type") != null && !jsonObj.get("application_type").isJsonNull()) && !jsonObj.get("application_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_type").toString()));
      }
      if ((jsonObj.get("application_received_date") != null && !jsonObj.get("application_received_date").isJsonNull()) && !jsonObj.get("application_received_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_received_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_received_date").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PassportVerificationResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PassportVerificationResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PassportVerificationResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PassportVerificationResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<PassportVerificationResponseSchema>() {
           @Override
           public void write(JsonWriter out, PassportVerificationResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PassportVerificationResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PassportVerificationResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PassportVerificationResponseSchema
  * @throws IOException if the JSON string is invalid with respect to PassportVerificationResponseSchema
  */
  public static PassportVerificationResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PassportVerificationResponseSchema.class);
  }

 /**
  * Convert an instance of PassportVerificationResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

