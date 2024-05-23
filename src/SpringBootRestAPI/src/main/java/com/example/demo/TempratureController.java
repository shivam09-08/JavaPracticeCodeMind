package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController("/")
public class TempratureController {
	
	@RequestMapping("/temp")
	public String temp()
	{
		return "temprature is 32* C";
	}

	
	@GetMapping("/Session/{value}")
	public String getSession(@PathVariable Integer value) {
		if(value >= 30)
		{
			return "Ohh its Summer Session";
		}
		else if(value <=20)
		{
		return "wow ! it is Winter";
	}
	 
		else {
			return " Can not say which session it is ";
			}
		
		
		}
	
}
