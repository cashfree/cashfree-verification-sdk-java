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
 * Find the request parameters for the Name Match API
 */
@Schema(description = "Find the request parameters for the Name Match API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T06:41:28.648290Z[Etc/UTC]")
public class NameMatchRequestSchema {
  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId = "ABC00123";

  public static final String SERIALIZED_NAME_NAME1 = "name_1";
  @SerializedName(SERIALIZED_NAME_NAME1)
  private String name1 = "JOHN DOE";

  public static final String SERIALIZED_NAME_NAME2 = "name_2";
  @SerializedName(SERIALIZED_NAME_NAME2)
  private String name2 = "JOHN DOE";

  public NameMatchRequestSchema() {
  }

  public NameMatchRequestSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It is the unique ID you need to create to identify the verification request. The maximum character limit is 50. Only alphanumeric, period (.), hyphen (-) and underscore ( _ ) are allowed.
   * @return verificationId
  **/
  @javax.annotation.Nonnull
  @Schema(example = "ABC00123", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the unique ID you need to create to identify the verification request. The maximum character limit is 50. Only alphanumeric, period (.), hyphen (-) and underscore ( _ ) are allowed.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public NameMatchRequestSchema name1(String name1) {
    
    this.name1 = name1;
    return this;
  }

   /**
   * It is the name you want to verify.
   * @return name1
  **/
  @javax.annotation.Nonnull
  @Schema(example = "JOHN DOE", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the name you want to verify.")
  public String getName1() {
    return name1;
  }


  public void setName1(String name1) {
    this.name1 = name1;
  }


  public NameMatchRequestSchema name2(String name2) {
    
    this.name2 = name2;
    return this;
  }

   /**
   * It is the name you want to verify with name_1.
   * @return name2
  **/
  @javax.annotation.Nonnull
  @Schema(example = "JOHN DOE", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the name you want to verify with name_1.")
  public String getName2() {
    return name2;
  }


  public void setName2(String name2) {
    this.name2 = name2;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameMatchRequestSchema nameMatchRequestSchema = (NameMatchRequestSchema) o;
    return Objects.equals(this.verificationId, nameMatchRequestSchema.verificationId) &&
        Objects.equals(this.name1, nameMatchRequestSchema.name1) &&
        Objects.equals(this.name2, nameMatchRequestSchema.name2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationId, name1, name2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameMatchRequestSchema {\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    name1: ").append(toIndentedString(name1)).append("\n");
    sb.append("    name2: ").append(toIndentedString(name2)).append("\n");
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
    openapiFields.add("name_1");
    openapiFields.add("name_2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("verification_id");
    openapiRequiredFields.add("name_1");
    openapiRequiredFields.add("name_2");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NameMatchRequestSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NameMatchRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if (!jsonObj.get("name_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_1").toString()));
      }
      if (!jsonObj.get("name_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_2").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NameMatchRequestSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NameMatchRequestSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if (!jsonObj.get("name_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_1").toString()));
      }
      if (!jsonObj.get("name_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_2").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NameMatchRequestSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NameMatchRequestSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NameMatchRequestSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NameMatchRequestSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<NameMatchRequestSchema>() {
           @Override
           public void write(JsonWriter out, NameMatchRequestSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NameMatchRequestSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NameMatchRequestSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NameMatchRequestSchema
  * @throws IOException if the JSON string is invalid with respect to NameMatchRequestSchema
  */
  public static NameMatchRequestSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NameMatchRequestSchema.class);
  }

 /**
  * Convert an instance of NameMatchRequestSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

