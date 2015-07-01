package com.java4u.spring.rest;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

	public static List<Customer> customerList = new ArrayList<Customer>();
	static {
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setName("A");
		
		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setName("B");
		
		Customer customer3 = new Customer();
		customer3.setId(3);
		customer3.setName("C");
		
		Customer customer4 = new Customer();
		customer4.setId(4);
		customer4.setName("D");
		
		Customer customer5 = new Customer();
		customer5.setId(5);
		customer5.setName("E");
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
	}
	
	
	
	
	public static List<Customer> getCustomerList() {
		return customerList;
	}

	public static Customer getCustomerByName(String name)
	{
		Customer customer = null;
		for (Customer customer1 : customerList) {
			
			if(customer1.getName().equals(name))
			{
				customer = customer1;
			}
		}
		return customer;
	}

	
	public static Customer getCustomerById(int id)
	{
		Customer customer = null;
		for (Customer customer1 : customerList) {
			
			if(customer1.getId() == id)
			{
				customer = customer1;
				break;
			}
		}
		return customer;
	}

	
}
