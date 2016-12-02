package com.automation.test;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.testng.Assert;

public class RestAutomation {

	public static void main(String[] args) throws Exception {
		
		HttpClient client = new DefaultHttpClient();
		
		HttpGet post = new HttpGet("http://192.168.2.75:8182/spire-config-web/api/v1/config/services");
		
		HttpResponse response=client.execute(post);
		
		Assert.assertTrue(response.getStatusLine().getStatusCode()==200);
		
	}
	
}
