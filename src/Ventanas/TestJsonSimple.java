package Ventanas;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class TestJsonSimple {
	public static void main(String[] args) {
		String jsonString = "{\"name\":\"sonoo\",\"salary\":600000.0,\"age\":27}";

		System.out.println(jsonString);

		Object obt = JSONValue.parse(jsonString);
		JSONObject json = (JSONObject) obt;

		System.out.println(json.get("name"));
		System.out.println(json.get("salary"));
		System.out.println(json.get("age"));

	}
}
