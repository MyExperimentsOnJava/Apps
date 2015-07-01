package com.java4u.spring.rest;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class HelloWorldClient {
	HelloWorldClient(){
		
	}
	public static void main(String args[]) {
		ClientConfig config = new DefaultClientConfig();
		config.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, true);
		Client client = Client.create(config);
		WebResource resource = client.resource("http://localhost:18081/RestServicesTest/rest/hello/jsonTrack");
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		String string = response.getEntity(String.class);
		System.out.println(string);
	}
}
