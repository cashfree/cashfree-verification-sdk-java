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
import com.cashfree.model.ESignVerificationCreateSignatureRequestSchemaSignersInnerSignPositionsInner;
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
 * ESignVerificationCreateSignatureRequestSchemaSignersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T06:30:36.549576Z[Etc/UTC]")
public class ESignVerificationCreateSignatureRequestSchemaSignersInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "John Doe";

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email = "abc.def@klm.com";

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone = "9999999999";

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private Integer sequence = 1;

  public static final String SERIALIZED_NAME_SIGN_POSITIONS = "sign_positions";
  @SerializedName(SERIALIZED_NAME_SIGN_POSITIONS)
  private List<ESignVerificationCreateSignatureRequestSchemaSignersInnerSignPositionsInner> signPositions = new ArrayList<>();

  public ESignVerificationCreateSignatureRequestSchemaSignersInner() {
  }

  public ESignVerificationCreateSignatureRequestSchemaSignersInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * It is the name of the signer.
   * @return name
  **/
  @javax.annotation.Nonnull
  @Schema(example = "John Doe", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the name of the signer.")
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ESignVerificationCreateSignatureRequestSchemaSignersInner email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * It is the email ID of the signer.
   * @return email
  **/
  @javax.annotation.Nonnull
  @Schema(example = "abc.def@klm.com", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the email ID of the signer.")
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ESignVerificationCreateSignatureRequestSchemaSignersInner phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * It is the phone number of the signer.
   * @return phone
  **/
  @javax.annotation.Nullable
  @Schema(example = "9999999999", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the phone number of the signer.")
  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public ESignVerificationCreateSignatureRequestSchemaSignersInner sequence(Integer sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * It displays the sequence of the signer to sign the document. The value can be between 1 to n where n is number of signers.
   * @return sequence
  **/
  @javax.annotation.Nonnull
  @Schema(example = "1", requiredMode = Schema.RequiredMode.REQUIRED, description = "It displays the sequence of the signer to sign the document. The value can be between 1 to n where n is number of signers.")
  public Integer getSequence() {
    return sequence;
  }


  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }


  public ESignVerificationCreateSignatureRequestSchemaSignersInner signPositions(List<ESignVerificationCreateSignatureRequestSchemaSignersInnerSignPositionsInner> signPositions) {
    
    this.signPositions = signPositions;
    return this;
  }

  public ESignVerificationCreateSignatureRequestSchemaSignersInner addSignPositionsItem(ESignVerificationCreateSignatureRequestSchemaSignersInnerSignPositionsInner signPositionsItem) {
    if (this.signPositions == null) {
      this.signPositions = new ArrayList<>();
    }
    this.signPositions.add(signPositionsItem);
    return this;
  }

   /**
   * It displays the page wise coordinates of the rectangular space for signature placement.
   * @return signPositions
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "It displays the page wise coordinates of the rectangular space for signature placement.")
  public List<ESignVerificationCreateSignatureRequestSchemaSignersInnerSignPositionsInner> getSignPositions() {
    return signPositions;
  }


  public void setSignPositions(List<ESignVerificationCreateSignatureRequestSchemaSignersInnerSignPositionsInner> signPositions) {
    this.signPositions = signPositions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ESignVerificationCreateSignatureRequestSchemaSignersInner esignVerificationCreateSignatureRequestSchemaSignersInner = (ESignVerificationCreateSignatureRequestSchemaSignersInner) o;
    return Objects.equals(this.name, esignVerificationCreateSignatureRequestSchemaSignersInner.name) &&
        Objects.equals(this.email, esignVerificationCreateSignatureRequestSchemaSignersInner.email) &&
        Objects.equals(this.phone, esignVerificationCreateSignatureRequestSchemaSignersInner.phone) &&
        Objects.equals(this.sequence, esignVerificationCreateSignatureRequestSchemaSignersInner.sequence) &&
        Objects.equals(this.signPositions, esignVerificationCreateSignatureRequestSchemaSignersInner.signPositions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, phone, sequence, signPositions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESignVerificationCreateSignatureRequestSchemaSignersInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    signPositions: ").append(toIndentedString(signPositions)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("phone");
    openapiFields.add("sequence");
    openapiFields.add("sign_positions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("sequence");
    openapiRequiredFields.add("sign_positions");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ESignVerificationCreateSignatureRequestSchemaSignersInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ESignVerificationCreateSignatureRequestSchemaSignersInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("sign_positions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_positions` to be an array in the JSON string but got `%s`", jsonObj.get("sign_positions").toString()));
      }

      JsonArray jsonArraysignPositions = jsonObj.getAsJsonArray("sign_positions");
      // validate the required field `sign_positions` (array)
      for (int i = 0; i < jsonArraysignPositions.size(); i++) {
        ESignVerificationCreateSignatureRequestSchemaSignersInnerSignPositionsInner.validateJsonElement(jsonArraysignPositions.get(i));
      };
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ESignVerificationCreateSignatureRequestSchemaSignersInner
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ESignVerificationCreateSignatureRequestSchemaSignersInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("sign_positions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_positions` to be an array in the JSON string but got `%s`", jsonObj.get("sign_positions").toString()));
      }

      JsonArray jsonArraysignPositions = jsonObj.getAsJsonArray("sign_positions");
      // validate the required field `sign_positions` (array)
      for (int i = 0; i < jsonArraysignPositions.size(); i++) {
        ESignVerificationCreateSignatureRequestSchemaSignersInnerSignPositionsInner.validateJsonElement(jsonArraysignPositions.get(i));
      };
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ESignVerificationCreateSignatureRequestSchemaSignersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ESignVerificationCreateSignatureRequestSchemaSignersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ESignVerificationCreateSignatureRequestSchemaSignersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ESignVerificationCreateSignatureRequestSchemaSignersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ESignVerificationCreateSignatureRequestSchemaSignersInner>() {
           @Override
           public void write(JsonWriter out, ESignVerificationCreateSignatureRequestSchemaSignersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ESignVerificationCreateSignatureRequestSchemaSignersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ESignVerificationCreateSignatureRequestSchemaSignersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ESignVerificationCreateSignatureRequestSchemaSignersInner
  * @throws IOException if the JSON string is invalid with respect to ESignVerificationCreateSignatureRequestSchemaSignersInner
  */
  public static ESignVerificationCreateSignatureRequestSchemaSignersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ESignVerificationCreateSignatureRequestSchemaSignersInner.class);
  }

 /**
  * Convert an instance of ESignVerificationCreateSignatureRequestSchemaSignersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

