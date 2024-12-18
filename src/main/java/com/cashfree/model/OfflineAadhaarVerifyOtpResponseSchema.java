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
import com.cashfree.model.OfflineAadhaarVerifyOtpResponseSchemaSplitAddress;
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
 * Success response for Submit OTP for Aadhaar Verification
 */
@Schema(description = "Success response for Submit OTP for Aadhaar Verification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T11:12:20.695812Z[Etc/UTC]")
public class OfflineAadhaarVerifyOtpResponseSchema {
  public static final String SERIALIZED_NAME_REF_ID = "ref_id";
  @SerializedName(SERIALIZED_NAME_REF_ID)
  private String refId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_CARE_OF = "care_of";
  @SerializedName(SERIALIZED_NAME_CARE_OF)
  private String careOf;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private String dob;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_YEAR_OF_BIRTH = "year_of_birth";
  @SerializedName(SERIALIZED_NAME_YEAR_OF_BIRTH)
  private String yearOfBirth;

  public static final String SERIALIZED_NAME_MOBILE_HASH = "mobile_hash";
  @SerializedName(SERIALIZED_NAME_MOBILE_HASH)
  private String mobileHash;

  public static final String SERIALIZED_NAME_PHOTO_LINK = "photo_link";
  @SerializedName(SERIALIZED_NAME_PHOTO_LINK)
  private String photoLink;

  public static final String SERIALIZED_NAME_SPLIT_ADDRESS = "split_address";
  @SerializedName(SERIALIZED_NAME_SPLIT_ADDRESS)
  private OfflineAadhaarVerifyOtpResponseSchemaSplitAddress splitAddress;

  public OfflineAadhaarVerifyOtpResponseSchema() {
  }

  public OfflineAadhaarVerifyOtpResponseSchema refId(String refId) {
    
    this.refId = refId;
    return this;
  }

