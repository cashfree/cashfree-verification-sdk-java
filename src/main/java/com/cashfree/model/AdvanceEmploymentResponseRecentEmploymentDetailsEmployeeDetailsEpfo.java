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
 * It contains the information found in Employees&#39; Provident Fund Organisation (EPFO)
 */
@Schema(description = "It contains the information found in Employees' Provident Fund Organisation (EPFO)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T11:46:16.350886Z[Etc/UTC]")
public class AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo {
  public static final String SERIALIZED_NAME_RECENT = "recent";
  @SerializedName(SERIALIZED_NAME_RECENT)
  private Boolean recent;

  public static final String SERIALIZED_NAME_NAME_UNIQUE = "name_unique";
  @SerializedName(SERIALIZED_NAME_NAME_UNIQUE)
  private Boolean nameUnique;

  public static final String SERIALIZED_NAME_PF_FILINGS_DETAILS = "pf_filings_details";
  @SerializedName(SERIALIZED_NAME_PF_FILINGS_DETAILS)
  private Boolean pfFilingsDetails;

  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo() {
  }

  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo recent(Boolean recent) {
    
    this.recent = recent;
    return this;
  }

   /**
   * It displays whether the retrieved information is recent.
   * @return recent
  **/
  @javax.annotation.Nullable
  @Schema(example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays whether the retrieved information is recent.")
  public Boolean getRecent() {
    return recent;
  }


  public void setRecent(Boolean recent) {
    this.recent = recent;
  }


  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo nameUnique(Boolean nameUnique) {
    
    this.nameUnique = nameUnique;
    return this;
  }

   /**
   * It displays whether the retrieved name is unique.
   * @return nameUnique
  **/
  @javax.annotation.Nullable
  @Schema(example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays whether the retrieved name is unique.")
  public Boolean getNameUnique() {
    return nameUnique;
  }


  public void setNameUnique(Boolean nameUnique) {
    this.nameUnique = nameUnique;
  }


  public AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo pfFilingsDetails(Boolean pfFilingsDetails) {
    
    this.pfFilingsDetails = pfFilingsDetails;
    return this;
  }

   /**
   * It displays whether the PF filing details are true.
   * @return pfFilingsDetails
  **/
  @javax.annotation.Nullable
  @Schema(example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays whether the PF filing details are true.")
  public Boolean getPfFilingsDetails() {
    return pfFilingsDetails;
  }


  public void setPfFilingsDetails(Boolean pfFilingsDetails) {
    this.pfFilingsDetails = pfFilingsDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo advanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo = (AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo) o;
    return Objects.equals(this.recent, advanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo.recent) &&
        Objects.equals(this.nameUnique, advanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo.nameUnique) &&
        Objects.equals(this.pfFilingsDetails, advanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo.pfFilingsDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recent, nameUnique, pfFilingsDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo {\n");
    sb.append("    recent: ").append(toIndentedString(recent)).append("\n");
    sb.append("    nameUnique: ").append(toIndentedString(nameUnique)).append("\n");
    sb.append("    pfFilingsDetails: ").append(toIndentedString(pfFilingsDetails)).append("\n");
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
    openapiFields.add("recent");
    openapiFields.add("name_unique");
    openapiFields.add("pf_filings_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo>() {
           @Override
           public void write(JsonWriter out, AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo
  * @throws IOException if the JSON string is invalid with respect to AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo
  */
  public static AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo.class);
  }

 /**
  * Convert an instance of AdvanceEmploymentResponseRecentEmploymentDetailsEmployeeDetailsEpfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

