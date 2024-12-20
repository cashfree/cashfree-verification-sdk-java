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
 * Success response for creating a reverse penny order request&#x3D;
 */
@Schema(description = "Success response for creating a reverse penny order request=")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T06:30:36.549576Z[Etc/UTC]")
public class CreateRequestResponseSchema {
  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verification_id";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public static final String SERIALIZED_NAME_REF_ID = "ref_id";
  @SerializedName(SERIALIZED_NAME_REF_ID)
  private Long refId;

  public static final String SERIALIZED_NAME_VALID_UPTO = "valid_upto";
  @SerializedName(SERIALIZED_NAME_VALID_UPTO)
  private String validUpto;

  public static final String SERIALIZED_NAME_UPI_LINK = "upi_link";
  @SerializedName(SERIALIZED_NAME_UPI_LINK)
  private String upiLink;

  public static final String SERIALIZED_NAME_PAYTM = "paytm";
  @SerializedName(SERIALIZED_NAME_PAYTM)
  private String paytm;

  public static final String SERIALIZED_NAME_BHIM = "bhim";
  @SerializedName(SERIALIZED_NAME_BHIM)
  private String bhim;

  public static final String SERIALIZED_NAME_GPAY = "gpay";
  @SerializedName(SERIALIZED_NAME_GPAY)
  private String gpay;

  public static final String SERIALIZED_NAME_PHONEPE = "phonepe";
  @SerializedName(SERIALIZED_NAME_PHONEPE)
  private String phonepe;

  public static final String SERIALIZED_NAME_QR_CODE = "qr_code";
  @SerializedName(SERIALIZED_NAME_QR_CODE)
  private String qrCode;

  public CreateRequestResponseSchema() {
  }

