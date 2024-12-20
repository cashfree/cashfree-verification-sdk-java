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

import com.cashfree.verification.JSON;

/**
 * It contains the address information in individual components.
 */
@Schema(description = "It contains the address information in individual components.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T10:11:49.428720Z[Etc/UTC]")
public class DigiLockerVerificationGetDocumentResponseSchemaSplitAddress {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_DIST = "dist";
  @SerializedName(SERIALIZED_NAME_DIST)
  private String dist;

  public static final String SERIALIZED_NAME_HOUSE = "house";
  @SerializedName(SERIALIZED_NAME_HOUSE)
  private String house;

  public static final String SERIALIZED_NAME_LANDMARK = "landmark";
  @SerializedName(SERIALIZED_NAME_LANDMARK)
  private String landmark;

  public static final String SERIALIZED_NAME_PINCODE = "pincode";
  @SerializedName(SERIALIZED_NAME_PINCODE)
  private String pincode;

  public static final String SERIALIZED_NAME_PO = "po";
  @SerializedName(SERIALIZED_NAME_PO)
  private String po;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_SUBDIST = "subdist";
  @SerializedName(SERIALIZED_NAME_SUBDIST)
  private String subdist;

  public static final String SERIALIZED_NAME_VTC = "vtc";
  @SerializedName(SERIALIZED_NAME_VTC)
  private String vtc;

  public DigiLockerVerificationGetDocumentResponseSchemaSplitAddress() {
  }

