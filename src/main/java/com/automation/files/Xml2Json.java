package com.automation.files;

import org.json.JSONObject;

public class Xml2Json {
	
	public static void main(String[] args) {
		
		String xml="<abc><user>aaaa</user><password>bbb</password></abc>";
		
		JSONObject json = new JSONObject();
		
		//json.
		
		json.getJSONObject(xml);
		
		System.out.println(json.toString());
		
		
	}
	

}
