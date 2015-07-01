package com.java4u.spring.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class CustomerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ClientConfig clientConfig = new DefaultClientConfig();
       // clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create();
		 
		WebResource webResource = client
		   .resource("http://localhost:18081/RestServicesTest/rest/customer/name/A");
 
		ClientResponse response = webResource.accept(MediaType.APPLICATION_XML)
                   .get(ClientResponse.class);
		
		String customerString = response.getEntity(String.class);
		
		System.out.println(customerString);
		//List<Customer> customerList = response.getEntity(new GenericType<List<Customer>>(){});
		//System.out.println("CUstomer id----->"+customerString.getId());

 
	}

}
