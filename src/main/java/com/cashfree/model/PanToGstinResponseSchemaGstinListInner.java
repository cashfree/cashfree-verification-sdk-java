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
 * PanToGstinResponseSchemaGstinListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T06:41:28.648290Z[Etc/UTC]")
public class PanToGstinResponseSchemaGstinListInner {
  public static final String SERIALIZED_NAME_GSTIN = "gstin";
  @SerializedName(SERIALIZED_NAME_GSTIN)
  private String gstin;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public PanToGstinResponseSchemaGstinListInner() {
  }

  public PanToGstinResponseSchemaGstinListInner gstin(String gstin) {
    
    this.gstin = gstin;
    return this;
  }

   /**
   * It displays the GSTIN information.
   * @return gstin
  **/
  @javax.annotation.Nullable
  @Schema(example = "29AAFCD5862R1ZR", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the GSTIN information.")
  public String getGstin() {
    return gstin;
  }


  public void setGstin(String gstin) {
    this.gstin = gstin;
  }


  public PanToGstinResponseSchemaGstinListInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * It displays the status of the GSTIN associated with the entered PAN.
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(example = "ACTIVE", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the GSTIN associated with the entered PAN.")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public PanToGstinResponseSchemaGstinListInner state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * It displays the name of the state.
   * @return state
  **/
  @javax.annotation.Nullable
  @Schema(example = "KARNATAKA", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the state.")
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PanToGstinResponseSchemaGstinListInner panToGstinResponseSchemaGstinListInner = (PanToGstinResponseSchemaGstinListInner) o;
    return Objects.equals(this.gstin, panToGstinResponseSchemaGstinListInner.gstin) &&
        Objects.equals(this.status, panToGstinResponseSchemaGstinListInner.status) &&
        Objects.equals(this.state, panToGstinResponseSchemaGstinListInner.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gstin, status, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PanToGstinResponseSchemaGstinListInner {\n");
    sb.append("    gstin: ").append(toIndentedString(gstin)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("gstin");
    openapiFields.add("status");
    openapiFields.add("state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PanToGstinResponseSchemaGstinListInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("gstin") != null && !jsonObj.get("gstin").isJsonNull()) && !jsonObj.get("gstin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gstin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gstin").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PanToGstinResponseSchemaGstinListInner
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("gstin") != null && !jsonObj.get("gstin").isJsonNull()) && !jsonObj.get("gstin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gstin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gstin").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PanToGstinResponseSchemaGstinListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PanToGstinResponseSchemaGstinListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PanToGstinResponseSchemaGstinListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PanToGstinResponseSchemaGstinListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PanToGstinResponseSchemaGstinListInner>() {
           @Override
           public void write(JsonWriter out, PanToGstinResponseSchemaGstinListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PanToGstinResponseSchemaGstinListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PanToGstinResponseSchemaGstinListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PanToGstinResponseSchemaGstinListInner
  * @throws IOException if the JSON string is invalid with respect to PanToGstinResponseSchemaGstinListInner
  */
  public static PanToGstinResponseSchemaGstinListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PanToGstinResponseSchemaGstinListInner.class);
  }

 /**
  * Convert an instance of PanToGstinResponseSchemaGstinListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

