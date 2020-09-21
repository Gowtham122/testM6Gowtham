package com.dxc.secure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dxc.secure.entities.Client;
import com.dxc.secure.repository.ClientRepository;

@Service
public class ClientServiceImp implements UserDetailsService {

	@Autowired
	ClientRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Client client =   repo.findByUsername(username);
		
		
		
		if(client == null)
			throw new UsernameNotFoundException("User Not Found 404");
		
		
		
		return new ClientPrinciple(client);
	}

}
