package com.tests.jsonArrayTests;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateArrayInJson {

	public static void main(String[] args) {
		Map<String, Object> inicialValues = new HashMap<>();
		
		inicialValues.put("value1", "value");
		inicialValues.put("value2", 2);
		inicialValues.put("value3", 3.0);
		
		JSONObject theJson = new JSONObject(inicialValues);
		
		JSONArray valuesList = new JSONArray();
		
		valuesList.add("value1");
		valuesList.add("value2");
		valuesList.add("value3");
		
		theJson.put("vehiclesList", valuesList);
		
		System.out.println(theJson);
		
		}
}
