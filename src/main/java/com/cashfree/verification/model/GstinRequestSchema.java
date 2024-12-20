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
 * Find the request parameters to verify GSTIN information
 */
@Schema(description = "Find the request parameters to verify GSTIN information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T10:11:49.428720Z[Etc/UTC]")
public class GstinRequestSchema {
  public static final String SERIALIZED_NAME_G_S_T_I_N = "GSTIN";
  @SerializedName(SERIALIZED_NAME_G_S_T_I_N)
  private String GSTIN = "22AAAAA0000A1Z5";

  public static final String SERIALIZED_NAME_BUSINESS_NAME = "businessName";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME)
  private String businessName = "Cashfree";

  public GstinRequestSchema() {
  }

  public GstinRequestSchema GSTIN(String GSTIN) {
    
    this.GSTIN = GSTIN;
    return this;
  }

   /**
   * It is the unique number assigned to businesses registered under the Goods and Services Tax (GST) system in India.
   * @return GSTIN
  **/
  @javax.annotation.Nonnull
  @Schema(example = "22AAAAA0000A1Z5", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the unique number assigned to businesses registered under the Goods and Services Tax (GST) system in India.")
  public String getGSTIN() {
    return GSTIN;
  }


  public void setGSTIN(String GSTIN) {
    this.GSTIN = GSTIN;
  }


  public GstinRequestSchema businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * It is the name of the business to which the GSTIN is issued. The maximum character limit is 100.
   * @return businessName
  **/
  @javax.annotation.Nullable
  @Schema(example = "Cashfree", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the name of the business to which the GSTIN is issued. The maximum character limit is 100.")
  public String getBusinessName() {
    return businessName;
  }


  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GstinRequestSchema gstinRequestSchema = (GstinRequestSchema) o;
    return Objects.equals(this.GSTIN, gstinRequestSchema.GSTIN) &&
        Objects.equals(this.businessName, gstinRequestSchema.businessName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GSTIN, businessName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GstinRequestSchema {\n");
    sb.append("    GSTIN: ").append(toIndentedString(GSTIN)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
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
    openapiFields.add("GSTIN");
    openapiFields.add("businessName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GSTIN");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GstinRequestSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GstinRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("GSTIN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GSTIN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GSTIN").toString()));
      }
      if ((jsonObj.get("businessName") != null && !jsonObj.get("businessName").isJsonNull()) && !jsonObj.get("businessName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessName").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GstinRequestSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GstinRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("GSTIN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GSTIN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GSTIN").toString()));
      }
      if ((jsonObj.get("businessName") != null && !jsonObj.get("businessName").isJsonNull()) && !jsonObj.get("businessName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessName").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GstinRequestSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GstinRequestSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GstinRequestSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GstinRequestSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<GstinRequestSchema>() {
           @Override
           public void write(JsonWriter out, GstinRequestSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GstinRequestSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GstinRequestSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GstinRequestSchema
  * @throws IOException if the JSON string is invalid with respect to GstinRequestSchema
  */
  public static GstinRequestSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GstinRequestSchema.class);
  }

 /**
  * Convert an instance of GstinRequestSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

