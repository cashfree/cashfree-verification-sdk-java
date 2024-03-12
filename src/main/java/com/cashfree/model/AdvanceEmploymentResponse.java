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
import com.cashfree.model.AdvanceEmploymentResponseInput;
import com.cashfree.model.AdvanceEmploymentResponseRecentEmploymentDetails;
import com.cashfree.model.AdvanceEmploymentResponseUanDetailsInner;
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
 * Success response for Get Employment Details
 */
@Schema(description = "Success response for Get Employment Details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-12T04:15:15.893702Z[Etc/UTC]")
public class AdvanceEmploymentResponse {
  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private Integer referenceId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private AdvanceEmploymentResponseInput input;

  public static final String SERIALIZED_NAME_UAN_DETAILS = "uan_details";
  @SerializedName(SERIALIZED_NAME_UAN_DETAILS)
  private List<AdvanceEmploymentResponseUanDetailsInner> uanDetails;

  public static final String SERIALIZED_NAME_RECENT_EMPLOYMENT_DETAILS = "recent_employment_details";
  @SerializedName(SERIALIZED_NAME_RECENT_EMPLOYMENT_DETAILS)
  private AdvanceEmploymentResponseRecentEmploymentDetails recentEmploymentDetails;

  public AdvanceEmploymentResponse() {
  }

  public AdvanceEmploymentResponse verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It displays the unique ID you created to identify the verification request.
   * @return verificationId
  **/
  @javax.annotation.Nullable
  @Schema(example = "ABC00123", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID you created to identify the verification request.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public AdvanceEmploymentResponse referenceId(Integer referenceId) {
    
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


  public AdvanceEmploymentResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * It displays the status of the API request.
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(example = "SUCCESS", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the API request.")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AdvanceEmploymentResponse input(AdvanceEmploymentResponseInput input) {
    
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public AdvanceEmploymentResponseInput getInput() {
    return input;
  }


  public void setInput(AdvanceEmploymentResponseInput input) {
    this.input = input;
  }


  public AdvanceEmploymentResponse uanDetails(List<AdvanceEmploymentResponseUanDetailsInner> uanDetails) {
    
    this.uanDetails = uanDetails;
    return this;
  }

  public AdvanceEmploymentResponse addUanDetailsItem(AdvanceEmploymentResponseUanDetailsInner uanDetailsItem) {
    if (this.uanDetails == null) {
      this.uanDetails = new ArrayList<>();
    }
    this.uanDetails.add(uanDetailsItem);
    return this;
  }

   /**
   * It contains the UAN information.
   * @return uanDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It contains the UAN information.")
  public List<AdvanceEmploymentResponseUanDetailsInner> getUanDetails() {
    return uanDetails;
  }


  public void setUanDetails(List<AdvanceEmploymentResponseUanDetailsInner> uanDetails) {
    this.uanDetails = uanDetails;
  }


  public AdvanceEmploymentResponse recentEmploymentDetails(AdvanceEmploymentResponseRecentEmploymentDetails recentEmploymentDetails) {
    
    this.recentEmploymentDetails = recentEmploymentDetails;
    return this;
  }

   /**
   * Get recentEmploymentDetails
   * @return recentEmploymentDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public AdvanceEmploymentResponseRecentEmploymentDetails getRecentEmploymentDetails() {
    return recentEmploymentDetails;
  }


  public void setRecentEmploymentDetails(AdvanceEmploymentResponseRecentEmploymentDetails recentEmploymentDetails) {
    this.recentEmploymentDetails = recentEmploymentDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceEmploymentResponse advanceEmploymentResponse = (AdvanceEmploymentResponse) o;
    return Objects.equals(this.verificationId, advanceEmploymentResponse.verificationId) &&
        Objects.equals(this.referenceId, advanceEmploymentResponse.referenceId) &&
        Objects.equals(this.status, advanceEmploymentResponse.status) &&
        Objects.equals(this.input, advanceEmploymentResponse.input) &&
        Objects.equals(this.uanDetails, advanceEmploymentResponse.uanDetails) &&
        Objects.equals(this.recentEmploymentDetails, advanceEmploymentResponse.recentEmploymentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationId, referenceId, status, input, uanDetails, recentEmploymentDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceEmploymentResponse {\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    uanDetails: ").append(toIndentedString(uanDetails)).append("\n");
    sb.append("    recentEmploymentDetails: ").append(toIndentedString(recentEmploymentDetails)).append("\n");
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
    openapiFields.add("verification_id");
    openapiFields.add("reference_id");
    openapiFields.add("status");
    openapiFields.add("input");
    openapiFields.add("uan_details");
    openapiFields.add("recent_employment_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdvanceEmploymentResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `input`
      if (jsonObj.get("input") != null && !jsonObj.get("input").isJsonNull()) {
        AdvanceEmploymentResponseInput.validateJsonElement(jsonObj.get("input"));
      }
      if (jsonObj.get("uan_details") != null && !jsonObj.get("uan_details").isJsonNull()) {
        JsonArray jsonArrayuanDetails = jsonObj.getAsJsonArray("uan_details");
        if (jsonArrayuanDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("uan_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `uan_details` to be an array in the JSON string but got `%s`", jsonObj.get("uan_details").toString()));
          }

          // validate the optional field `uan_details` (array)
          for (int i = 0; i < jsonArrayuanDetails.size(); i++) {
            AdvanceEmploymentResponseUanDetailsInner.validateJsonElement(jsonArrayuanDetails.get(i));
          };
        }
      }
      // validate the optional field `recent_employment_details`
      if (jsonObj.get("recent_employment_details") != null && !jsonObj.get("recent_employment_details").isJsonNull()) {
        AdvanceEmploymentResponseRecentEmploymentDetails.validateJsonElement(jsonObj.get("recent_employment_details"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdvanceEmploymentResponse
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `input`
      if (jsonObj.get("input") != null && !jsonObj.get("input").isJsonNull()) {
        AdvanceEmploymentResponseInput.validateJsonElement(jsonObj.get("input"));
        return true;
      }
      if (jsonObj.get("uan_details") != null && !jsonObj.get("uan_details").isJsonNull()) {
        JsonArray jsonArrayuanDetails = jsonObj.getAsJsonArray("uan_details");
        if (jsonArrayuanDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("uan_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `uan_details` to be an array in the JSON string but got `%s`", jsonObj.get("uan_details").toString()));
          }

          // validate the optional field `uan_details` (array)
          for (int i = 0; i < jsonArrayuanDetails.size(); i++) {
            AdvanceEmploymentResponseUanDetailsInner.validateJsonElement(jsonArrayuanDetails.get(i));
          };
        }
      }
      // validate the optional field `recent_employment_details`
      if (jsonObj.get("recent_employment_details") != null && !jsonObj.get("recent_employment_details").isJsonNull()) {
        AdvanceEmploymentResponseRecentEmploymentDetails.validateJsonElement(jsonObj.get("recent_employment_details"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvanceEmploymentResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvanceEmploymentResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvanceEmploymentResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvanceEmploymentResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvanceEmploymentResponse>() {
           @Override
           public void write(JsonWriter out, AdvanceEmploymentResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvanceEmploymentResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvanceEmploymentResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvanceEmploymentResponse
  * @throws IOException if the JSON string is invalid with respect to AdvanceEmploymentResponse
  */
  public static AdvanceEmploymentResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvanceEmploymentResponse.class);
  }

 /**
  * Convert an instance of AdvanceEmploymentResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

