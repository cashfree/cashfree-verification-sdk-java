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
 * Success response for Liveliness Check API
 */
@Schema(description = "Success response for Liveliness Check API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T11:12:20.695812Z[Etc/UTC]")
public class LivelinessResponseSchema {
  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private Integer referenceId;

  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_LIVELINESS = "liveliness";
  @SerializedName(SERIALIZED_NAME_LIVELINESS)
  private Boolean liveliness;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Float score;

  public LivelinessResponseSchema() {
  }

  public LivelinessResponseSchema referenceId(Integer referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * It displays the unique ID created by Cashfree Payments for reference purposes.
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @Schema(example = "1357", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by Cashfree Payments for reference purposes.")
  public Integer getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(Integer referenceId) {
    this.referenceId = referenceId;
  }


  public LivelinessResponseSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It displays the unique ID you created to identify the API request.
   * @return verificationId
  **/
  @javax.annotation.Nullable
  @Schema(example = "123456789", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID you created to identify the API request.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public LivelinessResponseSchema status(String status) {
    
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


  public LivelinessResponseSchema liveliness(Boolean liveliness) {
    
    this.liveliness = liveliness;
    return this;
  }

   /**
   * It displays the result of the liveliness check.
   * @return liveliness
  **/
  @javax.annotation.Nullable
  @Schema(example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the result of the liveliness check.")
  public Boolean getLiveliness() {
    return liveliness;
  }


  public void setLiveliness(Boolean liveliness) {
    this.liveliness = liveliness;
  }


  public LivelinessResponseSchema score(Float score) {
    
    this.score = score;
    return this;
  }

   /**
   * It displays the score of the liveliness check.
   * minimum: 0
   * maximum: 1
   * @return score
  **/
  @javax.annotation.Nullable
  @Schema(example = "0.95", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the score of the liveliness check.")
  public Float getScore() {
    return score;
  }


  public void setScore(Float score) {
    this.score = score;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LivelinessResponseSchema livelinessResponseSchema = (LivelinessResponseSchema) o;
    return Objects.equals(this.referenceId, livelinessResponseSchema.referenceId) &&
        Objects.equals(this.verificationId, livelinessResponseSchema.verificationId) &&
        Objects.equals(this.status, livelinessResponseSchema.status) &&
        Objects.equals(this.liveliness, livelinessResponseSchema.liveliness) &&
        Objects.equals(this.score, livelinessResponseSchema.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, verificationId, status, liveliness, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LivelinessResponseSchema {\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    liveliness: ").append(toIndentedString(liveliness)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
    openapiFields.add("liveliness");
    openapiFields.add("score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LivelinessResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LivelinessResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LivelinessResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LivelinessResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LivelinessResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LivelinessResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<LivelinessResponseSchema>() {
           @Override
           public void write(JsonWriter out, LivelinessResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LivelinessResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LivelinessResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LivelinessResponseSchema
  * @throws IOException if the JSON string is invalid with respect to LivelinessResponseSchema
  */
  public static LivelinessResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LivelinessResponseSchema.class);
  }

 /**
  * Convert an instance of LivelinessResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

