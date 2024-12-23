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
import com.cashfree.model.BulkPanRequestSchemaEntriesInner;
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
 * Find the request parameters to verify a large number of PAN information
 */
@Schema(description = "Find the request parameters to verify a large number of PAN information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-21T07:15:37.235803Z[Etc/UTC]")
public class BulkPanRequestSchema {
  public static final String SERIALIZED_NAME_BULK_VERIFICATION_ID = "bulk_verification_id";
  @SerializedName(SERIALIZED_NAME_BULK_VERIFICATION_ID)
  private String bulkVerificationId = "ABCPV1234D";

  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List<BulkPanRequestSchemaEntriesInner> entries;

  public BulkPanRequestSchema() {
  }

  public BulkPanRequestSchema bulkVerificationId(String bulkVerificationId) {
    
    this.bulkVerificationId = bulkVerificationId;
    return this;
  }

   /**
   * It is the unique ID you create to identify the API request. Only alphanumeric and underscore ( _ ) are allowed.
   * @return bulkVerificationId
  **/
  @javax.annotation.Nullable
  @Schema(example = "ABCPV1234D", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the unique ID you create to identify the API request. Only alphanumeric and underscore ( _ ) are allowed.")
  public String getBulkVerificationId() {
    return bulkVerificationId;
  }


  public void setBulkVerificationId(String bulkVerificationId) {
    this.bulkVerificationId = bulkVerificationId;
  }


  public BulkPanRequestSchema entries(List<BulkPanRequestSchemaEntriesInner> entries) {
    
    this.entries = entries;
    return this;
  }

  public BulkPanRequestSchema addEntriesItem(BulkPanRequestSchemaEntriesInner entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * It is the array of PAN details for verification. PAN and name should be included. The name parameter is optional.
   * @return entries
  **/
  @javax.annotation.Nullable
  @Schema(example = "[{\"name\":\"John Doe\",\"pan\":\"ABCPP3011E\"},{\"name\":\"Jane Doe\",\"pan\":\"ABCPP3022E\"}]", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the array of PAN details for verification. PAN and name should be included. The name parameter is optional.")
  public List<BulkPanRequestSchemaEntriesInner> getEntries() {
    return entries;
  }


  public void setEntries(List<BulkPanRequestSchemaEntriesInner> entries) {
    this.entries = entries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkPanRequestSchema bulkPanRequestSchema = (BulkPanRequestSchema) o;
    return Objects.equals(this.bulkVerificationId, bulkPanRequestSchema.bulkVerificationId) &&
        Objects.equals(this.entries, bulkPanRequestSchema.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkVerificationId, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPanRequestSchema {\n");
    sb.append("    bulkVerificationId: ").append(toIndentedString(bulkVerificationId)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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
    openapiFields.add("bulk_verification_id");
    openapiFields.add("entries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BulkPanRequestSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bulk_verification_id") != null && !jsonObj.get("bulk_verification_id").isJsonNull()) && !jsonObj.get("bulk_verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bulk_verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bulk_verification_id").toString()));
      }
      if (jsonObj.get("entries") != null && !jsonObj.get("entries").isJsonNull()) {
        JsonArray jsonArrayentries = jsonObj.getAsJsonArray("entries");
        if (jsonArrayentries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("entries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `entries` to be an array in the JSON string but got `%s`", jsonObj.get("entries").toString()));
          }

          // validate the optional field `entries` (array)
          for (int i = 0; i < jsonArrayentries.size(); i++) {
            BulkPanRequestSchemaEntriesInner.validateJsonElement(jsonArrayentries.get(i));
          };
        }
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BulkPanRequestSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bulk_verification_id") != null && !jsonObj.get("bulk_verification_id").isJsonNull()) && !jsonObj.get("bulk_verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bulk_verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bulk_verification_id").toString()));
      }
      if (jsonObj.get("entries") != null && !jsonObj.get("entries").isJsonNull()) {
        JsonArray jsonArrayentries = jsonObj.getAsJsonArray("entries");
        if (jsonArrayentries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("entries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `entries` to be an array in the JSON string but got `%s`", jsonObj.get("entries").toString()));
          }

          // validate the optional field `entries` (array)
          for (int i = 0; i < jsonArrayentries.size(); i++) {
            BulkPanRequestSchemaEntriesInner.validateJsonElement(jsonArrayentries.get(i));
          };
        }
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkPanRequestSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkPanRequestSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkPanRequestSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkPanRequestSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkPanRequestSchema>() {
           @Override
           public void write(JsonWriter out, BulkPanRequestSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BulkPanRequestSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BulkPanRequestSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BulkPanRequestSchema
  * @throws IOException if the JSON string is invalid with respect to BulkPanRequestSchema
  */
  public static BulkPanRequestSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkPanRequestSchema.class);
  }

 /**
  * Convert an instance of BulkPanRequestSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

