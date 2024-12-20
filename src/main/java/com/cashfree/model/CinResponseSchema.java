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
import com.cashfree.model.CinResponseSchemaDirectorDetailsInner;
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
 * Success response for retrieving CIN information
 */
@Schema(description = "Success response for retrieving CIN information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T06:30:36.549576Z[Etc/UTC]")
public class CinResponseSchema {
  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private Integer referenceId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CIN = "cin";
  @SerializedName(SERIALIZED_NAME_CIN)
  private String cin;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_REGISTRATION_NUMBER = "registration_number";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_NUMBER)
  private BigDecimal registrationNumber;

  public static final String SERIALIZED_NAME_INCORPORATION_DATE = "incorporation_date";
  @SerializedName(SERIALIZED_NAME_INCORPORATION_DATE)
  private String incorporationDate;

  public static final String SERIALIZED_NAME_CIN_STATUS = "cin_status";
  @SerializedName(SERIALIZED_NAME_CIN_STATUS)
  private String cinStatus;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_INCORPORATION_COUNTRY = "incorporation_country";
  @SerializedName(SERIALIZED_NAME_INCORPORATION_COUNTRY)
  private String incorporationCountry;

  public static final String SERIALIZED_NAME_DIRECTOR_DETAILS = "director_details";
  @SerializedName(SERIALIZED_NAME_DIRECTOR_DETAILS)
  private List<CinResponseSchemaDirectorDetailsInner> directorDetails;

  public CinResponseSchema() {
  }

  public CinResponseSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It displays the unique ID you created to identify the API request.
   * @return verificationId
  **/
  @javax.annotation.Nullable
  @Schema(example = "ABC00123", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID you created to identify the API request.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public CinResponseSchema referenceId(Integer referenceId) {
    
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


  public CinResponseSchema status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * It displays the status of the CIN information
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(example = "VALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the CIN information")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public CinResponseSchema cin(String cin) {
    
    this.cin = cin;
    return this;
  }

   /**
   * It displays the entered CIN information.
   * @return cin
  **/
  @javax.annotation.Nullable
  @Schema(example = "U72900KA2015PTC082988", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the entered CIN information.")
  public String getCin() {
    return cin;
  }


  public void setCin(String cin) {
    this.cin = cin;
  }


  public CinResponseSchema companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * It displays the name of the company registered under the Ministry of Corporate Affaris.
   * @return companyName
  **/
  @javax.annotation.Nullable
  @Schema(example = "COMPANY NAME", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the company registered under the Ministry of Corporate Affaris.")
  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public CinResponseSchema registrationNumber(BigDecimal registrationNumber) {
    
    this.registrationNumber = registrationNumber;
    return this;
  }

   /**
   * It displays the registration number of the company.
   * @return registrationNumber
  **/
  @javax.annotation.Nullable
  @Schema(example = "82987", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the registration number of the company.")
  public BigDecimal getRegistrationNumber() {
    return registrationNumber;
  }


  public void setRegistrationNumber(BigDecimal registrationNumber) {
    this.registrationNumber = registrationNumber;
  }


  public CinResponseSchema incorporationDate(String incorporationDate) {
    
    this.incorporationDate = incorporationDate;
    return this;
  }

   /**
   * It displays the date of incorporation of the company.
   * @return incorporationDate
  **/
  @javax.annotation.Nullable
  @Schema(example = "23-09-2015", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the date of incorporation of the company.")
  public String getIncorporationDate() {
    return incorporationDate;
  }


  public void setIncorporationDate(String incorporationDate) {
    this.incorporationDate = incorporationDate;
  }


  public CinResponseSchema cinStatus(String cinStatus) {
    
    this.cinStatus = cinStatus;
    return this;
  }

   /**
   * It displays the granular level status of the CIN information.
   * @return cinStatus
  **/
  @javax.annotation.Nullable
  @Schema(example = "ACTIVE", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the granular level status of the CIN information.")
  public String getCinStatus() {
    return cinStatus;
  }


  public void setCinStatus(String cinStatus) {
    this.cinStatus = cinStatus;
  }


  public CinResponseSchema email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * It displays the email ID of the company registered under the Ministry of Company Affairs.
   * @return email
  **/
  @javax.annotation.Nullable
  @Schema(example = "abc@xyz.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the email ID of the company registered under the Ministry of Company Affairs.")
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CinResponseSchema incorporationCountry(String incorporationCountry) {
    
    this.incorporationCountry = incorporationCountry;
    return this;
  }

   /**
   * It displays the name of the country where the company is located.
   * @return incorporationCountry
  **/
  @javax.annotation.Nullable
  @Schema(example = "INDIA", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the country where the company is located.")
  public String getIncorporationCountry() {
    return incorporationCountry;
  }


  public void setIncorporationCountry(String incorporationCountry) {
    this.incorporationCountry = incorporationCountry;
  }


  public CinResponseSchema directorDetails(List<CinResponseSchemaDirectorDetailsInner> directorDetails) {
    
    this.directorDetails = directorDetails;
    return this;
  }

  public CinResponseSchema addDirectorDetailsItem(CinResponseSchemaDirectorDetailsInner directorDetailsItem) {
    if (this.directorDetails == null) {
      this.directorDetails = new ArrayList<>();
    }
    this.directorDetails.add(directorDetailsItem);
    return this;
  }

   /**
   * Get directorDetails
   * @return directorDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<CinResponseSchemaDirectorDetailsInner> getDirectorDetails() {
    return directorDetails;
  }


  public void setDirectorDetails(List<CinResponseSchemaDirectorDetailsInner> directorDetails) {
    this.directorDetails = directorDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CinResponseSchema cinResponseSchema = (CinResponseSchema) o;
    return Objects.equals(this.verificationId, cinResponseSchema.verificationId) &&
        Objects.equals(this.referenceId, cinResponseSchema.referenceId) &&
        Objects.equals(this.status, cinResponseSchema.status) &&
        Objects.equals(this.cin, cinResponseSchema.cin) &&
        Objects.equals(this.companyName, cinResponseSchema.companyName) &&
        Objects.equals(this.registrationNumber, cinResponseSchema.registrationNumber) &&
        Objects.equals(this.incorporationDate, cinResponseSchema.incorporationDate) &&
        Objects.equals(this.cinStatus, cinResponseSchema.cinStatus) &&
        Objects.equals(this.email, cinResponseSchema.email) &&
        Objects.equals(this.incorporationCountry, cinResponseSchema.incorporationCountry) &&
        Objects.equals(this.directorDetails, cinResponseSchema.directorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationId, referenceId, status, cin, companyName, registrationNumber, incorporationDate, cinStatus, email, incorporationCountry, directorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CinResponseSchema {\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cin: ").append(toIndentedString(cin)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    incorporationDate: ").append(toIndentedString(incorporationDate)).append("\n");
    sb.append("    cinStatus: ").append(toIndentedString(cinStatus)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    incorporationCountry: ").append(toIndentedString(incorporationCountry)).append("\n");
    sb.append("    directorDetails: ").append(toIndentedString(directorDetails)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("cin");
    openapiFields.add("company_name");
    openapiFields.add("registration_number");
    openapiFields.add("incorporation_date");
    openapiFields.add("cin_status");
    openapiFields.add("email");
    openapiFields.add("incorporation_country");
    openapiFields.add("director_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CinResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("cin") != null && !jsonObj.get("cin").isJsonNull()) && !jsonObj.get("cin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cin").toString()));
      }
      if ((jsonObj.get("company_name") != null && !jsonObj.get("company_name").isJsonNull()) && !jsonObj.get("company_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_name").toString()));
      }
      if ((jsonObj.get("incorporation_date") != null && !jsonObj.get("incorporation_date").isJsonNull()) && !jsonObj.get("incorporation_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `incorporation_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("incorporation_date").toString()));
      }
      if ((jsonObj.get("cin_status") != null && !jsonObj.get("cin_status").isJsonNull()) && !jsonObj.get("cin_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cin_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cin_status").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("incorporation_country") != null && !jsonObj.get("incorporation_country").isJsonNull()) && !jsonObj.get("incorporation_country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `incorporation_country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("incorporation_country").toString()));
      }
      if (jsonObj.get("director_details") != null && !jsonObj.get("director_details").isJsonNull()) {
        JsonArray jsonArraydirectorDetails = jsonObj.getAsJsonArray("director_details");
        if (jsonArraydirectorDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("director_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `director_details` to be an array in the JSON string but got `%s`", jsonObj.get("director_details").toString()));
          }

          // validate the optional field `director_details` (array)
          for (int i = 0; i < jsonArraydirectorDetails.size(); i++) {
            CinResponseSchemaDirectorDetailsInner.validateJsonElement(jsonArraydirectorDetails.get(i));
          };
        }
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CinResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("cin") != null && !jsonObj.get("cin").isJsonNull()) && !jsonObj.get("cin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cin").toString()));
      }
      if ((jsonObj.get("company_name") != null && !jsonObj.get("company_name").isJsonNull()) && !jsonObj.get("company_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_name").toString()));
      }
      if ((jsonObj.get("incorporation_date") != null && !jsonObj.get("incorporation_date").isJsonNull()) && !jsonObj.get("incorporation_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `incorporation_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("incorporation_date").toString()));
      }
      if ((jsonObj.get("cin_status") != null && !jsonObj.get("cin_status").isJsonNull()) && !jsonObj.get("cin_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cin_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cin_status").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("incorporation_country") != null && !jsonObj.get("incorporation_country").isJsonNull()) && !jsonObj.get("incorporation_country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `incorporation_country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("incorporation_country").toString()));
      }
      if (jsonObj.get("director_details") != null && !jsonObj.get("director_details").isJsonNull()) {
        JsonArray jsonArraydirectorDetails = jsonObj.getAsJsonArray("director_details");
        if (jsonArraydirectorDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("director_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `director_details` to be an array in the JSON string but got `%s`", jsonObj.get("director_details").toString()));
          }

          // validate the optional field `director_details` (array)
          for (int i = 0; i < jsonArraydirectorDetails.size(); i++) {
            CinResponseSchemaDirectorDetailsInner.validateJsonElement(jsonArraydirectorDetails.get(i));
          };
        }
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CinResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CinResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CinResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CinResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<CinResponseSchema>() {
           @Override
           public void write(JsonWriter out, CinResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CinResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CinResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CinResponseSchema
  * @throws IOException if the JSON string is invalid with respect to CinResponseSchema
  */
  public static CinResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CinResponseSchema.class);
  }

 /**
  * Convert an instance of CinResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

