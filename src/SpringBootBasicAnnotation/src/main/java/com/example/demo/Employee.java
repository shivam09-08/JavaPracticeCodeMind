package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Autowired
	Address address;
	
	
	@Value("${CompanyName}")
	public String  CompanyName;


	public Employee() {
		System.out.println("Constructor get called Employee ");
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [address=" + address + ", companyName=" + CompanyName + "]";
	}
	
	
	

}
