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
 * PAN Verification via OCR success response
 */
@Schema(description = "PAN Verification via OCR success response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T10:11:49.428720Z[Etc/UTC]")
public class PanOcrResponseSchema {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORGANIZATION_NAME = "organization_name";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_NAME)
  private String organizationName;

  public static final String SERIALIZED_NAME_PAN_TYPE = "pan_type";
  @SerializedName(SERIALIZED_NAME_PAN_TYPE)
  private String panType;

  public static final String SERIALIZED_NAME_DATE_OF_INCORPORATION = "date_of_incorporation";
  @SerializedName(SERIALIZED_NAME_DATE_OF_INCORPORATION)
  private String dateOfIncorporation;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private String dob;

  public static final String SERIALIZED_NAME_FATHER = "father";
  @SerializedName(SERIALIZED_NAME_FATHER)
  private String father;

  public static final String SERIALIZED_NAME_PAN = "pan";
  @SerializedName(SERIALIZED_NAME_PAN)
  private String pan;

  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private String age;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public static final String SERIALIZED_NAME_CONFIDENCE_SCORE = "confidence_score";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE_SCORE)
  private String confidenceScore;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public PanOcrResponseSchema() {
  }

  public PanOcrResponseSchema name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * It displays the name of the PAN holder.
   * @return name
  **/
  @javax.annotation.Nullable
  @Schema(example = "John Doe", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the PAN holder.")
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PanOcrResponseSchema organizationName(String organizationName) {
    
    this.organizationName = organizationName;
    return this;
  }

   /**
   * It displays the name of the organisation the individual runs.
   * @return organizationName
  **/
  @javax.annotation.Nullable
  @Schema(example = "ABC pvt ltd.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the organisation the individual runs.")
  public String getOrganizationName() {
    return organizationName;
  }


  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }


  public PanOcrResponseSchema panType(String panType) {
    
    this.panType = panType;
    return this;
  }

   /**
   * It displays the type of PAN issued to the individual.
   * @return panType
  **/
  @javax.annotation.Nullable
  @Schema(example = "Business", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the type of PAN issued to the individual.")
  public String getPanType() {
    return panType;
  }


  public void setPanType(String panType) {
    this.panType = panType;
  }


  public PanOcrResponseSchema dateOfIncorporation(String dateOfIncorporation) {
    
    this.dateOfIncorporation = dateOfIncorporation;
    return this;
  }

   /**
   * It displays the incorporation date of the individual&#39;s organisation.
   * @return dateOfIncorporation
  **/
  @javax.annotation.Nullable
  @Schema(example = "01-01-2000", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the incorporation date of the individual's organisation.")
  public String getDateOfIncorporation() {
    return dateOfIncorporation;
  }


  public void setDateOfIncorporation(String dateOfIncorporation) {
    this.dateOfIncorporation = dateOfIncorporation;
  }


  public PanOcrResponseSchema dob(String dob) {
    
    this.dob = dob;
    return this;
  }

   /**
   * It displays the date of birth of the individual.
   * @return dob
  **/
  @javax.annotation.Nullable
  @Schema(example = "01-01-1990", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the date of birth of the individual.")
  public String getDob() {
    return dob;
  }


  public void setDob(String dob) {
    this.dob = dob;
  }


  public PanOcrResponseSchema father(String father) {
    
    this.father = father;
    return this;
  }

   /**
   * It displays the father&#39;s name of the individual.
   * @return father
  **/
  @javax.annotation.Nullable
  @Schema(example = "Jone Doe", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the father's name of the individual.")
  public String getFather() {
    return father;
  }


  public void setFather(String father) {
    this.father = father;
  }


  public PanOcrResponseSchema pan(String pan) {
    
    this.pan = pan;
    return this;
  }

   /**
   * It displays the entered PAN information in the request.
   * @return pan
  **/
  @javax.annotation.Nullable
  @Schema(example = "ABCPP3011E", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the entered PAN information in the request.")
  public String getPan() {
    return pan;
  }


  public void setPan(String pan) {
    this.pan = pan;
  }


  public PanOcrResponseSchema valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * It displays whethere the entered PAN information is valid.
   * @return valid
  **/
  @javax.annotation.Nullable
  @Schema(example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays whethere the entered PAN information is valid.")
  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public PanOcrResponseSchema age(String age) {
    
    this.age = age;
    return this;
  }

   /**
   * It displays the age of the individual.
   * @return age
  **/
  @javax.annotation.Nullable
  @Schema(example = "20", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the age of the individual.")
  public String getAge() {
    return age;
  }


  public void setAge(String age) {
    this.age = age;
  }


  public PanOcrResponseSchema status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * It displays the status of the PAN information.
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(example = "Valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the PAN information.")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public PanOcrResponseSchema referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * It displays the unique ID created by Cashfree Payments for reference purposes.
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @Schema(example = "123456789", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by Cashfree Payments for reference purposes.")
  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public PanOcrResponseSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It displays the unique ID you created to identify the request.
   * @return verificationId
  **/
  @javax.annotation.Nullable
  @Schema(example = "1676668986", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID you created to identify the request.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public PanOcrResponseSchema confidenceScore(String confidenceScore) {
    
    this.confidenceScore = confidenceScore;
    return this;
  }

   /**
   * It displays the level of confidence or reliability associated with the PAN verification.
   * @return confidenceScore
  **/
  @javax.annotation.Nullable
  @Schema(example = "0.98", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the level of confidence or reliability associated with the PAN verification.")
  public String getConfidenceScore() {
    return confidenceScore;
  }


  public void setConfidenceScore(String confidenceScore) {
    this.confidenceScore = confidenceScore;
  }


  public PanOcrResponseSchema message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * It displays details about the success or failure of the API request.
   * @return message
  **/
  @javax.annotation.Nullable
  @Schema(example = "Valid PAN", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays details about the success or failure of the API request.")
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PanOcrResponseSchema panOcrResponseSchema = (PanOcrResponseSchema) o;
    return Objects.equals(this.name, panOcrResponseSchema.name) &&
        Objects.equals(this.organizationName, panOcrResponseSchema.organizationName) &&
        Objects.equals(this.panType, panOcrResponseSchema.panType) &&
        Objects.equals(this.dateOfIncorporation, panOcrResponseSchema.dateOfIncorporation) &&
        Objects.equals(this.dob, panOcrResponseSchema.dob) &&
        Objects.equals(this.father, panOcrResponseSchema.father) &&
        Objects.equals(this.pan, panOcrResponseSchema.pan) &&
        Objects.equals(this.valid, panOcrResponseSchema.valid) &&
        Objects.equals(this.age, panOcrResponseSchema.age) &&
        Objects.equals(this.status, panOcrResponseSchema.status) &&
        Objects.equals(this.referenceId, panOcrResponseSchema.referenceId) &&
        Objects.equals(this.verificationId, panOcrResponseSchema.verificationId) &&
        Objects.equals(this.confidenceScore, panOcrResponseSchema.confidenceScore) &&
        Objects.equals(this.message, panOcrResponseSchema.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, organizationName, panType, dateOfIncorporation, dob, father, pan, valid, age, status, referenceId, verificationId, confidenceScore, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PanOcrResponseSchema {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    panType: ").append(toIndentedString(panType)).append("\n");
    sb.append("    dateOfIncorporation: ").append(toIndentedString(dateOfIncorporation)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    father: ").append(toIndentedString(father)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    confidenceScore: ").append(toIndentedString(confidenceScore)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("organization_name");
    openapiFields.add("pan_type");
    openapiFields.add("date_of_incorporation");
    openapiFields.add("dob");
    openapiFields.add("father");
    openapiFields.add("pan");
    openapiFields.add("valid");
    openapiFields.add("age");
    openapiFields.add("status");
    openapiFields.add("reference_id");
    openapiFields.add("verification_id");
    openapiFields.add("confidence_score");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PanOcrResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("organization_name") != null && !jsonObj.get("organization_name").isJsonNull()) && !jsonObj.get("organization_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization_name").toString()));
      }
      if ((jsonObj.get("pan_type") != null && !jsonObj.get("pan_type").isJsonNull()) && !jsonObj.get("pan_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan_type").toString()));
      }
      if ((jsonObj.get("date_of_incorporation") != null && !jsonObj.get("date_of_incorporation").isJsonNull()) && !jsonObj.get("date_of_incorporation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_of_incorporation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_of_incorporation").toString()));
      }
      if ((jsonObj.get("dob") != null && !jsonObj.get("dob").isJsonNull()) && !jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      if ((jsonObj.get("father") != null && !jsonObj.get("father").isJsonNull()) && !jsonObj.get("father").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `father` to be a primitive type in the JSON string but got `%s`", jsonObj.get("father").toString()));
      }
      if ((jsonObj.get("pan") != null && !jsonObj.get("pan").isJsonNull()) && !jsonObj.get("pan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan").toString()));
      }
      if ((jsonObj.get("age") != null && !jsonObj.get("age").isJsonNull()) && !jsonObj.get("age").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `age` to be a primitive type in the JSON string but got `%s`", jsonObj.get("age").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("reference_id") != null && !jsonObj.get("reference_id").isJsonNull()) && !jsonObj.get("reference_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_id").toString()));
      }
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("confidence_score") != null && !jsonObj.get("confidence_score").isJsonNull()) && !jsonObj.get("confidence_score").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confidence_score` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confidence_score").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PanOcrResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("organization_name") != null && !jsonObj.get("organization_name").isJsonNull()) && !jsonObj.get("organization_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization_name").toString()));
      }
      if ((jsonObj.get("pan_type") != null && !jsonObj.get("pan_type").isJsonNull()) && !jsonObj.get("pan_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan_type").toString()));
      }
      if ((jsonObj.get("date_of_incorporation") != null && !jsonObj.get("date_of_incorporation").isJsonNull()) && !jsonObj.get("date_of_incorporation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_of_incorporation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_of_incorporation").toString()));
      }
      if ((jsonObj.get("dob") != null && !jsonObj.get("dob").isJsonNull()) && !jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      if ((jsonObj.get("father") != null && !jsonObj.get("father").isJsonNull()) && !jsonObj.get("father").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `father` to be a primitive type in the JSON string but got `%s`", jsonObj.get("father").toString()));
      }
      if ((jsonObj.get("pan") != null && !jsonObj.get("pan").isJsonNull()) && !jsonObj.get("pan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan").toString()));
      }
      if ((jsonObj.get("age") != null && !jsonObj.get("age").isJsonNull()) && !jsonObj.get("age").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `age` to be a primitive type in the JSON string but got `%s`", jsonObj.get("age").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("reference_id") != null && !jsonObj.get("reference_id").isJsonNull()) && !jsonObj.get("reference_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_id").toString()));
      }
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("confidence_score") != null && !jsonObj.get("confidence_score").isJsonNull()) && !jsonObj.get("confidence_score").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confidence_score` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confidence_score").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PanOcrResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PanOcrResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PanOcrResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PanOcrResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<PanOcrResponseSchema>() {
           @Override
           public void write(JsonWriter out, PanOcrResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PanOcrResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PanOcrResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PanOcrResponseSchema
  * @throws IOException if the JSON string is invalid with respect to PanOcrResponseSchema
  */
  public static PanOcrResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PanOcrResponseSchema.class);
  }

 /**
  * Convert an instance of PanOcrResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

