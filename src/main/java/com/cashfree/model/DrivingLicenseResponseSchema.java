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
import com.cashfree.model.BadgeDetails;
import com.cashfree.model.DrivingLicenceDetails;
import com.cashfree.model.DrivingLicenseResponseSchemaDlValidity;
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
 * Success response for retrieving driving licence information
 */
@Schema(description = "Success response for retrieving driving licence information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T06:41:28.648290Z[Etc/UTC]")
public class DrivingLicenseResponseSchema {
  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private Integer referenceId;

  public static final String SERIALIZED_NAME_DL_NUMBER = "dl_number";
  @SerializedName(SERIALIZED_NAME_DL_NUMBER)
  private String dlNumber;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private String dob;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_BADGE_DETAILS = "badge_details";
  @SerializedName(SERIALIZED_NAME_BADGE_DETAILS)
  private List<BadgeDetails> badgeDetails;

  public static final String SERIALIZED_NAME_DL_VALIDITY = "dl_validity";
  @SerializedName(SERIALIZED_NAME_DL_VALIDITY)
  private DrivingLicenseResponseSchemaDlValidity dlValidity;

  public static final String SERIALIZED_NAME_DETAILS_OF_DRIVING_LICENCE = "details_of_driving_licence";
  @SerializedName(SERIALIZED_NAME_DETAILS_OF_DRIVING_LICENCE)
  private DrivingLicenceDetails detailsOfDrivingLicence;

  public DrivingLicenseResponseSchema() {
  }

