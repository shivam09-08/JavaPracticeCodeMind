package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	
@Autowired
	private EmployeeRepo  empRepo;
	
	@Autowired
	EmployeeService empService;
	
	
	
//	@PostMapping("/EmployeeInfo")
//	public Employee empInfo(@RequestBody Employee2 emp)
//	{
//	
//		
////		EmployeeService empService = new EmployeeService();
//		
//		Employee uemp = empService.getEmployee(emp);
//		
//		return uemp;
		
		
		@PostMapping("/saveemployee")
		public String saveEmployeeData(@RequestBody Employee emp)
		{
			empRepo.save(emp);
			System.out.println("hitting  controller");
			 return "Employee data save successfully ! " ;
		
		
//		Employee uemp= new Employee();
//
//		
//		uemp.setId(emp.getId());	
//		uemp.setName(emp.getName().toUpperCase());
//		uemp.setDep(emp.getDep().toUpperCase());
//		uemp.setSalary(emp.getSalary().toUpperCase());
//		return uemp;
		
//		int id =emp.getId();
//		uemp.setId(id);
//		
//		String dep =emp.getDep();
//		uemp.setDep(dep);
//		
//		String name =emp.getName();
//		uemp.setName(name);
//		
//		String salary =emp.getSalary();
//		uemp.setSalary(salary);
	}

}
