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
 * Success response for Verify PAN Sync API
 */
@Schema(description = "Success response for Verify PAN Sync API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T10:11:49.428720Z[Etc/UTC]")
public class GetVerifyPanResponseSchema {
  public static final String SERIALIZED_NAME_PAN = "pan";
  @SerializedName(SERIALIZED_NAME_PAN)
  private String pan;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private Long referenceId;

  public static final String SERIALIZED_NAME_NAME_PROVIDED = "name_provided";
  @SerializedName(SERIALIZED_NAME_NAME_PROVIDED)
  private String nameProvided;

  public static final String SERIALIZED_NAME_REGISTERED_NAME = "registered_name";
  @SerializedName(SERIALIZED_NAME_REGISTERED_NAME)
  private String registeredName;

  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_FATHER_NAME = "father_name";
  @SerializedName(SERIALIZED_NAME_FATHER_NAME)
  private String fatherName;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NAME_MATCH_SCORE = "name_match_score";
  @SerializedName(SERIALIZED_NAME_NAME_MATCH_SCORE)
  private String nameMatchScore;

  public static final String SERIALIZED_NAME_NAME_MATCH_RESULT = "name_match_result";
  @SerializedName(SERIALIZED_NAME_NAME_MATCH_RESULT)
  private String nameMatchResult;

  public static final String SERIALIZED_NAME_AADHAAR_SEEDING_STATUS = "aadhaar_seeding_status";
  @SerializedName(SERIALIZED_NAME_AADHAAR_SEEDING_STATUS)
  private String aadhaarSeedingStatus;

