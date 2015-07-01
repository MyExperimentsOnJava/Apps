package com.java4u.spring.rest;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Track {

	private String name;
	private String id;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
