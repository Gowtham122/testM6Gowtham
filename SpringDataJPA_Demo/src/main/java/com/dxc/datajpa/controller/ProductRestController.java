package com.dxc.datajpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.datajpa.entities.Product;
import com.dxc.datajpa.service.IProductService;

@RestController
public class ProductRestController {
	
	@Autowired
	IProductService service;
	
	
	@PostMapping(path="/add")  //  json data it accepts
	public Product  add(@RequestBody  Product product) {
		
		return service.addProduct(product);
		
		
	}
	
	
	@GetMapping(path="/get/{id}")
	
	public  Product   get(@PathVariable("id") int pid) {
		
		System.out.println(pid);
		
		return service.getOneProduct(pid);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
