package org.technicalyorker.dp.behavioural.cor;

import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

public class HandlerContext {
	private String request;
	private String response;
	private Properties header = new Properties();
	private Properties parameters = new Properties();
	private Set<HandlerException> exceptions = new LinkedHashSet<HandlerException>();

	public Set<HandlerException> getExceptions() {
		return exceptions;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public Properties getHeader() {
		return header;
	}

	public Properties getParameters() {
		return parameters;
	}

	@Override
	public String toString() {
		return "HandlerContext [request=" + request + ", response=" + response
				+ ", header=" + header + ", parameters=" + parameters
				+ ", exceptions=" + exceptions + "]";
	}

	public void addFault(HandlerException handlerException) {
		getExceptions().add(handlerException);
	}

	public void addHeader(String key, String value) {
		getHeader().put(key, value);
	}

	public String getHeader(String key) {
		return getHeader().getProperty(key);
	}

	public void addParameter(String key, String value) {
		getParameters().put(key, value);
	}

	public String getParameter(String key) {
		return getParameters().getProperty(key);
	}
}
