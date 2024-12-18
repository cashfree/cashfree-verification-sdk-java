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
 * It contains information regarding any badges or emblems affixed to the vehicle. These badges could indicate various things such as the vehicle&#39;s model, trim level, special editions, or manufacturer-specific badges.
 */
@Schema(description = "It contains information regarding any badges or emblems affixed to the vehicle. These badges could indicate various things such as the vehicle's model, trim level, special editions, or manufacturer-specific badges.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T11:12:20.695812Z[Etc/UTC]")
public class BadgeDetails {
  public static final String SERIALIZED_NAME_BADGE_ISSUE_DATE = "badge_issue_date";
  @SerializedName(SERIALIZED_NAME_BADGE_ISSUE_DATE)
  private String badgeIssueDate;

  public static final String SERIALIZED_NAME_BADGE_NO = "badge_no";
  @SerializedName(SERIALIZED_NAME_BADGE_NO)
  private String badgeNo;

  public static final String SERIALIZED_NAME_CLASS_OF_VEHICLE = "class_of_vehicle";
  @SerializedName(SERIALIZED_NAME_CLASS_OF_VEHICLE)
  private List<String> classOfVehicle;

  public BadgeDetails() {
  }

  public BadgeDetails badgeIssueDate(String badgeIssueDate) {
    
    this.badgeIssueDate = badgeIssueDate;
    return this;
  }

   /**
   * It displays the date of the badge issued.
   * @return badgeIssueDate
  **/
  @javax.annotation.Nullable
  @Schema(example = "2023-10-23", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the date of the badge issued.")
  public String getBadgeIssueDate() {
    return badgeIssueDate;
  }


  public void setBadgeIssueDate(String badgeIssueDate) {
    this.badgeIssueDate = badgeIssueDate;
  }


  public BadgeDetails badgeNo(String badgeNo) {
    
    this.badgeNo = badgeNo;
    return this;
  }

   /**
   * It displays the number of the badge issued.
   * @return badgeNo
  **/
  @javax.annotation.Nullable
  @Schema(example = "2389082", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the number of the badge issued.")
  public String getBadgeNo() {
    return badgeNo;
  }


  public void setBadgeNo(String badgeNo) {
    this.badgeNo = badgeNo;
  }


  public BadgeDetails classOfVehicle(List<String> classOfVehicle) {
    
    this.classOfVehicle = classOfVehicle;
    return this;
  }

  public BadgeDetails addClassOfVehicleItem(String classOfVehicleItem) {
    if (this.classOfVehicle == null) {
      this.classOfVehicle = new ArrayList<>();
    }
    this.classOfVehicle.add(classOfVehicleItem);
    return this;
  }

   /**
   * It displays the class of the vehicle.
   * @return classOfVehicle
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the class of the vehicle.")
  public List<String> getClassOfVehicle() {
    return classOfVehicle;
  }


  public void setClassOfVehicle(List<String> classOfVehicle) {
    this.classOfVehicle = classOfVehicle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadgeDetails badgeDetails = (BadgeDetails) o;
    return Objects.equals(this.badgeIssueDate, badgeDetails.badgeIssueDate) &&
        Objects.equals(this.badgeNo, badgeDetails.badgeNo) &&
        Objects.equals(this.classOfVehicle, badgeDetails.classOfVehicle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(badgeIssueDate, badgeNo, classOfVehicle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadgeDetails {\n");
    sb.append("    badgeIssueDate: ").append(toIndentedString(badgeIssueDate)).append("\n");
    sb.append("    badgeNo: ").append(toIndentedString(badgeNo)).append("\n");
    sb.append("    classOfVehicle: ").append(toIndentedString(classOfVehicle)).append("\n");
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
    openapiFields.add("badge_issue_date");
    openapiFields.add("badge_no");
    openapiFields.add("class_of_vehicle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BadgeDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("badge_issue_date") != null && !jsonObj.get("badge_issue_date").isJsonNull()) && !jsonObj.get("badge_issue_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `badge_issue_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("badge_issue_date").toString()));
      }
      if ((jsonObj.get("badge_no") != null && !jsonObj.get("badge_no").isJsonNull()) && !jsonObj.get("badge_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `badge_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("badge_no").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("class_of_vehicle") != null && !jsonObj.get("class_of_vehicle").isJsonNull() && !jsonObj.get("class_of_vehicle").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_of_vehicle` to be an array in the JSON string but got `%s`", jsonObj.get("class_of_vehicle").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BadgeDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("badge_issue_date") != null && !jsonObj.get("badge_issue_date").isJsonNull()) && !jsonObj.get("badge_issue_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `badge_issue_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("badge_issue_date").toString()));
      }
      if ((jsonObj.get("badge_no") != null && !jsonObj.get("badge_no").isJsonNull()) && !jsonObj.get("badge_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `badge_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("badge_no").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("class_of_vehicle") != null && !jsonObj.get("class_of_vehicle").isJsonNull() && !jsonObj.get("class_of_vehicle").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_of_vehicle` to be an array in the JSON string but got `%s`", jsonObj.get("class_of_vehicle").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BadgeDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BadgeDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BadgeDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BadgeDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<BadgeDetails>() {
           @Override
           public void write(JsonWriter out, BadgeDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BadgeDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BadgeDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BadgeDetails
  * @throws IOException if the JSON string is invalid with respect to BadgeDetails
  */
  public static BadgeDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BadgeDetails.class);
  }

 /**
  * Convert an instance of BadgeDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

