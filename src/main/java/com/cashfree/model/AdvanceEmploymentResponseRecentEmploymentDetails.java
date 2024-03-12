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
import com.cashfree.model.AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetails;
import com.cashfree.model.AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails;
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
 * It contains the employment details of the individual.
 */
@Schema(description = "It contains the employment details of the individual.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-12T04:15:15.893702Z[Etc/UTC]")
public class AdvanceEmploymentResponseRecentEmploymentDetails {
  public static final String SERIALIZED_NAME_EMPLOYEE_DETAILS = "employee_details";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_DETAILS)
  private AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetails employeeDetails;

  public static final String SERIALIZED_NAME_EMPLOYER_DETAILS = "employer_details";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_DETAILS)
  private AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails employerDetails;

  public AdvanceEmploymentResponseRecentEmploymentDetails() {
  }

  public AdvanceEmploymentResponseRecentEmploymentDetails employeeDetails(AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetails employeeDetails) {
    
    this.employeeDetails = employeeDetails;
    return this;
  }

   /**
   * Get employeeDetails
   * @return employeeDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetails getEmployeeDetails() {
    return employeeDetails;
  }


  public void setEmployeeDetails(AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetails employeeDetails) {
    this.employeeDetails = employeeDetails;
  }


  public AdvanceEmploymentResponseRecentEmploymentDetails employerDetails(AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails employerDetails) {
    
    this.employerDetails = employerDetails;
    return this;
  }

   /**
   * Get employerDetails
   * @return employerDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails getEmployerDetails() {
    return employerDetails;
  }


  public void setEmployerDetails(AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails employerDetails) {
    this.employerDetails = employerDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceEmploymentResponseRecentEmploymentDetails advanceEmploymentResponseRecentEmploymentDetails = (AdvanceEmploymentResponseRecentEmploymentDetails) o;
    return Objects.equals(this.employeeDetails, advanceEmploymentResponseRecentEmploymentDetails.employeeDetails) &&
        Objects.equals(this.employerDetails, advanceEmploymentResponseRecentEmploymentDetails.employerDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeDetails, employerDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceEmploymentResponseRecentEmploymentDetails {\n");
    sb.append("    employeeDetails: ").append(toIndentedString(employeeDetails)).append("\n");
    sb.append("    employerDetails: ").append(toIndentedString(employerDetails)).append("\n");
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
    openapiFields.add("employee_details");
    openapiFields.add("employer_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdvanceEmploymentResponseRecentEmploymentDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `employee_details`
      if (jsonObj.get("employee_details") != null && !jsonObj.get("employee_details").isJsonNull()) {
        AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetails.validateJsonElement(jsonObj.get("employee_details"));
      }
      // validate the optional field `employer_details`
      if (jsonObj.get("employer_details") != null && !jsonObj.get("employer_details").isJsonNull()) {
        AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails.validateJsonElement(jsonObj.get("employer_details"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdvanceEmploymentResponseRecentEmploymentDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `employee_details`
      if (jsonObj.get("employee_details") != null && !jsonObj.get("employee_details").isJsonNull()) {
        AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetails.validateJsonElement(jsonObj.get("employee_details"));
        return true;
      }
      // validate the optional field `employer_details`
      if (jsonObj.get("employer_details") != null && !jsonObj.get("employer_details").isJsonNull()) {
        AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetails.validateJsonElement(jsonObj.get("employer_details"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvanceEmploymentResponseRecentEmploymentDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvanceEmploymentResponseRecentEmploymentDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvanceEmploymentResponseRecentEmploymentDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvanceEmploymentResponseRecentEmploymentDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvanceEmploymentResponseRecentEmploymentDetails>() {
           @Override
           public void write(JsonWriter out, AdvanceEmploymentResponseRecentEmploymentDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvanceEmploymentResponseRecentEmploymentDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvanceEmploymentResponseRecentEmploymentDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvanceEmploymentResponseRecentEmploymentDetails
  * @throws IOException if the JSON string is invalid with respect to AdvanceEmploymentResponseRecentEmploymentDetails
  */
  public static AdvanceEmploymentResponseRecentEmploymentDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvanceEmploymentResponseRecentEmploymentDetails.class);
  }

 /**
  * Convert an instance of AdvanceEmploymentResponseRecentEmploymentDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

