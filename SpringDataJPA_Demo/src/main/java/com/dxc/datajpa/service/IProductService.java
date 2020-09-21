package com.dxc.datajpa.service;

import java.util.Optional;

import com.dxc.datajpa.entities.Product;

public interface IProductService {
	
	
	public Product addProduct(Product product);
	
	public Product  getOneProduct(int pid);
		
	
	
	

}
