package com.automation.rest;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;

public class HttpClientTest {
	
	private HttpClient client = new DefaultHttpClient();
	
	public String get(String uri , Map<String,String> headers) throws Exception{
		
		HttpGet get = new HttpGet(uri);
		
		if (headers!=null){
			
		}
			
		HttpResponse response=client.execute(get);
		
		Assert.assertTrue(response.getStatusLine().getStatusCode()==200);
		
		return EntityUtils.toString(response.getEntity());
		
	}
	
	public <T> void addHeaders(T collection,Map<String,String> headers){
		
		if (headers!=null) {
			
			Set<Map.Entry<String, String>> values=headers.entrySet();
			
			Iterator list=values.iterator();
			
			while(list.hasNext())
			{
			    Entry<String, String> e = (Entry<String, String>) list.next();
			    String key = e.getKey();  
			    String value = e.getValue();
			    System.out.println(key + " " + value);
			}			
		}
		
	}
	
	public HttpResponse post(String uri,Map<String,String> headers) throws Exception{
		
		HttpPost post = new HttpPost(uri);
		
		if (headers!=null){
			
		}
		
		HttpResponse response=client.execute(post);
		
		return response;
		
	}
	
	public void put(){
		
	}
	
	public void delete(){
		
	}


	public static void main(String[] args) throws Exception {
		
		/*HttpClient client = new DefaultHttpClient();
		
		HttpGet post = new HttpGet("http://192.168.2.75:8182/spire-config-web/api/v1/config/services");
		
		HttpResponse response=client.execute(post);
		
		Assert.assertTrue(response.getStatusLine().getStatusCode()==200);*/
		
		HttpClientTest test = new HttpClientTest();
		System.out.println(test.get("http://192.168.2.75:8182/spire-config-web/api/v1/config/services", null));
		
	}
	
}
