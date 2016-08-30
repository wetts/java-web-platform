package com.wetts.parserjson.jackson.annotation;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Client {

    public static void main(String[] args) {
        Person person = new Person("nomouse", 25, true, new Date(), "程序员", 2500.0);
        System.out.println(writeJsonObject(person));

        String json = "{\"name\":\"nomouse\",\"age\":25,\"sex\":true,\"birthday\":\"2015-06-04\",\"salary\":\"2500.00\"}";
        System.out.println(readJsonObject(json));
    }

    // 直接写入一个对象(所谓序列化)
    public static String writeJsonObject(Person person) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(person);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // 直接将一个json转化为对象（所谓反序列化）
    public static Person readJsonObject(String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(json, Person.class);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}