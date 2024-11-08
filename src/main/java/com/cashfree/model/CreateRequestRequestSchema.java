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
 * Find the request parameters to create a reverse penny order request
 */
@Schema(description = "Find the request parameters to create a reverse penny order request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-08T05:03:36.102379Z[Etc/UTC]")
public class CreateRequestRequestSchema {
  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId = "11";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "John Doe";

  public CreateRequestRequestSchema() {
  }

  public CreateRequestRequestSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It is the unique ID you create to identify the API request. The maximum character limit is 50. Only alphanumeric, hyphen (-), period (.), and underscore ( _ ) are allowed.
   * @return verificationId
  **/
  @javax.annotation.Nullable
  @Schema(example = "11", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the unique ID you create to identify the API request. The maximum character limit is 50. Only alphanumeric, hyphen (-), period (.), and underscore ( _ ) are allowed.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public CreateRequestRequestSchema name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * It is the name of the UPI VPA account holder.
   * @return name
  **/
  @javax.annotation.Nullable
  @Schema(example = "John Doe", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the name of the UPI VPA account holder.")
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRequestRequestSchema createRequestRequestSchema = (CreateRequestRequestSchema) o;
    return Objects.equals(this.verificationId, createRequestRequestSchema.verificationId) &&
        Objects.equals(this.name, createRequestRequestSchema.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRequestRequestSchema {\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateRequestRequestSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateRequestRequestSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateRequestRequestSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateRequestRequestSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateRequestRequestSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateRequestRequestSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateRequestRequestSchema>() {
           @Override
           public void write(JsonWriter out, CreateRequestRequestSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateRequestRequestSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateRequestRequestSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateRequestRequestSchema
  * @throws IOException if the JSON string is invalid with respect to CreateRequestRequestSchema
  */
  public static CreateRequestRequestSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateRequestRequestSchema.class);
  }

 /**
  * Convert an instance of CreateRequestRequestSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

