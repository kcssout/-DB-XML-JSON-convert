package com.example.demo.controller;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//import com.google.gson.Gson;

public final class JSONValid {
	
	//static Gson gson = new Gson();
	private JSONValid() {
	}

//	public static boolean isJSONValid(String json) {
//		try {
//			gson.fromJson(json, Object.class);
//			return true;
//		} catch (com.google.gson.JsonSyntaxException ex) {
//			return false;
//		}
//	}
	
	public static boolean isJson(String Json) {
        try {
            new JSONObject(Json);
        } catch (JSONException ex) {
            try {
                new JSONArray(Json);
            } catch (JSONException ex1) {
                return false;
            }
        }
        return true;
    }
}
