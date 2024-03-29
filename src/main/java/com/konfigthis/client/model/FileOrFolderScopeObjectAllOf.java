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
import com.konfigthis.client.model.FileMini;
import com.konfigthis.client.model.FileVersionMini;
import com.konfigthis.client.model.FolderMini;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
public class FileOrFolderScopeObjectAllOf extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(FileOrFolderScopeObjectAllOf.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FileOrFolderScopeObjectAllOf.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FileOrFolderScopeObjectAllOf' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FileMini> adapterFileMini = gson.getDelegateAdapter(this, TypeToken.get(FileMini.class));
            final TypeAdapter<FolderMini> adapterFolderMini = gson.getDelegateAdapter(this, TypeToken.get(FolderMini.class));

            return (TypeAdapter<T>) new TypeAdapter<FileOrFolderScopeObjectAllOf>() {
                @Override
                public void write(JsonWriter out, FileOrFolderScopeObjectAllOf value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `FileMini`
                    if (value.getActualInstance() instanceof FileMini) {
                        JsonObject obj = adapterFileMini.toJsonTree((FileMini)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `FolderMini`
                    if (value.getActualInstance() instanceof FolderMini) {
                        JsonObject obj = adapterFolderMini.toJsonTree((FolderMini)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: FileMini, FolderMini");
                }

                @Override
                public FileOrFolderScopeObjectAllOf read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize FileMini
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FileMini.validateJsonObject(jsonObject);
                        actualAdapter = adapterFileMini;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'FileMini'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FileMini failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FileMini'", e);
                    }

                    // deserialize FolderMini
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FolderMini.validateJsonObject(jsonObject);
                        actualAdapter = adapterFolderMini;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'FolderMini'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FolderMini failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FolderMini'", e);
                    }

                    if (match == 1) {
                        FileOrFolderScopeObjectAllOf ret = new FileOrFolderScopeObjectAllOf();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for FileOrFolderScopeObjectAllOf: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public FileOrFolderScopeObjectAllOf() {
        super("oneOf", Boolean.FALSE);
    }

    public FileOrFolderScopeObjectAllOf(FileMini o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FileOrFolderScopeObjectAllOf(FolderMini o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FileMini", new GenericType<FileMini>() {
        });
        schemas.put("FolderMini", new GenericType<FolderMini>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return FileOrFolderScopeObjectAllOf.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * FileMini, FolderMini
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof FileMini) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FolderMini) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be FileMini, FolderMini");
    }

    /**
     * Get the actual instance, which can be the following:
     * FileMini, FolderMini
     *
     * @return The actual instance (FileMini, FolderMini)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FileMini`. If the actual instance is not `FileMini`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FileMini`
     * @throws ClassCastException if the instance is not `FileMini`
     */
    public FileMini getFileMini() throws ClassCastException {
        return (FileMini)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FolderMini`. If the actual instance is not `FolderMini`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FolderMini`
     * @throws ClassCastException if the instance is not `FolderMini`
     */
    public FolderMini getFolderMini() throws ClassCastException {
        return (FolderMini)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FileOrFolderScopeObjectAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with FileMini
    try {
      FileMini.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for FileMini failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with FolderMini
    try {
      FolderMini.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for FolderMini failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for FileOrFolderScopeObjectAllOf with oneOf schemas: FileMini, FolderMini. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of FileOrFolderScopeObjectAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileOrFolderScopeObjectAllOf
  * @throws IOException if the JSON string is invalid with respect to FileOrFolderScopeObjectAllOf
  */
  public static FileOrFolderScopeObjectAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileOrFolderScopeObjectAllOf.class);
  }

 /**
  * Convert an instance of FileOrFolderScopeObjectAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

