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
 * Success response for Face Match API
 */
@Schema(description = "Success response for Face Match API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T06:30:36.549576Z[Etc/UTC]")
public class FaceMatchResponseSchema {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_REF_ID = "ref_id";
  @SerializedName(SERIALIZED_NAME_REF_ID)
  private Integer refId;

  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public static final String SERIALIZED_NAME_FACE_MATCH_RESULT = "face_match_result";
  @SerializedName(SERIALIZED_NAME_FACE_MATCH_RESULT)
  private String faceMatchResult;

  public static final String SERIALIZED_NAME_FACE_MATCH_SCORE = "face_match_score";
  @SerializedName(SERIALIZED_NAME_FACE_MATCH_SCORE)
  private BigDecimal faceMatchScore;

  public static final String SERIALIZED_NAME_MASK_DETECTED_FIRST_IMAGE = "maskDetected_first_image";
  @SerializedName(SERIALIZED_NAME_MASK_DETECTED_FIRST_IMAGE)
  private Boolean maskDetectedFirstImage;

  public static final String SERIALIZED_NAME_MASK_DETECTED_SCORE_FIRST_IMAGE = "maskDetected_score_first_image";
  @SerializedName(SERIALIZED_NAME_MASK_DETECTED_SCORE_FIRST_IMAGE)
  private String maskDetectedScoreFirstImage;

  public static final String SERIALIZED_NAME_MASK_DETECTED_SECOND_IMAGE = "maskDetected_second_image";
  @SerializedName(SERIALIZED_NAME_MASK_DETECTED_SECOND_IMAGE)
  private Boolean maskDetectedSecondImage;

  public static final String SERIALIZED_NAME_MASK_DETECTED_SCORE_SECOND_IMAGE = "maskDetected_score_second_image";
  @SerializedName(SERIALIZED_NAME_MASK_DETECTED_SCORE_SECOND_IMAGE)
  private String maskDetectedScoreSecondImage;

  public FaceMatchResponseSchema() {
  }