  public DigiLockerVerificationGetDocumentResponseSchemaSplitAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * It displays the name of the country as present in the document.
   * @return country
  **/
  @javax.annotation.Nullable
  @Schema(example = "India", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the country as present in the document.")
  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public DigiLockerVerificationGetDocumentResponseSchemaSplitAddress dist(String dist) {
    
    this.dist = dist;
    return this;
  }

   /**
   * It displays the name of the district as present in the document.
   * @return dist
  **/
  @javax.annotation.Nullable
  @Schema(example = "Haveri", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the district as present in the document.")
  public String getDist() {
    return dist;
  }


  public void setDist(String dist) {
    this.dist = dist;
  }


  public DigiLockerVerificationGetDocumentResponseSchemaSplitAddress house(String house) {
    
    this.house = house;
    return this;
  }

   /**
   * It displays the name of the house as present in the document.
   * @return house
  **/
  @javax.annotation.Nullable
  @Schema(example = "House", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the house as present in the document.")
  public String getHouse() {
    return house;
  }


  public void setHouse(String house) {
    this.house = house;
  }


  public DigiLockerVerificationGetDocumentResponseSchemaSplitAddress landmark(String landmark) {
    
    this.landmark = landmark;
    return this;
  }

   /**
   * It displays the name of the landmark as present in the document.
   * @return landmark
  **/
  @javax.annotation.Nullable
  @Schema(example = "Landmark", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the landmark as present in the document.")
  public String getLandmark() {
    return landmark;
  }


  public void setLandmark(String landmark) {
    this.landmark = landmark;
  }


  public DigiLockerVerificationGetDocumentResponseSchemaSplitAddress pincode(String pincode) {
    
    this.pincode = pincode;
    return this;
  }

   /**
   * It displays the PIN code as present in the document.
   * @return pincode
  **/
  @javax.annotation.Nullable
  @Schema(example = "581112", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the PIN code as present in the document.")
  public String getPincode() {
    return pincode;
  }


  public void setPincode(String pincode) {
    this.pincode = pincode;
  }


  public DigiLockerVerificationGetDocumentResponseSchemaSplitAddress po(String po) {
    
    this.po = po;
    return this;
  }

   /**
   * It displays the name of the post office as present in the document.
   * @return po
  **/
  @javax.annotation.Nullable
  @Schema(example = "Post Office", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the post office as present in the document.")
  public String getPo() {
    return po;
  }


  public void setPo(String po) {
    this.po = po;
  }


  public DigiLockerVerificationGetDocumentResponseSchemaSplitAddress state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * It displays the name of the state as present in the document.
   * @return state
  **/
  @javax.annotation.Nullable
  @Schema(example = "State", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the state as present in the document.")
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public DigiLockerVerificationGetDocumentResponseSchemaSplitAddress street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * It displays the name of the street as present in the document.
   * @return street
  **/
  @javax.annotation.Nullable
  @Schema(example = "Street", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the street as present in the document.")
  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public DigiLockerVerificationGetDocumentResponseSchemaSplitAddress subdist(String subdist) {
    
    this.subdist = subdist;
    return this;
  }

   /**
   * It displays the name of the sub district as present in the document.
   * @return subdist
  **/
  @javax.annotation.Nullable
  @Schema(example = "SubDist", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the sub district as present in the document.")
  public String getSubdist() {
    return subdist;
  }


  public void setSubdist(String subdist) {
    this.subdist = subdist;
  }


  public DigiLockerVerificationGetDocumentResponseSchemaSplitAddress vtc(String vtc) {
    
    this.vtc = vtc;
    return this;
  }

   /**
   * It displays the name of the VTC (village, town, city) as present in the address.
   * @return vtc
  **/
  @javax.annotation.Nullable
  @Schema(example = "Vtc", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the VTC (village, town, city) as present in the address.")
  public String getVtc() {
    return vtc;
  }


  public void setVtc(String vtc) {
    this.vtc = vtc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigiLockerVerificationGetDocumentResponseSchemaSplitAddress digiLockerVerificationGetDocumentResponseSchemaSplitAddress = (DigiLockerVerificationGetDocumentResponseSchemaSplitAddress) o;
    return Objects.equals(this.country, digiLockerVerificationGetDocumentResponseSchemaSplitAddress.country) &&
        Objects.equals(this.dist, digiLockerVerificationGetDocumentResponseSchemaSplitAddress.dist) &&
        Objects.equals(this.house, digiLockerVerificationGetDocumentResponseSchemaSplitAddress.house) &&
        Objects.equals(this.landmark, digiLockerVerificationGetDocumentResponseSchemaSplitAddress.landmark) &&
        Objects.equals(this.pincode, digiLockerVerificationGetDocumentResponseSchemaSplitAddress.pincode) &&
        Objects.equals(this.po, digiLockerVerificationGetDocumentResponseSchemaSplitAddress.po) &&
        Objects.equals(this.state, digiLockerVerificationGetDocumentResponseSchemaSplitAddress.state) &&
        Objects.equals(this.street, digiLockerVerificationGetDocumentResponseSchemaSplitAddress.street) &&
        Objects.equals(this.subdist, digiLockerVerificationGetDocumentResponseSchemaSplitAddress.subdist) &&
        Objects.equals(this.vtc, digiLockerVerificationGetDocumentResponseSchemaSplitAddress.vtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, dist, house, landmark, pincode, po, state, street, subdist, vtc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigiLockerVerificationGetDocumentResponseSchemaSplitAddress {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    dist: ").append(toIndentedString(dist)).append("\n");
    sb.append("    house: ").append(toIndentedString(house)).append("\n");
    sb.append("    landmark: ").append(toIndentedString(landmark)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    po: ").append(toIndentedString(po)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    subdist: ").append(toIndentedString(subdist)).append("\n");
    sb.append("    vtc: ").append(toIndentedString(vtc)).append("\n");
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
    openapiFields.add("country");
    openapiFields.add("dist");
    openapiFields.add("house");
    openapiFields.add("landmark");
    openapiFields.add("pincode");
    openapiFields.add("po");
    openapiFields.add("state");
    openapiFields.add("street");
    openapiFields.add("subdist");
    openapiFields.add("vtc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DigiLockerVerificationGetDocumentResponseSchemaSplitAddress
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("dist") != null && !jsonObj.get("dist").isJsonNull()) && !jsonObj.get("dist").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dist` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dist").toString()));
      }
      if ((jsonObj.get("house") != null && !jsonObj.get("house").isJsonNull()) && !jsonObj.get("house").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `house` to be a primitive type in the JSON string but got `%s`", jsonObj.get("house").toString()));
      }
      if ((jsonObj.get("landmark") != null && !jsonObj.get("landmark").isJsonNull()) && !jsonObj.get("landmark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `landmark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("landmark").toString()));
      }
      if ((jsonObj.get("pincode") != null && !jsonObj.get("pincode").isJsonNull()) && !jsonObj.get("pincode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pincode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pincode").toString()));
      }
      if ((jsonObj.get("po") != null && !jsonObj.get("po").isJsonNull()) && !jsonObj.get("po").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `po` to be a primitive type in the JSON string but got `%s`", jsonObj.get("po").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("street") != null && !jsonObj.get("street").isJsonNull()) && !jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
      if ((jsonObj.get("subdist") != null && !jsonObj.get("subdist").isJsonNull()) && !jsonObj.get("subdist").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subdist` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subdist").toString()));
      }
      if ((jsonObj.get("vtc") != null && !jsonObj.get("vtc").isJsonNull()) && !jsonObj.get("vtc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vtc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vtc").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DigiLockerVerificationGetDocumentResponseSchemaSplitAddress
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("dist") != null && !jsonObj.get("dist").isJsonNull()) && !jsonObj.get("dist").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dist` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dist").toString()));
      }
      if ((jsonObj.get("house") != null && !jsonObj.get("house").isJsonNull()) && !jsonObj.get("house").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `house` to be a primitive type in the JSON string but got `%s`", jsonObj.get("house").toString()));
      }
      if ((jsonObj.get("landmark") != null && !jsonObj.get("landmark").isJsonNull()) && !jsonObj.get("landmark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `landmark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("landmark").toString()));
      }
      if ((jsonObj.get("pincode") != null && !jsonObj.get("pincode").isJsonNull()) && !jsonObj.get("pincode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pincode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pincode").toString()));
      }
      if ((jsonObj.get("po") != null && !jsonObj.get("po").isJsonNull()) && !jsonObj.get("po").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `po` to be a primitive type in the JSON string but got `%s`", jsonObj.get("po").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("street") != null && !jsonObj.get("street").isJsonNull()) && !jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
      if ((jsonObj.get("subdist") != null && !jsonObj.get("subdist").isJsonNull()) && !jsonObj.get("subdist").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subdist` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subdist").toString()));
      }
      if ((jsonObj.get("vtc") != null && !jsonObj.get("vtc").isJsonNull()) && !jsonObj.get("vtc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vtc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vtc").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DigiLockerVerificationGetDocumentResponseSchemaSplitAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DigiLockerVerificationGetDocumentResponseSchemaSplitAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DigiLockerVerificationGetDocumentResponseSchemaSplitAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DigiLockerVerificationGetDocumentResponseSchemaSplitAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<DigiLockerVerificationGetDocumentResponseSchemaSplitAddress>() {
           @Override
           public void write(JsonWriter out, DigiLockerVerificationGetDocumentResponseSchemaSplitAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DigiLockerVerificationGetDocumentResponseSchemaSplitAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DigiLockerVerificationGetDocumentResponseSchemaSplitAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DigiLockerVerificationGetDocumentResponseSchemaSplitAddress
  * @throws IOException if the JSON string is invalid with respect to DigiLockerVerificationGetDocumentResponseSchemaSplitAddress
  */
  public static DigiLockerVerificationGetDocumentResponseSchemaSplitAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DigiLockerVerificationGetDocumentResponseSchemaSplitAddress.class);
  }

 /**
  * Convert an instance of DigiLockerVerificationGetDocumentResponseSchemaSplitAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

