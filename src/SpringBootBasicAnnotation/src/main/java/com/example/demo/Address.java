package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Address {

	public Address() {
		System.out.println("Address Constructor");
	}
	
	
	public String streetNo ="420";
	public String streetName = "Gandi Marg Link Road";
	
	public String getStreetNo() {
		return streetNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", streetName=" + streetName + "]";
	}
	
	

}
