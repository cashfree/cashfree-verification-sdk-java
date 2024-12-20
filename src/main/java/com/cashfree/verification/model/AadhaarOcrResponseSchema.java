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
 * Success response for Aadhaar Verification via OCR
 */
@Schema(description = "Success response for Aadhaar Verification via OCR")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T10:11:49.428720Z[Etc/UTC]")
public class AadhaarOcrResponseSchema {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_YOB = "yob";
  @SerializedName(SERIALIZED_NAME_YOB)
  private String yob;

  public static final String SERIALIZED_NAME_FATHER = "father";
  @SerializedName(SERIALIZED_NAME_FATHER)
  private String father;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_PINCODE = "pincode";
  @SerializedName(SERIALIZED_NAME_PINCODE)
  private String pincode;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

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

  public AadhaarOcrResponseSchema() {
  }

  public AadhaarOcrResponseSchema name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * It displays the name of the aadhaar card holder.
   * @return name
  **/
  @javax.annotation.Nullable
  @Schema(example = "John Doe", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the aadhaar card holder.")
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AadhaarOcrResponseSchema yob(String yob) {
    
    this.yob = yob;
    return this;
  }

   /**
   * It displays the year of birth of the aadhaar card holder.
   * @return yob
  **/
  @javax.annotation.Nullable
  @Schema(example = "2000", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the year of birth of the aadhaar card holder.")
  public String getYob() {
    return yob;
  }


  public void setYob(String yob) {
    this.yob = yob;
  }


  public AadhaarOcrResponseSchema father(String father) {
    
    this.father = father;
    return this;
  }

   /**
   * It displays the father&#39;s name of the aadhaar card holder.
   * @return father
  **/
  @javax.annotation.Nullable
  @Schema(example = "Jone Doe", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the father's name of the aadhaar card holder.")
  public String getFather() {
    return father;
  }


  public void setFather(String father) {
    this.father = father;
  }


  public AadhaarOcrResponseSchema gender(String gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * It displays the gender of the aadhaar card holder.
   * @return gender
  **/
  @javax.annotation.Nullable
  @Schema(example = "Male", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the gender of the aadhaar card holder.")
  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }


  public AadhaarOcrResponseSchema uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * It displays the UID information as present in the aadhaar card.
   * @return uid
  **/
  @javax.annotation.Nullable
  @Schema(example = "123456789012", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the UID information as present in the aadhaar card.")
  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public AadhaarOcrResponseSchema state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * It displays the name of the state as present in the aadhaar card.
   * @return state
  **/
  @javax.annotation.Nullable
  @Schema(example = "Madhya Pradesh", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the state as present in the aadhaar card.")
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public AadhaarOcrResponseSchema pincode(String pincode) {
    
    this.pincode = pincode;
    return this;
  }

   /**
   * It displays the PIN code information as present in the aadhaar card.
   * @return pincode
  **/
  @javax.annotation.Nullable
  @Schema(example = "453551", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the PIN code information as present in the aadhaar card.")
  public String getPincode() {
    return pincode;
  }


  public void setPincode(String pincode) {
    this.pincode = pincode;
  }


  public AadhaarOcrResponseSchema address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * It displays the address information of the aadhaar card holder.
   * @return address
  **/
  @javax.annotation.Nullable
  @Schema(example = "4th cross road  Koramangala", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the address information of the aadhaar card holder.")
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AadhaarOcrResponseSchema valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * It displays whether the aadhaar card is valid or not.
   * @return valid
  **/
  @javax.annotation.Nullable
  @Schema(example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays whether the aadhaar card is valid or not.")
  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public AadhaarOcrResponseSchema status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * It displays the status of the aadhaar card.
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(example = "VALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the aadhaar card.")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AadhaarOcrResponseSchema referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * It displays the unique ID created by Cashfree Payments for reference purposes.
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @Schema(example = "123456", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by Cashfree Payments for reference purposes.")
  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public AadhaarOcrResponseSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It displays the unique ID you created to identify this request.
   * @return verificationId
  **/
  @javax.annotation.Nullable
  @Schema(example = "123467", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID you created to identify this request.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public AadhaarOcrResponseSchema confidenceScore(String confidenceScore) {
    
    this.confidenceScore = confidenceScore;
    return this;
  }

   /**
   * It displays the confidence score for this aadhaar card verification request.
   * @return confidenceScore
  **/
  @javax.annotation.Nullable
  @Schema(example = "0.98", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the confidence score for this aadhaar card verification request.")
  public String getConfidenceScore() {
    return confidenceScore;
  }


  public void setConfidenceScore(String confidenceScore) {
    this.confidenceScore = confidenceScore;
  }


  public AadhaarOcrResponseSchema message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * It displays details about the success or failure of the API request.
   * @return message
  **/
  @javax.annotation.Nullable
  @Schema(example = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays details about the success or failure of the API request.")
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
    AadhaarOcrResponseSchema aadhaarOcrResponseSchema = (AadhaarOcrResponseSchema) o;
    return Objects.equals(this.name, aadhaarOcrResponseSchema.name) &&
        Objects.equals(this.yob, aadhaarOcrResponseSchema.yob) &&
        Objects.equals(this.father, aadhaarOcrResponseSchema.father) &&
        Objects.equals(this.gender, aadhaarOcrResponseSchema.gender) &&
        Objects.equals(this.uid, aadhaarOcrResponseSchema.uid) &&
        Objects.equals(this.state, aadhaarOcrResponseSchema.state) &&
        Objects.equals(this.pincode, aadhaarOcrResponseSchema.pincode) &&
        Objects.equals(this.address, aadhaarOcrResponseSchema.address) &&
        Objects.equals(this.valid, aadhaarOcrResponseSchema.valid) &&
        Objects.equals(this.status, aadhaarOcrResponseSchema.status) &&
        Objects.equals(this.referenceId, aadhaarOcrResponseSchema.referenceId) &&
        Objects.equals(this.verificationId, aadhaarOcrResponseSchema.verificationId) &&
        Objects.equals(this.confidenceScore, aadhaarOcrResponseSchema.confidenceScore) &&
        Objects.equals(this.message, aadhaarOcrResponseSchema.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, yob, father, gender, uid, state, pincode, address, valid, status, referenceId, verificationId, confidenceScore, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AadhaarOcrResponseSchema {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    yob: ").append(toIndentedString(yob)).append("\n");
    sb.append("    father: ").append(toIndentedString(father)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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
    openapiFields.add("yob");
    openapiFields.add("father");
    openapiFields.add("gender");
    openapiFields.add("uid");
    openapiFields.add("state");
    openapiFields.add("pincode");
    openapiFields.add("address");
    openapiFields.add("valid");
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
  * @throws IOException if the JSON Element is invalid with respect to AadhaarOcrResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("yob") != null && !jsonObj.get("yob").isJsonNull()) && !jsonObj.get("yob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `yob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("yob").toString()));
      }
      if ((jsonObj.get("father") != null && !jsonObj.get("father").isJsonNull()) && !jsonObj.get("father").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `father` to be a primitive type in the JSON string but got `%s`", jsonObj.get("father").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("pincode") != null && !jsonObj.get("pincode").isJsonNull()) && !jsonObj.get("pincode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pincode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pincode").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
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
  * @throws IOException if the JSON Element is invalid with respect to AadhaarOcrResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("yob") != null && !jsonObj.get("yob").isJsonNull()) && !jsonObj.get("yob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `yob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("yob").toString()));
      }
      if ((jsonObj.get("father") != null && !jsonObj.get("father").isJsonNull()) && !jsonObj.get("father").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `father` to be a primitive type in the JSON string but got `%s`", jsonObj.get("father").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("pincode") != null && !jsonObj.get("pincode").isJsonNull()) && !jsonObj.get("pincode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pincode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pincode").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
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
       if (!AadhaarOcrResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AadhaarOcrResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AadhaarOcrResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AadhaarOcrResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<AadhaarOcrResponseSchema>() {
           @Override
           public void write(JsonWriter out, AadhaarOcrResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AadhaarOcrResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AadhaarOcrResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AadhaarOcrResponseSchema
  * @throws IOException if the JSON string is invalid with respect to AadhaarOcrResponseSchema
  */
  public static AadhaarOcrResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AadhaarOcrResponseSchema.class);
  }

 /**
  * Convert an instance of AadhaarOcrResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

