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
import java.math.BigDecimal;
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
 * It contains the employement details of the individual.
 */
@Schema(description = "It contains the employement details of the individual.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-21T07:15:37.235803Z[Etc/UTC]")
public class AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails {
  public static final String SERIALIZED_NAME_MEMBER_ID = "member_id";
  @SerializedName(SERIALIZED_NAME_MEMBER_ID)
  private String memberId;

  public static final String SERIALIZED_NAME_ESTABLISHMENT_ID = "establishment_id";
  @SerializedName(SERIALIZED_NAME_ESTABLISHMENT_ID)
  private String establishmentId;

  public static final String SERIALIZED_NAME_EXIT_DATE = "exit_date";
  @SerializedName(SERIALIZED_NAME_EXIT_DATE)
  private String exitDate;

  public static final String SERIALIZED_NAME_JOINING_DATE = "joining_date";
  @SerializedName(SERIALIZED_NAME_JOINING_DATE)
  private String joiningDate;

  public static final String SERIALIZED_NAME_LEAVE_REASON = "leave_reason";
  @SerializedName(SERIALIZED_NAME_LEAVE_REASON)
  private String leaveReason;

  public static final String SERIALIZED_NAME_ESTABLISHMENT_NAME = "establishment_name";
  @SerializedName(SERIALIZED_NAME_ESTABLISHMENT_NAME)
  private String establishmentName;

