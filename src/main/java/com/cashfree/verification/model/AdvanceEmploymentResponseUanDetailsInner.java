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
import com.cashfree.verification.model.AdvanceEmploymentResponseUanDetailsInnerAdditionalDetails;
import com.cashfree.verification.model.AdvanceEmploymentResponseUanDetailsInnerBasicDetails;
import com.cashfree.verification.model.AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
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
 * It contains the information in individual components.
 */
@Schema(description = "It contains the information in individual components.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T10:11:49.428720Z[Etc/UTC]")
public class AdvanceEmploymentResponseUanDetailsInner {
  public static final String SERIALIZED_NAME_UAN = "uan";
  @SerializedName(SERIALIZED_NAME_UAN)
  private String uan;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_SOURCE_SCORE = "source_score";
  @SerializedName(SERIALIZED_NAME_SOURCE_SCORE)
  private BigDecimal sourceScore;

  public static final String SERIALIZED_NAME_BASIC_DETAILS = "basic_details";
  @SerializedName(SERIALIZED_NAME_BASIC_DETAILS)
  private AdvanceEmploymentResponseUanDetailsInnerBasicDetails basicDetails;

  public static final String SERIALIZED_NAME_EMPLOYMENT_DETAILS = "employment_details";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_DETAILS)
  private AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails employmentDetails;

  public static final String SERIALIZED_NAME_ADDITIONAL_DETAILS = "additional_details";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DETAILS)
  private AdvanceEmploymentResponseUanDetailsInnerAdditionalDetails additionalDetails;

  public AdvanceEmploymentResponseUanDetailsInner() {
  }

  public AdvanceEmploymentResponseUanDetailsInner uan(String uan) {
    
    this.uan = uan;
    return this;
  }

   /**
   * It displays the Universal Account Number (UAN) information of the employee.
   * @return uan
  **/
  @javax.annotation.Nullable
  @Schema(example = "101340612345", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the Universal Account Number (UAN) information of the employee.")
  public String getUan() {
    return uan;
  }


  public void setUan(String uan) {
    this.uan = uan;
  }


  public AdvanceEmploymentResponseUanDetailsInner source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * It displays the
   * @return source
  **/
  @javax.annotation.Nullable
  @Schema(example = "dob and name", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the")
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public AdvanceEmploymentResponseUanDetailsInner sourceScore(BigDecimal sourceScore) {
    
    this.sourceScore = sourceScore;
    return this;
  }

   /**
   * It displays the
   * @return sourceScore
  **/
  @javax.annotation.Nullable
  @Schema(example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the")
  public BigDecimal getSourceScore() {
    return sourceScore;
  }


  public void setSourceScore(BigDecimal sourceScore) {
    this.sourceScore = sourceScore;
  }


  public AdvanceEmploymentResponseUanDetailsInner basicDetails(AdvanceEmploymentResponseUanDetailsInnerBasicDetails basicDetails) {
    
    this.basicDetails = basicDetails;
    return this;
  }

   /**
   * Get basicDetails
   * @return basicDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public AdvanceEmploymentResponseUanDetailsInnerBasicDetails getBasicDetails() {
    return basicDetails;
  }


  public void setBasicDetails(AdvanceEmploymentResponseUanDetailsInnerBasicDetails basicDetails) {
    this.basicDetails = basicDetails;
  }


  public AdvanceEmploymentResponseUanDetailsInner employmentDetails(AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails employmentDetails) {
    
    this.employmentDetails = employmentDetails;
    return this;
  }

   /**
   * Get employmentDetails
   * @return employmentDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails getEmploymentDetails() {
    return employmentDetails;
  }


  public void setEmploymentDetails(AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails employmentDetails) {
    this.employmentDetails = employmentDetails;
  }


  public AdvanceEmploymentResponseUanDetailsInner additionalDetails(AdvanceEmploymentResponseUanDetailsInnerAdditionalDetails additionalDetails) {
    
    this.additionalDetails = additionalDetails;
    return this;
  }

   /**
   * Get additionalDetails
   * @return additionalDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public AdvanceEmploymentResponseUanDetailsInnerAdditionalDetails getAdditionalDetails() {
    return additionalDetails;
  }


  public void setAdditionalDetails(AdvanceEmploymentResponseUanDetailsInnerAdditionalDetails additionalDetails) {
    this.additionalDetails = additionalDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceEmploymentResponseUanDetailsInner advanceEmploymentResponseUanDetailsInner = (AdvanceEmploymentResponseUanDetailsInner) o;
    return Objects.equals(this.uan, advanceEmploymentResponseUanDetailsInner.uan) &&
        Objects.equals(this.source, advanceEmploymentResponseUanDetailsInner.source) &&
        Objects.equals(this.sourceScore, advanceEmploymentResponseUanDetailsInner.sourceScore) &&
        Objects.equals(this.basicDetails, advanceEmploymentResponseUanDetailsInner.basicDetails) &&
        Objects.equals(this.employmentDetails, advanceEmploymentResponseUanDetailsInner.employmentDetails) &&
        Objects.equals(this.additionalDetails, advanceEmploymentResponseUanDetailsInner.additionalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uan, source, sourceScore, basicDetails, employmentDetails, additionalDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceEmploymentResponseUanDetailsInner {\n");
    sb.append("    uan: ").append(toIndentedString(uan)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceScore: ").append(toIndentedString(sourceScore)).append("\n");
    sb.append("    basicDetails: ").append(toIndentedString(basicDetails)).append("\n");
    sb.append("    employmentDetails: ").append(toIndentedString(employmentDetails)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
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
    openapiFields.add("uan");
    openapiFields.add("source");
    openapiFields.add("source_score");
    openapiFields.add("basic_details");
    openapiFields.add("employment_details");
    openapiFields.add("additional_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdvanceEmploymentResponseUanDetailsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uan") != null && !jsonObj.get("uan").isJsonNull()) && !jsonObj.get("uan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uan").toString()));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      // validate the optional field `basic_details`
      if (jsonObj.get("basic_details") != null && !jsonObj.get("basic_details").isJsonNull()) {
        AdvanceEmploymentResponseUanDetailsInnerBasicDetails.validateJsonElement(jsonObj.get("basic_details"));
      }
      // validate the optional field `employment_details`
      if (jsonObj.get("employment_details") != null && !jsonObj.get("employment_details").isJsonNull()) {
        AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails.validateJsonElement(jsonObj.get("employment_details"));
      }
      // validate the optional field `additional_details`
      if (jsonObj.get("additional_details") != null && !jsonObj.get("additional_details").isJsonNull()) {
        AdvanceEmploymentResponseUanDetailsInnerAdditionalDetails.validateJsonElement(jsonObj.get("additional_details"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdvanceEmploymentResponseUanDetailsInner
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uan") != null && !jsonObj.get("uan").isJsonNull()) && !jsonObj.get("uan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uan").toString()));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      // validate the optional field `basic_details`
      if (jsonObj.get("basic_details") != null && !jsonObj.get("basic_details").isJsonNull()) {
        AdvanceEmploymentResponseUanDetailsInnerBasicDetails.validateJsonElement(jsonObj.get("basic_details"));
        return true;
      }
      // validate the optional field `employment_details`
      if (jsonObj.get("employment_details") != null && !jsonObj.get("employment_details").isJsonNull()) {
        AdvanceEmploymentResponseUanDetailsInnerEmploymentDetails.validateJsonElement(jsonObj.get("employment_details"));
        return true;
      }
      // validate the optional field `additional_details`
      if (jsonObj.get("additional_details") != null && !jsonObj.get("additional_details").isJsonNull()) {
        AdvanceEmploymentResponseUanDetailsInnerAdditionalDetails.validateJsonElement(jsonObj.get("additional_details"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvanceEmploymentResponseUanDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvanceEmploymentResponseUanDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvanceEmploymentResponseUanDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvanceEmploymentResponseUanDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvanceEmploymentResponseUanDetailsInner>() {
           @Override
           public void write(JsonWriter out, AdvanceEmploymentResponseUanDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvanceEmploymentResponseUanDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvanceEmploymentResponseUanDetailsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvanceEmploymentResponseUanDetailsInner
  * @throws IOException if the JSON string is invalid with respect to AdvanceEmploymentResponseUanDetailsInner
  */
  public static AdvanceEmploymentResponseUanDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvanceEmploymentResponseUanDetailsInner.class);
  }

 /**
  * Convert an instance of AdvanceEmploymentResponseUanDetailsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