  public CreateRequestResponseSchema verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * It displays the unique ID you created to identify this API request.
   * @return verificationId
  **/
  @javax.annotation.Nullable
  @Schema(example = "11", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID you created to identify this API request.")
  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public CreateRequestResponseSchema refId(Long refId) {
    
    this.refId = refId;
    return this;
  }

   /**
   * It displays the unique ID created by Cashfree Payments for reference purposes.
   * @return refId
  **/
  @javax.annotation.Nullable
  @Schema(example = "100173", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by Cashfree Payments for reference purposes.")
  public Long getRefId() {
    return refId;
  }


  public void setRefId(Long refId) {
    this.refId = refId;
  }


  public CreateRequestResponseSchema validUpto(String validUpto) {
    
    this.validUpto = validUpto;
    return this;
  }

   /**
   * It displays the time validity of the order request,
   * @return validUpto
  **/
  @javax.annotation.Nullable
  @Schema(example = "2023-11-08 09:32:52", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the time validity of the order request,")
  public String getValidUpto() {
    return validUpto;
  }


  public void setValidUpto(String validUpto) {
    this.validUpto = validUpto;
  }


  public CreateRequestResponseSchema upiLink(String upiLink) {
    
    this.upiLink = upiLink;
    return this;
  }

   /**
   * It displays the generated UPI link for the reverse penny order request.
   * @return upiLink
  **/
  @javax.annotation.Nullable
  @Schema(example = "upi://pay?pa=yespay.cpisprod01@yesbankltd&pn=Cashfree&tn=BAV&am=1.00&cu=INR&tr=100173&tid=100173", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the generated UPI link for the reverse penny order request.")
  public String getUpiLink() {
    return upiLink;
  }


  public void setUpiLink(String upiLink) {
    this.upiLink = upiLink;
  }


  public CreateRequestResponseSchema paytm(String paytm) {
    
    this.paytm = paytm;
    return this;
  }

   /**
   * It displays the generated Paytm link for the reverse penny order request.
   * @return paytm
  **/
  @javax.annotation.Nullable
  @Schema(example = "paytmmp://pay?pa=yespay.cpisprod01@yesbankltd&pn=Cashfree&tn=BAV&am=1.00&cu=INR&tr=100173&tid=100173", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the generated Paytm link for the reverse penny order request.")
  public String getPaytm() {
    return paytm;
  }


  public void setPaytm(String paytm) {
    this.paytm = paytm;
  }


  public CreateRequestResponseSchema bhim(String bhim) {
    
    this.bhim = bhim;
    return this;
  }

   /**
   * It displays the generated BHIM link for the reverse penny order request.
   * @return bhim
  **/
  @javax.annotation.Nullable
  @Schema(example = "bhim://upi://pay?pa=yespay.cpisprod01@yesbankltd&pn=Cashfree&tn=BAV&am=1.00&cu=INR&tr=100173&tid=100173", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the generated BHIM link for the reverse penny order request.")
  public String getBhim() {
    return bhim;
  }


  public void setBhim(String bhim) {
    this.bhim = bhim;
  }


  public CreateRequestResponseSchema gpay(String gpay) {
    
    this.gpay = gpay;
    return this;
  }

   /**
   * It displays the generated Gpay link for the reverse penny order request.
   * @return gpay
  **/
  @javax.annotation.Nullable
  @Schema(example = "tez://upi/pay?pa=yespay.cpisprod01@yesbankltd&pn=Cashfree&tn=BAV&am=1.00&cu=INR&tr=100173&tid=100173", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the generated Gpay link for the reverse penny order request.")
  public String getGpay() {
    return gpay;
  }


  public void setGpay(String gpay) {
    this.gpay = gpay;
  }


  public CreateRequestResponseSchema phonepe(String phonepe) {
    
    this.phonepe = phonepe;
    return this;
  }

   /**
   * It displays the generated Phonepe link for the reverse penny order request.
   * @return phonepe
  **/
  @javax.annotation.Nullable
  @Schema(example = "phonepe://pay?pa=yespay.cpisprod01@yesbankltd&pn=Cashfree&tn=BAV&am=1.00&cu=INR&tr=100173&tid=100173", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the generated Phonepe link for the reverse penny order request.")
  public String getPhonepe() {
    return phonepe;
  }


  public void setPhonepe(String phonepe) {
    this.phonepe = phonepe;
  }


  public CreateRequestResponseSchema qrCode(String qrCode) {
    
    this.qrCode = qrCode;
    return this;
  }

   /**
   * It displays the generated QR code for the reverse penny order request.
   * @return qrCode
  **/
  @javax.annotation.Nullable
  @Schema(example = "iVBORw0KGgoAAAANSUhEUgAAAQAAAAEAAQMAAABmvDolAAAABlBMVEX///8AAABVwtN+AAACuklEQVR42uyYwa3jMAxEx/CBR5WgTqzGgtiBG5M7UQk66mB4FkP/3WR/A5aB8PZ/3sGUqOGQ+MY3bhhGklsd6sAdiAASJgz6b70RUADLQQgiuaMBqQ0VGHsCSMvhwFBHrvqDDRjqzLUzYCPrwLWM1FG3qU+g6sMfXg9G5hsCgG3MmOtMFoAZiduviroaOJ/eFF71EdeyR8tt0uX8epuXAh4DDzzDSnKknXX9f1wMWEFSCYRXncsjjjpstkTW911cDkCqNbk+PACMhZ5DOMJ6K8Cy5ZDxDIv/bLTsijJ2BbBNyiOsBbqLZAcSX3XuB1CxSBJ+pHiH0bY2cPnQh8sBxJY8hwOIe1T3NfIIR+CNAKmFNwhZhkck9TaZw8c5XA/o6bUpSHnnMlMFw8MEPNANIOV1uzhz5YIdlpUF0BVQSOiYn3p6UL9QA6nP8OEfrgZ01N55l7DEJarj8nDpHW8EWDGe0wIXzBzZ5Hm2t3voAUC0TDkx9Yu5AC21gVKHv1rdBUAi1UnA+6hVMOwHkKfl4W7Mq7qoxxk/GsodALfiQFJeRR3D/aS63r+4HjC2ZOphS2AZqYvhxkPTRO0JgGcx/9jFlixDDWRHP0Bxu+ifzSVSyjxhAjDXjgCkJh+2BHJxu3iOtPVOgDvzzQVkLQ95MbgQz+9h8nrAXBAAPKGa3tFghx2B7+3B9YB78wMTZHJW3x7YaXLmroDsWQxyYjrqJOH99LQ3AHx6POcFf5nlZy1yfBjOy4FzB1JT9Q+nC8ggO/FO83rg3CaRGnLd9CLJiX244h6Ac5nMOlRNvLsPwaYs/o0PPQC+4ZzwlCkre6QvONzW3AzIYeNpedWaW2pTeNXugHPHxbVQ/mFrCK//F/tXA14wWQ2CexyLTxM+BHcE/F0mL2HHI+5AsmzS2h33Ab7xja7iTwAAAP//HxNnsaD8lqMAAAAASUVORK5CYII=", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the generated QR code for the reverse penny order request.")
  public String getQrCode() {
    return qrCode;
  }


  public void setQrCode(String qrCode) {
    this.qrCode = qrCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRequestResponseSchema createRequestResponseSchema = (CreateRequestResponseSchema) o;
    return Objects.equals(this.verificationId, createRequestResponseSchema.verificationId) &&
        Objects.equals(this.refId, createRequestResponseSchema.refId) &&
        Objects.equals(this.validUpto, createRequestResponseSchema.validUpto) &&
        Objects.equals(this.upiLink, createRequestResponseSchema.upiLink) &&
        Objects.equals(this.paytm, createRequestResponseSchema.paytm) &&
        Objects.equals(this.bhim, createRequestResponseSchema.bhim) &&
        Objects.equals(this.gpay, createRequestResponseSchema.gpay) &&
        Objects.equals(this.phonepe, createRequestResponseSchema.phonepe) &&
        Objects.equals(this.qrCode, createRequestResponseSchema.qrCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationId, refId, validUpto, upiLink, paytm, bhim, gpay, phonepe, qrCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRequestResponseSchema {\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
    sb.append("    validUpto: ").append(toIndentedString(validUpto)).append("\n");
    sb.append("    upiLink: ").append(toIndentedString(upiLink)).append("\n");
    sb.append("    paytm: ").append(toIndentedString(paytm)).append("\n");
    sb.append("    bhim: ").append(toIndentedString(bhim)).append("\n");
    sb.append("    gpay: ").append(toIndentedString(gpay)).append("\n");
    sb.append("    phonepe: ").append(toIndentedString(phonepe)).append("\n");
    sb.append("    qrCode: ").append(toIndentedString(qrCode)).append("\n");
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
    openapiFields.add("ref_id");
    openapiFields.add("valid_upto");
    openapiFields.add("upi_link");
    openapiFields.add("paytm");
    openapiFields.add("bhim");
    openapiFields.add("gpay");
    openapiFields.add("phonepe");
    openapiFields.add("qr_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateRequestResponseSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("valid_upto") != null && !jsonObj.get("valid_upto").isJsonNull()) && !jsonObj.get("valid_upto").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valid_upto` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valid_upto").toString()));
      }
      if ((jsonObj.get("upi_link") != null && !jsonObj.get("upi_link").isJsonNull()) && !jsonObj.get("upi_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upi_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upi_link").toString()));
      }
      if ((jsonObj.get("paytm") != null && !jsonObj.get("paytm").isJsonNull()) && !jsonObj.get("paytm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paytm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paytm").toString()));
      }
      if ((jsonObj.get("bhim") != null && !jsonObj.get("bhim").isJsonNull()) && !jsonObj.get("bhim").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bhim` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bhim").toString()));
      }
      if ((jsonObj.get("gpay") != null && !jsonObj.get("gpay").isJsonNull()) && !jsonObj.get("gpay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gpay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gpay").toString()));
      }
      if ((jsonObj.get("phonepe") != null && !jsonObj.get("phonepe").isJsonNull()) && !jsonObj.get("phonepe").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phonepe` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phonepe").toString()));
      }
      if ((jsonObj.get("qr_code") != null && !jsonObj.get("qr_code").isJsonNull()) && !jsonObj.get("qr_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qr_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qr_code").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateRequestResponseSchema
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verification_id") != null && !jsonObj.get("verification_id").isJsonNull()) && !jsonObj.get("verification_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_id").toString()));
      }
      if ((jsonObj.get("valid_upto") != null && !jsonObj.get("valid_upto").isJsonNull()) && !jsonObj.get("valid_upto").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valid_upto` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valid_upto").toString()));
      }
      if ((jsonObj.get("upi_link") != null && !jsonObj.get("upi_link").isJsonNull()) && !jsonObj.get("upi_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upi_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upi_link").toString()));
      }
      if ((jsonObj.get("paytm") != null && !jsonObj.get("paytm").isJsonNull()) && !jsonObj.get("paytm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paytm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paytm").toString()));
      }
      if ((jsonObj.get("bhim") != null && !jsonObj.get("bhim").isJsonNull()) && !jsonObj.get("bhim").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bhim` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bhim").toString()));
      }
      if ((jsonObj.get("gpay") != null && !jsonObj.get("gpay").isJsonNull()) && !jsonObj.get("gpay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gpay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gpay").toString()));
      }
      if ((jsonObj.get("phonepe") != null && !jsonObj.get("phonepe").isJsonNull()) && !jsonObj.get("phonepe").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phonepe` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phonepe").toString()));
      }
      if ((jsonObj.get("qr_code") != null && !jsonObj.get("qr_code").isJsonNull()) && !jsonObj.get("qr_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qr_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qr_code").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateRequestResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateRequestResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateRequestResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateRequestResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateRequestResponseSchema>() {
           @Override
           public void write(JsonWriter out, CreateRequestResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateRequestResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateRequestResponseSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateRequestResponseSchema
  * @throws IOException if the JSON string is invalid with respect to CreateRequestResponseSchema
  */
  public static CreateRequestResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateRequestResponseSchema.class);
  }

 /**
  * Convert an instance of CreateRequestResponseSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