  public static final String SERIALIZED_NAME_LAST_UPDATED_AT = "last_updated_at";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_AT)
  private String lastUpdatedAt;

  public static final String SERIALIZED_NAME_NAME_PAN_CARD = "name_pan_card";
  @SerializedName(SERIALIZED_NAME_NAME_PAN_CARD)
  private String namePanCard;

  public static final String SERIALIZED_NAME_PAN_STATUS = "pan_status";
  @SerializedName(SERIALIZED_NAME_PAN_STATUS)
  private String panStatus;

  public static final String SERIALIZED_NAME_AADHAAR_SEEDING_STATUS_DESC = "aadhaar_seeding_status_desc";
  @SerializedName(SERIALIZED_NAME_AADHAAR_SEEDING_STATUS_DESC)
  private String aadhaarSeedingStatusDesc;

  public GetVerifyPanResponseSchema() {
  }

  public GetVerifyPanResponseSchema pan(String pan) {
    
    this.pan = pan;
    return this;
  }

   /**
   * It displays the unique 10-character alphanumeric identifier issued by the Income Tax Department.
   * @return pan
  **/
  @javax.annotation.Nullable
  @Schema(example = "ABCPV1234D", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique 10-character alphanumeric identifier issued by the Income Tax Department.")
  public String getPan() {
    return pan;
  }


  public void setPan(String pan) {
    this.pan = pan;
  }


  public GetVerifyPanResponseSchema type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * It displays the type of the PAN issued.
   * @return type
  **/
  @javax.annotation.Nullable
  @Schema(example = "Individual", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the type of the PAN issued.")
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public GetVerifyPanResponseSchema referenceId(Long referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * It displays the unique ID created by Cashfree Payments for reference purposes.
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @Schema(example = "161", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by Cashfree Payments for reference purposes.")
  public Long getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(Long referenceId) {
    this.referenceId = referenceId;
  }


  public GetVerifyPanResponseSchema nameProvided(String nameProvided) {
    
    this.nameProvided = nameProvided;
    return this;
  }

   /**
   * It displays the name entered in the API request.
   * @return nameProvided
  **/
  @javax.annotation.Nullable
  @Schema(example = "JOHN DOE", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name entered in the API request.")
  public String getNameProvided() {
    return nameProvided;
  }


  public void setNameProvided(String nameProvided) {
    this.nameProvided = nameProvided;
  }


  public GetVerifyPanResponseSchema registeredName(String registeredName) {
    
    this.registeredName = registeredName;
    return this;
  }

   /**
   * It displays the PAN registered name.
   * @return registeredName
  **/
  @javax.annotation.Nullable
  @Schema(example = "JOHN DOE", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the PAN registered name.")
  public String getRegisteredName() {
    return registeredName;
  }


  public void setRegisteredName(String registeredName) {
    this.registeredName = registeredName;
  }


  public GetVerifyPanResponseSchema valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * It displays the status of the PAN card.
   * @return valid
  **/
  @javax.annotation.Nullable
  @Schema(example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the PAN card.")
  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public GetVerifyPanResponseSchema fatherName(String fatherName) {
    
    this.fatherName = fatherName;
    return this;
  }

   /**
   * It displays the father&#39;s name of the PAN card holder.
   * @return fatherName
  **/
  @javax.annotation.Nullable
  @Schema(example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the father's name of the PAN card holder.")
  public String getFatherName() {
    return fatherName;
  }


  public void setFatherName(String fatherName) {
    this.fatherName = fatherName;
  }


  public GetVerifyPanResponseSchema message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * It displays details about the success or failure of the API request.
   * @return message
  **/
  @javax.annotation.Nullable
  @Schema(example = "PAN verified successfully", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays details about the success or failure of the API request.")
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public GetVerifyPanResponseSchema nameMatchScore(String nameMatchScore) {
    
    this.nameMatchScore = nameMatchScore;
    return this;
  }

   /**
   * It displays the score for the name match verification.
   * @return nameMatchScore
  **/
  @javax.annotation.Nullable
  @Schema(example = "100.00", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the score for the name match verification.")
  public String getNameMatchScore() {
    return nameMatchScore;
  }


  public void setNameMatchScore(String nameMatchScore) {
    this.nameMatchScore = nameMatchScore;
  }


  public GetVerifyPanResponseSchema nameMatchResult(String nameMatchResult) {
    
    this.nameMatchResult = nameMatchResult;
    return this;
  }

   /**
   * It displays the result of the name match verification.
   * @return nameMatchResult
  **/
  @javax.annotation.Nullable
  @Schema(example = "DIRECT_MATCH", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the result of the name match verification.")
  public String getNameMatchResult() {
    return nameMatchResult;
  }


  public void setNameMatchResult(String nameMatchResult) {
    this.nameMatchResult = nameMatchResult;
  }


  public GetVerifyPanResponseSchema aadhaarSeedingStatus(String aadhaarSeedingStatus) {
    
    this.aadhaarSeedingStatus = aadhaarSeedingStatus;
    return this;
  }

   /**
   * It displays whether the individual linked the aadhaar information with PAN.
   * @return aadhaarSeedingStatus
  **/
  @javax.annotation.Nullable
  @Schema(example = "Y", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays whether the individual linked the aadhaar information with PAN.")
  public String getAadhaarSeedingStatus() {
    return aadhaarSeedingStatus;
  }


  public void setAadhaarSeedingStatus(String aadhaarSeedingStatus) {
    this.aadhaarSeedingStatus = aadhaarSeedingStatus;
  }


  public GetVerifyPanResponseSchema lastUpdatedAt(String lastUpdatedAt) {
    
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

   /**
   * It displays the last updated date.
   * @return lastUpdatedAt
  **/
  @javax.annotation.Nullable
  @Schema(example = "01/01/2019", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the last updated date.")
  public String getLastUpdatedAt() {
    return lastUpdatedAt;
  }


  public void setLastUpdatedAt(String lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }


  public GetVerifyPanResponseSchema namePanCard(String namePanCard) {
    
    this.namePanCard = namePanCard;
    return this;
  }

   /**
   * It displays the name displayed on the PAN card.
   * @return namePanCard
  **/
  @javax.annotation.Nullable
  @Schema(example = "JOHN DOE", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name displayed on the PAN card.")
  public String getNamePanCard() {
    return namePanCard;
  }


  public void setNamePanCard(String namePanCard) {
    this.namePanCard = namePanCard;
  }


  public GetVerifyPanResponseSchema panStatus(String panStatus) {
    
    this.panStatus = panStatus;
    return this;
  }

   /**
   * It displays the status of the PAN card.
   * @return panStatus
  **/
  @javax.annotation.Nullable
  @Schema(example = "VALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the PAN card.")
  public String getPanStatus() {
    return panStatus;
  }


  public void setPanStatus(String panStatus) {
    this.panStatus = panStatus;
  }


  public GetVerifyPanResponseSchema aadhaarSeedingStatusDesc(String aadhaarSeedingStatusDesc) {
    
    this.aadhaarSeedingStatusDesc = aadhaarSeedingStatusDesc;
    return this;
  }

   /**
   * It displays additional information of the linking of aadhaar and PAN card.
   * @return aadhaarSeedingStatusDesc
  **/
  @javax.annotation.Nullable
  @Schema(example = "Aadhaar is linked to PAN", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays additional information of the linking of aadhaar and PAN card.")
  public String getAadhaarSeedingStatusDesc() {
    return aadhaarSeedingStatusDesc;
  }


  public void setAadhaarSeedingStatusDesc(String aadhaarSeedingStatusDesc) {
    this.aadhaarSeedingStatusDesc = aadhaarSeedingStatusDesc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetVerifyPanResponseSchema getVerifyPanResponseSchema = (GetVerifyPanResponseSchema) o;
    return Objects.equals(this.pan, getVerifyPanResponseSchema.pan) &&
        Objects.equals(this.type, getVerifyPanResponseSchema.type) &&
        Objects.equals(this.referenceId, getVerifyPanResponseSchema.referenceId) &&
        Objects.equals(this.nameProvided, getVerifyPanResponseSchema.nameProvided) &&
        Objects.equals(this.registeredName, getVerifyPanResponseSchema.registeredName) &&
        Objects.equals(this.valid, getVerifyPanResponseSchema.valid) &&
        Objects.equals(this.fatherName, getVerifyPanResponseSchema.fatherName) &&
        Objects.equals(this.message, getVerifyPanResponseSchema.message) &&
        Objects.equals(this.nameMatchScore, getVerifyPanResponseSchema.nameMatchScore) &&
        Objects.equals(this.nameMatchResult, getVerifyPanResponseSchema.nameMatchResult) &&
        Objects.equals(this.aadhaarSeedingStatus, getVerifyPanResponseSchema.aadhaarSeedingStatus) &&
        Objects.equals(this.lastUpdatedAt, getVerifyPanResponseSchema.lastUpdatedAt) &&
        Objects.equals(this.namePanCard, getVerifyPanResponseSchema.namePanCard) &&
        Objects.equals(this.panStatus, getVerifyPanResponseSchema.panStatus) &&
        Objects.equals(this.aadhaarSeedingStatusDesc, getVerifyPanResponseSchema.aadhaarSeedingStatusDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pan, type, referenceId, nameProvided, registeredName, valid, fatherName, message, nameMatchScore, nameMatchResult, aadhaarSeedingStatus, lastUpdatedAt, namePanCard, panStatus, aadhaarSeedingStatusDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetVerifyPanResponseSchema {\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    nameProvided: ").append(toIndentedString(nameProvided)).append("\n");
    sb.append("    registeredName: ").append(toIndentedString(registeredName)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    fatherName: ").append(toIndentedString(fatherName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nameMatchScore: ").append(toIndentedString(nameMatchScore)).append("\n");
    sb.append("    nameMatchResult: ").append(toIndentedString(nameMatchResult)).append("\n");
    sb.append("    aadhaarSeedingStatus: ").append(toIndentedString(aadhaarSeedingStatus)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    namePanCard: ").append(toIndentedString(namePanCard)).append("\n");
    sb.append("    panStatus: ").append(toIndentedString(panStatus)).append("\n");
    sb.append("    aadhaarSeedingStatusDesc: ").append(toIndentedString(aadhaarSeedingStatusDesc)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("reference_id");
    openapiFields.add("name_provided");
    openapiFields.add("registered_name");
    openapiFields.add("valid");
    openapiFields.add("father_name");
    openapiFields.add("message");
    openapiFields.add("name_match_score");
    openapiFields.add("name_match_result");
    openapiFields.add("aadhaar_seeding_status");
    openapiFields.add("last_updated_at");
    openapiFields.add("name_pan_card");
    openapiFields.add("pan_status");
    openapiFields.add("aadhaar_seeding_status_desc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetVerifyPanResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("pan") != null && !jsonObj.get("pan").isJsonNull()) && !jsonObj.get("pan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("name_provided") != null && !jsonObj.get("name_provided").isJsonNull()) && !jsonObj.get("name_provided").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_provided` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_provided").toString()));
      }
      if ((jsonObj.get("registered_name") != null && !jsonObj.get("registered_name").isJsonNull()) && !jsonObj.get("registered_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registered_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registered_name").toString()));
      }
      if ((jsonObj.get("father_name") != null && !jsonObj.get("father_name").isJsonNull()) && !jsonObj.get("father_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `father_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("father_name").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("name_match_score") != null && !jsonObj.get("name_match_score").isJsonNull()) && !jsonObj.get("name_match_score").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_match_score` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_match_score").toString()));
      }
      if ((jsonObj.get("name_match_result") != null && !jsonObj.get("name_match_result").isJsonNull()) && !jsonObj.get("name_match_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_match_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_match_result").toString()));
      }
      if ((jsonObj.get("aadhaar_seeding_status") != null && !jsonObj.get("aadhaar_seeding_status").isJsonNull()) && !jsonObj.get("aadhaar_seeding_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aadhaar_seeding_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aadhaar_seeding_status").toString()));
      }
      if ((jsonObj.get("last_updated_at") != null && !jsonObj.get("last_updated_at").isJsonNull()) && !jsonObj.get("last_updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_updated_at").toString()));
      }
      if ((jsonObj.get("name_pan_card") != null && !jsonObj.get("name_pan_card").isJsonNull()) && !jsonObj.get("name_pan_card").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_pan_card` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_pan_card").toString()));
      }
      if ((jsonObj.get("pan_status") != null && !jsonObj.get("pan_status").isJsonNull()) && !jsonObj.get("pan_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan_status").toString()));
      }
      if ((jsonObj.get("aadhaar_seeding_status_desc") != null && !jsonObj.get("aadhaar_seeding_status_desc").isJsonNull()) && !jsonObj.get("aadhaar_seeding_status_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aadhaar_seeding_status_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aadhaar_seeding_status_desc").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetVerifyPanResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("pan") != null && !jsonObj.get("pan").isJsonNull()) && !jsonObj.get("pan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("name_provided") != null && !jsonObj.get("name_provided").isJsonNull()) && !jsonObj.get("name_provided").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_provided` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_provided").toString()));
      }
      if ((jsonObj.get("registered_name") != null && !jsonObj.get("registered_name").isJsonNull()) && !jsonObj.get("registered_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registered_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registered_name").toString()));
      }
      if ((jsonObj.get("father_name") != null && !jsonObj.get("father_name").isJsonNull()) && !jsonObj.get("father_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `father_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("father_name").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("name_match_score") != null && !jsonObj.get("name_match_score").isJsonNull()) && !jsonObj.get("name_match_score").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_match_score` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_match_score").toString()));
      }
      if ((jsonObj.get("name_match_result") != null && !jsonObj.get("name_match_result").isJsonNull()) && !jsonObj.get("name_match_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_match_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_match_result").toString()));
      }
      if ((jsonObj.get("aadhaar_seeding_status") != null && !jsonObj.get("aadhaar_seeding_status").isJsonNull()) && !jsonObj.get("aadhaar_seeding_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aadhaar_seeding_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aadhaar_seeding_status").toString()));
      }
      if ((jsonObj.get("last_updated_at") != null && !jsonObj.get("last_updated_at").isJsonNull()) && !jsonObj.get("last_updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_updated_at").toString()));
      }
      if ((jsonObj.get("name_pan_card") != null && !jsonObj.get("name_pan_card").isJsonNull()) && !jsonObj.get("name_pan_card").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_pan_card` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_pan_card").toString()));
      }
      if ((jsonObj.get("pan_status") != null && !jsonObj.get("pan_status").isJsonNull()) && !jsonObj.get("pan_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan_status").toString()));
      }
      if ((jsonObj.get("aadhaar_seeding_status_desc") != null && !jsonObj.get("aadhaar_seeding_status_desc").isJsonNull()) && !jsonObj.get("aadhaar_seeding_status_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aadhaar_seeding_status_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aadhaar_seeding_status_desc").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetVerifyPanResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetVerifyPanResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetVerifyPanResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetVerifyPanResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<GetVerifyPanResponseSchema>() {
           @Override
           public void write(JsonWriter out, GetVerifyPanResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetVerifyPanResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetVerifyPanResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetVerifyPanResponseSchema
  * @throws IOException if the JSON string is invalid with respect to GetVerifyPanResponseSchema
  */
  public static GetVerifyPanResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetVerifyPanResponseSchema.class);
  }

 /**
  * Convert an instance of GetVerifyPanResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

