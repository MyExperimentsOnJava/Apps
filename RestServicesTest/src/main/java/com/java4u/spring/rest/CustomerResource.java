package com.java4u.spring.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

@Path("/customer")
public class CustomerResource {

	@GET
	@Path("/name/{customerName}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomerByName(@PathParam("customerName")String name)
	{
		return CustomerService.getCustomerByName(name);
	}
	
	@GET
	@Path("/id/{customerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomerById(@PathParam("customerId")int id)
	{
		return CustomerService.getCustomerById(id);
	}
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustomerList()
	{
		return CustomerService.getCustomerList();
	}
	
}
