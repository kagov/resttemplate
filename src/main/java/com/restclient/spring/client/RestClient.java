package com.restclient.spring.client;

import org.springframework.web.client.RestTemplate;

public class RestClient {
	
	/**
	 * HTTP post method
	 * @param <T> The request object type
	 * @param <V> The response object type
	 * @param payload the request details
	 * @param url the url to be hit
	 * @return the V type response
	 */
	public static <T, V> V post(final T payload,final String url, final Class<V> responseType) {
		return new RestTemplate().postForObject(url, payload, responseType);
	}
}
