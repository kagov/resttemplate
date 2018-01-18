package com.restclient.spring;

import com.restclient.spring.client.RestClient;
import com.restclient.spring.views.RequestView;
import com.restclient.spring.views.ResponseView;

/**
 * An example implementation for the rest client
 * @author kagov
 *
 */
public class Example {
	
	private String url = "yourBaseUrl";
	
	
	public void doGet() {
		
		RestClient restClient = new RestClient(url);
		ResponseView response = restClient.get(ResponseView.class);
		
	}
	
	/** 
	 * A simple post request that takes a json object and returns a json response
	 */
	public void doPost() {
		
		RestClient restClient = new RestClient(url);
		RequestView request = new RequestView();
		request.setKey1("foo");
		request.setKey2("bar");
		ResponseView response = restClient.post(request, ResponseView.class);
	}
}