  public FaceMatchResponseSchema status(String status) {
    
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


  public FaceMatchResponseSchema refId(Integer refId) {
    
    this.refId = refId;
    return this;
  }

   /**
   * It displays the unique ID created by Cashfree Payments for reference purposes.
   * @return refId
  **/
  @javax.annotation.Nullable
  @Schema(example = "2000", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by Cashfree Payments for reference purposes.")
  public Integer getRefId() {
    return refId;
  }


  public void setRefId(Integer refId) {
    this.refId = refId;
  }


  public FaceMatchResponseSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It displays the unique ID you created to identify the API request.
   * @return verificationId
  **/
  @javax.annotation.Nullable
  @Schema(example = "2000", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID you created to identify the API request.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public FaceMatchResponseSchema faceMatchResult(String faceMatchResult) {
    
    this.faceMatchResult = faceMatchResult;
    return this;
  }

   /**
   * It displays the result of the face match verification request.
   * @return faceMatchResult
  **/
  @javax.annotation.Nullable
  @Schema(example = "YES/NO", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the result of the face match verification request.")
  public String getFaceMatchResult() {
    return faceMatchResult;
  }


  public void setFaceMatchResult(String faceMatchResult) {
    this.faceMatchResult = faceMatchResult;
  }


  public FaceMatchResponseSchema faceMatchScore(BigDecimal faceMatchScore) {
    
    this.faceMatchScore = faceMatchScore;
    return this;
  }

   /**
   * It displays the score of the face match verification request.
   * @return faceMatchScore
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the score of the face match verification request.")
  public BigDecimal getFaceMatchScore() {
    return faceMatchScore;
  }


  public void setFaceMatchScore(BigDecimal faceMatchScore) {
    this.faceMatchScore = faceMatchScore;
  }


  public FaceMatchResponseSchema maskDetectedFirstImage(Boolean maskDetectedFirstImage) {
    
    this.maskDetectedFirstImage = maskDetectedFirstImage;
    return this;
  }

   /**
   * It displays whether the individual in the image 1 is wearing a mask.
   * @return maskDetectedFirstImage
  **/
  @javax.annotation.Nullable
  @Schema(example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays whether the individual in the image 1 is wearing a mask.")
  public Boolean getMaskDetectedFirstImage() {
    return maskDetectedFirstImage;
  }


  public void setMaskDetectedFirstImage(Boolean maskDetectedFirstImage) {
    this.maskDetectedFirstImage = maskDetectedFirstImage;
  }


  public FaceMatchResponseSchema maskDetectedScoreFirstImage(String maskDetectedScoreFirstImage) {
    
    this.maskDetectedScoreFirstImage = maskDetectedScoreFirstImage;
    return this;
  }

   /**
   * It displays the score of the mask detection analysis for image 1.
   * @return maskDetectedScoreFirstImage
  **/
  @javax.annotation.Nullable
  @Schema(example = "70", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the score of the mask detection analysis for image 1.")
  public String getMaskDetectedScoreFirstImage() {
    return maskDetectedScoreFirstImage;
  }


  public void setMaskDetectedScoreFirstImage(String maskDetectedScoreFirstImage) {
    this.maskDetectedScoreFirstImage = maskDetectedScoreFirstImage;
  }


  public FaceMatchResponseSchema maskDetectedSecondImage(Boolean maskDetectedSecondImage) {
    
    this.maskDetectedSecondImage = maskDetectedSecondImage;
    return this;
  }

   /**
   * It displays whether the individual in the image 1 is wearing a mask.
   * @return maskDetectedSecondImage
  **/
  @javax.annotation.Nullable
  @Schema(example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays whether the individual in the image 1 is wearing a mask.")
  public Boolean getMaskDetectedSecondImage() {
    return maskDetectedSecondImage;
  }


  public void setMaskDetectedSecondImage(Boolean maskDetectedSecondImage) {
    this.maskDetectedSecondImage = maskDetectedSecondImage;
  }


  public FaceMatchResponseSchema maskDetectedScoreSecondImage(String maskDetectedScoreSecondImage) {
    
    this.maskDetectedScoreSecondImage = maskDetectedScoreSecondImage;
    return this;
  }

   /**
   * It displays the score of the mask detection analysis for image 2.
   * @return maskDetectedScoreSecondImage
  **/
  @javax.annotation.Nullable
  @Schema(example = "70", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the score of the mask detection analysis for image 2.")
  public String getMaskDetectedScoreSecondImage() {
    return maskDetectedScoreSecondImage;
  }


  public void setMaskDetectedScoreSecondImage(String maskDetectedScoreSecondImage) {
    this.maskDetectedScoreSecondImage = maskDetectedScoreSecondImage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceMatchResponseSchema faceMatchResponseSchema = (FaceMatchResponseSchema) o;
    return Objects.equals(this.status, faceMatchResponseSchema.status) &&
        Objects.equals(this.refId, faceMatchResponseSchema.refId) &&
        Objects.equals(this.verificationId, faceMatchResponseSchema.verificationId) &&
        Objects.equals(this.faceMatchResult, faceMatchResponseSchema.faceMatchResult) &&
        Objects.equals(this.faceMatchScore, faceMatchResponseSchema.faceMatchScore) &&
        Objects.equals(this.maskDetectedFirstImage, faceMatchResponseSchema.maskDetectedFirstImage) &&
        Objects.equals(this.maskDetectedScoreFirstImage, faceMatchResponseSchema.maskDetectedScoreFirstImage) &&
        Objects.equals(this.maskDetectedSecondImage, faceMatchResponseSchema.maskDetectedSecondImage) &&
        Objects.equals(this.maskDetectedScoreSecondImage, faceMatchResponseSchema.maskDetectedScoreSecondImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, refId, verificationId, faceMatchResult, faceMatchScore, maskDetectedFirstImage, maskDetectedScoreFirstImage, maskDetectedSecondImage, maskDetectedScoreSecondImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceMatchResponseSchema {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    faceMatchResult: ").append(toIndentedString(faceMatchResult)).append("\n");
    sb.append("    faceMatchScore: ").append(toIndentedString(faceMatchScore)).append("\n");
    sb.append("    maskDetectedFirstImage: ").append(toIndentedString(maskDetectedFirstImage)).append("\n");
    sb.append("    maskDetectedScoreFirstImage: ").append(toIndentedString(maskDetectedScoreFirstImage)).append("\n");
    sb.append("    maskDetectedSecondImage: ").append(toIndentedString(maskDetectedSecondImage)).append("\n");
    sb.append("    maskDetectedScoreSecondImage: ").append(toIndentedString(maskDetectedScoreSecondImage)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("ref_id");
    openapiFields.add("verification_id");
    openapiFields.add("face_match_result");
    openapiFields.add("face_match_score");
    openapiFields.add("maskDetected_first_image");
    openapiFields.add("maskDetected_score_first_image");
    openapiFields.add("maskDetected_second_image");
    openapiFields.add("maskDetected_score_second_image");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FaceMatchResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("face_match_result") != null && !jsonObj.get("face_match_result").isJsonNull()) && !jsonObj.get("face_match_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `face_match_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("face_match_result").toString()));
      }
      if ((jsonObj.get("maskDetected_score_first_image") != null && !jsonObj.get("maskDetected_score_first_image").isJsonNull()) && !jsonObj.get("maskDetected_score_first_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maskDetected_score_first_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maskDetected_score_first_image").toString()));
      }
      if ((jsonObj.get("maskDetected_score_second_image") != null && !jsonObj.get("maskDetected_score_second_image").isJsonNull()) && !jsonObj.get("maskDetected_score_second_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maskDetected_score_second_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maskDetected_score_second_image").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FaceMatchResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("face_match_result") != null && !jsonObj.get("face_match_result").isJsonNull()) && !jsonObj.get("face_match_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `face_match_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("face_match_result").toString()));
      }
      if ((jsonObj.get("maskDetected_score_first_image") != null && !jsonObj.get("maskDetected_score_first_image").isJsonNull()) && !jsonObj.get("maskDetected_score_first_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maskDetected_score_first_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maskDetected_score_first_image").toString()));
      }
      if ((jsonObj.get("maskDetected_score_second_image") != null && !jsonObj.get("maskDetected_score_second_image").isJsonNull()) && !jsonObj.get("maskDetected_score_second_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maskDetected_score_second_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maskDetected_score_second_image").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FaceMatchResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FaceMatchResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FaceMatchResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FaceMatchResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<FaceMatchResponseSchema>() {
           @Override
           public void write(JsonWriter out, FaceMatchResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FaceMatchResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FaceMatchResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FaceMatchResponseSchema
  * @throws IOException if the JSON string is invalid with respect to FaceMatchResponseSchema
  */
  public static FaceMatchResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FaceMatchResponseSchema.class);
  }

 /**
  * Convert an instance of FaceMatchResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

