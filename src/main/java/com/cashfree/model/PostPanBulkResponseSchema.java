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
 * Success response for verifying a large number of PAN information
 */
@Schema(description = "Success response for verifying a large number of PAN information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T11:12:20.695812Z[Etc/UTC]")
public class PostPanBulkResponseSchema {
  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private Long referenceId;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public PostPanBulkResponseSchema() {
  }

  public PostPanBulkResponseSchema referenceId(Long referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * It displays the unique ID created by Cashfree Payments for reference purposes.
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @Schema(example = "612", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by Cashfree Payments for reference purposes.")
  public Long getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(Long referenceId) {
    this.referenceId = referenceId;
  }


  public PostPanBulkResponseSchema message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * It displays details about the success or failure of the API request.
   * @return message
  **/
  @javax.annotation.Nullable
  @Schema(example = "Request accepted. You can check the status after some time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays details about the success or failure of the API request.")
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPanBulkResponseSchema postPanBulkResponseSchema = (PostPanBulkResponseSchema) o;
    return Objects.equals(this.referenceId, postPanBulkResponseSchema.referenceId) &&
        Objects.equals(this.message, postPanBulkResponseSchema.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPanBulkResponseSchema {\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PostPanBulkResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PostPanBulkResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostPanBulkResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostPanBulkResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostPanBulkResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostPanBulkResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<PostPanBulkResponseSchema>() {
           @Override
           public void write(JsonWriter out, PostPanBulkResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostPanBulkResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostPanBulkResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostPanBulkResponseSchema
  * @throws IOException if the JSON string is invalid with respect to PostPanBulkResponseSchema
  */
  public static PostPanBulkResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostPanBulkResponseSchema.class);
  }

 /**
  * Convert an instance of PostPanBulkResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

