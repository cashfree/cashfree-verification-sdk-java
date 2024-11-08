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
import com.cashfree.model.AddressDetails;
import com.cashfree.model.DrivingLicenceDetailsSplitAddress;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.LocalDate;
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
 * It contains the details of the driving licence.
 */
@Schema(description = "It contains the details of the driving licence.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-08T05:03:36.102379Z[Etc/UTC]")
public class DrivingLicenceDetails {
  public static final String SERIALIZED_NAME_DATE_OF_ISSUE = "date_of_issue";
  @SerializedName(SERIALIZED_NAME_DATE_OF_ISSUE)
  private LocalDate dateOfIssue;

  public static final String SERIALIZED_NAME_DATE_OF_LAST_TRANSACTION = "date_of_last_transaction";
  @SerializedName(SERIALIZED_NAME_DATE_OF_LAST_TRANSACTION)
  private LocalDate dateOfLastTransaction;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_LAST_TRANSACTED_AT = "last_transacted_at";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSACTED_AT)
  private LocalDate lastTransactedAt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FATHER_OR_HUSBAND_NAME = "father_or_husband_name";
  @SerializedName(SERIALIZED_NAME_FATHER_OR_HUSBAND_NAME)
  private String fatherOrHusbandName;

  public static final String SERIALIZED_NAME_ADDRESS_LIST = "address_list";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LIST)
  private List<AddressDetails> addressList;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_SPLIT_ADDRESS = "split_address";
  @SerializedName(SERIALIZED_NAME_SPLIT_ADDRESS)
  private DrivingLicenceDetailsSplitAddress splitAddress;

  public static final String SERIALIZED_NAME_COV_DETAILS = "cov_details";
  @SerializedName(SERIALIZED_NAME_COV_DETAILS)
  private List<Object> covDetails;

  public DrivingLicenceDetails() {
  }

  public DrivingLicenceDetails dateOfIssue(LocalDate dateOfIssue) {
    
    this.dateOfIssue = dateOfIssue;
    return this;
  }

   /**
   * Get dateOfIssue
   * @return dateOfIssue
  **/
  @javax.annotation.Nullable
  @Schema(example = "Mon Oct 23 00:00:00 UTC 2023", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public LocalDate getDateOfIssue() {
    return dateOfIssue;
  }


  public void setDateOfIssue(LocalDate dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }


  public DrivingLicenceDetails dateOfLastTransaction(LocalDate dateOfLastTransaction) {
    
    this.dateOfLastTransaction = dateOfLastTransaction;
    return this;
  }

   /**
   * Get dateOfLastTransaction
   * @return dateOfLastTransaction
  **/
  @javax.annotation.Nullable
  @Schema(example = "Mon Oct 23 00:00:00 UTC 2023", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public LocalDate getDateOfLastTransaction() {
    return dateOfLastTransaction;
  }


  public void setDateOfLastTransaction(LocalDate dateOfLastTransaction) {
    this.dateOfLastTransaction = dateOfLastTransaction;
  }


  public DrivingLicenceDetails status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(example = "ACTIVE", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public DrivingLicenceDetails lastTransactedAt(LocalDate lastTransactedAt) {
    
    this.lastTransactedAt = lastTransactedAt;
    return this;
  }

   /**
   * Get lastTransactedAt
   * @return lastTransactedAt
  **/
  @javax.annotation.Nullable
  @Schema(example = "Mon Oct 23 00:00:00 UTC 2023", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public LocalDate getLastTransactedAt() {
    return lastTransactedAt;
  }


  public void setLastTransactedAt(LocalDate lastTransactedAt) {
    this.lastTransactedAt = lastTransactedAt;
  }


  public DrivingLicenceDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @Schema(example = "John Doe", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DrivingLicenceDetails fatherOrHusbandName(String fatherOrHusbandName) {
    
    this.fatherOrHusbandName = fatherOrHusbandName;
    return this;
  }

   /**
   * Get fatherOrHusbandName
   * @return fatherOrHusbandName
  **/
  @javax.annotation.Nullable
  @Schema(example = "John Doe", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getFatherOrHusbandName() {
    return fatherOrHusbandName;
  }


  public void setFatherOrHusbandName(String fatherOrHusbandName) {
    this.fatherOrHusbandName = fatherOrHusbandName;
  }


  public DrivingLicenceDetails addressList(List<AddressDetails> addressList) {
    
    this.addressList = addressList;
    return this;
  }

  public DrivingLicenceDetails addAddressListItem(AddressDetails addressListItem) {
    if (this.addressList == null) {
      this.addressList = new ArrayList<>();
    }
    this.addressList.add(addressListItem);
    return this;
  }

   /**
   * Get addressList
   * @return addressList
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<AddressDetails> getAddressList() {
    return addressList;
  }


  public void setAddressList(List<AddressDetails> addressList) {
    this.addressList = addressList;
  }


  public DrivingLicenceDetails address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public DrivingLicenceDetails splitAddress(DrivingLicenceDetailsSplitAddress splitAddress) {
    
    this.splitAddress = splitAddress;
    return this;
  }

   /**
   * Get splitAddress
   * @return splitAddress
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public DrivingLicenceDetailsSplitAddress getSplitAddress() {
    return splitAddress;
  }


  public void setSplitAddress(DrivingLicenceDetailsSplitAddress splitAddress) {
    this.splitAddress = splitAddress;
  }


  public DrivingLicenceDetails covDetails(List<Object> covDetails) {
    
    this.covDetails = covDetails;
    return this;
  }

  public DrivingLicenceDetails addCovDetailsItem(Object covDetailsItem) {
    if (this.covDetails == null) {
      this.covDetails = new ArrayList<>();
    }
    this.covDetails.add(covDetailsItem);
    return this;
  }

   /**
   * Get covDetails
   * @return covDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<Object> getCovDetails() {
    return covDetails;
  }


  public void setCovDetails(List<Object> covDetails) {
    this.covDetails = covDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrivingLicenceDetails drivingLicenceDetails = (DrivingLicenceDetails) o;
    return Objects.equals(this.dateOfIssue, drivingLicenceDetails.dateOfIssue) &&
        Objects.equals(this.dateOfLastTransaction, drivingLicenceDetails.dateOfLastTransaction) &&
        Objects.equals(this.status, drivingLicenceDetails.status) &&
        Objects.equals(this.lastTransactedAt, drivingLicenceDetails.lastTransactedAt) &&
        Objects.equals(this.name, drivingLicenceDetails.name) &&
        Objects.equals(this.fatherOrHusbandName, drivingLicenceDetails.fatherOrHusbandName) &&
        Objects.equals(this.addressList, drivingLicenceDetails.addressList) &&
        Objects.equals(this.address, drivingLicenceDetails.address) &&
        Objects.equals(this.splitAddress, drivingLicenceDetails.splitAddress) &&
        Objects.equals(this.covDetails, drivingLicenceDetails.covDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfIssue, dateOfLastTransaction, status, lastTransactedAt, name, fatherOrHusbandName, addressList, address, splitAddress, covDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrivingLicenceDetails {\n");
    sb.append("    dateOfIssue: ").append(toIndentedString(dateOfIssue)).append("\n");
    sb.append("    dateOfLastTransaction: ").append(toIndentedString(dateOfLastTransaction)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastTransactedAt: ").append(toIndentedString(lastTransactedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fatherOrHusbandName: ").append(toIndentedString(fatherOrHusbandName)).append("\n");
    sb.append("    addressList: ").append(toIndentedString(addressList)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    splitAddress: ").append(toIndentedString(splitAddress)).append("\n");
    sb.append("    covDetails: ").append(toIndentedString(covDetails)).append("\n");
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
    openapiFields.add("date_of_issue");
    openapiFields.add("date_of_last_transaction");
    openapiFields.add("status");
    openapiFields.add("last_transacted_at");
    openapiFields.add("name");
    openapiFields.add("father_or_husband_name");
    openapiFields.add("address_list");
    openapiFields.add("address");
    openapiFields.add("split_address");
    openapiFields.add("cov_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DrivingLicenceDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("father_or_husband_name") != null && !jsonObj.get("father_or_husband_name").isJsonNull()) && !jsonObj.get("father_or_husband_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `father_or_husband_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("father_or_husband_name").toString()));
      }
      if (jsonObj.get("address_list") != null && !jsonObj.get("address_list").isJsonNull()) {
        JsonArray jsonArrayaddressList = jsonObj.getAsJsonArray("address_list");
        if (jsonArrayaddressList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("address_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `address_list` to be an array in the JSON string but got `%s`", jsonObj.get("address_list").toString()));
          }

          // validate the optional field `address_list` (array)
          for (int i = 0; i < jsonArrayaddressList.size(); i++) {
            AddressDetails.validateJsonElement(jsonArrayaddressList.get(i));
          };
        }
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      // validate the optional field `split_address`
      if (jsonObj.get("split_address") != null && !jsonObj.get("split_address").isJsonNull()) {
        DrivingLicenceDetailsSplitAddress.validateJsonElement(jsonObj.get("split_address"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cov_details") != null && !jsonObj.get("cov_details").isJsonNull() && !jsonObj.get("cov_details").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cov_details` to be an array in the JSON string but got `%s`", jsonObj.get("cov_details").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DrivingLicenceDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("father_or_husband_name") != null && !jsonObj.get("father_or_husband_name").isJsonNull()) && !jsonObj.get("father_or_husband_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `father_or_husband_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("father_or_husband_name").toString()));
      }
      if (jsonObj.get("address_list") != null && !jsonObj.get("address_list").isJsonNull()) {
        JsonArray jsonArrayaddressList = jsonObj.getAsJsonArray("address_list");
        if (jsonArrayaddressList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("address_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `address_list` to be an array in the JSON string but got `%s`", jsonObj.get("address_list").toString()));
          }

          // validate the optional field `address_list` (array)
          for (int i = 0; i < jsonArrayaddressList.size(); i++) {
            AddressDetails.validateJsonElement(jsonArrayaddressList.get(i));
          };
        }
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      // validate the optional field `split_address`
      if (jsonObj.get("split_address") != null && !jsonObj.get("split_address").isJsonNull()) {
        DrivingLicenceDetailsSplitAddress.validateJsonElement(jsonObj.get("split_address"));
        return true;
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cov_details") != null && !jsonObj.get("cov_details").isJsonNull() && !jsonObj.get("cov_details").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cov_details` to be an array in the JSON string but got `%s`", jsonObj.get("cov_details").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DrivingLicenceDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DrivingLicenceDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DrivingLicenceDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DrivingLicenceDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<DrivingLicenceDetails>() {
           @Override
           public void write(JsonWriter out, DrivingLicenceDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DrivingLicenceDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DrivingLicenceDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DrivingLicenceDetails
  * @throws IOException if the JSON string is invalid with respect to DrivingLicenceDetails
  */
  public static DrivingLicenceDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DrivingLicenceDetails.class);
  }

 /**
  * Convert an instance of DrivingLicenceDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