   /**
   * It displays the unique ID created by Cashfree Payments for reference purposes.
   * @return refId
  **/
  @javax.annotation.Nullable
  @Schema(example = "123456789", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by Cashfree Payments for reference purposes.")
  public String getRefId() {
    return refId;
  }


  public void setRefId(String refId) {
    this.refId = refId;
  }


  public OfflineAadhaarVerifyOtpResponseSchema status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * It displays the status of the aadhaar information.
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(example = "VALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the aadhaar information.")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public OfflineAadhaarVerifyOtpResponseSchema message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * It displays details about the success or failure of the API request.
   * @return message
  **/
  @javax.annotation.Nullable
  @Schema(example = "123456789", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays details about the success or failure of the API request.")
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public OfflineAadhaarVerifyOtpResponseSchema careOf(String careOf) {
    
    this.careOf = careOf;
    return this;
  }

   /**
   * It displays the parent/guardian of the aadhaar card holder.
   * @return careOf
  **/
  @javax.annotation.Nullable
  @Schema(example = "Jane Doe", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the parent/guardian of the aadhaar card holder.")
  public String getCareOf() {
    return careOf;
  }


  public void setCareOf(String careOf) {
    this.careOf = careOf;
  }


  public OfflineAadhaarVerifyOtpResponseSchema address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * It displays the address information as present in the aadhaar card.
   * @return address
  **/
  @javax.annotation.Nullable
  @Schema(example = "Chimli", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the address information as present in the aadhaar card.")
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public OfflineAadhaarVerifyOtpResponseSchema dob(String dob) {
    
    this.dob = dob;
    return this;
  }

   /**
   * It displays the date of birth of the aadhaar card holder.
   * @return dob
  **/
  @javax.annotation.Nullable
  @Schema(example = "01-01-2000.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the date of birth of the aadhaar card holder.")
  public String getDob() {
    return dob;
  }


  public void setDob(String dob) {
    this.dob = dob;
  }


  public OfflineAadhaarVerifyOtpResponseSchema email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * It displays the email address of the aadhaar card holder.
   * @return email
  **/
  @javax.annotation.Nullable
  @Schema(example = "john123@gmail.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the email address of the aadhaar card holder.")
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public OfflineAadhaarVerifyOtpResponseSchema gender(String gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * It displays the gender of the aadhaar card holder.
   * @return gender
  **/
  @javax.annotation.Nullable
  @Schema(example = "Male", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the gender of the aadhaar card holder.")
  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }


  public OfflineAadhaarVerifyOtpResponseSchema name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * It displays the name of the aadhaar card holder.
   * @return name
  **/
  @javax.annotation.Nullable
  @Schema(example = "John Doe", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the aadhaar card holder.")
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OfflineAadhaarVerifyOtpResponseSchema yearOfBirth(String yearOfBirth) {
    
    this.yearOfBirth = yearOfBirth;
    return this;
  }

   /**
   * It displays the year of birth of the aadhaar card holder.
   * @return yearOfBirth
  **/
  @javax.annotation.Nullable
  @Schema(example = "2000", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the year of birth of the aadhaar card holder.")
  public String getYearOfBirth() {
    return yearOfBirth;
  }


  public void setYearOfBirth(String yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }


  public OfflineAadhaarVerifyOtpResponseSchema mobileHash(String mobileHash) {
    
    this.mobileHash = mobileHash;
    return this;
  }

   /**
   * It displays the unique information about the device&#39;s hardware, software, and other characteristics.
   * @return mobileHash
  **/
  @javax.annotation.Nullable
  @Schema(example = "v5c64757c746ytvfb687iyjg", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique information about the device's hardware, software, and other characteristics.")
  public String getMobileHash() {
    return mobileHash;
  }


  public void setMobileHash(String mobileHash) {
    this.mobileHash = mobileHash;
  }


  public OfflineAadhaarVerifyOtpResponseSchema photoLink(String photoLink) {
    
    this.photoLink = photoLink;
    return this;
  }

   /**
   * It displays the URL to the image present in the aadhaar card.
   * @return photoLink
  **/
  @javax.annotation.Nullable
  @Schema(example = "IMAGE_LINK", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the URL to the image present in the aadhaar card.")
  public String getPhotoLink() {
    return photoLink;
  }


  public void setPhotoLink(String photoLink) {
    this.photoLink = photoLink;
  }


  public OfflineAadhaarVerifyOtpResponseSchema splitAddress(OfflineAadhaarVerifyOtpResponseSchemaSplitAddress splitAddress) {
    
    this.splitAddress = splitAddress;
    return this;
  }

   /**
   * Get splitAddress
   * @return splitAddress
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public OfflineAadhaarVerifyOtpResponseSchemaSplitAddress getSplitAddress() {
    return splitAddress;
  }


  public void setSplitAddress(OfflineAadhaarVerifyOtpResponseSchemaSplitAddress splitAddress) {
    this.splitAddress = splitAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineAadhaarVerifyOtpResponseSchema offlineAadhaarVerifyOtpResponseSchema = (OfflineAadhaarVerifyOtpResponseSchema) o;
    return Objects.equals(this.refId, offlineAadhaarVerifyOtpResponseSchema.refId) &&
        Objects.equals(this.status, offlineAadhaarVerifyOtpResponseSchema.status) &&
        Objects.equals(this.message, offlineAadhaarVerifyOtpResponseSchema.message) &&
        Objects.equals(this.careOf, offlineAadhaarVerifyOtpResponseSchema.careOf) &&
        Objects.equals(this.address, offlineAadhaarVerifyOtpResponseSchema.address) &&
        Objects.equals(this.dob, offlineAadhaarVerifyOtpResponseSchema.dob) &&
        Objects.equals(this.email, offlineAadhaarVerifyOtpResponseSchema.email) &&
        Objects.equals(this.gender, offlineAadhaarVerifyOtpResponseSchema.gender) &&
        Objects.equals(this.name, offlineAadhaarVerifyOtpResponseSchema.name) &&
        Objects.equals(this.yearOfBirth, offlineAadhaarVerifyOtpResponseSchema.yearOfBirth) &&
        Objects.equals(this.mobileHash, offlineAadhaarVerifyOtpResponseSchema.mobileHash) &&
        Objects.equals(this.photoLink, offlineAadhaarVerifyOtpResponseSchema.photoLink) &&
        Objects.equals(this.splitAddress, offlineAadhaarVerifyOtpResponseSchema.splitAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refId, status, message, careOf, address, dob, email, gender, name, yearOfBirth, mobileHash, photoLink, splitAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineAadhaarVerifyOtpResponseSchema {\n");
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    careOf: ").append(toIndentedString(careOf)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    yearOfBirth: ").append(toIndentedString(yearOfBirth)).append("\n");
    sb.append("    mobileHash: ").append(toIndentedString(mobileHash)).append("\n");
    sb.append("    photoLink: ").append(toIndentedString(photoLink)).append("\n");
    sb.append("    splitAddress: ").append(toIndentedString(splitAddress)).append("\n");
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
    openapiFields.add("ref_id");
    openapiFields.add("status");
    openapiFields.add("message");
    openapiFields.add("care_of");
    openapiFields.add("address");
    openapiFields.add("dob");
    openapiFields.add("email");
    openapiFields.add("gender");
    openapiFields.add("name");
    openapiFields.add("year_of_birth");
    openapiFields.add("mobile_hash");
    openapiFields.add("photo_link");
    openapiFields.add("split_address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfflineAadhaarVerifyOtpResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ref_id") != null && !jsonObj.get("ref_id").isJsonNull()) && !jsonObj.get("ref_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("care_of") != null && !jsonObj.get("care_of").isJsonNull()) && !jsonObj.get("care_of").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `care_of` to be a primitive type in the JSON string but got `%s`", jsonObj.get("care_of").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("dob") != null && !jsonObj.get("dob").isJsonNull()) && !jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("year_of_birth") != null && !jsonObj.get("year_of_birth").isJsonNull()) && !jsonObj.get("year_of_birth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `year_of_birth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("year_of_birth").toString()));
      }
      if ((jsonObj.get("mobile_hash") != null && !jsonObj.get("mobile_hash").isJsonNull()) && !jsonObj.get("mobile_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile_hash").toString()));
      }
      if ((jsonObj.get("photo_link") != null && !jsonObj.get("photo_link").isJsonNull()) && !jsonObj.get("photo_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `photo_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("photo_link").toString()));
      }
      // validate the optional field `split_address`
      if (jsonObj.get("split_address") != null && !jsonObj.get("split_address").isJsonNull()) {
        OfflineAadhaarVerifyOtpResponseSchemaSplitAddress.validateJsonElement(jsonObj.get("split_address"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfflineAadhaarVerifyOtpResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ref_id") != null && !jsonObj.get("ref_id").isJsonNull()) && !jsonObj.get("ref_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("care_of") != null && !jsonObj.get("care_of").isJsonNull()) && !jsonObj.get("care_of").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `care_of` to be a primitive type in the JSON string but got `%s`", jsonObj.get("care_of").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("dob") != null && !jsonObj.get("dob").isJsonNull()) && !jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("year_of_birth") != null && !jsonObj.get("year_of_birth").isJsonNull()) && !jsonObj.get("year_of_birth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `year_of_birth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("year_of_birth").toString()));
      }
      if ((jsonObj.get("mobile_hash") != null && !jsonObj.get("mobile_hash").isJsonNull()) && !jsonObj.get("mobile_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile_hash").toString()));
      }
      if ((jsonObj.get("photo_link") != null && !jsonObj.get("photo_link").isJsonNull()) && !jsonObj.get("photo_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `photo_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("photo_link").toString()));
      }
      // validate the optional field `split_address`
      if (jsonObj.get("split_address") != null && !jsonObj.get("split_address").isJsonNull()) {
        OfflineAadhaarVerifyOtpResponseSchemaSplitAddress.validateJsonElement(jsonObj.get("split_address"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfflineAadhaarVerifyOtpResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfflineAadhaarVerifyOtpResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfflineAadhaarVerifyOtpResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfflineAadhaarVerifyOtpResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<OfflineAadhaarVerifyOtpResponseSchema>() {
           @Override
           public void write(JsonWriter out, OfflineAadhaarVerifyOtpResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfflineAadhaarVerifyOtpResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OfflineAadhaarVerifyOtpResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OfflineAadhaarVerifyOtpResponseSchema
  * @throws IOException if the JSON string is invalid with respect to OfflineAadhaarVerifyOtpResponseSchema
  */
  public static OfflineAadhaarVerifyOtpResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfflineAadhaarVerifyOtpResponseSchema.class);
  }

 /**
  * Convert an instance of OfflineAadhaarVerifyOtpResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

