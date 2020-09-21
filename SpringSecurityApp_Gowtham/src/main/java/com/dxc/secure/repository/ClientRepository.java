package com.dxc.secure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.secure.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
				
				Client 	findByUsername(String username);
				
				
	

}
