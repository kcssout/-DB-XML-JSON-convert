package com.example.demo.controller;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class JSONValid {
	
	private JSONValid() {
	}
	
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
