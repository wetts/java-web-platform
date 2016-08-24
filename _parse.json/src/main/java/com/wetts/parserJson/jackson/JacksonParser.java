package com.wetts.parserjson.jackson;

import java.io.IOException;
import java.util.Map;

import com.wetts.parserjson.ParserJson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wetts.parserjson.Person;

public class JacksonParser implements ParserJson {

	@Override
	public Person parserJsonString(String json) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(json, Person.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String createJsonString(Person person) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(person);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	public Map jsonString2Map(String json) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(json, Map.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
