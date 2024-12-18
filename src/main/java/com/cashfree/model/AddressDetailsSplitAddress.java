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
 * It displays the address information in individual components.
 */
@Schema(description = "It displays the address information in individual components.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T11:12:20.695812Z[Etc/UTC]")
public class AddressDetailsSplitAddress {
  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private List<String> district;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private List<List<String>> state;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<String> city;

  public static final String SERIALIZED_NAME_PINCODE = "pincode";
  @SerializedName(SERIALIZED_NAME_PINCODE)
  private String pincode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private List<String> country;

  public static final String SERIALIZED_NAME_ADDRESS_LINE = "address_line";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE)
  private String addressLine;

  public AddressDetailsSplitAddress() {
  }

  public AddressDetailsSplitAddress district(List<String> district) {
    
    this.district = district;
    return this;
  }

  public AddressDetailsSplitAddress addDistrictItem(String districtItem) {
    if (this.district == null) {
      this.district = new ArrayList<>();
    }
    this.district.add(districtItem);
    return this;
  }

   /**
   * It displays the name of the district.
   * @return district
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the district.")
  public List<String> getDistrict() {
    return district;
  }


  public void setDistrict(List<String> district) {
    this.district = district;
  }


  public AddressDetailsSplitAddress state(List<List<String>> state) {
    
    this.state = state;
    return this;
  }

  public AddressDetailsSplitAddress addStateItem(List<String> stateItem) {
    if (this.state == null) {
      this.state = new ArrayList<>();
    }
    this.state.add(stateItem);
    return this;
  }

   /**
   * It displays the name of the state.
   * @return state
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the state.")
  public List<List<String>> getState() {
    return state;
  }


  public void setState(List<List<String>> state) {
    this.state = state;
  }


  public AddressDetailsSplitAddress city(List<String> city) {
    
    this.city = city;
    return this;
  }

  public AddressDetailsSplitAddress addCityItem(String cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * It displays the name of the city.
   * @return city
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the city.")
  public List<String> getCity() {
    return city;
  }


  public void setCity(List<String> city) {
    this.city = city;
  }


  public AddressDetailsSplitAddress pincode(String pincode) {
    
    this.pincode = pincode;
    return this;
  }

   /**
   * It displays the PIN code information.
   * @return pincode
  **/
  @javax.annotation.Nullable
  @Schema(example = "560109", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the PIN code information.")
  public String getPincode() {
    return pincode;
  }


  public void setPincode(String pincode) {
    this.pincode = pincode;
  }


  public AddressDetailsSplitAddress country(List<String> country) {
    
    this.country = country;
    return this;
  }

  public AddressDetailsSplitAddress addCountryItem(String countryItem) {
    if (this.country == null) {
      this.country = new ArrayList<>();
    }
    this.country.add(countryItem);
    return this;
  }

   /**
   * It displays the name of the country.
   * @return country
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the country.")
  public List<String> getCountry() {
    return country;
  }


  public void setCountry(List<String> country) {
    this.country = country;
  }


  public AddressDetailsSplitAddress addressLine(String addressLine) {
    
    this.addressLine = addressLine;
    return this;
  }

   /**
   * It displays the address information.
   * @return addressLine
  **/
  @javax.annotation.Nullable
  @Schema(example = "S-90 SunTower, GopiNagar, Banaglore, KA - 560109", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the address information.")
  public String getAddressLine() {
    return addressLine;
  }


  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressDetailsSplitAddress addressDetailsSplitAddress = (AddressDetailsSplitAddress) o;
    return Objects.equals(this.district, addressDetailsSplitAddress.district) &&
        Objects.equals(this.state, addressDetailsSplitAddress.state) &&
        Objects.equals(this.city, addressDetailsSplitAddress.city) &&
        Objects.equals(this.pincode, addressDetailsSplitAddress.pincode) &&
        Objects.equals(this.country, addressDetailsSplitAddress.country) &&
        Objects.equals(this.addressLine, addressDetailsSplitAddress.addressLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(district, state, city, pincode, country, addressLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressDetailsSplitAddress {\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
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
    openapiFields.add("district");
    openapiFields.add("state");
    openapiFields.add("city");
    openapiFields.add("pincode");
    openapiFields.add("country");
    openapiFields.add("address_line");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddressDetailsSplitAddress
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("district") != null && !jsonObj.get("district").isJsonNull() && !jsonObj.get("district").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `district` to be an array in the JSON string but got `%s`", jsonObj.get("district").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull() && !jsonObj.get("state").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be an array in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull() && !jsonObj.get("city").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be an array in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("pincode") != null && !jsonObj.get("pincode").isJsonNull()) && !jsonObj.get("pincode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pincode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pincode").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull() && !jsonObj.get("country").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be an array in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("address_line") != null && !jsonObj.get("address_line").isJsonNull()) && !jsonObj.get("address_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddressDetailsSplitAddress
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("district") != null && !jsonObj.get("district").isJsonNull() && !jsonObj.get("district").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `district` to be an array in the JSON string but got `%s`", jsonObj.get("district").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull() && !jsonObj.get("state").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be an array in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull() && !jsonObj.get("city").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be an array in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("pincode") != null && !jsonObj.get("pincode").isJsonNull()) && !jsonObj.get("pincode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pincode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pincode").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull() && !jsonObj.get("country").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be an array in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("address_line") != null && !jsonObj.get("address_line").isJsonNull()) && !jsonObj.get("address_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressDetailsSplitAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressDetailsSplitAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressDetailsSplitAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressDetailsSplitAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressDetailsSplitAddress>() {
           @Override
           public void write(JsonWriter out, AddressDetailsSplitAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressDetailsSplitAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddressDetailsSplitAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressDetailsSplitAddress
  * @throws IOException if the JSON string is invalid with respect to AddressDetailsSplitAddress
  */
  public static AddressDetailsSplitAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressDetailsSplitAddress.class);
  }

 /**
  * Convert an instance of AddressDetailsSplitAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

