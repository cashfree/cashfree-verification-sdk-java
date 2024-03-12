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
 * It contains the information entered in the API request.
 */
@Schema(description = "It contains the information entered in the API request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-12T04:15:15.893702Z[Etc/UTC]")
public class AdvanceEmploymentResponseInput {
  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_PAN = "pan";
  @SerializedName(SERIALIZED_NAME_PAN)
  private String pan;

  public static final String SERIALIZED_NAME_UAN = "uan";
  @SerializedName(SERIALIZED_NAME_UAN)
  private String uan;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private String dob;

  public static final String SERIALIZED_NAME_EMPLOYEE_NAME = "employee_name";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NAME)
  private String employeeName;

  public static final String SERIALIZED_NAME_EMPLOYER_NAME = "employer_name";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_NAME)
  private String employerName;

  public AdvanceEmploymentResponseInput() {
  }

  public AdvanceEmploymentResponseInput phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * It displays the phone number of the employee.
   * @return phone
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the phone number of the employee.")
  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public AdvanceEmploymentResponseInput pan(String pan) {
    
    this.pan = pan;
    return this;
  }

   /**
   * It displays the PAN information of the employee.
   * @return pan
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the PAN information of the employee.")
  public String getPan() {
    return pan;
  }


  public void setPan(String pan) {
    this.pan = pan;
  }


  public AdvanceEmploymentResponseInput uan(String uan) {
    
    this.uan = uan;
    return this;
  }

   /**
   * It displays the UAN information of the employee.
   * @return uan
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the UAN information of the employee.")
  public String getUan() {
    return uan;
  }


  public void setUan(String uan) {
    this.uan = uan;
  }


  public AdvanceEmploymentResponseInput dob(String dob) {
    
    this.dob = dob;
    return this;
  }

   /**
   * It displays the date of birth of the employee.
   * @return dob
  **/
  @javax.annotation.Nullable
  @Schema(example = "1996-10-02", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the date of birth of the employee.")
  public String getDob() {
    return dob;
  }


  public void setDob(String dob) {
    this.dob = dob;
  }


  public AdvanceEmploymentResponseInput employeeName(String employeeName) {
    
    this.employeeName = employeeName;
    return this;
  }

   /**
   * It displays the name of the employee.
   * @return employeeName
  **/
  @javax.annotation.Nullable
  @Schema(example = "John Doe", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the employee.")
  public String getEmployeeName() {
    return employeeName;
  }


  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }


  public AdvanceEmploymentResponseInput employerName(String employerName) {
    
    this.employerName = employerName;
    return this;
  }

   /**
   * It displays the name of the employer.
   * @return employerName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the employer.")
  public String getEmployerName() {
    return employerName;
  }


  public void setEmployerName(String employerName) {
    this.employerName = employerName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceEmploymentResponseInput advanceEmploymentResponseInput = (AdvanceEmploymentResponseInput) o;
    return Objects.equals(this.phone, advanceEmploymentResponseInput.phone) &&
        Objects.equals(this.pan, advanceEmploymentResponseInput.pan) &&
        Objects.equals(this.uan, advanceEmploymentResponseInput.uan) &&
        Objects.equals(this.dob, advanceEmploymentResponseInput.dob) &&
        Objects.equals(this.employeeName, advanceEmploymentResponseInput.employeeName) &&
        Objects.equals(this.employerName, advanceEmploymentResponseInput.employerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, pan, uan, dob, employeeName, employerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceEmploymentResponseInput {\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    uan: ").append(toIndentedString(uan)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
    sb.append("    employerName: ").append(toIndentedString(employerName)).append("\n");
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
    openapiFields.add("phone");
    openapiFields.add("pan");
    openapiFields.add("uan");
    openapiFields.add("dob");
    openapiFields.add("employee_name");
    openapiFields.add("employer_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdvanceEmploymentResponseInput
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("pan") != null && !jsonObj.get("pan").isJsonNull()) && !jsonObj.get("pan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan").toString()));
      }
      if ((jsonObj.get("uan") != null && !jsonObj.get("uan").isJsonNull()) && !jsonObj.get("uan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uan").toString()));
      }
      if ((jsonObj.get("dob") != null && !jsonObj.get("dob").isJsonNull()) && !jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      if ((jsonObj.get("employee_name") != null && !jsonObj.get("employee_name").isJsonNull()) && !jsonObj.get("employee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_name").toString()));
      }
      if ((jsonObj.get("employer_name") != null && !jsonObj.get("employer_name").isJsonNull()) && !jsonObj.get("employer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employer_name").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdvanceEmploymentResponseInput
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("pan") != null && !jsonObj.get("pan").isJsonNull()) && !jsonObj.get("pan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan").toString()));
      }
      if ((jsonObj.get("uan") != null && !jsonObj.get("uan").isJsonNull()) && !jsonObj.get("uan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uan").toString()));
      }
      if ((jsonObj.get("dob") != null && !jsonObj.get("dob").isJsonNull()) && !jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      if ((jsonObj.get("employee_name") != null && !jsonObj.get("employee_name").isJsonNull()) && !jsonObj.get("employee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_name").toString()));
      }
      if ((jsonObj.get("employer_name") != null && !jsonObj.get("employer_name").isJsonNull()) && !jsonObj.get("employer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employer_name").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvanceEmploymentResponseInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvanceEmploymentResponseInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvanceEmploymentResponseInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvanceEmploymentResponseInput.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvanceEmploymentResponseInput>() {
           @Override
           public void write(JsonWriter out, AdvanceEmploymentResponseInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvanceEmploymentResponseInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvanceEmploymentResponseInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvanceEmploymentResponseInput
  * @throws IOException if the JSON string is invalid with respect to AdvanceEmploymentResponseInput
  */
  public static AdvanceEmploymentResponseInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvanceEmploymentResponseInput.class);
  }

 /**
  * Convert an instance of AdvanceEmploymentResponseInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

