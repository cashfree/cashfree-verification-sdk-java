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
import com.cashfree.model.GstinResponseSchemaAdditionalAddressArrayInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Success response for Verify GSTIN
 */
@Schema(description = "Success response for Verify GSTIN")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-08T05:03:36.102379Z[Etc/UTC]")
public class GstinResponseSchema {
  public static final String SERIALIZED_NAME_G_S_T_I_N = "GSTIN";
  @SerializedName(SERIALIZED_NAME_G_S_T_I_N)
  private String GSTIN;

  public static final String SERIALIZED_NAME_ADDITIONAL_ADDRESS_ARRAY = "additional_address_array";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ADDRESS_ARRAY)
  private List<GstinResponseSchemaAdditionalAddressArrayInner> additionalAddressArray;

  public static final String SERIALIZED_NAME_CANCELLATION_DATE = "cancellation_date";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_DATE)
  private String cancellationDate;

  public static final String SERIALIZED_NAME_CENTER_JURISDICTION = "center_jurisdiction";
  @SerializedName(SERIALIZED_NAME_CENTER_JURISDICTION)
  private String centerJurisdiction;

  public static final String SERIALIZED_NAME_CONSTITUTION_OF_BUSINESS = "constitution_of_business";
  @SerializedName(SERIALIZED_NAME_CONSTITUTION_OF_BUSINESS)
  private String constitutionOfBusiness;

  public static final String SERIALIZED_NAME_DATE_OF_REGISTRATION = "date_of_registration";
  @SerializedName(SERIALIZED_NAME_DATE_OF_REGISTRATION)
  private String dateOfRegistration;

  public static final String SERIALIZED_NAME_GST_IN_STATUS = "gst_in_status";
  @SerializedName(SERIALIZED_NAME_GST_IN_STATUS)
  private String gstInStatus;

  public static final String SERIALIZED_NAME_LAST_UPDATE_DATE = "last_update_date";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE_DATE)
  private String lastUpdateDate;

  public static final String SERIALIZED_NAME_LEGAL_NAME_OF_BUSINESS = "legal_name_of_business";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME_OF_BUSINESS)
  private String legalNameOfBusiness;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NATURE_OF_BUSINESS_ACTIVITIES = "nature_of_business_activities";
  @SerializedName(SERIALIZED_NAME_NATURE_OF_BUSINESS_ACTIVITIES)
  private List<String> natureOfBusinessActivities;

  public static final String SERIALIZED_NAME_PRINCIPAL_PLACE_ADDRESS = "principal_place_address";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_PLACE_ADDRESS)
  private String principalPlaceAddress;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private Long referenceId;

  public static final String SERIALIZED_NAME_STATE_JURISDICTION = "state_jurisdiction";
  @SerializedName(SERIALIZED_NAME_STATE_JURISDICTION)
  private String stateJurisdiction;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private String statusCode;

  public static final String SERIALIZED_NAME_TAXPAYER_TYPE = "taxpayer_type";
  @SerializedName(SERIALIZED_NAME_TAXPAYER_TYPE)
  private String taxpayerType;

  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public GstinResponseSchema() {
  }

  public GstinResponseSchema GSTIN(String GSTIN) {
    
    this.GSTIN = GSTIN;
    return this;
  }

   /**
   * It displays the unique identification number assigned to business registered under the Goods and Services Tax (GST) system in India.\&quot;
   * @return GSTIN
  **/
  @javax.annotation.Nullable
  @Schema(example = "22ABCDE1234F1Z5", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique identification number assigned to business registered under the Goods and Services Tax (GST) system in India.\"")
  public String getGSTIN() {
    return GSTIN;
  }


  public void setGSTIN(String GSTIN) {
    this.GSTIN = GSTIN;
  }


  public GstinResponseSchema additionalAddressArray(List<GstinResponseSchemaAdditionalAddressArrayInner> additionalAddressArray) {
    
    this.additionalAddressArray = additionalAddressArray;
    return this;
  }

  public GstinResponseSchema addAdditionalAddressArrayItem(GstinResponseSchemaAdditionalAddressArrayInner additionalAddressArrayItem) {
    if (this.additionalAddressArray == null) {
      this.additionalAddressArray = new ArrayList<>();
    }
    this.additionalAddressArray.add(additionalAddressArrayItem);
    return this;
  }

   /**
   * Get additionalAddressArray
   * @return additionalAddressArray
  **/
  @javax.annotation.Nullable
  @Schema(example = "{\"address\":\"Koramangala\"}", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<GstinResponseSchemaAdditionalAddressArrayInner> getAdditionalAddressArray() {
    return additionalAddressArray;
  }


  public void setAdditionalAddressArray(List<GstinResponseSchemaAdditionalAddressArrayInner> additionalAddressArray) {
    this.additionalAddressArray = additionalAddressArray;
  }


  public GstinResponseSchema cancellationDate(String cancellationDate) {
    
    this.cancellationDate = cancellationDate;
    return this;
  }

   /**
   * Get cancellationDate
   * @return cancellationDate
  **/
  @javax.annotation.Nullable
  @Schema(example = "2021-12-14", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCancellationDate() {
    return cancellationDate;
  }


  public void setCancellationDate(String cancellationDate) {
    this.cancellationDate = cancellationDate;
  }


  public GstinResponseSchema centerJurisdiction(String centerJurisdiction) {
    
    this.centerJurisdiction = centerJurisdiction;
    return this;
  }

   /**
   * Get centerJurisdiction
   * @return centerJurisdiction
  **/
  @javax.annotation.Nullable
  @Schema(example = "RANGE - 21", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCenterJurisdiction() {
    return centerJurisdiction;
  }


  public void setCenterJurisdiction(String centerJurisdiction) {
    this.centerJurisdiction = centerJurisdiction;
  }


  public GstinResponseSchema constitutionOfBusiness(String constitutionOfBusiness) {
    
    this.constitutionOfBusiness = constitutionOfBusiness;
    return this;
  }

   /**
   * Get constitutionOfBusiness
   * @return constitutionOfBusiness
  **/
  @javax.annotation.Nullable
  @Schema(example = "Private Limited", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getConstitutionOfBusiness() {
    return constitutionOfBusiness;
  }


  public void setConstitutionOfBusiness(String constitutionOfBusiness) {
    this.constitutionOfBusiness = constitutionOfBusiness;
  }


  public GstinResponseSchema dateOfRegistration(String dateOfRegistration) {
    
    this.dateOfRegistration = dateOfRegistration;
    return this;
  }

   /**
   * Get dateOfRegistration
   * @return dateOfRegistration
  **/
  @javax.annotation.Nullable
  @Schema(example = "2021-06-01", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getDateOfRegistration() {
    return dateOfRegistration;
  }


  public void setDateOfRegistration(String dateOfRegistration) {
    this.dateOfRegistration = dateOfRegistration;
  }


  public GstinResponseSchema gstInStatus(String gstInStatus) {
    
    this.gstInStatus = gstInStatus;
    return this;
  }

   /**
   * Get gstInStatus
   * @return gstInStatus
  **/
  @javax.annotation.Nullable
  @Schema(example = "Active", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getGstInStatus() {
    return gstInStatus;
  }


  public void setGstInStatus(String gstInStatus) {
    this.gstInStatus = gstInStatus;
  }


  public GstinResponseSchema lastUpdateDate(String lastUpdateDate) {
    
    this.lastUpdateDate = lastUpdateDate;
    return this;
  }

   /**
   * Get lastUpdateDate
   * @return lastUpdateDate
  **/
  @javax.annotation.Nullable
  @Schema(example = "2021-06-18", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getLastUpdateDate() {
    return lastUpdateDate;
  }


  public void setLastUpdateDate(String lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }


  public GstinResponseSchema legalNameOfBusiness(String legalNameOfBusiness) {
    
    this.legalNameOfBusiness = legalNameOfBusiness;
    return this;
  }

   /**
   * Get legalNameOfBusiness
   * @return legalNameOfBusiness
  **/
  @javax.annotation.Nullable
  @Schema(example = "ABC PVT LTD.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getLegalNameOfBusiness() {
    return legalNameOfBusiness;
  }


  public void setLegalNameOfBusiness(String legalNameOfBusiness) {
    this.legalNameOfBusiness = legalNameOfBusiness;
  }


  public GstinResponseSchema message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @Schema(example = "GSTINExist", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public GstinResponseSchema natureOfBusinessActivities(List<String> natureOfBusinessActivities) {
    
    this.natureOfBusinessActivities = natureOfBusinessActivities;
    return this;
  }

  public GstinResponseSchema addNatureOfBusinessActivitiesItem(String natureOfBusinessActivitiesItem) {
    if (this.natureOfBusinessActivities == null) {
      this.natureOfBusinessActivities = new ArrayList<>();
    }
    this.natureOfBusinessActivities.add(natureOfBusinessActivitiesItem);
    return this;
  }

   /**
   * Get natureOfBusinessActivities
   * @return natureOfBusinessActivities
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<String> getNatureOfBusinessActivities() {
    return natureOfBusinessActivities;
  }


  public void setNatureOfBusinessActivities(List<String> natureOfBusinessActivities) {
    this.natureOfBusinessActivities = natureOfBusinessActivities;
  }


  public GstinResponseSchema principalPlaceAddress(String principalPlaceAddress) {
    
    this.principalPlaceAddress = principalPlaceAddress;
    return this;
  }

   /**
   * Get principalPlaceAddress
   * @return principalPlaceAddress
  **/
  @javax.annotation.Nullable
  @Schema(example = "NO 1A, PUNE, Maharashtra, 411006", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getPrincipalPlaceAddress() {
    return principalPlaceAddress;
  }


  public void setPrincipalPlaceAddress(String principalPlaceAddress) {
    this.principalPlaceAddress = principalPlaceAddress;
  }


  public GstinResponseSchema referenceId(Long referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Get referenceId
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @Schema(example = "12345", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Long getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(Long referenceId) {
    this.referenceId = referenceId;
  }


  public GstinResponseSchema stateJurisdiction(String stateJurisdiction) {
    
    this.stateJurisdiction = stateJurisdiction;
    return this;
  }

   /**
   * Get stateJurisdiction
   * @return stateJurisdiction
  **/
  @javax.annotation.Nullable
  @Schema(example = "Ward 9", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getStateJurisdiction() {
    return stateJurisdiction;
  }


  public void setStateJurisdiction(String stateJurisdiction) {
    this.stateJurisdiction = stateJurisdiction;
  }


  public GstinResponseSchema statusCode(String statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @Schema(example = "22ABCDE1234F1Z5", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  public GstinResponseSchema taxpayerType(String taxpayerType) {
    
    this.taxpayerType = taxpayerType;
    return this;
  }

   /**
   * Get taxpayerType
   * @return taxpayerType
  **/
  @javax.annotation.Nullable
  @Schema(example = "Regular", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTaxpayerType() {
    return taxpayerType;
  }


  public void setTaxpayerType(String taxpayerType) {
    this.taxpayerType = taxpayerType;
  }


  public GstinResponseSchema valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @javax.annotation.Nullable
  @Schema(example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GstinResponseSchema gstinResponseSchema = (GstinResponseSchema) o;
    return Objects.equals(this.GSTIN, gstinResponseSchema.GSTIN) &&
        Objects.equals(this.additionalAddressArray, gstinResponseSchema.additionalAddressArray) &&
        Objects.equals(this.cancellationDate, gstinResponseSchema.cancellationDate) &&
        Objects.equals(this.centerJurisdiction, gstinResponseSchema.centerJurisdiction) &&
        Objects.equals(this.constitutionOfBusiness, gstinResponseSchema.constitutionOfBusiness) &&
        Objects.equals(this.dateOfRegistration, gstinResponseSchema.dateOfRegistration) &&
        Objects.equals(this.gstInStatus, gstinResponseSchema.gstInStatus) &&
        Objects.equals(this.lastUpdateDate, gstinResponseSchema.lastUpdateDate) &&
        Objects.equals(this.legalNameOfBusiness, gstinResponseSchema.legalNameOfBusiness) &&
        Objects.equals(this.message, gstinResponseSchema.message) &&
        Objects.equals(this.natureOfBusinessActivities, gstinResponseSchema.natureOfBusinessActivities) &&
        Objects.equals(this.principalPlaceAddress, gstinResponseSchema.principalPlaceAddress) &&
        Objects.equals(this.referenceId, gstinResponseSchema.referenceId) &&
        Objects.equals(this.stateJurisdiction, gstinResponseSchema.stateJurisdiction) &&
        Objects.equals(this.statusCode, gstinResponseSchema.statusCode) &&
        Objects.equals(this.taxpayerType, gstinResponseSchema.taxpayerType) &&
        Objects.equals(this.valid, gstinResponseSchema.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GSTIN, additionalAddressArray, cancellationDate, centerJurisdiction, constitutionOfBusiness, dateOfRegistration, gstInStatus, lastUpdateDate, legalNameOfBusiness, message, natureOfBusinessActivities, principalPlaceAddress, referenceId, stateJurisdiction, statusCode, taxpayerType, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GstinResponseSchema {\n");
    sb.append("    GSTIN: ").append(toIndentedString(GSTIN)).append("\n");
    sb.append("    additionalAddressArray: ").append(toIndentedString(additionalAddressArray)).append("\n");
    sb.append("    cancellationDate: ").append(toIndentedString(cancellationDate)).append("\n");
    sb.append("    centerJurisdiction: ").append(toIndentedString(centerJurisdiction)).append("\n");
    sb.append("    constitutionOfBusiness: ").append(toIndentedString(constitutionOfBusiness)).append("\n");
    sb.append("    dateOfRegistration: ").append(toIndentedString(dateOfRegistration)).append("\n");
    sb.append("    gstInStatus: ").append(toIndentedString(gstInStatus)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
    sb.append("    legalNameOfBusiness: ").append(toIndentedString(legalNameOfBusiness)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    natureOfBusinessActivities: ").append(toIndentedString(natureOfBusinessActivities)).append("\n");
    sb.append("    principalPlaceAddress: ").append(toIndentedString(principalPlaceAddress)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    stateJurisdiction: ").append(toIndentedString(stateJurisdiction)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    taxpayerType: ").append(toIndentedString(taxpayerType)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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
    openapiFields.add("GSTIN");
    openapiFields.add("additional_address_array");
    openapiFields.add("cancellation_date");
    openapiFields.add("center_jurisdiction");
    openapiFields.add("constitution_of_business");
    openapiFields.add("date_of_registration");
    openapiFields.add("gst_in_status");
    openapiFields.add("last_update_date");
    openapiFields.add("legal_name_of_business");
    openapiFields.add("message");
    openapiFields.add("nature_of_business_activities");
    openapiFields.add("principal_place_address");
    openapiFields.add("reference_id");
    openapiFields.add("state_jurisdiction");
    openapiFields.add("status_code");
    openapiFields.add("taxpayer_type");
    openapiFields.add("valid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GstinResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("GSTIN") != null && !jsonObj.get("GSTIN").isJsonNull()) && !jsonObj.get("GSTIN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GSTIN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GSTIN").toString()));
      }
      if (jsonObj.get("additional_address_array") != null && !jsonObj.get("additional_address_array").isJsonNull()) {
        JsonArray jsonArrayadditionalAddressArray = jsonObj.getAsJsonArray("additional_address_array");
        if (jsonArrayadditionalAddressArray != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additional_address_array").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additional_address_array` to be an array in the JSON string but got `%s`", jsonObj.get("additional_address_array").toString()));
          }

          // validate the optional field `additional_address_array` (array)
          for (int i = 0; i < jsonArrayadditionalAddressArray.size(); i++) {
            GstinResponseSchemaAdditionalAddressArrayInner.validateJsonElement(jsonArrayadditionalAddressArray.get(i));
          };
        }
      }
      if ((jsonObj.get("cancellation_date") != null && !jsonObj.get("cancellation_date").isJsonNull()) && !jsonObj.get("cancellation_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancellation_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancellation_date").toString()));
      }
      if ((jsonObj.get("center_jurisdiction") != null && !jsonObj.get("center_jurisdiction").isJsonNull()) && !jsonObj.get("center_jurisdiction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `center_jurisdiction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("center_jurisdiction").toString()));
      }
      if ((jsonObj.get("constitution_of_business") != null && !jsonObj.get("constitution_of_business").isJsonNull()) && !jsonObj.get("constitution_of_business").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `constitution_of_business` to be a primitive type in the JSON string but got `%s`", jsonObj.get("constitution_of_business").toString()));
      }
      if ((jsonObj.get("date_of_registration") != null && !jsonObj.get("date_of_registration").isJsonNull()) && !jsonObj.get("date_of_registration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_of_registration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_of_registration").toString()));
      }
      if ((jsonObj.get("gst_in_status") != null && !jsonObj.get("gst_in_status").isJsonNull()) && !jsonObj.get("gst_in_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gst_in_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gst_in_status").toString()));
      }
      if ((jsonObj.get("last_update_date") != null && !jsonObj.get("last_update_date").isJsonNull()) && !jsonObj.get("last_update_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_update_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_update_date").toString()));
      }
      if ((jsonObj.get("legal_name_of_business") != null && !jsonObj.get("legal_name_of_business").isJsonNull()) && !jsonObj.get("legal_name_of_business").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_name_of_business` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_name_of_business").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("nature_of_business_activities") != null && !jsonObj.get("nature_of_business_activities").isJsonNull() && !jsonObj.get("nature_of_business_activities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nature_of_business_activities` to be an array in the JSON string but got `%s`", jsonObj.get("nature_of_business_activities").toString()));
      }
      if ((jsonObj.get("principal_place_address") != null && !jsonObj.get("principal_place_address").isJsonNull()) && !jsonObj.get("principal_place_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `principal_place_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("principal_place_address").toString()));
      }
      if ((jsonObj.get("state_jurisdiction") != null && !jsonObj.get("state_jurisdiction").isJsonNull()) && !jsonObj.get("state_jurisdiction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_jurisdiction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_jurisdiction").toString()));
      }
      if ((jsonObj.get("status_code") != null && !jsonObj.get("status_code").isJsonNull()) && !jsonObj.get("status_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_code").toString()));
      }
      if ((jsonObj.get("taxpayer_type") != null && !jsonObj.get("taxpayer_type").isJsonNull()) && !jsonObj.get("taxpayer_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxpayer_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxpayer_type").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GstinResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("GSTIN") != null && !jsonObj.get("GSTIN").isJsonNull()) && !jsonObj.get("GSTIN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GSTIN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GSTIN").toString()));
      }
      if (jsonObj.get("additional_address_array") != null && !jsonObj.get("additional_address_array").isJsonNull()) {
        JsonArray jsonArrayadditionalAddressArray = jsonObj.getAsJsonArray("additional_address_array");
        if (jsonArrayadditionalAddressArray != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additional_address_array").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additional_address_array` to be an array in the JSON string but got `%s`", jsonObj.get("additional_address_array").toString()));
          }

          // validate the optional field `additional_address_array` (array)
          for (int i = 0; i < jsonArrayadditionalAddressArray.size(); i++) {
            GstinResponseSchemaAdditionalAddressArrayInner.validateJsonElement(jsonArrayadditionalAddressArray.get(i));
          };
        }
      }
      if ((jsonObj.get("cancellation_date") != null && !jsonObj.get("cancellation_date").isJsonNull()) && !jsonObj.get("cancellation_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancellation_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancellation_date").toString()));
      }
      if ((jsonObj.get("center_jurisdiction") != null && !jsonObj.get("center_jurisdiction").isJsonNull()) && !jsonObj.get("center_jurisdiction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `center_jurisdiction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("center_jurisdiction").toString()));
      }
      if ((jsonObj.get("constitution_of_business") != null && !jsonObj.get("constitution_of_business").isJsonNull()) && !jsonObj.get("constitution_of_business").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `constitution_of_business` to be a primitive type in the JSON string but got `%s`", jsonObj.get("constitution_of_business").toString()));
      }
      if ((jsonObj.get("date_of_registration") != null && !jsonObj.get("date_of_registration").isJsonNull()) && !jsonObj.get("date_of_registration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_of_registration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_of_registration").toString()));
      }
      if ((jsonObj.get("gst_in_status") != null && !jsonObj.get("gst_in_status").isJsonNull()) && !jsonObj.get("gst_in_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gst_in_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gst_in_status").toString()));
      }
      if ((jsonObj.get("last_update_date") != null && !jsonObj.get("last_update_date").isJsonNull()) && !jsonObj.get("last_update_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_update_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_update_date").toString()));
      }
      if ((jsonObj.get("legal_name_of_business") != null && !jsonObj.get("legal_name_of_business").isJsonNull()) && !jsonObj.get("legal_name_of_business").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_name_of_business` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_name_of_business").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("nature_of_business_activities") != null && !jsonObj.get("nature_of_business_activities").isJsonNull() && !jsonObj.get("nature_of_business_activities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nature_of_business_activities` to be an array in the JSON string but got `%s`", jsonObj.get("nature_of_business_activities").toString()));
      }
      if ((jsonObj.get("principal_place_address") != null && !jsonObj.get("principal_place_address").isJsonNull()) && !jsonObj.get("principal_place_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `principal_place_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("principal_place_address").toString()));
      }
      if ((jsonObj.get("state_jurisdiction") != null && !jsonObj.get("state_jurisdiction").isJsonNull()) && !jsonObj.get("state_jurisdiction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_jurisdiction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_jurisdiction").toString()));
      }
      if ((jsonObj.get("status_code") != null && !jsonObj.get("status_code").isJsonNull()) && !jsonObj.get("status_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_code").toString()));
      }
      if ((jsonObj.get("taxpayer_type") != null && !jsonObj.get("taxpayer_type").isJsonNull()) && !jsonObj.get("taxpayer_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxpayer_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxpayer_type").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GstinResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GstinResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GstinResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GstinResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<GstinResponseSchema>() {
           @Override
           public void write(JsonWriter out, GstinResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GstinResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GstinResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GstinResponseSchema
  * @throws IOException if the JSON string is invalid with respect to GstinResponseSchema
  */
  public static GstinResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GstinResponseSchema.class);
  }

 /**
  * Convert an instance of GstinResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

