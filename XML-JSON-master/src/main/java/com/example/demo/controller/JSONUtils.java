package com.example.demo.controller;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public final class JSONUtils {
	//private static final Gson gson = new Gson();

	private JSONUtils() {
	}

	// public static boolean isJSONValid(String jsonInString ) {
	// try {
	// final ObjectMapper mapper = new ObjectMapper();
	// mapper.readTree(jsonInString);
	// return true;
	// } catch (IOException e) {
	// return false;
	// }
	// }

	public static boolean isJSONValid(String test) {
		try {
			new JSONObject(test);
		} catch (JSONException ex) {
			// edited, to include @Arthur's comment
			// e.g. in case JSONArray is valid as well...
			try {
				new JSONArray(test);
			} catch (JSONException ex1) {
				return false;
			}
		}
		return true;
	}

//	public static boolean isGJSONValid(String jsonInString) {
//		try {
//			gson.fromJson(jsonInString, Object.class);
//			return true;
//		} catch (com.google.gson.JsonSyntaxException ex) {
//			return false;
//		}
//	}
}