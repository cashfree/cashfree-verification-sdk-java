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
 * Reverse penny drop verification successful
 */
@Schema(description = "Reverse penny drop verification successful")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T06:30:36.549576Z[Etc/UTC]")
public class GetStatusRpdResponseSchema {
  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private String bankAccount;

  public static final String SERIALIZED_NAME_IFSC = "ifsc";
  @SerializedName(SERIALIZED_NAME_IFSC)
  private String ifsc;

  public static final String SERIALIZED_NAME_UPI = "upi";
  @SerializedName(SERIALIZED_NAME_UPI)
  private String upi;

  public static final String SERIALIZED_NAME_NAME_AT_BANK = "name_at_bank";
  @SerializedName(SERIALIZED_NAME_NAME_AT_BANK)
  private String nameAtBank;

  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public static final String SERIALIZED_NAME_REF_ID = "ref_id";
  @SerializedName(SERIALIZED_NAME_REF_ID)
  private String refId;

  public static final String SERIALIZED_NAME_UTR = "utr";
  @SerializedName(SERIALIZED_NAME_UTR)
  private String utr;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_NAME_MATCH_SCORE = "name_match_score";
  @SerializedName(SERIALIZED_NAME_NAME_MATCH_SCORE)
  private String nameMatchScore;

  public static final String SERIALIZED_NAME_NAME_MATCH_RESULT = "name_match_result";
  @SerializedName(SERIALIZED_NAME_NAME_MATCH_RESULT)
  private String nameMatchResult;

  public static final String SERIALIZED_NAME_ADDED_ON = "added_on";
  @SerializedName(SERIALIZED_NAME_ADDED_ON)
  private String addedOn;

  public static final String SERIALIZED_NAME_PROCESSED_ON = "processed_on";
  @SerializedName(SERIALIZED_NAME_PROCESSED_ON)
  private String processedOn;

  public static final String SERIALIZED_NAME_PENNY_COLLECTED_ON = "penny_collected_on";
  @SerializedName(SERIALIZED_NAME_PENNY_COLLECTED_ON)
  private String pennyCollectedOn;

  public static final String SERIALIZED_NAME_REVERSAL_STATUS = "reversal_status";
  @SerializedName(SERIALIZED_NAME_REVERSAL_STATUS)
  private String reversalStatus;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public GetStatusRpdResponseSchema() {
  }

