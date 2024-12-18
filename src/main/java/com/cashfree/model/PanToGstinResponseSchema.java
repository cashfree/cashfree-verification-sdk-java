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
import com.cashfree.model.PanToGstinResponseSchemaGstinListInner;
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
 * Success response for Fetch GSTIN with PAN
 */
@Schema(description = "Success response for Fetch GSTIN with PAN")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T11:12:20.695812Z[Etc/UTC]")
public class PanToGstinResponseSchema {
  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private Integer referenceId;

  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_PAN = "pan";
  @SerializedName(SERIALIZED_NAME_PAN)
  private String pan;

  public static final String SERIALIZED_NAME_GSTIN_LIST = "gstin_list";
  @SerializedName(SERIALIZED_NAME_GSTIN_LIST)
  private List<PanToGstinResponseSchemaGstinListInner> gstinList;

  public PanToGstinResponseSchema() {
  }

  public PanToGstinResponseSchema referenceId(Integer referenceId) {
    
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


  public PanToGstinResponseSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It displays the unique ID you create to identity the verification request.
   * @return verificationId
  **/
  @javax.annotation.Nullable
  @Schema(example = "testverificationid", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID you create to identity the verification request.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public PanToGstinResponseSchema status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * It displays the status of the API request. 
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(example = "SUCCESS", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the API request. ")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public PanToGstinResponseSchema message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * It displays details about the success or failure of the API request.
   * @return message
  **/
  @javax.annotation.Nullable
  @Schema(example = "Gstins List found", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays details about the success or failure of the API request.")
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public PanToGstinResponseSchema pan(String pan) {
    
    this.pan = pan;
    return this;
  }

   /**
   * It displays the entered PAN information in the request.
   * @return pan
  **/
  @javax.annotation.Nullable
  @Schema(example = "AZJPG7110R", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the entered PAN information in the request.")
  public String getPan() {
    return pan;
  }


  public void setPan(String pan) {
    this.pan = pan;
  }


  public PanToGstinResponseSchema gstinList(List<PanToGstinResponseSchemaGstinListInner> gstinList) {
    
    this.gstinList = gstinList;
    return this;
  }

  public PanToGstinResponseSchema addGstinListItem(PanToGstinResponseSchemaGstinListInner gstinListItem) {
    if (this.gstinList == null) {
      this.gstinList = new ArrayList<>();
    }
    this.gstinList.add(gstinListItem);
    return this;
  }

   /**
   * It displays the list of GSTIN associated with the entered PAN.
   * @return gstinList
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the list of GSTIN associated with the entered PAN.")
  public List<PanToGstinResponseSchemaGstinListInner> getGstinList() {
    return gstinList;
  }


  public void setGstinList(List<PanToGstinResponseSchemaGstinListInner> gstinList) {
    this.gstinList = gstinList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PanToGstinResponseSchema panToGstinResponseSchema = (PanToGstinResponseSchema) o;
    return Objects.equals(this.referenceId, panToGstinResponseSchema.referenceId) &&
        Objects.equals(this.verificationId, panToGstinResponseSchema.verificationId) &&
        Objects.equals(this.status, panToGstinResponseSchema.status) &&
        Objects.equals(this.message, panToGstinResponseSchema.message) &&
        Objects.equals(this.pan, panToGstinResponseSchema.pan) &&
        Objects.equals(this.gstinList, panToGstinResponseSchema.gstinList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, verificationId, status, message, pan, gstinList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PanToGstinResponseSchema {\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    gstinList: ").append(toIndentedString(gstinList)).append("\n");
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
    openapiFields.add("verification_id");
    openapiFields.add("status");
    openapiFields.add("message");
    openapiFields.add("pan");
    openapiFields.add("gstin_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PanToGstinResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("pan") != null && !jsonObj.get("pan").isJsonNull()) && !jsonObj.get("pan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan").toString()));
      }
      if (jsonObj.get("gstin_list") != null && !jsonObj.get("gstin_list").isJsonNull()) {
        JsonArray jsonArraygstinList = jsonObj.getAsJsonArray("gstin_list");
        if (jsonArraygstinList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("gstin_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `gstin_list` to be an array in the JSON string but got `%s`", jsonObj.get("gstin_list").toString()));
          }

          // validate the optional field `gstin_list` (array)
          for (int i = 0; i < jsonArraygstinList.size(); i++) {
            PanToGstinResponseSchemaGstinListInner.validateJsonElement(jsonArraygstinList.get(i));
          };
        }
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PanToGstinResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("pan") != null && !jsonObj.get("pan").isJsonNull()) && !jsonObj.get("pan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan").toString()));
      }
      if (jsonObj.get("gstin_list") != null && !jsonObj.get("gstin_list").isJsonNull()) {
        JsonArray jsonArraygstinList = jsonObj.getAsJsonArray("gstin_list");
        if (jsonArraygstinList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("gstin_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `gstin_list` to be an array in the JSON string but got `%s`", jsonObj.get("gstin_list").toString()));
          }

          // validate the optional field `gstin_list` (array)
          for (int i = 0; i < jsonArraygstinList.size(); i++) {
            PanToGstinResponseSchemaGstinListInner.validateJsonElement(jsonArraygstinList.get(i));
          };
        }
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PanToGstinResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PanToGstinResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PanToGstinResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PanToGstinResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<PanToGstinResponseSchema>() {
           @Override
           public void write(JsonWriter out, PanToGstinResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PanToGstinResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PanToGstinResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PanToGstinResponseSchema
  * @throws IOException if the JSON string is invalid with respect to PanToGstinResponseSchema
  */
  public static PanToGstinResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PanToGstinResponseSchema.class);
  }

 /**
  * Convert an instance of PanToGstinResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

