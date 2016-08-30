package com.wetts.parserjson;

public interface ParserJson {

	public Person parserJsonString(String json);
	
	public String createJsonString(Person person);
}
