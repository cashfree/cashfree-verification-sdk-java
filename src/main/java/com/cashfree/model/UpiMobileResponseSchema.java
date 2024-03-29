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
 * Success response
 */
@Schema(description = "Success response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-12T04:15:15.893702Z[Etc/UTC]")
public class UpiMobileResponseSchema {
  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private Integer referenceId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ACCOUNT_STATUS = "account_status";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_STATUS)
  private String accountStatus;

  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public static final String SERIALIZED_NAME_MOBILE_NUMBER = "mobile_number";
  @SerializedName(SERIALIZED_NAME_MOBILE_NUMBER)
  private String mobileNumber;

  public static final String SERIALIZED_NAME_VPA = "vpa";
  @SerializedName(SERIALIZED_NAME_VPA)
  private String vpa;

  public static final String SERIALIZED_NAME_NAME_AT_BANK = "name_at_bank";
  @SerializedName(SERIALIZED_NAME_NAME_AT_BANK)
  private String nameAtBank;

  public static final String SERIALIZED_NAME_ADDITIONAL_VPAS = "additional_vpas";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_VPAS)
  private List<String> additionalVpas;

  public UpiMobileResponseSchema() {
  }

  public UpiMobileResponseSchema referenceId(Integer referenceId) {
    
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


  public UpiMobileResponseSchema status(String status) {
    
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


  public UpiMobileResponseSchema accountStatus(String accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * It displays the status of the UPI VPA information.
   * @return accountStatus
  **/
  @javax.annotation.Nullable
  @Schema(example = "VALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the UPI VPA information.")
  public String getAccountStatus() {
    return accountStatus;
  }


  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }


  public UpiMobileResponseSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It displays the unique ID you created to identify the verification request.
   * @return verificationId
  **/
  @javax.annotation.Nullable
  @Schema(example = "test_verification_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID you created to identify the verification request.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public UpiMobileResponseSchema mobileNumber(String mobileNumber) {
    
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * It displays the mobile number of the account holder.
   * @return mobileNumber
  **/
  @javax.annotation.Nullable
  @Schema(example = "6666666666", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the mobile number of the account holder.")
  public String getMobileNumber() {
    return mobileNumber;
  }


  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }


  public UpiMobileResponseSchema vpa(String vpa) {
    
    this.vpa = vpa;
    return this;
  }

   /**
   * It displays the UPI VPA associated with the entered mobile number. If no primary UPI VPA is associated, tis field will be null.
   * @return vpa
  **/
  @javax.annotation.Nullable
  @Schema(example = "johndoe@oksbi", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the UPI VPA associated with the entered mobile number. If no primary UPI VPA is associated, tis field will be null.")
  public String getVpa() {
    return vpa;
  }


  public void setVpa(String vpa) {
    this.vpa = vpa;
  }


  public UpiMobileResponseSchema nameAtBank(String nameAtBank) {
    
    this.nameAtBank = nameAtBank;
    return this;
  }

   /**
   * It displays the name of the account holder as registered in the bank. If no primary UPI VPA is associated, this field will be null.
   * @return nameAtBank
  **/
  @javax.annotation.Nullable
  @Schema(example = "John Doe", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the account holder as registered in the bank. If no primary UPI VPA is associated, this field will be null.")
  public String getNameAtBank() {
    return nameAtBank;
  }


  public void setNameAtBank(String nameAtBank) {
    this.nameAtBank = nameAtBank;
  }


  public UpiMobileResponseSchema additionalVpas(List<String> additionalVpas) {
    
    this.additionalVpas = additionalVpas;
    return this;
  }

  public UpiMobileResponseSchema addAdditionalVpasItem(String additionalVpasItem) {
    if (this.additionalVpas == null) {
      this.additionalVpas = new ArrayList<>();
    }
    this.additionalVpas.add(additionalVpasItem);
    return this;
  }

   /**
   * It displays the list of additional UPI VPA associated with the mobile number. If no other UPI VPA is linked with the mobile number, this will be an empty array [].
   * @return additionalVpas
  **/
  @javax.annotation.Nullable
  @Schema(example = "[\"6666666666@apl\",\"6666666666@paytm\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the list of additional UPI VPA associated with the mobile number. If no other UPI VPA is linked with the mobile number, this will be an empty array [].")
  public List<String> getAdditionalVpas() {
    return additionalVpas;
  }


  public void setAdditionalVpas(List<String> additionalVpas) {
    this.additionalVpas = additionalVpas;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpiMobileResponseSchema upiMobileResponseSchema = (UpiMobileResponseSchema) o;
    return Objects.equals(this.referenceId, upiMobileResponseSchema.referenceId) &&
        Objects.equals(this.status, upiMobileResponseSchema.status) &&
        Objects.equals(this.accountStatus, upiMobileResponseSchema.accountStatus) &&
        Objects.equals(this.verificationId, upiMobileResponseSchema.verificationId) &&
        Objects.equals(this.mobileNumber, upiMobileResponseSchema.mobileNumber) &&
        Objects.equals(this.vpa, upiMobileResponseSchema.vpa) &&
        Objects.equals(this.nameAtBank, upiMobileResponseSchema.nameAtBank) &&
        Objects.equals(this.additionalVpas, upiMobileResponseSchema.additionalVpas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, status, accountStatus, verificationId, mobileNumber, vpa, nameAtBank, additionalVpas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpiMobileResponseSchema {\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    vpa: ").append(toIndentedString(vpa)).append("\n");
    sb.append("    nameAtBank: ").append(toIndentedString(nameAtBank)).append("\n");
    sb.append("    additionalVpas: ").append(toIndentedString(additionalVpas)).append("\n");
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
    openapiFields.add("reference_id");
    openapiFields.add("status");
    openapiFields.add("account_status");
    openapiFields.add("verification_id");
    openapiFields.add("mobile_number");
    openapiFields.add("vpa");
    openapiFields.add("name_at_bank");
    openapiFields.add("additional_vpas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpiMobileResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("account_status") != null && !jsonObj.get("account_status").isJsonNull()) && !jsonObj.get("account_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_status").toString()));
      }
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("mobile_number") != null && !jsonObj.get("mobile_number").isJsonNull()) && !jsonObj.get("mobile_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile_number").toString()));
      }
      if ((jsonObj.get("vpa") != null && !jsonObj.get("vpa").isJsonNull()) && !jsonObj.get("vpa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vpa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vpa").toString()));
      }
      if ((jsonObj.get("name_at_bank") != null && !jsonObj.get("name_at_bank").isJsonNull()) && !jsonObj.get("name_at_bank").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_at_bank` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_at_bank").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("additional_vpas") != null && !jsonObj.get("additional_vpas").isJsonNull() && !jsonObj.get("additional_vpas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_vpas` to be an array in the JSON string but got `%s`", jsonObj.get("additional_vpas").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpiMobileResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("account_status") != null && !jsonObj.get("account_status").isJsonNull()) && !jsonObj.get("account_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_status").toString()));
      }
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("mobile_number") != null && !jsonObj.get("mobile_number").isJsonNull()) && !jsonObj.get("mobile_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile_number").toString()));
      }
      if ((jsonObj.get("vpa") != null && !jsonObj.get("vpa").isJsonNull()) && !jsonObj.get("vpa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vpa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vpa").toString()));
      }
      if ((jsonObj.get("name_at_bank") != null && !jsonObj.get("name_at_bank").isJsonNull()) && !jsonObj.get("name_at_bank").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_at_bank` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_at_bank").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("additional_vpas") != null && !jsonObj.get("additional_vpas").isJsonNull() && !jsonObj.get("additional_vpas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_vpas` to be an array in the JSON string but got `%s`", jsonObj.get("additional_vpas").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpiMobileResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpiMobileResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpiMobileResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpiMobileResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<UpiMobileResponseSchema>() {
           @Override
           public void write(JsonWriter out, UpiMobileResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpiMobileResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpiMobileResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpiMobileResponseSchema
  * @throws IOException if the JSON string is invalid with respect to UpiMobileResponseSchema
  */
  public static UpiMobileResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpiMobileResponseSchema.class);
  }

 /**
  * Convert an instance of UpiMobileResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