  public DrivingLicenseResponseSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It displays the unique ID you created to identify this API request.
   * @return verificationId
  **/
  @javax.annotation.Nullable
  @Schema(example = "test001", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID you created to identify this API request.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public DrivingLicenseResponseSchema referenceId(Integer referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * It displays the unique ID created by Cashfree Payments for reference purposes.
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @Schema(example = "78", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by Cashfree Payments for reference purposes.")
  public Integer getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(Integer referenceId) {
    this.referenceId = referenceId;
  }


  public DrivingLicenseResponseSchema dlNumber(String dlNumber) {
    
    this.dlNumber = dlNumber;
    return this;
  }

   /**
   * It displays the unique number assigned to the driving licence.
   * @return dlNumber
  **/
  @javax.annotation.Nullable
  @Schema(example = "JK01FG8087", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique number assigned to the driving licence.")
  public String getDlNumber() {
    return dlNumber;
  }


  public void setDlNumber(String dlNumber) {
    this.dlNumber = dlNumber;
  }


  public DrivingLicenseResponseSchema dob(String dob) {
    
    this.dob = dob;
    return this;
  }

   /**
   * It displays the date of birth of the individual as present in the driving licence.
   * @return dob
  **/
  @javax.annotation.Nullable
  @Schema(example = "2001-10-23", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the date of birth of the individual as present in the driving licence.")
  public String getDob() {
    return dob;
  }


  public void setDob(String dob) {
    this.dob = dob;
  }


  public DrivingLicenseResponseSchema status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * It displays whether the driving licence is valid.
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(example = "VALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays whether the driving licence is valid.")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public DrivingLicenseResponseSchema badgeDetails(List<BadgeDetails> badgeDetails) {
    
    this.badgeDetails = badgeDetails;
    return this;
  }

  public DrivingLicenseResponseSchema addBadgeDetailsItem(BadgeDetails badgeDetailsItem) {
    if (this.badgeDetails == null) {
      this.badgeDetails = new ArrayList<>();
    }
    this.badgeDetails.add(badgeDetailsItem);
    return this;
  }

   /**
   * It contains the...
   * @return badgeDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It contains the...")
  public List<BadgeDetails> getBadgeDetails() {
    return badgeDetails;
  }


  public void setBadgeDetails(List<BadgeDetails> badgeDetails) {
    this.badgeDetails = badgeDetails;
  }


  public DrivingLicenseResponseSchema dlValidity(DrivingLicenseResponseSchemaDlValidity dlValidity) {
    
    this.dlValidity = dlValidity;
    return this;
  }

   /**
   * Get dlValidity
   * @return dlValidity
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public DrivingLicenseResponseSchemaDlValidity getDlValidity() {
    return dlValidity;
  }


  public void setDlValidity(DrivingLicenseResponseSchemaDlValidity dlValidity) {
    this.dlValidity = dlValidity;
  }


  public DrivingLicenseResponseSchema detailsOfDrivingLicence(DrivingLicenceDetails detailsOfDrivingLicence) {
    
    this.detailsOfDrivingLicence = detailsOfDrivingLicence;
    return this;
  }

   /**
   * Get detailsOfDrivingLicence
   * @return detailsOfDrivingLicence
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public DrivingLicenceDetails getDetailsOfDrivingLicence() {
    return detailsOfDrivingLicence;
  }


  public void setDetailsOfDrivingLicence(DrivingLicenceDetails detailsOfDrivingLicence) {
    this.detailsOfDrivingLicence = detailsOfDrivingLicence;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrivingLicenseResponseSchema drivingLicenseResponseSchema = (DrivingLicenseResponseSchema) o;
    return Objects.equals(this.verificationId, drivingLicenseResponseSchema.verificationId) &&
        Objects.equals(this.referenceId, drivingLicenseResponseSchema.referenceId) &&
        Objects.equals(this.dlNumber, drivingLicenseResponseSchema.dlNumber) &&
        Objects.equals(this.dob, drivingLicenseResponseSchema.dob) &&
        Objects.equals(this.status, drivingLicenseResponseSchema.status) &&
        Objects.equals(this.badgeDetails, drivingLicenseResponseSchema.badgeDetails) &&
        Objects.equals(this.dlValidity, drivingLicenseResponseSchema.dlValidity) &&
        Objects.equals(this.detailsOfDrivingLicence, drivingLicenseResponseSchema.detailsOfDrivingLicence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationId, referenceId, dlNumber, dob, status, badgeDetails, dlValidity, detailsOfDrivingLicence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrivingLicenseResponseSchema {\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    dlNumber: ").append(toIndentedString(dlNumber)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    badgeDetails: ").append(toIndentedString(badgeDetails)).append("\n");
    sb.append("    dlValidity: ").append(toIndentedString(dlValidity)).append("\n");
    sb.append("    detailsOfDrivingLicence: ").append(toIndentedString(detailsOfDrivingLicence)).append("\n");
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
    openapiFields.add("reference_id");
    openapiFields.add("dl_number");
    openapiFields.add("dob");
    openapiFields.add("status");
    openapiFields.add("badge_details");
    openapiFields.add("dl_validity");
    openapiFields.add("details_of_driving_licence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DrivingLicenseResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("dl_number") != null && !jsonObj.get("dl_number").isJsonNull()) && !jsonObj.get("dl_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dl_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dl_number").toString()));
      }
      if ((jsonObj.get("dob") != null && !jsonObj.get("dob").isJsonNull()) && !jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("badge_details") != null && !jsonObj.get("badge_details").isJsonNull()) {
        JsonArray jsonArraybadgeDetails = jsonObj.getAsJsonArray("badge_details");
        if (jsonArraybadgeDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("badge_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `badge_details` to be an array in the JSON string but got `%s`", jsonObj.get("badge_details").toString()));
          }

          // validate the optional field `badge_details` (array)
          for (int i = 0; i < jsonArraybadgeDetails.size(); i++) {
            BadgeDetails.validateJsonElement(jsonArraybadgeDetails.get(i));
          };
        }
      }
      // validate the optional field `dl_validity`
      if (jsonObj.get("dl_validity") != null && !jsonObj.get("dl_validity").isJsonNull()) {
        DrivingLicenseResponseSchemaDlValidity.validateJsonElement(jsonObj.get("dl_validity"));
      }
      // validate the optional field `details_of_driving_licence`
      if (jsonObj.get("details_of_driving_licence") != null && !jsonObj.get("details_of_driving_licence").isJsonNull()) {
        DrivingLicenceDetails.validateJsonElement(jsonObj.get("details_of_driving_licence"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DrivingLicenseResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("dl_number") != null && !jsonObj.get("dl_number").isJsonNull()) && !jsonObj.get("dl_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dl_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dl_number").toString()));
      }
      if ((jsonObj.get("dob") != null && !jsonObj.get("dob").isJsonNull()) && !jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("badge_details") != null && !jsonObj.get("badge_details").isJsonNull()) {
        JsonArray jsonArraybadgeDetails = jsonObj.getAsJsonArray("badge_details");
        if (jsonArraybadgeDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("badge_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `badge_details` to be an array in the JSON string but got `%s`", jsonObj.get("badge_details").toString()));
          }

          // validate the optional field `badge_details` (array)
          for (int i = 0; i < jsonArraybadgeDetails.size(); i++) {
            BadgeDetails.validateJsonElement(jsonArraybadgeDetails.get(i));
          };
        }
      }
      // validate the optional field `dl_validity`
      if (jsonObj.get("dl_validity") != null && !jsonObj.get("dl_validity").isJsonNull()) {
        DrivingLicenseResponseSchemaDlValidity.validateJsonElement(jsonObj.get("dl_validity"));
        return true;
      }
      // validate the optional field `details_of_driving_licence`
      if (jsonObj.get("details_of_driving_licence") != null && !jsonObj.get("details_of_driving_licence").isJsonNull()) {
        DrivingLicenceDetails.validateJsonElement(jsonObj.get("details_of_driving_licence"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DrivingLicenseResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DrivingLicenseResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DrivingLicenseResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DrivingLicenseResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<DrivingLicenseResponseSchema>() {
           @Override
           public void write(JsonWriter out, DrivingLicenseResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DrivingLicenseResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DrivingLicenseResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DrivingLicenseResponseSchema
  * @throws IOException if the JSON string is invalid with respect to DrivingLicenseResponseSchema
  */
  public static DrivingLicenseResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DrivingLicenseResponseSchema.class);
  }

 /**
  * Convert an instance of DrivingLicenseResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

