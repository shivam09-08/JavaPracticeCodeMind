package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/addProduct", method=RequestMethod.POST)
	public String addProductToCart(@RequestBody Product product)
	{
		
		String msg = restTemplate.getForObject(
				"http://localhost:8081/sendMail/"+ product.getId(), String.class);
		
		System.out.println(product);
		
		return msg;
	}

}
