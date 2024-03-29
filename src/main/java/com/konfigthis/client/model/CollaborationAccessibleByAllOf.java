/*
 * Box Platform API
 * [Box Platform](https://box.dev) provides functionality to provide access to content stored within [Box](https://box.com). It provides endpoints for basic manipulation of files and folders, management of users within an enterprise, as well as more complex topics such as legal holds and retention policies.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: devrel@box.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.GroupMini;
import com.konfigthis.client.model.UserCollaborations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.konfigthis.client.JSON;
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CollaborationAccessibleByAllOf extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CollaborationAccessibleByAllOf.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CollaborationAccessibleByAllOf.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CollaborationAccessibleByAllOf' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GroupMini> adapterGroupMini = gson.getDelegateAdapter(this, TypeToken.get(GroupMini.class));
            final TypeAdapter<UserCollaborations> adapterUserCollaborations = gson.getDelegateAdapter(this, TypeToken.get(UserCollaborations.class));

            return (TypeAdapter<T>) new TypeAdapter<CollaborationAccessibleByAllOf>() {
                @Override
                public void write(JsonWriter out, CollaborationAccessibleByAllOf value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `GroupMini`
                    if (value.getActualInstance() instanceof GroupMini) {
                        JsonObject obj = adapterGroupMini.toJsonTree((GroupMini)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UserCollaborations`
                    if (value.getActualInstance() instanceof UserCollaborations) {
                        JsonObject obj = adapterUserCollaborations.toJsonTree((UserCollaborations)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: GroupMini, UserCollaborations");
                }

                @Override
                public CollaborationAccessibleByAllOf read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize GroupMini
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GroupMini.validateJsonObject(jsonObject);
                        actualAdapter = adapterGroupMini;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GroupMini'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GroupMini failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GroupMini'", e);
                    }

                    // deserialize UserCollaborations
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UserCollaborations.validateJsonObject(jsonObject);
                        actualAdapter = adapterUserCollaborations;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UserCollaborations'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UserCollaborations failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UserCollaborations'", e);
                    }

                    if (match == 1) {
                        CollaborationAccessibleByAllOf ret = new CollaborationAccessibleByAllOf();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CollaborationAccessibleByAllOf: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CollaborationAccessibleByAllOf() {
        super("oneOf", Boolean.FALSE);
    }

    public CollaborationAccessibleByAllOf(GroupMini o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CollaborationAccessibleByAllOf(UserCollaborations o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("GroupMini", new GenericType<GroupMini>() {
        });
        schemas.put("UserCollaborations", new GenericType<UserCollaborations>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CollaborationAccessibleByAllOf.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * GroupMini, UserCollaborations
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof GroupMini) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UserCollaborations) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be GroupMini, UserCollaborations");
    }

    /**
     * Get the actual instance, which can be the following:
     * GroupMini, UserCollaborations
     *
     * @return The actual instance (GroupMini, UserCollaborations)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `GroupMini`. If the actual instance is not `GroupMini`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GroupMini`
     * @throws ClassCastException if the instance is not `GroupMini`
     */
    public GroupMini getGroupMini() throws ClassCastException {
        return (GroupMini)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UserCollaborations`. If the actual instance is not `UserCollaborations`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UserCollaborations`
     * @throws ClassCastException if the instance is not `UserCollaborations`
     */
    public UserCollaborations getUserCollaborations() throws ClassCastException {
        return (UserCollaborations)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CollaborationAccessibleByAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with GroupMini
    try {
      GroupMini.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GroupMini failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UserCollaborations
    try {
      UserCollaborations.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UserCollaborations failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for CollaborationAccessibleByAllOf with oneOf schemas: GroupMini, UserCollaborations. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of CollaborationAccessibleByAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CollaborationAccessibleByAllOf
  * @throws IOException if the JSON string is invalid with respect to CollaborationAccessibleByAllOf
  */
  public static CollaborationAccessibleByAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CollaborationAccessibleByAllOf.class);
  }

 /**
  * Convert an instance of CollaborationAccessibleByAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

