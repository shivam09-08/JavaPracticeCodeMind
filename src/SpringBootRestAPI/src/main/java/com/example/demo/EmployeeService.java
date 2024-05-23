package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	
	
	@Value("${company.name}")
	public String company ;
	public Employee2 getEmployee(Employee2 emp)
	{
		
		Employee2 uemp= new Employee2();

		
		uemp.setId(emp.getId());	
		uemp.setName(emp.getName().toUpperCase() + " From " + company );
		uemp.setDep(emp.getDep().toUpperCase());
		uemp.setSalary(emp.getSalary().toUpperCase());
		return uemp;
	}
	
	
	
	

	public Employee getDetails(Employee emp)
	{
		
		Employee nemp= new Employee();

		
		nemp.setEmpid(emp.getEmpid());	
		nemp.setEmp_name(emp.getEmp_name().toUpperCase() + " From " + company );
		nemp.setEmp_salary(emp.getEmp_salary());
		nemp.setEmp_age(emp.getEmp_age());
		nemp.setEmp_password(emp.getEmp_password());
		return nemp;
	}

}