  public static final String SERIALIZED_NAME_EMPLOYER_CONFIDENCE_SCORE = "employer_confidence_score";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_CONFIDENCE_SCORE)
  private BigDecimal employerConfidenceScore;

  public AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails() {
  }

  public AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails memberId(String memberId) {
    
    this.memberId = memberId;
    return this;
  }

   /**
   * It displays the unique ID assigned to an individual.
   * @return memberId
  **/
  @javax.annotation.Nullable
  @Schema(example = "MHBAN12342200000012345", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID assigned to an individual.")
  public String getMemberId() {
    return memberId;
  }


  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }


  public AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails establishmentId(String establishmentId) {
    
    this.establishmentId = establishmentId;
    return this;
  }

   /**
   * It displays the unique ID assigned to a specific establishment or business entity.
   * @return establishmentId
  **/
  @javax.annotation.Nullable
  @Schema(example = "MHBAN1234220000", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID assigned to a specific establishment or business entity.")
  public String getEstablishmentId() {
    return establishmentId;
  }


  public void setEstablishmentId(String establishmentId) {
    this.establishmentId = establishmentId;
  }


  public AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails exitDate(String exitDate) {
    
    this.exitDate = exitDate;
    return this;
  }

   /**
   * It displays the last working day of the employee in the organisation.
   * @return exitDate
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the last working day of the employee in the organisation.")
  public String getExitDate() {
    return exitDate;
  }


  public void setExitDate(String exitDate) {
    this.exitDate = exitDate;
  }


  public AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails joiningDate(String joiningDate) {
    
    this.joiningDate = joiningDate;
    return this;
  }

   /**
   * It displays the first working day of the employee in the organisation.
   * @return joiningDate
  **/
  @javax.annotation.Nullable
  @Schema(example = "2020-02-21", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the first working day of the employee in the organisation.")
  public String getJoiningDate() {
    return joiningDate;
  }


  public void setJoiningDate(String joiningDate) {
    this.joiningDate = joiningDate;
  }


  public AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails leaveReason(String leaveReason) {
    
    this.leaveReason = leaveReason;
    return this;
  }

   /**
   * It displays the reason for leaving the previous job.
   * @return leaveReason
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the reason for leaving the previous job.")
  public String getLeaveReason() {
    return leaveReason;
  }


  public void setLeaveReason(String leaveReason) {
    this.leaveReason = leaveReason;
  }


  public AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails establishmentName(String establishmentName) {
    
    this.establishmentName = establishmentName;
    return this;
  }

   /**
   * It displays the name of the organisation.
   * @return establishmentName
  **/
  @javax.annotation.Nullable
  @Schema(example = "Cashfree India Private Ltd", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the organisation.")
  public String getEstablishmentName() {
    return establishmentName;
  }


  public void setEstablishmentName(String establishmentName) {
    this.establishmentName = establishmentName;
  }


  public AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails employerConfidenceScore(BigDecimal employerConfidenceScore) {
    
    this.employerConfidenceScore = employerConfidenceScore;
    return this;
  }

   /**
   * It displays the
   * @return employerConfidenceScore
  **/
  @javax.annotation.Nullable
  @Schema(example = "0.1", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the")
  public BigDecimal getEmployerConfidenceScore() {
    return employerConfidenceScore;
  }


  public void setEmployerConfidenceScore(BigDecimal employerConfidenceScore) {
    this.employerConfidenceScore = employerConfidenceScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails advanceEmploymentResponseUanDetailsInnerEmploymentDetails = (AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails) o;
    return Objects.equals(this.memberId, advanceEmploymentResponseUanDetailsInnerEmploymentDetails.memberId) &&
        Objects.equals(this.establishmentId, advanceEmploymentResponseUanDetailsInnerEmploymentDetails.establishmentId) &&
        Objects.equals(this.exitDate, advanceEmploymentResponseUanDetailsInnerEmploymentDetails.exitDate) &&
        Objects.equals(this.joiningDate, advanceEmploymentResponseUanDetailsInnerEmploymentDetails.joiningDate) &&
        Objects.equals(this.leaveReason, advanceEmploymentResponseUanDetailsInnerEmploymentDetails.leaveReason) &&
        Objects.equals(this.establishmentName, advanceEmploymentResponseUanDetailsInnerEmploymentDetails.establishmentName) &&
        Objects.equals(this.employerConfidenceScore, advanceEmploymentResponseUanDetailsInnerEmploymentDetails.employerConfidenceScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, establishmentId, exitDate, joiningDate, leaveReason, establishmentName, employerConfidenceScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails {\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    establishmentId: ").append(toIndentedString(establishmentId)).append("\n");
    sb.append("    exitDate: ").append(toIndentedString(exitDate)).append("\n");
    sb.append("    joiningDate: ").append(toIndentedString(joiningDate)).append("\n");
    sb.append("    leaveReason: ").append(toIndentedString(leaveReason)).append("\n");
    sb.append("    establishmentName: ").append(toIndentedString(establishmentName)).append("\n");
    sb.append("    employerConfidenceScore: ").append(toIndentedString(employerConfidenceScore)).append("\n");
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
    openapiFields.add("member_id");
    openapiFields.add("establishment_id");
    openapiFields.add("exit_date");
    openapiFields.add("joining_date");
    openapiFields.add("leave_reason");
    openapiFields.add("establishment_name");
    openapiFields.add("employer_confidence_score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("member_id") != null && !jsonObj.get("member_id").isJsonNull()) && !jsonObj.get("member_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_id").toString()));
      }
      if ((jsonObj.get("establishment_id") != null && !jsonObj.get("establishment_id").isJsonNull()) && !jsonObj.get("establishment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `establishment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("establishment_id").toString()));
      }
      if ((jsonObj.get("exit_date") != null && !jsonObj.get("exit_date").isJsonNull()) && !jsonObj.get("exit_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exit_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exit_date").toString()));
      }
      if ((jsonObj.get("joining_date") != null && !jsonObj.get("joining_date").isJsonNull()) && !jsonObj.get("joining_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `joining_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("joining_date").toString()));
      }
      if ((jsonObj.get("leave_reason") != null && !jsonObj.get("leave_reason").isJsonNull()) && !jsonObj.get("leave_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leave_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leave_reason").toString()));
      }
      if ((jsonObj.get("establishment_name") != null && !jsonObj.get("establishment_name").isJsonNull()) && !jsonObj.get("establishment_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `establishment_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("establishment_name").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("member_id") != null && !jsonObj.get("member_id").isJsonNull()) && !jsonObj.get("member_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_id").toString()));
      }
      if ((jsonObj.get("establishment_id") != null && !jsonObj.get("establishment_id").isJsonNull()) && !jsonObj.get("establishment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `establishment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("establishment_id").toString()));
      }
      if ((jsonObj.get("exit_date") != null && !jsonObj.get("exit_date").isJsonNull()) && !jsonObj.get("exit_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exit_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exit_date").toString()));
      }
      if ((jsonObj.get("joining_date") != null && !jsonObj.get("joining_date").isJsonNull()) && !jsonObj.get("joining_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `joining_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("joining_date").toString()));
      }
      if ((jsonObj.get("leave_reason") != null && !jsonObj.get("leave_reason").isJsonNull()) && !jsonObj.get("leave_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leave_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leave_reason").toString()));
      }
      if ((jsonObj.get("establishment_name") != null && !jsonObj.get("establishment_name").isJsonNull()) && !jsonObj.get("establishment_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `establishment_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("establishment_name").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails>() {
           @Override
           public void write(JsonWriter out, AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails
  * @throws IOException if the JSON string is invalid with respect to AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails
  */
  public static AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails.class);
  }

 /**
  * Convert an instance of AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

