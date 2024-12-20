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
 * AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T06:30:36.549576Z[Etc/UTC]")
public class AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner {
  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private BigDecimal totalAmount;

  public static final String SERIALIZED_NAME_EMPLOYEES_COUNT = "employees_count";
  @SerializedName(SERIALIZED_NAME_EMPLOYEES_COUNT)
  private BigDecimal employeesCount;

  public static final String SERIALIZED_NAME_WAGE_MONTH = "wage_month";
  @SerializedName(SERIALIZED_NAME_WAGE_MONTH)
  private String wageMonth;

  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner() {
  }

  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner totalAmount(BigDecimal totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @Schema(example = "37524", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }


  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner employeesCount(BigDecimal employeesCount) {
    
    this.employeesCount = employeesCount;
    return this;
  }

   /**
   * Get employeesCount
   * @return employeesCount
  **/
  @javax.annotation.Nullable
  @Schema(example = "17", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getEmployeesCount() {
    return employeesCount;
  }


  public void setEmployeesCount(BigDecimal employeesCount) {
    this.employeesCount = employeesCount;
  }


  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner wageMonth(String wageMonth) {
    
    this.wageMonth = wageMonth;
    return this;
  }

   /**
   * Get wageMonth
   * @return wageMonth
  **/
  @javax.annotation.Nullable
  @Schema(example = "NOV-23", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getWageMonth() {
    return wageMonth;
  }


  public void setWageMonth(String wageMonth) {
    this.wageMonth = wageMonth;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner advanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner = (AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner) o;
    return Objects.equals(this.totalAmount, advanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner.totalAmount) &&
        Objects.equals(this.employeesCount, advanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner.employeesCount) &&
        Objects.equals(this.wageMonth, advanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner.wageMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, employeesCount, wageMonth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner {\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    employeesCount: ").append(toIndentedString(employeesCount)).append("\n");
    sb.append("    wageMonth: ").append(toIndentedString(wageMonth)).append("\n");
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
    openapiFields.add("total_amount");
    openapiFields.add("employees_count");
    openapiFields.add("wage_month");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("wage_month") != null && !jsonObj.get("wage_month").isJsonNull()) && !jsonObj.get("wage_month").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wage_month` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wage_month").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("wage_month") != null && !jsonObj.get("wage_month").isJsonNull()) && !jsonObj.get("wage_month").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wage_month` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wage_month").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner>() {
           @Override
           public void write(JsonWriter out, AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner
  * @throws IOException if the JSON string is invalid with respect to AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner
  */
  public static AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner.class);
  }

 /**
  * Convert an instance of AdvanceEmploymentResponseRecentEmploymentDetailsEmployerDetailsPfFilingDetailsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

