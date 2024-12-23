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
import com.cashfree.model.AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
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
 * AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-21T07:15:37.235803Z[Etc/UTC]")
public class AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails {
  public static final String SERIALIZED_NAME_ESTABLISHMENT_ID = "establishment_id";
  @SerializedName(SERIALIZED_NAME_ESTABLISHMENT_ID)
  private String establishmentId;

  public static final String SERIALIZED_NAME_ESTABLISHMENT_NAME = "establishment_name";
  @SerializedName(SERIALIZED_NAME_ESTABLISHMENT_NAME)
  private String establishmentName;

  public static final String SERIALIZED_NAME_SETUP_DATE = "setup_date";
  @SerializedName(SERIALIZED_NAME_SETUP_DATE)
  private String setupDate;

  public static final String SERIALIZED_NAME_OWNERSHIP_TYPE = "ownership_type";
  @SerializedName(SERIALIZED_NAME_OWNERSHIP_TYPE)
  private String ownershipType;

  public static final String SERIALIZED_NAME_EMPLOYER_CONFIDENCE_SCORE = "employer_confidence_score";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_CONFIDENCE_SCORE)
  private BigDecimal employerConfidenceScore;

  public static final String SERIALIZED_NAME_EMPLOYER_NAME_MATCH = "employer_name_match";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_NAME_MATCH)
  private Boolean employerNameMatch;

  public static final String SERIALIZED_NAME_PF_FILING_DETAILS = "pf_filing_details";
  @SerializedName(SERIALIZED_NAME_PF_FILING_DETAILS)
  private List<AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner> pfFilingDetails;

  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails() {
  }

  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails establishmentId(String establishmentId) {
    
    this.establishmentId = establishmentId;
    return this;
  }

   /**
   * Get establishmentId
   * @return establishmentId
  **/
  @javax.annotation.Nullable
  @Schema(example = "MHBAN1234220000", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getEstablishmentId() {
    return establishmentId;
  }


  public void setEstablishmentId(String establishmentId) {
    this.establishmentId = establishmentId;
  }


  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails establishmentName(String establishmentName) {
    
    this.establishmentName = establishmentName;
    return this;
  }

   /**
   * Get establishmentName
   * @return establishmentName
  **/
  @javax.annotation.Nullable
  @Schema(example = "Cashfree India Private Ltd", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getEstablishmentName() {
    return establishmentName;
  }


  public void setEstablishmentName(String establishmentName) {
    this.establishmentName = establishmentName;
  }


  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails setupDate(String setupDate) {
    
    this.setupDate = setupDate;
    return this;
  }

   /**
   * Get setupDate
   * @return setupDate
  **/
  @javax.annotation.Nullable
  @Schema(example = "2020-11-19", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getSetupDate() {
    return setupDate;
  }


  public void setSetupDate(String setupDate) {
    this.setupDate = setupDate;
  }


  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails ownershipType(String ownershipType) {
    
    this.ownershipType = ownershipType;
    return this;
  }

   /**
   * Get ownershipType
   * @return ownershipType
  **/
  @javax.annotation.Nullable
  @Schema(example = "Private Limited Company", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getOwnershipType() {
    return ownershipType;
  }


  public void setOwnershipType(String ownershipType) {
    this.ownershipType = ownershipType;
  }


  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails employerConfidenceScore(BigDecimal employerConfidenceScore) {
    
    this.employerConfidenceScore = employerConfidenceScore;
    return this;
  }

   /**
   * Get employerConfidenceScore
   * @return employerConfidenceScore
  **/
  @javax.annotation.Nullable
  @Schema(example = "0.3", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getEmployerConfidenceScore() {
    return employerConfidenceScore;
  }


  public void setEmployerConfidenceScore(BigDecimal employerConfidenceScore) {
    this.employerConfidenceScore = employerConfidenceScore;
  }


  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails employerNameMatch(Boolean employerNameMatch) {
    
    this.employerNameMatch = employerNameMatch;
    return this;
  }

   /**
   * Get employerNameMatch
   * @return employerNameMatch
  **/
  @javax.annotation.Nullable
  @Schema(example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Boolean getEmployerNameMatch() {
    return employerNameMatch;
  }


  public void setEmployerNameMatch(Boolean employerNameMatch) {
    this.employerNameMatch = employerNameMatch;
  }


  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails pfFilingDetails(List<AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner> pfFilingDetails) {
    
    this.pfFilingDetails = pfFilingDetails;
    return this;
  }

  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails addPfFilingDetailsItem(AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner pfFilingDetailsItem) {
    if (this.pfFilingDetails == null) {
      this.pfFilingDetails = new ArrayList<>();
    }
    this.pfFilingDetails.add(pfFilingDetailsItem);
    return this;
  }

   /**
   * Get pfFilingDetails
   * @return pfFilingDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner> getPfFilingDetails() {
    return pfFilingDetails;
  }


  public void setPfFilingDetails(List<AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner> pfFilingDetails) {
    this.pfFilingDetails = pfFilingDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails advanceEmploymentResponseRecentEmploymentDetailsEmployerDetails = (AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails) o;
    return Objects.equals(this.establishmentId, advanceEmploymentResponseRecentEmploymentDetailsEmployerDetails.establishmentId) &&
        Objects.equals(this.establishmentName, advanceEmploymentResponseRecentEmploymentDetailsEmployerDetails.establishmentName) &&
        Objects.equals(this.setupDate, advanceEmploymentResponseRecentEmploymentDetailsEmployerDetails.setupDate) &&
        Objects.equals(this.ownershipType, advanceEmploymentResponseRecentEmploymentDetailsEmployerDetails.ownershipType) &&
        Objects.equals(this.employerConfidenceScore, advanceEmploymentResponseRecentEmploymentDetailsEmployerDetails.employerConfidenceScore) &&
        Objects.equals(this.employerNameMatch, advanceEmploymentResponseRecentEmploymentDetailsEmployerDetails.employerNameMatch) &&
        Objects.equals(this.pfFilingDetails, advanceEmploymentResponseRecentEmploymentDetailsEmployerDetails.pfFilingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(establishmentId, establishmentName, setupDate, ownershipType, employerConfidenceScore, employerNameMatch, pfFilingDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails {\n");
    sb.append("    establishmentId: ").append(toIndentedString(establishmentId)).append("\n");
    sb.append("    establishmentName: ").append(toIndentedString(establishmentName)).append("\n");
    sb.append("    setupDate: ").append(toIndentedString(setupDate)).append("\n");
    sb.append("    ownershipType: ").append(toIndentedString(ownershipType)).append("\n");
    sb.append("    employerConfidenceScore: ").append(toIndentedString(employerConfidenceScore)).append("\n");
    sb.append("    employerNameMatch: ").append(toIndentedString(employerNameMatch)).append("\n");
    sb.append("    pfFilingDetails: ").append(toIndentedString(pfFilingDetails)).append("\n");
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
    openapiFields.add("establishment_id");
    openapiFields.add("establishment_name");
    openapiFields.add("setup_date");
    openapiFields.add("ownership_type");
    openapiFields.add("employer_confidence_score");
    openapiFields.add("employer_name_match");
    openapiFields.add("pf_filing_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("establishment_id") != null && !jsonObj.get("establishment_id").isJsonNull()) && !jsonObj.get("establishment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `establishment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("establishment_id").toString()));
      }
      if ((jsonObj.get("establishment_name") != null && !jsonObj.get("establishment_name").isJsonNull()) && !jsonObj.get("establishment_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `establishment_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("establishment_name").toString()));
      }
      if ((jsonObj.get("setup_date") != null && !jsonObj.get("setup_date").isJsonNull()) && !jsonObj.get("setup_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `setup_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("setup_date").toString()));
      }
      if ((jsonObj.get("ownership_type") != null && !jsonObj.get("ownership_type").isJsonNull()) && !jsonObj.get("ownership_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownership_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownership_type").toString()));
      }
      if (jsonObj.get("pf_filing_details") != null && !jsonObj.get("pf_filing_details").isJsonNull()) {
        JsonArray jsonArraypfFilingDetails = jsonObj.getAsJsonArray("pf_filing_details");
        if (jsonArraypfFilingDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pf_filing_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pf_filing_details` to be an array in the JSON string but got `%s`", jsonObj.get("pf_filing_details").toString()));
          }

          // validate the optional field `pf_filing_details` (array)
          for (int i = 0; i < jsonArraypfFilingDetails.size(); i++) {
            AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner.validateJsonElement(jsonArraypfFilingDetails.get(i));
          };
        }
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("establishment_id") != null && !jsonObj.get("establishment_id").isJsonNull()) && !jsonObj.get("establishment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `establishment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("establishment_id").toString()));
      }
      if ((jsonObj.get("establishment_name") != null && !jsonObj.get("establishment_name").isJsonNull()) && !jsonObj.get("establishment_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `establishment_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("establishment_name").toString()));
      }
      if ((jsonObj.get("setup_date") != null && !jsonObj.get("setup_date").isJsonNull()) && !jsonObj.get("setup_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `setup_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("setup_date").toString()));
      }
      if ((jsonObj.get("ownership_type") != null && !jsonObj.get("ownership_type").isJsonNull()) && !jsonObj.get("ownership_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownership_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownership_type").toString()));
      }
      if (jsonObj.get("pf_filing_details") != null && !jsonObj.get("pf_filing_details").isJsonNull()) {
        JsonArray jsonArraypfFilingDetails = jsonObj.getAsJsonArray("pf_filing_details");
        if (jsonArraypfFilingDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pf_filing_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pf_filing_details` to be an array in the JSON string but got `%s`", jsonObj.get("pf_filing_details").toString()));
          }

          // validate the optional field `pf_filing_details` (array)
          for (int i = 0; i < jsonArraypfFilingDetails.size(); i++) {
            AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner.validateJsonElement(jsonArraypfFilingDetails.get(i));
          };
        }
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails>() {
           @Override
           public void write(JsonWriter out, AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails
  * @throws IOException if the JSON string is invalid with respect to AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails
  */
  public static AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails.class);
  }

 /**
  * Convert an instance of AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

