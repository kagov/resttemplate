package com.restclient.spring.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restclient.spring.client.RestClient;
import com.restclient.spring.views.RequestView;
import com.restclient.spring.views.ResponseView;

@RestController
public class RestClientController {
	
	@RequestMapping(value = "/consume", method = RequestMethod.GET)
	public ResponseView consume() {
		RequestView request = new RequestView();
		request.setKey1("foo");
		request.setKey2("bar");
		RestClient client = new RestClient("http://localhost:8080/post");
		return client.post(request, ResponseView.class);
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public ResponseView post(@RequestBody RequestView request) {
		ResponseView response = new ResponseView();
		response.setStatus("success");
		response.setMessage(request.getKey1()+" "+request.getKey2());
		return response;
	}
}
