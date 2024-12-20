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


package com.cashfree.verification.model;

import java.util.Objects;
import com.cashfree.verification.model.ValidityDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.LocalDate;
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

import com.cashfree.verification.JSON;

/**
 * It contains the different information regarding the validity of the licence.
 */
@Schema(description = "It contains the different information regarding the validity of the licence.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T10:11:49.428720Z[Etc/UTC]")
public class DrivingLicenseResponseSchemaDlValidity {
  public static final String SERIALIZED_NAME_NON_TRANSPORT = "non_transport";
  @SerializedName(SERIALIZED_NAME_NON_TRANSPORT)
  private ValidityDetails nonTransport;

  public static final String SERIALIZED_NAME_HAZARDOUS_VALID_TILL = "hazardous_valid_till";
  @SerializedName(SERIALIZED_NAME_HAZARDOUS_VALID_TILL)
  private LocalDate hazardousValidTill;

  public static final String SERIALIZED_NAME_TRANSPORT = "transport";
  @SerializedName(SERIALIZED_NAME_TRANSPORT)
  private ValidityDetails transport;

  public static final String SERIALIZED_NAME_HILL_VALID_TILL = "hill_valid_till";
  @SerializedName(SERIALIZED_NAME_HILL_VALID_TILL)
  private LocalDate hillValidTill;

  public DrivingLicenseResponseSchemaDlValidity() {
  }

  public DrivingLicenseResponseSchemaDlValidity nonTransport(ValidityDetails nonTransport) {
    
    this.nonTransport = nonTransport;
    return this;
  }

   /**
   * Get nonTransport
   * @return nonTransport
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public ValidityDetails getNonTransport() {
    return nonTransport;
  }


  public void setNonTransport(ValidityDetails nonTransport) {
    this.nonTransport = nonTransport;
  }


  public DrivingLicenseResponseSchemaDlValidity hazardousValidTill(LocalDate hazardousValidTill) {
    
    this.hazardousValidTill = hazardousValidTill;
    return this;
  }

   /**
   * It displays till when the individual can drive hazardous vehicle.
   * @return hazardousValidTill
  **/
  @javax.annotation.Nullable
  @Schema(example = "Tue Oct 23 00:00:00 UTC 2001", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays till when the individual can drive hazardous vehicle.")
  public LocalDate getHazardousValidTill() {
    return hazardousValidTill;
  }


  public void setHazardousValidTill(LocalDate hazardousValidTill) {
    this.hazardousValidTill = hazardousValidTill;
  }


  public DrivingLicenseResponseSchemaDlValidity transport(ValidityDetails transport) {
    
    this.transport = transport;
    return this;
  }

   /**
   * Get transport
   * @return transport
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public ValidityDetails getTransport() {
    return transport;
  }


  public void setTransport(ValidityDetails transport) {
    this.transport = transport;
  }


  public DrivingLicenseResponseSchemaDlValidity hillValidTill(LocalDate hillValidTill) {
    
    this.hillValidTill = hillValidTill;
    return this;
  }

   /**
   * It displays till when the individual can drive the vehicle in hill and mountain regions.
   * @return hillValidTill
  **/
  @javax.annotation.Nullable
  @Schema(example = "Tue Oct 23 00:00:00 UTC 2001", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays till when the individual can drive the vehicle in hill and mountain regions.")
  public LocalDate getHillValidTill() {
    return hillValidTill;
  }


  public void setHillValidTill(LocalDate hillValidTill) {
    this.hillValidTill = hillValidTill;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrivingLicenseResponseSchemaDlValidity drivingLicenseResponseSchemaDlValidity = (DrivingLicenseResponseSchemaDlValidity) o;
    return Objects.equals(this.nonTransport, drivingLicenseResponseSchemaDlValidity.nonTransport) &&
        Objects.equals(this.hazardousValidTill, drivingLicenseResponseSchemaDlValidity.hazardousValidTill) &&
        Objects.equals(this.transport, drivingLicenseResponseSchemaDlValidity.transport) &&
        Objects.equals(this.hillValidTill, drivingLicenseResponseSchemaDlValidity.hillValidTill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonTransport, hazardousValidTill, transport, hillValidTill);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrivingLicenseResponseSchemaDlValidity {\n");
    sb.append("    nonTransport: ").append(toIndentedString(nonTransport)).append("\n");
    sb.append("    hazardousValidTill: ").append(toIndentedString(hazardousValidTill)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    hillValidTill: ").append(toIndentedString(hillValidTill)).append("\n");
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
    openapiFields.add("non_transport");
    openapiFields.add("hazardous_valid_till");
    openapiFields.add("transport");
    openapiFields.add("hill_valid_till");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DrivingLicenseResponseSchemaDlValidity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `non_transport`
      if (jsonObj.get("non_transport") != null && !jsonObj.get("non_transport").isJsonNull()) {
        ValidityDetails.validateJsonElement(jsonObj.get("non_transport"));
      }
      // validate the optional field `transport`
      if (jsonObj.get("transport") != null && !jsonObj.get("transport").isJsonNull()) {
        ValidityDetails.validateJsonElement(jsonObj.get("transport"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DrivingLicenseResponseSchemaDlValidity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `non_transport`
      if (jsonObj.get("non_transport") != null && !jsonObj.get("non_transport").isJsonNull()) {
        ValidityDetails.validateJsonElement(jsonObj.get("non_transport"));
        return true;
      }
      // validate the optional field `transport`
      if (jsonObj.get("transport") != null && !jsonObj.get("transport").isJsonNull()) {
        ValidityDetails.validateJsonElement(jsonObj.get("transport"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DrivingLicenseResponseSchemaDlValidity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DrivingLicenseResponseSchemaDlValidity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DrivingLicenseResponseSchemaDlValidity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DrivingLicenseResponseSchemaDlValidity.class));

       return (TypeAdapter<T>) new TypeAdapter<DrivingLicenseResponseSchemaDlValidity>() {
           @Override
           public void write(JsonWriter out, DrivingLicenseResponseSchemaDlValidity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DrivingLicenseResponseSchemaDlValidity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DrivingLicenseResponseSchemaDlValidity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DrivingLicenseResponseSchemaDlValidity
  * @throws IOException if the JSON string is invalid with respect to DrivingLicenseResponseSchemaDlValidity
  */
  public static DrivingLicenseResponseSchemaDlValidity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DrivingLicenseResponseSchemaDlValidity.class);
  }

 /**
  * Convert an instance of DrivingLicenseResponseSchemaDlValidity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