  public GetStatusRpdResponseSchema bankAccount(String bankAccount) {
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * It displays the bank account number of the individual.
   * @return bankAccount
  **/
  @javax.annotation.Nullable
  @Schema(example = "26291800001191", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the bank account number of the individual.")
  public String getBankAccount() {
    return bankAccount;
  }


  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }


  public GetStatusRpdResponseSchema ifsc(String ifsc) {
    
    this.ifsc = ifsc;
    return this;
  }

   /**
   * It displays the IFSC information of the individual&#39;s bank account.
   * @return ifsc
  **/
  @javax.annotation.Nullable
  @Schema(example = "YESB0000262", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the IFSC information of the individual's bank account.")
  public String getIfsc() {
    return ifsc;
  }


  public void setIfsc(String ifsc) {
    this.ifsc = ifsc;
  }


  public GetStatusRpdResponseSchema upi(String upi) {
    
    this.upi = upi;
    return this;
  }

   /**
   * It displays the UPI VPA information of the individual.
   * @return upi
  **/
  @javax.annotation.Nullable
  @Schema(example = "success@upi", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the UPI VPA information of the individual.")
  public String getUpi() {
    return upi;
  }


  public void setUpi(String upi) {
    this.upi = upi;
  }


  public GetStatusRpdResponseSchema nameAtBank(String nameAtBank) {
    
    this.nameAtBank = nameAtBank;
    return this;
  }

   /**
   * It displays the name of the individual registered in the bank records.
   * @return nameAtBank
  **/
  @javax.annotation.Nullable
  @Schema(example = "JOHN DOE", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the individual registered in the bank records.")
  public String getNameAtBank() {
    return nameAtBank;
  }


  public void setNameAtBank(String nameAtBank) {
    this.nameAtBank = nameAtBank;
  }


  public GetStatusRpdResponseSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It displays the unique ID created by you to identify the verifiation request.
   * @return verificationId
  **/
  @javax.annotation.Nullable
  @Schema(example = "32", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by you to identify the verifiation request.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public GetStatusRpdResponseSchema refId(String refId) {
    
    this.refId = refId;
    return this;
  }

   /**
   * It displays the unique ID created by Cashfree Payments for reference purposes.
   * @return refId
  **/
  @javax.annotation.Nullable
  @Schema(example = "33", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by Cashfree Payments for reference purposes.")
  public String getRefId() {
    return refId;
  }


  public void setRefId(String refId) {
    this.refId = refId;
  }


  public GetStatusRpdResponseSchema utr(String utr) {
    
    this.utr = utr;
    return this;
  }

   /**
   * It displays the unique transaction reference (UTR) number created by the bank to identify the transaction.
   * @return utr
  **/
  @javax.annotation.Nullable
  @Schema(example = "33", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique transaction reference (UTR) number created by the bank to identify the transaction.")
  public String getUtr() {
    return utr;
  }


  public void setUtr(String utr) {
    this.utr = utr;
  }


  public GetStatusRpdResponseSchema status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * It displays the status of the API request.
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(example = "SUCCESS", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the API request.")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public GetStatusRpdResponseSchema nameMatchScore(String nameMatchScore) {
    
    this.nameMatchScore = nameMatchScore;
    return this;
  }

   /**
   * It displays the score of the name match verification.
   * @return nameMatchScore
  **/
  @javax.annotation.Nullable
  @Schema(example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the score of the name match verification.")
  public String getNameMatchScore() {
    return nameMatchScore;
  }


  public void setNameMatchScore(String nameMatchScore) {
    this.nameMatchScore = nameMatchScore;
  }


  public GetStatusRpdResponseSchema nameMatchResult(String nameMatchResult) {
    
    this.nameMatchResult = nameMatchResult;
    return this;
  }

   /**
   * It displays the result of the name match verification.
   * @return nameMatchResult
  **/
  @javax.annotation.Nullable
  @Schema(example = "POOR_PARTIAL_MATCH", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the result of the name match verification.")
  public String getNameMatchResult() {
    return nameMatchResult;
  }


  public void setNameMatchResult(String nameMatchResult) {
    this.nameMatchResult = nameMatchResult;
  }


  public GetStatusRpdResponseSchema addedOn(String addedOn) {
    
    this.addedOn = addedOn;
    return this;
  }

   /**
   * It displays the date and time of when the request was added.
   * @return addedOn
  **/
  @javax.annotation.Nullable
  @Schema(example = "2023-06-27T12:34:47+05:30", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the date and time of when the request was added.")
  public String getAddedOn() {
    return addedOn;
  }


  public void setAddedOn(String addedOn) {
    this.addedOn = addedOn;
  }


  public GetStatusRpdResponseSchema processedOn(String processedOn) {
    
    this.processedOn = processedOn;
    return this;
  }

   /**
   * It displays the date and time of when the request was processed.
   * @return processedOn
  **/
  @javax.annotation.Nullable
  @Schema(example = "2023-06-27T18:15:02+05:30", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the date and time of when the request was processed.")
  public String getProcessedOn() {
    return processedOn;
  }


  public void setProcessedOn(String processedOn) {
    this.processedOn = processedOn;
  }


  public GetStatusRpdResponseSchema pennyCollectedOn(String pennyCollectedOn) {
    
    this.pennyCollectedOn = pennyCollectedOn;
    return this;
  }

   /**
   * It displays the date and time of when the 1 rupee was collected.
   * @return pennyCollectedOn
  **/
  @javax.annotation.Nullable
  @Schema(example = "2022-10-27T12:40:10+05:30", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the date and time of when the 1 rupee was collected.")
  public String getPennyCollectedOn() {
    return pennyCollectedOn;
  }


  public void setPennyCollectedOn(String pennyCollectedOn) {
    this.pennyCollectedOn = pennyCollectedOn;
  }


  public GetStatusRpdResponseSchema reversalStatus(String reversalStatus) {
    
    this.reversalStatus = reversalStatus;
    return this;
  }

   /**
   * It displays the status of the rupee reversal.
   * @return reversalStatus
  **/
  @javax.annotation.Nullable
  @Schema(example = "PENDING", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the rupee reversal.")
  public String getReversalStatus() {
    return reversalStatus;
  }


  public void setReversalStatus(String reversalStatus) {
    this.reversalStatus = reversalStatus;
  }


  public GetStatusRpdResponseSchema accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * It displays the type of account.
   * @return accountType
  **/
  @javax.annotation.Nullable
  @Schema(example = "SAVINGS", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the type of account.")
  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatusRpdResponseSchema getStatusRpdResponseSchema = (GetStatusRpdResponseSchema) o;
    return Objects.equals(this.bankAccount, getStatusRpdResponseSchema.bankAccount) &&
        Objects.equals(this.ifsc, getStatusRpdResponseSchema.ifsc) &&
        Objects.equals(this.upi, getStatusRpdResponseSchema.upi) &&
        Objects.equals(this.nameAtBank, getStatusRpdResponseSchema.nameAtBank) &&
        Objects.equals(this.verificationId, getStatusRpdResponseSchema.verificationId) &&
        Objects.equals(this.refId, getStatusRpdResponseSchema.refId) &&
        Objects.equals(this.utr, getStatusRpdResponseSchema.utr) &&
        Objects.equals(this.status, getStatusRpdResponseSchema.status) &&
        Objects.equals(this.nameMatchScore, getStatusRpdResponseSchema.nameMatchScore) &&
        Objects.equals(this.nameMatchResult, getStatusRpdResponseSchema.nameMatchResult) &&
        Objects.equals(this.addedOn, getStatusRpdResponseSchema.addedOn) &&
        Objects.equals(this.processedOn, getStatusRpdResponseSchema.processedOn) &&
        Objects.equals(this.pennyCollectedOn, getStatusRpdResponseSchema.pennyCollectedOn) &&
        Objects.equals(this.reversalStatus, getStatusRpdResponseSchema.reversalStatus) &&
        Objects.equals(this.accountType, getStatusRpdResponseSchema.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccount, ifsc, upi, nameAtBank, verificationId, refId, utr, status, nameMatchScore, nameMatchResult, addedOn, processedOn, pennyCollectedOn, reversalStatus, accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatusRpdResponseSchema {\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    ifsc: ").append(toIndentedString(ifsc)).append("\n");
    sb.append("    upi: ").append(toIndentedString(upi)).append("\n");
    sb.append("    nameAtBank: ").append(toIndentedString(nameAtBank)).append("\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
    sb.append("    utr: ").append(toIndentedString(utr)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    nameMatchScore: ").append(toIndentedString(nameMatchScore)).append("\n");
    sb.append("    nameMatchResult: ").append(toIndentedString(nameMatchResult)).append("\n");
    sb.append("    addedOn: ").append(toIndentedString(addedOn)).append("\n");
    sb.append("    processedOn: ").append(toIndentedString(processedOn)).append("\n");
    sb.append("    pennyCollectedOn: ").append(toIndentedString(pennyCollectedOn)).append("\n");
    sb.append("    reversalStatus: ").append(toIndentedString(reversalStatus)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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
    openapiFields.add("bank_account");
    openapiFields.add("ifsc");
    openapiFields.add("upi");
    openapiFields.add("name_at_bank");
    openapiFields.add("verification_id");
    openapiFields.add("ref_id");
    openapiFields.add("utr");
    openapiFields.add("status");
    openapiFields.add("name_match_score");
    openapiFields.add("name_match_result");
    openapiFields.add("added_on");
    openapiFields.add("processed_on");
    openapiFields.add("penny_collected_on");
    openapiFields.add("reversal_status");
    openapiFields.add("account_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetStatusRpdResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bank_account") != null && !jsonObj.get("bank_account").isJsonNull()) && !jsonObj.get("bank_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_account").toString()));
      }
      if ((jsonObj.get("ifsc") != null && !jsonObj.get("ifsc").isJsonNull()) && !jsonObj.get("ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ifsc").toString()));
      }
      if ((jsonObj.get("upi") != null && !jsonObj.get("upi").isJsonNull()) && !jsonObj.get("upi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upi").toString()));
      }
      if ((jsonObj.get("name_at_bank") != null && !jsonObj.get("name_at_bank").isJsonNull()) && !jsonObj.get("name_at_bank").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_at_bank` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_at_bank").toString()));
      }
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("ref_id") != null && !jsonObj.get("ref_id").isJsonNull()) && !jsonObj.get("ref_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref_id").toString()));
      }
      if ((jsonObj.get("utr") != null && !jsonObj.get("utr").isJsonNull()) && !jsonObj.get("utr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `utr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("utr").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("name_match_score") != null && !jsonObj.get("name_match_score").isJsonNull()) && !jsonObj.get("name_match_score").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_match_score` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_match_score").toString()));
      }
      if ((jsonObj.get("name_match_result") != null && !jsonObj.get("name_match_result").isJsonNull()) && !jsonObj.get("name_match_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_match_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_match_result").toString()));
      }
      if ((jsonObj.get("added_on") != null && !jsonObj.get("added_on").isJsonNull()) && !jsonObj.get("added_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_on").toString()));
      }
      if ((jsonObj.get("processed_on") != null && !jsonObj.get("processed_on").isJsonNull()) && !jsonObj.get("processed_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processed_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processed_on").toString()));
      }
      if ((jsonObj.get("penny_collected_on") != null && !jsonObj.get("penny_collected_on").isJsonNull()) && !jsonObj.get("penny_collected_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `penny_collected_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("penny_collected_on").toString()));
      }
      if ((jsonObj.get("reversal_status") != null && !jsonObj.get("reversal_status").isJsonNull()) && !jsonObj.get("reversal_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reversal_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reversal_status").toString()));
      }
      if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetStatusRpdResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bank_account") != null && !jsonObj.get("bank_account").isJsonNull()) && !jsonObj.get("bank_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_account").toString()));
      }
      if ((jsonObj.get("ifsc") != null && !jsonObj.get("ifsc").isJsonNull()) && !jsonObj.get("ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ifsc").toString()));
      }
      if ((jsonObj.get("upi") != null && !jsonObj.get("upi").isJsonNull()) && !jsonObj.get("upi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upi").toString()));
      }
      if ((jsonObj.get("name_at_bank") != null && !jsonObj.get("name_at_bank").isJsonNull()) && !jsonObj.get("name_at_bank").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_at_bank` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_at_bank").toString()));
      }
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("ref_id") != null && !jsonObj.get("ref_id").isJsonNull()) && !jsonObj.get("ref_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref_id").toString()));
      }
      if ((jsonObj.get("utr") != null && !jsonObj.get("utr").isJsonNull()) && !jsonObj.get("utr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `utr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("utr").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("name_match_score") != null && !jsonObj.get("name_match_score").isJsonNull()) && !jsonObj.get("name_match_score").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_match_score` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_match_score").toString()));
      }
      if ((jsonObj.get("name_match_result") != null && !jsonObj.get("name_match_result").isJsonNull()) && !jsonObj.get("name_match_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_match_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_match_result").toString()));
      }
      if ((jsonObj.get("added_on") != null && !jsonObj.get("added_on").isJsonNull()) && !jsonObj.get("added_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_on").toString()));
      }
      if ((jsonObj.get("processed_on") != null && !jsonObj.get("processed_on").isJsonNull()) && !jsonObj.get("processed_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processed_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processed_on").toString()));
      }
      if ((jsonObj.get("penny_collected_on") != null && !jsonObj.get("penny_collected_on").isJsonNull()) && !jsonObj.get("penny_collected_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `penny_collected_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("penny_collected_on").toString()));
      }
      if ((jsonObj.get("reversal_status") != null && !jsonObj.get("reversal_status").isJsonNull()) && !jsonObj.get("reversal_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reversal_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reversal_status").toString()));
      }
      if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetStatusRpdResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetStatusRpdResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetStatusRpdResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetStatusRpdResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<GetStatusRpdResponseSchema>() {
           @Override
           public void write(JsonWriter out, GetStatusRpdResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetStatusRpdResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetStatusRpdResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetStatusRpdResponseSchema
  * @throws IOException if the JSON string is invalid with respect to GetStatusRpdResponseSchema
  */
  public static GetStatusRpdResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetStatusRpdResponseSchema.class);
  }

 /**
  * Convert an instance of GetStatusRpdResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

