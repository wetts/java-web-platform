package com.wetts.parserjson.jackson;

import com.wetts.parserjson.ParserJson;
import com.wetts.parserjson.Person;

public class Client {

	public static void main(String[] args) {
		ParserJson parser = new JacksonParser();
		Person person = new Person("momo", 18);
		System.out.println(parser.createJsonString(person));
		
		String json = "{\"age\":18,\"name\":\"momo\"}";
		System.out.println(parser.parserJsonString(json));
		
		System.out.println(((JacksonParser)parser).jsonString2Map(json));
	}
}
