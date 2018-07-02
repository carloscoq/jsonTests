package com.tests;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("ok");
		
		JsonObject object = Json.parse(input).asObject();
		int orders = object.get("order").asInt();
		JsonArray items = object.get("items").asArray();
	}
}
