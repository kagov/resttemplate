package com.restclient.spring.client;

import org.springframework.http.HttpHeaders;

/**
 * Template class for Multipart requests
 * @author Kaushik
 *
 */
public class FormRequest {

	/**The data */
	private Object data;
	
	/**The header for that content*/
	private HttpHeaders header;
	
	/**The key in which the data has to be sent*/
	private String key;

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(final Object data) {
		this.data = data;
	}

	/**
	 * @return the header
	 */
	public HttpHeaders getHeader() {
		return header;
	}

	/**
	 * @param header the header to set
	 */
	public void setHeader(final HttpHeaders header) {
		this.header = header;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(final String key) {
		this.key = key;
	}
	
	
}
