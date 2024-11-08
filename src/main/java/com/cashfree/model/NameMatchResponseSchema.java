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

import com.cashfree.JSON;

/**
 * Success response for Name Match API
 */
@Schema(description = "Success response for Name Match API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-08T05:03:36.102379Z[Etc/UTC]")
public class NameMatchResponseSchema {
  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private Integer referenceId;

  public static final String SERIALIZED_NAME_NAME1 = "name_1";
  @SerializedName(SERIALIZED_NAME_NAME1)
  private String name1;

  public static final String SERIALIZED_NAME_NAME2 = "name_2";
  @SerializedName(SERIALIZED_NAME_NAME2)
  private String name2;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private BigDecimal score;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public NameMatchResponseSchema() {
  }

  public NameMatchResponseSchema verificationId(String verificationId) {
    
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


  public NameMatchResponseSchema referenceId(Integer referenceId) {
    
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


  public NameMatchResponseSchema name1(String name1) {
    
    this.name1 = name1;
    return this;
  }

   /**
   * It displays the name you entered for verification.
   * @return name1
  **/
  @javax.annotation.Nullable
  @Schema(example = "John Doe", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name you entered for verification.")
  public String getName1() {
    return name1;
  }


  public void setName1(String name1) {
    this.name1 = name1;
  }


  public NameMatchResponseSchema name2(String name2) {
    
    this.name2 = name2;
    return this;
  }

   /**
   * It displays the name you entered for verificaiton with name_1.
   * @return name2
  **/
  @javax.annotation.Nullable
  @Schema(example = "John Snow", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name you entered for verificaiton with name_1.")
  public String getName2() {
    return name2;
  }


  public void setName2(String name2) {
    this.name2 = name2;
  }


  public NameMatchResponseSchema status(String status) {
    
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


  public NameMatchResponseSchema score(BigDecimal score) {
    
    this.score = score;
    return this;
  }

   /**
   * It displays the score of the name match verification.
   * @return score
  **/
  @javax.annotation.Nullable
  @Schema(example = "0.85", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the score of the name match verification.")
  public BigDecimal getScore() {
    return score;
  }


  public void setScore(BigDecimal score) {
    this.score = score;
  }


  public NameMatchResponseSchema reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * It justifies the match score for the API request.
   * @return reason
  **/
  @javax.annotation.Nullable
  @Schema(example = "The given names are identical", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It justifies the match score for the API request.")
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameMatchResponseSchema nameMatchResponseSchema = (NameMatchResponseSchema) o;
    return Objects.equals(this.verificationId, nameMatchResponseSchema.verificationId) &&
        Objects.equals(this.referenceId, nameMatchResponseSchema.referenceId) &&
        Objects.equals(this.name1, nameMatchResponseSchema.name1) &&
        Objects.equals(this.name2, nameMatchResponseSchema.name2) &&
        Objects.equals(this.status, nameMatchResponseSchema.status) &&
        Objects.equals(this.score, nameMatchResponseSchema.score) &&
        Objects.equals(this.reason, nameMatchResponseSchema.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationId, referenceId, name1, name2, status, score, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameMatchResponseSchema {\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    name1: ").append(toIndentedString(name1)).append("\n");
    sb.append("    name2: ").append(toIndentedString(name2)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
    openapiFields.add("name_1");
    openapiFields.add("name_2");
    openapiFields.add("status");
    openapiFields.add("score");
    openapiFields.add("reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NameMatchResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("name_1") != null && !jsonObj.get("name_1").isJsonNull()) && !jsonObj.get("name_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_1").toString()));
      }
      if ((jsonObj.get("name_2") != null && !jsonObj.get("name_2").isJsonNull()) && !jsonObj.get("name_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_2").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NameMatchResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("name_1") != null && !jsonObj.get("name_1").isJsonNull()) && !jsonObj.get("name_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_1").toString()));
      }
      if ((jsonObj.get("name_2") != null && !jsonObj.get("name_2").isJsonNull()) && !jsonObj.get("name_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_2").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NameMatchResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NameMatchResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NameMatchResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NameMatchResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<NameMatchResponseSchema>() {
           @Override
           public void write(JsonWriter out, NameMatchResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NameMatchResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NameMatchResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NameMatchResponseSchema
  * @throws IOException if the JSON string is invalid with respect to NameMatchResponseSchema
  */
  public static NameMatchResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NameMatchResponseSchema.class);
  }

 /**
  * Convert an instance of NameMatchResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

