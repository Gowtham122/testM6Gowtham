package com.dxc.datajpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dxc.datajpa.entities.Product;

@Repository //optional
public interface IProductRepository  extends  CrudRepository<Product, Integer>{
	
			
			

}
