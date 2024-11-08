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
 * It displays the address information of the individual.
 */
@Schema(description = "It displays the address information of the individual.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-08T05:03:36.102379Z[Etc/UTC]")
public class PanAdvanceResponseSchemaAddress {
  public static final String SERIALIZED_NAME_FULL_ADDRESS = "full_address";
  @SerializedName(SERIALIZED_NAME_FULL_ADDRESS)
  private String fullAddress;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_PINCODE = "pincode";
  @SerializedName(SERIALIZED_NAME_PINCODE)
  private Integer pincode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public PanAdvanceResponseSchemaAddress() {
  }

  public PanAdvanceResponseSchemaAddress fullAddress(String fullAddress) {
    
    this.fullAddress = fullAddress;
    return this;
  }

   /**
   * It displays the complete address of the individual.
   * @return fullAddress
  **/
  @javax.annotation.Nullable
  @Schema(example = "Quarter - A, Block - B Sample Area, ABC Street 700011 KOLKATA WEST BENGAL INDIA", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the complete address of the individual.")
  public String getFullAddress() {
    return fullAddress;
  }


  public void setFullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
  }


  public PanAdvanceResponseSchemaAddress street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * It displays the street name from the individual&#39;s address.
   * @return street
  **/
  @javax.annotation.Nullable
  @Schema(example = "ABC Street", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the street name from the individual's address.")
  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public PanAdvanceResponseSchemaAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * It displays the city name from the individual&#39;s address.
   * @return city
  **/
  @javax.annotation.Nullable
  @Schema(example = "KOLKATA", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the city name from the individual's address.")
  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public PanAdvanceResponseSchemaAddress state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * It displays the state name from the individual&#39;s address.
   * @return state
  **/
  @javax.annotation.Nullable
  @Schema(example = "WEST BENGAL", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the state name from the individual's address.")
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public PanAdvanceResponseSchemaAddress pincode(Integer pincode) {
    
    this.pincode = pincode;
    return this;
  }

   /**
   * It displays the PIN code from the individual&#39;s address.
   * @return pincode
  **/
  @javax.annotation.Nullable
  @Schema(example = "700011", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the PIN code from the individual's address.")
  public Integer getPincode() {
    return pincode;
  }


  public void setPincode(Integer pincode) {
    this.pincode = pincode;
  }


  public PanAdvanceResponseSchemaAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * It displays the country name from the individual&#39;s address.
   * @return country
  **/
  @javax.annotation.Nullable
  @Schema(example = "India", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the country name from the individual's address.")
  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PanAdvanceResponseSchemaAddress panAdvanceResponseSchemaAddress = (PanAdvanceResponseSchemaAddress) o;
    return Objects.equals(this.fullAddress, panAdvanceResponseSchemaAddress.fullAddress) &&
        Objects.equals(this.street, panAdvanceResponseSchemaAddress.street) &&
        Objects.equals(this.city, panAdvanceResponseSchemaAddress.city) &&
        Objects.equals(this.state, panAdvanceResponseSchemaAddress.state) &&
        Objects.equals(this.pincode, panAdvanceResponseSchemaAddress.pincode) &&
        Objects.equals(this.country, panAdvanceResponseSchemaAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullAddress, street, city, state, pincode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PanAdvanceResponseSchemaAddress {\n");
    sb.append("    fullAddress: ").append(toIndentedString(fullAddress)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
    openapiFields.add("full_address");
    openapiFields.add("street");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("pincode");
    openapiFields.add("country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PanAdvanceResponseSchemaAddress
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("full_address") != null && !jsonObj.get("full_address").isJsonNull()) && !jsonObj.get("full_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_address").toString()));
      }
      if ((jsonObj.get("street") != null && !jsonObj.get("street").isJsonNull()) && !jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PanAdvanceResponseSchemaAddress
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("full_address") != null && !jsonObj.get("full_address").isJsonNull()) && !jsonObj.get("full_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_address").toString()));
      }
      if ((jsonObj.get("street") != null && !jsonObj.get("street").isJsonNull()) && !jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PanAdvanceResponseSchemaAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PanAdvanceResponseSchemaAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PanAdvanceResponseSchemaAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PanAdvanceResponseSchemaAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<PanAdvanceResponseSchemaAddress>() {
           @Override
           public void write(JsonWriter out, PanAdvanceResponseSchemaAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PanAdvanceResponseSchemaAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PanAdvanceResponseSchemaAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PanAdvanceResponseSchemaAddress
  * @throws IOException if the JSON string is invalid with respect to PanAdvanceResponseSchemaAddress
  */
  public static PanAdvanceResponseSchemaAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PanAdvanceResponseSchemaAddress.class);
  }

 /**
  * Convert an instance of PanAdvanceResponseSchemaAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

