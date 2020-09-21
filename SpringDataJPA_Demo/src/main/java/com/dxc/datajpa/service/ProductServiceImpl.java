package com.dxc.datajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.datajpa.entities.Product;
import com.dxc.datajpa.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {
	
		@Autowired
		IProductRepository repo;

		@Override
		public Product addProduct(Product product) {
			
			return repo.save(product);
			
			
		}

		@Override
		public Product getOneProduct(int pid) {
	
			
				Product pro =	repo.findById(pid).orElse(null);
				
				
				
				System.out.println(pro);
			
			return pro;
			
		}
		
		
	

}
